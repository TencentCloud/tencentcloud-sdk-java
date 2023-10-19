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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerRisk extends AbstractModel {

    /**
    * 测绘标签
    */
    @SerializedName("ServiceTag")
    @Expose
    private String ServiceTag;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 影响资产
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 资产类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 组件
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 服务
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 最近识别时间
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * 首次识别时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 风险详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskDetails")
    @Expose
    private String RiskDetails;

    /**
    * 处置建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 状态，0未处理、1已处置、2已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资产唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 服务快照
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceSnapshot")
    @Expose
    private String ServiceSnapshot;

    /**
    * 服务访问的url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 列表索引值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 风险列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskList")
    @Expose
    private ServerRiskSuggestion [] RiskList;

    /**
    * 建议列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuggestionList")
    @Expose
    private ServerRiskSuggestion [] SuggestionList;

    /**
    * HTTP响应状态码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
     * Get 测绘标签 
     * @return ServiceTag 测绘标签
     */
    public String getServiceTag() {
        return this.ServiceTag;
    }

    /**
     * Set 测绘标签
     * @param ServiceTag 测绘标签
     */
    public void setServiceTag(String ServiceTag) {
        this.ServiceTag = ServiceTag;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 影响资产 
     * @return AffectAsset 影响资产
     */
    public String getAffectAsset() {
        return this.AffectAsset;
    }

    /**
     * Set 影响资产
     * @param AffectAsset 影响资产
     */
    public void setAffectAsset(String AffectAsset) {
        this.AffectAsset = AffectAsset;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 资产类型 
     * @return InstanceType 资产类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 资产类型
     * @param InstanceType 资产类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 组件 
     * @return Component 组件
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件
     * @param Component 组件
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 服务 
     * @return Service 服务
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务
     * @param Service 服务
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 最近识别时间 
     * @return RecentTime 最近识别时间
     */
    public String getRecentTime() {
        return this.RecentTime;
    }

    /**
     * Set 最近识别时间
     * @param RecentTime 最近识别时间
     */
    public void setRecentTime(String RecentTime) {
        this.RecentTime = RecentTime;
    }

    /**
     * Get 首次识别时间 
     * @return FirstTime 首次识别时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次识别时间
     * @param FirstTime 首次识别时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 风险详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskDetails 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskDetails 风险详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskDetails(String RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get 处置建议 
     * @return Suggestion 处置建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 处置建议
     * @param Suggestion 处置建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 状态，0未处理、1已处置、2已忽略 
     * @return Status 状态，0未处理、1已处置、2已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0未处理、1已处置、2已忽略
     * @param Status 状态，0未处理、1已处置、2已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资产唯一id 
     * @return Id 资产唯一id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资产唯一id
     * @param Id 资产唯一id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 服务快照
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceSnapshot 服务快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceSnapshot() {
        return this.ServiceSnapshot;
    }

    /**
     * Set 服务快照
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceSnapshot 服务快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceSnapshot(String ServiceSnapshot) {
        this.ServiceSnapshot = ServiceSnapshot;
    }

    /**
     * Get 服务访问的url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 服务访问的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 服务访问的url
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 服务访问的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 列表索引值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 列表索引值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 列表索引值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 列表索引值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 风险列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskList 风险列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerRiskSuggestion [] getRiskList() {
        return this.RiskList;
    }

    /**
     * Set 风险列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskList 风险列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskList(ServerRiskSuggestion [] RiskList) {
        this.RiskList = RiskList;
    }

    /**
     * Get 建议列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuggestionList 建议列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerRiskSuggestion [] getSuggestionList() {
        return this.SuggestionList;
    }

    /**
     * Set 建议列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuggestionList 建议列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestionList(ServerRiskSuggestion [] SuggestionList) {
        this.SuggestionList = SuggestionList;
    }

    /**
     * Get HTTP响应状态码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCode HTTP响应状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set HTTP响应状态码
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCode HTTP响应状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    public ServerRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerRisk(ServerRisk source) {
        if (source.ServiceTag != null) {
            this.ServiceTag = new String(source.ServiceTag);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
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
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.RiskDetails != null) {
            this.RiskDetails = new String(source.RiskDetails);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ServiceSnapshot != null) {
            this.ServiceSnapshot = new String(source.ServiceSnapshot);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.RiskList != null) {
            this.RiskList = new ServerRiskSuggestion[source.RiskList.length];
            for (int i = 0; i < source.RiskList.length; i++) {
                this.RiskList[i] = new ServerRiskSuggestion(source.RiskList[i]);
            }
        }
        if (source.SuggestionList != null) {
            this.SuggestionList = new ServerRiskSuggestion[source.SuggestionList.length];
            for (int i = 0; i < source.SuggestionList.length; i++) {
                this.SuggestionList[i] = new ServerRiskSuggestion(source.SuggestionList[i]);
            }
        }
        if (source.StatusCode != null) {
            this.StatusCode = new String(source.StatusCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTag", this.ServiceTag);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "RiskDetails", this.RiskDetails);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ServiceSnapshot", this.ServiceSnapshot);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamArrayObj(map, prefix + "RiskList.", this.RiskList);
        this.setParamArrayObj(map, prefix + "SuggestionList.", this.SuggestionList);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);

    }
}

