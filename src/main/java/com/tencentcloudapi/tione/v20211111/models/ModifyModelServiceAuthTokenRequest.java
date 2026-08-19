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
    * <p>服务组 id</p>
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>是否需要重置，如果为 true，重置 token 值</p>
    */
    @SerializedName("NeedReset")
    @Expose
    private Boolean NeedReset;

    /**
    * <p>AuthToken 数据</p>
    */
    @SerializedName("AuthToken")
    @Expose
    private AuthToken AuthToken;

    /**
     * Get <p>服务组 id</p> 
     * @return ServiceGroupId <p>服务组 id</p>
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set <p>服务组 id</p>
     * @param ServiceGroupId <p>服务组 id</p>
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>是否需要重置，如果为 true，重置 token 值</p> 
     * @return NeedReset <p>是否需要重置，如果为 true，重置 token 值</p>
     */
    public Boolean getNeedReset() {
        return this.NeedReset;
    }

    /**
     * Set <p>是否需要重置，如果为 true，重置 token 值</p>
     * @param NeedReset <p>是否需要重置，如果为 true，重置 token 值</p>
     */
    public void setNeedReset(Boolean NeedReset) {
        this.NeedReset = NeedReset;
    }

    /**
     * Get <p>AuthToken 数据</p> 
     * @return AuthToken <p>AuthToken 数据</p>
     */
    public AuthToken getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set <p>AuthToken 数据</p>
     * @param AuthToken <p>AuthToken 数据</p>
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
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
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
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "NeedReset", this.NeedReset);
        this.setParamObj(map, prefix + "AuthToken.", this.AuthToken);

    }
}

