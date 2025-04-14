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

public class GetInstanceLogRequest extends AbstractModel {

    /**
    * **项目ID**
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **实例唯一标识**
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 生命周期编号
    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

    /**
    * **时区**
timeZone, 默认UTC+8
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * **日志所在执行机Ip**
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * **日志文件**
实例详情中 executionJobId 为空时，但 originFileName 不为空时，入参中必须包含 originFileName 与 brokerIp
如果 executionJobId 与 originFileName 都为空，则说明实例未下发执行或没有产生日志。例如分支节点 或 归并节点
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * **执行ID**

实例详情中 executionJobId 不为空时，入参中需包含executionJobId 。originFileName 与 brokerIp为非必要参数
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * **日志级别**
默认All

- Info
- Debug
- Warn
- Error
- All
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * **获取日志的开始行 行号**
默认 1
    */
    @SerializedName("StartLineNum")
    @Expose
    private Long StartLineNum;

    /**
    * **获取日志的结束行 行号**
默认 10000
    */
    @SerializedName("EndLineCount")
    @Expose
    private Long EndLineCount;

    /**
     * Get **项目ID** 
     * @return ProjectId **项目ID**
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **项目ID**
     * @param ProjectId **项目ID**
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **实例唯一标识** 
     * @return InstanceKey **实例唯一标识**
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set **实例唯一标识**
     * @param InstanceKey **实例唯一标识**
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 生命周期编号 
     * @return LifeRoundNum 生命周期编号
     */
    public Long getLifeRoundNum() {
        return this.LifeRoundNum;
    }

    /**
     * Set 生命周期编号
     * @param LifeRoundNum 生命周期编号
     */
    public void setLifeRoundNum(Long LifeRoundNum) {
        this.LifeRoundNum = LifeRoundNum;
    }

    /**
     * Get **时区**
timeZone, 默认UTC+8 
     * @return ScheduleTimeZone **时区**
timeZone, 默认UTC+8
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set **时区**
timeZone, 默认UTC+8
     * @param ScheduleTimeZone **时区**
timeZone, 默认UTC+8
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get **日志所在执行机Ip** 
     * @return BrokerIp **日志所在执行机Ip**
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set **日志所在执行机Ip**
     * @param BrokerIp **日志所在执行机Ip**
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get **日志文件**
实例详情中 executionJobId 为空时，但 originFileName 不为空时，入参中必须包含 originFileName 与 brokerIp
如果 executionJobId 与 originFileName 都为空，则说明实例未下发执行或没有产生日志。例如分支节点 或 归并节点 
     * @return OriginFileName **日志文件**
实例详情中 executionJobId 为空时，但 originFileName 不为空时，入参中必须包含 originFileName 与 brokerIp
如果 executionJobId 与 originFileName 都为空，则说明实例未下发执行或没有产生日志。例如分支节点 或 归并节点
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set **日志文件**
实例详情中 executionJobId 为空时，但 originFileName 不为空时，入参中必须包含 originFileName 与 brokerIp
如果 executionJobId 与 originFileName 都为空，则说明实例未下发执行或没有产生日志。例如分支节点 或 归并节点
     * @param OriginFileName **日志文件**
实例详情中 executionJobId 为空时，但 originFileName 不为空时，入参中必须包含 originFileName 与 brokerIp
如果 executionJobId 与 originFileName 都为空，则说明实例未下发执行或没有产生日志。例如分支节点 或 归并节点
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get **执行ID**

实例详情中 executionJobId 不为空时，入参中需包含executionJobId 。originFileName 与 brokerIp为非必要参数 
     * @return ExecutionJobId **执行ID**

实例详情中 executionJobId 不为空时，入参中需包含executionJobId 。originFileName 与 brokerIp为非必要参数
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set **执行ID**

实例详情中 executionJobId 不为空时，入参中需包含executionJobId 。originFileName 与 brokerIp为非必要参数
     * @param ExecutionJobId **执行ID**

实例详情中 executionJobId 不为空时，入参中需包含executionJobId 。originFileName 与 brokerIp为非必要参数
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get **日志级别**
默认All

- Info
- Debug
- Warn
- Error
- All 
     * @return LogLevel **日志级别**
默认All

- Info
- Debug
- Warn
- Error
- All
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set **日志级别**
默认All

- Info
- Debug
- Warn
- Error
- All
     * @param LogLevel **日志级别**
默认All

- Info
- Debug
- Warn
- Error
- All
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get **获取日志的开始行 行号**
默认 1 
     * @return StartLineNum **获取日志的开始行 行号**
默认 1
     */
    public Long getStartLineNum() {
        return this.StartLineNum;
    }

    /**
     * Set **获取日志的开始行 行号**
默认 1
     * @param StartLineNum **获取日志的开始行 行号**
默认 1
     */
    public void setStartLineNum(Long StartLineNum) {
        this.StartLineNum = StartLineNum;
    }

    /**
     * Get **获取日志的结束行 行号**
默认 10000 
     * @return EndLineCount **获取日志的结束行 行号**
默认 10000
     */
    public Long getEndLineCount() {
        return this.EndLineCount;
    }

    /**
     * Set **获取日志的结束行 行号**
默认 10000
     * @param EndLineCount **获取日志的结束行 行号**
默认 10000
     */
    public void setEndLineCount(Long EndLineCount) {
        this.EndLineCount = EndLineCount;
    }

    public GetInstanceLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetInstanceLogRequest(GetInstanceLogRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.ExecutionJobId != null) {
            this.ExecutionJobId = new String(source.ExecutionJobId);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.StartLineNum != null) {
            this.StartLineNum = new Long(source.StartLineNum);
        }
        if (source.EndLineCount != null) {
            this.EndLineCount = new Long(source.EndLineCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "StartLineNum", this.StartLineNum);
        this.setParamSimple(map, prefix + "EndLineCount", this.EndLineCount);

    }
}

