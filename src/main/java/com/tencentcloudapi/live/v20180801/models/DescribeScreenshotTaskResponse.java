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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScreenshotTaskResponse extends AbstractModel {

    /**
    * 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 Token。当该字段为空，说明已无更多数据。
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 截图任务列表。当该字段为空，说明已返回所有数据。
    */
    @SerializedName("TaskList")
    @Expose
    private ScreenshotTask [] TaskList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 Token。当该字段为空，说明已无更多数据。 
     * @return ScrollToken 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 Token。当该字段为空，说明已无更多数据。
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 Token。当该字段为空，说明已无更多数据。
     * @param ScrollToken 翻页标识，当请求未返回所有数据，该字段表示下一条记录的 Token。当该字段为空，说明已无更多数据。
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get 截图任务列表。当该字段为空，说明已返回所有数据。 
     * @return TaskList 截图任务列表。当该字段为空，说明已返回所有数据。
     */
    public ScreenshotTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set 截图任务列表。当该字段为空，说明已返回所有数据。
     * @param TaskList 截图任务列表。当该字段为空，说明已返回所有数据。
     */
    public void setTaskList(ScreenshotTask [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScreenshotTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenshotTaskResponse(DescribeScreenshotTaskResponse source) {
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.TaskList != null) {
            this.TaskList = new ScreenshotTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new ScreenshotTask(source.TaskList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

