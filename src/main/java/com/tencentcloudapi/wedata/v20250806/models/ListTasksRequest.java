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

public class ListTasksRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 请求的数据页数。默认值为1，取值大于等于1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 所属工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 责任人ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 任务类型
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 任务状态
* N: 新建 
* Y: 调度中 
* F: 已下线 
* O: 已暂停 
* T: 下线中 
* INVALID: 已失效
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 提交状态
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * BundleId信息
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 创建人ID
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String [] ModifyTime;

    /**
    * 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String [] CreateTime;

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
     * Get 请求的数据页数。默认值为1，取值大于等于1 
     * @return PageNumber 请求的数据页数。默认值为1，取值大于等于1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 请求的数据页数。默认值为1，取值大于等于1
     * @param PageNumber 请求的数据页数。默认值为1，取值大于等于1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200 
     * @return PageSize 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
     * @param PageSize 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 所属工作流ID 
     * @return WorkflowId 所属工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 所属工作流ID
     * @param WorkflowId 所属工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 责任人ID 
     * @return OwnerUin 责任人ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 责任人ID
     * @param OwnerUin 责任人ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 任务类型 
     * @return TaskTypeId 任务类型
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型
     * @param TaskTypeId 任务类型
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 任务状态
* N: 新建 
* Y: 调度中 
* F: 已下线 
* O: 已暂停 
* T: 下线中 
* INVALID: 已失效 
     * @return Status 任务状态
* N: 新建 
* Y: 调度中 
* F: 已下线 
* O: 已暂停 
* T: 下线中 
* INVALID: 已失效
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
* N: 新建 
* Y: 调度中 
* F: 已下线 
* O: 已暂停 
* T: 下线中 
* INVALID: 已失效
     * @param Status 任务状态
* N: 新建 
* Y: 调度中 
* F: 已下线 
* O: 已暂停 
* T: 下线中 
* INVALID: 已失效
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 提交状态 
     * @return Submit 提交状态
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set 提交状态
     * @param Submit 提交状态
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get BundleId信息 
     * @return BundleId BundleId信息
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set BundleId信息
     * @param BundleId BundleId信息
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 创建人ID 
     * @return CreateUserUin 创建人ID
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人ID
     * @param CreateUserUin 创建人ID
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间 
     * @return ModifyTime 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public String [] getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     * @param ModifyTime 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public void setModifyTime(String [] ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间 
     * @return CreateTime 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public String [] getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     * @param CreateTime 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public void setCreateTime(String [] CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ListTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksRequest(ListTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String[source.ModifyTime.length];
            for (int i = 0; i < source.ModifyTime.length; i++) {
                this.ModifyTime[i] = new String(source.ModifyTime[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String[source.CreateTime.length];
            for (int i = 0; i < source.CreateTime.length; i++) {
                this.CreateTime[i] = new String(source.CreateTime[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamArraySimple(map, prefix + "ModifyTime.", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "CreateTime.", this.CreateTime);

    }
}

