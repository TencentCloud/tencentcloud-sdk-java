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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrRecognise extends AbstractModel{

    /**
    * 原文字段
    */
    @SerializedName("OriginalField")
    @Expose
    private String OriginalField;

    /**
    * 识别结果
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 位置信息
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * 字段名
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
     * Get 原文字段 
     * @return OriginalField 原文字段
     */
    public String getOriginalField() {
        return this.OriginalField;
    }

    /**
     * Set 原文字段
     * @param OriginalField 原文字段
     */
    public void setOriginalField(String OriginalField) {
        this.OriginalField = OriginalField;
    }

    /**
     * Get 识别结果 
     * @return Value 识别结果
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 识别结果
     * @param Value 识别结果
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 置信度 
     * @return Confidence 置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度
     * @param Confidence 置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 位置信息 
     * @return Location 位置信息
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 位置信息
     * @param Location 位置信息
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get 字段名 
     * @return Field 字段名
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 字段名
     * @param Field 字段名
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    public OcrRecognise() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrRecognise(OcrRecognise source) {
        if (source.OriginalField != null) {
            this.OriginalField = new String(source.OriginalField);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalField", this.OriginalField);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "Field", this.Field);

    }
}

