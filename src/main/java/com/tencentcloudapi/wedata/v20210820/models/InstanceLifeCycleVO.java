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

public class InstanceLifeCycleVO extends AbstractModel {

    /**
    * 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **实例状态**

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceState")
    @Expose
    private Long InstanceState;

    /**
    * **实例生命周期编号，标识实例的某一次执行**

例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

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
    * **实例生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeCycleDetailList")
    @Expose
    private InstanceLifeDetailDto [] LifeCycleDetailList;

    /**
    * **实例代码文件**
该文件内容为当次执行实例运行使用的代码，仅部分任务支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFileName")
    @Expose
    private String CodeFileName;

    /**
    * **下发执行ID**
统一执行平台下发执行到新版执行机标识某次执行的唯一ID，存量老执行机下发执行没有此ID。
如果不知道执行机版本是否支持此ID，可以联系腾讯云运维同学
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * 日志所在执行节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 日志文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * **实例日志类型**

- run: 运行; 
- kill: 终止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

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
     * Get **实例状态**

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceState **实例状态**

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set **实例状态**

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceState **实例状态**

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceState(Long InstanceState) {
        this.InstanceState = InstanceState;
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
     * Get **实例生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeCycleDetailList **实例生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceLifeDetailDto [] getLifeCycleDetailList() {
        return this.LifeCycleDetailList;
    }

    /**
     * Set **实例生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeCycleDetailList **实例生命周期列表**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeCycleDetailList(InstanceLifeDetailDto [] LifeCycleDetailList) {
        this.LifeCycleDetailList = LifeCycleDetailList;
    }

    /**
     * Get **实例代码文件**
该文件内容为当次执行实例运行使用的代码，仅部分任务支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFileName **实例代码文件**
该文件内容为当次执行实例运行使用的代码，仅部分任务支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeFileName() {
        return this.CodeFileName;
    }

    /**
     * Set **实例代码文件**
该文件内容为当次执行实例运行使用的代码，仅部分任务支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFileName **实例代码文件**
该文件内容为当次执行实例运行使用的代码，仅部分任务支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFileName(String CodeFileName) {
        this.CodeFileName = CodeFileName;
    }

    /**
     * Get **下发执行ID**
统一执行平台下发执行到新版执行机标识某次执行的唯一ID，存量老执行机下发执行没有此ID。
如果不知道执行机版本是否支持此ID，可以联系腾讯云运维同学
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionJobId **下发执行ID**
统一执行平台下发执行到新版执行机标识某次执行的唯一ID，存量老执行机下发执行没有此ID。
如果不知道执行机版本是否支持此ID，可以联系腾讯云运维同学
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set **下发执行ID**
统一执行平台下发执行到新版执行机标识某次执行的唯一ID，存量老执行机下发执行没有此ID。
如果不知道执行机版本是否支持此ID，可以联系腾讯云运维同学
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionJobId **下发执行ID**
统一执行平台下发执行到新版执行机标识某次执行的唯一ID，存量老执行机下发执行没有此ID。
如果不知道执行机版本是否支持此ID，可以联系腾讯云运维同学
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get 日志所在执行节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp 日志所在执行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 日志所在执行节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp 日志所在执行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 日志文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginFileName 日志文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set 日志文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginFileName 日志文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get **实例日志类型**

- run: 运行; 
- kill: 终止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogType **实例日志类型**

- run: 运行; 
- kill: 终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set **实例日志类型**

- run: 运行; 
- kill: 终止
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogType **实例日志类型**

- run: 运行; 
- kill: 终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 耗费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    public InstanceLifeCycleVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLifeCycleVO(InstanceLifeCycleVO source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new Long(source.InstanceState);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.LifeCycleDetailList != null) {
            this.LifeCycleDetailList = new InstanceLifeDetailDto[source.LifeCycleDetailList.length];
            for (int i = 0; i < source.LifeCycleDetailList.length; i++) {
                this.LifeCycleDetailList[i] = new InstanceLifeDetailDto(source.LifeCycleDetailList[i]);
            }
        }
        if (source.CodeFileName != null) {
            this.CodeFileName = new String(source.CodeFileName);
        }
        if (source.ExecutionJobId != null) {
            this.ExecutionJobId = new String(source.ExecutionJobId);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "LifeCycleDetailList.", this.LifeCycleDetailList);
        this.setParamSimple(map, prefix + "CodeFileName", this.CodeFileName);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

