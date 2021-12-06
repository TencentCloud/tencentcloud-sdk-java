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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenSingleDeviceSignatureOfPublicRequest extends AbstractModel{

    /**
    * 设备所属的产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 需要绑定的设备
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备绑定签名的有效时间,以秒为单位。取值范围：0 < Expire <= 86400，Expire == -1（十年）
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
     * Get 设备所属的产品ID 
     * @return ProductId 设备所属的产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 设备所属的产品ID
     * @param ProductId 设备所属的产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 需要绑定的设备 
     * @return DeviceName 需要绑定的设备
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 需要绑定的设备
     * @param DeviceName 需要绑定的设备
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备绑定签名的有效时间,以秒为单位。取值范围：0 < Expire <= 86400，Expire == -1（十年） 
     * @return Expire 设备绑定签名的有效时间,以秒为单位。取值范围：0 < Expire <= 86400，Expire == -1（十年）
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 设备绑定签名的有效时间,以秒为单位。取值范围：0 < Expire <= 86400，Expire == -1（十年）
     * @param Expire 设备绑定签名的有效时间,以秒为单位。取值范围：0 < Expire <= 86400，Expire == -1（十年）
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    public GenSingleDeviceSignatureOfPublicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenSingleDeviceSignatureOfPublicRequest(GenSingleDeviceSignatureOfPublicRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
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
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Expire", this.Expire);

    }
}

