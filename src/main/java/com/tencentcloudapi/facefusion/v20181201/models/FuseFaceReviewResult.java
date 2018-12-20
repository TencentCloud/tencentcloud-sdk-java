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

public class FuseFaceReviewResult  extends AbstractModel{

    /**
    * 对应的类别名称 porn, politics, terror
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 对应子类别状态码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 对应子类别状态码信息描述
    */
    @SerializedName("CodeDescription")
    @Expose
    private String CodeDescription;

    /**
    * 对应识别种类的置信度
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
    * 审核详细内容
    */
    @SerializedName("DetailSet")
    @Expose
    private FuseFaceReviewDetail [] DetailSet;

    /**
     * 获取对应的类别名称 porn, politics, terror
     * @return Category 对应的类别名称 porn, politics, terror
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * 设置对应的类别名称 porn, politics, terror
     * @param Category 对应的类别名称 porn, politics, terror
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * 获取对应子类别状态码
     * @return Code 对应子类别状态码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * 设置对应子类别状态码
     * @param Code 对应子类别状态码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * 获取对应子类别状态码信息描述
     * @return CodeDescription 对应子类别状态码信息描述
     */
    public String getCodeDescription() {
        return this.CodeDescription;
    }

    /**
     * 设置对应子类别状态码信息描述
     * @param CodeDescription 对应子类别状态码信息描述
     */
    public void setCodeDescription(String CodeDescription) {
        this.CodeDescription = CodeDescription;
    }

    /**
     * 获取对应识别种类的置信度
     * @return Confidence 对应识别种类的置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置对应识别种类的置信度
     * @param Confidence 对应识别种类的置信度
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
     * 获取审核详细内容
     * @return DetailSet 审核详细内容
     */
    public FuseFaceReviewDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * 设置审核详细内容
     * @param DetailSet 审核详细内容
     */
    public void setDetailSet(FuseFaceReviewDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CodeDescription", this.CodeDescription);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArrayObj(map, prefix + "DetailSet.", this.DetailSet);

    }
}

