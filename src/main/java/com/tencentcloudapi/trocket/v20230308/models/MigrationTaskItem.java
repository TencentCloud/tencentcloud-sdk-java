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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationTaskItem extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0 - 未指定（存量）
1 - 元数据导入
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 主题总数
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 消费组总数
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * 任务状态： 0，迁移中 1，迁移成功 2，迁移完成，只有部分数据完成迁移
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0 - 未指定（存量）
1 - 元数据导入 
     * @return Type 0 - 未指定（存量）
1 - 元数据导入
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 - 未指定（存量）
1 - 元数据导入
     * @param Type 0 - 未指定（存量）
1 - 元数据导入
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 主题总数 
     * @return TopicNum 主题总数
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set 主题总数
     * @param TopicNum 主题总数
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 消费组总数 
     * @return GroupNum 消费组总数
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set 消费组总数
     * @param GroupNum 消费组总数
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get 任务状态： 0，迁移中 1，迁移成功 2，迁移完成，只有部分数据完成迁移 
     * @return Status 任务状态： 0，迁移中 1，迁移成功 2，迁移完成，只有部分数据完成迁移
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态： 0，迁移中 1，迁移成功 2，迁移完成，只有部分数据完成迁移
     * @param Status 任务状态： 0，迁移中 1，迁移成功 2，迁移完成，只有部分数据完成迁移
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public MigrationTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationTaskItem(MigrationTaskItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

