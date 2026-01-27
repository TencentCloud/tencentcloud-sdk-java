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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRebuildIndexTasksRequest extends AbstractModel {

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>索引重建任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>索引重建任务状态，不填返回所有状态任务列表，多种状态之间用逗号分隔。</p><p>枚举值：</p><ul><li>0： 索引重建任务已创建</li><li>1： 正在创建索引重建资源</li><li>2： 已创建索引重建资源</li><li>3： 重建中</li><li>4： 暂停</li><li>5： 重建完成</li><li>6： 重建成功（可检索）</li><li>7： 重建失败</li><li>8： 任务取消</li><li>9： 元数据和索引已删除</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>分页的偏移量，默认值为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页单页限制数目，默认值为10，最大值20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>日志主题ID</p> 
     * @return TopicId <p>日志主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param TopicId <p>日志主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>索引重建任务ID</p> 
     * @return TaskId <p>索引重建任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>索引重建任务ID</p>
     * @param TaskId <p>索引重建任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>索引重建任务状态，不填返回所有状态任务列表，多种状态之间用逗号分隔。</p><p>枚举值：</p><ul><li>0： 索引重建任务已创建</li><li>1： 正在创建索引重建资源</li><li>2： 已创建索引重建资源</li><li>3： 重建中</li><li>4： 暂停</li><li>5： 重建完成</li><li>6： 重建成功（可检索）</li><li>7： 重建失败</li><li>8： 任务取消</li><li>9： 元数据和索引已删除</li></ul> 
     * @return Status <p>索引重建任务状态，不填返回所有状态任务列表，多种状态之间用逗号分隔。</p><p>枚举值：</p><ul><li>0： 索引重建任务已创建</li><li>1： 正在创建索引重建资源</li><li>2： 已创建索引重建资源</li><li>3： 重建中</li><li>4： 暂停</li><li>5： 重建完成</li><li>6： 重建成功（可检索）</li><li>7： 重建失败</li><li>8： 任务取消</li><li>9： 元数据和索引已删除</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>索引重建任务状态，不填返回所有状态任务列表，多种状态之间用逗号分隔。</p><p>枚举值：</p><ul><li>0： 索引重建任务已创建</li><li>1： 正在创建索引重建资源</li><li>2： 已创建索引重建资源</li><li>3： 重建中</li><li>4： 暂停</li><li>5： 重建完成</li><li>6： 重建成功（可检索）</li><li>7： 重建失败</li><li>8： 任务取消</li><li>9： 元数据和索引已删除</li></ul>
     * @param Status <p>索引重建任务状态，不填返回所有状态任务列表，多种状态之间用逗号分隔。</p><p>枚举值：</p><ul><li>0： 索引重建任务已创建</li><li>1： 正在创建索引重建资源</li><li>2： 已创建索引重建资源</li><li>3： 重建中</li><li>4： 暂停</li><li>5： 重建完成</li><li>6： 重建成功（可检索）</li><li>7： 重建失败</li><li>8： 任务取消</li><li>9： 元数据和索引已删除</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>分页的偏移量，默认值为0。</p> 
     * @return Offset <p>分页的偏移量，默认值为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页的偏移量，默认值为0。</p>
     * @param Offset <p>分页的偏移量，默认值为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页单页限制数目，默认值为10，最大值20。</p> 
     * @return Limit <p>分页单页限制数目，默认值为10，最大值20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页单页限制数目，默认值为10，最大值20。</p>
     * @param Limit <p>分页单页限制数目，默认值为10，最大值20。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRebuildIndexTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRebuildIndexTasksRequest(DescribeRebuildIndexTasksRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

