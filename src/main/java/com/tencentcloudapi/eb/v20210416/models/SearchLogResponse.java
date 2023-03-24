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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel{

    /**
    * 日志总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 每页日志条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 日志检索结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private SearchLogResult [] Results;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 日志总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 日志总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 日志总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 每页日志条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit 每页日志条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页日志条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit 每页日志条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Page 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Page 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 日志检索结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 日志检索结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchLogResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志检索结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 日志检索结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(SearchLogResult [] Results) {
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

    public SearchLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResponse(SearchLogResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Results != null) {
            this.Results = new SearchLogResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new SearchLogResult(source.Results[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

