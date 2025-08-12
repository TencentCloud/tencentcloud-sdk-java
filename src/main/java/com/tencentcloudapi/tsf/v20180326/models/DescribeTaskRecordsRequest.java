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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskRecordsRequest extends AbstractModel {

    /**
    * 翻页偏移量。默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页查询单页数量。默认值为 20，最大值为 1000
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
    * 任务启用状态。一共2种状态可选，ENABLED：启用，DISABLED：停用
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;

    /**
    * 部署组ID。前往应用管理 - 应用部署，部署组列表页面获取部署组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 任务类型。当前只支持一种任务类型。枚举值，java：Java类任务
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务执行方式，unicast：随机单节点执行，broadcast：广播执行，shard：分片执行
    */
    @SerializedName("ExecuteType")
    @Expose
    private String ExecuteType;

    /**
    * 任务ID列表。
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
     * Get 翻页偏移量。默认值为0 
     * @return Offset 翻页偏移量。默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量。默认值为0
     * @param Offset 翻页偏移量。默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页查询单页数量。默认值为 20，最大值为 1000 
     * @return Limit 翻页查询单页数量。默认值为 20，最大值为 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页查询单页数量。默认值为 20，最大值为 1000
     * @param Limit 翻页查询单页数量。默认值为 20，最大值为 1000
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
     * Get 任务启用状态。一共2种状态可选，ENABLED：启用，DISABLED：停用 
     * @return TaskState 任务启用状态。一共2种状态可选，ENABLED：启用，DISABLED：停用
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * Set 任务启用状态。一共2种状态可选，ENABLED：启用，DISABLED：停用
     * @param TaskState 任务启用状态。一共2种状态可选，ENABLED：启用，DISABLED：停用
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * Get 部署组ID。前往应用管理 - 应用部署，部署组列表页面获取部署组ID。 
     * @return GroupId 部署组ID。前往应用管理 - 应用部署，部署组列表页面获取部署组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID。前往应用管理 - 应用部署，部署组列表页面获取部署组ID。
     * @param GroupId 部署组ID。前往应用管理 - 应用部署，部署组列表页面获取部署组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 任务类型。当前只支持一种任务类型。枚举值，java：Java类任务 
     * @return TaskType 任务类型。当前只支持一种任务类型。枚举值，java：Java类任务
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。当前只支持一种任务类型。枚举值，java：Java类任务
     * @param TaskType 任务类型。当前只支持一种任务类型。枚举值，java：Java类任务
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务执行方式，unicast：随机单节点执行，broadcast：广播执行，shard：分片执行 
     * @return ExecuteType 任务执行方式，unicast：随机单节点执行，broadcast：广播执行，shard：分片执行
     */
    public String getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set 任务执行方式，unicast：随机单节点执行，broadcast：广播执行，shard：分片执行
     * @param ExecuteType 任务执行方式，unicast：随机单节点执行，broadcast：广播执行，shard：分片执行
     */
    public void setExecuteType(String ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get 任务ID列表。 
     * @return Ids 任务ID列表。
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set 任务ID列表。
     * @param Ids 任务ID列表。
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

