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

public class ModifyVulScanPeriodicRequest extends AbstractModel {

    /**
    * <p>周期扫描开关（0-关闭, 1-开启）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>漏洞类型</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
    */
    @SerializedName("VulCategory")
    @Expose
    private String [] VulCategory;

    /**
    * <p>漏洞等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String [] Level;

    /**
    * <p>扫描方式（VersionCompare: 版本对比, POC: POC检测, VersionComparePOC: 版本对比+POC检测）</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>开始时间（09:00:00）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间（18:00:00）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>资产范围（0-全部资产，1-自选资产，2-剔除资产，3-自动资产匹配）</p>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>周期扫描类型</p><p>枚举值：</p><ul><li>1： 每天</li><li>2： 每周</li><li>3： 每月</li></ul>
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * <p>扫描超时时长</p><p>单位：秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>周期值</p><p>取值范围：[1, 31]</p><p>单位：周几或者每月几号</p>
    */
    @SerializedName("CycleValue")
    @Expose
    private Long [] CycleValue;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>资产列表（instance_id列表）</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
    * <p>是否运行被同步配置 0-不允许，1-允许</p>
    */
    @SerializedName("AllowSync")
    @Expose
    private Long AllowSync;

    /**
    * <p>管理员账号是否开启了自动同步配置开关 0-关闭，1-开启</p>
    */
    @SerializedName("EnableSync")
    @Expose
    private Long EnableSync;

    /**
    * <p>配置同步给哪些账号appid</p>
    */
    @SerializedName("SyncTo")
    @Expose
    private Long [] SyncTo;

