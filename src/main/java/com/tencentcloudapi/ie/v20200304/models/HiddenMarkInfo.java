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

public class HiddenMarkInfo extends AbstractModel{

    /**
    * 数字水印路径,，如果不从Cos拉取水印，则必填
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 数字水印频率，可选值：[1,256]，默认值为30
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * 数字水印强度，可选值：[32,128]，默认值为64
    */
    @SerializedName("Strength")
    @Expose
    private Long Strength;

    /**
    * 数字水印的Cos 信息，从Cos上拉取图片水印时必填。
    */
    @SerializedName("CosInfo")
    @Expose
    private CosInfo CosInfo;

    /**
     * Get 数字水印路径,，如果不从Cos拉取水印，则必填 
     * @return Path 数字水印路径,，如果不从Cos拉取水印，则必填
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 数字水印路径,，如果不从Cos拉取水印，则必填
     * @param Path 数字水印路径,，如果不从Cos拉取水印，则必填
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 数字水印频率，可选值：[1,256]，默认值为30 
     * @return Frequency 数字水印频率，可选值：[1,256]，默认值为30
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 数字水印频率，可选值：[1,256]，默认值为30
     * @param Frequency 数字水印频率，可选值：[1,256]，默认值为30
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 数字水印强度，可选值：[32,128]，默认值为64 
     * @return Strength 数字水印强度，可选值：[32,128]，默认值为64
     */
    public Long getStrength() {
        return this.Strength;
    }

    /**
     * Set 数字水印强度，可选值：[32,128]，默认值为64
     * @param Strength 数字水印强度，可选值：[32,128]，默认值为64
     */
    public void setStrength(Long Strength) {
        this.Strength = Strength;
    }

    /**
     * Get 数字水印的Cos 信息，从Cos上拉取图片水印时必填。 
     * @return CosInfo 数字水印的Cos 信息，从Cos上拉取图片水印时必填。
     */
    public CosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set 数字水印的Cos 信息，从Cos上拉取图片水印时必填。
     * @param CosInfo 数字水印的Cos 信息，从Cos上拉取图片水印时必填。
     */
    public void setCosInfo(CosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    public HiddenMarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiddenMarkInfo(HiddenMarkInfo source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.Strength != null) {
            this.Strength = new Long(source.Strength);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new CosInfo(source.CosInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "Strength", this.Strength);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);

    }
}

