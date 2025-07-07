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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkspaceTokenRequest extends AbstractModel {

    /**
    * 工作空间 SpaceKey
    */
    @SerializedName("SpaceKey")
    @Expose
    private String SpaceKey;

    /**
    * token过期时间，单位是秒，默认 3600
    */
    @SerializedName("TokenExpiredLimitSec")
    @Expose
    private Long TokenExpiredLimitSec;

    /**
    * token 授权策略，可选值为 workspace-run-only, all。默认为 workspace-run-only
    */
    @SerializedName("Policies")
    @Expose
    private String [] Policies;

    /**
     * Get 工作空间 SpaceKey 
     * @return SpaceKey 工作空间 SpaceKey
     */
    public String getSpaceKey() {
        return this.SpaceKey;
    }

    /**
     * Set 工作空间 SpaceKey
     * @param SpaceKey 工作空间 SpaceKey
     */
    public void setSpaceKey(String SpaceKey) {
        this.SpaceKey = SpaceKey;
    }

    /**
     * Get token过期时间，单位是秒，默认 3600 
     * @return TokenExpiredLimitSec token过期时间，单位是秒，默认 3600
     */
    public Long getTokenExpiredLimitSec() {
        return this.TokenExpiredLimitSec;
    }

    /**
     * Set token过期时间，单位是秒，默认 3600
     * @param TokenExpiredLimitSec token过期时间，单位是秒，默认 3600
     */
    public void setTokenExpiredLimitSec(Long TokenExpiredLimitSec) {
        this.TokenExpiredLimitSec = TokenExpiredLimitSec;
    }

    /**
     * Get token 授权策略，可选值为 workspace-run-only, all。默认为 workspace-run-only 
     * @return Policies token 授权策略，可选值为 workspace-run-only, all。默认为 workspace-run-only
     */
    public String [] getPolicies() {
        return this.Policies;
    }

    /**
     * Set token 授权策略，可选值为 workspace-run-only, all。默认为 workspace-run-only
     * @param Policies token 授权策略，可选值为 workspace-run-only, all。默认为 workspace-run-only
     */
    public void setPolicies(String [] Policies) {
        this.Policies = Policies;
    }

    public CreateWorkspaceTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkspaceTokenRequest(CreateWorkspaceTokenRequest source) {
        if (source.SpaceKey != null) {
            this.SpaceKey = new String(source.SpaceKey);
        }
        if (source.TokenExpiredLimitSec != null) {
            this.TokenExpiredLimitSec = new Long(source.TokenExpiredLimitSec);
        }
        if (source.Policies != null) {
            this.Policies = new String[source.Policies.length];
            for (int i = 0; i < source.Policies.length; i++) {
                this.Policies[i] = new String(source.Policies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceKey", this.SpaceKey);
        this.setParamSimple(map, prefix + "TokenExpiredLimitSec", this.TokenExpiredLimitSec);
        this.setParamArraySimple(map, prefix + "Policies.", this.Policies);

    }
}

