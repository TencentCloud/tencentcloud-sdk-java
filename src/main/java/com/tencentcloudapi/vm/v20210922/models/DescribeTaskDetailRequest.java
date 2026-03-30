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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailRequest extends AbstractModel {

    /**
    * <p>任务ID，创建任务后返回的TaskId字段</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>是否展示所有分片，默认只展示命中规则的分片</p>
    */
    @SerializedName("ShowAllSegments")
    @Expose
    private Boolean ShowAllSegments;

    /**
     * Get <p>任务ID，创建任务后返回的TaskId字段</p> 
     * @return TaskId <p>任务ID，创建任务后返回的TaskId字段</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID，创建任务后返回的TaskId字段</p>
     * @param TaskId <p>任务ID，创建任务后返回的TaskId字段</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>是否展示所有分片，默认只展示命中规则的分片</p> 
     * @return ShowAllSegments <p>是否展示所有分片，默认只展示命中规则的分片</p>
     */
    public Boolean getShowAllSegments() {
        return this.ShowAllSegments;
    }

    /**
     * Set <p>是否展示所有分片，默认只展示命中规则的分片</p>
     * @param ShowAllSegments <p>是否展示所有分片，默认只展示命中规则的分片</p>
     */
    public void setShowAllSegments(Boolean ShowAllSegments) {
        this.ShowAllSegments = ShowAllSegments;
    }

    public DescribeTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailRequest(DescribeTaskDetailRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ShowAllSegments != null) {
            this.ShowAllSegments = new Boolean(source.ShowAllSegments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ShowAllSegments", this.ShowAllSegments);

    }
}

