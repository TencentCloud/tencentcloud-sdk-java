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
    * <p>主键Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>地址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>站点标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>状态码</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>响应长度</p>
    */
    @SerializedName("ContentLength")
    @Expose
    private Long ContentLength;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * <p>Ip数据</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>AI评分</p>
    */
    @SerializedName("AIRating")
    @Expose
    private Long AIRating;

    /**
    * <p>AI分析</p>
    */
    @SerializedName("AIAnalysis")
    @Expose
    private String AIAnalysis;

    /**
    * <p>风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>建议</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>是否为云资产</p>
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * <p>云资产状态，-1为下线</p>
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
    * <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
    */
    @SerializedName("AggregationCount")
    @Expose
    private Long AggregationCount;

    /**
     * Get <p>主键Id</p> 
     * @return Id <p>主键Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键Id</p>
     * @param Id <p>主键Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>地址</p> 
     * @return Url <p>地址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>地址</p>
     * @param Url <p>地址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>站点标题</p> 
     * @return Title <p>站点标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>站点标题</p>
     * @param Title <p>站点标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>状态码</p> 
     * @return Code <p>状态码</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>状态码</p>
     * @param Code <p>状态码</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>响应长度</p> 
     * @return ContentLength <p>响应长度</p>
     */
    public Long getContentLength() {
        return this.ContentLength;
    }

    /**
     * Set <p>响应长度</p>
     * @param ContentLength <p>响应长度</p>
     */
    public void setContentLength(Long ContentLength) {
        this.ContentLength = ContentLength;
    }

    /**
     * Get <p>公共字段</p> 
     * @return DisplayToolCommon <p>公共字段</p>
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set <p>公共字段</p>
     * @param DisplayToolCommon <p>公共字段</p>
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get <p>Ip数据</p> 
     * @return Ip <p>Ip数据</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Ip数据</p>
     * @param Ip <p>Ip数据</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>AI评分</p> 
     * @return AIRating <p>AI评分</p>
     */
    public Long getAIRating() {
        return this.AIRating;
    }

    /**
     * Set <p>AI评分</p>
     * @param AIRating <p>AI评分</p>
     */
    public void setAIRating(Long AIRating) {
        this.AIRating = AIRating;
    }

    /**
     * Get <p>AI分析</p> 
     * @return AIAnalysis <p>AI分析</p>
     */
    public String getAIAnalysis() {
        return this.AIAnalysis;
    }

    /**
     * Set <p>AI分析</p>
     * @param AIAnalysis <p>AI分析</p>
     */
    public void setAIAnalysis(String AIAnalysis) {
        this.AIAnalysis = AIAnalysis;
    }

    /**
     * Get <p>风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报</p> 
     * @return RiskLevel <p>风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报</p>
     * @param RiskLevel <p>风险等级: 1-低危, 2-中危, 3-高危, 4-危级, 5-误报</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>建议</p> 
     * @return Suggestion <p>建议</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>建议</p>
     * @param Suggestion <p>建议</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>是否为云资产</p> 
     * @return IsCloudAsset <p>是否为云资产</p>
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set <p>是否为云资产</p>
     * @param IsCloudAsset <p>是否为云资产</p>
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get <p>云资产状态，-1为下线</p> 
     * @return CloudAssetStatus <p>云资产状态，-1为下线</p>
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set <p>云资产状态，-1为下线</p>
     * @param CloudAssetStatus <p>云资产状态，-1为下线</p>
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    /**
     * Get <p>聚合视角下该组真实子项总数；非聚合视角为 0</p> 
     * @return AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public Long getAggregationCount() {
        return this.AggregationCount;
    }

    /**
     * Set <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     * @param AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public void setAggregationCount(Long AggregationCount) {
        this.AggregationCount = AggregationCount;
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
        if (source.AggregationCount != null) {
            this.AggregationCount = new Long(source.AggregationCount);
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
        this.setParamSimple(map, prefix + "AggregationCount", this.AggregationCount);

    }
}

