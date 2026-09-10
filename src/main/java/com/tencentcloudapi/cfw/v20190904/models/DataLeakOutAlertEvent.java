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

public class DataLeakOutAlertEvent extends AbstractModel {

    /**
    * 风险ID
    */
    @SerializedName("RiskID")
    @Expose
    private String RiskID;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 地域
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
    * 目的IP端口，多个以逗号连接：1.1.1.1:80,1.1.1.1:8080
    */
    @SerializedName("DstIPPort")
    @Expose
    private String DstIPPort;

    /**
    * hostname
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
    * 以逗号连接的敏感类型ID集合: 10001,10002,10003
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
    * 风险等级
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
    * 备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * API
    */
    @SerializedName("ApiPattern")
    @Expose
    private String ApiPattern;

    /**
    * AI分析状态
    */
    @SerializedName("AnalysisStatus")
    @Expose
    private Long AnalysisStatus;

    /**
    * AI分析失败原因（失败时）
    */
    @SerializedName("AnalysisFailReason")
    @Expose
    private String AnalysisFailReason;

    /**
    * API业务类型
    */
    @SerializedName("ApiBizType")
    @Expose
    private String ApiBizType;

    /**
    * 风险类型（风险场景）
    */
    @SerializedName("RiskScenario")
    @Expose
    private String RiskScenario;

    /**
    * AI建议风险等级
    */
    @SerializedName("AiSuggestedLevel")
    @Expose
    private Long AiSuggestedLevel;

    /**
    * 目的IP地理信息
    */
    @SerializedName("DstGeoLocation")
    @Expose
    private String DstGeoLocation;

    /**
    * 最高敏感等级
    */
    @SerializedName("HighestLevel")
    @Expose
    private String HighestLevel;

    /**
     * Get 风险ID 
     * @return RiskID 风险ID
     */
    public String getRiskID() {
        return this.RiskID;
    }

    /**
     * Set 风险ID
     * @param RiskID 风险ID
     */
    public void setRiskID(String RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
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
     * Get 目的IP端口，多个以逗号连接：1.1.1.1:80,1.1.1.1:8080 
     * @return DstIPPort 目的IP端口，多个以逗号连接：1.1.1.1:80,1.1.1.1:8080
     */
    public String getDstIPPort() {
        return this.DstIPPort;
    }

    /**
     * Set 目的IP端口，多个以逗号连接：1.1.1.1:80,1.1.1.1:8080
     * @param DstIPPort 目的IP端口，多个以逗号连接：1.1.1.1:80,1.1.1.1:8080
     */
    public void setDstIPPort(String DstIPPort) {
        this.DstIPPort = DstIPPort;
    }

    /**
     * Get hostname 
     * @return Hostname hostname
     */
    public String getHostname() {
        return this.Hostname;
    }

    /**
     * Set hostname
     * @param Hostname hostname
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
     * Get 以逗号连接的敏感类型ID集合: 10001,10002,10003 
     * @return LeakTypeSet 以逗号连接的敏感类型ID集合: 10001,10002,10003
     */
    public String getLeakTypeSet() {
        return this.LeakTypeSet;
    }

    /**
     * Set 以逗号连接的敏感类型ID集合: 10001,10002,10003
     * @param LeakTypeSet 以逗号连接的敏感类型ID集合: 10001,10002,10003
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
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
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
     * Get 备注 
     * @return Comment 备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
     * @param Comment 备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get API 
     * @return ApiPattern API
     */
    public String getApiPattern() {
        return this.ApiPattern;
    }

    /**
     * Set API
     * @param ApiPattern API
     */
    public void setApiPattern(String ApiPattern) {
        this.ApiPattern = ApiPattern;
    }

    /**
     * Get AI分析状态 
     * @return AnalysisStatus AI分析状态
     */
    public Long getAnalysisStatus() {
        return this.AnalysisStatus;
    }

    /**
     * Set AI分析状态
     * @param AnalysisStatus AI分析状态
     */
    public void setAnalysisStatus(Long AnalysisStatus) {
        this.AnalysisStatus = AnalysisStatus;
    }

    /**
     * Get AI分析失败原因（失败时） 
     * @return AnalysisFailReason AI分析失败原因（失败时）
     */
    public String getAnalysisFailReason() {
        return this.AnalysisFailReason;
    }

    /**
     * Set AI分析失败原因（失败时）
     * @param AnalysisFailReason AI分析失败原因（失败时）
     */
    public void setAnalysisFailReason(String AnalysisFailReason) {
        this.AnalysisFailReason = AnalysisFailReason;
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
     * Get 风险类型（风险场景） 
     * @return RiskScenario 风险类型（风险场景）
     */
    public String getRiskScenario() {
        return this.RiskScenario;
    }

    /**
     * Set 风险类型（风险场景）
     * @param RiskScenario 风险类型（风险场景）
     */
    public void setRiskScenario(String RiskScenario) {
        this.RiskScenario = RiskScenario;
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

    public DataLeakOutAlertEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataLeakOutAlertEvent(DataLeakOutAlertEvent source) {
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
        if (source.LeakTypeSet != null) {
            this.LeakTypeSet = new String(source.LeakTypeSet);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.FirstIdentificationTime != null) {
            this.FirstIdentificationTime = new String(source.FirstIdentificationTime);
        }
        if (source.LatestIdentificationTime != null) {
            this.LatestIdentificationTime = new String(source.LatestIdentificationTime);
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
        if (source.ApiPattern != null) {
            this.ApiPattern = new String(source.ApiPattern);
        }
        if (source.AnalysisStatus != null) {
            this.AnalysisStatus = new Long(source.AnalysisStatus);
        }
        if (source.AnalysisFailReason != null) {
            this.AnalysisFailReason = new String(source.AnalysisFailReason);
        }
        if (source.ApiBizType != null) {
            this.ApiBizType = new String(source.ApiBizType);
        }
        if (source.RiskScenario != null) {
            this.RiskScenario = new String(source.RiskScenario);
        }
        if (source.AiSuggestedLevel != null) {
            this.AiSuggestedLevel = new Long(source.AiSuggestedLevel);
        }
        if (source.DstGeoLocation != null) {
            this.DstGeoLocation = new String(source.DstGeoLocation);
        }
        if (source.HighestLevel != null) {
            this.HighestLevel = new String(source.HighestLevel);
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
        this.setParamSimple(map, prefix + "LeakTypeSet", this.LeakTypeSet);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "FirstIdentificationTime", this.FirstIdentificationTime);
        this.setParamSimple(map, prefix + "LatestIdentificationTime", this.LatestIdentificationTime);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ApiPattern", this.ApiPattern);
        this.setParamSimple(map, prefix + "AnalysisStatus", this.AnalysisStatus);
        this.setParamSimple(map, prefix + "AnalysisFailReason", this.AnalysisFailReason);
        this.setParamSimple(map, prefix + "ApiBizType", this.ApiBizType);
        this.setParamSimple(map, prefix + "RiskScenario", this.RiskScenario);
        this.setParamSimple(map, prefix + "AiSuggestedLevel", this.AiSuggestedLevel);
        this.setParamSimple(map, prefix + "DstGeoLocation", this.DstGeoLocation);
        this.setParamSimple(map, prefix + "HighestLevel", this.HighestLevel);

    }
}

