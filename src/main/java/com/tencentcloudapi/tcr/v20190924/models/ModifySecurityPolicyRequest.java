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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityPolicyRequest extends AbstractModel{

    /**
    * 实例的Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * PolicyId
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * 192.168.0.0/24 白名单Ip
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 实例的Id 
     * @return RegistryId 实例的Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例的Id
     * @param RegistryId 实例的Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get PolicyId 
     * @return PolicyIndex PolicyId
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set PolicyId
     * @param PolicyIndex PolicyId
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get 192.168.0.0/24 白名单Ip 
     * @return CidrBlock 192.168.0.0/24 白名单Ip
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 192.168.0.0/24 白名单Ip
     * @param CidrBlock 192.168.0.0/24 白名单Ip
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifySecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityPolicyRequest(ModifySecurityPolicyRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.PolicyIndex != null) {
            this.PolicyIndex = new Long(source.PolicyIndex);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

