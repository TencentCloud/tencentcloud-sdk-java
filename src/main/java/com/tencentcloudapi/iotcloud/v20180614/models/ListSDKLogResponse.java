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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSDKLogResponse extends AbstractModel {

    /**
    * 日志检索上下文
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 是否还有日志，如有仍有日志，下次查询的请求带上当前请求返回的Context
    */
    @SerializedName("Listover")
    @Expose
    private Boolean Listover;

    /**
    * 日志列表
    */
    @SerializedName("Results")
    @Expose
    private SDKLogItem [] Results;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志检索上下文 
     * @return Context 日志检索上下文
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 日志检索上下文
     * @param Context 日志检索上下文
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 是否还有日志，如有仍有日志，下次查询的请求带上当前请求返回的Context 
     * @return Listover 是否还有日志，如有仍有日志，下次查询的请求带上当前请求返回的Context
     */
    public Boolean getListover() {
        return this.Listover;
    }

    /**
     * Set 是否还有日志，如有仍有日志，下次查询的请求带上当前请求返回的Context
     * @param Listover 是否还有日志，如有仍有日志，下次查询的请求带上当前请求返回的Context
     */
    public void setListover(Boolean Listover) {
        this.Listover = Listover;
    }

    /**
     * Get 日志列表 
     * @return Results 日志列表
     */
    public SDKLogItem [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志列表
     * @param Results 日志列表
     */
    public void setResults(SDKLogItem [] Results) {
        this.Results = Results;
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

    public ListSDKLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSDKLogResponse(ListSDKLogResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Listover != null) {
            this.Listover = new Boolean(source.Listover);
        }
        if (source.Results != null) {
            this.Results = new SDKLogItem[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new SDKLogItem(source.Results[i]);
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
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Listover", this.Listover);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

