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

public class ScanSetInfo extends AbstractModel{

    /**
    * 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * app信息
    */
    @SerializedName("AppDetailInfo")
    @Expose
    private AppDetailInfo AppDetailInfo;

    /**
    * 病毒信息
    */
    @SerializedName("VirusInfo")
    @Expose
    private VirusInfo VirusInfo;

    /**
    * 漏洞信息
    */
    @SerializedName("VulInfo")
    @Expose
    private VulInfo VulInfo;

    /**
    * 广告插件信息
    */
    @SerializedName("AdInfo")
    @Expose
    private AdInfo AdInfo;

    /**
    * 提交扫描的时间
    */
    @SerializedName("TaskTime")
    @Expose
    private Long TaskTime;

    /**
    * 状态码，成功返回0，失败返回错误码
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 状态操作指引
    */
    @SerializedName("StatusRef")
    @Expose
    private String StatusRef;

    /**
    * 系统权限信息
    */
    @SerializedName("PermissionInfo")
    @Expose
    private ScanPermissionList PermissionInfo;

    /**
    * 敏感词列表
    */
    @SerializedName("SensitiveInfo")
    @Expose
    private ScanSensitiveList SensitiveInfo;

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
     * Get app信息 
     * @return AppDetailInfo app信息
     */
    public AppDetailInfo getAppDetailInfo() {
        return this.AppDetailInfo;
    }

    /**
     * Set app信息
     * @param AppDetailInfo app信息
     */
    public void setAppDetailInfo(AppDetailInfo AppDetailInfo) {
        this.AppDetailInfo = AppDetailInfo;
    }

    /**
     * Get 病毒信息 
     * @return VirusInfo 病毒信息
     */
    public VirusInfo getVirusInfo() {
        return this.VirusInfo;
    }

    /**
     * Set 病毒信息
     * @param VirusInfo 病毒信息
     */
    public void setVirusInfo(VirusInfo VirusInfo) {
        this.VirusInfo = VirusInfo;
    }

    /**
     * Get 漏洞信息 
     * @return VulInfo 漏洞信息
     */
    public VulInfo getVulInfo() {
        return this.VulInfo;
    }

    /**
     * Set 漏洞信息
     * @param VulInfo 漏洞信息
     */
    public void setVulInfo(VulInfo VulInfo) {
        this.VulInfo = VulInfo;
    }

    /**
     * Get 广告插件信息 
     * @return AdInfo 广告插件信息
     */
    public AdInfo getAdInfo() {
        return this.AdInfo;
    }

    /**
     * Set 广告插件信息
     * @param AdInfo 广告插件信息
     */
    public void setAdInfo(AdInfo AdInfo) {
        this.AdInfo = AdInfo;
    }

    /**
     * Get 提交扫描的时间 
     * @return TaskTime 提交扫描的时间
     */
    public Long getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set 提交扫描的时间
     * @param TaskTime 提交扫描的时间
     */
    public void setTaskTime(Long TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get 状态码，成功返回0，失败返回错误码 
     * @return StatusCode 状态码，成功返回0，失败返回错误码
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 状态码，成功返回0，失败返回错误码
     * @param StatusCode 状态码，成功返回0，失败返回错误码
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 状态操作指引 
     * @return StatusRef 状态操作指引
     */
    public String getStatusRef() {
        return this.StatusRef;
    }

    /**
     * Set 状态操作指引
     * @param StatusRef 状态操作指引
     */
    public void setStatusRef(String StatusRef) {
        this.StatusRef = StatusRef;
    }

    /**
     * Get 系统权限信息 
     * @return PermissionInfo 系统权限信息
     */
    public ScanPermissionList getPermissionInfo() {
        return this.PermissionInfo;
    }

    /**
     * Set 系统权限信息
     * @param PermissionInfo 系统权限信息
     */
    public void setPermissionInfo(ScanPermissionList PermissionInfo) {
        this.PermissionInfo = PermissionInfo;
    }

    /**
     * Get 敏感词列表 
     * @return SensitiveInfo 敏感词列表
     */
    public ScanSensitiveList getSensitiveInfo() {
        return this.SensitiveInfo;
    }

    /**
     * Set 敏感词列表
     * @param SensitiveInfo 敏感词列表
     */
    public void setSensitiveInfo(ScanSensitiveList SensitiveInfo) {
        this.SensitiveInfo = SensitiveInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "AppDetailInfo.", this.AppDetailInfo);
        this.setParamObj(map, prefix + "VirusInfo.", this.VirusInfo);
        this.setParamObj(map, prefix + "VulInfo.", this.VulInfo);
        this.setParamObj(map, prefix + "AdInfo.", this.AdInfo);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "StatusRef", this.StatusRef);
        this.setParamObj(map, prefix + "PermissionInfo.", this.PermissionInfo);
        this.setParamObj(map, prefix + "SensitiveInfo.", this.SensitiveInfo);

    }
}

