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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserSqlAdviceResponse extends AbstractModel{

    /**
    * SQL优化建议，可解析为JSON数组。
    */
    @SerializedName("Advices")
    @Expose
    private String Advices;

    /**
    * SQL优化建议备注，可解析为String数组。
    */
    @SerializedName("Comments")
    @Expose
    private String Comments;

    /**
    * SQL语句。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * 库名。
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 相关表的DDL信息，可解析为JSON数组。
    */
    @SerializedName("Tables")
    @Expose
    private String Tables;

    /**
    * SQL执行计划，可解析为JSON。
    */
    @SerializedName("SqlPlan")
    @Expose
    private String SqlPlan;

    /**
    * SQL优化后的成本节约详情，可解析为JSON。
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SQL优化建议，可解析为JSON数组。 
     * @return Advices SQL优化建议，可解析为JSON数组。
     */
    public String getAdvices() {
        return this.Advices;
    }

    /**
     * Set SQL优化建议，可解析为JSON数组。
     * @param Advices SQL优化建议，可解析为JSON数组。
     */
    public void setAdvices(String Advices) {
        this.Advices = Advices;
    }

    /**
     * Get SQL优化建议备注，可解析为String数组。 
     * @return Comments SQL优化建议备注，可解析为String数组。
     */
    public String getComments() {
        return this.Comments;
    }

    /**
     * Set SQL优化建议备注，可解析为String数组。
     * @param Comments SQL优化建议备注，可解析为String数组。
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    /**
     * Get SQL语句。 
     * @return SqlText SQL语句。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL语句。
     * @param SqlText SQL语句。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get 库名。 
     * @return Schema 库名。
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 库名。
     * @param Schema 库名。
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 相关表的DDL信息，可解析为JSON数组。 
     * @return Tables 相关表的DDL信息，可解析为JSON数组。
     */
    public String getTables() {
        return this.Tables;
    }

    /**
     * Set 相关表的DDL信息，可解析为JSON数组。
     * @param Tables 相关表的DDL信息，可解析为JSON数组。
     */
    public void setTables(String Tables) {
        this.Tables = Tables;
    }

    /**
     * Get SQL执行计划，可解析为JSON。 
     * @return SqlPlan SQL执行计划，可解析为JSON。
     */
    public String getSqlPlan() {
        return this.SqlPlan;
    }

    /**
     * Set SQL执行计划，可解析为JSON。
     * @param SqlPlan SQL执行计划，可解析为JSON。
     */
    public void setSqlPlan(String SqlPlan) {
        this.SqlPlan = SqlPlan;
    }

    /**
     * Get SQL优化后的成本节约详情，可解析为JSON。 
     * @return Cost SQL优化后的成本节约详情，可解析为JSON。
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set SQL优化后的成本节约详情，可解析为JSON。
     * @param Cost SQL优化后的成本节约详情，可解析为JSON。
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
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

