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

public class ListTaskVersionsRequest extends AbstractModel {

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
    * <p>保存版本：SAVE<br>提交版本：SUBMIT<br>默认为SAVE</p>
    */
    @SerializedName("TaskVersionType")
    @Expose
    private String TaskVersionType;

    /**
    * <p>请求的数据页数。默认值为1，取值大于等于1。</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>是否为使用版本</p>
    */
    @SerializedName("UsedVersion")
    @Expose
    private Boolean UsedVersion;

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
     * Get <p>保存版本：SAVE<br>提交版本：SUBMIT<br>默认为SAVE</p> 
     * @return TaskVersionType <p>保存版本：SAVE<br>提交版本：SUBMIT<br>默认为SAVE</p>
     */
    public String getTaskVersionType() {
        return this.TaskVersionType;
    }

    /**
     * Set <p>保存版本：SAVE<br>提交版本：SUBMIT<br>默认为SAVE</p>
     * @param TaskVersionType <p>保存版本：SAVE<br>提交版本：SUBMIT<br>默认为SAVE</p>
     */
    public void setTaskVersionType(String TaskVersionType) {
        this.TaskVersionType = TaskVersionType;
    }

    /**
     * Get <p>请求的数据页数。默认值为1，取值大于等于1。</p> 
     * @return PageNumber <p>请求的数据页数。默认值为1，取值大于等于1。</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>请求的数据页数。默认值为1，取值大于等于1。</p>
     * @param PageNumber <p>请求的数据页数。默认值为1，取值大于等于1。</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。</p> 
     * @return PageSize <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。</p>
     * @param PageSize <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>是否为使用版本</p> 
     * @return UsedVersion <p>是否为使用版本</p>
     */
    public Boolean getUsedVersion() {
        return this.UsedVersion;
    }

    /**
     * Set <p>是否为使用版本</p>
     * @param UsedVersion <p>是否为使用版本</p>
     */
    public void setUsedVersion(Boolean UsedVersion) {
        this.UsedVersion = UsedVersion;
    }

    public ListTaskVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskVersionsRequest(ListTaskVersionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskVersionType != null) {
            this.TaskVersionType = new String(source.TaskVersionType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.UsedVersion != null) {
            this.UsedVersion = new Boolean(source.UsedVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskVersionType", this.TaskVersionType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "UsedVersion", this.UsedVersion);

    }
}

