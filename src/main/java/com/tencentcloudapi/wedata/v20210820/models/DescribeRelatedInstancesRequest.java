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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelatedInstancesRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 距离当前任务的层级距离，-1表示取父节点，1表示子节点
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * 页号，默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小，默认为10，最大不超过200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get 数据时间，格式yyyy-MM-dd HH:mm:ss 
     * @return CurRunDate 数据时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间，格式yyyy-MM-dd HH:mm:ss
     * @param CurRunDate 数据时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 距离当前任务的层级距离，-1表示取父节点，1表示子节点 
     * @return Depth 距离当前任务的层级距离，-1表示取父节点，1表示子节点
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set 距离当前任务的层级距离，-1表示取父节点，1表示子节点
     * @param Depth 距离当前任务的层级距离，-1表示取父节点，1表示子节点
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get 页号，默认为1 
     * @return PageNumber 页号，默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页号，默认为1
     * @param PageNumber 页号，默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小，默认为10，最大不超过200 
     * @return PageSize 页大小，默认为10，最大不超过200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小，默认为10，最大不超过200
     * @param PageSize 页大小，默认为10，最大不超过200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeRelatedInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedInstancesRequest(DescribeRelatedInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

