import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

public class Gitti {
    public static void main(String[] args) throws IOException {


        FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
        repositoryBuilder.setMustExist( false );
        repositoryBuilder.setGitDir(new File("C:\\Users\\domin\\OneDrive\\Desktop\\db\\src\\main\\java\\.git"));
        Repository repository = repositoryBuilder.build();

        Git git = new Git(repository);
    }
}
