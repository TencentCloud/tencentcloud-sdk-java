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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressInternetChargeTypeRequest extends AbstractModel {

    /**
    * 弹性公网IP的唯一ID，形如eip-xxx，可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取AddressId。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * 弹性公网IP调整目标计费模式，支持：
BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费
TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费
BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 弹性公网IP调整目标带宽值，可调整的带宽上限值参考产品文档[带宽上限](https://cloud.tencent.com/document/product/1199/48333)。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是 BANDWIDTH_PREPAID_BY_MONTH（包月按带宽预付费）时，必传该参数。
    */
    @SerializedName("AddressChargePrepaid")
    @Expose
    private AddressChargePrepaid AddressChargePrepaid;

    /**
     * Get 弹性公网IP的唯一ID，形如eip-xxx，可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取AddressId。 
     * @return AddressId 弹性公网IP的唯一ID，形如eip-xxx，可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取AddressId。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set 弹性公网IP的唯一ID，形如eip-xxx，可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取AddressId。
     * @param AddressId 弹性公网IP的唯一ID，形如eip-xxx，可以使用[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取AddressId。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 弹性公网IP调整目标计费模式，支持：
BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费
TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费
BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费 
     * @return InternetChargeType 弹性公网IP调整目标计费模式，支持：
BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费
TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费
BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 弹性公网IP调整目标计费模式，支持：
BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费
TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费
BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费
     * @param InternetChargeType 弹性公网IP调整目标计费模式，支持：
BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费
TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费
BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 弹性公网IP调整目标带宽值，可调整的带宽上限值参考产品文档[带宽上限](https://cloud.tencent.com/document/product/1199/48333)。 
     * @return InternetMaxBandwidthOut 弹性公网IP调整目标带宽值，可调整的带宽上限值参考产品文档[带宽上限](https://cloud.tencent.com/document/product/1199/48333)。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 弹性公网IP调整目标带宽值，可调整的带宽上限值参考产品文档[带宽上限](https://cloud.tencent.com/document/product/1199/48333)。
     * @param InternetMaxBandwidthOut 弹性公网IP调整目标带宽值，可调整的带宽上限值参考产品文档[带宽上限](https://cloud.tencent.com/document/product/1199/48333)。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是 BANDWIDTH_PREPAID_BY_MONTH（包月按带宽预付费）时，必传该参数。 
     * @return AddressChargePrepaid 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是 BANDWIDTH_PREPAID_BY_MONTH（包月按带宽预付费）时，必传该参数。
     */
    public AddressChargePrepaid getAddressChargePrepaid() {
        return this.AddressChargePrepaid;
    }

    /**
     * Set 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是 BANDWIDTH_PREPAID_BY_MONTH（包月按带宽预付费）时，必传该参数。
     * @param AddressChargePrepaid 包月带宽网络计费模式参数。弹性公网IP的调整目标计费模式是 BANDWIDTH_PREPAID_BY_MONTH（包月按带宽预付费）时，必传该参数。
     */
    public void setAddressChargePrepaid(AddressChargePrepaid AddressChargePrepaid) {
        this.AddressChargePrepaid = AddressChargePrepaid;
    }

    public ModifyAddressInternetChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressInternetChargeTypeRequest(ModifyAddressInternetChargeTypeRequest source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.AddressChargePrepaid != null) {
            this.AddressChargePrepaid = new AddressChargePrepaid(source.AddressChargePrepaid);
        }
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

