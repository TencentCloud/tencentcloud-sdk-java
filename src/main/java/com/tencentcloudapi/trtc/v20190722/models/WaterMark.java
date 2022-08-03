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

public class WaterMark extends AbstractModel{

    /**
    * 水印类型，0为图片（默认），1为文字（暂不支持）。
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
     * Get 水印类型，0为图片（默认），1为文字（暂不支持）。 
     * @return WaterMarkType 水印类型，0为图片（默认），1为文字（暂不支持）。
     */
    public Long getWaterMarkType() {
        return this.WaterMarkType;
    }

    /**
     * Set 水印类型，0为图片（默认），1为文字（暂不支持）。
     * @param WaterMarkType 水印类型，0为图片（默认），1为文字（暂不支持）。
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkType", this.WaterMarkType);
        this.setParamObj(map, prefix + "WaterMarkImage.", this.WaterMarkImage);

    }
}

