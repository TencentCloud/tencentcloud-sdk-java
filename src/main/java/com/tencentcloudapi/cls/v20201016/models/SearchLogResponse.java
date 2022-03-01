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

public class SearchLogResponse extends AbstractModel{

    /**
    * 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
注意：仅当检索分析语句(Query)不包含SQL时有效
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 返回的是否为统计分析（即SQL）结果
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * 匹配检索条件的原始日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * 日志统计分析结果的列名
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColNames")
    @Expose
    private String [] ColNames;

    /**
    * 日志统计分析结果
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisResults")
    @Expose
    private LogItems [] AnalysisResults;

    /**
    * 日志统计分析结果
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisRecords")
    @Expose
    private String [] AnalysisRecords;

    /**
    * 日志统计分析结果的列属性
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时 
     * @return Context 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
     * @param Context 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
注意：仅当检索分析语句(Query)不包含SQL时有效 
     * @return ListOver 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
注意：仅当检索分析语句(Query)不包含SQL时有效
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
注意：仅当检索分析语句(Query)不包含SQL时有效
     * @param ListOver 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
注意：仅当检索分析语句(Query)不包含SQL时有效
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 返回的是否为统计分析（即SQL）结果 
     * @return Analysis 返回的是否为统计分析（即SQL）结果
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set 返回的是否为统计分析（即SQL）结果
     * @param Analysis 返回的是否为统计分析（即SQL）结果
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get 匹配检索条件的原始日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 匹配检索条件的原始日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set 匹配检索条件的原始日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 匹配检索条件的原始日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(LogInfo [] Results) {
        this.Results = Results;
    }

    /**
     * Get 日志统计分析结果的列名
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColNames 日志统计分析结果的列名
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColNames() {
        return this.ColNames;
    }

    /**
     * Set 日志统计分析结果的列名
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColNames 日志统计分析结果的列名
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColNames(String [] ColNames) {
        this.ColNames = ColNames;
    }

    /**
     * Get 日志统计分析结果
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisResults 日志统计分析结果
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogItems [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set 日志统计分析结果
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisResults 日志统计分析结果
当UseNewAnalysis为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisResults(LogItems [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
    }

    /**
     * Get 日志统计分析结果
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisRecords 日志统计分析结果
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAnalysisRecords() {
        return this.AnalysisRecords;
    }

    /**
     * Set 日志统计分析结果
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisRecords 日志统计分析结果
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisRecords(String [] AnalysisRecords) {
        this.AnalysisRecords = AnalysisRecords;
    }

    /**
     * Get 日志统计分析结果的列属性
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 日志统计分析结果的列属性
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 日志统计分析结果的列属性
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 日志统计分析结果的列属性
当UseNewAnalysis为true时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

