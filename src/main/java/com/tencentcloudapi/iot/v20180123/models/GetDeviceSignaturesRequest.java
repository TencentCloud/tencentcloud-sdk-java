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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeviceSignaturesRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称列表（单次限制1000个设备）
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * 过期时间
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称列表（单次限制1000个设备） 
     * @return DeviceNames 设备名称列表（单次限制1000个设备）
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set 设备名称列表（单次限制1000个设备）
     * @param DeviceNames 设备名称列表（单次限制1000个设备）
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get 过期时间 
     * @return Expire 过期时间
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 过期时间
     * @param Expire 过期时间
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    public GetDeviceSignaturesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeviceSignaturesRequest(GetDeviceSignaturesRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "Expire", this.Expire);

    }
}

