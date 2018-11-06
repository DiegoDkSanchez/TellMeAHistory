package sv.dk.com.dimeunahistoria;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by DK-Ragnar on 5/11/2018.
 */

public class CacheableAudio {

    public void playCacheableAudio(final Context context, final String url){

        new Thread(new Runnable()
        {
            @Override
            public void run() {
                Log.d("UDBDebug", "Starting playback");
                File file = cacheFile(context, url);

                MediaPlayer mediaPlayer = new MediaPlayer();

                if (file == null) {
                    Log.d("UDBDebug", "No audio file found at url " + url);
                } else {

                    Uri myUri = Uri.parse(file.getAbsolutePath());
                    if (mediaPlayer.isPlaying()) {

                    } else {
                        try {
                            mediaPlayer.setDataSource(context, myUri);
                            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                            mediaPlayer.prepare(); //don't use prepareAsync for mp3 playback

                            mediaPlayer.start();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }


                    Log.d("UDBDebug", "End playback");

                }
            }
        }).start();

    }


    private File cacheFile(Context context, String url)
    {
        File file = null;


        String fileName = "";

        fileName = Uri.parse(url).getLastPathSegment();
        Log.d("File", fileName);

        file = new File(context.getCacheDir(), fileName);

        Log.d("UDBDebug", "File path " + file.getAbsolutePath());

        if(file.exists()){
            Log.d("UDBDebug", "File found on cache and returned directly");

            return file;
        }else{
            Log.d("UDBDebug", "File not found  on cache. Downloading");
        }

        try {
            Log.d("UDBDebug", "The connection has begun");
            URL u = new URL(url);
            URLConnection conn = u.openConnection();
            int contentLength = conn.getContentLength();

            DataInputStream stream = new DataInputStream(u.openStream());

            byte[] buffer = new byte[contentLength];
            stream.readFully(buffer);
            stream.close();

            DataOutputStream fos = new DataOutputStream(new FileOutputStream(file));
            fos.write(buffer);
            fos.flush();
            fos.close();

            Log.d("UDBDebug", "Dowload has finished");
        }
        catch(FileNotFoundException e)
        {
            return null;
        }
        catch (IOException e)
        {
            return null;
        }

        return file;
    }
}
