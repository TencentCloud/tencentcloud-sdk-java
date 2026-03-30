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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoLLMDetail extends AbstractModel {

    /**
    * <p>命中的标签名</p>
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * <p>命中标签的原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>命中的文本内容</p>
    */
    @SerializedName("TargetText")
    @Expose
    private String [] TargetText;

    /**
    * <p>违规建议</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get <p>命中的标签名</p> 
     * @return LabelName <p>命中的标签名</p>
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set <p>命中的标签名</p>
     * @param LabelName <p>命中的标签名</p>
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get <p>命中标签的原因</p> 
     * @return Reason <p>命中标签的原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>命中标签的原因</p>
     * @param Reason <p>命中标签的原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>命中的文本内容</p> 
     * @return TargetText <p>命中的文本内容</p>
     */
    public String [] getTargetText() {
        return this.TargetText;
    }

    /**
     * Set <p>命中的文本内容</p>
     * @param TargetText <p>命中的文本内容</p>
     */
    public void setTargetText(String [] TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get <p>违规建议</p> 
     * @return Suggestion <p>违规建议</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>违规建议</p>
     * @param Suggestion <p>违规建议</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public VideoLLMDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoLLMDetail(VideoLLMDetail source) {
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.TargetText != null) {
            this.TargetText = new String[source.TargetText.length];
            for (int i = 0; i < source.TargetText.length; i++) {
                this.TargetText[i] = new String(source.TargetText[i]);
            }
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArraySimple(map, prefix + "TargetText.", this.TargetText);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

