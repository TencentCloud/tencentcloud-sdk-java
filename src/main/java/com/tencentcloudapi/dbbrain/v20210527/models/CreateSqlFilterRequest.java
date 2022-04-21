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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSqlFilterRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 通过VerifyUserAccount获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * 关键字，用于筛选SQL语句，多个关键字用英文逗号分隔，逗号不能作为关键词，多个关键词之间的关系为“逻辑与”。
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * 最大并发度，取值不能小于0，如果该值设为 0，则表示限制所有匹配的SQL执行。
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * 限流时长，单位秒，支持-1和小于2147483647的正整数，-1表示永不过期。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 通过VerifyUserAccount获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。 
     * @return SessionToken 通过VerifyUserAccount获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set 通过VerifyUserAccount获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
     * @param SessionToken 通过VerifyUserAccount获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。 
     * @return SqlType SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
     * @param SqlType SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get 关键字，用于筛选SQL语句，多个关键字用英文逗号分隔，逗号不能作为关键词，多个关键词之间的关系为“逻辑与”。 
     * @return FilterKey 关键字，用于筛选SQL语句，多个关键字用英文逗号分隔，逗号不能作为关键词，多个关键词之间的关系为“逻辑与”。
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set 关键字，用于筛选SQL语句，多个关键字用英文逗号分隔，逗号不能作为关键词，多个关键词之间的关系为“逻辑与”。
     * @param FilterKey 关键字，用于筛选SQL语句，多个关键字用英文逗号分隔，逗号不能作为关键词，多个关键词之间的关系为“逻辑与”。
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get 最大并发度，取值不能小于0，如果该值设为 0，则表示限制所有匹配的SQL执行。 
     * @return MaxConcurrency 最大并发度，取值不能小于0，如果该值设为 0，则表示限制所有匹配的SQL执行。
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 最大并发度，取值不能小于0，如果该值设为 0，则表示限制所有匹配的SQL执行。
     * @param MaxConcurrency 最大并发度，取值不能小于0，如果该值设为 0，则表示限制所有匹配的SQL执行。
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get 限流时长，单位秒，支持-1和小于2147483647的正整数，-1表示永不过期。 
     * @return Duration 限流时长，单位秒，支持-1和小于2147483647的正整数，-1表示永不过期。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 限流时长，单位秒，支持-1和小于2147483647的正整数，-1表示永不过期。
     * @param Duration 限流时长，单位秒，支持-1和小于2147483647的正整数，-1表示永不过期。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateSqlFilterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSqlFilterRequest(CreateSqlFilterRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.FilterKey != null) {
            this.FilterKey = new String(source.FilterKey);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
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
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

