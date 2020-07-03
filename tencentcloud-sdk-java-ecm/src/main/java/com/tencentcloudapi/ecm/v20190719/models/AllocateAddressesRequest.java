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

public class AllocateAddressesRequest extends AbstractModel{

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * EIP数量。默认值：1。
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * 1 Mbps 至 5000 Mbps，默认值：1 Mbps。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 需要关联的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get EIP数量。默认值：1。 
     * @return AddressCount EIP数量。默认值：1。
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set EIP数量。默认值：1。
     * @param AddressCount EIP数量。默认值：1。
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get CMCC：中国移动
CTCC：中国电信
CUCC：中国联通 
     * @return InternetServiceProvider CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
     * @param InternetServiceProvider CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get 1 Mbps 至 5000 Mbps，默认值：1 Mbps。 
     * @return InternetMaxBandwidthOut 1 Mbps 至 5000 Mbps，默认值：1 Mbps。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 1 Mbps 至 5000 Mbps，默认值：1 Mbps。
     * @param InternetMaxBandwidthOut 1 Mbps 至 5000 Mbps，默认值：1 Mbps。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 需要关联的标签列表。 
     * @return Tags 需要关联的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 需要关联的标签列表。
     * @param Tags 需要关联的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

