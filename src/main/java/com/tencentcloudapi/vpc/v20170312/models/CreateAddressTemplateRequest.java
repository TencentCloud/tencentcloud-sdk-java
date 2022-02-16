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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressTemplateRequest extends AbstractModel{

    /**
    * IP地址模板名称。
    */
    @SerializedName("AddressTemplateName")
    @Expose
    private String AddressTemplateName;

    /**
    * 地址信息，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
    */
    @SerializedName("Addresses")
    @Expose
    private String [] Addresses;

    /**
    * 地址信息，支持携带备注，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
    */
    @SerializedName("AddressesExtra")
    @Expose
    private AddressInfo [] AddressesExtra;

    /**
     * Get IP地址模板名称。 
     * @return AddressTemplateName IP地址模板名称。
     */
    public String getAddressTemplateName() {
        return this.AddressTemplateName;
    }

    /**
     * Set IP地址模板名称。
     * @param AddressTemplateName IP地址模板名称。
     */
    public void setAddressTemplateName(String AddressTemplateName) {
        this.AddressTemplateName = AddressTemplateName;
    }

    /**
     * Get 地址信息，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。 
     * @return Addresses 地址信息，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
     */
    public String [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set 地址信息，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
     * @param Addresses 地址信息，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
     */
    public void setAddresses(String [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Get 地址信息，支持携带备注，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。 
     * @return AddressesExtra 地址信息，支持携带备注，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
     */
    public AddressInfo [] getAddressesExtra() {
        return this.AddressesExtra;
    }

    /**
     * Set 地址信息，支持携带备注，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
     * @param AddressesExtra 地址信息，支持携带备注，支持 IP、CIDR、IP 范围。Addresses与AddressesExtra必填其一。
     */
    public void setAddressesExtra(AddressInfo [] AddressesExtra) {
        this.AddressesExtra = AddressesExtra;
    }

    public CreateAddressTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAddressTemplateRequest(CreateAddressTemplateRequest source) {
        if (source.AddressTemplateName != null) {
            this.AddressTemplateName = new String(source.AddressTemplateName);
        }
        if (source.Addresses != null) {
            this.Addresses = new String[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new String(source.Addresses[i]);
            }
        }
        if (source.AddressesExtra != null) {
            this.AddressesExtra = new AddressInfo[source.AddressesExtra.length];
            for (int i = 0; i < source.AddressesExtra.length; i++) {
                this.AddressesExtra[i] = new AddressInfo(source.AddressesExtra[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateName", this.AddressTemplateName);
        this.setParamArraySimple(map, prefix + "Addresses.", this.Addresses);
        this.setParamArrayObj(map, prefix + "AddressesExtra.", this.AddressesExtra);

    }
}

