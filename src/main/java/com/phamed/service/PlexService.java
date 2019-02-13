package com.phamed.service;

import com.phamed.plexModels.MediaContainer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class PlexService {

  public List<Object> getAllMediaFromFile(String file) {
    List<Object> allMedia = new ArrayList<>();
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(MediaContainer.class);
      Unmarshaller jaxbUnmashaller = jaxbContext.createUnmarshaller();
      File xmlFile = new File(file);
      MediaContainer mediaContainerList = (MediaContainer) jaxbUnmashaller.unmarshal(xmlFile);
      allMedia = mediaContainerList.getDirectoryOrVideo();
    } catch (JAXBException e) {
      e.printStackTrace();
    }
    return allMedia;
  }

  public void getXmlFromURLTofile(URL url) throws IOException {
    URLConnection con = url.openConnection();
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

  public List<Object> getXmlFromUrlToObject(URL url) throws IOException, JAXBException {
    URLConnection con = url.openConnection();
    InputStream in = con.getInputStream();
    JAXBContext jaxbContext = JAXBContext.newInstance(MediaContainer.class);
    Unmarshaller jaxbUnmashaller = jaxbContext.createUnmarshaller();
    MediaContainer mediaContainerList = (MediaContainer) jaxbUnmashaller.unmarshal(in);
    List<Object> directorTypes = mediaContainerList.getDirectoryOrVideo();
    in.close();
    return directorTypes;
  }
}
