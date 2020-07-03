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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressesBandwidthRequest extends AbstractModel{

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * EIP唯一标识ID，形如'eip-xxxxxxx'
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * 调整带宽目标值
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get EIP唯一标识ID，形如'eip-xxxxxxx' 
     * @return AddressIds EIP唯一标识ID，形如'eip-xxxxxxx'
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set EIP唯一标识ID，形如'eip-xxxxxxx'
     * @param AddressIds EIP唯一标识ID，形如'eip-xxxxxxx'
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get 调整带宽目标值 
     * @return InternetMaxBandwidthOut 调整带宽目标值
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 调整带宽目标值
     * @param InternetMaxBandwidthOut 调整带宽目标值
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

