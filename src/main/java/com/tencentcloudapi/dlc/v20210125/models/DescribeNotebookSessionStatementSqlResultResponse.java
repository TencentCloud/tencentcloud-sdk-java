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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookSessionStatementSqlResultResponse extends AbstractModel {

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 结果数据
    */
    @SerializedName("ResultSet")
    @Expose
    private String ResultSet;

    /**
    * schema
    */
    @SerializedName("ResultSchema")
    @Expose
    private Column [] ResultSchema;

    /**
    * 分页信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 存储结果地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * 引擎计算耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseTime")
    @Expose
    private Long UseTime;

    /**
    * 结果条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * 数据扫描量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataAmount")
    @Expose
    private Long DataAmount;

    /**
    * spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UiUrl")
    @Expose
    private String UiUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 结果数据 
     * @return ResultSet 结果数据
     */
    public String getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set 结果数据
     * @param ResultSet 结果数据
     */
    public void setResultSet(String ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get schema 
     * @return ResultSchema schema
     */
    public Column [] getResultSchema() {
        return this.ResultSchema;
    }

    /**
     * Set schema
     * @param ResultSchema schema
     */
    public void setResultSchema(Column [] ResultSchema) {
        this.ResultSchema = ResultSchema;
    }

    /**
     * Get 分页信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextToken 分页信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 分页信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextToken 分页信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 存储结果地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputPath 存储结果地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 存储结果地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputPath 存储结果地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get 引擎计算耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseTime 引擎计算耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseTime() {
        return this.UseTime;
    }

    /**
     * Set 引擎计算耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseTime 引擎计算耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseTime(Long UseTime) {
        this.UseTime = UseTime;
    }

    /**
     * Get 结果条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectRows 结果条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set 结果条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectRows 结果条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get 数据扫描量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataAmount 数据扫描量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set 数据扫描量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataAmount 数据扫描量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataAmount(Long DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get spark ui地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UiUrl spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUiUrl() {
        return this.UiUrl;
    }

    /**
     * Set spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param UiUrl spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUiUrl(String UiUrl) {
        this.UiUrl = UiUrl;
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

    public DescribeNotebookSessionStatementSqlResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebookSessionStatementSqlResultResponse(DescribeNotebookSessionStatementSqlResultResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ResultSet != null) {
            this.ResultSet = new String(source.ResultSet);
        }
        if (source.ResultSchema != null) {
            this.ResultSchema = new Column[source.ResultSchema.length];
            for (int i = 0; i < source.ResultSchema.length; i++) {
                this.ResultSchema[i] = new Column(source.ResultSchema[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.UseTime != null) {
            this.UseTime = new Long(source.UseTime);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.DataAmount != null) {
            this.DataAmount = new Long(source.DataAmount);
        }
        if (source.UiUrl != null) {
            this.UiUrl = new String(source.UiUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ResultSet", this.ResultSet);
        this.setParamArrayObj(map, prefix + "ResultSchema.", this.ResultSchema);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "UseTime", this.UseTime);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "DataAmount", this.DataAmount);
        this.setParamSimple(map, prefix + "UiUrl", this.UiUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

