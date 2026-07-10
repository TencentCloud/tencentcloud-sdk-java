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

public class CreateIgnoreDiagRecordRequest extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型，取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）、redis（云数据库 Redis）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>诊断项名称，用于指定需要忽略或取消忽略的诊断事件类型。</p>
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * <p>忽略状态，取值：1（取消忽略），2（忽略）。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型，取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）、redis（云数据库 Redis）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）。</p> 
     * @return Product <p>服务产品类型，取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）、redis（云数据库 Redis）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）、redis（云数据库 Redis）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）。</p>
     * @param Product <p>服务产品类型，取值：mysql（云数据库 MySQL）、cynosdb（TDSQL-C MySQL 版）、dcdb（TDSQL MySQL 版）、mariadb（TDSQL MariaDB 版）、redis（云数据库 Redis）、mongodb（云数据库 MongoDB）、postgres（云数据库 PostgreSQL）。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>诊断项名称，用于指定需要忽略或取消忽略的诊断事件类型。</p> 
     * @return DiagItem <p>诊断项名称，用于指定需要忽略或取消忽略的诊断事件类型。</p>
     */
    public String getDiagItem() {
        return this.DiagItem;
    }

    /**
     * Set <p>诊断项名称，用于指定需要忽略或取消忽略的诊断事件类型。</p>
     * @param DiagItem <p>诊断项名称，用于指定需要忽略或取消忽略的诊断事件类型。</p>
     */
    public void setDiagItem(String DiagItem) {
        this.DiagItem = DiagItem;
    }

    /**
     * Get <p>忽略状态，取值：1（取消忽略），2（忽略）。</p> 
     * @return Status <p>忽略状态，取值：1（取消忽略），2（忽略）。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>忽略状态，取值：1（取消忽略），2（忽略）。</p>
     * @param Status <p>忽略状态，取值：1（取消忽略），2（忽略）。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public CreateIgnoreDiagRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIgnoreDiagRecordRequest(CreateIgnoreDiagRecordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.DiagItem != null) {
            this.DiagItem = new String(source.DiagItem);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "DiagItem", this.DiagItem);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

