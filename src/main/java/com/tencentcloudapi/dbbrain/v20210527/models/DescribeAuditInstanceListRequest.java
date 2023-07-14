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

public class DescribeAuditInstanceListRequest extends AbstractModel{

    /**
    * 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 与Product保持一致。如："dcdb" ,"mariadb"。
    */
    @SerializedName("NodeRequestType")
    @Expose
    private String NodeRequestType;

    /**
    * 审计状态标识，0-未开通审计；1-已开通审计，默认为0。
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

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
    * 查询实例的搜索条件。
    */
    @SerializedName("Filters")
    @Expose
    private AuditInstanceFilter [] Filters;

    /**
     * Get 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。 
     * @return Product 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
     * @param Product 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 与Product保持一致。如："dcdb" ,"mariadb"。 
     * @return NodeRequestType 与Product保持一致。如："dcdb" ,"mariadb"。
     */
    public String getNodeRequestType() {
        return this.NodeRequestType;
    }

    /**
     * Set 与Product保持一致。如："dcdb" ,"mariadb"。
     * @param NodeRequestType 与Product保持一致。如："dcdb" ,"mariadb"。
     */
    public void setNodeRequestType(String NodeRequestType) {
        this.NodeRequestType = NodeRequestType;
    }

    /**
     * Get 审计状态标识，0-未开通审计；1-已开通审计，默认为0。 
     * @return AuditSwitch 审计状态标识，0-未开通审计；1-已开通审计，默认为0。
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set 审计状态标识，0-未开通审计；1-已开通审计，默认为0。
     * @param AuditSwitch 审计状态标识，0-未开通审计；1-已开通审计，默认为0。
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
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

    /**
     * Get 查询实例的搜索条件。 
     * @return Filters 查询实例的搜索条件。
     */
    public AuditInstanceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询实例的搜索条件。
     * @param Filters 查询实例的搜索条件。
     */
    public void setFilters(AuditInstanceFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAuditInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditInstanceListRequest(DescribeAuditInstanceListRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.NodeRequestType != null) {
            this.NodeRequestType = new String(source.NodeRequestType);
        }
        if (source.AuditSwitch != null) {
            this.AuditSwitch = new Long(source.AuditSwitch);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AuditInstanceFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AuditInstanceFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "NodeRequestType", this.NodeRequestType);
        this.setParamSimple(map, prefix + "AuditSwitch", this.AuditSwitch);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

