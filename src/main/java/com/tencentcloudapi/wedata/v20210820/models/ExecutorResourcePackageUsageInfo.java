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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutorResourcePackageUsageInfo extends AbstractModel {

    /**
    * CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuUsagePercent")
    @Expose
    private Float CpuUsagePercent;

    /**
    * 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemUsagePercent")
    @Expose
    private Float MemUsagePercent;

    /**
    * 资源包状态, /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Float Status;

    /**
    * /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
运行中的任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningTaskNum")
    @Expose
    private Long RunningTaskNum;

    /**
    * 等待中的任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitingTaskNum")
    @Expose
    private Long WaitingTaskNum;

    /**
    * 资源使用趋势: 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsageTrendStartTime")
    @Expose
    private String UsageTrendStartTime;

    /**
    * 资源使用趋势: 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsageTrendEndTime")
    @Expose
    private String UsageTrendEndTime;

    /**
    * 资源使用趋势列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsageTrendList")
    @Expose
    private ExecutorUsageTrendInfo [] UsageTrendList;

    /**
     * Get CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuUsagePercent CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuUsagePercent() {
        return this.CpuUsagePercent;
    }

    /**
     * Set CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuUsagePercent CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuUsagePercent(Float CpuUsagePercent) {
        this.CpuUsagePercent = CpuUsagePercent;
    }

    /**
     * Get 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemUsagePercent 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemUsagePercent() {
        return this.MemUsagePercent;
    }

    /**
     * Set 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemUsagePercent 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemUsagePercent(Float MemUsagePercent) {
        this.MemUsagePercent = MemUsagePercent;
    }

    /**
     * Get 资源包状态, /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源包状态, /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStatus() {
        return this.Status;
    }

    /**
     * Set 资源包状态, /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源包状态, /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
    EXPIRED(9);
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Float Status) {
        this.Status = Status;
    }

    /**
     * Get /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
运行中的任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningTaskNum /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
运行中的任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningTaskNum() {
        return this.RunningTaskNum;
    }

    /**
     * Set /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
运行中的任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningTaskNum /**
     * 初始化中
     * /
    INIT(0),
    /**
     * 运行中
     * /
    RUNNING(1),
    /**
     * 运行异常
     * /
    RUNNING_FAILED(2),
    /**
     * 释放中
     * /
    DELETEING(3),
    /**
     * 已释放
     * /
    DELETED(4),
    /**
     * 创建中
     * /
    CREATING(5),
    /**
     * 创建失败
     * /
    CREATE_FAILED(6),
    /**
     * 更新中
     * /
    UPDATING(7),
    /**
     * 更新失败
     * /
    UPDATE_FAILED(8),
    /**
     * 已到期
     * /
运行中的任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningTaskNum(Long RunningTaskNum) {
        this.RunningTaskNum = RunningTaskNum;
    }

    /**
     * Get 等待中的任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitingTaskNum 等待中的任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitingTaskNum() {
        return this.WaitingTaskNum;
    }

    /**
     * Set 等待中的任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitingTaskNum 等待中的任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitingTaskNum(Long WaitingTaskNum) {
        this.WaitingTaskNum = WaitingTaskNum;
    }

    /**
     * Get 资源使用趋势: 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsageTrendStartTime 资源使用趋势: 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsageTrendStartTime() {
        return this.UsageTrendStartTime;
    }

    /**
     * Set 资源使用趋势: 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsageTrendStartTime 资源使用趋势: 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsageTrendStartTime(String UsageTrendStartTime) {
        this.UsageTrendStartTime = UsageTrendStartTime;
    }

    /**
     * Get 资源使用趋势: 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsageTrendEndTime 资源使用趋势: 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsageTrendEndTime() {
        return this.UsageTrendEndTime;
    }

    /**
     * Set 资源使用趋势: 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsageTrendEndTime 资源使用趋势: 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsageTrendEndTime(String UsageTrendEndTime) {
        this.UsageTrendEndTime = UsageTrendEndTime;
    }

    /**
     * Get 资源使用趋势列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsageTrendList 资源使用趋势列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExecutorUsageTrendInfo [] getUsageTrendList() {
        return this.UsageTrendList;
    }

    /**
     * Set 资源使用趋势列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsageTrendList 资源使用趋势列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsageTrendList(ExecutorUsageTrendInfo [] UsageTrendList) {
        this.UsageTrendList = UsageTrendList;
    }

    public ExecutorResourcePackageUsageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorResourcePackageUsageInfo(ExecutorResourcePackageUsageInfo source) {
        if (source.CpuUsagePercent != null) {
            this.CpuUsagePercent = new Float(source.CpuUsagePercent);
        }
        if (source.MemUsagePercent != null) {
            this.MemUsagePercent = new Float(source.MemUsagePercent);
        }
        if (source.Status != null) {
            this.Status = new Float(source.Status);
        }
        if (source.RunningTaskNum != null) {
            this.RunningTaskNum = new Long(source.RunningTaskNum);
        }
        if (source.WaitingTaskNum != null) {
            this.WaitingTaskNum = new Long(source.WaitingTaskNum);
        }
        if (source.UsageTrendStartTime != null) {
            this.UsageTrendStartTime = new String(source.UsageTrendStartTime);
        }
        if (source.UsageTrendEndTime != null) {
            this.UsageTrendEndTime = new String(source.UsageTrendEndTime);
        }
        if (source.UsageTrendList != null) {
            this.UsageTrendList = new ExecutorUsageTrendInfo[source.UsageTrendList.length];
            for (int i = 0; i < source.UsageTrendList.length; i++) {
                this.UsageTrendList[i] = new ExecutorUsageTrendInfo(source.UsageTrendList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuUsagePercent", this.CpuUsagePercent);
        this.setParamSimple(map, prefix + "MemUsagePercent", this.MemUsagePercent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RunningTaskNum", this.RunningTaskNum);
        this.setParamSimple(map, prefix + "WaitingTaskNum", this.WaitingTaskNum);
        this.setParamSimple(map, prefix + "UsageTrendStartTime", this.UsageTrendStartTime);
        this.setParamSimple(map, prefix + "UsageTrendEndTime", this.UsageTrendEndTime);
        this.setParamArrayObj(map, prefix + "UsageTrendList.", this.UsageTrendList);

    }
}

