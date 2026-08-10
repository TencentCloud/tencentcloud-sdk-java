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

public class VulFixTaskDetailItem extends AbstractModel {

    /**
    * <p>明细记录ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>关联的修复任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>修复的漏洞ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>修复的KB补丁ID</p>
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * <p>主机实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>主机内网IP</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>漏洞名称</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>执行状态<br>枚举值：<br>0：初始状态<br>1：已下发任务<br>11：客户端已确认<br>2：修复完成<br>3：客户端离线<br>4：超时<br>5：失败<br>6：不支持<br>9：等待快照创建完成中<br>10：快照创建失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>修复结果</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 修复成功</li><li>2： 修复失败</li><li>3： 修复中</li></ul>
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * <p>快照状态<br>枚举值：<br>-1：无需创建快照<br>0：未开始<br>1：进行中<br>2：已完成<br>3：创建失败</p>
    */
    @SerializedName("SnapshotStatus")
    @Expose
    private Long SnapshotStatus;

    /**
    * <p>异常提示信息</p>
    */
    @SerializedName("ExceptionMessage")
    @Expose
    private String ExceptionMessage;

    /**
    * <p>修复启动时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>修复结束时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>快照创建时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("SnapshotCreateTime")
    @Expose
    private String SnapshotCreateTime;

    /**
    * <p>快照到期时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("SnapshotExpireTime")
    @Expose
    private String SnapshotExpireTime;

    /**
    * <p>快照创建失败原因（当 SnapshotStatus=3 时有值）</p>
    */
    @SerializedName("SnapshotFailReason")
    @Expose
    private String SnapshotFailReason;

    /**
     * Get <p>明细记录ID</p> 
     * @return Id <p>明细记录ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>明细记录ID</p>
     * @param Id <p>明细记录ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>关联的修复任务ID</p> 
     * @return TaskId <p>关联的修复任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>关联的修复任务ID</p>
     * @param TaskId <p>关联的修复任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>修复的漏洞ID</p> 
     * @return VulId <p>修复的漏洞ID</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>修复的漏洞ID</p>
     * @param VulId <p>修复的漏洞ID</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>修复的KB补丁ID</p> 
     * @return KBId <p>修复的KB补丁ID</p>
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set <p>修复的KB补丁ID</p>
     * @param KBId <p>修复的KB补丁ID</p>
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get <p>主机实例ID</p> 
     * @return InstanceId <p>主机实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>主机实例ID</p>
     * @param InstanceId <p>主机实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主机名称</p> 
     * @return MachineName <p>主机名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名称</p>
     * @param MachineName <p>主机名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>主机内网IP</p> 
     * @return MachineIp <p>主机内网IP</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>主机内网IP</p>
     * @param MachineIp <p>主机内网IP</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>漏洞名称</p> 
     * @return VulName <p>漏洞名称</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>漏洞名称</p>
     * @param VulName <p>漏洞名称</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>执行状态<br>枚举值：<br>0：初始状态<br>1：已下发任务<br>11：客户端已确认<br>2：修复完成<br>3：客户端离线<br>4：超时<br>5：失败<br>6：不支持<br>9：等待快照创建完成中<br>10：快照创建失败</p> 
     * @return Status <p>执行状态<br>枚举值：<br>0：初始状态<br>1：已下发任务<br>11：客户端已确认<br>2：修复完成<br>3：客户端离线<br>4：超时<br>5：失败<br>6：不支持<br>9：等待快照创建完成中<br>10：快照创建失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>执行状态<br>枚举值：<br>0：初始状态<br>1：已下发任务<br>11：客户端已确认<br>2：修复完成<br>3：客户端离线<br>4：超时<br>5：失败<br>6：不支持<br>9：等待快照创建完成中<br>10：快照创建失败</p>
     * @param Status <p>执行状态<br>枚举值：<br>0：初始状态<br>1：已下发任务<br>11：客户端已确认<br>2：修复完成<br>3：客户端离线<br>4：超时<br>5：失败<br>6：不支持<br>9：等待快照创建完成中<br>10：快照创建失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>修复结果</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 修复成功</li><li>2： 修复失败</li><li>3： 修复中</li></ul> 
     * @return FixStatus <p>修复结果</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 修复成功</li><li>2： 修复失败</li><li>3： 修复中</li></ul>
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set <p>修复结果</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 修复成功</li><li>2： 修复失败</li><li>3： 修复中</li></ul>
     * @param FixStatus <p>修复结果</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 修复成功</li><li>2： 修复失败</li><li>3： 修复中</li></ul>
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get <p>快照状态<br>枚举值：<br>-1：无需创建快照<br>0：未开始<br>1：进行中<br>2：已完成<br>3：创建失败</p> 
     * @return SnapshotStatus <p>快照状态<br>枚举值：<br>-1：无需创建快照<br>0：未开始<br>1：进行中<br>2：已完成<br>3：创建失败</p>
     */
    public Long getSnapshotStatus() {
        return this.SnapshotStatus;
    }

