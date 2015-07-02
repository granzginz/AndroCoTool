package com.granzginz.sound;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.widget.ImageView;

public class SoundLoaderAsset {
	String nameFileImg;
	ImageView uiV;
	MediaPlayer m;
	public SoundLoaderAsset(Context c, String nameFileImg, MediaPlayer mediaPlayer) {
		super();
		this.nameFileImg = nameFileImg;
		this.m = mediaPlayer;
		try {
	        if (m.isPlaying()) {
	            m.stop();
	            m.release();
	            m = new MediaPlayer();
	        }

	        AssetFileDescriptor descriptor = c.getAssets().openFd(this.nameFileImg);
	        m.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
	        descriptor.close();

	        m.prepare();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public String getNameFileImg() {
		return nameFileImg;
	}
	public void setNameFileImg(String nameFileImg) {
		this.nameFileImg = nameFileImg;
	}

	public MediaPlayer getM() {
		return m;
	}
	public void setM(MediaPlayer m) {
		this.m = m;
	}

}
