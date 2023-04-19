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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTaskJobLogDetailResponse extends AbstractModel{

    /**
    * 下一次分页参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 是否获取完结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 日志详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private JobLogResult [] Results;

    /**
    * 日志url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogUrl")
    @Expose
    private String LogUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下一次分页参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Context 下一次分页参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 下一次分页参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Context 下一次分页参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 是否获取完结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListOver 是否获取完结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 是否获取完结
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListOver 是否获取完结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 日志详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobLogResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(JobLogResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 日志url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogUrl 日志url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogUrl() {
        return this.LogUrl;
    }

    /**
     * Set 日志url
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogUrl 日志url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogUrl(String LogUrl) {
        this.LogUrl = LogUrl;
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

    public ListTaskJobLogDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskJobLogDetailResponse(ListTaskJobLogDetailResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Results != null) {
            this.Results = new JobLogResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new JobLogResult(source.Results[i]);
            }
        }
        if (source.LogUrl != null) {
            this.LogUrl = new String(source.LogUrl);
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
        this.setParamSimple(map, prefix + "LogUrl", this.LogUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

