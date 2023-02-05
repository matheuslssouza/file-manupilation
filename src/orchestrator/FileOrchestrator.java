package orchestrator;

import interfaces.FileDatabase;
import interfaces.ImageFileDatabase;
import model.MFileAnnotationType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class FileOrchestrator extends FolderOrchestrator implements FileDatabase, ImageFileDatabase {

    @Override
    public void listAllFiles(String directory, MFileAnnotationType type) {

    }

    @Override
    public void recoveryFile(String directory, String nameFile, MFileAnnotationType type) {

    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationType type) {

    }

    @Override
    public void saveFile(String directory, String content, MFileAnnotationType type, String nameFile) {

    }

    @Override
    public void listAllImageFiles(String directory) {

    }

    @Override
    public void recoveryImageFile(String directory) {

    }

    @Override
    public void removeImageFile(String directory, String nameFile) {


    }

    @Override
    public void saveImageFile(String directory, String content, String fileName) {

        BufferedImage image;

        try {
            URL url = new URL(content);
            image = ImageIO.read(url);

            ImageIO.write(image, "jpgeg", new File("C:\\Users\\ressl\\OneDrive\\Área de Trabalho\\_Marcio\\reminders"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
