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

public class GetAlarmLogResponse extends AbstractModel {

    /**
    * <p>加载后续详情的Context</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>指定时间范围内的告警执行详情是否完整返回</p>
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * <p>返回的结果是否为SQL分析结果</p>
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * <p>分析结果的列名，如果Query语句有SQL查询，则返回查询字段的列名；<br>否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColNames")
    @Expose
    private String [] ColNames;

    /**
    * <p>执行详情查询结果。<br>当Query字段无SQL语句时，返回查询结果。<br>当Query字段有SQL语句时，可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * <p>执行详情统计分析结果。当Query字段有SQL语句时，返回SQL统计结果，否则可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisResults")
    @Expose
    private LogItems [] AnalysisResults;

    /**
    * <p>执行详情统计分析结果；UseNewAnalysis为true有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisRecords")
    @Expose
    private String [] AnalysisRecords;

    /**
    * <p>分析结果的列名， UseNewAnalysis为true有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>加载后续详情的Context</p> 
     * @return Context <p>加载后续详情的Context</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>加载后续详情的Context</p>
     * @param Context <p>加载后续详情的Context</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>指定时间范围内的告警执行详情是否完整返回</p> 
     * @return ListOver <p>指定时间范围内的告警执行详情是否完整返回</p>
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set <p>指定时间范围内的告警执行详情是否完整返回</p>
     * @param ListOver <p>指定时间范围内的告警执行详情是否完整返回</p>
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get <p>返回的结果是否为SQL分析结果</p> 
     * @return Analysis <p>返回的结果是否为SQL分析结果</p>
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set <p>返回的结果是否为SQL分析结果</p>
     * @param Analysis <p>返回的结果是否为SQL分析结果</p>
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get <p>分析结果的列名，如果Query语句有SQL查询，则返回查询字段的列名；<br>否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColNames <p>分析结果的列名，如果Query语句有SQL查询，则返回查询字段的列名；<br>否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColNames() {
        return this.ColNames;
    }

    /**
     * Set <p>分析结果的列名，如果Query语句有SQL查询，则返回查询字段的列名；<br>否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColNames <p>分析结果的列名，如果Query语句有SQL查询，则返回查询字段的列名；<br>否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColNames(String [] ColNames) {
        this.ColNames = ColNames;
    }

    /**
     * Get <p>执行详情查询结果。<br>当Query字段无SQL语句时，返回查询结果。<br>当Query字段有SQL语句时，可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results <p>执行详情查询结果。<br>当Query字段无SQL语句时，返回查询结果。<br>当Query字段有SQL语句时，可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>执行详情查询结果。<br>当Query字段无SQL语句时，返回查询结果。<br>当Query字段有SQL语句时，可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results <p>执行详情查询结果。<br>当Query字段无SQL语句时，返回查询结果。<br>当Query字段有SQL语句时，可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(LogInfo [] Results) {
        this.Results = Results;
    }

    /**
     * Get <p>执行详情统计分析结果。当Query字段有SQL语句时，返回SQL统计结果，否则可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisResults <p>执行详情统计分析结果。当Query字段有SQL语句时，返回SQL统计结果，否则可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogItems [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set <p>执行详情统计分析结果。当Query字段有SQL语句时，返回SQL统计结果，否则可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisResults <p>执行详情统计分析结果。当Query字段有SQL语句时，返回SQL统计结果，否则可能返回null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisResults(LogItems [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
    }

    /**
     * Get <p>执行详情统计分析结果；UseNewAnalysis为true有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisRecords <p>执行详情统计分析结果；UseNewAnalysis为true有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAnalysisRecords() {
        return this.AnalysisRecords;
    }

    /**
     * Set <p>执行详情统计分析结果；UseNewAnalysis为true有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisRecords <p>执行详情统计分析结果；UseNewAnalysis为true有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisRecords(String [] AnalysisRecords) {
        this.AnalysisRecords = AnalysisRecords;
    }

    /**
     * Get <p>分析结果的列名， UseNewAnalysis为true有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns <p>分析结果的列名， UseNewAnalysis为true有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>分析结果的列名， UseNewAnalysis为true有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns <p>分析结果的列名， UseNewAnalysis为true有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
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

    public GetAlarmLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAlarmLogResponse(GetAlarmLogResponse source) {
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
            this.Results = new LogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogInfo(source.Results[i]);
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
        this.setParamArraySimple(map, prefix + "ColNames.", this.ColNames);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamArrayObj(map, prefix + "AnalysisResults.", this.AnalysisResults);
        this.setParamArraySimple(map, prefix + "AnalysisRecords.", this.AnalysisRecords);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

