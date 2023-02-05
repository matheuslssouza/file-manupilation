package interfaces;

import java.net.MalformedURLException;

public interface ImageFileDatabase {
    void saveImageFile(String directory, String content, String fileName) throws MalformedURLException;

    void recoveryImageFile(String directory);

    void removeImageFile(String directory, String nameFile);

    void listAllImageFiles(String directory);
}
