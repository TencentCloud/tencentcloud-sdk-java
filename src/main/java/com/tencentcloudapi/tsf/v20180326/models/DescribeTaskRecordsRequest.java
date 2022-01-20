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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskRecordsRequest extends AbstractModel{

    /**
    * 翻页偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页查询单页数量。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 模糊查询关键字，支持任务ID和任务名称。
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 任务启用状态。enabled/disabled
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;

    /**
    * 分组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 任务类型。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务触发类型，UNICAST、BROADCAST。
    */
    @SerializedName("ExecuteType")
    @Expose
    private String ExecuteType;

    /**
    * 无
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
     * Get 翻页偏移量。 
     * @return Offset 翻页偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量。
     * @param Offset 翻页偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页查询单页数量。 
     * @return Limit 翻页查询单页数量。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页查询单页数量。
     * @param Limit 翻页查询单页数量。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 模糊查询关键字，支持任务ID和任务名称。 
     * @return SearchWord 模糊查询关键字，支持任务ID和任务名称。
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 模糊查询关键字，支持任务ID和任务名称。
     * @param SearchWord 模糊查询关键字，支持任务ID和任务名称。
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 任务启用状态。enabled/disabled 
     * @return TaskState 任务启用状态。enabled/disabled
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * Set 任务启用状态。enabled/disabled
     * @param TaskState 任务启用状态。enabled/disabled
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * Get 分组ID。 
     * @return GroupId 分组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID。
     * @param GroupId 分组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 任务类型。 
     * @return TaskType 任务类型。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。
     * @param TaskType 任务类型。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务触发类型，UNICAST、BROADCAST。 
     * @return ExecuteType 任务触发类型，UNICAST、BROADCAST。
     */
    public String getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set 任务触发类型，UNICAST、BROADCAST。
     * @param ExecuteType 任务触发类型，UNICAST、BROADCAST。
     */
    public void setExecuteType(String ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get 无 
     * @return Ids 无
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set 无
     * @param Ids 无
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    public DescribeTaskRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskRecordsRequest(DescribeTaskRecordsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.TaskState != null) {
            this.TaskState = new String(source.TaskState);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new String(source.ExecuteType);
        }
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

