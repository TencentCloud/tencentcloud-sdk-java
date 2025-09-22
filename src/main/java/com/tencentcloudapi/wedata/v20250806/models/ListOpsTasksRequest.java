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

public class ListOpsTasksRequest extends AbstractModel {

    /**
    * 项目Id	
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * 分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * 任务类型Id 
 - 20：通用数据同步
 - 25：ETLTaskType
 - 26：ETLTaskType
 - 30：python
 - 31：pyspark
 - 34：HiveSQLTaskType
 - 35：shell
 - 36：SparkSQLTaskType
 - 21：JDBCSQLTaskType
 - 32：DLCTaskType
 - 33：ImpalaTaskType
 - 40：CDWTaskType
 - 41：kettle
 - 46：DLCSparkTaskType
 - 47：TiOne机器学习
 - 48：TrinoTaskType
 - 50：DLCPyspark39：spark
 - 92：mr
 - 38：shell脚本
 - 70：hivesql脚本
 - 1000：自定义业务通用
    */
    @SerializedName("TaskTypeId")
    @Expose
    private String TaskTypeId;

    /**
    * 工作流Id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 责任人id
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 文件夹Id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 数据源id
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * 目标数据源id
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * 资源组id
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 任务状态:
- Y: 运行
- F: 停止
- O: 冻结
- T: 停止中
- INVALID: 已失效
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 时区, 默认默认UTC+8
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 项目Id	 
     * @return ProjectId 项目Id	
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id	
     * @param ProjectId 项目Id	
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码 
     * @return PageNumber 分页页码
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码
     * @param PageNumber 分页页码
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 任务类型Id 
 - 20：通用数据同步
 - 25：ETLTaskType
 - 26：ETLTaskType
 - 30：python
 - 31：pyspark
 - 34：HiveSQLTaskType
 - 35：shell
 - 36：SparkSQLTaskType
 - 21：JDBCSQLTaskType
 - 32：DLCTaskType
 - 33：ImpalaTaskType
 - 40：CDWTaskType
 - 41：kettle
 - 46：DLCSparkTaskType
 - 47：TiOne机器学习
 - 48：TrinoTaskType
 - 50：DLCPyspark39：spark
 - 92：mr
 - 38：shell脚本
 - 70：hivesql脚本
 - 1000：自定义业务通用 
     * @return TaskTypeId 任务类型Id 
 - 20：通用数据同步
 - 25：ETLTaskType
 - 26：ETLTaskType
 - 30：python
 - 31：pyspark
 - 34：HiveSQLTaskType
 - 35：shell
 - 36：SparkSQLTaskType
 - 21：JDBCSQLTaskType
 - 32：DLCTaskType
 - 33：ImpalaTaskType
 - 40：CDWTaskType
 - 41：kettle
 - 46：DLCSparkTaskType
 - 47：TiOne机器学习
 - 48：TrinoTaskType
 - 50：DLCPyspark39：spark
 - 92：mr
 - 38：shell脚本
 - 70：hivesql脚本
 - 1000：自定义业务通用
     */
    public String getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型Id 
 - 20：通用数据同步
 - 25：ETLTaskType
 - 26：ETLTaskType
 - 30：python
 - 31：pyspark
 - 34：HiveSQLTaskType
 - 35：shell
 - 36：SparkSQLTaskType
 - 21：JDBCSQLTaskType
 - 32：DLCTaskType
 - 33：ImpalaTaskType
 - 40：CDWTaskType
 - 41：kettle
 - 46：DLCSparkTaskType
 - 47：TiOne机器学习
 - 48：TrinoTaskType
 - 50：DLCPyspark39：spark
 - 92：mr
 - 38：shell脚本
 - 70：hivesql脚本
 - 1000：自定义业务通用
     * @param TaskTypeId 任务类型Id 
 - 20：通用数据同步
 - 25：ETLTaskType
 - 26：ETLTaskType
 - 30：python
 - 31：pyspark
 - 34：HiveSQLTaskType
 - 35：shell
 - 36：SparkSQLTaskType
 - 21：JDBCSQLTaskType
 - 32：DLCTaskType
 - 33：ImpalaTaskType
 - 40：CDWTaskType
 - 41：kettle
 - 46：DLCSparkTaskType
 - 47：TiOne机器学习
 - 48：TrinoTaskType
 - 50：DLCPyspark39：spark
 - 92：mr
 - 38：shell脚本
 - 70：hivesql脚本
 - 1000：自定义业务通用
     */
    public void setTaskTypeId(String TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 工作流Id 
     * @return WorkflowId 工作流Id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流Id
     * @param WorkflowId 工作流Id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流名称 
     * @return WorkflowName 工作流名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
     * @param WorkflowName 工作流名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 责任人id 
     * @return OwnerUin 责任人id
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 责任人id
     * @param OwnerUin 责任人id
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 文件夹Id 
     * @return FolderId 文件夹Id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹Id
     * @param FolderId 文件夹Id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 数据源id 
     * @return SourceServiceId 数据源id
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set 数据源id
     * @param SourceServiceId 数据源id
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get 目标数据源id 
     * @return TargetServiceId 目标数据源id
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set 目标数据源id
     * @param TargetServiceId 目标数据源id
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get 资源组id 
     * @return ExecutorGroupId 资源组id
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 资源组id
     * @param ExecutorGroupId 资源组id
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型 
     * @return CycleType 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
     * @param CycleType 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 任务状态:
- Y: 运行
- F: 停止
- O: 冻结
- T: 停止中
- INVALID: 已失效 
     * @return Status 任务状态:
- Y: 运行
- F: 停止
- O: 冻结
- T: 停止中
- INVALID: 已失效
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态:
- Y: 运行
- F: 停止
- O: 冻结
- T: 停止中
- INVALID: 已失效
     * @param Status 任务状态:
- Y: 运行
- F: 停止
- O: 冻结
- T: 停止中
- INVALID: 已失效
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 时区, 默认默认UTC+8 
     * @return TimeZone 时区, 默认默认UTC+8
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区, 默认默认UTC+8
     * @param TimeZone 时区, 默认默认UTC+8
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public ListOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOpsTasksRequest(ListOpsTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new String(source.PageNumber);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new String(source.TaskTypeId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

