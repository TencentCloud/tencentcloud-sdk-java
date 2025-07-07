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

public class TaskLabel extends AbstractModel {

    /**
    * 该字段用于返回检测结果所对应的恶意标签。
返回值：Porn：色情，Abuse：谩骂，Ad：广告；以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 得分，分数是 0 ～ 100
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 命中的二级标签
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get 该字段用于返回检测结果所对应的恶意标签。
返回值：Porn：色情，Abuse：谩骂，Ad：广告；以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Label 该字段用于返回检测结果所对应的恶意标签。
返回值：Porn：色情，Abuse：谩骂，Ad：广告；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果所对应的恶意标签。
返回值：Porn：色情，Abuse：谩骂，Ad：广告；以及其他令人反感、不安全或不适宜的内容类型。
     * @param Label 该字段用于返回检测结果所对应的恶意标签。
返回值：Porn：色情，Abuse：谩骂，Ad：广告；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规 
     * @return Suggestion 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
     * @param Suggestion 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 得分，分数是 0 ～ 100 
     * @return Score 得分，分数是 0 ～ 100
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 得分，分数是 0 ～ 100
     * @param Score 得分，分数是 0 ～ 100
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 命中的二级标签 
     * @return SubLabel 命中的二级标签
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 命中的二级标签
     * @param SubLabel 命中的二级标签
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public TaskLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLabel(TaskLabel source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

