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

public class AddressTemplateSpecification extends AbstractModel{

    /**
    * IP地址ID，例如：ipm-2uw6ujo6。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * IP地址组ID，例如：ipmg-2uw6ujo6。
    */
    @SerializedName("AddressGroupId")
    @Expose
    private String AddressGroupId;

    /**
     * Get IP地址ID，例如：ipm-2uw6ujo6。 
     * @return AddressId IP地址ID，例如：ipm-2uw6ujo6。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set IP地址ID，例如：ipm-2uw6ujo6。
     * @param AddressId IP地址ID，例如：ipm-2uw6ujo6。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get IP地址组ID，例如：ipmg-2uw6ujo6。 
     * @return AddressGroupId IP地址组ID，例如：ipmg-2uw6ujo6。
     */
    public String getAddressGroupId() {
        return this.AddressGroupId;
    }

    /**
     * Set IP地址组ID，例如：ipmg-2uw6ujo6。
     * @param AddressGroupId IP地址组ID，例如：ipmg-2uw6ujo6。
     */
    public void setAddressGroupId(String AddressGroupId) {
        this.AddressGroupId = AddressGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressGroupId", this.AddressGroupId);

    }
}

