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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCloudNativeAPIGatewayCertificateInfoRequest extends AbstractModel{

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 证书id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 绑定的域名列表
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * 证书名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 证书id 
     * @return Id 证书id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 证书id
     * @param Id 证书id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 绑定的域名列表 
     * @return BindDomains 绑定的域名列表
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set 绑定的域名列表
     * @param BindDomains 绑定的域名列表
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get 证书名称 
     * @return Name 证书名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 证书名称
     * @param Name 证书名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public UpdateCloudNativeAPIGatewayCertificateInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCloudNativeAPIGatewayCertificateInfoRequest(UpdateCloudNativeAPIGatewayCertificateInfoRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

