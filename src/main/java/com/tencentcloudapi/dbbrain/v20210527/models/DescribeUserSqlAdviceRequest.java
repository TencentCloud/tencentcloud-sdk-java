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

public class DescribeUserSqlAdviceRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
    * <p>服务产品类型，支持值&quot;dcdb&quot; - 云数据库TDSQL MySQL；&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL；&quot;dbbrain-mysql&quot; - 自建 MySQL，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>服务产品类型，支持值&quot;dcdb&quot; - 云数据库TDSQL MySQL；&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL；&quot;dbbrain-mysql&quot; - 自建 MySQL，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值&quot;dcdb&quot; - 云数据库TDSQL MySQL；&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL；&quot;dbbrain-mysql&quot; - 自建 MySQL，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值&quot;dcdb&quot; - 云数据库TDSQL MySQL；&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL；&quot;dbbrain-mysql&quot; - 自建 MySQL，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值&quot;dcdb&quot; - 云数据库TDSQL MySQL；&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL；&quot;dbbrain-mysql&quot; - 自建 MySQL，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeUserSqlAdviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserSqlAdviceRequest(DescribeUserSqlAdviceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

