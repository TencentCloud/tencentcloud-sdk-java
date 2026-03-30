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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainOwnerRequest extends AbstractModel {

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 新用户UIN
    */
    @SerializedName("NewOwnerUin")
    @Expose
    private String NewOwnerUin;

    /**
    * 新用户APPID
    */
    @SerializedName("NewOwnerAppId")
    @Expose
    private String NewOwnerAppId;

    /**
    * 是否同时转移对应的 DNS 解析域名，默认false
    */
    @SerializedName("TransferDns")
    @Expose
    private Boolean TransferDns;

    /**
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 新用户UIN 
     * @return NewOwnerUin 新用户UIN
     */
    public String getNewOwnerUin() {
        return this.NewOwnerUin;
    }

    /**
     * Set 新用户UIN
     * @param NewOwnerUin 新用户UIN
     */
    public void setNewOwnerUin(String NewOwnerUin) {
        this.NewOwnerUin = NewOwnerUin;
    }

    /**
     * Get 新用户APPID 
     * @return NewOwnerAppId 新用户APPID
     */
    public String getNewOwnerAppId() {
        return this.NewOwnerAppId;
    }

    /**
     * Set 新用户APPID
     * @param NewOwnerAppId 新用户APPID
     */
    public void setNewOwnerAppId(String NewOwnerAppId) {
        this.NewOwnerAppId = NewOwnerAppId;
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

    public ModifyDomainOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainOwnerRequest(ModifyDomainOwnerRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.NewOwnerUin != null) {
            this.NewOwnerUin = new String(source.NewOwnerUin);
        }
        if (source.NewOwnerAppId != null) {
            this.NewOwnerAppId = new String(source.NewOwnerAppId);
        }
        if (source.TransferDns != null) {
            this.TransferDns = new Boolean(source.TransferDns);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "NewOwnerUin", this.NewOwnerUin);
        this.setParamSimple(map, prefix + "NewOwnerAppId", this.NewOwnerAppId);
        this.setParamSimple(map, prefix + "TransferDns", this.TransferDns);

    }
}

