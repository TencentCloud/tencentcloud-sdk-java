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

public class DescribeDiagDBInstancesRequest extends AbstractModel{

    /**
    * 是否是DBbrain支持的实例，固定传 true。
    */
    @SerializedName("IsSupported")
    @Expose
    private Boolean IsSupported;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 分页参数，偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数，分页值，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据实例名称条件查询。
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 根据实例ID条件查询。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 根据地域条件查询。
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get 是否是DBbrain支持的实例，固定传 true。 
     * @return IsSupported 是否是DBbrain支持的实例，固定传 true。
     */
    public Boolean getIsSupported() {
        return this.IsSupported;
    }

    /**
     * Set 是否是DBbrain支持的实例，固定传 true。
     * @param IsSupported 是否是DBbrain支持的实例，固定传 true。
     */
    public void setIsSupported(Boolean IsSupported) {
        this.IsSupported = IsSupported;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 分页参数，偏移量。 
     * @return Offset 分页参数，偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，偏移量。
     * @param Offset 分页参数，偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，分页值，最大值为100。 
     * @return Limit 分页参数，分页值，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，分页值，最大值为100。
     * @param Limit 分页参数，分页值，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据实例名称条件查询。 
     * @return InstanceNames 根据实例名称条件查询。
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 根据实例名称条件查询。
     * @param InstanceNames 根据实例名称条件查询。
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 根据实例ID条件查询。 
     * @return InstanceIds 根据实例ID条件查询。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 根据实例ID条件查询。
     * @param InstanceIds 根据实例ID条件查询。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 根据地域条件查询。 
     * @return Regions 根据地域条件查询。
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 根据地域条件查询。
     * @param Regions 根据地域条件查询。
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    public DescribeDiagDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagDBInstancesRequest(DescribeDiagDBInstancesRequest source) {
        if (source.IsSupported != null) {
            this.IsSupported = new Boolean(source.IsSupported);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupported", this.IsSupported);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

