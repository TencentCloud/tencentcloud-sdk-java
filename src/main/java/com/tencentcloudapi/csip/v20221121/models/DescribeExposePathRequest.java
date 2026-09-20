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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExposePathRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>资产ID</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>资产IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>资产域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>端口或端口范围</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>资产ID</p> 
     * @return AssetId <p>资产ID</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产ID</p>
     * @param AssetId <p>资产ID</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>资产IP</p> 
     * @return Ip <p>资产IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>资产IP</p>
     * @param Ip <p>资产IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>资产域名</p> 
     * @return Domain <p>资产域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>资产域名</p>
     * @param Domain <p>资产域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>端口或端口范围</p> 
     * @return Port <p>端口或端口范围</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口或端口范围</p>
     * @param Port <p>端口或端口范围</p>
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

