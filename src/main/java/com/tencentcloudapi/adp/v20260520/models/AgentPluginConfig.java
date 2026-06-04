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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginConfig extends AbstractModel {

    /**
    * <p>插件id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>插件 Header 参数</p>
    */
    @SerializedName("HeaderParameterList")
    @Expose
    private AgentPluginParameter [] HeaderParameterList;

    /**
    * <p>插件 Query 参数</p>
    */
    @SerializedName("QueryParameterList")
    @Expose
    private AgentPluginParameter [] QueryParameterList;

    /**
    * <p>是否使用CAM一键授权，仅 auth_type=2时生效</p>
    */
    @SerializedName("EnableCamRoleAuth")
    @Expose
    private Boolean EnableCamRoleAuth;

    /**
    * <p>授权类型</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： API Key</li><li>2： CAM授权</li><li>3： OAuth2.0授权</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * OAuth 授权同意模式；0-开发者授权；1-使用者授权（仅在auth_type=3时生效）
    */
    @SerializedName("OAuthConsent")
    @Expose
    private Long OAuthConsent;

    /**
     * Get <p>插件id</p> 
     * @return PluginId <p>插件id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>插件id</p>
     * @param PluginId <p>插件id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>插件 Header 参数</p> 
     * @return HeaderParameterList <p>插件 Header 参数</p>
     */
    public AgentPluginParameter [] getHeaderParameterList() {
        return this.HeaderParameterList;
    }

    /**
     * Set <p>插件 Header 参数</p>
     * @param HeaderParameterList <p>插件 Header 参数</p>
     */
    public void setHeaderParameterList(AgentPluginParameter [] HeaderParameterList) {
        this.HeaderParameterList = HeaderParameterList;
    }

    /**
     * Get <p>插件 Query 参数</p> 
     * @return QueryParameterList <p>插件 Query 参数</p>
     */
    public AgentPluginParameter [] getQueryParameterList() {
        return this.QueryParameterList;
    }

    /**
     * Set <p>插件 Query 参数</p>
     * @param QueryParameterList <p>插件 Query 参数</p>
     */
    public void setQueryParameterList(AgentPluginParameter [] QueryParameterList) {
        this.QueryParameterList = QueryParameterList;
    }

    /**
     * Get <p>是否使用CAM一键授权，仅 auth_type=2时生效</p> 
     * @return EnableCamRoleAuth <p>是否使用CAM一键授权，仅 auth_type=2时生效</p>
     */
    public Boolean getEnableCamRoleAuth() {
        return this.EnableCamRoleAuth;
    }

    /**
     * Set <p>是否使用CAM一键授权，仅 auth_type=2时生效</p>
     * @param EnableCamRoleAuth <p>是否使用CAM一键授权，仅 auth_type=2时生效</p>
     */
    public void setEnableCamRoleAuth(Boolean EnableCamRoleAuth) {
        this.EnableCamRoleAuth = EnableCamRoleAuth;
    }

    /**
     * Get <p>授权类型</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： API Key</li><li>2： CAM授权</li><li>3： OAuth2.0授权</li></ul> 
     * @return AuthType <p>授权类型</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： API Key</li><li>2： CAM授权</li><li>3： OAuth2.0授权</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>授权类型</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： API Key</li><li>2： CAM授权</li><li>3： OAuth2.0授权</li></ul>
     * @param AuthType <p>授权类型</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： API Key</li><li>2： CAM授权</li><li>3： OAuth2.0授权</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get OAuth 授权同意模式；0-开发者授权；1-使用者授权（仅在auth_type=3时生效） 
     * @return OAuthConsent OAuth 授权同意模式；0-开发者授权；1-使用者授权（仅在auth_type=3时生效）
     */
    public Long getOAuthConsent() {
        return this.OAuthConsent;
    }

    /**
     * Set OAuth 授权同意模式；0-开发者授权；1-使用者授权（仅在auth_type=3时生效）
     * @param OAuthConsent OAuth 授权同意模式；0-开发者授权；1-使用者授权（仅在auth_type=3时生效）
     */
    public void setOAuthConsent(Long OAuthConsent) {
        this.OAuthConsent = OAuthConsent;
    }

    public AgentPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginConfig(AgentPluginConfig source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.HeaderParameterList != null) {
            this.HeaderParameterList = new AgentPluginParameter[source.HeaderParameterList.length];
            for (int i = 0; i < source.HeaderParameterList.length; i++) {
                this.HeaderParameterList[i] = new AgentPluginParameter(source.HeaderParameterList[i]);
            }
        }
        if (source.QueryParameterList != null) {
            this.QueryParameterList = new AgentPluginParameter[source.QueryParameterList.length];
            for (int i = 0; i < source.QueryParameterList.length; i++) {
                this.QueryParameterList[i] = new AgentPluginParameter(source.QueryParameterList[i]);
            }
        }
        if (source.EnableCamRoleAuth != null) {
            this.EnableCamRoleAuth = new Boolean(source.EnableCamRoleAuth);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.OAuthConsent != null) {
            this.OAuthConsent = new Long(source.OAuthConsent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamArrayObj(map, prefix + "HeaderParameterList.", this.HeaderParameterList);
        this.setParamArrayObj(map, prefix + "QueryParameterList.", this.QueryParameterList);
        this.setParamSimple(map, prefix + "EnableCamRoleAuth", this.EnableCamRoleAuth);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "OAuthConsent", this.OAuthConsent);

    }
}

