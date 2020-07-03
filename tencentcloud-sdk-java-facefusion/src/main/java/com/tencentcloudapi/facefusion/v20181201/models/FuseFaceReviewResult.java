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

public class FuseFaceReviewResult extends AbstractModel{

    /**
    * 保留字段
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 状态码， 0为处理成功，其他值为处理失败
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 对应状态码信息描述
    */
    @SerializedName("CodeDescription")
    @Expose
    private String CodeDescription;

    /**
    * 保留字段
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 保留字段
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
     * Get 保留字段 
     * @return Category 保留字段
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 保留字段
     * @param Category 保留字段
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 状态码， 0为处理成功，其他值为处理失败 
     * @return Code 状态码， 0为处理成功，其他值为处理失败
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 状态码， 0为处理成功，其他值为处理失败
     * @param Code 状态码， 0为处理成功，其他值为处理失败
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 对应状态码信息描述 
     * @return CodeDescription 对应状态码信息描述
     */
    public String getCodeDescription() {
        return this.CodeDescription;
    }

    /**
     * Set 对应状态码信息描述
     * @param CodeDescription 对应状态码信息描述
     */
    public void setCodeDescription(String CodeDescription) {
        this.CodeDescription = CodeDescription;
    }

    /**
     * Get 保留字段 
     * @return Confidence 保留字段
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 保留字段
     * @param Confidence 保留字段
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 保留字段 
     * @return Suggestion 保留字段
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 保留字段
     * @param Suggestion 保留字段
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 审核详细内容 
     * @return DetailSet 审核详细内容
     */
    public FuseFaceReviewDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set 审核详细内容
     * @param DetailSet 审核详细内容
     */
    public void setDetailSet(FuseFaceReviewDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    /**
     * Internal implementation, normal users should not use it.
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

