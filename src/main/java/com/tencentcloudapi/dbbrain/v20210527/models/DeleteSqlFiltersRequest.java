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

public class DeleteSqlFiltersRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 限流任务ID列表。通过接口[创建实例SQL限流任务](https://cloud.tencent.com/document/product/1130/72835)获得。
    */
    @SerializedName("FilterIds")
    @Expose
    private Long [] FilterIds;

    /**
    * 通过 [VerifyUserAccount](https://cloud.tencent.com/document/product/1130/72828) 获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 限流任务ID列表。通过接口[创建实例SQL限流任务](https://cloud.tencent.com/document/product/1130/72835)获得。 
     * @return FilterIds 限流任务ID列表。通过接口[创建实例SQL限流任务](https://cloud.tencent.com/document/product/1130/72835)获得。
     */
    public Long [] getFilterIds() {
        return this.FilterIds;
    }

    /**
     * Set 限流任务ID列表。通过接口[创建实例SQL限流任务](https://cloud.tencent.com/document/product/1130/72835)获得。
     * @param FilterIds 限流任务ID列表。通过接口[创建实例SQL限流任务](https://cloud.tencent.com/document/product/1130/72835)获得。
     */
    public void setFilterIds(Long [] FilterIds) {
        this.FilterIds = FilterIds;
    }

    /**
     * Get 通过 [VerifyUserAccount](https://cloud.tencent.com/document/product/1130/72828) 获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。 
     * @return SessionToken 通过 [VerifyUserAccount](https://cloud.tencent.com/document/product/1130/72828) 获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set 通过 [VerifyUserAccount](https://cloud.tencent.com/document/product/1130/72828) 获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
     * @param SessionToken 通过 [VerifyUserAccount](https://cloud.tencent.com/document/product/1130/72828) 获取有效期为5分钟的会话token，使用后会自动延长token有效期至五分钟后。
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
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

    public DeleteSqlFiltersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSqlFiltersRequest(DeleteSqlFiltersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FilterIds != null) {
            this.FilterIds = new Long[source.FilterIds.length];
            for (int i = 0; i < source.FilterIds.length; i++) {
                this.FilterIds[i] = new Long(source.FilterIds[i]);
            }
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
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
        this.setParamArraySimple(map, prefix + "FilterIds.", this.FilterIds);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

