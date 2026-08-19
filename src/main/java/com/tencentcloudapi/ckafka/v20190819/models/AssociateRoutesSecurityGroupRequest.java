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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateRoutesSecurityGroupRequest extends AbstractModel {

    /**
    * 绑定路由的列表
    */
    @SerializedName("InstanceRoutes")
    @Expose
    private InstanceRoute [] InstanceRoutes;

    /**
    * 安全组id
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
     * Get 绑定路由的列表 
     * @return InstanceRoutes 绑定路由的列表
     */
    public InstanceRoute [] getInstanceRoutes() {
        return this.InstanceRoutes;
    }

    /**
     * Set 绑定路由的列表
     * @param InstanceRoutes 绑定路由的列表
     */
    public void setInstanceRoutes(InstanceRoute [] InstanceRoutes) {
        this.InstanceRoutes = InstanceRoutes;
    }

    /**
     * Get 安全组id 
     * @return SecurityGroupId 安全组id
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组id
     * @param SecurityGroupId 安全组id
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    public AssociateRoutesSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateRoutesSecurityGroupRequest(AssociateRoutesSecurityGroupRequest source) {
        if (source.InstanceRoutes != null) {
            this.InstanceRoutes = new InstanceRoute[source.InstanceRoutes.length];
            for (int i = 0; i < source.InstanceRoutes.length; i++) {
                this.InstanceRoutes[i] = new InstanceRoute(source.InstanceRoutes[i]);
            }
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceRoutes.", this.InstanceRoutes);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);

    }
}

