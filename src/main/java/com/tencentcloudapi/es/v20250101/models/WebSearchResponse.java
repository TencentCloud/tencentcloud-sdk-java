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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebSearchResponse extends AbstractModel {

    /**
    * 查询
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 响应状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 执行搜索的引擎
    */
    @SerializedName("SearchEngine")
    @Expose
    private String SearchEngine;

    /**
    * 搜索结果
    */
    @SerializedName("Results")
    @Expose
    private WebPage [] Results;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询 
     * @return Query 查询
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询
     * @param Query 查询
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 响应状态 
     * @return Status 响应状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 响应状态
     * @param Status 响应状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 执行搜索的引擎 
     * @return SearchEngine 执行搜索的引擎
     */
    public String getSearchEngine() {
        return this.SearchEngine;
    }

    /**
     * Set 执行搜索的引擎
     * @param SearchEngine 执行搜索的引擎
     */
    public void setSearchEngine(String SearchEngine) {
        this.SearchEngine = SearchEngine;
    }

    /**
     * Get 搜索结果 
     * @return Results 搜索结果
     */
    public WebPage [] getResults() {
        return this.Results;
    }

    /**
     * Set 搜索结果
     * @param Results 搜索结果
     */
    public void setResults(WebPage [] Results) {
        this.Results = Results;
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

    public WebSearchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSearchResponse(WebSearchResponse source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SearchEngine != null) {
            this.SearchEngine = new String(source.SearchEngine);
        }
        if (source.Results != null) {
            this.Results = new WebPage[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new WebPage(source.Results[i]);
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
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SearchEngine", this.SearchEngine);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

