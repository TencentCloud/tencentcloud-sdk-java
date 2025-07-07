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

public class ImageResult extends AbstractModel {

    /**
    * 违规标志
0 未命中
1 命中
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 命中的标签
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
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
    * 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
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
    * 二级标签
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 场景结果
    */
    @SerializedName("RecognitionResults")
    @Expose
    private RecognitionResult [] RecognitionResults;

    /**
    * 审核命中类型
    */
    @SerializedName("HitType")
    @Expose
    private String HitType;

    /**
     * Get 违规标志
0 未命中
1 命中 
     * @return HitFlag 违规标志
0 未命中
1 命中
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 违规标志
0 未命中
1 命中
     * @param HitFlag 违规标志
0 未命中
1 命中
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 命中的标签
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告 
     * @return Label 命中的标签
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 命中的标签
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
     * @param Label 命中的标签
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
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
     * Get 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。 
     * @return Url 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
     * @param Url 该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用[COS预签名](https://cloud.tencent.com/document/product/1265/104001)功能更新签名时效。
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

    /**
     * Get 二级标签 
     * @return SubLabel 二级标签
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 二级标签
     * @param SubLabel 二级标签
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 场景结果 
     * @return RecognitionResults 场景结果
     */
    public RecognitionResult [] getRecognitionResults() {
        return this.RecognitionResults;
    }

    /**
     * Set 场景结果
     * @param RecognitionResults 场景结果
     */
    public void setRecognitionResults(RecognitionResult [] RecognitionResults) {
        this.RecognitionResults = RecognitionResults;
    }

    /**
     * Get 审核命中类型 
     * @return HitType 审核命中类型
     */
    public String getHitType() {
        return this.HitType;
    }

    /**
     * Set 审核命中类型
     * @param HitType 审核命中类型
     */
    public void setHitType(String HitType) {
        this.HitType = HitType;
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
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
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
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.RecognitionResults != null) {
            this.RecognitionResults = new RecognitionResult[source.RecognitionResults.length];
            for (int i = 0; i < source.RecognitionResults.length; i++) {
                this.RecognitionResults[i] = new RecognitionResult(source.RecognitionResults[i]);
            }
        }
        if (source.HitType != null) {
            this.HitType = new String(source.HitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamArrayObj(map, prefix + "RecognitionResults.", this.RecognitionResults);
        this.setParamSimple(map, prefix + "HitType", this.HitType);

    }
}

