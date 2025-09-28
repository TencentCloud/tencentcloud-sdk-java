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

public class DescribeAlarmTemplateRequest extends AbstractModel {

    /**
    * 搜索字段
    */
    @SerializedName("TemplateNameRegexp")
    @Expose
    private String TemplateNameRegexp;

    /**
    * 返回限制长度，最大值: 50，默认值: 50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏置，最大值: 无限制，默认值: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 搜索字段 
     * @return TemplateNameRegexp 搜索字段
     */
    public String getTemplateNameRegexp() {
        return this.TemplateNameRegexp;
    }

    /**
     * Set 搜索字段
     * @param TemplateNameRegexp 搜索字段
     */
    public void setTemplateNameRegexp(String TemplateNameRegexp) {
        this.TemplateNameRegexp = TemplateNameRegexp;
    }

    /**
     * Get 返回限制长度，最大值: 50，默认值: 50 
     * @return Limit 返回限制长度，最大值: 50，默认值: 50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回限制长度，最大值: 50，默认值: 50
     * @param Limit 返回限制长度，最大值: 50，默认值: 50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏置，最大值: 无限制，默认值: 0 
     * @return Offset 偏置，最大值: 无限制，默认值: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏置，最大值: 无限制，默认值: 0
     * @param Offset 偏置，最大值: 无限制，默认值: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeAlarmTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmTemplateRequest(DescribeAlarmTemplateRequest source) {
        if (source.TemplateNameRegexp != null) {
            this.TemplateNameRegexp = new String(source.TemplateNameRegexp);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateNameRegexp", this.TemplateNameRegexp);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

