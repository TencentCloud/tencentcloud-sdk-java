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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksResponse extends AbstractModel{

    /**
    * 任务概要列表。
    */
    @SerializedName("TaskSet")
    @Expose
    private TaskSimpleInfo [] TaskSet;

    /**
    * 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务概要列表。 
     * @return TaskSet 任务概要列表。
     */
    public TaskSimpleInfo [] getTaskSet() {
        return this.TaskSet;
    }

    /**
     * Set 任务概要列表。
     * @param TaskSet 任务概要列表。
     */
    public void setTaskSet(TaskSimpleInfo [] TaskSet) {
        this.TaskSet = TaskSet;
    }

    /**
     * Get 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。 
     * @return ScrollToken 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。
     * @param ScrollToken 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskSet.", this.TaskSet);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

