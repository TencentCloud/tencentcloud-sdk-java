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

public class DescribeReportTaskListRequest extends AbstractModel {

    /**
    * 页码
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 租户id
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 项目id
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
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 作业id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 引擎任务id
    */
    @SerializedName("EngineTaskId")
    @Expose
    private String EngineTaskId;

    /**
    * 数据来源,DATA_INTEGRATION、DATA_EXPLORATION、DATA_QUALITY、OM_CENTER等
    */
    @SerializedName("ProductSource")
    @Expose
    private String ProductSource;

    /**
    * 主账号
    */
    @SerializedName("OnwerUid")
    @Expose
    private String OnwerUid;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 页码 
     * @return PageNum 页码
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页码
     * @param PageNum 页码
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页条数 
     * @return PageSize 每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
     * @param PageSize 每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 租户id 
     * @return TenantId 租户id
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
     * @param TenantId 租户id
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
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
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 作业id 
     * @return JobId 作业id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业id
     * @param JobId 作业id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 引擎任务id 
     * @return EngineTaskId 引擎任务id
     */
    public String getEngineTaskId() {
        return this.EngineTaskId;
    }

    /**
     * Set 引擎任务id
     * @param EngineTaskId 引擎任务id
     */
    public void setEngineTaskId(String EngineTaskId) {
        this.EngineTaskId = EngineTaskId;
    }

    /**
     * Get 数据来源,DATA_INTEGRATION、DATA_EXPLORATION、DATA_QUALITY、OM_CENTER等 
     * @return ProductSource 数据来源,DATA_INTEGRATION、DATA_EXPLORATION、DATA_QUALITY、OM_CENTER等
     */
    public String getProductSource() {
        return this.ProductSource;
    }

    /**
     * Set 数据来源,DATA_INTEGRATION、DATA_EXPLORATION、DATA_QUALITY、OM_CENTER等
     * @param ProductSource 数据来源,DATA_INTEGRATION、DATA_EXPLORATION、DATA_QUALITY、OM_CENTER等
     */
    public void setProductSource(String ProductSource) {
        this.ProductSource = ProductSource;
    }

    /**
     * Get 主账号 
     * @return OnwerUid 主账号
     */
    public String getOnwerUid() {
        return this.OnwerUid;
    }

    /**
     * Set 主账号
     * @param OnwerUid 主账号
     */
    public void setOnwerUid(String OnwerUid) {
        this.OnwerUid = OnwerUid;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeReportTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportTaskListRequest(DescribeReportTaskListRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.EngineTaskId != null) {
            this.EngineTaskId = new String(source.EngineTaskId);
        }
        if (source.ProductSource != null) {
            this.ProductSource = new String(source.ProductSource);
        }
        if (source.OnwerUid != null) {
            this.OnwerUid = new String(source.OnwerUid);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EngineTaskId", this.EngineTaskId);
        this.setParamSimple(map, prefix + "ProductSource", this.ProductSource);
        this.setParamSimple(map, prefix + "OnwerUid", this.OnwerUid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

