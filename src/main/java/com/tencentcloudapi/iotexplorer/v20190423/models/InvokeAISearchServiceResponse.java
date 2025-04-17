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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeAISearchServiceResponse extends AbstractModel {

    /**
    * 基于搜索结果的总结
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 视频结果集
    */
    @SerializedName("Targets")
    @Expose
    private TargetInfo [] Targets;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 基于搜索结果的总结 
     * @return Summary 基于搜索结果的总结
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 基于搜索结果的总结
     * @param Summary 基于搜索结果的总结
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 视频结果集 
     * @return Targets 视频结果集
     */
    public TargetInfo [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 视频结果集
     * @param Targets 视频结果集
     */
    public void setTargets(TargetInfo [] Targets) {
        this.Targets = Targets;
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

    public InvokeAISearchServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeAISearchServiceResponse(InvokeAISearchServiceResponse source) {
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Targets != null) {
            this.Targets = new TargetInfo[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new TargetInfo(source.Targets[i]);
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
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

