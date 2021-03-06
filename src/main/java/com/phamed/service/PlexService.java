package com.phamed.service;

import com.phamed.plexModels.MediaContainer;
import com.phamed.plexModels.Video;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlexService {

  private String url = System.getenv("URL");

  private String token = System.getenv("TOKEN");

  private final String urlAddress = url + "/library/all?X-Plex-Token=" + token;


  public List<Video> getAllMediaFromFile(String file) {
    List<Video> allMedia = new ArrayList<>();
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(MediaContainer.class);
      Unmarshaller jaxbUnmashaller = jaxbContext.createUnmarshaller();
      File xmlFile = new File(file);
      MediaContainer mediaContainerList = (MediaContainer) jaxbUnmashaller.unmarshal(xmlFile);
      allMedia = mediaContainerList.getVideos();
    } catch (JAXBException e) {
      e.printStackTrace();
    }
    return allMedia;
  }

  public void getXmlFromURLTofile(String url) throws IOException {
    URL urlAddress = new URL(url);
    URLConnection con = urlAddress.openConnection();
    InputStream in = con.getInputStream();
    String filePath = "httpData.xml";
    File data = new File(filePath);
    if (!data.exists()) {
      data.createNewFile();

    }
    FileOutputStream fos = new FileOutputStream(data, false);
    int inByte;
    while ((inByte = in.read()) != -1)
      fos.write(inByte);
    in.close();
    fos.close();
  }

  public MediaContainer getXmlFromUrlToObject(String url) throws IOException, JAXBException {
    URL urlAddress = new URL(url);
    URLConnection con = urlAddress.openConnection();
    InputStream in = con.getInputStream();
    JAXBContext jaxbContext = JAXBContext.newInstance(MediaContainer.class);
    Unmarshaller jaxbUnmashaller = jaxbContext.createUnmarshaller();
    MediaContainer mediaContainerList = (MediaContainer) jaxbUnmashaller.unmarshal(in);
    in.close();
    return mediaContainerList;
  }

  public List<Video> allVideos() {
    List<Video> all = new ArrayList<>();
    try {
      all = getXmlFromUrlToObject(urlAddress).getVideos().stream()
      .map(this::changeStringToDateTime)
      .collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (JAXBException e) {
      e.printStackTrace();
    }
    return all;
  }

  public Video changeStringToDateTime(Video video) {
    video.setAddedAt(String.valueOf(Instant.ofEpochMilli(Long.parseLong(video.getAddedAt()) * 1000).atZone(ZoneId.systemDefault()).toLocalDateTime()));
    return video;
  }

}
