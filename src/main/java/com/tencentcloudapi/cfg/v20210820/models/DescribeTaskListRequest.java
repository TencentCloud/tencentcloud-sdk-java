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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskListRequest extends AbstractModel {

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 演练名称
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * 标签键
    */
    @SerializedName("TaskTag")
    @Expose
    private String [] TaskTag;

    /**
    * 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 开始时间，固定格式%Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * 结束时间，固定格式%Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * 更新时间，固定格式%Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskUpdateTime")
    @Expose
    private String TaskUpdateTime;

    /**
    * 标签对
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
    * 筛选条件
    */
    @SerializedName("Filters")
    @Expose
    private ActionFilter [] Filters;

    /**
    * 演练ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long [] TaskId;

    /**
    * 关联应用ID筛选
    */
    @SerializedName("ApplicationId")
    @Expose
    private String [] ApplicationId;

    /**
    * 关联应用筛选
    */
    @SerializedName("ApplicationName")
    @Expose
    private String [] ApplicationName;

    /**
    * 任务状态筛选--支持多选 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
    */
    @SerializedName("TaskStatusList")
    @Expose
    private Long [] TaskStatusList;

    /**
    * 架构ID
    */
    @SerializedName("ArchId")
    @Expose
    private String ArchId;

    /**
    * 架构名称
    */
    @SerializedName("ArchName")
    @Expose
    private String ArchName;

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 演练名称 
     * @return TaskTitle 演练名称
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set 演练名称
     * @param TaskTitle 演练名称
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get 标签键 
     * @return TaskTag 标签键
     */
    public String [] getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set 标签键
     * @param TaskTag 标签键
     */
    public void setTaskTag(String [] TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束) 
     * @return TaskStatus 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
     * @param TaskStatus 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 开始时间，固定格式%Y-%m-%d %H:%M:%S 
     * @return TaskStartTime 开始时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set 开始时间，固定格式%Y-%m-%d %H:%M:%S
     * @param TaskStartTime 开始时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get 结束时间，固定格式%Y-%m-%d %H:%M:%S 
     * @return TaskEndTime 结束时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set 结束时间，固定格式%Y-%m-%d %H:%M:%S
     * @param TaskEndTime 结束时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get 更新时间，固定格式%Y-%m-%d %H:%M:%S 
     * @return TaskUpdateTime 更新时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public String getTaskUpdateTime() {
        return this.TaskUpdateTime;
    }

    /**
     * Set 更新时间，固定格式%Y-%m-%d %H:%M:%S
     * @param TaskUpdateTime 更新时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public void setTaskUpdateTime(String TaskUpdateTime) {
        this.TaskUpdateTime = TaskUpdateTime;
    }

    /**
     * Get 标签对 
     * @return Tags 标签对
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签对
     * @param Tags 标签对
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 筛选条件 
     * @return Filters 筛选条件
     */
    public ActionFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件
     * @param Filters 筛选条件
     */
    public void setFilters(ActionFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 演练ID 
     * @return TaskId 演练ID
     */
    public Long [] getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 演练ID
     * @param TaskId 演练ID
     */
    public void setTaskId(Long [] TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 关联应用ID筛选 
     * @return ApplicationId 关联应用ID筛选
     */
    public String [] getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 关联应用ID筛选
     * @param ApplicationId 关联应用ID筛选
     */
    public void setApplicationId(String [] ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 关联应用筛选 
     * @return ApplicationName 关联应用筛选
     */
    public String [] getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 关联应用筛选
     * @param ApplicationName 关联应用筛选
     */
    public void setApplicationName(String [] ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 任务状态筛选--支持多选 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束) 
     * @return TaskStatusList 任务状态筛选--支持多选 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
     */
    public Long [] getTaskStatusList() {
        return this.TaskStatusList;
    }

    /**
     * Set 任务状态筛选--支持多选 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
     * @param TaskStatusList 任务状态筛选--支持多选 任务状态(1001 -- 未开始 1002 -- 进行中 1003 -- 暂停中 1004 -- 任务结束)
     */
    public void setTaskStatusList(Long [] TaskStatusList) {
        this.TaskStatusList = TaskStatusList;
    }

    /**
     * Get 架构ID 
     * @return ArchId 架构ID
     */
    public String getArchId() {
        return this.ArchId;
    }

    /**
     * Set 架构ID
     * @param ArchId 架构ID
     */
    public void setArchId(String ArchId) {
        this.ArchId = ArchId;
    }

    /**
     * Get 架构名称 
     * @return ArchName 架构名称
     */
    public String getArchName() {
        return this.ArchName;
    }

    /**
     * Set 架构名称
     * @param ArchName 架构名称
     */
    public void setArchName(String ArchName) {
        this.ArchName = ArchName;
    }

    public DescribeTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskListRequest(DescribeTaskListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskTag != null) {
            this.TaskTag = new String[source.TaskTag.length];
            for (int i = 0; i < source.TaskTag.length; i++) {
                this.TaskTag[i] = new String(source.TaskTag[i]);
            }
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.TaskUpdateTime != null) {
            this.TaskUpdateTime = new String(source.TaskUpdateTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new ActionFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ActionFilter(source.Filters[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new Long[source.TaskId.length];
            for (int i = 0; i < source.TaskId.length; i++) {
                this.TaskId[i] = new Long(source.TaskId[i]);
            }
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String[source.ApplicationId.length];
            for (int i = 0; i < source.ApplicationId.length; i++) {
                this.ApplicationId[i] = new String(source.ApplicationId[i]);
            }
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String[source.ApplicationName.length];
            for (int i = 0; i < source.ApplicationName.length; i++) {
                this.ApplicationName[i] = new String(source.ApplicationName[i]);
            }
        }
        if (source.TaskStatusList != null) {
            this.TaskStatusList = new Long[source.TaskStatusList.length];
            for (int i = 0; i < source.TaskStatusList.length; i++) {
                this.TaskStatusList[i] = new Long(source.TaskStatusList[i]);
            }
        }
        if (source.ArchId != null) {
            this.ArchId = new String(source.ArchId);
        }
        if (source.ArchName != null) {
            this.ArchName = new String(source.ArchName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamArraySimple(map, prefix + "TaskTag.", this.TaskTag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "TaskUpdateTime", this.TaskUpdateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "TaskId.", this.TaskId);
        this.setParamArraySimple(map, prefix + "ApplicationId.", this.ApplicationId);
        this.setParamArraySimple(map, prefix + "ApplicationName.", this.ApplicationName);
        this.setParamArraySimple(map, prefix + "TaskStatusList.", this.TaskStatusList);
        this.setParamSimple(map, prefix + "ArchId", this.ArchId);
        this.setParamSimple(map, prefix + "ArchName", this.ArchName);

    }
}

