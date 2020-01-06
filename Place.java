package com.example.android.tourguidecopy;

/**
 * {@link Place} represents the attraction.
 * It contains resource IDs for the place, information, and image.
 */
public class Place {

    /**
     * String resource ID for the place
     */
    private int mPlace;

    /**
     * String resource ID for the information about the place
     */
    private int mInfo;

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * @param place is the string resource ID for the place.
     * @param info  is the string resource Id for the information about the place.
     */
    public Place(int info, int place) {
        mPlace = place;
        mInfo = info;
    }

    /**
     * @param place           is the string resource ID for the place.
     * @param info            is the string resource Id for the information about the place.
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(int info, int place, int imageResourceId) {
        mPlace = place;
        mInfo = info;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the place.
     */
    public int getPlaceId() {
        return mPlace;
    }

    /**
     * Get the string resource ID for the information of the place.
     */
    public int getInfoId() {
        return mInfo;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}