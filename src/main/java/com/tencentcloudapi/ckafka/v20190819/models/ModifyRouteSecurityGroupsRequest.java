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

public class ModifyRouteSecurityGroupsRequest extends AbstractModel {

    /**
    * 实例路由
    */
    @SerializedName("InstanceRoute")
    @Expose
    private InstanceRoute InstanceRoute;

    /**
    * 修改后的安全组有序列表。
注意:不指定此参数或传空列表则代表解绑所有关联的安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get 实例路由 
     * @return InstanceRoute 实例路由
     */
    public InstanceRoute getInstanceRoute() {
        return this.InstanceRoute;
    }

    /**
     * Set 实例路由
     * @param InstanceRoute 实例路由
     */
    public void setInstanceRoute(InstanceRoute InstanceRoute) {
        this.InstanceRoute = InstanceRoute;
    }

    /**
     * Get 修改后的安全组有序列表。
注意:不指定此参数或传空列表则代表解绑所有关联的安全组。 
     * @return SecurityGroupIds 修改后的安全组有序列表。
注意:不指定此参数或传空列表则代表解绑所有关联的安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 修改后的安全组有序列表。
注意:不指定此参数或传空列表则代表解绑所有关联的安全组。
     * @param SecurityGroupIds 修改后的安全组有序列表。
注意:不指定此参数或传空列表则代表解绑所有关联的安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public ModifyRouteSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRouteSecurityGroupsRequest(ModifyRouteSecurityGroupsRequest source) {
        if (source.InstanceRoute != null) {
            this.InstanceRoute = new InstanceRoute(source.InstanceRoute);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceRoute.", this.InstanceRoute);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

