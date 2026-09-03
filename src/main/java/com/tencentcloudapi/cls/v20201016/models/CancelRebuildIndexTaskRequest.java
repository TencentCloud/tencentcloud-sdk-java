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

public class CancelRebuildIndexTaskRequest extends AbstractModel {

    /**
    * <p>日志主题ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>索引重建任务ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/127535">DescribeRebuildIndexTasks</a></p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get <p>日志主题ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></p> 
     * @return TopicId <p>日志主题ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></p>
     * @param TopicId <p>日志主题ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>索引重建任务ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/127535">DescribeRebuildIndexTasks</a></p> 
     * @return TaskId <p>索引重建任务ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/127535">DescribeRebuildIndexTasks</a></p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>索引重建任务ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/127535">DescribeRebuildIndexTasks</a></p>
     * @param TaskId <p>索引重建任务ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/614/127535">DescribeRebuildIndexTasks</a></p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public CancelRebuildIndexTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelRebuildIndexTaskRequest(CancelRebuildIndexTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

