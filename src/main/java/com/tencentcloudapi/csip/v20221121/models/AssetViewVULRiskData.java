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

public class AssetViewVULRiskData extends AbstractModel {

    /**
    * 影响资产
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
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
    * 状态，0未处理、1标记已处置、2已忽略，3已处置 ，4 处置中 ，5 检测中 ，6部分已处置
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 风险ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

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
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 用户uin
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
    * 漏洞影响组件
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 漏洞影响版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 风险点
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
    * pocid
    */
    @SerializedName("POCId")
    @Expose
    private String POCId;

    /**
    * 扫描来源
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
    * 实例uuid
    */
    @SerializedName("InstanceUUID")
    @Expose
    private String InstanceUUID;

    /**
    * 攻击载荷
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 应急漏洞类型，1-应急漏洞，0-非应急漏洞
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
    * CVSS评分
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * 前端索引id
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * pcmgrId
    */
    @SerializedName("PCMGRId")
    @Expose
    private String PCMGRId;

    /**
    * 报告id
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 漏洞标签
    */
    @SerializedName("VulTag")
    @Expose
    private String [] VulTag;

    /**
    * 漏洞披露时间
    */
    @SerializedName("DisclosureTime")
    @Expose
    private String DisclosureTime;

    /**
    * 攻击热度
    */
    @SerializedName("AttackHeat")
    @Expose
    private Long AttackHeat;

    /**
    * 是否必修漏洞1是，0不是
    */
    @SerializedName("IsSuggest")
    @Expose
    private Long IsSuggest;

    /**
    * 处置任务ID
    */
    @SerializedName("HandleTaskId")
    @Expose
    private String HandleTaskId;

    /**
    * 引擎来源
    */
    @SerializedName("EngineSource")
    @Expose
    private String EngineSource;

    /**
    * 新的漏洞风险id(同全网漏洞表的riskid)
    */
    @SerializedName("VulRiskId")
    @Expose
    private String VulRiskId;

    /**
    * 新版漏洞id
    */
    @SerializedName("TvdID")
    @Expose
    private String TvdID;

    /**
    * 是否可以一键体检，1-可以，0-不可以
    */
    @SerializedName("IsOneClick")
    @Expose
    private Long IsOneClick;

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
     * Get 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。 
     * @return Level 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
     * @param Level 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
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
     * Get 状态，0未处理、1标记已处置、2已忽略，3已处置 ，4 处置中 ，5 检测中 ，6部分已处置 
     * @return Status 状态，0未处理、1标记已处置、2已忽略，3已处置 ，4 处置中 ，5 检测中 ，6部分已处置
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0未处理、1标记已处置、2已忽略，3已处置 ，4 处置中 ，5 检测中 ，6部分已处置
     * @param Status 状态，0未处理、1标记已处置、2已忽略，3已处置 ，4 处置中 ，5 检测中 ，6部分已处置
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 风险ID 
     * @return RiskId 风险ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险ID
     * @param RiskId 风险ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
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
     * @return Nick 用户昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 用户昵称
     * @param Nick 用户昵称
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
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
     * Get 漏洞影响组件 
     * @return AppName 漏洞影响组件
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 漏洞影响组件
     * @param AppName 漏洞影响组件
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 漏洞影响版本 
     * @return AppVersion 漏洞影响版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 漏洞影响版本
     * @param AppVersion 漏洞影响版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 风险点 
     * @return VULURL 风险点
     */
    public String getVULURL() {
        return this.VULURL;
    }

