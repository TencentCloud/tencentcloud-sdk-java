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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceInfoResult extends AbstractModel{

    /**
    * 人脸尺寸的占比
    */
    @SerializedName("FaceRatio")
    @Expose
    private Float FaceRatio;

    /**
    * 帧高度
    */
    @SerializedName("FrameHeight")
    @Expose
    private Long FrameHeight;

    /**
    * 帧宽度
    */
    @SerializedName("FrameWidth")
    @Expose
    private Long FrameWidth;

    /**
    * 人脸高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 人脸左坐标
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 人脸顶坐标
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 人脸宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * Get 人脸尺寸的占比 
     * @return FaceRatio 人脸尺寸的占比
     */
    public Float getFaceRatio() {
        return this.FaceRatio;
    }

    /**
     * Set 人脸尺寸的占比
     * @param FaceRatio 人脸尺寸的占比
     */
    public void setFaceRatio(Float FaceRatio) {
        this.FaceRatio = FaceRatio;
    }

    /**
     * Get 帧高度 
     * @return FrameHeight 帧高度
     */
    public Long getFrameHeight() {
        return this.FrameHeight;
    }

    /**
     * Set 帧高度
     * @param FrameHeight 帧高度
     */
    public void setFrameHeight(Long FrameHeight) {
        this.FrameHeight = FrameHeight;
    }

    /**
     * Get 帧宽度 
     * @return FrameWidth 帧宽度
     */
    public Long getFrameWidth() {
        return this.FrameWidth;
    }

    /**
     * Set 帧宽度
     * @param FrameWidth 帧宽度
     */
    public void setFrameWidth(Long FrameWidth) {
        this.FrameWidth = FrameWidth;
    }

    /**
     * Get 人脸高度 
     * @return Height 人脸高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 人脸高度
     * @param Height 人脸高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 人脸左坐标 
     * @return Left 人脸左坐标
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 人脸左坐标
     * @param Left 人脸左坐标
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get 人脸顶坐标 
     * @return Top 人脸顶坐标
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set 人脸顶坐标
     * @param Top 人脸顶坐标
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 人脸宽度 
     * @return Width 人脸宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 人脸宽度
     * @param Width 人脸宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceRatio", this.FaceRatio);
        this.setParamSimple(map, prefix + "FrameHeight", this.FrameHeight);
        this.setParamSimple(map, prefix + "FrameWidth", this.FrameWidth);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

