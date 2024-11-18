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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchAccessLogResponse extends AbstractModel {

    /**
    * 新接口此字段失效，默认返回空字符串
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 日志查询结果是否全部返回，其中，“true”表示结果返回，“false”表示结果为返回
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 返回的是否为分析结果，其中，“true”表示返回分析结果，“false”表示未返回分析结果
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * 如果Analysis为True，则返回分析结果的列名，否则为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColNames")
    @Expose
    private String [] ColNames;

    /**
    * 日志查询结果；当Analysis为True时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
    */
    @SerializedName("Results")
    @Expose
    private AccessLogInfo [] Results;

    /**
    * 日志分析结果；当Analysis为False时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
    */
    @SerializedName("AnalysisResults")
    @Expose
    private AccessLogItems [] AnalysisResults;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 新接口此字段失效，默认返回空字符串 
     * @return Context 新接口此字段失效，默认返回空字符串
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 新接口此字段失效，默认返回空字符串
     * @param Context 新接口此字段失效，默认返回空字符串
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 日志查询结果是否全部返回，其中，“true”表示结果返回，“false”表示结果为返回 
     * @return ListOver 日志查询结果是否全部返回，其中，“true”表示结果返回，“false”表示结果为返回
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 日志查询结果是否全部返回，其中，“true”表示结果返回，“false”表示结果为返回
     * @param ListOver 日志查询结果是否全部返回，其中，“true”表示结果返回，“false”表示结果为返回
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 返回的是否为分析结果，其中，“true”表示返回分析结果，“false”表示未返回分析结果 
     * @return Analysis 返回的是否为分析结果，其中，“true”表示返回分析结果，“false”表示未返回分析结果
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set 返回的是否为分析结果，其中，“true”表示返回分析结果，“false”表示未返回分析结果
     * @param Analysis 返回的是否为分析结果，其中，“true”表示返回分析结果，“false”表示未返回分析结果
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get 如果Analysis为True，则返回分析结果的列名，否则为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColNames 如果Analysis为True，则返回分析结果的列名，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String [] getColNames() {
        return this.ColNames;
    }

    /**
     * Set 如果Analysis为True，则返回分析结果的列名，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColNames 如果Analysis为True，则返回分析结果的列名，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setColNames(String [] ColNames) {
        this.ColNames = ColNames;
    }

    /**
     * Get 日志查询结果；当Analysis为True时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值 
     * @return Results 日志查询结果；当Analysis为True时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
     */
    public AccessLogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志查询结果；当Analysis为True时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
     * @param Results 日志查询结果；当Analysis为True时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
     */
    public void setResults(AccessLogInfo [] Results) {
        this.Results = Results;
    }

    /**
     * Get 日志分析结果；当Analysis为False时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值 
     * @return AnalysisResults 日志分析结果；当Analysis为False时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
     * @deprecated
     */
    @Deprecated
    public AccessLogItems [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set 日志分析结果；当Analysis为False时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
     * @param AnalysisResults 日志分析结果；当Analysis为False时，可能返回为null
注意：此字段可能返回 null，表示取不到有效值
     * @deprecated
     */
    @Deprecated
    public void setAnalysisResults(AccessLogItems [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
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

    public SearchAccessLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchAccessLogResponse(SearchAccessLogResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Analysis != null) {
            this.Analysis = new Boolean(source.Analysis);
        }
        if (source.ColNames != null) {
            this.ColNames = new String[source.ColNames.length];
            for (int i = 0; i < source.ColNames.length; i++) {
                this.ColNames[i] = new String(source.ColNames[i]);
            }
        }
        if (source.Results != null) {
            this.Results = new AccessLogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new AccessLogInfo(source.Results[i]);
            }
        }
        if (source.AnalysisResults != null) {
            this.AnalysisResults = new AccessLogItems[source.AnalysisResults.length];
            for (int i = 0; i < source.AnalysisResults.length; i++) {
                this.AnalysisResults[i] = new AccessLogItems(source.AnalysisResults[i]);
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
        this.setParamSimple(map, prefix + "Analysis", this.Analysis);
        this.setParamArraySimple(map, prefix + "ColNames.", this.ColNames);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamArrayObj(map, prefix + "AnalysisResults.", this.AnalysisResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

