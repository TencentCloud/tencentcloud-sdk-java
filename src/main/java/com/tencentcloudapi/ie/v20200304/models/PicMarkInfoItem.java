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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PicMarkInfoItem extends AbstractModel{

    /**
    * 图片水印的X坐标。
    */
    @SerializedName("PosX")
    @Expose
    private Long PosX;

    /**
    * 图片水印的Y坐标 。
    */
    @SerializedName("PosY")
    @Expose
    private Long PosY;

    /**
    * 图片水印路径,，如果不从Cos拉取水印，则必填
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 图片水印的Cos 信息，从Cos上拉取图片水印时必填。
    */
    @SerializedName("CosInfo")
    @Expose
    private CosInfo CosInfo;

    /**
    * 图片水印宽度，不填为图片原始宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 图片水印高度，不填为图片原始高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 添加图片水印的开始时间,单位：ms。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 添加图片水印的结束时间,单位：ms。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 图片水印的X坐标。 
     * @return PosX 图片水印的X坐标。
     */
    public Long getPosX() {
        return this.PosX;
    }

    /**
     * Set 图片水印的X坐标。
     * @param PosX 图片水印的X坐标。
     */
    public void setPosX(Long PosX) {
        this.PosX = PosX;
    }

    /**
     * Get 图片水印的Y坐标 。 
     * @return PosY 图片水印的Y坐标 。
     */
    public Long getPosY() {
        return this.PosY;
    }

    /**
     * Set 图片水印的Y坐标 。
     * @param PosY 图片水印的Y坐标 。
     */
    public void setPosY(Long PosY) {
        this.PosY = PosY;
    }

    /**
     * Get 图片水印路径,，如果不从Cos拉取水印，则必填 
     * @return Path 图片水印路径,，如果不从Cos拉取水印，则必填
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 图片水印路径,，如果不从Cos拉取水印，则必填
     * @param Path 图片水印路径,，如果不从Cos拉取水印，则必填
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 图片水印的Cos 信息，从Cos上拉取图片水印时必填。 
     * @return CosInfo 图片水印的Cos 信息，从Cos上拉取图片水印时必填。
     */
    public CosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set 图片水印的Cos 信息，从Cos上拉取图片水印时必填。
     * @param CosInfo 图片水印的Cos 信息，从Cos上拉取图片水印时必填。
     */
    public void setCosInfo(CosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Get 图片水印宽度，不填为图片原始宽度。 
     * @return Width 图片水印宽度，不填为图片原始宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 图片水印宽度，不填为图片原始宽度。
     * @param Width 图片水印宽度，不填为图片原始宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 图片水印高度，不填为图片原始高度。 
     * @return Height 图片水印高度，不填为图片原始高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 图片水印高度，不填为图片原始高度。
     * @param Height 图片水印高度，不填为图片原始高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 添加图片水印的开始时间,单位：ms。 
     * @return StartTime 添加图片水印的开始时间,单位：ms。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 添加图片水印的开始时间,单位：ms。
     * @param StartTime 添加图片水印的开始时间,单位：ms。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 添加图片水印的结束时间,单位：ms。 
     * @return EndTime 添加图片水印的结束时间,单位：ms。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 添加图片水印的结束时间,单位：ms。
     * @param EndTime 添加图片水印的结束时间,单位：ms。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public PicMarkInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PicMarkInfoItem(PicMarkInfoItem source) {
        if (source.PosX != null) {
            this.PosX = new Long(source.PosX);
        }
        if (source.PosY != null) {
            this.PosY = new Long(source.PosY);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new CosInfo(source.CosInfo);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PosX", this.PosX);
        this.setParamSimple(map, prefix + "PosY", this.PosY);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

