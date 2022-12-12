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

public class ReturnNormalAddressesRequest extends AbstractModel{

    /**
    * 1
    */
    @SerializedName("AddressIps")
    @Expose
    private String [] AddressIps;

    /**
     * Get 1 
     * @return AddressIps 1
     */
    public String [] getAddressIps() {
        return this.AddressIps;
    }

    /**
     * Set 1
     * @param AddressIps 1
     */
    public void setAddressIps(String [] AddressIps) {
        this.AddressIps = AddressIps;
    }

    public ReturnNormalAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReturnNormalAddressesRequest(ReturnNormalAddressesRequest source) {
        if (source.AddressIps != null) {
            this.AddressIps = new String[source.AddressIps.length];
            for (int i = 0; i < source.AddressIps.length; i++) {
                this.AddressIps[i] = new String(source.AddressIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIps.", this.AddressIps);

    }
}

