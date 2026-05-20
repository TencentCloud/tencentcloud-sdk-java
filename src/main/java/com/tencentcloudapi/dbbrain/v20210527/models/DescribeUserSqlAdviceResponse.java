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

public class DescribeUserSqlAdviceResponse extends AbstractModel {

    /**
    * <p>SQL优化建议，可解析为JSON数组，无需优化时输出为空。</p>
    */
    @SerializedName("Advices")
    @Expose
    private String Advices;

    /**
    * <p>SQL优化建议备注，可解析为String数组，无需优化时输出为空。</p>
    */
    @SerializedName("Comments")
    @Expose
    private String Comments;

    /**
    * <p>SQL语句。</p>
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>库名。</p>
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * <p>相关表的DDL信息，可解析为JSON数组。</p>
    */
    @SerializedName("Tables")
    @Expose
    private String Tables;

    /**
    * <p>SQL执行计划，可解析为JSON，无需优化时输出为空。</p>
    */
    @SerializedName("SqlPlan")
    @Expose
    private String SqlPlan;

    /**
    * <p>SQL优化后的成本节约详情，可解析为JSON，无需优化时输出为空。</p>
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>SQL优化建议，可解析为JSON数组，无需优化时输出为空。</p> 
     * @return Advices <p>SQL优化建议，可解析为JSON数组，无需优化时输出为空。</p>
     */
    public String getAdvices() {
        return this.Advices;
    }

    /**
     * Set <p>SQL优化建议，可解析为JSON数组，无需优化时输出为空。</p>
     * @param Advices <p>SQL优化建议，可解析为JSON数组，无需优化时输出为空。</p>
     */
    public void setAdvices(String Advices) {
        this.Advices = Advices;
    }

    /**
     * Get <p>SQL优化建议备注，可解析为String数组，无需优化时输出为空。</p> 
     * @return Comments <p>SQL优化建议备注，可解析为String数组，无需优化时输出为空。</p>
     */
    public String getComments() {
        return this.Comments;
    }

    /**
     * Set <p>SQL优化建议备注，可解析为String数组，无需优化时输出为空。</p>
     * @param Comments <p>SQL优化建议备注，可解析为String数组，无需优化时输出为空。</p>
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    /**
     * Get <p>SQL语句。</p> 
     * @return SqlText <p>SQL语句。</p>
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>SQL语句。</p>
     * @param SqlText <p>SQL语句。</p>
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>库名。</p> 
     * @return Schema <p>库名。</p>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>库名。</p>
     * @param Schema <p>库名。</p>
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get <p>相关表的DDL信息，可解析为JSON数组。</p> 
     * @return Tables <p>相关表的DDL信息，可解析为JSON数组。</p>
     */
    public String getTables() {
        return this.Tables;
    }

    /**
     * Set <p>相关表的DDL信息，可解析为JSON数组。</p>
     * @param Tables <p>相关表的DDL信息，可解析为JSON数组。</p>
     */
    public void setTables(String Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>SQL执行计划，可解析为JSON，无需优化时输出为空。</p> 
     * @return SqlPlan <p>SQL执行计划，可解析为JSON，无需优化时输出为空。</p>
     */
    public String getSqlPlan() {
        return this.SqlPlan;
    }

    /**
     * Set <p>SQL执行计划，可解析为JSON，无需优化时输出为空。</p>
     * @param SqlPlan <p>SQL执行计划，可解析为JSON，无需优化时输出为空。</p>
     */
    public void setSqlPlan(String SqlPlan) {
        this.SqlPlan = SqlPlan;
    }

    /**
     * Get <p>SQL优化后的成本节约详情，可解析为JSON，无需优化时输出为空。</p> 
     * @return Cost <p>SQL优化后的成本节约详情，可解析为JSON，无需优化时输出为空。</p>
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set <p>SQL优化后的成本节约详情，可解析为JSON，无需优化时输出为空。</p>
     * @param Cost <p>SQL优化后的成本节约详情，可解析为JSON，无需优化时输出为空。</p>
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
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

    public DescribeUserSqlAdviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserSqlAdviceResponse(DescribeUserSqlAdviceResponse source) {
        if (source.Advices != null) {
            this.Advices = new String(source.Advices);
        }
        if (source.Comments != null) {
            this.Comments = new String(source.Comments);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Tables != null) {
            this.Tables = new String(source.Tables);
        }
        if (source.SqlPlan != null) {
            this.SqlPlan = new String(source.SqlPlan);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Advices", this.Advices);
        this.setParamSimple(map, prefix + "Comments", this.Comments);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Tables", this.Tables);
        this.setParamSimple(map, prefix + "SqlPlan", this.SqlPlan);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

