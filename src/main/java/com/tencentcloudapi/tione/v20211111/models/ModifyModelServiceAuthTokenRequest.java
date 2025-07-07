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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModelServiceAuthTokenRequest extends AbstractModel {

    /**
    * 服务组 id
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 是否需要重置，如果为 true，重置 token 值
    */
    @SerializedName("NeedReset")
    @Expose
    private Boolean NeedReset;

    /**
    * AuthToken 数据
    */
    @SerializedName("AuthToken")
    @Expose
    private AuthToken AuthToken;

    /**
     * Get 服务组 id 
     * @return ServiceGroupId 服务组 id
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 服务组 id
     * @param ServiceGroupId 服务组 id
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 是否需要重置，如果为 true，重置 token 值 
     * @return NeedReset 是否需要重置，如果为 true，重置 token 值
     */
    public Boolean getNeedReset() {
        return this.NeedReset;
    }

    /**
     * Set 是否需要重置，如果为 true，重置 token 值
     * @param NeedReset 是否需要重置，如果为 true，重置 token 值
     */
    public void setNeedReset(Boolean NeedReset) {
        this.NeedReset = NeedReset;
    }

    /**
     * Get AuthToken 数据 
     * @return AuthToken AuthToken 数据
     */
    public AuthToken getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set AuthToken 数据
     * @param AuthToken AuthToken 数据
     */
    public void setAuthToken(AuthToken AuthToken) {
        this.AuthToken = AuthToken;
    }

    public ModifyModelServiceAuthTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModelServiceAuthTokenRequest(ModifyModelServiceAuthTokenRequest source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.NeedReset != null) {
            this.NeedReset = new Boolean(source.NeedReset);
        }
        if (source.AuthToken != null) {
            this.AuthToken = new AuthToken(source.AuthToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "NeedReset", this.NeedReset);
        this.setParamObj(map, prefix + "AuthToken.", this.AuthToken);

    }
}

