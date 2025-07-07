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

public class WaterMark extends AbstractModel {

    /**
    * 水印类型，0为图片（默认），1为文字，2为时间戳。
    */
    @SerializedName("WaterMarkType")
    @Expose
    private Long WaterMarkType;

    /**
    * 水印为图片时的参数列表，水印为图片时校验必填。
    */
    @SerializedName("WaterMarkImage")
    @Expose
    private WaterMarkImage WaterMarkImage;

    /**
    * 水印为文字时的参数列表，水印为文字时校验必填。
    */
    @SerializedName("WaterMarkChar")
    @Expose
    private WaterMarkChar WaterMarkChar;

    /**
    * 水印为时间戳时的参数列表，水印为时间戳时校验必填。
    */
    @SerializedName("WaterMarkTimestamp")
    @Expose
    private WaterMarkTimestamp WaterMarkTimestamp;

    /**
     * Get 水印类型，0为图片（默认），1为文字，2为时间戳。 
     * @return WaterMarkType 水印类型，0为图片（默认），1为文字，2为时间戳。
     */
    public Long getWaterMarkType() {
        return this.WaterMarkType;
    }

    /**
     * Set 水印类型，0为图片（默认），1为文字，2为时间戳。
     * @param WaterMarkType 水印类型，0为图片（默认），1为文字，2为时间戳。
     */
    public void setWaterMarkType(Long WaterMarkType) {
        this.WaterMarkType = WaterMarkType;
    }

    /**
     * Get 水印为图片时的参数列表，水印为图片时校验必填。 
     * @return WaterMarkImage 水印为图片时的参数列表，水印为图片时校验必填。
     */
    public WaterMarkImage getWaterMarkImage() {
        return this.WaterMarkImage;
    }

    /**
     * Set 水印为图片时的参数列表，水印为图片时校验必填。
     * @param WaterMarkImage 水印为图片时的参数列表，水印为图片时校验必填。
     */
    public void setWaterMarkImage(WaterMarkImage WaterMarkImage) {
        this.WaterMarkImage = WaterMarkImage;
    }

    /**
     * Get 水印为文字时的参数列表，水印为文字时校验必填。 
     * @return WaterMarkChar 水印为文字时的参数列表，水印为文字时校验必填。
     */
    public WaterMarkChar getWaterMarkChar() {
        return this.WaterMarkChar;
    }

    /**
     * Set 水印为文字时的参数列表，水印为文字时校验必填。
     * @param WaterMarkChar 水印为文字时的参数列表，水印为文字时校验必填。
     */
    public void setWaterMarkChar(WaterMarkChar WaterMarkChar) {
        this.WaterMarkChar = WaterMarkChar;
    }

    /**
     * Get 水印为时间戳时的参数列表，水印为时间戳时校验必填。 
     * @return WaterMarkTimestamp 水印为时间戳时的参数列表，水印为时间戳时校验必填。
     */
    public WaterMarkTimestamp getWaterMarkTimestamp() {
        return this.WaterMarkTimestamp;
    }

    /**
     * Set 水印为时间戳时的参数列表，水印为时间戳时校验必填。
     * @param WaterMarkTimestamp 水印为时间戳时的参数列表，水印为时间戳时校验必填。
     */
    public void setWaterMarkTimestamp(WaterMarkTimestamp WaterMarkTimestamp) {
        this.WaterMarkTimestamp = WaterMarkTimestamp;
    }

    public WaterMark() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMark(WaterMark source) {
        if (source.WaterMarkType != null) {
            this.WaterMarkType = new Long(source.WaterMarkType);
        }
        if (source.WaterMarkImage != null) {
            this.WaterMarkImage = new WaterMarkImage(source.WaterMarkImage);
        }
        if (source.WaterMarkChar != null) {
            this.WaterMarkChar = new WaterMarkChar(source.WaterMarkChar);
        }
        if (source.WaterMarkTimestamp != null) {
            this.WaterMarkTimestamp = new WaterMarkTimestamp(source.WaterMarkTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkType", this.WaterMarkType);
        this.setParamObj(map, prefix + "WaterMarkImage.", this.WaterMarkImage);
        this.setParamObj(map, prefix + "WaterMarkChar.", this.WaterMarkChar);
        this.setParamObj(map, prefix + "WaterMarkTimestamp.", this.WaterMarkTimestamp);

    }
}

