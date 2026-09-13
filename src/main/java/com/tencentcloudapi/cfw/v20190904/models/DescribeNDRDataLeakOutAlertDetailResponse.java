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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNDRDataLeakOutAlertDetailResponse extends AbstractModel {

    /**
    * 风险事件ID
    */
    @SerializedName("RiskID")
    @Expose
    private String RiskID;

    /**
    * 资产实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 资产实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 资产所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 源IP
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * 目的IP端口
    */
    @SerializedName("DstIPPort")
    @Expose
    private String DstIPPort;

    /**
    * 目的Host
    */
    @SerializedName("Hostname")
    @Expose
    private String Hostname;

    /**
    * 目的服务类型
    */
    @SerializedName("DstServiceType")
    @Expose
    private String DstServiceType;

    /**
    * 目的服务名称
    */
    @SerializedName("DstServiceName")
    @Expose
    private String DstServiceName;

    /**
    * 访问API
    */
    @SerializedName("ApiPattern")
    @Expose
    private String ApiPattern;

    /**
    * 目的IP地理信息
    */
    @SerializedName("DstGeoLocation")
    @Expose
    private String DstGeoLocation;

    /**
    * 应用层协议
    */
    @SerializedName("AppProto")
    @Expose
    private String AppProto;

    /**
    * 敏感类型集合
    */
    @SerializedName("LeakTypeSet")
    @Expose
    private String LeakTypeSet;

    /**
    * 事件数量
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 敏感数据数量
    */
    @SerializedName("LeakDataCount")
    @Expose
    private Long LeakDataCount;

    /**
    * 原始风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 处置状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 处置备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 首次识别时间
    */
    @SerializedName("FirstIdentificationTime")
    @Expose
    private String FirstIdentificationTime;

    /**
    * 最近识别时间
    */
    @SerializedName("LatestIdentificationTime")
    @Expose
    private String LatestIdentificationTime;

    /**
    * AI任务分析状态
    */
    @SerializedName("AnalysisStatus")
    @Expose
    private Long AnalysisStatus;

    /**
    * AI任务失败原因
    */
    @SerializedName("AnalysisFailReason")
    @Expose
    private String AnalysisFailReason;

    /**
    * 最近一次AI分析时间
    */
    @SerializedName("LastAnalysisTime")
    @Expose
    private String LastAnalysisTime;

    /**
    * API业务类型
    */
    @SerializedName("ApiBizType")
    @Expose
    private String ApiBizType;

    /**
    * API业务描述
    */
    @SerializedName("ApiBizDescription")
    @Expose
    private String ApiBizDescription;

    /**
    * 风险场景（类型）
    */
    @SerializedName("RiskScenario")
    @Expose
    private String RiskScenario;

    /**
    * 风险场景（类型）描述
    */
    @SerializedName("RiskScenarioDetail")
    @Expose
    private String RiskScenarioDetail;

    /**
    * 风险总结（概览）
    */
    @SerializedName("RiskSummary")
    @Expose
    private String RiskSummary;

    /**
    * 推断依据
    */
    @SerializedName("RiskBasis")
    @Expose
    private String RiskBasis;

    /**
    * 风险影响范围
    */
    @SerializedName("ImpactScope")
    @Expose
    private String ImpactScope;

    /**
    * AI建议风险等级
    */
    @SerializedName("AiSuggestedLevel")
    @Expose
    private Long AiSuggestedLevel;

    /**
    * 处置建议
    */
    @SerializedName("DisposalSuggestions")
    @Expose
    private DisposalSuggestionItem [] DisposalSuggestions;

    /**
    * http请求头
    */
    @SerializedName("HttpRequestHeader")
    @Expose
    private String HttpRequestHeader;

    /**
    * http请求体
    */
    @SerializedName("HttpRequestBody")
    @Expose
    private String HttpRequestBody;

    /**
    * http响应头
    */
    @SerializedName("HttpResponseHeader")
    @Expose
    private String HttpResponseHeader;

    /**
    * http响应体
    */
    @SerializedName("HttpResponseBody")
    @Expose
    private String HttpResponseBody;

    /**
    * 敏感数据条目
    */
    @SerializedName("LeakDataEntries")
    @Expose
    private String LeakDataEntries;

    /**
    * 脱敏状态
    */
    @SerializedName("MaskStatus")
    @Expose
    private String MaskStatus;

    /**
    * 最高敏感等级
    */
    @SerializedName("HighestLevel")
    @Expose
    private String HighestLevel;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险事件ID 
     * @return RiskID 风险事件ID
     */
    public String getRiskID() {
        return this.RiskID;
    }

    /**
     * Set 风险事件ID
     * @param RiskID 风险事件ID
     */
    public void setRiskID(String RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get 资产实例ID 
     * @return InstanceId 资产实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资产实例ID
     * @param InstanceId 资产实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产实例名称 
     * @return InstanceName 资产实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 资产实例名称
     * @param InstanceName 资产实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 资产实例类型 
     * @return InstanceType 资产实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 资产实例类型
     * @param InstanceType 资产实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 资产所在地域 
     * @return Region 资产所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资产所在地域
     * @param Region 资产所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 源IP 
     * @return SrcIP 源IP
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 源IP
     * @param SrcIP 源IP
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get 目的IP端口 
     * @return DstIPPort 目的IP端口
     */
    public String getDstIPPort() {
        return this.DstIPPort;
    }

    /**
     * Set 目的IP端口
     * @param DstIPPort 目的IP端口
     */
    public void setDstIPPort(String DstIPPort) {
        this.DstIPPort = DstIPPort;
    }

    /**
     * Get 目的Host 
     * @return Hostname 目的Host
     */
    public String getHostname() {
        return this.Hostname;
    }

    /**
     * Set 目的Host
     * @param Hostname 目的Host
     */
    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    /**
     * Get 目的服务类型 
     * @return DstServiceType 目的服务类型
     */
    public String getDstServiceType() {
        return this.DstServiceType;
    }

    /**
     * Set 目的服务类型
     * @param DstServiceType 目的服务类型
     */
    public void setDstServiceType(String DstServiceType) {
        this.DstServiceType = DstServiceType;
    }

    /**
     * Get 目的服务名称 
     * @return DstServiceName 目的服务名称
     */
    public String getDstServiceName() {
        return this.DstServiceName;
    }

    /**
     * Set 目的服务名称
     * @param DstServiceName 目的服务名称
     */
    public void setDstServiceName(String DstServiceName) {
        this.DstServiceName = DstServiceName;
    }

    /**
     * Get 访问API 
     * @return ApiPattern 访问API
     */
    public String getApiPattern() {
        return this.ApiPattern;
    }

    /**
     * Set 访问API
     * @param ApiPattern 访问API
     */
    public void setApiPattern(String ApiPattern) {
        this.ApiPattern = ApiPattern;
    }

    /**
     * Get 目的IP地理信息 
     * @return DstGeoLocation 目的IP地理信息
     */
    public String getDstGeoLocation() {
        return this.DstGeoLocation;
    }

    /**
     * Set 目的IP地理信息
     * @param DstGeoLocation 目的IP地理信息
     */
    public void setDstGeoLocation(String DstGeoLocation) {
        this.DstGeoLocation = DstGeoLocation;
    }

    /**
     * Get 应用层协议 
     * @return AppProto 应用层协议
     */
    public String getAppProto() {
        return this.AppProto;
    }

    /**
     * Set 应用层协议
     * @param AppProto 应用层协议
     */
    public void setAppProto(String AppProto) {
        this.AppProto = AppProto;
    }

    /**
     * Get 敏感类型集合 
     * @return LeakTypeSet 敏感类型集合
     */
    public String getLeakTypeSet() {
        return this.LeakTypeSet;
    }

    /**
     * Set 敏感类型集合
     * @param LeakTypeSet 敏感类型集合
     */
    public void setLeakTypeSet(String LeakTypeSet) {
        this.LeakTypeSet = LeakTypeSet;
    }

    /**
     * Get 事件数量 
     * @return EventCount 事件数量
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 事件数量
     * @param EventCount 事件数量
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 敏感数据数量 
     * @return LeakDataCount 敏感数据数量
     */
    public Long getLeakDataCount() {
        return this.LeakDataCount;
    }

    /**
     * Set 敏感数据数量
     * @param LeakDataCount 敏感数据数量
     */
    public void setLeakDataCount(Long LeakDataCount) {
        this.LeakDataCount = LeakDataCount;
    }

    /**
     * Get 原始风险等级 
     * @return Level 原始风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 原始风险等级
     * @param Level 原始风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 处置状态 
     * @return Status 处置状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处置状态
     * @param Status 处置状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 处置备注 
     * @return Comment 处置备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 处置备注
     * @param Comment 处置备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 首次识别时间 
     * @return FirstIdentificationTime 首次识别时间
     */
    public String getFirstIdentificationTime() {
        return this.FirstIdentificationTime;
    }

    /**
     * Set 首次识别时间
     * @param FirstIdentificationTime 首次识别时间
     */
    public void setFirstIdentificationTime(String FirstIdentificationTime) {
        this.FirstIdentificationTime = FirstIdentificationTime;
    }

    /**
     * Get 最近识别时间 
     * @return LatestIdentificationTime 最近识别时间
     */
    public String getLatestIdentificationTime() {
        return this.LatestIdentificationTime;
    }

    /**
     * Set 最近识别时间
     * @param LatestIdentificationTime 最近识别时间
     */
    public void setLatestIdentificationTime(String LatestIdentificationTime) {
        this.LatestIdentificationTime = LatestIdentificationTime;
    }

    /**
     * Get AI任务分析状态 
     * @return AnalysisStatus AI任务分析状态
     */
    public Long getAnalysisStatus() {
        return this.AnalysisStatus;
    }

    /**
     * Set AI任务分析状态
     * @param AnalysisStatus AI任务分析状态
     */
    public void setAnalysisStatus(Long AnalysisStatus) {
        this.AnalysisStatus = AnalysisStatus;
    }

    /**
     * Get AI任务失败原因 
     * @return AnalysisFailReason AI任务失败原因
     */
    public String getAnalysisFailReason() {
        return this.AnalysisFailReason;
    }

    /**
     * Set AI任务失败原因
     * @param AnalysisFailReason AI任务失败原因
     */
    public void setAnalysisFailReason(String AnalysisFailReason) {
        this.AnalysisFailReason = AnalysisFailReason;
    }

    /**
     * Get 最近一次AI分析时间 
     * @return LastAnalysisTime 最近一次AI分析时间
     */
    public String getLastAnalysisTime() {
        return this.LastAnalysisTime;
    }

    /**
     * Set 最近一次AI分析时间
     * @param LastAnalysisTime 最近一次AI分析时间
     */
    public void setLastAnalysisTime(String LastAnalysisTime) {
        this.LastAnalysisTime = LastAnalysisTime;
    }

    /**
     * Get API业务类型 
     * @return ApiBizType API业务类型
     */
    public String getApiBizType() {
        return this.ApiBizType;
    }

    /**
     * Set API业务类型
     * @param ApiBizType API业务类型
     */
    public void setApiBizType(String ApiBizType) {
        this.ApiBizType = ApiBizType;
    }

    /**
     * Get API业务描述 
     * @return ApiBizDescription API业务描述
     */
    public String getApiBizDescription() {
        return this.ApiBizDescription;
    }

    /**
     * Set API业务描述
     * @param ApiBizDescription API业务描述
     */
    public void setApiBizDescription(String ApiBizDescription) {
        this.ApiBizDescription = ApiBizDescription;
    }

    /**
     * Get 风险场景（类型） 
     * @return RiskScenario 风险场景（类型）
     */
    public String getRiskScenario() {
        return this.RiskScenario;
    }

    /**
     * Set 风险场景（类型）
     * @param RiskScenario 风险场景（类型）
     */
    public void setRiskScenario(String RiskScenario) {
        this.RiskScenario = RiskScenario;
    }

    /**
     * Get 风险场景（类型）描述 
     * @return RiskScenarioDetail 风险场景（类型）描述
     */
    public String getRiskScenarioDetail() {
        return this.RiskScenarioDetail;
    }

    /**
     * Set 风险场景（类型）描述
     * @param RiskScenarioDetail 风险场景（类型）描述
     */
    public void setRiskScenarioDetail(String RiskScenarioDetail) {
        this.RiskScenarioDetail = RiskScenarioDetail;
    }

    /**
     * Get 风险总结（概览） 
     * @return RiskSummary 风险总结（概览）
     */
    public String getRiskSummary() {
        return this.RiskSummary;
    }

    /**
     * Set 风险总结（概览）
     * @param RiskSummary 风险总结（概览）
     */
    public void setRiskSummary(String RiskSummary) {
        this.RiskSummary = RiskSummary;
    }

    /**
     * Get 推断依据 
     * @return RiskBasis 推断依据
     */
    public String getRiskBasis() {
        return this.RiskBasis;
    }

    /**
     * Set 推断依据
     * @param RiskBasis 推断依据
     */
    public void setRiskBasis(String RiskBasis) {
        this.RiskBasis = RiskBasis;
    }

    /**
     * Get 风险影响范围 
     * @return ImpactScope 风险影响范围
     */
    public String getImpactScope() {
        return this.ImpactScope;
    }

    /**
     * Set 风险影响范围
     * @param ImpactScope 风险影响范围
     */
    public void setImpactScope(String ImpactScope) {
        this.ImpactScope = ImpactScope;
    }

    /**
     * Get AI建议风险等级 
     * @return AiSuggestedLevel AI建议风险等级
     */
    public Long getAiSuggestedLevel() {
        return this.AiSuggestedLevel;
    }

    /**
     * Set AI建议风险等级
     * @param AiSuggestedLevel AI建议风险等级
     */
    public void setAiSuggestedLevel(Long AiSuggestedLevel) {
        this.AiSuggestedLevel = AiSuggestedLevel;
    }

    /**
     * Get 处置建议 
     * @return DisposalSuggestions 处置建议
     */
    public DisposalSuggestionItem [] getDisposalSuggestions() {
        return this.DisposalSuggestions;
    }

    /**
     * Set 处置建议
     * @param DisposalSuggestions 处置建议
     */
    public void setDisposalSuggestions(DisposalSuggestionItem [] DisposalSuggestions) {
        this.DisposalSuggestions = DisposalSuggestions;
    }

    /**
     * Get http请求头 
     * @return HttpRequestHeader http请求头
     */
    public String getHttpRequestHeader() {
        return this.HttpRequestHeader;
    }

    /**
     * Set http请求头
     * @param HttpRequestHeader http请求头
     */
    public void setHttpRequestHeader(String HttpRequestHeader) {
        this.HttpRequestHeader = HttpRequestHeader;
    }

    /**
     * Get http请求体 
     * @return HttpRequestBody http请求体
     */
    public String getHttpRequestBody() {
        return this.HttpRequestBody;
    }

    /**
     * Set http请求体
     * @param HttpRequestBody http请求体
     */
    public void setHttpRequestBody(String HttpRequestBody) {
        this.HttpRequestBody = HttpRequestBody;
    }

    /**
     * Get http响应头 
     * @return HttpResponseHeader http响应头
     */
    public String getHttpResponseHeader() {
        return this.HttpResponseHeader;
    }

    /**
     * Set http响应头
     * @param HttpResponseHeader http响应头
     */
    public void setHttpResponseHeader(String HttpResponseHeader) {
        this.HttpResponseHeader = HttpResponseHeader;
    }

    /**
     * Get http响应体 
     * @return HttpResponseBody http响应体
     */
    public String getHttpResponseBody() {
        return this.HttpResponseBody;
    }

    /**
     * Set http响应体
     * @param HttpResponseBody http响应体
     */
    public void setHttpResponseBody(String HttpResponseBody) {
        this.HttpResponseBody = HttpResponseBody;
    }

    /**
     * Get 敏感数据条目 
     * @return LeakDataEntries 敏感数据条目
     */
    public String getLeakDataEntries() {
        return this.LeakDataEntries;
    }

    /**
     * Set 敏感数据条目
     * @param LeakDataEntries 敏感数据条目
     */
    public void setLeakDataEntries(String LeakDataEntries) {
        this.LeakDataEntries = LeakDataEntries;
    }

    /**
     * Get 脱敏状态 
     * @return MaskStatus 脱敏状态
     */
    public String getMaskStatus() {
        return this.MaskStatus;
    }

    /**
     * Set 脱敏状态
     * @param MaskStatus 脱敏状态
     */
    public void setMaskStatus(String MaskStatus) {
        this.MaskStatus = MaskStatus;
    }

    /**
     * Get 最高敏感等级 
     * @return HighestLevel 最高敏感等级
     */
    public String getHighestLevel() {
        return this.HighestLevel;
    }

    /**
     * Set 最高敏感等级
     * @param HighestLevel 最高敏感等级
     */
    public void setHighestLevel(String HighestLevel) {
        this.HighestLevel = HighestLevel;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNDRDataLeakOutAlertDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNDRDataLeakOutAlertDetailResponse(DescribeNDRDataLeakOutAlertDetailResponse source) {
        if (source.RiskID != null) {
            this.RiskID = new String(source.RiskID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.DstIPPort != null) {
            this.DstIPPort = new String(source.DstIPPort);
        }
        if (source.Hostname != null) {
            this.Hostname = new String(source.Hostname);
        }
        if (source.DstServiceType != null) {
            this.DstServiceType = new String(source.DstServiceType);
        }
        if (source.DstServiceName != null) {
            this.DstServiceName = new String(source.DstServiceName);
        }
        if (source.ApiPattern != null) {
            this.ApiPattern = new String(source.ApiPattern);
        }
        if (source.DstGeoLocation != null) {
            this.DstGeoLocation = new String(source.DstGeoLocation);
        }
        if (source.AppProto != null) {
            this.AppProto = new String(source.AppProto);
        }
        if (source.LeakTypeSet != null) {
            this.LeakTypeSet = new String(source.LeakTypeSet);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.LeakDataCount != null) {
            this.LeakDataCount = new Long(source.LeakDataCount);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.FirstIdentificationTime != null) {
            this.FirstIdentificationTime = new String(source.FirstIdentificationTime);
        }
        if (source.LatestIdentificationTime != null) {
            this.LatestIdentificationTime = new String(source.LatestIdentificationTime);
        }
        if (source.AnalysisStatus != null) {
            this.AnalysisStatus = new Long(source.AnalysisStatus);
        }
        if (source.AnalysisFailReason != null) {
            this.AnalysisFailReason = new String(source.AnalysisFailReason);
        }
        if (source.LastAnalysisTime != null) {
            this.LastAnalysisTime = new String(source.LastAnalysisTime);
        }
        if (source.ApiBizType != null) {
            this.ApiBizType = new String(source.ApiBizType);
        }
        if (source.ApiBizDescription != null) {
            this.ApiBizDescription = new String(source.ApiBizDescription);
        }
        if (source.RiskScenario != null) {
            this.RiskScenario = new String(source.RiskScenario);
        }
        if (source.RiskScenarioDetail != null) {
            this.RiskScenarioDetail = new String(source.RiskScenarioDetail);
        }
        if (source.RiskSummary != null) {
            this.RiskSummary = new String(source.RiskSummary);
        }
        if (source.RiskBasis != null) {
            this.RiskBasis = new String(source.RiskBasis);
        }
        if (source.ImpactScope != null) {
            this.ImpactScope = new String(source.ImpactScope);
        }
        if (source.AiSuggestedLevel != null) {
            this.AiSuggestedLevel = new Long(source.AiSuggestedLevel);
        }
        if (source.DisposalSuggestions != null) {
            this.DisposalSuggestions = new DisposalSuggestionItem[source.DisposalSuggestions.length];
            for (int i = 0; i < source.DisposalSuggestions.length; i++) {
                this.DisposalSuggestions[i] = new DisposalSuggestionItem(source.DisposalSuggestions[i]);
            }
        }
        if (source.HttpRequestHeader != null) {
            this.HttpRequestHeader = new String(source.HttpRequestHeader);
        }
        if (source.HttpRequestBody != null) {
            this.HttpRequestBody = new String(source.HttpRequestBody);
        }
        if (source.HttpResponseHeader != null) {
            this.HttpResponseHeader = new String(source.HttpResponseHeader);
        }
        if (source.HttpResponseBody != null) {
            this.HttpResponseBody = new String(source.HttpResponseBody);
        }
        if (source.LeakDataEntries != null) {
            this.LeakDataEntries = new String(source.LeakDataEntries);
        }
        if (source.MaskStatus != null) {
            this.MaskStatus = new String(source.MaskStatus);
        }
        if (source.HighestLevel != null) {
            this.HighestLevel = new String(source.HighestLevel);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "DstIPPort", this.DstIPPort);
        this.setParamSimple(map, prefix + "Hostname", this.Hostname);
        this.setParamSimple(map, prefix + "DstServiceType", this.DstServiceType);
        this.setParamSimple(map, prefix + "DstServiceName", this.DstServiceName);
        this.setParamSimple(map, prefix + "ApiPattern", this.ApiPattern);
        this.setParamSimple(map, prefix + "DstGeoLocation", this.DstGeoLocation);
        this.setParamSimple(map, prefix + "AppProto", this.AppProto);
        this.setParamSimple(map, prefix + "LeakTypeSet", this.LeakTypeSet);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "LeakDataCount", this.LeakDataCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "FirstIdentificationTime", this.FirstIdentificationTime);
        this.setParamSimple(map, prefix + "LatestIdentificationTime", this.LatestIdentificationTime);
        this.setParamSimple(map, prefix + "AnalysisStatus", this.AnalysisStatus);
        this.setParamSimple(map, prefix + "AnalysisFailReason", this.AnalysisFailReason);
        this.setParamSimple(map, prefix + "LastAnalysisTime", this.LastAnalysisTime);
        this.setParamSimple(map, prefix + "ApiBizType", this.ApiBizType);
        this.setParamSimple(map, prefix + "ApiBizDescription", this.ApiBizDescription);
        this.setParamSimple(map, prefix + "RiskScenario", this.RiskScenario);
        this.setParamSimple(map, prefix + "RiskScenarioDetail", this.RiskScenarioDetail);
        this.setParamSimple(map, prefix + "RiskSummary", this.RiskSummary);
        this.setParamSimple(map, prefix + "RiskBasis", this.RiskBasis);
        this.setParamSimple(map, prefix + "ImpactScope", this.ImpactScope);
        this.setParamSimple(map, prefix + "AiSuggestedLevel", this.AiSuggestedLevel);
        this.setParamArrayObj(map, prefix + "DisposalSuggestions.", this.DisposalSuggestions);
        this.setParamSimple(map, prefix + "HttpRequestHeader", this.HttpRequestHeader);
        this.setParamSimple(map, prefix + "HttpRequestBody", this.HttpRequestBody);
        this.setParamSimple(map, prefix + "HttpResponseHeader", this.HttpResponseHeader);
        this.setParamSimple(map, prefix + "HttpResponseBody", this.HttpResponseBody);
        this.setParamSimple(map, prefix + "LeakDataEntries", this.LeakDataEntries);
        this.setParamSimple(map, prefix + "MaskStatus", this.MaskStatus);
        this.setParamSimple(map, prefix + "HighestLevel", this.HighestLevel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

