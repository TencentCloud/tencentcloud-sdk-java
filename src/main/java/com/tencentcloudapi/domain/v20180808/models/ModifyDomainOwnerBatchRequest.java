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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainOwnerBatchRequest extends AbstractModel{

    /**
    * 要过户的域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 转入账户的uin。
    */
    @SerializedName("NewOwnerUin")
    @Expose
    private String NewOwnerUin;

    /**
    * 是否同时转移对应的 DNS 解析域名，默认false
    */
    @SerializedName("TransferDns")
    @Expose
    private Boolean TransferDns;

    /**
    * 转入账户的appid。
    */
    @SerializedName("NewOwnerAppId")
    @Expose
    private String NewOwnerAppId;

    /**
     * Get 要过户的域名。 
     * @return Domains 要过户的域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 要过户的域名。
     * @param Domains 要过户的域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 转入账户的uin。 
     * @return NewOwnerUin 转入账户的uin。
     */
    public String getNewOwnerUin() {
        return this.NewOwnerUin;
    }

    /**
     * Set 转入账户的uin。
     * @param NewOwnerUin 转入账户的uin。
     */
    public void setNewOwnerUin(String NewOwnerUin) {
        this.NewOwnerUin = NewOwnerUin;
    }

    /**
     * Get 是否同时转移对应的 DNS 解析域名，默认false 
     * @return TransferDns 是否同时转移对应的 DNS 解析域名，默认false
     */
    public Boolean getTransferDns() {
        return this.TransferDns;
    }

    /**
     * Set 是否同时转移对应的 DNS 解析域名，默认false
     * @param TransferDns 是否同时转移对应的 DNS 解析域名，默认false
     */
    public void setTransferDns(Boolean TransferDns) {
        this.TransferDns = TransferDns;
    }

    /**
     * Get 转入账户的appid。 
     * @return NewOwnerAppId 转入账户的appid。
     */
    public String getNewOwnerAppId() {
        return this.NewOwnerAppId;
    }

    /**
     * Set 转入账户的appid。
     * @param NewOwnerAppId 转入账户的appid。
     */
    public void setNewOwnerAppId(String NewOwnerAppId) {
        this.NewOwnerAppId = NewOwnerAppId;
    }

    public ModifyDomainOwnerBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainOwnerBatchRequest(ModifyDomainOwnerBatchRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.NewOwnerUin != null) {
            this.NewOwnerUin = new String(source.NewOwnerUin);
        }
        if (source.TransferDns != null) {
            this.TransferDns = new Boolean(source.TransferDns);
        }
        if (source.NewOwnerAppId != null) {
            this.NewOwnerAppId = new String(source.NewOwnerAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "NewOwnerUin", this.NewOwnerUin);
        this.setParamSimple(map, prefix + "TransferDns", this.TransferDns);
        this.setParamSimple(map, prefix + "NewOwnerAppId", this.NewOwnerAppId);

    }
}

