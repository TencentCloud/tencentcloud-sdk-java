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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HPCInternetInfo extends AbstractModel {

    /**
    * <p>网络出口带宽，单位Mbps</p>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * <p>网络收费类型</p><p>枚举值：</p><ul><li>BANDWIDTH_PREPAID： 预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR： 流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR： 带宽按小时后付费</li></ul>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
     * Get <p>网络出口带宽，单位Mbps</p> 
     * @return InternetMaxBandwidthOut <p>网络出口带宽，单位Mbps</p>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set <p>网络出口带宽，单位Mbps</p>
     * @param InternetMaxBandwidthOut <p>网络出口带宽，单位Mbps</p>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get <p>网络收费类型</p><p>枚举值：</p><ul><li>BANDWIDTH_PREPAID： 预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR： 流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR： 带宽按小时后付费</li></ul> 
     * @return InternetChargeType <p>网络收费类型</p><p>枚举值：</p><ul><li>BANDWIDTH_PREPAID： 预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR： 流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR： 带宽按小时后付费</li></ul>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set <p>网络收费类型</p><p>枚举值：</p><ul><li>BANDWIDTH_PREPAID： 预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR： 流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR： 带宽按小时后付费</li></ul>
     * @param InternetChargeType <p>网络收费类型</p><p>枚举值：</p><ul><li>BANDWIDTH_PREPAID： 预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR： 流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR： 带宽按小时后付费</li></ul>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    public HPCInternetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HPCInternetInfo(HPCInternetInfo source) {
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);

    }
}

