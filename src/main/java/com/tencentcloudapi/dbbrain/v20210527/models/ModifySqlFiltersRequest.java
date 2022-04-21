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

public class ModifySqlFiltersRequest extends AbstractModel{

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
    * SQL限流任务ID列表。
    */
    @SerializedName("FilterIds")
    @Expose
    private Long [] FilterIds;

    /**
    * 限流任务状态，取值支持TERMINATED - 终止。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get SQL限流任务ID列表。 
     * @return FilterIds SQL限流任务ID列表。
     */
    public Long [] getFilterIds() {
        return this.FilterIds;
    }

    /**
     * Set SQL限流任务ID列表。
     * @param FilterIds SQL限流任务ID列表。
     */
    public void setFilterIds(Long [] FilterIds) {
        this.FilterIds = FilterIds;
    }

    /**
     * Get 限流任务状态，取值支持TERMINATED - 终止。 
     * @return Status 限流任务状态，取值支持TERMINATED - 终止。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 限流任务状态，取值支持TERMINATED - 终止。
     * @param Status 限流任务状态，取值支持TERMINATED - 终止。
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public ModifySqlFiltersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySqlFiltersRequest(ModifySqlFiltersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.FilterIds != null) {
            this.FilterIds = new Long[source.FilterIds.length];
            for (int i = 0; i < source.FilterIds.length; i++) {
                this.FilterIds[i] = new Long(source.FilterIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamArraySimple(map, prefix + "FilterIds.", this.FilterIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

