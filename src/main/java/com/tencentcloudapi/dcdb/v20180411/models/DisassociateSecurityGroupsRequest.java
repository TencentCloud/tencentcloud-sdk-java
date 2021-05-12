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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest extends AbstractModel{

    /**
    * 数据库引擎名称，本接口取值：dcdb。
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
     * Get 数据库引擎名称，本接口取值：dcdb。 
     * @return Product 数据库引擎名称，本接口取值：dcdb。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称，本接口取值：dcdb。
     * @param Product 数据库引擎名称，本接口取值：dcdb。
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

    public DisassociateSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateSecurityGroupsRequest(DisassociateSecurityGroupsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
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

