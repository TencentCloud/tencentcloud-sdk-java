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

public class DescribeRelatedTasksByTaskIdRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 当前页码，从1开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 单页大小，最大200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询直接依赖方向，如UP表示上游、DOWN表示下游
    */
    @SerializedName("DependencyDirection")
    @Expose
    private String DependencyDirection;

    /**
    * 查询开发环境还是生产环境版本，DEV表示开发环境、PROD表示生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 任务名称，模糊搜索
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务调度周期,I：分支；H：小时；D：天；W：周；M：月；Y：年；O：一次性。
    */
    @SerializedName("CycleTypeList")
    @Expose
    private String [] CycleTypeList;

    /**
    * 任务状态，N：新建； Y：调度中； O：已暂停；F：已下线；INVALID：已失效
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

    /**
    * 任务责任人名
    */
    @SerializedName("OwnerNameList")
    @Expose
    private String [] OwnerNameList;

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
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 当前页码，从1开始 
     * @return PageNumber 当前页码，从1开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页码，从1开始
     * @param PageNumber 当前页码，从1开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 单页大小，最大200 
     * @return PageSize 单页大小，最大200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 单页大小，最大200
     * @param PageSize 单页大小，最大200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询直接依赖方向，如UP表示上游、DOWN表示下游 
     * @return DependencyDirection 查询直接依赖方向，如UP表示上游、DOWN表示下游
     */
    public String getDependencyDirection() {
        return this.DependencyDirection;
    }

    /**
     * Set 查询直接依赖方向，如UP表示上游、DOWN表示下游
     * @param DependencyDirection 查询直接依赖方向，如UP表示上游、DOWN表示下游
     */
    public void setDependencyDirection(String DependencyDirection) {
        this.DependencyDirection = DependencyDirection;
    }

    /**
     * Get 查询开发环境还是生产环境版本，DEV表示开发环境、PROD表示生产环境 
     * @return Environment 查询开发环境还是生产环境版本，DEV表示开发环境、PROD表示生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 查询开发环境还是生产环境版本，DEV表示开发环境、PROD表示生产环境
     * @param Environment 查询开发环境还是生产环境版本，DEV表示开发环境、PROD表示生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 任务名称，模糊搜索 
     * @return TaskName 任务名称，模糊搜索
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称，模糊搜索
     * @param TaskName 任务名称，模糊搜索
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务调度周期,I：分支；H：小时；D：天；W：周；M：月；Y：年；O：一次性。 
     * @return CycleTypeList 任务调度周期,I：分支；H：小时；D：天；W：周；M：月；Y：年；O：一次性。
     */
    public String [] getCycleTypeList() {
        return this.CycleTypeList;
    }

    /**
     * Set 任务调度周期,I：分支；H：小时；D：天；W：周；M：月；Y：年；O：一次性。
     * @param CycleTypeList 任务调度周期,I：分支；H：小时；D：天；W：周；M：月；Y：年；O：一次性。
     */
    public void setCycleTypeList(String [] CycleTypeList) {
        this.CycleTypeList = CycleTypeList;
    }

    /**
     * Get 任务状态，N：新建； Y：调度中； O：已暂停；F：已下线；INVALID：已失效 
     * @return StatusList 任务状态，N：新建； Y：调度中； O：已暂停；F：已下线；INVALID：已失效
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 任务状态，N：新建； Y：调度中； O：已暂停；F：已下线；INVALID：已失效
     * @param StatusList 任务状态，N：新建； Y：调度中； O：已暂停；F：已下线；INVALID：已失效
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get 任务责任人名 
     * @return OwnerNameList 任务责任人名
     */
    public String [] getOwnerNameList() {
        return this.OwnerNameList;
    }

    /**
     * Set 任务责任人名
     * @param OwnerNameList 任务责任人名
     */
    public void setOwnerNameList(String [] OwnerNameList) {
        this.OwnerNameList = OwnerNameList;
    }

    public DescribeRelatedTasksByTaskIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedTasksByTaskIdRequest(DescribeRelatedTasksByTaskIdRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        if (source.DependencyDirection != null) {
            this.DependencyDirection = new String(source.DependencyDirection);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CycleTypeList != null) {
            this.CycleTypeList = new String[source.CycleTypeList.length];
            for (int i = 0; i < source.CycleTypeList.length; i++) {
                this.CycleTypeList[i] = new String(source.CycleTypeList[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
        if (source.OwnerNameList != null) {
            this.OwnerNameList = new String[source.OwnerNameList.length];
            for (int i = 0; i < source.OwnerNameList.length; i++) {
                this.OwnerNameList[i] = new String(source.OwnerNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DependencyDirection", this.DependencyDirection);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamArraySimple(map, prefix + "CycleTypeList.", this.CycleTypeList);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamArraySimple(map, prefix + "OwnerNameList.", this.OwnerNameList);

    }
}

