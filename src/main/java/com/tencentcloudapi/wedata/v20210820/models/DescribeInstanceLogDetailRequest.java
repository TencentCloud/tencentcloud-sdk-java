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

public class DescribeInstanceLogDetailRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

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
    * 统一执行平台执行id
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * 服务器Ip
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 文件Name
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * 起始行
    */
    @SerializedName("StartCount")
    @Expose
    private Long StartCount;

    /**
    * 每次查询行数
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * 查询日志扩展信息,通过统一执行平台接口分页查询日志时需要带上,第一页时为null
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

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
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据时间 
     * @return CurRunDate 数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间
     * @param CurRunDate 数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
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
     * Get 统一执行平台执行id 
     * @return ExecutionJobId 统一执行平台执行id
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set 统一执行平台执行id
     * @param ExecutionJobId 统一执行平台执行id
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get 服务器Ip 
     * @return BrokerIp 服务器Ip
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 服务器Ip
     * @param BrokerIp 服务器Ip
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 文件Name 
     * @return OriginFileName 文件Name
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set 文件Name
     * @param OriginFileName 文件Name
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get 起始行 
     * @return StartCount 起始行
     */
    public Long getStartCount() {
        return this.StartCount;
    }

    /**
     * Set 起始行
     * @param StartCount 起始行
     */
    public void setStartCount(Long StartCount) {
        this.StartCount = StartCount;
    }

    /**
     * Get 每次查询行数 
     * @return LineCount 每次查询行数
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set 每次查询行数
     * @param LineCount 每次查询行数
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get 查询日志扩展信息,通过统一执行平台接口分页查询日志时需要带上,第一页时为null 
     * @return ExtInfo 查询日志扩展信息,通过统一执行平台接口分页查询日志时需要带上,第一页时为null
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 查询日志扩展信息,通过统一执行平台接口分页查询日志时需要带上,第一页时为null
     * @param ExtInfo 查询日志扩展信息,通过统一执行平台接口分页查询日志时需要带上,第一页时为null
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
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

    public DescribeInstanceLogDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLogDetailRequest(DescribeInstanceLogDetailRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.LogLevelType != null) {
            this.LogLevelType = new String(source.LogLevelType);
        }
        if (source.ExecutionFileType != null) {
            this.ExecutionFileType = new String(source.ExecutionFileType);
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
        if (source.StartCount != null) {
            this.StartCount = new Long(source.StartCount);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "LogLevelType", this.LogLevelType);
        this.setParamSimple(map, prefix + "ExecutionFileType", this.ExecutionFileType);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "StartCount", this.StartCount);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);

    }
}

