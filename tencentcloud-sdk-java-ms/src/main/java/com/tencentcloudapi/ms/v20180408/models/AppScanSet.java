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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppScanSet extends AbstractModel{

    /**
    * 任务唯一标识
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * app的名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * app的包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * app的版本号
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * app的md5
    */
    @SerializedName("AppMd5")
    @Expose
    private String AppMd5;

    /**
    * app的大小
    */
    @SerializedName("AppSize")
    @Expose
    private Long AppSize;

    /**
    * 扫描结果返回码
    */
    @SerializedName("ScanCode")
    @Expose
    private Long ScanCode;

    /**
    * 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 提交扫描时间
    */
    @SerializedName("TaskTime")
    @Expose
    private Long TaskTime;

    /**
    * app的图标url
    */
    @SerializedName("AppIconUrl")
    @Expose
    private String AppIconUrl;

    /**
    * 标识唯一该app，主要用于删除
    */
    @SerializedName("AppSid")
    @Expose
    private String AppSid;

    /**
    * 安全类型:1-安全软件，2-风险软件，3病毒软件
    */
    @SerializedName("SafeType")
    @Expose
    private Long SafeType;

    /**
    * 漏洞个数
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
     * Get 任务唯一标识 
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get app的名称 
     * @return AppName app的名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app的名称
     * @param AppName app的名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get app的包名 
     * @return AppPkgName app的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set app的包名
     * @param AppPkgName app的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * Get app的版本号 
     * @return AppVersion app的版本号
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set app的版本号
     * @param AppVersion app的版本号
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get app的md5 
     * @return AppMd5 app的md5
     */
    public String getAppMd5() {
        return this.AppMd5;
    }

    /**
     * Set app的md5
     * @param AppMd5 app的md5
     */
    public void setAppMd5(String AppMd5) {
        this.AppMd5 = AppMd5;
    }

    /**
     * Get app的大小 
     * @return AppSize app的大小
     */
    public Long getAppSize() {
        return this.AppSize;
    }

    /**
     * Set app的大小
     * @param AppSize app的大小
     */
    public void setAppSize(Long AppSize) {
        this.AppSize = AppSize;
    }

    /**
     * Get 扫描结果返回码 
     * @return ScanCode 扫描结果返回码
     */
    public Long getScanCode() {
        return this.ScanCode;
    }

    /**
     * Set 扫描结果返回码
     * @param ScanCode 扫描结果返回码
     */
    public void setScanCode(Long ScanCode) {
        this.ScanCode = ScanCode;
    }

    /**
     * Get 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时 
     * @return TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @param TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 提交扫描时间 
     * @return TaskTime 提交扫描时间
     */
    public Long getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set 提交扫描时间
     * @param TaskTime 提交扫描时间
     */
    public void setTaskTime(Long TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get app的图标url 
     * @return AppIconUrl app的图标url
     */
    public String getAppIconUrl() {
        return this.AppIconUrl;
    }

    /**
     * Set app的图标url
     * @param AppIconUrl app的图标url
     */
    public void setAppIconUrl(String AppIconUrl) {
        this.AppIconUrl = AppIconUrl;
    }

    /**
     * Get 标识唯一该app，主要用于删除 
     * @return AppSid 标识唯一该app，主要用于删除
     */
    public String getAppSid() {
        return this.AppSid;
    }

    /**
     * Set 标识唯一该app，主要用于删除
     * @param AppSid 标识唯一该app，主要用于删除
     */
    public void setAppSid(String AppSid) {
        this.AppSid = AppSid;
    }

    /**
     * Get 安全类型:1-安全软件，2-风险软件，3病毒软件 
     * @return SafeType 安全类型:1-安全软件，2-风险软件，3病毒软件
     */
    public Long getSafeType() {
        return this.SafeType;
    }

    /**
     * Set 安全类型:1-安全软件，2-风险软件，3病毒软件
     * @param SafeType 安全类型:1-安全软件，2-风险软件，3病毒软件
     */
    public void setSafeType(Long SafeType) {
        this.SafeType = SafeType;
    }

    /**
     * Get 漏洞个数 
     * @return VulCount 漏洞个数
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 漏洞个数
     * @param VulCount 漏洞个数
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppMd5", this.AppMd5);
        this.setParamSimple(map, prefix + "AppSize", this.AppSize);
        this.setParamSimple(map, prefix + "ScanCode", this.ScanCode);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "AppIconUrl", this.AppIconUrl);
        this.setParamSimple(map, prefix + "AppSid", this.AppSid);
        this.setParamSimple(map, prefix + "SafeType", this.SafeType);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);

    }
}

