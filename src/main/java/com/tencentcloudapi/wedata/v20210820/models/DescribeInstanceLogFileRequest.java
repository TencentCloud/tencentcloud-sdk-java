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

public class DescribeInstanceLogFileRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实例数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 执行机IP
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 日志文件名
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * 执行平台下发执行id
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * 日志级别，Info/Debug/Warn/Error/All
    */
    @SerializedName("LogLevelType")
    @Expose
    private String LogLevelType;

    /**
    * 文件类型,Log/Code
    */
    @SerializedName("ExecutionFileType")
    @Expose
    private String ExecutionFileType;

    /**
    * 生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用
    */
    @SerializedName("InstanceLifeDetailDtoList")
    @Expose
    private InstanceLifeDetailDto [] InstanceLifeDetailDtoList;

    /**
    * 当前生命周期数
    */
    @SerializedName("CurrentLifeRound")
    @Expose
    private Long CurrentLifeRound;

    /**
    * 最大生命周期数
    */
    @SerializedName("MaxLifeRound")
    @Expose
    private Long MaxLifeRound;

    /**
    * 当前生命周期重试次数
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * 动态获取日志信息标识
    */
    @SerializedName("Dynamic")
    @Expose
    private Boolean Dynamic;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实例数据时间 
     * @return CurRunDate 实例数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 实例数据时间
     * @param CurRunDate 实例数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 执行机IP 
     * @return BrokerIp 执行机IP
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 执行机IP
     * @param BrokerIp 执行机IP
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 日志文件名 
     * @return OriginFileName 日志文件名
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set 日志文件名
     * @param OriginFileName 日志文件名
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get 执行平台下发执行id 
     * @return ExecutionJobId 执行平台下发执行id
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set 执行平台下发执行id
     * @param ExecutionJobId 执行平台下发执行id
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get 日志级别，Info/Debug/Warn/Error/All 
     * @return LogLevelType 日志级别，Info/Debug/Warn/Error/All
     */
    public String getLogLevelType() {
        return this.LogLevelType;
    }

    /**
     * Set 日志级别，Info/Debug/Warn/Error/All
     * @param LogLevelType 日志级别，Info/Debug/Warn/Error/All
     */
    public void setLogLevelType(String LogLevelType) {
        this.LogLevelType = LogLevelType;
    }

    /**
     * Get 文件类型,Log/Code 
     * @return ExecutionFileType 文件类型,Log/Code
     */
    public String getExecutionFileType() {
        return this.ExecutionFileType;
    }

    /**
     * Set 文件类型,Log/Code
     * @param ExecutionFileType 文件类型,Log/Code
     */
    public void setExecutionFileType(String ExecutionFileType) {
        this.ExecutionFileType = ExecutionFileType;
    }

    /**
     * Get 生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用 
     * @return InstanceLifeDetailDtoList 生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用
     */
    public InstanceLifeDetailDto [] getInstanceLifeDetailDtoList() {
        return this.InstanceLifeDetailDtoList;
    }

    /**
     * Set 生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用
     * @param InstanceLifeDetailDtoList 生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用
     */
    public void setInstanceLifeDetailDtoList(InstanceLifeDetailDto [] InstanceLifeDetailDtoList) {
        this.InstanceLifeDetailDtoList = InstanceLifeDetailDtoList;
    }

    /**
     * Get 当前生命周期数 
     * @return CurrentLifeRound 当前生命周期数
     */
    public Long getCurrentLifeRound() {
        return this.CurrentLifeRound;
    }

    /**
     * Set 当前生命周期数
     * @param CurrentLifeRound 当前生命周期数
     */
    public void setCurrentLifeRound(Long CurrentLifeRound) {
        this.CurrentLifeRound = CurrentLifeRound;
    }

    /**
     * Get 最大生命周期数 
     * @return MaxLifeRound 最大生命周期数
     */
    public Long getMaxLifeRound() {
        return this.MaxLifeRound;
    }

    /**
     * Set 最大生命周期数
     * @param MaxLifeRound 最大生命周期数
     */
    public void setMaxLifeRound(Long MaxLifeRound) {
        this.MaxLifeRound = MaxLifeRound;
    }

    /**
     * Get 当前生命周期重试次数 
     * @return Tries 当前生命周期重试次数
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set 当前生命周期重试次数
     * @param Tries 当前生命周期重试次数
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get 动态获取日志信息标识 
     * @return Dynamic 动态获取日志信息标识
     */
    public Boolean getDynamic() {
        return this.Dynamic;
    }

    /**
     * Set 动态获取日志信息标识
     * @param Dynamic 动态获取日志信息标识
     */
    public void setDynamic(Boolean Dynamic) {
        this.Dynamic = Dynamic;
    }

    public DescribeInstanceLogFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLogFileRequest(DescribeInstanceLogFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
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
        if (source.LogLevelType != null) {
            this.LogLevelType = new String(source.LogLevelType);
        }
        if (source.ExecutionFileType != null) {
            this.ExecutionFileType = new String(source.ExecutionFileType);
        }
        if (source.InstanceLifeDetailDtoList != null) {
            this.InstanceLifeDetailDtoList = new InstanceLifeDetailDto[source.InstanceLifeDetailDtoList.length];
            for (int i = 0; i < source.InstanceLifeDetailDtoList.length; i++) {
                this.InstanceLifeDetailDtoList[i] = new InstanceLifeDetailDto(source.InstanceLifeDetailDtoList[i]);
            }
        }
        if (source.CurrentLifeRound != null) {
            this.CurrentLifeRound = new Long(source.CurrentLifeRound);
        }
        if (source.MaxLifeRound != null) {
            this.MaxLifeRound = new Long(source.MaxLifeRound);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.Dynamic != null) {
            this.Dynamic = new Boolean(source.Dynamic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "LogLevelType", this.LogLevelType);
        this.setParamSimple(map, prefix + "ExecutionFileType", this.ExecutionFileType);
        this.setParamArrayObj(map, prefix + "InstanceLifeDetailDtoList.", this.InstanceLifeDetailDtoList);
        this.setParamSimple(map, prefix + "CurrentLifeRound", this.CurrentLifeRound);
        this.setParamSimple(map, prefix + "MaxLifeRound", this.MaxLifeRound);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamSimple(map, prefix + "Dynamic", this.Dynamic);

    }
}

