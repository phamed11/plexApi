package com.phamed;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class XmlToFile {


  public void xmlTofile(URL url) throws IOException {
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
}
