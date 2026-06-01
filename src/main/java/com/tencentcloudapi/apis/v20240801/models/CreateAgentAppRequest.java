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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentAppRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>认证类型</p>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>OAuth2资源服务器ID</p>
    */
    @SerializedName("OAuth2ResourceServerID")
    @Expose
    private String OAuth2ResourceServerID;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>API认证列表</p>
    */
    @SerializedName("ConnectorIDs")
    @Expose
    private String [] ConnectorIDs;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>认证类型</p> 
     * @return AuthType <p>认证类型</p>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证类型</p>
     * @param AuthType <p>认证类型</p>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>OAuth2资源服务器ID</p> 
     * @return OAuth2ResourceServerID <p>OAuth2资源服务器ID</p>
     */
    public String getOAuth2ResourceServerID() {
        return this.OAuth2ResourceServerID;
    }

    /**
     * Set <p>OAuth2资源服务器ID</p>
     * @param OAuth2ResourceServerID <p>OAuth2资源服务器ID</p>
     */
    public void setOAuth2ResourceServerID(String OAuth2ResourceServerID) {
        this.OAuth2ResourceServerID = OAuth2ResourceServerID;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>API认证列表</p> 
     * @return ConnectorIDs <p>API认证列表</p>
     */
    public String [] getConnectorIDs() {
        return this.ConnectorIDs;
    }

    /**
     * Set <p>API认证列表</p>
     * @param ConnectorIDs <p>API认证列表</p>
     */
    public void setConnectorIDs(String [] ConnectorIDs) {
        this.ConnectorIDs = ConnectorIDs;
    }

    public CreateAgentAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentAppRequest(CreateAgentAppRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.OAuth2ResourceServerID != null) {
            this.OAuth2ResourceServerID = new String(source.OAuth2ResourceServerID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConnectorIDs != null) {
            this.ConnectorIDs = new String[source.ConnectorIDs.length];
            for (int i = 0; i < source.ConnectorIDs.length; i++) {
                this.ConnectorIDs[i] = new String(source.ConnectorIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "OAuth2ResourceServerID", this.OAuth2ResourceServerID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "ConnectorIDs.", this.ConnectorIDs);

    }
}

