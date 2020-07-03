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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRedInvoiceRequest extends AbstractModel{

    /**
    * 开票平台ID
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 红冲明细
    */
    @SerializedName("Invoices")
    @Expose
    private CreateRedInvoiceItem [] Invoices;

    /**
    * 接入环境。沙箱环境填 sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 开票平台ID 
     * @return InvoicePlatformId 开票平台ID
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID
     * @param InvoicePlatformId 开票平台ID
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    /**
     * Get 红冲明细 
     * @return Invoices 红冲明细
     */
    public CreateRedInvoiceItem [] getInvoices() {
        return this.Invoices;
    }

    /**
     * Set 红冲明细
     * @param Invoices 红冲明细
     */
    public void setInvoices(CreateRedInvoiceItem [] Invoices) {
        this.Invoices = Invoices;
    }

    /**
     * Get 接入环境。沙箱环境填 sandbox。 
     * @return Profile 接入环境。沙箱环境填 sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填 sandbox。
     * @param Profile 接入环境。沙箱环境填 sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamArrayObj(map, prefix + "Invoices.", this.Invoices);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

