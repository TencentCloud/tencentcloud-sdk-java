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

public class DescribeSqlExplainV2Request extends AbstractModel {

    /**
    * <p>服务产品类型。取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>待分析的 SQL 语句。仅支持单条 SELECT 语句；若以 EXPLAIN 开头会自动剥离 EXPLAIN 前缀后分析。最大 4096 字符。</p>
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>实例 ID。MySQL: cdb-xxxxxxx，TDSQL-C: cynosdbmysql-ins-xxxxxxx，MariaDB: tdsql-xxxxx，TDSQL-MySQL： '集群id&amp;分片id',如果TDSQL-MySQL数据库类型同时传入了集群id则instanceId字段只需要传入分片id。最大 64 字符。与 ClusterId 至少需传入其一。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>数据库名。可选；为空时按当前 SQL 上下文执行。最大 64 字符。</p>
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * <p>集群 ID。仅 TDSQL-MySQL时使用，与 InstanceId 至少需传入其一。最大 64 字符。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>是否输出可视化执行树</p><p>默认值：false</p>
    */
    @SerializedName("Visual")
    @Expose
    private Boolean Visual;

    /**
     * Get <p>服务产品类型。取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）。</p> 
     * @return Product <p>服务产品类型。取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型。取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）。</p>
     * @param Product <p>服务产品类型。取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>待分析的 SQL 语句。仅支持单条 SELECT 语句；若以 EXPLAIN 开头会自动剥离 EXPLAIN 前缀后分析。最大 4096 字符。</p> 
     * @return SqlText <p>待分析的 SQL 语句。仅支持单条 SELECT 语句；若以 EXPLAIN 开头会自动剥离 EXPLAIN 前缀后分析。最大 4096 字符。</p>
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>待分析的 SQL 语句。仅支持单条 SELECT 语句；若以 EXPLAIN 开头会自动剥离 EXPLAIN 前缀后分析。最大 4096 字符。</p>
     * @param SqlText <p>待分析的 SQL 语句。仅支持单条 SELECT 语句；若以 EXPLAIN 开头会自动剥离 EXPLAIN 前缀后分析。最大 4096 字符。</p>
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>实例 ID。MySQL: cdb-xxxxxxx，TDSQL-C: cynosdbmysql-ins-xxxxxxx，MariaDB: tdsql-xxxxx，TDSQL-MySQL： '集群id&amp;分片id',如果TDSQL-MySQL数据库类型同时传入了集群id则instanceId字段只需要传入分片id。最大 64 字符。与 ClusterId 至少需传入其一。</p> 
     * @return InstanceId <p>实例 ID。MySQL: cdb-xxxxxxx，TDSQL-C: cynosdbmysql-ins-xxxxxxx，MariaDB: tdsql-xxxxx，TDSQL-MySQL： '集群id&amp;分片id',如果TDSQL-MySQL数据库类型同时传入了集群id则instanceId字段只需要传入分片id。最大 64 字符。与 ClusterId 至少需传入其一。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。MySQL: cdb-xxxxxxx，TDSQL-C: cynosdbmysql-ins-xxxxxxx，MariaDB: tdsql-xxxxx，TDSQL-MySQL： '集群id&amp;分片id',如果TDSQL-MySQL数据库类型同时传入了集群id则instanceId字段只需要传入分片id。最大 64 字符。与 ClusterId 至少需传入其一。</p>
     * @param InstanceId <p>实例 ID。MySQL: cdb-xxxxxxx，TDSQL-C: cynosdbmysql-ins-xxxxxxx，MariaDB: tdsql-xxxxx，TDSQL-MySQL： '集群id&amp;分片id',如果TDSQL-MySQL数据库类型同时传入了集群id则instanceId字段只需要传入分片id。最大 64 字符。与 ClusterId 至少需传入其一。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>数据库名。可选；为空时按当前 SQL 上下文执行。最大 64 字符。</p> 
     * @return Schema <p>数据库名。可选；为空时按当前 SQL 上下文执行。最大 64 字符。</p>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>数据库名。可选；为空时按当前 SQL 上下文执行。最大 64 字符。</p>
     * @param Schema <p>数据库名。可选；为空时按当前 SQL 上下文执行。最大 64 字符。</p>
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get <p>集群 ID。仅 TDSQL-MySQL时使用，与 InstanceId 至少需传入其一。最大 64 字符。</p> 
     * @return ClusterId <p>集群 ID。仅 TDSQL-MySQL时使用，与 InstanceId 至少需传入其一。最大 64 字符。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。仅 TDSQL-MySQL时使用，与 InstanceId 至少需传入其一。最大 64 字符。</p>
     * @param ClusterId <p>集群 ID。仅 TDSQL-MySQL时使用，与 InstanceId 至少需传入其一。最大 64 字符。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>是否输出可视化执行树</p><p>默认值：false</p> 
     * @return Visual <p>是否输出可视化执行树</p><p>默认值：false</p>
     */
    public Boolean getVisual() {
        return this.Visual;
    }

    /**
     * Set <p>是否输出可视化执行树</p><p>默认值：false</p>
     * @param Visual <p>是否输出可视化执行树</p><p>默认值：false</p>
     */
    public void setVisual(Boolean Visual) {
        this.Visual = Visual;
    }

    public DescribeSqlExplainV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSqlExplainV2Request(DescribeSqlExplainV2Request source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Visual != null) {
            this.Visual = new Boolean(source.Visual);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Visual", this.Visual);

    }
}