    /**
    * <p>标签ID</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
     * Get <p>周期扫描开关（0-关闭, 1-开启）</p> 
     * @return Status <p>周期扫描开关（0-关闭, 1-开启）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>周期扫描开关（0-关闭, 1-开启）</p>
     * @param Status <p>周期扫描开关（0-关闭, 1-开启）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>漏洞类型</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul> 
     * @return VulCategory <p>漏洞类型</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
     */
    public String [] getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set <p>漏洞类型</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
     * @param VulCategory <p>漏洞类型</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
     */
    public void setVulCategory(String [] VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get <p>漏洞等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul> 
     * @return Level <p>漏洞等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     */
    public String [] getLevel() {
        return this.Level;
    }

    /**
     * Set <p>漏洞等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     * @param Level <p>漏洞等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     */
    public void setLevel(String [] Level) {
        this.Level = Level;
    }

    /**
     * Get <p>扫描方式（VersionCompare: 版本对比, POC: POC检测, VersionComparePOC: 版本对比+POC检测）</p> 
     * @return Method <p>扫描方式（VersionCompare: 版本对比, POC: POC检测, VersionComparePOC: 版本对比+POC检测）</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>扫描方式（VersionCompare: 版本对比, POC: POC检测, VersionComparePOC: 版本对比+POC检测）</p>
     * @param Method <p>扫描方式（VersionCompare: 版本对比, POC: POC检测, VersionComparePOC: 版本对比+POC检测）</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>开始时间（09:00:00）</p> 
     * @return StartTime <p>开始时间（09:00:00）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间（09:00:00）</p>
     * @param StartTime <p>开始时间（09:00:00）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间（18:00:00）</p> 
     * @return EndTime <p>结束时间（18:00:00）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间（18:00:00）</p>
     * @param EndTime <p>结束时间（18:00:00）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>资产范围（0-全部资产，1-自选资产，2-剔除资产，3-自动资产匹配）</p> 
     * @return AssetRange <p>资产范围（0-全部资产，1-自选资产，2-剔除资产，3-自动资产匹配）</p>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>资产范围（0-全部资产，1-自选资产，2-剔除资产，3-自动资产匹配）</p>
     * @param AssetRange <p>资产范围（0-全部资产，1-自选资产，2-剔除资产，3-自动资产匹配）</p>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>周期扫描类型</p><p>枚举值：</p><ul><li>1： 每天</li><li>2： 每周</li><li>3： 每月</li></ul> 
     * @return CycleType <p>周期扫描类型</p><p>枚举值：</p><ul><li>1： 每天</li><li>2： 每周</li><li>3： 每月</li></ul>
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期扫描类型</p><p>枚举值：</p><ul><li>1： 每天</li><li>2： 每周</li><li>3： 每月</li></ul>
     * @param CycleType <p>周期扫描类型</p><p>枚举值：</p><ul><li>1： 每天</li><li>2： 每周</li><li>3： 每月</li></ul>
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>扫描超时时长</p><p>单位：秒</p> 
     * @return Timeout <p>扫描超时时长</p><p>单位：秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>扫描超时时长</p><p>单位：秒</p>
     * @param Timeout <p>扫描超时时长</p><p>单位：秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>周期值</p><p>取值范围：[1, 31]</p><p>单位：周几或者每月几号</p> 
     * @return CycleValue <p>周期值</p><p>取值范围：[1, 31]</p><p>单位：周几或者每月几号</p>
     */
    public Long [] getCycleValue() {
        return this.CycleValue;
    }

    /**
     * Set <p>周期值</p><p>取值范围：[1, 31]</p><p>单位：周几或者每月几号</p>
     * @param CycleValue <p>周期值</p><p>取值范围：[1, 31]</p><p>单位：周几或者每月几号</p>
     */
    public void setCycleValue(Long [] CycleValue) {
        this.CycleValue = CycleValue;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>资产列表（instance_id列表）</p> 
     * @return AssetList <p>资产列表（instance_id列表）</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>资产列表（instance_id列表）</p>
     * @param AssetList <p>资产列表（instance_id列表）</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get <p>是否运行被同步配置 0-不允许，1-允许</p> 
     * @return AllowSync <p>是否运行被同步配置 0-不允许，1-允许</p>
     */
    public Long getAllowSync() {
        return this.AllowSync;
    }

    /**
     * Set <p>是否运行被同步配置 0-不允许，1-允许</p>
     * @param AllowSync <p>是否运行被同步配置 0-不允许，1-允许</p>
     */
    public void setAllowSync(Long AllowSync) {
        this.AllowSync = AllowSync;
    }

    /**
     * Get <p>管理员账号是否开启了自动同步配置开关 0-关闭，1-开启</p> 
     * @return EnableSync <p>管理员账号是否开启了自动同步配置开关 0-关闭，1-开启</p>
     */
    public Long getEnableSync() {
        return this.EnableSync;
    }

    /**
     * Set <p>管理员账号是否开启了自动同步配置开关 0-关闭，1-开启</p>
     * @param EnableSync <p>管理员账号是否开启了自动同步配置开关 0-关闭，1-开启</p>
     */
    public void setEnableSync(Long EnableSync) {
        this.EnableSync = EnableSync;
    }

    /**
     * Get <p>配置同步给哪些账号appid</p> 
     * @return SyncTo <p>配置同步给哪些账号appid</p>
     */
    public Long [] getSyncTo() {
        return this.SyncTo;
    }

    /**
     * Set <p>配置同步给哪些账号appid</p>
     * @param SyncTo <p>配置同步给哪些账号appid</p>
     */
    public void setSyncTo(Long [] SyncTo) {
        this.SyncTo = SyncTo;
    }

    /**
     * Get <p>标签ID</p> 
     * @return TagIds <p>标签ID</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>标签ID</p>
     * @param TagIds <p>标签ID</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    public ModifyVulScanPeriodicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulScanPeriodicRequest(ModifyVulScanPeriodicRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String[source.VulCategory.length];
            for (int i = 0; i < source.VulCategory.length; i++) {
                this.VulCategory[i] = new String(source.VulCategory[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new String(source.Level[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CycleValue != null) {
            this.CycleValue = new Long[source.CycleValue.length];
            for (int i = 0; i < source.CycleValue.length; i++) {
                this.CycleValue[i] = new Long(source.CycleValue[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
        if (source.AllowSync != null) {
            this.AllowSync = new Long(source.AllowSync);
        }
        if (source.EnableSync != null) {
            this.EnableSync = new Long(source.EnableSync);
        }
        if (source.SyncTo != null) {
            this.SyncTo = new Long[source.SyncTo.length];
            for (int i = 0; i < source.SyncTo.length; i++) {
                this.SyncTo[i] = new Long(source.SyncTo[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "VulCategory.", this.VulCategory);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArraySimple(map, prefix + "CycleValue.", this.CycleValue);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);
        this.setParamSimple(map, prefix + "AllowSync", this.AllowSync);
        this.setParamSimple(map, prefix + "EnableSync", this.EnableSync);
        this.setParamArraySimple(map, prefix + "SyncTo.", this.SyncTo);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);

    }
}

