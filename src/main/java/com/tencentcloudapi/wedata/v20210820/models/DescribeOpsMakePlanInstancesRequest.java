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

public class DescribeOpsMakePlanInstancesRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 补录计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 补录任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 分页页码，默认值1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小，默认值10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 实例状态列表
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

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
     * Get 补录计划ID 
     * @return PlanId 补录计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 补录计划ID
     * @param PlanId 补录计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 补录任务ID 
     * @return TaskId 补录任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 补录任务ID
     * @param TaskId 补录任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 分页页码，默认值1 
     * @return PageNumber 分页页码，默认值1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码，默认值1
     * @param PageNumber 分页页码，默认值1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小，默认值10 
     * @return PageSize 分页大小，默认值10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认值10
     * @param PageSize 分页大小，默认值10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 实例状态列表 
     * @return StateList 实例状态列表
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 实例状态列表
     * @param StateList 实例状态列表
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
    }

    public DescribeOpsMakePlanInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOpsMakePlanInstancesRequest(DescribeOpsMakePlanInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);

    }
}

