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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostVulRiskEventItem extends AbstractModel {

    /**
    * 漏洞风险记录唯一标识
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 风险记录 ID
    */
    @SerializedName("RiskID")
    @Expose
    private Long RiskID;

    /**
    * 漏洞 ID
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * CVE 编号
参数格式：形如 CVE-2024-12345
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 漏洞危害等级
枚举值：
UNKNOWN：无效
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * VPR 修复优先级
枚举值：
DEFERRABLE：可暂缓修复
PLANNED：计划修复
SOON：尽快修复
URGENT：紧急修复
    */
    @SerializedName("VPRLevel")
    @Expose
    private String VPRLevel;

    /**
    * 检测方式
枚举值：
VersionCompare：版本比对
POC：POC 检测
VersionComparePOC：版本比对 + POC
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * 风险状态
枚举值：
PENDING：待处理
HANDLED：已处置
FIXED：已修复
SCANNING：重新检测中
IGNORED：已忽略
NOT_REQUIRED：无需处理
DELETED：已删除
FIXING：修复中
NEED_REBOOT：已修复待重启
FIX_FAILED：修复失败
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * 是否支持一键修复
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * 云主机实例 ID
参数格式：形如 ins-xxxxxxxx
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 所属账号 AppID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
     * Get 漏洞风险记录唯一标识 
     * @return UUID 漏洞风险记录唯一标识
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 漏洞风险记录唯一标识
     * @param UUID 漏洞风险记录唯一标识
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 风险记录 ID 
     * @return RiskID 风险记录 ID
     */
    public Long getRiskID() {
        return this.RiskID;
    }

    /**
     * Set 风险记录 ID
     * @param RiskID 风险记录 ID
     */
    public void setRiskID(Long RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get 漏洞 ID 
     * @return VulID 漏洞 ID
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set 漏洞 ID
     * @param VulID 漏洞 ID
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
    }

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get CVE 编号
参数格式：形如 CVE-2024-12345 
     * @return CVEID CVE 编号
参数格式：形如 CVE-2024-12345
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set CVE 编号
参数格式：形如 CVE-2024-12345
     * @param CVEID CVE 编号
参数格式：形如 CVE-2024-12345
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞 
     * @return Category 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     * @param Category 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 漏洞危害等级
枚举值：
UNKNOWN：无效
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重 
     * @return Level 漏洞危害等级
枚举值：
UNKNOWN：无效
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞危害等级
枚举值：
UNKNOWN：无效
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     * @param Level 漏洞危害等级
枚举值：
UNKNOWN：无效
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get VPR 修复优先级
枚举值：
DEFERRABLE：可暂缓修复
PLANNED：计划修复
SOON：尽快修复
URGENT：紧急修复 
     * @return VPRLevel VPR 修复优先级
枚举值：
DEFERRABLE：可暂缓修复
PLANNED：计划修复
SOON：尽快修复
URGENT：紧急修复
     */
    public String getVPRLevel() {
        return this.VPRLevel;
    }

    /**
     * Set VPR 修复优先级
枚举值：
DEFERRABLE：可暂缓修复
PLANNED：计划修复
SOON：尽快修复
URGENT：紧急修复
     * @param VPRLevel VPR 修复优先级
枚举值：
DEFERRABLE：可暂缓修复
PLANNED：计划修复
SOON：尽快修复
URGENT：紧急修复
     */
    public void setVPRLevel(String VPRLevel) {
        this.VPRLevel = VPRLevel;
    }

    /**
     * Get 检测方式
枚举值：
VersionCompare：版本比对
POC：POC 检测
VersionComparePOC：版本比对 + POC 
     * @return CheckMethod 检测方式
枚举值：
VersionCompare：版本比对
POC：POC 检测
VersionComparePOC：版本比对 + POC
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set 检测方式
枚举值：
VersionCompare：版本比对
POC：POC 检测
VersionComparePOC：版本比对 + POC
     * @param CheckMethod 检测方式
枚举值：
VersionCompare：版本比对
POC：POC 检测
VersionComparePOC：版本比对 + POC
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get 风险状态
枚举值：
PENDING：待处理
HANDLED：已处置
FIXED：已修复
SCANNING：重新检测中
IGNORED：已忽略
NOT_REQUIRED：无需处理
DELETED：已删除
FIXING：修复中
NEED_REBOOT：已修复待重启
FIX_FAILED：修复失败 
     * @return RiskStatus 风险状态
枚举值：
PENDING：待处理
HANDLED：已处置
FIXED：已修复
SCANNING：重新检测中
IGNORED：已忽略
NOT_REQUIRED：无需处理
DELETED：已删除
FIXING：修复中
NEED_REBOOT：已修复待重启
FIX_FAILED：修复失败
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set 风险状态
枚举值：
PENDING：待处理
HANDLED：已处置
FIXED：已修复
SCANNING：重新检测中
IGNORED：已忽略
NOT_REQUIRED：无需处理
DELETED：已删除
FIXING：修复中
NEED_REBOOT：已修复待重启
FIX_FAILED：修复失败
     * @param RiskStatus 风险状态
枚举值：
PENDING：待处理
HANDLED：已处置
FIXED：已修复
SCANNING：重新检测中
IGNORED：已忽略
NOT_REQUIRED：无需处理
DELETED：已删除
FIXING：修复中
NEED_REBOOT：已修复待重启
FIX_FAILED：修复失败
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get 是否支持一键修复 
     * @return SupportFix 是否支持一键修复
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set 是否支持一键修复
     * @param SupportFix 是否支持一键修复
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return LatestScanTime 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param LatestScanTime 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get 云主机实例 ID
参数格式：形如 ins-xxxxxxxx 
     * @return InstanceID 云主机实例 ID
参数格式：形如 ins-xxxxxxxx
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 云主机实例 ID
参数格式：形如 ins-xxxxxxxx
     * @param InstanceID 云主机实例 ID
参数格式：形如 ins-xxxxxxxx
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 所属账号 AppID 
     * @return AppID 所属账号 AppID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 所属账号 AppID
     * @param AppID 所属账号 AppID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    public HostVulRiskEventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulRiskEventItem(HostVulRiskEventItem source) {
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.RiskID != null) {
            this.RiskID = new Long(source.RiskID);
        }
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.VPRLevel != null) {
            this.VPRLevel = new String(source.VPRLevel);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Boolean(source.SupportFix);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "VPRLevel", this.VPRLevel);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);

    }
}

