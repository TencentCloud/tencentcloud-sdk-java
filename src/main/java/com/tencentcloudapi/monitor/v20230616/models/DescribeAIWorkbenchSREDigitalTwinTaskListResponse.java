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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIWorkbenchSREDigitalTwinTaskListResponse extends AbstractModel {

    /**
    * Json序列化路径
    */
    @SerializedName("JSONStrPaths")
    @Expose
    private String [] JSONStrPaths;

    /**
    * 数字分身任务列表
    */
    @SerializedName("Data")
    @Expose
    private AIWorkbenchSREDigitalTwinTaskList Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Json序列化路径 
     * @return JSONStrPaths Json序列化路径
     */
    public String [] getJSONStrPaths() {
        return this.JSONStrPaths;
    }

    /**
     * Set Json序列化路径
     * @param JSONStrPaths Json序列化路径
     */
    public void setJSONStrPaths(String [] JSONStrPaths) {
        this.JSONStrPaths = JSONStrPaths;
    }

    /**
     * Get 数字分身任务列表 
     * @return Data 数字分身任务列表
     */
    public AIWorkbenchSREDigitalTwinTaskList getData() {
        return this.Data;
    }

    /**
     * Set 数字分身任务列表
     * @param Data 数字分身任务列表
     */
    public void setData(AIWorkbenchSREDigitalTwinTaskList Data) {
        this.Data = Data;
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

    public DescribeAIWorkbenchSREDigitalTwinTaskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIWorkbenchSREDigitalTwinTaskListResponse(DescribeAIWorkbenchSREDigitalTwinTaskListResponse source) {
        if (source.JSONStrPaths != null) {
            this.JSONStrPaths = new String[source.JSONStrPaths.length];
            for (int i = 0; i < source.JSONStrPaths.length; i++) {
                this.JSONStrPaths[i] = new String(source.JSONStrPaths[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new AIWorkbenchSREDigitalTwinTaskList(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "JSONStrPaths.", this.JSONStrPaths);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

