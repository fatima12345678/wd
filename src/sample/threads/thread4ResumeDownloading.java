package sample.threads;

import sample.proccess.helper4DownInfo;

import java.io.IOException;

public class thread4ResumeDownloading implements Runnable {
    private helper4DownInfo helper;

    public void setHelper(helper4DownInfo helper) {
        this.helper = helper;
    }

    @Override
    public void run() {
        try {
            helper.ResumeDownloading();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
