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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDevicePSKRequest extends AbstractModel{

    /**
    * 产品名
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备的psk
    */
    @SerializedName("Psk")
    @Expose
    private String Psk;

    /**
     * Get 产品名 
     * @return ProductId 产品名
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品名
     * @param ProductId 产品名
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备的psk 
     * @return Psk 设备的psk
     */
    public String getPsk() {
        return this.Psk;
    }

    /**
     * Set 设备的psk
     * @param Psk 设备的psk
     */
    public void setPsk(String Psk) {
        this.Psk = Psk;
    }

    public UpdateDevicePSKRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDevicePSKRequest(UpdateDevicePSKRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Psk != null) {
            this.Psk = new String(source.Psk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Psk", this.Psk);

    }
}

