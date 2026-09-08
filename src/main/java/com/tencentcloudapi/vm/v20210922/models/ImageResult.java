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
    * <p>违规标志<br>0 未命中<br>1 命中</p>
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * <p>命中的标签<br>Porn 色情<br>Sexy 性感<br>Polity 政治<br>Illegal 违法<br>Abuse 谩骂<br>Terror 暴恐<br>Ad 广告</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>审核建议，可选值：<br>Pass 通过，<br>Review 建议人审，<br>Block 确认违规</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>得分</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>画面截帧图片结果集</p>
    */
    @SerializedName("Results")
    @Expose
    private ImageResultResult [] Results;

    /**
    * <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>附加字段</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>二级标签</p>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * <p>场景结果</p>
    */
    @SerializedName("RecognitionResults")
    @Expose
    private RecognitionResult [] RecognitionResults;

    /**
    * <p>审核命中类型</p>
    */
    @SerializedName("HitType")
    @Expose
    private String HitType;

    /**
    * <p>截帧请求ID</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>命中信息</p>
    */
    @SerializedName("HitSnippetInfos")
    @Expose
    private HitSnippetInfo [] HitSnippetInfos;

    /**
     * Get <p>违规标志<br>0 未命中<br>1 命中</p> 
     * @return HitFlag <p>违规标志<br>0 未命中<br>1 命中</p>
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set <p>违规标志<br>0 未命中<br>1 命中</p>
     * @param HitFlag <p>违规标志<br>0 未命中<br>1 命中</p>
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get <p>命中的标签<br>Porn 色情<br>Sexy 性感<br>Polity 政治<br>Illegal 违法<br>Abuse 谩骂<br>Terror 暴恐<br>Ad 广告</p> 
     * @return Label <p>命中的标签<br>Porn 色情<br>Sexy 性感<br>Polity 政治<br>Illegal 违法<br>Abuse 谩骂<br>Terror 暴恐<br>Ad 广告</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>命中的标签<br>Porn 色情<br>Sexy 性感<br>Polity 政治<br>Illegal 违法<br>Abuse 谩骂<br>Terror 暴恐<br>Ad 广告</p>
     * @param Label <p>命中的标签<br>Porn 色情<br>Sexy 性感<br>Polity 政治<br>Illegal 违法<br>Abuse 谩骂<br>Terror 暴恐<br>Ad 广告</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>审核建议，可选值：<br>Pass 通过，<br>Review 建议人审，<br>Block 确认违规</p> 
     * @return Suggestion <p>审核建议，可选值：<br>Pass 通过，<br>Review 建议人审，<br>Block 确认违规</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>审核建议，可选值：<br>Pass 通过，<br>Review 建议人审，<br>Block 确认违规</p>
     * @param Suggestion <p>审核建议，可选值：<br>Pass 通过，<br>Review 建议人审，<br>Block 确认违规</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>得分</p> 
     * @return Score <p>得分</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>得分</p>
     * @param Score <p>得分</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>画面截帧图片结果集</p> 
     * @return Results <p>画面截帧图片结果集</p>
     */
    public ImageResultResult [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>画面截帧图片结果集</p>
     * @param Results <p>画面截帧图片结果集</p>
     */
    public void setResults(ImageResultResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p> 
     * @return Url <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
     * @param Url <p>该字段用于返回审核结果的访问链接（URL）。<br>备注：链接默认有效期为12小时。如果您需要更长时效的链接，请使用<a href="https://cloud.tencent.com/document/product/1265/104001">COS预签名</a>功能更新签名时效。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>附加字段</p> 
     * @return Extra <p>附加字段</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>附加字段</p>
     * @param Extra <p>附加字段</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>二级标签</p> 
     * @return SubLabel <p>二级标签</p>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set <p>二级标签</p>
     * @param SubLabel <p>二级标签</p>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get <p>场景结果</p> 
     * @return RecognitionResults <p>场景结果</p>
     */
    public RecognitionResult [] getRecognitionResults() {
        return this.RecognitionResults;
    }

    /**
     * Set <p>场景结果</p>
     * @param RecognitionResults <p>场景结果</p>
     */
    public void setRecognitionResults(RecognitionResult [] RecognitionResults) {
        this.RecognitionResults = RecognitionResults;
    }

    /**
     * Get <p>审核命中类型</p> 
     * @return HitType <p>审核命中类型</p>
     */
    public String getHitType() {
        return this.HitType;
    }

    /**
     * Set <p>审核命中类型</p>
     * @param HitType <p>审核命中类型</p>
     */
    public void setHitType(String HitType) {
        this.HitType = HitType;
    }

    /**
     * Get <p>截帧请求ID</p> 
     * @return RequestId <p>截帧请求ID</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>截帧请求ID</p>
     * @param RequestId <p>截帧请求ID</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>命中信息</p> 
     * @return HitSnippetInfos <p>命中信息</p>
     */
    public HitSnippetInfo [] getHitSnippetInfos() {
        return this.HitSnippetInfos;
    }

    /**
     * Set <p>命中信息</p>
     * @param HitSnippetInfos <p>命中信息</p>
     */
    public void setHitSnippetInfos(HitSnippetInfo [] HitSnippetInfos) {
        this.HitSnippetInfos = HitSnippetInfos;
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.HitSnippetInfos != null) {
            this.HitSnippetInfos = new HitSnippetInfo[source.HitSnippetInfos.length];
            for (int i = 0; i < source.HitSnippetInfos.length; i++) {
                this.HitSnippetInfos[i] = new HitSnippetInfo(source.HitSnippetInfos[i]);
            }
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamArrayObj(map, prefix + "HitSnippetInfos.", this.HitSnippetInfos);

    }
}

