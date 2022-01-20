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
0 : 高灯
1 : 票易通
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
    * 开票渠道。0：线上渠道，1：线下渠道。不填默认为线上渠道
    */
    @SerializedName("InvoiceChannel")
    @Expose
    private Long InvoiceChannel;

    /**
     * Get 开票平台ID
0 : 高灯
1 : 票易通 
     * @return InvoicePlatformId 开票平台ID
0 : 高灯
1 : 票易通
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID
0 : 高灯
1 : 票易通
     * @param InvoicePlatformId 开票平台ID
0 : 高灯
1 : 票易通
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
     * Get 开票渠道。0：线上渠道，1：线下渠道。不填默认为线上渠道 
     * @return InvoiceChannel 开票渠道。0：线上渠道，1：线下渠道。不填默认为线上渠道
     */
    public Long getInvoiceChannel() {
        return this.InvoiceChannel;
    }

    /**
     * Set 开票渠道。0：线上渠道，1：线下渠道。不填默认为线上渠道
     * @param InvoiceChannel 开票渠道。0：线上渠道，1：线下渠道。不填默认为线上渠道
     */
    public void setInvoiceChannel(Long InvoiceChannel) {
        this.InvoiceChannel = InvoiceChannel;
    }

    public CreateRedInvoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRedInvoiceRequest(CreateRedInvoiceRequest source) {
        if (source.InvoicePlatformId != null) {
            this.InvoicePlatformId = new Long(source.InvoicePlatformId);
        }
        if (source.Invoices != null) {
            this.Invoices = new CreateRedInvoiceItem[source.Invoices.length];
            for (int i = 0; i < source.Invoices.length; i++) {
                this.Invoices[i] = new CreateRedInvoiceItem(source.Invoices[i]);
            }
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.InvoiceChannel != null) {
            this.InvoiceChannel = new Long(source.InvoiceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamArrayObj(map, prefix + "Invoices.", this.Invoices);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "InvoiceChannel", this.InvoiceChannel);

    }
}

