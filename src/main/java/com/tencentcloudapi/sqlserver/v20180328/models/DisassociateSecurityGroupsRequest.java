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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest extends AbstractModel {

    /**
    * 安全组ID。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 实例ID 列表，一个或者多个实例ID组成的数组。多个实例必须是同一个地域，同一个可用区，同一个项目下的。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
     * Get 安全组ID。 
     * @return SecurityGroupId 安全组ID。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组ID。
     * @param SecurityGroupId 安全组ID。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 实例ID 列表，一个或者多个实例ID组成的数组。多个实例必须是同一个地域，同一个可用区，同一个项目下的。 
     * @return InstanceIdSet 实例ID 列表，一个或者多个实例ID组成的数组。多个实例必须是同一个地域，同一个可用区，同一个项目下的。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 实例ID 列表，一个或者多个实例ID组成的数组。多个实例必须是同一个地域，同一个可用区，同一个项目下的。
     * @param InstanceIdSet 实例ID 列表，一个或者多个实例ID组成的数组。多个实例必须是同一个地域，同一个可用区，同一个项目下的。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    public DisassociateSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateSecurityGroupsRequest(DisassociateSecurityGroupsRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);

    }
}

