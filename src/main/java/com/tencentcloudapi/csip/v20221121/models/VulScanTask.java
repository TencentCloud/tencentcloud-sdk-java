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

public class VulScanTask extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>任务id</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>任务所属用户appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>任务类型</p><p>枚举值：</p><ul><li>0： 一键扫描</li><li>1： 周期扫描</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>漏洞分类</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
    */
    @SerializedName("VulCategory")
    @Expose
    private String [] VulCategory;

    /**
    * <p>漏洞名称</p>
    */
    @SerializedName("VulName")
    @Expose
    private String [] VulName;

    /**
    * <p>kb名称</p>
    */
    @SerializedName("KbName")
    @Expose
    private String [] KbName;

    /**
    * <p>是否应急漏洞</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
    */
    @SerializedName("Emergency")
    @Expose
    private Long Emergency;

    /**
    * <p>扫描账号数量（0: 全部账号, others: 账号数量）</p>
    */
    @SerializedName("Account")
    @Expose
    private Long Account;

    /**
    * <p>扫描开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>扫描结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>扫描状态（INITIALIZING: 初始化, SCANNING: 扫描中, SUCCESS: 扫描成功,  TOTAL_FAIL: 全部扫描失败）</p><p>枚举值：</p><ul><li>STOPPED： 已停止</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>漏洞威胁等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String [] Level;

    /**
    * <p>扫描方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li><li>VersionComparePOC： 版本对比+POC检测</li></ul>
    */
    @SerializedName("Method")
    @Expose
    private String [] Method;

    /**
    * <p>资产列表</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
    * <p>资产范围</p><p>枚举值：</p><ul><li>0： 所有资产</li><li>1： 自选资产</li><li>2： 自选排除资产</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
     * Get <p>任务id</p> 
     * @return Id <p>任务id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>任务id</p>
     * @param Id <p>任务id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>任务id</p> 
     * @return JobId <p>任务id</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务id</p>
     * @param JobId <p>任务id</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>任务所属用户appid</p> 
     * @return AppId <p>任务所属用户appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>任务所属用户appid</p>
     * @param AppId <p>任务所属用户appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>任务类型</p><p>枚举值：</p><ul><li>0： 一键扫描</li><li>1： 周期扫描</li></ul> 
     * @return TaskType <p>任务类型</p><p>枚举值：</p><ul><li>0： 一键扫描</li><li>1： 周期扫描</li></ul>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p><p>枚举值：</p><ul><li>0： 一键扫描</li><li>1： 周期扫描</li></ul>
     * @param TaskType <p>任务类型</p><p>枚举值：</p><ul><li>0： 一键扫描</li><li>1： 周期扫描</li></ul>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>漏洞分类</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul> 
     * @return VulCategory <p>漏洞分类</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
     */
    public String [] getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set <p>漏洞分类</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
     * @param VulCategory <p>漏洞分类</p><p>枚举值：</p><ul><li>LINUX： Linux软件漏洞</li><li>WINDOWS： Windows系统补丁</li><li>WEB_CMS： Web-CMS漏洞</li><li>APPLICATION： 应用漏洞</li><li>EMERGENCY： 应急漏洞</li></ul>
     */
    public void setVulCategory(String [] VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get <p>漏洞名称</p> 
     * @return VulName <p>漏洞名称</p>
     */
    public String [] getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>漏洞名称</p>
     * @param VulName <p>漏洞名称</p>
     */
    public void setVulName(String [] VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>kb名称</p> 
     * @return KbName <p>kb名称</p>
     */
    public String [] getKbName() {
        return this.KbName;
    }

    /**
     * Set <p>kb名称</p>
     * @param KbName <p>kb名称</p>
     */
    public void setKbName(String [] KbName) {
        this.KbName = KbName;
    }

    /**
     * Get <p>是否应急漏洞</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul> 
     * @return Emergency <p>是否应急漏洞</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public Long getEmergency() {
        return this.Emergency;
    }

    /**
     * Set <p>是否应急漏洞</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     * @param Emergency <p>是否应急漏洞</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public void setEmergency(Long Emergency) {
        this.Emergency = Emergency;
    }

    /**
     * Get <p>扫描账号数量（0: 全部账号, others: 账号数量）</p> 
     * @return Account <p>扫描账号数量（0: 全部账号, others: 账号数量）</p>
     */
    public Long getAccount() {
        return this.Account;
    }

    /**
     * Set <p>扫描账号数量（0: 全部账号, others: 账号数量）</p>
     * @param Account <p>扫描账号数量（0: 全部账号, others: 账号数量）</p>
     */
    public void setAccount(Long Account) {
        this.Account = Account;
    }

    /**
     * Get <p>扫描开始时间</p> 
     * @return StartTime <p>扫描开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>扫描开始时间</p>
     * @param StartTime <p>扫描开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>扫描结束时间</p> 
     * @return EndTime <p>扫描结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>扫描结束时间</p>
     * @param EndTime <p>扫描结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>扫描状态（INITIALIZING: 初始化, SCANNING: 扫描中, SUCCESS: 扫描成功,  TOTAL_FAIL: 全部扫描失败）</p><p>枚举值：</p><ul><li>STOPPED： 已停止</li></ul> 
     * @return Status <p>扫描状态（INITIALIZING: 初始化, SCANNING: 扫描中, SUCCESS: 扫描成功,  TOTAL_FAIL: 全部扫描失败）</p><p>枚举值：</p><ul><li>STOPPED： 已停止</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>扫描状态（INITIALIZING: 初始化, SCANNING: 扫描中, SUCCESS: 扫描成功,  TOTAL_FAIL: 全部扫描失败）</p><p>枚举值：</p><ul><li>STOPPED： 已停止</li></ul>
     * @param Status <p>扫描状态（INITIALIZING: 初始化, SCANNING: 扫描中, SUCCESS: 扫描成功,  TOTAL_FAIL: 全部扫描失败）</p><p>枚举值：</p><ul><li>STOPPED： 已停止</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>漏洞威胁等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul> 
     * @return Level <p>漏洞威胁等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     */
    public String [] getLevel() {
        return this.Level;
    }

    /**
     * Set <p>漏洞威胁等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     * @param Level <p>漏洞威胁等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     */
    public void setLevel(String [] Level) {
        this.Level = Level;
    }

    /**
     * Get <p>扫描方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li><li>VersionComparePOC： 版本对比+POC检测</li></ul> 
     * @return Method <p>扫描方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li><li>VersionComparePOC： 版本对比+POC检测</li></ul>
     */
    public String [] getMethod() {
        return this.Method;
    }

    /**
     * Set <p>扫描方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li><li>VersionComparePOC： 版本对比+POC检测</li></ul>
     * @param Method <p>扫描方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li><li>VersionComparePOC： 版本对比+POC检测</li></ul>
     */
    public void setMethod(String [] Method) {
        this.Method = Method;
    }

    /**
     * Get <p>资产列表</p> 
     * @return AssetList <p>资产列表</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>资产列表</p>
     * @param AssetList <p>资产列表</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get <p>资产范围</p><p>枚举值：</p><ul><li>0： 所有资产</li><li>1： 自选资产</li><li>2： 自选排除资产</li></ul> 
     * @return AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 所有资产</li><li>1： 自选资产</li><li>2： 自选排除资产</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>资产范围</p><p>枚举值：</p><ul><li>0： 所有资产</li><li>1： 自选资产</li><li>2： 自选排除资产</li></ul>
     * @param AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 所有资产</li><li>1： 自选资产</li><li>2： 自选排除资产</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    public VulScanTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulScanTask(VulScanTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String[source.VulCategory.length];
            for (int i = 0; i < source.VulCategory.length; i++) {
                this.VulCategory[i] = new String(source.VulCategory[i]);
            }
        }
        if (source.VulName != null) {
            this.VulName = new String[source.VulName.length];
            for (int i = 0; i < source.VulName.length; i++) {
                this.VulName[i] = new String(source.VulName[i]);
            }
        }
        if (source.KbName != null) {
            this.KbName = new String[source.KbName.length];
            for (int i = 0; i < source.KbName.length; i++) {
                this.KbName[i] = new String(source.KbName[i]);
            }
        }
        if (source.Emergency != null) {
            this.Emergency = new Long(source.Emergency);
        }
        if (source.Account != null) {
            this.Account = new Long(source.Account);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Level != null) {
            this.Level = new String[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new String(source.Level[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String[source.Method.length];
            for (int i = 0; i < source.Method.length; i++) {
                this.Method[i] = new String(source.Method[i]);
            }
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "VulCategory.", this.VulCategory);
        this.setParamArraySimple(map, prefix + "VulName.", this.VulName);
        this.setParamArraySimple(map, prefix + "KbName.", this.KbName);
        this.setParamSimple(map, prefix + "Emergency", this.Emergency);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);
        this.setParamArraySimple(map, prefix + "Method.", this.Method);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);

    }
}

