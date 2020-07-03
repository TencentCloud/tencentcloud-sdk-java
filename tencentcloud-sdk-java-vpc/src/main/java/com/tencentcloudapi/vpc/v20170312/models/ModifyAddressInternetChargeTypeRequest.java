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

public class ModifyAddressInternetChargeTypeRequest extends AbstractModel{

    /**
    * 弹性公网IP的唯一ID，形如eip-xxx
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * 弹性公网IP调整目标计费模式，只支持"BANDWIDTH_PREPAID_BY_MONTH"和"TRAFFIC_POSTPAID_BY_HOUR"
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 弹性公网IP调整目标带宽值
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是"BANDWIDTH_PREPAID_BY_MONTH"时，必传该参数。
    */
    @SerializedName("AddressChargePrepaid")
    @Expose
    private AddressChargePrepaid AddressChargePrepaid;

    /**
     * Get 弹性公网IP的唯一ID，形如eip-xxx 
     * @return AddressId 弹性公网IP的唯一ID，形如eip-xxx
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set 弹性公网IP的唯一ID，形如eip-xxx
     * @param AddressId 弹性公网IP的唯一ID，形如eip-xxx
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 弹性公网IP调整目标计费模式，只支持"BANDWIDTH_PREPAID_BY_MONTH"和"TRAFFIC_POSTPAID_BY_HOUR" 
     * @return InternetChargeType 弹性公网IP调整目标计费模式，只支持"BANDWIDTH_PREPAID_BY_MONTH"和"TRAFFIC_POSTPAID_BY_HOUR"
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 弹性公网IP调整目标计费模式，只支持"BANDWIDTH_PREPAID_BY_MONTH"和"TRAFFIC_POSTPAID_BY_HOUR"
     * @param InternetChargeType 弹性公网IP调整目标计费模式，只支持"BANDWIDTH_PREPAID_BY_MONTH"和"TRAFFIC_POSTPAID_BY_HOUR"
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 弹性公网IP调整目标带宽值 
     * @return InternetMaxBandwidthOut 弹性公网IP调整目标带宽值
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 弹性公网IP调整目标带宽值
     * @param InternetMaxBandwidthOut 弹性公网IP调整目标带宽值
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是"BANDWIDTH_PREPAID_BY_MONTH"时，必传该参数。 
     * @return AddressChargePrepaid 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是"BANDWIDTH_PREPAID_BY_MONTH"时，必传该参数。
     */
    public AddressChargePrepaid getAddressChargePrepaid() {
        return this.AddressChargePrepaid;
    }

    /**
     * Set 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是"BANDWIDTH_PREPAID_BY_MONTH"时，必传该参数。
     * @param AddressChargePrepaid 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是"BANDWIDTH_PREPAID_BY_MONTH"时，必传该参数。
     */
    public void setAddressChargePrepaid(AddressChargePrepaid AddressChargePrepaid) {
        this.AddressChargePrepaid = AddressChargePrepaid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamObj(map, prefix + "AddressChargePrepaid.", this.AddressChargePrepaid);

    }
}

