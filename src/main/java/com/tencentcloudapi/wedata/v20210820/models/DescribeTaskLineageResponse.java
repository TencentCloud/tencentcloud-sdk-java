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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskLineageResponse extends AbstractModel {

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 通过任务ID查询集成任务信息列表
    */
    @SerializedName("TaskLineageInfos")
    @Expose
    private TaskLineageInfoPair [] TaskLineageInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 通过任务ID查询集成任务信息列表 
     * @return TaskLineageInfos 通过任务ID查询集成任务信息列表
     */
    public TaskLineageInfoPair [] getTaskLineageInfos() {
        return this.TaskLineageInfos;
    }

    /**
     * Set 通过任务ID查询集成任务信息列表
     * @param TaskLineageInfos 通过任务ID查询集成任务信息列表
     */
    public void setTaskLineageInfos(TaskLineageInfoPair [] TaskLineageInfos) {
        this.TaskLineageInfos = TaskLineageInfos;
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

    public DescribeTaskLineageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLineageResponse(DescribeTaskLineageResponse source) {
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.TaskLineageInfos != null) {
            this.TaskLineageInfos = new TaskLineageInfoPair[source.TaskLineageInfos.length];
            for (int i = 0; i < source.TaskLineageInfos.length; i++) {
                this.TaskLineageInfos[i] = new TaskLineageInfoPair(source.TaskLineageInfos[i]);
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
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamArrayObj(map, prefix + "TaskLineageInfos.", this.TaskLineageInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

