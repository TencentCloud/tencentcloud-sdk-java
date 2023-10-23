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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationIdentityRequest extends AbstractModel {

    /**
    * 身份名称
    */
    @SerializedName("IdentityAliasName")
    @Expose
    private String IdentityAliasName;

    /**
    * 身份策略
    */
    @SerializedName("IdentityPolicy")
    @Expose
    private IdentityPolicy [] IdentityPolicy;

    /**
    * 身份描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 身份名称 
     * @return IdentityAliasName 身份名称
     */
    public String getIdentityAliasName() {
        return this.IdentityAliasName;
    }

    /**
     * Set 身份名称
     * @param IdentityAliasName 身份名称
     */
    public void setIdentityAliasName(String IdentityAliasName) {
        this.IdentityAliasName = IdentityAliasName;
    }

    /**
     * Get 身份策略 
     * @return IdentityPolicy 身份策略
     */
    public IdentityPolicy [] getIdentityPolicy() {
        return this.IdentityPolicy;
    }

    /**
     * Set 身份策略
     * @param IdentityPolicy 身份策略
     */
    public void setIdentityPolicy(IdentityPolicy [] IdentityPolicy) {
        this.IdentityPolicy = IdentityPolicy;
    }

    /**
     * Get 身份描述 
     * @return Description 身份描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 身份描述
     * @param Description 身份描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateOrganizationIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationIdentityRequest(CreateOrganizationIdentityRequest source) {
        if (source.IdentityAliasName != null) {
            this.IdentityAliasName = new String(source.IdentityAliasName);
        }
        if (source.IdentityPolicy != null) {
            this.IdentityPolicy = new IdentityPolicy[source.IdentityPolicy.length];
            for (int i = 0; i < source.IdentityPolicy.length; i++) {
                this.IdentityPolicy[i] = new IdentityPolicy(source.IdentityPolicy[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityAliasName", this.IdentityAliasName);
        this.setParamArrayObj(map, prefix + "IdentityPolicy.", this.IdentityPolicy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

