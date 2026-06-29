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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCLSLogListV3Response extends AbstractModel {

    /**
    * <p>上下文</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>listover</p>
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * <p>是否采用分析</p>
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * <p>结果</p>
    */
    @SerializedName("Results")
    @Expose
    private LogSearchResult [] Results;

    /**
    * <p>列名</p>
    */
    @SerializedName("ColNames")
    @Expose
    private String [] ColNames;

    /**
    * <p>分析结果</p>
    */
    @SerializedName("AnalysisResults")
    @Expose
    private LogItems [] AnalysisResults;

    /**
    * <p>分析记录</p>
    */
    @SerializedName("AnalysisRecords")
    @Expose
    private String [] AnalysisRecords;

    /**
    * <p>列名</p>
    */
    @SerializedName("Columns")
    @Expose
    private LogColumn [] Columns;

    /**
    * <p>采样</p>
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * <p>主题信息</p>
    */
    @SerializedName("Topics")
    @Expose
    private LogSearchTopics Topics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>上下文</p> 
     * @return Context <p>上下文</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>上下文</p>
     * @param Context <p>上下文</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>listover</p> 
     * @return ListOver <p>listover</p>
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set <p>listover</p>
     * @param ListOver <p>listover</p>
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get <p>是否采用分析</p> 
     * @return Analysis <p>是否采用分析</p>
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set <p>是否采用分析</p>
     * @param Analysis <p>是否采用分析</p>
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get <p>结果</p> 
     * @return Results <p>结果</p>
     */
    public LogSearchResult [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>结果</p>
     * @param Results <p>结果</p>
     */
    public void setResults(LogSearchResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get <p>列名</p> 
     * @return ColNames <p>列名</p>
     */
    public String [] getColNames() {
        return this.ColNames;
    }

    /**
     * Set <p>列名</p>
     * @param ColNames <p>列名</p>
     */
    public void setColNames(String [] ColNames) {
        this.ColNames = ColNames;
    }

    /**
     * Get <p>分析结果</p> 
     * @return AnalysisResults <p>分析结果</p>
     */
    public LogItems [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set <p>分析结果</p>
     * @param AnalysisResults <p>分析结果</p>
     */
    public void setAnalysisResults(LogItems [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
    }

    /**
     * Get <p>分析记录</p> 
     * @return AnalysisRecords <p>分析记录</p>
     */
    public String [] getAnalysisRecords() {
        return this.AnalysisRecords;
    }

    /**
     * Set <p>分析记录</p>
     * @param AnalysisRecords <p>分析记录</p>
     */
    public void setAnalysisRecords(String [] AnalysisRecords) {
        this.AnalysisRecords = AnalysisRecords;
    }

    /**
     * Get <p>列名</p> 
     * @return Columns <p>列名</p>
     */
    public LogColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>列名</p>
     * @param Columns <p>列名</p>
     */
    public void setColumns(LogColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get <p>采样</p> 
     * @return SamplingRate <p>采样</p>
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set <p>采样</p>
     * @param SamplingRate <p>采样</p>
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get <p>主题信息</p> 
     * @return Topics <p>主题信息</p>
     */
    public LogSearchTopics getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>主题信息</p>
     * @param Topics <p>主题信息</p>
     */
    public void setTopics(LogSearchTopics Topics) {
        this.Topics = Topics;
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

    public DescribeCLSLogListV3Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCLSLogListV3Response(DescribeCLSLogListV3Response source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Analysis != null) {
            this.Analysis = new Boolean(source.Analysis);
        }
        if (source.Results != null) {
            this.Results = new LogSearchResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogSearchResult(source.Results[i]);
            }
        }
        if (source.ColNames != null) {
            this.ColNames = new String[source.ColNames.length];
            for (int i = 0; i < source.ColNames.length; i++) {
                this.ColNames[i] = new String(source.ColNames[i]);
            }
        }
        if (source.AnalysisResults != null) {
            this.AnalysisResults = new LogItems[source.AnalysisResults.length];
            for (int i = 0; i < source.AnalysisResults.length; i++) {
                this.AnalysisResults[i] = new LogItems(source.AnalysisResults[i]);
            }
        }
        if (source.AnalysisRecords != null) {
            this.AnalysisRecords = new String[source.AnalysisRecords.length];
            for (int i = 0; i < source.AnalysisRecords.length; i++) {
                this.AnalysisRecords[i] = new String(source.AnalysisRecords[i]);
            }
        }
        if (source.Columns != null) {
            this.Columns = new LogColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new LogColumn(source.Columns[i]);
            }
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Float(source.SamplingRate);
        }
        if (source.Topics != null) {
            this.Topics = new LogSearchTopics(source.Topics);
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
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamArraySimple(map, prefix + "ColNames.", this.ColNames);
        this.setParamArrayObj(map, prefix + "AnalysisResults.", this.AnalysisResults);
        this.setParamArraySimple(map, prefix + "AnalysisRecords.", this.AnalysisRecords);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

