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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetViewVULRisk extends AbstractModel{

    /**
    * 影响资产
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 资产类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

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
    * 前端索引
    */
    @SerializedName("Index")
    @Expose
    private String Index;

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
    * 漏洞类型
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 描述
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 版本名
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 相关信息
    */
    @SerializedName("References")
    @Expose
    private String References;

    /**
    * 版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 漏洞url
    */
    @SerializedName("VULURL")
    @Expose
    private String VULURL;

    /**
    * 漏洞名称
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * cve
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * 修复建议
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * pocid
    */
    @SerializedName("POCId")
    @Expose
    private String POCId;

    /**
    * 来源
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 主机版本
    */
    @SerializedName("CWPVersion")
    @Expose
    private Long CWPVersion;

    /**
    * 是否支持修复
    */
    @SerializedName("IsSupportRepair")
    @Expose
    private Boolean IsSupportRepair;

    /**
    * 是否支持扫描
    */
    @SerializedName("IsSupportDetect")
    @Expose
    private Boolean IsSupportDetect;

    /**
    * 实例uuid
    */
    @SerializedName("InstanceUUID")
    @Expose
    private String InstanceUUID;

    /**
    * 负载
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

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
     * Get 前端索引 
     * @return Index 前端索引
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 前端索引
     * @param Index 前端索引
     */
    public void setIndex(String Index) {
        this.Index = Index;
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
     * Get 漏洞类型 
     * @return VULType 漏洞类型
     */
    public String getVULType() {
        return this.VULType;
    }

    /**
     * Set 漏洞类型
     * @param VULType 漏洞类型
     */
    public void setVULType(String VULType) {
        this.VULType = VULType;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 描述 
     * @return Describe 描述
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 描述
     * @param Describe 描述
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 版本名 
     * @return AppName 版本名
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 版本名
     * @param AppName 版本名
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 相关信息 
     * @return References 相关信息
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set 相关信息
     * @param References 相关信息
     */
    public void setReferences(String References) {
        this.References = References;
    }

    /**
     * Get 版本 
     * @return AppVersion 版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 版本
     * @param AppVersion 版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 漏洞url 
     * @return VULURL 漏洞url
     */
    public String getVULURL() {
        return this.VULURL;
    }

    /**
     * Set 漏洞url
     * @param VULURL 漏洞url
     */
    public void setVULURL(String VULURL) {
        this.VULURL = VULURL;
    }

    /**
     * Get 漏洞名称 
     * @return VULName 漏洞名称
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set 漏洞名称
     * @param VULName 漏洞名称
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get cve 
     * @return CVE cve
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set cve
     * @param CVE cve
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get 修复建议 
     * @return Fix 修复建议
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 修复建议
     * @param Fix 修复建议
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get pocid 
     * @return POCId pocid
     */
    public String getPOCId() {
        return this.POCId;
    }

    /**
     * Set pocid
     * @param POCId pocid
     */
    public void setPOCId(String POCId) {
        this.POCId = POCId;
    }

    /**
     * Get 来源 
     * @return From 来源
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 来源
     * @param From 来源
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 主机版本 
     * @return CWPVersion 主机版本
     */
    public Long getCWPVersion() {
        return this.CWPVersion;
    }

    /**
     * Set 主机版本
     * @param CWPVersion 主机版本
     */
    public void setCWPVersion(Long CWPVersion) {
        this.CWPVersion = CWPVersion;
    }

    /**
     * Get 是否支持修复 
     * @return IsSupportRepair 是否支持修复
     */
    public Boolean getIsSupportRepair() {
        return this.IsSupportRepair;
    }

    /**
     * Set 是否支持修复
     * @param IsSupportRepair 是否支持修复
     */
    public void setIsSupportRepair(Boolean IsSupportRepair) {
        this.IsSupportRepair = IsSupportRepair;
    }

    /**
     * Get 是否支持扫描 
     * @return IsSupportDetect 是否支持扫描
     */
    public Boolean getIsSupportDetect() {
        return this.IsSupportDetect;
    }

    /**
     * Set 是否支持扫描
     * @param IsSupportDetect 是否支持扫描
     */
    public void setIsSupportDetect(Boolean IsSupportDetect) {
        this.IsSupportDetect = IsSupportDetect;
    }

    /**
     * Get 实例uuid 
     * @return InstanceUUID 实例uuid
     */
    public String getInstanceUUID() {
        return this.InstanceUUID;
    }

    /**
     * Set 实例uuid
     * @param InstanceUUID 实例uuid
     */
    public void setInstanceUUID(String InstanceUUID) {
        this.InstanceUUID = InstanceUUID;
    }

    /**
     * Get 负载 
     * @return Payload 负载
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 负载
     * @param Payload 负载
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     * @param EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    public AssetViewVULRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetViewVULRisk(AssetViewVULRisk source) {
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.References != null) {
            this.References = new String(source.References);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.VULURL != null) {
            this.VULURL = new String(source.VULURL);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.POCId != null) {
            this.POCId = new String(source.POCId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CWPVersion != null) {
            this.CWPVersion = new Long(source.CWPVersion);
        }
        if (source.IsSupportRepair != null) {
            this.IsSupportRepair = new Boolean(source.IsSupportRepair);
        }
        if (source.IsSupportDetect != null) {
            this.IsSupportDetect = new Boolean(source.IsSupportDetect);
        }
        if (source.InstanceUUID != null) {
            this.InstanceUUID = new String(source.InstanceUUID);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "POCId", this.POCId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CWPVersion", this.CWPVersion);
        this.setParamSimple(map, prefix + "IsSupportRepair", this.IsSupportRepair);
        this.setParamSimple(map, prefix + "IsSupportDetect", this.IsSupportDetect);
        this.setParamSimple(map, prefix + "InstanceUUID", this.InstanceUUID);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);

    }
}

