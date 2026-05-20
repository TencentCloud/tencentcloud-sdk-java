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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceLogFileRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>实例数据时间</p>
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
    * <p>执行机IP</p>
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * <p>日志文件名</p>
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * <p>执行平台下发执行id</p>
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * <p>日志级别，Info/Debug/Warn/Error/All</p>
    */
    @SerializedName("LogLevelType")
    @Expose
    private String LogLevelType;

    /**
    * <p>文件类型,Log/Code</p>
    */
    @SerializedName("ExecutionFileType")
    @Expose
    private String ExecutionFileType;

    /**
    * <p>生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用</p>
    */
    @SerializedName("InstanceLifeDetailDtoList")
    @Expose
    private InstanceLifeDetailDto [] InstanceLifeDetailDtoList;

    /**
    * <p>当前生命周期数</p>
    */
    @SerializedName("CurrentLifeRound")
    @Expose
    private Long CurrentLifeRound;

    /**
    * <p>最大生命周期数</p>
    */
    @SerializedName("MaxLifeRound")
    @Expose
    private Long MaxLifeRound;

    /**
    * <p>当前生命周期重试次数</p>
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * <p>动态获取日志信息标识</p>
    */
    @SerializedName("Dynamic")
    @Expose
    private Boolean Dynamic;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>实例数据时间</p> 
     * @return CurRunDate <p>实例数据时间</p>
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set <p>实例数据时间</p>
     * @param CurRunDate <p>实例数据时间</p>
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
     * Get <p>执行机IP</p> 
     * @return BrokerIp <p>执行机IP</p>
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set <p>执行机IP</p>
     * @param BrokerIp <p>执行机IP</p>
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get <p>日志文件名</p> 
     * @return OriginFileName <p>日志文件名</p>
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set <p>日志文件名</p>
     * @param OriginFileName <p>日志文件名</p>
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get <p>执行平台下发执行id</p> 
     * @return ExecutionJobId <p>执行平台下发执行id</p>
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set <p>执行平台下发执行id</p>
     * @param ExecutionJobId <p>执行平台下发执行id</p>
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get <p>日志级别，Info/Debug/Warn/Error/All</p> 
     * @return LogLevelType <p>日志级别，Info/Debug/Warn/Error/All</p>
     */
    public String getLogLevelType() {
        return this.LogLevelType;
    }

    /**
     * Set <p>日志级别，Info/Debug/Warn/Error/All</p>
     * @param LogLevelType <p>日志级别，Info/Debug/Warn/Error/All</p>
     */
    public void setLogLevelType(String LogLevelType) {
        this.LogLevelType = LogLevelType;
    }

    /**
     * Get <p>文件类型,Log/Code</p> 
     * @return ExecutionFileType <p>文件类型,Log/Code</p>
     */
    public String getExecutionFileType() {
        return this.ExecutionFileType;
    }

    /**
     * Set <p>文件类型,Log/Code</p>
     * @param ExecutionFileType <p>文件类型,Log/Code</p>
     */
    public void setExecutionFileType(String ExecutionFileType) {
        this.ExecutionFileType = ExecutionFileType;
    }

    /**
     * Get <p>生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用</p> 
     * @return InstanceLifeDetailDtoList <p>生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用</p>
     */
    public InstanceLifeDetailDto [] getInstanceLifeDetailDtoList() {
        return this.InstanceLifeDetailDtoList;
    }

    /**
     * Set <p>生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用</p>
     * @param InstanceLifeDetailDtoList <p>生命周期为基础数据进行日志匹配。Dynamic=true动态获取日志链路中使用</p>
     */
    public void setInstanceLifeDetailDtoList(InstanceLifeDetailDto [] InstanceLifeDetailDtoList) {
        this.InstanceLifeDetailDtoList = InstanceLifeDetailDtoList;
    }

    /**
     * Get <p>当前生命周期数</p> 
     * @return CurrentLifeRound <p>当前生命周期数</p>
     */
    public Long getCurrentLifeRound() {
        return this.CurrentLifeRound;
    }

    /**
     * Set <p>当前生命周期数</p>
     * @param CurrentLifeRound <p>当前生命周期数</p>
     */
    public void setCurrentLifeRound(Long CurrentLifeRound) {
        this.CurrentLifeRound = CurrentLifeRound;
    }

    /**
     * Get <p>最大生命周期数</p> 
     * @return MaxLifeRound <p>最大生命周期数</p>
     */
    public Long getMaxLifeRound() {
        return this.MaxLifeRound;
    }

    /**
     * Set <p>最大生命周期数</p>
     * @param MaxLifeRound <p>最大生命周期数</p>
     */
    public void setMaxLifeRound(Long MaxLifeRound) {
        this.MaxLifeRound = MaxLifeRound;
    }

    /**
     * Get <p>当前生命周期重试次数</p> 
     * @return Tries <p>当前生命周期重试次数</p>
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set <p>当前生命周期重试次数</p>
     * @param Tries <p>当前生命周期重试次数</p>
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get <p>动态获取日志信息标识</p> 
     * @return Dynamic <p>动态获取日志信息标识</p>
     */
    public Boolean getDynamic() {
        return this.Dynamic;
    }

    /**
     * Set <p>动态获取日志信息标识</p>
     * @param Dynamic <p>动态获取日志信息标识</p>
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

