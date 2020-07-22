/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmallVideoLayoutParams extends AbstractModel{

    /**
    * 代表小画面对应的用户ID。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 代表小画面对应的流类型，0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * 小画面在输出时的宽度，单位为像素值，不填默认为0。
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * 小画面在输出时的高度，单位为像素值，不填默认为0。
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 小画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 小画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
     * Get 代表小画面对应的用户ID。 
     * @return UserId 代表小画面对应的用户ID。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 代表小画面对应的用户ID。
     * @param UserId 代表小画面对应的用户ID。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 代表小画面对应的流类型，0为摄像头，1为屏幕分享。小画面为web用户时此值填0。 
     * @return StreamType 代表小画面对应的流类型，0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 代表小画面对应的流类型，0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
     * @param StreamType 代表小画面对应的流类型，0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 小画面在输出时的宽度，单位为像素值，不填默认为0。 
     * @return ImageWidth 小画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 小画面在输出时的宽度，单位为像素值，不填默认为0。
     * @param ImageWidth 小画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 小画面在输出时的高度，单位为像素值，不填默认为0。 
     * @return ImageHeight 小画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 小画面在输出时的高度，单位为像素值，不填默认为0。
     * @param ImageHeight 小画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 小画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。 
     * @return LocationX 小画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 小画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     * @param LocationX 小画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 小画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。 
     * @return LocationY 小画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 小画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     * @param LocationY 小画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);

    }
}

