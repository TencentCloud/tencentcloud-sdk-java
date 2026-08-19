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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Billing extends AbstractModel {

    /**
    * <p>账单地址</p>
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * <p>账单联系电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>账单邮箱</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>账单接收人姓名</p>
    */
    @SerializedName("Recipient")
    @Expose
    private String Recipient;

    /**
     * Get <p>账单地址</p> 
     * @return Address <p>账单地址</p>
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set <p>账单地址</p>
     * @param Address <p>账单地址</p>
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get <p>账单联系电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p> 
     * @return Phone <p>账单联系电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>账单联系电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     * @param Phone <p>账单联系电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>账单邮箱</p> 
     * @return Email <p>账单邮箱</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>账单邮箱</p>
     * @param Email <p>账单邮箱</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>账单接收人姓名</p> 
     * @return Recipient <p>账单接收人姓名</p>
     */
    public String getRecipient() {
        return this.Recipient;
    }

    /**
     * Set <p>账单接收人姓名</p>
     * @param Recipient <p>账单接收人姓名</p>
     */
    public void setRecipient(String Recipient) {
        this.Recipient = Recipient;
    }

    public Billing() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Billing(Billing source) {
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Recipient != null) {
            this.Recipient = new String(source.Recipient);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Recipient", this.Recipient);

    }
}

