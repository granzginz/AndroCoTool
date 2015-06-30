package com.granzginz.img;

import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/**
 * ImageView image loader from asset
 * @author gcm.dev
 *
 */
public class ImgLoaderAsset {

	String nameFileImg;
	ImageView uiV;
	public ImgLoaderAsset(Context c, String nameFileImg, ImageView uiV) {
		super();
		this.nameFileImg = nameFileImg;
		this.uiV = uiV;
		// load image
        try {
            // get input stream
            InputStream ims = c.getAssets().open(this.nameFileImg);
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            this.uiV.setImageDrawable(d);
        }
        catch(IOException ex) {
            return;
        }
	}
	public String getNameFileImg() {
		return nameFileImg;
	}
	public void setNameFileImg(String nameFileImg) {
		this.nameFileImg = nameFileImg;
	}
	public ImageView getUiV() {
		return uiV;
	}
	public void setUiV(ImageView uiV) {
		this.uiV = uiV;
	}


}
