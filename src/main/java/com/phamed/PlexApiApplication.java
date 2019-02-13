package com.phamed;

import com.phamed.plexModels.Directory;
import com.phamed.plexModels.MediaContainer;
import com.phamed.plexModels.Video;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

@SpringBootApplication
public class PlexApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(PlexApiApplication.class, args);


//    XmlToFile toFile = new XmlToFile();
//
//    try {
//      toFile.xmlTofile(new URL(toFile.URLNAME));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(MediaContainer.class);

      Unmarshaller jaxbUnmashaller = jaxbContext.createUnmarshaller();

      File xmlFile = new File("httpData.xml");

      MediaContainer mediaContainerList = (MediaContainer) jaxbUnmashaller.unmarshal(xmlFile);

      List<Object> directorTypes = mediaContainerList.getDirectoryOrVideo();

//      for (Object type : directorTypes) {
//        System.out.println(type);
//      }
     List<Object> allMedia = mediaContainerList.getDirectoryOrVideo();

     int directories = 0;
     int videos = 0;

     for (Object medium : allMedia) {
       if (medium instanceof Directory) {
         System.out.println(((Directory) medium).getTitle());
       } else if (medium instanceof Video){
         System.out.println(((Video) medium).getTitle());
       }
     }



    } catch (JAXBException e) {
      e.printStackTrace();
    }


  }
}
