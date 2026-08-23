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

public class ImageRegistryScanTaskInfo extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>定时扫描任务id</p>
    */
    @SerializedName("TimedScanConfigId")
    @Expose
    private Long TimedScanConfigId;

    /**
    * <p>自动匹配模式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>LATEST_VERSION： 仅扫描最新版本镜像</li><li>LOCAL_IMAGE： 本地镜像</li></ul>
    */
    @SerializedName("AutoMatchMode")
    @Expose
    private String [] AutoMatchMode;

    /**
    * <p>扫描资产模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
    */
    @SerializedName("ScopeMode")
    @Expose
    private String ScopeMode;

    /**
    * <p>任务触发类型</p><p>枚举值：</p><ul><li>TIMED： 定时任务</li><li>MANUAL： 手动触发</li></ul>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * <p>扫描的镜像id</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private Long [] ImageIds;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>RUNNING： 执行中</li><li>SUCCESS： 任务成功</li><li>TIMEOUT： 任务超时</li><li>FAILED： 任务失败</li><li>CANCELLED： 已取消</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>定时任务所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>定时任务所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>定时任务所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>扫描镜像数</p>
    */
    @SerializedName("ScanImageCount")
    @Expose
    private Long ScanImageCount;

    /**
    * <p>扫描成功镜像数</p>
    */
    @SerializedName("SuccessImageCount")
    @Expose
    private Long SuccessImageCount;

    /**
    * <p>扫描失败镜像数</p>
    */
    @SerializedName("FailureImageCount")
    @Expose
    private Long FailureImageCount;

    /**
    * <p>任务忽略的镜像数</p>
    */
    @SerializedName("IgnoredImageCount")
    @Expose
    private Long IgnoredImageCount;

    /**
    * <p>任务被取消镜像数</p>
    */
    @SerializedName("CancelledImageCount")
    @Expose
    private Long CancelledImageCount;

    /**
    * <p>扫描启动时间</p><p>参数格式：hh:mm</p>
    */
    @SerializedName("ScanStartTime")
    @Expose
    private String ScanStartTime;

    /**
    * <p>扫描停止时间</p><p>参数格式：hh:mm</p>
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * <p>超时时间，单位秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>任务取消原因</p>
    */
    @SerializedName("CancelReason")
    @Expose
    private String CancelReason;

    /**
    * <p>任务名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>扫描任务调度配置</p>
    */
    @SerializedName("Schedule")
    @Expose
    private ImageScanScheduleConfig Schedule;

    /**
    * <p>扫描任务目标</p>
    */
    @SerializedName("Target")
    @Expose
    private ImageScanAssetTarget Target;

    /**
    * <p>扫描任务过滤配置</p>
    */
    @SerializedName("Filter")
    @Expose
    private ImageScanRegistryFilter Filter;

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
     * Get <p>定时扫描任务id</p> 
     * @return TimedScanConfigId <p>定时扫描任务id</p>
     */
    public Long getTimedScanConfigId() {
        return this.TimedScanConfigId;
    }

    /**
     * Set <p>定时扫描任务id</p>
     * @param TimedScanConfigId <p>定时扫描任务id</p>
     */
    public void setTimedScanConfigId(Long TimedScanConfigId) {
        this.TimedScanConfigId = TimedScanConfigId;
    }

    /**
     * Get <p>自动匹配模式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>LATEST_VERSION： 仅扫描最新版本镜像</li><li>LOCAL_IMAGE： 本地镜像</li></ul> 
     * @return AutoMatchMode <p>自动匹配模式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>LATEST_VERSION： 仅扫描最新版本镜像</li><li>LOCAL_IMAGE： 本地镜像</li></ul>
     */
    public String [] getAutoMatchMode() {
        return this.AutoMatchMode;
    }

    /**
     * Set <p>自动匹配模式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>LATEST_VERSION： 仅扫描最新版本镜像</li><li>LOCAL_IMAGE： 本地镜像</li></ul>
     * @param AutoMatchMode <p>自动匹配模式</p><p>枚举值：</p><ul><li>BY_CLUSTER： 按集群选择</li><li>LATEST_VERSION： 仅扫描最新版本镜像</li><li>LOCAL_IMAGE： 本地镜像</li></ul>
     */
    public void setAutoMatchMode(String [] AutoMatchMode) {
        this.AutoMatchMode = AutoMatchMode;
    }

    /**
     * Get <p>扫描资产模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul> 
     * @return ScopeMode <p>扫描资产模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
     */
    public String getScopeMode() {
        return this.ScopeMode;
    }

    /**
     * Set <p>扫描资产模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
     * @param ScopeMode <p>扫描资产模式</p><p>枚举值：</p><ul><li>ALL： 全部</li><li>MANUAL： 手动选择</li><li>AUTO_MATCH： 自动匹配</li></ul>
     */
    public void setScopeMode(String ScopeMode) {
        this.ScopeMode = ScopeMode;
    }

    /**
     * Get <p>任务触发类型</p><p>枚举值：</p><ul><li>TIMED： 定时任务</li><li>MANUAL： 手动触发</li></ul> 
     * @return TriggerType <p>任务触发类型</p><p>枚举值：</p><ul><li>TIMED： 定时任务</li><li>MANUAL： 手动触发</li></ul>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>任务触发类型</p><p>枚举值：</p><ul><li>TIMED： 定时任务</li><li>MANUAL： 手动触发</li></ul>
     * @param TriggerType <p>任务触发类型</p><p>枚举值：</p><ul><li>TIMED： 定时任务</li><li>MANUAL： 手动触发</li></ul>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul> 
     * @return ScanType <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
     * @param ScanType <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>扫描的镜像id</p> 
     * @return ImageIds <p>扫描的镜像id</p>
     */
    public Long [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>扫描的镜像id</p>
     * @param ImageIds <p>扫描的镜像id</p>
     */
    public void setImageIds(Long [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>RUNNING： 执行中</li><li>SUCCESS： 任务成功</li><li>TIMEOUT： 任务超时</li><li>FAILED： 任务失败</li><li>CANCELLED： 已取消</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>RUNNING： 执行中</li><li>SUCCESS： 任务成功</li><li>TIMEOUT： 任务超时</li><li>FAILED： 任务失败</li><li>CANCELLED： 已取消</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>RUNNING： 执行中</li><li>SUCCESS： 任务成功</li><li>TIMEOUT： 任务超时</li><li>FAILED： 任务失败</li><li>CANCELLED： 已取消</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>RUNNING： 执行中</li><li>SUCCESS： 任务成功</li><li>TIMEOUT： 任务超时</li><li>FAILED： 任务失败</li><li>CANCELLED： 已取消</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>定时任务所属账号名</p> 
     * @return OwnerAccountName <p>定时任务所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>定时任务所属账号名</p>
     * @param OwnerAccountName <p>定时任务所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>定时任务所属账号appid</p> 
     * @return OwnerAppId <p>定时任务所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>定时任务所属账号appid</p>
     * @param OwnerAppId <p>定时任务所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>定时任务所属账号uin</p> 
     * @return OwnerUin <p>定时任务所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>定时任务所属账号uin</p>
     * @param OwnerUin <p>定时任务所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>扫描镜像数</p> 
     * @return ScanImageCount <p>扫描镜像数</p>
     */
    public Long getScanImageCount() {
        return this.ScanImageCount;
    }

    /**
     * Set <p>扫描镜像数</p>
     * @param ScanImageCount <p>扫描镜像数</p>
     */
    public void setScanImageCount(Long ScanImageCount) {
        this.ScanImageCount = ScanImageCount;
    }

    /**
     * Get <p>扫描成功镜像数</p> 
     * @return SuccessImageCount <p>扫描成功镜像数</p>
     */
    public Long getSuccessImageCount() {
        return this.SuccessImageCount;
    }

    /**
     * Set <p>扫描成功镜像数</p>
     * @param SuccessImageCount <p>扫描成功镜像数</p>
     */
    public void setSuccessImageCount(Long SuccessImageCount) {
        this.SuccessImageCount = SuccessImageCount;
    }

    /**
     * Get <p>扫描失败镜像数</p> 
     * @return FailureImageCount <p>扫描失败镜像数</p>
     */
    public Long getFailureImageCount() {
        return this.FailureImageCount;
    }

    /**
     * Set <p>扫描失败镜像数</p>
     * @param FailureImageCount <p>扫描失败镜像数</p>
     */
    public void setFailureImageCount(Long FailureImageCount) {
        this.FailureImageCount = FailureImageCount;
    }

    /**
     * Get <p>任务忽略的镜像数</p> 
     * @return IgnoredImageCount <p>任务忽略的镜像数</p>
     */
    public Long getIgnoredImageCount() {
        return this.IgnoredImageCount;
    }

    /**
     * Set <p>任务忽略的镜像数</p>
     * @param IgnoredImageCount <p>任务忽略的镜像数</p>
     */
    public void setIgnoredImageCount(Long IgnoredImageCount) {
        this.IgnoredImageCount = IgnoredImageCount;
    }

    /**
     * Get <p>任务被取消镜像数</p> 
     * @return CancelledImageCount <p>任务被取消镜像数</p>
     */
    public Long getCancelledImageCount() {
        return this.CancelledImageCount;
    }

    /**
     * Set <p>任务被取消镜像数</p>
     * @param CancelledImageCount <p>任务被取消镜像数</p>
     */
    public void setCancelledImageCount(Long CancelledImageCount) {
        this.CancelledImageCount = CancelledImageCount;
    }

    /**
     * Get <p>扫描启动时间</p><p>参数格式：hh:mm</p> 
     * @return ScanStartTime <p>扫描启动时间</p><p>参数格式：hh:mm</p>
     */
    public String getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set <p>扫描启动时间</p><p>参数格式：hh:mm</p>
     * @param ScanStartTime <p>扫描启动时间</p><p>参数格式：hh:mm</p>
     */
    public void setScanStartTime(String ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get <p>扫描停止时间</p><p>参数格式：hh:mm</p> 
     * @return ScanEndTime <p>扫描停止时间</p><p>参数格式：hh:mm</p>
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set <p>扫描停止时间</p><p>参数格式：hh:mm</p>
     * @param ScanEndTime <p>扫描停止时间</p><p>参数格式：hh:mm</p>
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get <p>超时时间，单位秒</p> 
     * @return Timeout <p>超时时间，单位秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，单位秒</p>
     * @param Timeout <p>超时时间，单位秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>任务取消原因</p> 
     * @return CancelReason <p>任务取消原因</p>
     */
    public String getCancelReason() {
        return this.CancelReason;
    }

    /**
     * Set <p>任务取消原因</p>
     * @param CancelReason <p>任务取消原因</p>
     */
    public void setCancelReason(String CancelReason) {
        this.CancelReason = CancelReason;
    }

    /**
     * Get <p>任务名</p> 
     * @return Name <p>任务名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名</p>
     * @param Name <p>任务名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>扫描任务调度配置</p> 
     * @return Schedule <p>扫描任务调度配置</p>
     */
    public ImageScanScheduleConfig getSchedule() {
        return this.Schedule;
    }

    /**
     * Set <p>扫描任务调度配置</p>
     * @param Schedule <p>扫描任务调度配置</p>
     */
    public void setSchedule(ImageScanScheduleConfig Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get <p>扫描任务目标</p> 
     * @return Target <p>扫描任务目标</p>
     */
    public ImageScanAssetTarget getTarget() {
        return this.Target;
    }

    /**
     * Set <p>扫描任务目标</p>
     * @param Target <p>扫描任务目标</p>
     */
    public void setTarget(ImageScanAssetTarget Target) {
        this.Target = Target;
    }

    /**
     * Get <p>扫描任务过滤配置</p> 
     * @return Filter <p>扫描任务过滤配置</p>
     */
    public ImageScanRegistryFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>扫描任务过滤配置</p>
     * @param Filter <p>扫描任务过滤配置</p>
     */
    public void setFilter(ImageScanRegistryFilter Filter) {
        this.Filter = Filter;
    }

    public ImageRegistryScanTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryScanTaskInfo(ImageRegistryScanTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TimedScanConfigId != null) {
            this.TimedScanConfigId = new Long(source.TimedScanConfigId);
        }
        if (source.AutoMatchMode != null) {
            this.AutoMatchMode = new String[source.AutoMatchMode.length];
            for (int i = 0; i < source.AutoMatchMode.length; i++) {
                this.AutoMatchMode[i] = new String(source.AutoMatchMode[i]);
            }
        }
        if (source.ScopeMode != null) {
            this.ScopeMode = new String(source.ScopeMode);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.ImageIds != null) {
            this.ImageIds = new Long[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new Long(source.ImageIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ScanImageCount != null) {
            this.ScanImageCount = new Long(source.ScanImageCount);
        }
        if (source.SuccessImageCount != null) {
            this.SuccessImageCount = new Long(source.SuccessImageCount);
        }
        if (source.FailureImageCount != null) {
            this.FailureImageCount = new Long(source.FailureImageCount);
        }
        if (source.IgnoredImageCount != null) {
            this.IgnoredImageCount = new Long(source.IgnoredImageCount);
        }
        if (source.CancelledImageCount != null) {
            this.CancelledImageCount = new Long(source.CancelledImageCount);
        }
        if (source.ScanStartTime != null) {
            this.ScanStartTime = new String(source.ScanStartTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CancelReason != null) {
            this.CancelReason = new String(source.CancelReason);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Schedule != null) {
            this.Schedule = new ImageScanScheduleConfig(source.Schedule);
        }
        if (source.Target != null) {
            this.Target = new ImageScanAssetTarget(source.Target);
        }
        if (source.Filter != null) {
            this.Filter = new ImageScanRegistryFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TimedScanConfigId", this.TimedScanConfigId);
        this.setParamArraySimple(map, prefix + "AutoMatchMode.", this.AutoMatchMode);
        this.setParamSimple(map, prefix + "ScopeMode", this.ScopeMode);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ScanImageCount", this.ScanImageCount);
        this.setParamSimple(map, prefix + "SuccessImageCount", this.SuccessImageCount);
        this.setParamSimple(map, prefix + "FailureImageCount", this.FailureImageCount);
        this.setParamSimple(map, prefix + "IgnoredImageCount", this.IgnoredImageCount);
        this.setParamSimple(map, prefix + "CancelledImageCount", this.CancelledImageCount);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "CancelReason", this.CancelReason);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

