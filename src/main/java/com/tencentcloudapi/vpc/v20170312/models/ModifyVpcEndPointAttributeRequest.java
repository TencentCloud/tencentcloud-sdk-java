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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpcEndPointAttributeRequest extends AbstractModel{

    /**
    * 终端节点ID。
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * 终端节点名称。
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 安全组ID列表。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get 终端节点ID。 
     * @return EndPointId 终端节点ID。
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID。
     * @param EndPointId 终端节点ID。
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get 终端节点名称。 
     * @return EndPointName 终端节点名称。
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名称。
     * @param EndPointName 终端节点名称。
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 安全组ID列表。 
     * @return SecurityGroupIds 安全组ID列表。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID列表。
     * @param SecurityGroupIds 安全组ID列表。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public ModifyVpcEndPointAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpcEndPointAttributeRequest(ModifyVpcEndPointAttributeRequest source) {
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
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
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

