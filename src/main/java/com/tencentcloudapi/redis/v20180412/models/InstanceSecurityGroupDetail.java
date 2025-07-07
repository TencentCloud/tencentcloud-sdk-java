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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSecurityGroupDetail extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 安全组信息，包括：安全组 ID、安全组名称、安全组出入站规则。
    */
    @SerializedName("SecurityGroupDetails")
    @Expose
    private SecurityGroupDetail [] SecurityGroupDetails;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 安全组信息，包括：安全组 ID、安全组名称、安全组出入站规则。 
     * @return SecurityGroupDetails 安全组信息，包括：安全组 ID、安全组名称、安全组出入站规则。
     */
    public SecurityGroupDetail [] getSecurityGroupDetails() {
        return this.SecurityGroupDetails;
    }

    /**
     * Set 安全组信息，包括：安全组 ID、安全组名称、安全组出入站规则。
     * @param SecurityGroupDetails 安全组信息，包括：安全组 ID、安全组名称、安全组出入站规则。
     */
    public void setSecurityGroupDetails(SecurityGroupDetail [] SecurityGroupDetails) {
        this.SecurityGroupDetails = SecurityGroupDetails;
    }

    public InstanceSecurityGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSecurityGroupDetail(InstanceSecurityGroupDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SecurityGroupDetails != null) {
            this.SecurityGroupDetails = new SecurityGroupDetail[source.SecurityGroupDetails.length];
            for (int i = 0; i < source.SecurityGroupDetails.length; i++) {
                this.SecurityGroupDetails[i] = new SecurityGroupDetail(source.SecurityGroupDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "SecurityGroupDetails.", this.SecurityGroupDetails);

    }
}

