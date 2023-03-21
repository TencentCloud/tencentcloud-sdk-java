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

public class McuWaterMarkParams extends AbstractModel{

    /**
    * 水印类型，0为图片（默认），1为文字。
    */
    @SerializedName("WaterMarkType")
    @Expose
    private Long WaterMarkType;

    /**
    * 图片水印参数。WaterMarkType为0指定。
    */
    @SerializedName("WaterMarkImage")
    @Expose
    private McuWaterMarkImage WaterMarkImage;

    /**
    * 文字水印参数。WaterMarkType为1指定。
    */
    @SerializedName("WaterMarkText")
    @Expose
    private McuWaterMarkText WaterMarkText;

    /**
     * Get 水印类型，0为图片（默认），1为文字。 
     * @return WaterMarkType 水印类型，0为图片（默认），1为文字。
     */
    public Long getWaterMarkType() {
        return this.WaterMarkType;
    }

    /**
     * Set 水印类型，0为图片（默认），1为文字。
     * @param WaterMarkType 水印类型，0为图片（默认），1为文字。
     */
    public void setWaterMarkType(Long WaterMarkType) {
        this.WaterMarkType = WaterMarkType;
    }

    /**
     * Get 图片水印参数。WaterMarkType为0指定。 
     * @return WaterMarkImage 图片水印参数。WaterMarkType为0指定。
     */
    public McuWaterMarkImage getWaterMarkImage() {
        return this.WaterMarkImage;
    }

    /**
     * Set 图片水印参数。WaterMarkType为0指定。
     * @param WaterMarkImage 图片水印参数。WaterMarkType为0指定。
     */
    public void setWaterMarkImage(McuWaterMarkImage WaterMarkImage) {
        this.WaterMarkImage = WaterMarkImage;
    }

    /**
     * Get 文字水印参数。WaterMarkType为1指定。 
     * @return WaterMarkText 文字水印参数。WaterMarkType为1指定。
     */
    public McuWaterMarkText getWaterMarkText() {
        return this.WaterMarkText;
    }

    /**
     * Set 文字水印参数。WaterMarkType为1指定。
     * @param WaterMarkText 文字水印参数。WaterMarkType为1指定。
     */
    public void setWaterMarkText(McuWaterMarkText WaterMarkText) {
        this.WaterMarkText = WaterMarkText;
    }

    public McuWaterMarkParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuWaterMarkParams(McuWaterMarkParams source) {
        if (source.WaterMarkType != null) {
            this.WaterMarkType = new Long(source.WaterMarkType);
        }
        if (source.WaterMarkImage != null) {
            this.WaterMarkImage = new McuWaterMarkImage(source.WaterMarkImage);
        }
        if (source.WaterMarkText != null) {
            this.WaterMarkText = new McuWaterMarkText(source.WaterMarkText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkType", this.WaterMarkType);
        this.setParamObj(map, prefix + "WaterMarkImage.", this.WaterMarkImage);
        this.setParamObj(map, prefix + "WaterMarkText.", this.WaterMarkText);

    }
}