    /**
     * Set 风险点
     * @param VULURL 风险点
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
     * Get 扫描来源 
     * @return From 扫描来源
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 扫描来源
     * @param From 扫描来源
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
     * Get 攻击载荷 
     * @return Payload 攻击载荷
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 攻击载荷
     * @param Payload 攻击载荷
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 应急漏洞类型，1-应急漏洞，0-非应急漏洞 
     * @return EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set 应急漏洞类型，1-应急漏洞，0-非应急漏洞
     * @param EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    /**
     * Get CVSS评分 
     * @return CVSS CVSS评分
     */
    public Float getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS评分
     * @param CVSS CVSS评分
     */
    public void setCVSS(Float CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get 前端索引id 
     * @return Index 前端索引id
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 前端索引id
     * @param Index 前端索引id
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get pcmgrId 
     * @return PCMGRId pcmgrId
     */
    public String getPCMGRId() {
        return this.PCMGRId;
    }

    /**
     * Set pcmgrId
     * @param PCMGRId pcmgrId
     */
    public void setPCMGRId(String PCMGRId) {
        this.PCMGRId = PCMGRId;
    }

    /**
     * Get 报告id 
     * @return LogId 报告id
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 报告id
     * @param LogId 报告id
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 漏洞标签 
     * @return VulTag 漏洞标签
     */
    public String [] getVulTag() {
        return this.VulTag;
    }

    /**
     * Set 漏洞标签
     * @param VulTag 漏洞标签
     */
    public void setVulTag(String [] VulTag) {
        this.VulTag = VulTag;
    }

    /**
     * Get 漏洞披露时间 
     * @return DisclosureTime 漏洞披露时间
     */
    public String getDisclosureTime() {
        return this.DisclosureTime;
    }

    /**
     * Set 漏洞披露时间
     * @param DisclosureTime 漏洞披露时间
     */
    public void setDisclosureTime(String DisclosureTime) {
        this.DisclosureTime = DisclosureTime;
    }

    /**
     * Get 攻击热度 
     * @return AttackHeat 攻击热度
     */
    public Long getAttackHeat() {
        return this.AttackHeat;
    }

    /**
     * Set 攻击热度
     * @param AttackHeat 攻击热度
     */
    public void setAttackHeat(Long AttackHeat) {
        this.AttackHeat = AttackHeat;
    }

    /**
     * Get 是否必修漏洞1是，0不是 
     * @return IsSuggest 是否必修漏洞1是，0不是
     */
    public Long getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set 是否必修漏洞1是，0不是
     * @param IsSuggest 是否必修漏洞1是，0不是
     */
    public void setIsSuggest(Long IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get 处置任务ID 
     * @return HandleTaskId 处置任务ID
     */
    public String getHandleTaskId() {
        return this.HandleTaskId;
    }

    /**
     * Set 处置任务ID
     * @param HandleTaskId 处置任务ID
     */
    public void setHandleTaskId(String HandleTaskId) {
        this.HandleTaskId = HandleTaskId;
    }

    /**
     * Get 引擎来源 
     * @return EngineSource 引擎来源
     */
    public String getEngineSource() {
        return this.EngineSource;
    }

    /**
     * Set 引擎来源
     * @param EngineSource 引擎来源
     */
    public void setEngineSource(String EngineSource) {
        this.EngineSource = EngineSource;
    }

    /**
     * Get 新的漏洞风险id(同全网漏洞表的riskid) 
     * @return VulRiskId 新的漏洞风险id(同全网漏洞表的riskid)
     */
    public String getVulRiskId() {
        return this.VulRiskId;
    }

    /**
     * Set 新的漏洞风险id(同全网漏洞表的riskid)
     * @param VulRiskId 新的漏洞风险id(同全网漏洞表的riskid)
     */
    public void setVulRiskId(String VulRiskId) {
        this.VulRiskId = VulRiskId;
    }

    /**
     * Get 新版漏洞id 
     * @return TvdID 新版漏洞id
     */
    public String getTvdID() {
        return this.TvdID;
    }

    /**
     * Set 新版漏洞id
     * @param TvdID 新版漏洞id
     */
    public void setTvdID(String TvdID) {
        this.TvdID = TvdID;
    }

    /**
     * Get 是否可以一键体检，1-可以，0-不可以 
     * @return IsOneClick 是否可以一键体检，1-可以，0-不可以
     */
    public Long getIsOneClick() {
        return this.IsOneClick;
    }

    /**
     * Set 是否可以一键体检，1-可以，0-不可以
     * @param IsOneClick 是否可以一键体检，1-可以，0-不可以
     */
    public void setIsOneClick(Long IsOneClick) {
        this.IsOneClick = IsOneClick;
    }

    public AssetViewVULRiskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetViewVULRiskData(AssetViewVULRiskData source) {
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
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
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
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
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
        if (source.POCId != null) {
            this.POCId = new String(source.POCId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CWPVersion != null) {
            this.CWPVersion = new Long(source.CWPVersion);
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
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.PCMGRId != null) {
            this.PCMGRId = new String(source.PCMGRId);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VulTag != null) {
            this.VulTag = new String[source.VulTag.length];
            for (int i = 0; i < source.VulTag.length; i++) {
                this.VulTag[i] = new String(source.VulTag[i]);
            }
        }
        if (source.DisclosureTime != null) {
            this.DisclosureTime = new String(source.DisclosureTime);
        }
        if (source.AttackHeat != null) {
            this.AttackHeat = new Long(source.AttackHeat);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new Long(source.IsSuggest);
        }
        if (source.HandleTaskId != null) {
            this.HandleTaskId = new String(source.HandleTaskId);
        }
        if (source.EngineSource != null) {
            this.EngineSource = new String(source.EngineSource);
        }
        if (source.VulRiskId != null) {
            this.VulRiskId = new String(source.VulRiskId);
        }
        if (source.TvdID != null) {
            this.TvdID = new String(source.TvdID);
        }
        if (source.IsOneClick != null) {
            this.IsOneClick = new Long(source.IsOneClick);
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
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "POCId", this.POCId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CWPVersion", this.CWPVersion);
        this.setParamSimple(map, prefix + "InstanceUUID", this.InstanceUUID);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "PCMGRId", this.PCMGRId);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "VulTag.", this.VulTag);
        this.setParamSimple(map, prefix + "DisclosureTime", this.DisclosureTime);
        this.setParamSimple(map, prefix + "AttackHeat", this.AttackHeat);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "HandleTaskId", this.HandleTaskId);
        this.setParamSimple(map, prefix + "EngineSource", this.EngineSource);
        this.setParamSimple(map, prefix + "VulRiskId", this.VulRiskId);
        this.setParamSimple(map, prefix + "TvdID", this.TvdID);
        this.setParamSimple(map, prefix + "IsOneClick", this.IsOneClick);

    }
}

