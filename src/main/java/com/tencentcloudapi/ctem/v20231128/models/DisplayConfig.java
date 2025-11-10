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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayConfig extends AbstractModel {

    /**
    * 主键Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 站点标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 响应长度
    */
    @SerializedName("ContentLength")
    @Expose
    private Long ContentLength;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * Ip数据
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * AI评分
    */
    @SerializedName("AIRating")
    @Expose
    private Long AIRating;

    /**
    * AI分析
    */
    @SerializedName("AIAnalysis")
    @Expose
    private String AIAnalysis;

    /**
    * 风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 是否为云资产
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * 云资产状态，-1为下线
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
     * Get 主键Id 
     * @return Id 主键Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键Id
     * @param Id 主键Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 地址 
     * @return Url 地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 地址
     * @param Url 地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 站点标题 
     * @return Title 站点标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 站点标题
     * @param Title 站点标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 状态码 
     * @return Code 状态码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码
     * @param Code 状态码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 响应长度 
     * @return ContentLength 响应长度
     */
    public Long getContentLength() {
        return this.ContentLength;
    }

    /**
     * Set 响应长度
     * @param ContentLength 响应长度
     */
    public void setContentLength(Long ContentLength) {
        this.ContentLength = ContentLength;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get Ip数据 
     * @return Ip Ip数据
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip数据
     * @param Ip Ip数据
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get AI评分 
     * @return AIRating AI评分
     */
    public Long getAIRating() {
        return this.AIRating;
    }

    /**
     * Set AI评分
     * @param AIRating AI评分
     */
    public void setAIRating(Long AIRating) {
        this.AIRating = AIRating;
    }

    /**
     * Get AI分析 
     * @return AIAnalysis AI分析
     */
    public String getAIAnalysis() {
        return this.AIAnalysis;
    }

    /**
     * Set AI分析
     * @param AIAnalysis AI分析
     */
    public void setAIAnalysis(String AIAnalysis) {
        this.AIAnalysis = AIAnalysis;
    }

    /**
     * Get 风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报 
     * @return RiskLevel 风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报
     * @param RiskLevel 风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 建议 
     * @return Suggestion 建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议
     * @param Suggestion 建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 是否为云资产 
     * @return IsCloudAsset 是否为云资产
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set 是否为云资产
     * @param IsCloudAsset 是否为云资产
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get 云资产状态，-1为下线 
     * @return CloudAssetStatus 云资产状态，-1为下线
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set 云资产状态，-1为下线
     * @param CloudAssetStatus 云资产状态，-1为下线
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    public DisplayConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayConfig(DisplayConfig source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.ContentLength != null) {
            this.ContentLength = new Long(source.ContentLength);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.AIRating != null) {
            this.AIRating = new Long(source.AIRating);
        }
        if (source.AIAnalysis != null) {
            this.AIAnalysis = new String(source.AIAnalysis);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.IsCloudAsset != null) {
            this.IsCloudAsset = new Long(source.IsCloudAsset);
        }
        if (source.CloudAssetStatus != null) {
            this.CloudAssetStatus = new Long(source.CloudAssetStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "ContentLength", this.ContentLength);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "AIRating", this.AIRating);
        this.setParamSimple(map, prefix + "AIAnalysis", this.AIAnalysis);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "IsCloudAsset", this.IsCloudAsset);
        this.setParamSimple(map, prefix + "CloudAssetStatus", this.CloudAssetStatus);

    }
}

