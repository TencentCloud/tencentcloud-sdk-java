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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutePGSqlResponse extends AbstractModel {

    /**
    * <p>影响行数</p>
    */
    @SerializedName("AffectedRows")
    @Expose
    private Long AffectedRows;

    /**
    * <p>字段名列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
    * <p>数据行。每一行数据都是一个JSON串，将JSON进行反序列化将得到了每列的值。值可能是 null 或者 字符串，如果是 null 说明该列的值为 &lt;null&gt;，如果是字符串则为该列的值的字符串表示形式。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rows")
    @Expose
    private String [] Rows;

    /**
    * <p>SQL执行耗时</p><p>单位：毫秒</p>
    */
    @SerializedName("ExecutionTimeMs")
    @Expose
    private Long ExecutionTimeMs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>影响行数</p> 
     * @return AffectedRows <p>影响行数</p>
     */
    public Long getAffectedRows() {
        return this.AffectedRows;
    }

    /**
     * Set <p>影响行数</p>
     * @param AffectedRows <p>影响行数</p>
     */
    public void setAffectedRows(Long AffectedRows) {
        this.AffectedRows = AffectedRows;
    }

    /**
     * Get <p>字段名列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns <p>字段名列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>字段名列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns <p>字段名列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get <p>数据行。每一行数据都是一个JSON串，将JSON进行反序列化将得到了每列的值。值可能是 null 或者 字符串，如果是 null 说明该列的值为 &lt;null&gt;，如果是字符串则为该列的值的字符串表示形式。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rows <p>数据行。每一行数据都是一个JSON串，将JSON进行反序列化将得到了每列的值。值可能是 null 或者 字符串，如果是 null 说明该列的值为 &lt;null&gt;，如果是字符串则为该列的值的字符串表示形式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRows() {
        return this.Rows;
    }

    /**
     * Set <p>数据行。每一行数据都是一个JSON串，将JSON进行反序列化将得到了每列的值。值可能是 null 或者 字符串，如果是 null 说明该列的值为 &lt;null&gt;，如果是字符串则为该列的值的字符串表示形式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rows <p>数据行。每一行数据都是一个JSON串，将JSON进行反序列化将得到了每列的值。值可能是 null 或者 字符串，如果是 null 说明该列的值为 &lt;null&gt;，如果是字符串则为该列的值的字符串表示形式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRows(String [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get <p>SQL执行耗时</p><p>单位：毫秒</p> 
     * @return ExecutionTimeMs <p>SQL执行耗时</p><p>单位：毫秒</p>
     */
    public Long getExecutionTimeMs() {
        return this.ExecutionTimeMs;
    }

    /**
     * Set <p>SQL执行耗时</p><p>单位：毫秒</p>
     * @param ExecutionTimeMs <p>SQL执行耗时</p><p>单位：毫秒</p>
     */
    public void setExecutionTimeMs(Long ExecutionTimeMs) {
        this.ExecutionTimeMs = ExecutionTimeMs;
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

    public ExecutePGSqlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutePGSqlResponse(ExecutePGSqlResponse source) {
        if (source.AffectedRows != null) {
            this.AffectedRows = new Long(source.AffectedRows);
        }
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
        if (source.Rows != null) {
            this.Rows = new String[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new String(source.Rows[i]);
            }
        }
        if (source.ExecutionTimeMs != null) {
            this.ExecutionTimeMs = new Long(source.ExecutionTimeMs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectedRows", this.AffectedRows);
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);
        this.setParamArraySimple(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "ExecutionTimeMs", this.ExecutionTimeMs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

