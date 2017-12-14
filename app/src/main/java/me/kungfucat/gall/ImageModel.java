package me.kungfucat.gall;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by harsh on 12/13/17.
 */

public class ImageModel implements Parcelable {
    String title;
    String url;

    public ImageModel() {

    }

    public ImageModel(Parcel in) {
        this.title = in.readString();
        this.url = in.readString();
    }

    public static final Creator<ImageModel> CREATOR = new Creator<ImageModel>() {
        @Override
        public ImageModel createFromParcel(Parcel in) {
            return new ImageModel(in);
        }

        @Override
        public ImageModel[] newArray(int size) {
            return new ImageModel[size];
        }
    };

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(url);
    }
}