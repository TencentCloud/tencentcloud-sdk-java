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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResult extends AbstractModel{

    /**
    * 违规标志
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 得分
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 画面截帧图片结果集
    */
    @SerializedName("Results")
    @Expose
    private ImageResultResult [] Results;

    /**
    * 图片URL地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 附加字段
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get 违规标志
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitFlag 违规标志
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 违规标志
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitFlag 违规标志
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过 
     * @return Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     * @param Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 得分 
     * @return Score 得分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 得分
     * @param Score 得分
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 画面截帧图片结果集 
     * @return Results 画面截帧图片结果集
     */
    public ImageResultResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 画面截帧图片结果集
     * @param Results 画面截帧图片结果集
     */
    public void setResults(ImageResultResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 图片URL地址 
     * @return Url 图片URL地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片URL地址
     * @param Url 图片URL地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 附加字段 
     * @return Extra 附加字段
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 附加字段
     * @param Extra 附加字段
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public ImageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageResult(ImageResult source) {
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Results != null) {
            this.Results = new ImageResultResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new ImageResultResult(source.Results[i]);
            }
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

