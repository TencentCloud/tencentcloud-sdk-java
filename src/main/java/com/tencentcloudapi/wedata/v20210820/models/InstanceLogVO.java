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

public class InstanceLogVO extends AbstractModel {

    /**
    * 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
    * 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * **运行代码文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFileSize")
    @Expose
    private String CodeFileSize;

    /**
    * 日志所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogInfo")
    @Expose
    private String LogInfo;

    /**
    * **日志文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFileSize")
    @Expose
    private String LogFileSize;

    /**
    * **本次查询返回的日志行数**
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的ExtInfo字段值即可
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 日志分页查询，是否最后一页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnd")
    @Expose
    private Boolean IsEnd;

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
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeInfo **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * Set **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeInfo **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
    }

    /**
     * Get **运行代码文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFileSize **运行代码文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeFileSize() {
        return this.CodeFileSize;
    }

    /**
     * Set **运行代码文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFileSize **运行代码文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFileSize(String CodeFileSize) {
        this.CodeFileSize = CodeFileSize;
    }

    /**
     * Get 日志所在节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp 日志所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 日志所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp 日志所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get **日志内容**
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogInfo **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogInfo **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogInfo(String LogInfo) {
        this.LogInfo = LogInfo;
    }

    /**
     * Get **日志文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFileSize **日志文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogFileSize() {
        return this.LogFileSize;
    }

    /**
     * Set **日志文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFileSize **日志文件大小**
单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFileSize(String LogFileSize) {
        this.LogFileSize = LogFileSize;
    }

    /**
     * Get **本次查询返回的日志行数**
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineCount **本次查询返回的日志行数**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set **本次查询返回的日志行数**
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineCount **本次查询返回的日志行数**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的ExtInfo字段值即可
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的ExtInfo字段值即可
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的ExtInfo字段值即可
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的ExtInfo字段值即可
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get 日志分页查询，是否最后一页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnd 日志分页查询，是否最后一页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set 日志分页查询，是否最后一页
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnd 日志分页查询，是否最后一页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEnd(Boolean IsEnd) {
        this.IsEnd = IsEnd;
    }

    public InstanceLogVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLogVO(InstanceLogVO source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new Long(source.InstanceState);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CodeInfo != null) {
            this.CodeInfo = new String(source.CodeInfo);
        }
        if (source.CodeFileSize != null) {
            this.CodeFileSize = new String(source.CodeFileSize);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.LogInfo != null) {
            this.LogInfo = new String(source.LogInfo);
        }
        if (source.LogFileSize != null) {
            this.LogFileSize = new String(source.LogFileSize);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Boolean(source.IsEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "CodeFileSize", this.CodeFileSize);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "LogInfo", this.LogInfo);
        this.setParamSimple(map, prefix + "LogFileSize", this.LogFileSize);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);

    }
}

