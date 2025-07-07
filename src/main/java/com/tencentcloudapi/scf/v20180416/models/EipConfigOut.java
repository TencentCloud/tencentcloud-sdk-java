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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipConfigOut extends AbstractModel {

    /**
    * 是否是固定IP，["ENABLE","DISABLE"]
    */
    @SerializedName("EipStatus")
    @Expose
    private String EipStatus;

    /**
    * IP列表
    */
    @SerializedName("EipAddress")
    @Expose
    private String [] EipAddress;

    /**
     * Get 是否是固定IP，["ENABLE","DISABLE"] 
     * @return EipStatus 是否是固定IP，["ENABLE","DISABLE"]
     */
    public String getEipStatus() {
        return this.EipStatus;
    }

    /**
     * Set 是否是固定IP，["ENABLE","DISABLE"]
     * @param EipStatus 是否是固定IP，["ENABLE","DISABLE"]
     */
    public void setEipStatus(String EipStatus) {
        this.EipStatus = EipStatus;
    }

    /**
     * Get IP列表 
     * @return EipAddress IP列表
     */
    public String [] getEipAddress() {
        return this.EipAddress;
    }

    /**
     * Set IP列表
     * @param EipAddress IP列表
     */
    public void setEipAddress(String [] EipAddress) {
        this.EipAddress = EipAddress;
    }

    public EipConfigOut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipConfigOut(EipConfigOut source) {
        if (source.EipStatus != null) {
            this.EipStatus = new String(source.EipStatus);
        }
        if (source.EipAddress != null) {
            this.EipAddress = new String[source.EipAddress.length];
            for (int i = 0; i < source.EipAddress.length; i++) {
                this.EipAddress[i] = new String(source.EipAddress[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipStatus", this.EipStatus);
        this.setParamArraySimple(map, prefix + "EipAddress.", this.EipAddress);

    }
}

