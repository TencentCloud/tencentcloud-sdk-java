/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuWaterMarkImage extends AbstractModel {

    /**
    * 水印图片URL地址，支持png、jpg、jpeg格式。图片大小限制不超过5MB。
注：
1，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，水印图片将不会生效。
2，url可支持字符集：【'0-9','a-z','A-Z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|'】，您需要确保url字符在可支持字符集内，若存在可支持字符集外的字符，水印图片将不会生效。
    */
    @SerializedName("WaterMarkUrl")
    @Expose
    private String WaterMarkUrl;

    /**
    * 水印在输出时的宽。单位为像素值。
    */
    @SerializedName("WaterMarkWidth")
    @Expose
    private Long WaterMarkWidth;

    /**
    * 水印在输出时的高。单位为像素值。
    */
    @SerializedName("WaterMarkHeight")
    @Expose
    private Long WaterMarkHeight;

    /**
    * 水印在输出时的X偏移。单位为像素值。
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 水印在输出时的Y偏移。单位为像素值。
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * 水印在输出时的层级，不填默认为0。
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
    */
    @SerializedName("DynamicPosType")
    @Expose
    private Long DynamicPosType;

    /**
     * Get 水印图片URL地址，支持png、jpg、jpeg格式。图片大小限制不超过5MB。
注：
1，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，水印图片将不会生效。
2，url可支持字符集：【'0-9','a-z','A-Z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|'】，您需要确保url字符在可支持字符集内，若存在可支持字符集外的字符，水印图片将不会生效。 
     * @return WaterMarkUrl 水印图片URL地址，支持png、jpg、jpeg格式。图片大小限制不超过5MB。
注：
1，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，水印图片将不会生效。
2，url可支持字符集：【'0-9','a-z','A-Z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|'】，您需要确保url字符在可支持字符集内，若存在可支持字符集外的字符，水印图片将不会生效。
     */
    public String getWaterMarkUrl() {
        return this.WaterMarkUrl;
    }

    /**
     * Set 水印图片URL地址，支持png、jpg、jpeg格式。图片大小限制不超过5MB。
注：
1，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，水印图片将不会生效。
2，url可支持字符集：【'0-9','a-z','A-Z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|'】，您需要确保url字符在可支持字符集内，若存在可支持字符集外的字符，水印图片将不会生效。
     * @param WaterMarkUrl 水印图片URL地址，支持png、jpg、jpeg格式。图片大小限制不超过5MB。
注：
1，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，水印图片将不会生效。
2，url可支持字符集：【'0-9','a-z','A-Z','-', '.', '_', '~', ':', '/', '?', '#', '[', ']','@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|'】，您需要确保url字符在可支持字符集内，若存在可支持字符集外的字符，水印图片将不会生效。
     */
    public void setWaterMarkUrl(String WaterMarkUrl) {
        this.WaterMarkUrl = WaterMarkUrl;
    }

    /**
     * Get 水印在输出时的宽。单位为像素值。 
     * @return WaterMarkWidth 水印在输出时的宽。单位为像素值。
     */
    public Long getWaterMarkWidth() {
        return this.WaterMarkWidth;
    }

    /**
     * Set 水印在输出时的宽。单位为像素值。
     * @param WaterMarkWidth 水印在输出时的宽。单位为像素值。
     */
    public void setWaterMarkWidth(Long WaterMarkWidth) {
        this.WaterMarkWidth = WaterMarkWidth;
    }

    /**
     * Get 水印在输出时的高。单位为像素值。 
     * @return WaterMarkHeight 水印在输出时的高。单位为像素值。
     */
    public Long getWaterMarkHeight() {
        return this.WaterMarkHeight;
    }

    /**
     * Set 水印在输出时的高。单位为像素值。
     * @param WaterMarkHeight 水印在输出时的高。单位为像素值。
     */
    public void setWaterMarkHeight(Long WaterMarkHeight) {
        this.WaterMarkHeight = WaterMarkHeight;
    }

    /**
     * Get 水印在输出时的X偏移。单位为像素值。 
     * @return LocationX 水印在输出时的X偏移。单位为像素值。
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 水印在输出时的X偏移。单位为像素值。
     * @param LocationX 水印在输出时的X偏移。单位为像素值。
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 水印在输出时的Y偏移。单位为像素值。 
     * @return LocationY 水印在输出时的Y偏移。单位为像素值。
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 水印在输出时的Y偏移。单位为像素值。
     * @param LocationY 水印在输出时的Y偏移。单位为像素值。
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get 水印在输出时的层级，不填默认为0。 
     * @return ZOrder 水印在输出时的层级，不填默认为0。
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set 水印在输出时的层级，不填默认为0。
     * @param ZOrder 水印在输出时的层级，不填默认为0。
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。 
     * @return DynamicPosType 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
     */
    public Long getDynamicPosType() {
        return this.DynamicPosType;
    }

    /**
     * Set 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
     * @param DynamicPosType 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
     */
    public void setDynamicPosType(Long DynamicPosType) {
        this.DynamicPosType = DynamicPosType;
    }

    public McuWaterMarkImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuWaterMarkImage(McuWaterMarkImage source) {
        if (source.WaterMarkUrl != null) {
            this.WaterMarkUrl = new String(source.WaterMarkUrl);
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
        if (source.ZOrder != null) {
            this.ZOrder = new Long(source.ZOrder);
        }
        if (source.DynamicPosType != null) {
            this.DynamicPosType = new Long(source.DynamicPosType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkUrl", this.WaterMarkUrl);
        this.setParamSimple(map, prefix + "WaterMarkWidth", this.WaterMarkWidth);
        this.setParamSimple(map, prefix + "WaterMarkHeight", this.WaterMarkHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);
        this.setParamSimple(map, prefix + "DynamicPosType", this.DynamicPosType);

    }
}

