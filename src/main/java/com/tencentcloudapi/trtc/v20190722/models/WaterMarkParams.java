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

public class WaterMarkParams extends AbstractModel{

    /**
    * 混流-水印图片ID。取值为实时音视频控制台上传的图片ID。
    */
    @SerializedName("WaterMarkId")
    @Expose
    private Long WaterMarkId;

    /**
    * 混流-水印宽。单位为像素值。水印宽+X偏移不能超过整个画布宽。
    */
    @SerializedName("WaterMarkWidth")
    @Expose
    private Long WaterMarkWidth;

    /**
    * 混流-水印高。单位为像素值。水印高+Y偏移不能超过整个画布高。
    */
    @SerializedName("WaterMarkHeight")
    @Expose
    private Long WaterMarkHeight;

    /**
    * 水印在输出时的X偏移。单位为像素值。水印宽+X偏移不能超过整个画布宽。
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 水印在输出时的Y偏移。单位为像素值。水印高+Y偏移不能超过整个画布高。
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * 混流-水印图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。WaterMarkUrl和WaterMarkId参数都填时，以WaterMarkUrl为准。图片大小限制不超过2MB。
    */
    @SerializedName("WaterMarkUrl")
    @Expose
    private String WaterMarkUrl;

    /**
     * Get 混流-水印图片ID。取值为实时音视频控制台上传的图片ID。 
     * @return WaterMarkId 混流-水印图片ID。取值为实时音视频控制台上传的图片ID。
     */
    public Long getWaterMarkId() {
        return this.WaterMarkId;
    }

    /**
     * Set 混流-水印图片ID。取值为实时音视频控制台上传的图片ID。
     * @param WaterMarkId 混流-水印图片ID。取值为实时音视频控制台上传的图片ID。
     */
    public void setWaterMarkId(Long WaterMarkId) {
        this.WaterMarkId = WaterMarkId;
    }

    /**
     * Get 混流-水印宽。单位为像素值。水印宽+X偏移不能超过整个画布宽。 
     * @return WaterMarkWidth 混流-水印宽。单位为像素值。水印宽+X偏移不能超过整个画布宽。
     */
    public Long getWaterMarkWidth() {
        return this.WaterMarkWidth;
    }

    /**
     * Set 混流-水印宽。单位为像素值。水印宽+X偏移不能超过整个画布宽。
     * @param WaterMarkWidth 混流-水印宽。单位为像素值。水印宽+X偏移不能超过整个画布宽。
     */
    public void setWaterMarkWidth(Long WaterMarkWidth) {
        this.WaterMarkWidth = WaterMarkWidth;
    }

    /**
     * Get 混流-水印高。单位为像素值。水印高+Y偏移不能超过整个画布高。 
     * @return WaterMarkHeight 混流-水印高。单位为像素值。水印高+Y偏移不能超过整个画布高。
     */
    public Long getWaterMarkHeight() {
        return this.WaterMarkHeight;
    }

    /**
     * Set 混流-水印高。单位为像素值。水印高+Y偏移不能超过整个画布高。
     * @param WaterMarkHeight 混流-水印高。单位为像素值。水印高+Y偏移不能超过整个画布高。
     */
    public void setWaterMarkHeight(Long WaterMarkHeight) {
        this.WaterMarkHeight = WaterMarkHeight;
    }

    /**
     * Get 水印在输出时的X偏移。单位为像素值。水印宽+X偏移不能超过整个画布宽。 
     * @return LocationX 水印在输出时的X偏移。单位为像素值。水印宽+X偏移不能超过整个画布宽。
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 水印在输出时的X偏移。单位为像素值。水印宽+X偏移不能超过整个画布宽。
     * @param LocationX 水印在输出时的X偏移。单位为像素值。水印宽+X偏移不能超过整个画布宽。
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 水印在输出时的Y偏移。单位为像素值。水印高+Y偏移不能超过整个画布高。 
     * @return LocationY 水印在输出时的Y偏移。单位为像素值。水印高+Y偏移不能超过整个画布高。
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 水印在输出时的Y偏移。单位为像素值。水印高+Y偏移不能超过整个画布高。
     * @param LocationY 水印在输出时的Y偏移。单位为像素值。水印高+Y偏移不能超过整个画布高。
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get 混流-水印图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。WaterMarkUrl和WaterMarkId参数都填时，以WaterMarkUrl为准。图片大小限制不超过2MB。 
     * @return WaterMarkUrl 混流-水印图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。WaterMarkUrl和WaterMarkId参数都填时，以WaterMarkUrl为准。图片大小限制不超过2MB。
     */
    public String getWaterMarkUrl() {
        return this.WaterMarkUrl;
    }

    /**
     * Set 混流-水印图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。WaterMarkUrl和WaterMarkId参数都填时，以WaterMarkUrl为准。图片大小限制不超过2MB。
     * @param WaterMarkUrl 混流-水印图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。WaterMarkUrl和WaterMarkId参数都填时，以WaterMarkUrl为准。图片大小限制不超过2MB。
     */
    public void setWaterMarkUrl(String WaterMarkUrl) {
        this.WaterMarkUrl = WaterMarkUrl;
    }

    public WaterMarkParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkParams(WaterMarkParams source) {
        if (source.WaterMarkId != null) {
            this.WaterMarkId = new Long(source.WaterMarkId);
        }
        if (source.WaterMarkWidth != null) {
            this.WaterMarkWidth = new Long(source.WaterMarkWidth);
        }
        if (source.WaterMarkHeight != null) {
            this.WaterMarkHeight = new Long(source.WaterMarkHeight);
        }
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
        }
        if (source.WaterMarkUrl != null) {
            this.WaterMarkUrl = new String(source.WaterMarkUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkId", this.WaterMarkId);
        this.setParamSimple(map, prefix + "WaterMarkWidth", this.WaterMarkWidth);
        this.setParamSimple(map, prefix + "WaterMarkHeight", this.WaterMarkHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "WaterMarkUrl", this.WaterMarkUrl);

    }
}

