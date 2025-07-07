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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDeviceRequest extends AbstractModel {

    /**
    * 设备所属的产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 需要删除的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 删除LoRa设备以及LoRa网关设备需要skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
     * Get 设备所属的产品 ID 
     * @return ProductId 设备所属的产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 设备所属的产品 ID
     * @param ProductId 设备所属的产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 需要删除的设备名称 
     * @return DeviceName 需要删除的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 需要删除的设备名称
     * @param DeviceName 需要删除的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 删除LoRa设备以及LoRa网关设备需要skey 
     * @return Skey 删除LoRa设备以及LoRa网关设备需要skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 删除LoRa设备以及LoRa网关设备需要skey
     * @param Skey 删除LoRa设备以及LoRa网关设备需要skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    public DeleteDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDeviceRequest(DeleteDeviceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Skey", this.Skey);

    }
}

