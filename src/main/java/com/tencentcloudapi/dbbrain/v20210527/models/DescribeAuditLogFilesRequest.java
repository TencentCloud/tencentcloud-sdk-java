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

public class DescribeAuditLogFilesRequest extends AbstractModel{

    /**
    * 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB for MariaDB。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 与Product保持一致。如："dcdb" ,"mariadb"
    */
    @SerializedName("NodeRequestType")
    @Expose
    private String NodeRequestType;

    /**
    * 实例 ID 。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询数目，默认为20，最大为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB for MariaDB。 
     * @return Product 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB for MariaDB。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB for MariaDB。
     * @param Product 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB for MariaDB。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 与Product保持一致。如："dcdb" ,"mariadb" 
     * @return NodeRequestType 与Product保持一致。如："dcdb" ,"mariadb"
     */
    public String getNodeRequestType() {
        return this.NodeRequestType;
    }

    /**
     * Set 与Product保持一致。如："dcdb" ,"mariadb"
     * @param NodeRequestType 与Product保持一致。如："dcdb" ,"mariadb"
     */
    public void setNodeRequestType(String NodeRequestType) {
        this.NodeRequestType = NodeRequestType;
    }

    /**
     * Get 实例 ID 。 
     * @return InstanceId 实例 ID 。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID 。
     * @param InstanceId 实例 ID 。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询数目，默认为20，最大为100。 
     * @return Limit 查询数目，默认为20，最大为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数目，默认为20，最大为100。
     * @param Limit 查询数目，默认为20，最大为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAuditLogFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogFilesRequest(DescribeAuditLogFilesRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.NodeRequestType != null) {
            this.NodeRequestType = new String(source.NodeRequestType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "NodeRequestType", this.NodeRequestType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

