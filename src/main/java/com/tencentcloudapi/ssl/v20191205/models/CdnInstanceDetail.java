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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnInstanceDetail extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 已部署证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 域名状态 rejected：域名审核未通过，域名备案过期/被注销导致，processing：部署中，online：已启动，offline：已关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名计费状态，on表示开启，off表示关闭。
    */
    @SerializedName("HttpsBillingSwitch")
    @Expose
    private String HttpsBillingSwitch;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 已部署证书ID 
     * @return CertId 已部署证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 已部署证书ID
     * @param CertId 已部署证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 域名状态 rejected：域名审核未通过，域名备案过期/被注销导致，processing：部署中，online：已启动，offline：已关闭 
     * @return Status 域名状态 rejected：域名审核未通过，域名备案过期/被注销导致，processing：部署中，online：已启动，offline：已关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态 rejected：域名审核未通过，域名备案过期/被注销导致，processing：部署中，online：已启动，offline：已关闭
     * @param Status 域名状态 rejected：域名审核未通过，域名备案过期/被注销导致，processing：部署中，online：已启动，offline：已关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名计费状态，on表示开启，off表示关闭。 
     * @return HttpsBillingSwitch 域名计费状态，on表示开启，off表示关闭。
     */
    public String getHttpsBillingSwitch() {
        return this.HttpsBillingSwitch;
    }

    /**
     * Set 域名计费状态，on表示开启，off表示关闭。
     * @param HttpsBillingSwitch 域名计费状态，on表示开启，off表示关闭。
     */
    public void setHttpsBillingSwitch(String HttpsBillingSwitch) {
        this.HttpsBillingSwitch = HttpsBillingSwitch;
    }

    public CdnInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdnInstanceDetail(CdnInstanceDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.HttpsBillingSwitch != null) {
            this.HttpsBillingSwitch = new String(source.HttpsBillingSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "HttpsBillingSwitch", this.HttpsBillingSwitch);

    }
}

