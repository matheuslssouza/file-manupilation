import interfaces.FileDatabase;
import interfaces.FolderManagement;
import interfaces.ImageFileDatabase;
import model.MFile;
import orchestrator.FileOrchestrator;

import java.util.ArrayList;
import java.util.List;

public class HandlerFile extends FileOrchestrator {

    private ImageFileDatabase imageFileDataBase;
    private FileDatabase fileDatabase;
    private FolderManagement folderManagement;

    private List<MFile> mFileList = new ArrayList<>();

    public HandlerFile() {
        imageFileDataBase = new FileOrchestrator();
        fileDatabase = new FileOrchestrator();
    }
}
