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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseFaceReviewDetail  extends AbstractModel{

    /**
    * 鉴政使用字段, 为职业属性,其他审核结果对应上一级category
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 人员名称
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 对应识别label的置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 此字段为保留字段，目前统一返回pass。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * 获取鉴政使用字段, 为职业属性,其他审核结果对应上一级category
     * @return Field 鉴政使用字段, 为职业属性,其他审核结果对应上一级category
     */
    public String getField() {
        return this.Field;
    }

    /**
     * 设置鉴政使用字段, 为职业属性,其他审核结果对应上一级category
     * @param Field 鉴政使用字段, 为职业属性,其他审核结果对应上一级category
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * 获取人员名称
     * @return Label 人员名称
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * 设置人员名称
     * @param Label 人员名称
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * 获取对应识别label的置信度
     * @return Confidence 对应识别label的置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置对应识别label的置信度
     * @param Confidence 对应识别label的置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取此字段为保留字段，目前统一返回pass。
     * @return Suggestion 此字段为保留字段，目前统一返回pass。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * 设置此字段为保留字段，目前统一返回pass。
     * @param Suggestion 此字段为保留字段，目前统一返回pass。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