    /**
     * Set <p>快照状态<br>枚举值：<br>-1：无需创建快照<br>0：未开始<br>1：进行中<br>2：已完成<br>3：创建失败</p>
     * @param SnapshotStatus <p>快照状态<br>枚举值：<br>-1：无需创建快照<br>0：未开始<br>1：进行中<br>2：已完成<br>3：创建失败</p>
     */
    public void setSnapshotStatus(Long SnapshotStatus) {
        this.SnapshotStatus = SnapshotStatus;
    }

    /**
     * Get <p>异常提示信息</p> 
     * @return ExceptionMessage <p>异常提示信息</p>
     */
    public String getExceptionMessage() {
        return this.ExceptionMessage;
    }

    /**
     * Set <p>异常提示信息</p>
     * @param ExceptionMessage <p>异常提示信息</p>
     */
    public void setExceptionMessage(String ExceptionMessage) {
        this.ExceptionMessage = ExceptionMessage;
    }

    /**
     * Get <p>修复启动时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return StartTime <p>修复启动时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>修复启动时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param StartTime <p>修复启动时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>修复结束时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return EndTime <p>修复结束时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>修复结束时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param EndTime <p>修复结束时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>快照创建时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return SnapshotCreateTime <p>快照创建时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getSnapshotCreateTime() {
        return this.SnapshotCreateTime;
    }

    /**
     * Set <p>快照创建时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param SnapshotCreateTime <p>快照创建时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setSnapshotCreateTime(String SnapshotCreateTime) {
        this.SnapshotCreateTime = SnapshotCreateTime;
    }

    /**
     * Get <p>快照到期时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return SnapshotExpireTime <p>快照到期时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getSnapshotExpireTime() {
        return this.SnapshotExpireTime;
    }

    /**
     * Set <p>快照到期时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param SnapshotExpireTime <p>快照到期时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setSnapshotExpireTime(String SnapshotExpireTime) {
        this.SnapshotExpireTime = SnapshotExpireTime;
    }

    /**
     * Get <p>快照创建失败原因（当 SnapshotStatus=3 时有值）</p> 
     * @return SnapshotFailReason <p>快照创建失败原因（当 SnapshotStatus=3 时有值）</p>
     */
    public String getSnapshotFailReason() {
        return this.SnapshotFailReason;
    }

    /**
     * Set <p>快照创建失败原因（当 SnapshotStatus=3 时有值）</p>
     * @param SnapshotFailReason <p>快照创建失败原因（当 SnapshotStatus=3 时有值）</p>
     */
    public void setSnapshotFailReason(String SnapshotFailReason) {
        this.SnapshotFailReason = SnapshotFailReason;
    }

    public VulFixTaskDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixTaskDetailItem(VulFixTaskDetailItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.SnapshotStatus != null) {
            this.SnapshotStatus = new Long(source.SnapshotStatus);
        }
        if (source.ExceptionMessage != null) {
            this.ExceptionMessage = new String(source.ExceptionMessage);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SnapshotCreateTime != null) {
            this.SnapshotCreateTime = new String(source.SnapshotCreateTime);
        }
        if (source.SnapshotExpireTime != null) {
            this.SnapshotExpireTime = new String(source.SnapshotExpireTime);
        }
        if (source.SnapshotFailReason != null) {
            this.SnapshotFailReason = new String(source.SnapshotFailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "SnapshotStatus", this.SnapshotStatus);
        this.setParamSimple(map, prefix + "ExceptionMessage", this.ExceptionMessage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SnapshotCreateTime", this.SnapshotCreateTime);
        this.setParamSimple(map, prefix + "SnapshotExpireTime", this.SnapshotExpireTime);
        this.setParamSimple(map, prefix + "SnapshotFailReason", this.SnapshotFailReason);

    }
}

