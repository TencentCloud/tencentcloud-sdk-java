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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExposePathRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 资产ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 资产域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 端口或端口范围
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 资产ID 
     * @return AssetId 资产ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产ID
     * @param AssetId 资产ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产IP 
     * @return Ip 资产IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资产IP
     * @param Ip 资产IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 资产域名 
     * @return Domain 资产域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 资产域名
     * @param Domain 资产域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 端口或端口范围 
     * @return Port 端口或端口范围
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口或端口范围
     * @param Port 端口或端口范围
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public DescribeExposePathRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExposePathRequest(DescribeExposePathRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

