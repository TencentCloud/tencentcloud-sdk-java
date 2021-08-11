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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncSearchResultResponse extends AbstractModel{

    /**
    * 加载后续内容的Context
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 日志查询结果是否全部返回
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 日志内容
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加载后续内容的Context 
     * @return Context 加载后续内容的Context
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 加载后续内容的Context
     * @param Context 加载后续内容的Context
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 日志查询结果是否全部返回 
     * @return ListOver 日志查询结果是否全部返回
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 日志查询结果是否全部返回
     * @param ListOver 日志查询结果是否全部返回
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 日志内容 
     * @return Results 日志内容
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志内容
     * @param Results 日志内容
     */
    public void setResults(LogInfo [] Results) {
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

    public DescribeAsyncSearchResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncSearchResultResponse(DescribeAsyncSearchResultResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Results != null) {
            this.Results = new LogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogInfo(source.Results[i]);
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
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

