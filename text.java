/*import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuth;
import com.dropbox.core.json.JsonReader.FileLoadException;
import com.dropbox.core.oauth.DbxCredential;
import com.dropbox.core.util.IOUtil;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.WriteMode;
import com.dropbox.core.v2.users.FullAccount;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
*/
@Deprecated
public class text{
    /*
    private static String ACCESS_TOKEN = "sl.BqwHxcaB09wz5DmM3H5UUR4XXrk3uOEWqNrjSfVf3rr6nbCg39w-kXMFxGj9FAZucc0zk9YTrQw6y89JUH8OvSpXm2NWzxo5tps0DORqZcrHUfVrMK82Mmmq4A40ZfrMMMd5Yi5ZRe1MeLQ-KGXv";

    private static String APP_KEY = "mvl8seqnk9e5s2y";
    private static String APP_SECRET = "qlq0e6gnmyo4hpb";
    private static String ACCESS_CODE = "lYt5E1AzxLAAAAAAAAAAG-IOSeT9gpMIbyLu7hlX9Rc";

    public static DbxClientV2 client = null;
    public static void main(String[] args) throws DbxException {

        DbxClientV2 client = login();


        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.dropboxapi.com/oauth2/token"))
        .header("code", ACCESS_CODE)
        .header("grant_type", "authorization_code")
        .header("client_id", APP_KEY)
        .header("client_secret", APP_SECRET).method("POST", HttpRequest.BodyPublishers.noBody()).build();

        HttpResponse<String> response = null;
        try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(response.body());


        
    }
        private static void test(){
            FullAccount account = null;
        try {
            account = client.users().getCurrentAccount();
        } catch (DbxException e) {
            e.printStackTrace();
        }
        
        System.out.println(account.getName().getDisplayName());

        String filename = "C:\\Users\\domin\\OneDrive\\Desktop\\db\\src\\main\\java\\tmp.txt";
        //uploadFile(filename);
        File file = downloadFile(filename);
        System.out.println(file.getName());
        }


    private static void printProgress(long uploaded, long size, boolean download) {
        String t = download ? "Download": "upload";

        System.out.printf("%s %12d / %12d bytes (%5.2f%%)\n", t, uploaded, size, 100 * (uploaded / (double) size));
    }

    public static DbxClientV2 login() throws DbxException {

        DbxCredential credential = new DbxCredential(ACCESS_TOKEN);

        DbxRequestConfig config = DbxRequestConfig.newBuilder("com.Konscielny.Connector").build();
        
        client = new DbxClientV2(config, credential);

        
        return client;
    }

    
    public static void uploadFile(String filename) {
        
        File file = new File(filename);
        if(!file.exists()) {
           try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        } // create your file on the file system
        }

        try (InputStream in = new FileInputStream(file)) {
            IOUtil.ProgressListener progressListener = l -> printProgress(l, file.length(), false);

            FileMetadata metadata = client.files().uploadBuilder("/"+file.getName()).withMode(WriteMode.OVERWRITE)
                    .uploadAndFinish(in, progressListener);
            System.out.println(metadata.toStringMultiline());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(DbxException e){
            e.printStackTrace();
        } 
    }

    public static File downloadFile(String filename){
        File file = new File(filename);

        try (FileOutputStream out = new FileOutputStream(file)) {
            IOUtil.ProgressListener progressListener = l -> printProgress(l, file.length(), true);

            FileMetadata metadata = client.files().download("/" + file.getName()).download(out, progressListener);

            System.out.println(metadata.toStringMultiline());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(DbxException e){
            e.printStackTrace();
        } 

        return file;
    }*/
}
