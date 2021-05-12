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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailRequest extends AbstractModel{

    /**
    * 任务ID，创建任务后返回的TaskId字段
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 是否展示所有分片，默认只展示命中规则的分片
    */
    @SerializedName("ShowAllSegments")
    @Expose
    private Boolean ShowAllSegments;

    /**
     * Get 任务ID，创建任务后返回的TaskId字段 
     * @return TaskId 任务ID，创建任务后返回的TaskId字段
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，创建任务后返回的TaskId字段
     * @param TaskId 任务ID，创建任务后返回的TaskId字段
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 是否展示所有分片，默认只展示命中规则的分片 
     * @return ShowAllSegments 是否展示所有分片，默认只展示命中规则的分片
     */
    public Boolean getShowAllSegments() {
        return this.ShowAllSegments;
    }

    /**
     * Set 是否展示所有分片，默认只展示命中规则的分片
     * @param ShowAllSegments 是否展示所有分片，默认只展示命中规则的分片
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

