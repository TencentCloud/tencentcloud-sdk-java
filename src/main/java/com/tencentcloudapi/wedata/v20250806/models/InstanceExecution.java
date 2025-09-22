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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceExecution extends AbstractModel {

    /**
    * 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **实例生命周期编号，标识实例的某一次执行**

例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

    /**
    * **实例状态**
- WAIT_EVENT: 等待事件
- WAIT_UPSTREAM: 等待上游
- WAIT_RUN: 等待运行
- RUNNING: 运行中
- SKIP_RUNNING: 跳过运行
- FAILED_RETRY: 失败重试
- EXPIRED: 失败
- COMPLETED: 成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * **实例运行触发类型**

- RERUN 表示重跑
- ADDITION 表示补录
- PERIODIC 表示周期
- APERIODIC 表示非周期
- RERUN_SKIP_RUN 表示重跑 - 空跑
- ADDITION_SKIP_RUN 表示补录 - 空跑
- PERIODIC_SKIP_RUN 表示周期 - 空跑
- APERIODIC_SKIP_RUN 表示非周期 - 空跑
- MANUAL_TRIGGER 表示手动触发
- RERUN_MANUAL_TRIGGER 表示手动触发 - 重跑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * 失败重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * **实例执行生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionPhaseList")
    @Expose
    private InstanceExecutionPhase [] ExecutionPhaseList;

    /**
    * 耗费时间, 单位ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
     * Get 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceKey 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceKey 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **实例生命周期编号，标识实例的某一次执行**

例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeRoundNum **实例生命周期编号，标识实例的某一次执行**

例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeRoundNum() {
        return this.LifeRoundNum;
    }

    /**
     * Set **实例生命周期编号，标识实例的某一次执行**

例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeRoundNum **实例生命周期编号，标识实例的某一次执行**

例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeRoundNum(Long LifeRoundNum) {
        this.LifeRoundNum = LifeRoundNum;
    }

    /**
     * Get **实例状态**
- WAIT_EVENT: 等待事件
- WAIT_UPSTREAM: 等待上游
- WAIT_RUN: 等待运行
- RUNNING: 运行中
- SKIP_RUNNING: 跳过运行
- FAILED_RETRY: 失败重试
- EXPIRED: 失败
- COMPLETED: 成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceState **实例状态**
- WAIT_EVENT: 等待事件
- WAIT_UPSTREAM: 等待上游
- WAIT_RUN: 等待运行
- RUNNING: 运行中
- SKIP_RUNNING: 跳过运行
- FAILED_RETRY: 失败重试
- EXPIRED: 失败
- COMPLETED: 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set **实例状态**
- WAIT_EVENT: 等待事件
- WAIT_UPSTREAM: 等待上游
- WAIT_RUN: 等待运行
- RUNNING: 运行中
- SKIP_RUNNING: 跳过运行
- FAILED_RETRY: 失败重试
- EXPIRED: 失败
- COMPLETED: 成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceState **实例状态**
- WAIT_EVENT: 等待事件
- WAIT_UPSTREAM: 等待上游
- WAIT_RUN: 等待运行
- RUNNING: 运行中
- SKIP_RUNNING: 跳过运行
- FAILED_RETRY: 失败重试
- EXPIRED: 失败
- COMPLETED: 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get **实例运行触发类型**

- RERUN 表示重跑
- ADDITION 表示补录
- PERIODIC 表示周期
- APERIODIC 表示非周期
- RERUN_SKIP_RUN 表示重跑 - 空跑
- ADDITION_SKIP_RUN 表示补录 - 空跑
- PERIODIC_SKIP_RUN 表示周期 - 空跑
- APERIODIC_SKIP_RUN 表示非周期 - 空跑
- MANUAL_TRIGGER 表示手动触发
- RERUN_MANUAL_TRIGGER 表示手动触发 - 重跑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunType **实例运行触发类型**

- RERUN 表示重跑
- ADDITION 表示补录
- PERIODIC 表示周期
- APERIODIC 表示非周期
- RERUN_SKIP_RUN 表示重跑 - 空跑
- ADDITION_SKIP_RUN 表示补录 - 空跑
- PERIODIC_SKIP_RUN 表示周期 - 空跑
- APERIODIC_SKIP_RUN 表示非周期 - 空跑
- MANUAL_TRIGGER 表示手动触发
- RERUN_MANUAL_TRIGGER 表示手动触发 - 重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set **实例运行触发类型**

- RERUN 表示重跑
- ADDITION 表示补录
- PERIODIC 表示周期
- APERIODIC 表示非周期
- RERUN_SKIP_RUN 表示重跑 - 空跑
- ADDITION_SKIP_RUN 表示补录 - 空跑
- PERIODIC_SKIP_RUN 表示周期 - 空跑
- APERIODIC_SKIP_RUN 表示非周期 - 空跑
- MANUAL_TRIGGER 表示手动触发
- RERUN_MANUAL_TRIGGER 表示手动触发 - 重跑
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunType **实例运行触发类型**

- RERUN 表示重跑
- ADDITION 表示补录
- PERIODIC 表示周期
- APERIODIC 表示非周期
- RERUN_SKIP_RUN 表示重跑 - 空跑
- ADDITION_SKIP_RUN 表示补录 - 空跑
- PERIODIC_SKIP_RUN 表示周期 - 空跑
- APERIODIC_SKIP_RUN 表示非周期 - 空跑
- MANUAL_TRIGGER 表示手动触发
- RERUN_MANUAL_TRIGGER 表示手动触发 - 重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get 失败重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tries 失败重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set 失败重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tries 失败重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get **实例执行生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionPhaseList **实例执行生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceExecutionPhase [] getExecutionPhaseList() {
        return this.ExecutionPhaseList;
    }

    /**
     * Set **实例执行生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionPhaseList **实例执行生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionPhaseList(InstanceExecutionPhase [] ExecutionPhaseList) {
        this.ExecutionPhaseList = ExecutionPhaseList;
    }

    /**
     * Get 耗费时间, 单位ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostTime 耗费时间, 单位ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 耗费时间, 单位ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostTime 耗费时间, 单位ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    public InstanceExecution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceExecution(InstanceExecution source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.ExecutionPhaseList != null) {
            this.ExecutionPhaseList = new InstanceExecutionPhase[source.ExecutionPhaseList.length];
            for (int i = 0; i < source.ExecutionPhaseList.length; i++) {
                this.ExecutionPhaseList[i] = new InstanceExecutionPhase(source.ExecutionPhaseList[i]);
            }
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "ExecutionPhaseList.", this.ExecutionPhaseList);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

