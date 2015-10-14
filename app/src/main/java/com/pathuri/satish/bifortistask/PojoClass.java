package com.pathuri.satish.bifortistask;

/**
 * Created by Satish on 14-Oct-15.
 */
public class PojoClass {

    // private variables
    int _id;
    String _name;
    byte[] _image;

    // Empty constructor
    public PojoClass() {

    }

    // constructor
    public PojoClass(int keyId, String name, byte[] image) {
        this._id = keyId;
        this._name = name;
        this._image = image;

    }


    // constructor
    public PojoClass(String name, byte[] image) {
        this._name = name;
        this._image = image;
    }

    // getting ID
    public int getID() {
        return this._id;
    }

    // setting id
    public void setID(int keyId) {
        this._id = keyId;
    }

    // getting name
    public String getName() {
        return this._name;
    }

    // setting name
    public void setName(String name) {
        this._name = name;
    }

    // getting image
    public byte[] getImage() {
        return this._image;
    }

    // setting image
    public void setImage(byte[] image) {
        this._image = image;
    }
}

