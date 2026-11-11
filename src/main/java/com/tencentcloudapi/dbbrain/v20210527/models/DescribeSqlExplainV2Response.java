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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSqlExplainV2Response extends AbstractModel {

    /**
    * <p>数据库名，回显请求中的 Schema。</p>
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * <p>SQL 文本，回显请求中的 SqlText。</p>
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>SQL 涉及的表名列表。</p>
    */
    @SerializedName("Tables")
    @Expose
    private SqlExplainTableRefV2 [] Tables;

    /**
    * <p>执行计划详细信息。由数据库 EXPLAIN 输出透传，内容为 JSON 字符串，包含 Meta（列定义）与 Data（执行计划行）两部分；Format=JSON 时为 EXPLAIN FORMAT=JSON 的原始结果。</p>
    */
    @SerializedName("Explain")
    @Expose
    private SqlExplainResultV2 Explain;

    /**
    * <p>执行计划字段说明列表。仅当请求 Visual=true 或走 SqlTemplateKey 路径时返回，用于前端展示字段中文释义。</p>
    */
    @SerializedName("FieldDesc")
    @Expose
    private SqlExplainFieldDescV2 [] FieldDesc;

    /**
    * <p>可视化执行计划树，当Visual=true时返回</p>
    */
    @SerializedName("VisualExplain")
    @Expose
    private String VisualExplain;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>数据库名，回显请求中的 Schema。</p> 
     * @return Schema <p>数据库名，回显请求中的 Schema。</p>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>数据库名，回显请求中的 Schema。</p>
     * @param Schema <p>数据库名，回显请求中的 Schema。</p>
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get <p>SQL 文本，回显请求中的 SqlText。</p> 
     * @return SqlText <p>SQL 文本，回显请求中的 SqlText。</p>
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>SQL 文本，回显请求中的 SqlText。</p>
     * @param SqlText <p>SQL 文本，回显请求中的 SqlText。</p>
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>SQL 涉及的表名列表。</p> 
     * @return Tables <p>SQL 涉及的表名列表。</p>
     */
    public SqlExplainTableRefV2 [] getTables() {
        return this.Tables;
    }

    /**
     * Set <p>SQL 涉及的表名列表。</p>
     * @param Tables <p>SQL 涉及的表名列表。</p>
     */
    public void setTables(SqlExplainTableRefV2 [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>执行计划详细信息。由数据库 EXPLAIN 输出透传，内容为 JSON 字符串，包含 Meta（列定义）与 Data（执行计划行）两部分；Format=JSON 时为 EXPLAIN FORMAT=JSON 的原始结果。</p> 
     * @return Explain <p>执行计划详细信息。由数据库 EXPLAIN 输出透传，内容为 JSON 字符串，包含 Meta（列定义）与 Data（执行计划行）两部分；Format=JSON 时为 EXPLAIN FORMAT=JSON 的原始结果。</p>
     */
    public SqlExplainResultV2 getExplain() {
        return this.Explain;
    }

    /**
     * Set <p>执行计划详细信息。由数据库 EXPLAIN 输出透传，内容为 JSON 字符串，包含 Meta（列定义）与 Data（执行计划行）两部分；Format=JSON 时为 EXPLAIN FORMAT=JSON 的原始结果。</p>
     * @param Explain <p>执行计划详细信息。由数据库 EXPLAIN 输出透传，内容为 JSON 字符串，包含 Meta（列定义）与 Data（执行计划行）两部分；Format=JSON 时为 EXPLAIN FORMAT=JSON 的原始结果。</p>
     */
    public void setExplain(SqlExplainResultV2 Explain) {
        this.Explain = Explain;
    }

    /**
     * Get <p>执行计划字段说明列表。仅当请求 Visual=true 或走 SqlTemplateKey 路径时返回，用于前端展示字段中文释义。</p> 
     * @return FieldDesc <p>执行计划字段说明列表。仅当请求 Visual=true 或走 SqlTemplateKey 路径时返回，用于前端展示字段中文释义。</p>
     */
    public SqlExplainFieldDescV2 [] getFieldDesc() {
        return this.FieldDesc;
    }

    /**
     * Set <p>执行计划字段说明列表。仅当请求 Visual=true 或走 SqlTemplateKey 路径时返回，用于前端展示字段中文释义。</p>
     * @param FieldDesc <p>执行计划字段说明列表。仅当请求 Visual=true 或走 SqlTemplateKey 路径时返回，用于前端展示字段中文释义。</p>
     */
    public void setFieldDesc(SqlExplainFieldDescV2 [] FieldDesc) {
        this.FieldDesc = FieldDesc;
    }

    /**
     * Get <p>可视化执行计划树，当Visual=true时返回</p> 
     * @return VisualExplain <p>可视化执行计划树，当Visual=true时返回</p>
     */
    public String getVisualExplain() {
        return this.VisualExplain;
    }

    /**
     * Set <p>可视化执行计划树，当Visual=true时返回</p>
     * @param VisualExplain <p>可视化执行计划树，当Visual=true时返回</p>
     */
    public void setVisualExplain(String VisualExplain) {
        this.VisualExplain = VisualExplain;
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

    public DescribeSqlExplainV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSqlExplainV2Response(DescribeSqlExplainV2Response source) {
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Tables != null) {
            this.Tables = new SqlExplainTableRefV2[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new SqlExplainTableRefV2(source.Tables[i]);
            }
        }
        if (source.Explain != null) {
            this.Explain = new SqlExplainResultV2(source.Explain);
        }
        if (source.FieldDesc != null) {
            this.FieldDesc = new SqlExplainFieldDescV2[source.FieldDesc.length];
            for (int i = 0; i < source.FieldDesc.length; i++) {
                this.FieldDesc[i] = new SqlExplainFieldDescV2(source.FieldDesc[i]);
            }
        }
        if (source.VisualExplain != null) {
            this.VisualExplain = new String(source.VisualExplain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamObj(map, prefix + "Explain.", this.Explain);
        this.setParamArrayObj(map, prefix + "FieldDesc.", this.FieldDesc);
        this.setParamSimple(map, prefix + "VisualExplain", this.VisualExplain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

