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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel {

    /**
    * <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时。<br>注意：</p><ul><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li></ul>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志<br>注意：仅当检索分析语句(Query)不包含SQL时有效</p>
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * <p>返回的是否为统计分析（即SQL）结果</p>
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * <p>匹配检索条件的原始日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * <p>日志统计分析结果的列名<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColNames")
    @Expose
    private String [] ColNames;

    /**
    * <p>日志统计分析结果<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisResults")
    @Expose
    private LogItems [] AnalysisResults;

    /**
    * <p>日志统计分析结果<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisRecords")
    @Expose
    private String [] AnalysisRecords;

    /**
    * <p>日志统计分析结果的列属性<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * <p>本次统计分析使用的采样率</p>
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * <p>使用多日志主题检索时，各个日志主题的基本信息，例如报错信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topics")
    @Expose
    private SearchLogTopics Topics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时。<br>注意：</p><ul><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li></ul> 
     * @return Context <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时。<br>注意：</p><ul><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li></ul>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时。<br>注意：</p><ul><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li></ul>
     * @param Context <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时。<br>注意：</p><ul><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li></ul>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志<br>注意：仅当检索分析语句(Query)不包含SQL时有效</p> 
     * @return ListOver <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志<br>注意：仅当检索分析语句(Query)不包含SQL时有效</p>
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志<br>注意：仅当检索分析语句(Query)不包含SQL时有效</p>
     * @param ListOver <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志<br>注意：仅当检索分析语句(Query)不包含SQL时有效</p>
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get <p>返回的是否为统计分析（即SQL）结果</p> 
     * @return Analysis <p>返回的是否为统计分析（即SQL）结果</p>
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set <p>返回的是否为统计分析（即SQL）结果</p>
     * @param Analysis <p>返回的是否为统计分析（即SQL）结果</p>
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get <p>匹配检索条件的原始日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results <p>匹配检索条件的原始日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>匹配检索条件的原始日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results <p>匹配检索条件的原始日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(LogInfo [] Results) {
        this.Results = Results;
    }

    /**
     * Get <p>日志统计分析结果的列名<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColNames <p>日志统计分析结果的列名<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColNames() {
        return this.ColNames;
    }

    /**
     * Set <p>日志统计分析结果的列名<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColNames <p>日志统计分析结果的列名<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColNames(String [] ColNames) {
        this.ColNames = ColNames;
    }

    /**
     * Get <p>日志统计分析结果<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisResults <p>日志统计分析结果<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogItems [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set <p>日志统计分析结果<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisResults <p>日志统计分析结果<br>当UseNewAnalysis为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisResults(LogItems [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
    }

    /**
     * Get <p>日志统计分析结果<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisRecords <p>日志统计分析结果<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAnalysisRecords() {
        return this.AnalysisRecords;
    }

    /**
     * Set <p>日志统计分析结果<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisRecords <p>日志统计分析结果<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisRecords(String [] AnalysisRecords) {
        this.AnalysisRecords = AnalysisRecords;
    }

    /**
     * Get <p>日志统计分析结果的列属性<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns <p>日志统计分析结果的列属性<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>日志统计分析结果的列属性<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns <p>日志统计分析结果的列属性<br>当UseNewAnalysis为true时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get <p>本次统计分析使用的采样率</p> 
     * @return SamplingRate <p>本次统计分析使用的采样率</p>
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set <p>本次统计分析使用的采样率</p>
     * @param SamplingRate <p>本次统计分析使用的采样率</p>
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get <p>使用多日志主题检索时，各个日志主题的基本信息，例如报错信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topics <p>使用多日志主题检索时，各个日志主题的基本信息，例如报错信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchLogTopics getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>使用多日志主题检索时，各个日志主题的基本信息，例如报错信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topics <p>使用多日志主题检索时，各个日志主题的基本信息，例如报错信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopics(SearchLogTopics Topics) {
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

    public SearchLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResponse(SearchLogResponse source) {
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
            this.Results = new LogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogInfo(source.Results[i]);
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
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Float(source.SamplingRate);
        }
        if (source.Topics != null) {
            this.Topics = new SearchLogTopics(source.Topics);
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

