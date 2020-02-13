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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest extends AbstractModel{

    /**
    * 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 安全组Id。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 实例ID列表，一个或者多个实例Id组成的数组。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。 
     * @return Product 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
     * @param Product 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 安全组Id。 
     * @return SecurityGroupId 安全组Id。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组Id。
     * @param SecurityGroupId 安全组Id。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 实例ID列表，一个或者多个实例Id组成的数组。 
     * @return InstanceIds 实例ID列表，一个或者多个实例Id组成的数组。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表，一个或者多个实例Id组成的数组。
     * @param InstanceIds 实例ID列表，一个或者多个实例Id组成的数组。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

