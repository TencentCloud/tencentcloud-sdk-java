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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseFaceReviewDetail extends AbstractModel {

    /**
    * 保留字段
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
    * 对应识别label的置信度，分数越高意味违法违规可能性越大。 
0到70，Suggestion建议为PASS； 
70到80，Suggestion建议为REVIEW； 
80到100，Suggestion建议为BLOCK。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 识别场景的审核结论：  
PASS：正常 
REVIEW：疑似  
BLOCK：违规
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get 保留字段 
     * @return Field 保留字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 保留字段
     * @param Field 保留字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 人员名称 
     * @return Label 人员名称
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 人员名称
     * @param Label 人员名称
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 对应识别label的置信度，分数越高意味违法违规可能性越大。 
0到70，Suggestion建议为PASS； 
70到80，Suggestion建议为REVIEW； 
80到100，Suggestion建议为BLOCK。 
     * @return Confidence 对应识别label的置信度，分数越高意味违法违规可能性越大。 
0到70，Suggestion建议为PASS； 
70到80，Suggestion建议为REVIEW； 
80到100，Suggestion建议为BLOCK。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 对应识别label的置信度，分数越高意味违法违规可能性越大。 
0到70，Suggestion建议为PASS； 
70到80，Suggestion建议为REVIEW； 
80到100，Suggestion建议为BLOCK。
     * @param Confidence 对应识别label的置信度，分数越高意味违法违规可能性越大。 
0到70，Suggestion建议为PASS； 
70到80，Suggestion建议为REVIEW； 
80到100，Suggestion建议为BLOCK。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 识别场景的审核结论：  
PASS：正常 
REVIEW：疑似  
BLOCK：违规 
     * @return Suggestion 识别场景的审核结论：  
PASS：正常 
REVIEW：疑似  
BLOCK：违规
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 识别场景的审核结论：  
PASS：正常 
REVIEW：疑似  
BLOCK：违规
     * @param Suggestion 识别场景的审核结论：  
PASS：正常 
REVIEW：疑似  
BLOCK：违规
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public FuseFaceReviewDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FuseFaceReviewDetail(FuseFaceReviewDetail source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

