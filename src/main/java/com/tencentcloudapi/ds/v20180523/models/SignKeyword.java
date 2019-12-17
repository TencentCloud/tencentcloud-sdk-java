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
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignKeyword extends AbstractModel{

    /**
    * 关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * X轴偏移坐标
    */
    @SerializedName("OffsetCoordX")
    @Expose
    private String OffsetCoordX;

    /**
    * Y轴偏移坐标
    */
    @SerializedName("OffsetCoordY")
    @Expose
    private String OffsetCoordY;

    /**
    * 签章图片宽度
    */
    @SerializedName("ImageWidth")
    @Expose
    private String ImageWidth;

    /**
    * 签章图片高度
    */
    @SerializedName("ImageHeight")
    @Expose
    private String ImageHeight;

    /**
     * Get 关键字 
     * @return Keyword 关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字
     * @param Keyword 关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get X轴偏移坐标 
     * @return OffsetCoordX X轴偏移坐标
     */
    public String getOffsetCoordX() {
        return this.OffsetCoordX;
    }

    /**
     * Set X轴偏移坐标
     * @param OffsetCoordX X轴偏移坐标
     */
    public void setOffsetCoordX(String OffsetCoordX) {
        this.OffsetCoordX = OffsetCoordX;
    }

    /**
     * Get Y轴偏移坐标 
     * @return OffsetCoordY Y轴偏移坐标
     */
    public String getOffsetCoordY() {
        return this.OffsetCoordY;
    }

    /**
     * Set Y轴偏移坐标
     * @param OffsetCoordY Y轴偏移坐标
     */
    public void setOffsetCoordY(String OffsetCoordY) {
        this.OffsetCoordY = OffsetCoordY;
    }

    /**
     * Get 签章图片宽度 
     * @return ImageWidth 签章图片宽度
     */
    public String getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 签章图片宽度
     * @param ImageWidth 签章图片宽度
     */
    public void setImageWidth(String ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 签章图片高度 
     * @return ImageHeight 签章图片高度
     */
    public String getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 签章图片高度
     * @param ImageHeight 签章图片高度
     */
    public void setImageHeight(String ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "OffsetCoordX", this.OffsetCoordX);
        this.setParamSimple(map, prefix + "OffsetCoordY", this.OffsetCoordY);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);

    }
}

