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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePayTypeResponse extends AbstractModel{

    /**
    * 计费类型：
flux：流量计费
bandwidth：带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 计费周期：
day：日结计费
month：月结计费
    */
    @SerializedName("BillingCycle")
    @Expose
    private String BillingCycle;

    /**
    * 计费方式：
monthMax：日峰值月平均计费，月结模式
day95：日 95 带宽计费，月结模式
month95：月95带宽计费，月结模式
sum：总流量计费，日结与月结均有流量计费模式
max：峰值带宽计费，日结模式
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * 境外计费类型：
all：全地区统一计费
multiple：分地区计费
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * 当前生效计费类型：
flux：流量计费
bandwidth：带宽计费
    */
    @SerializedName("CurrentPayType")
    @Expose
    private String CurrentPayType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 计费类型：
flux：流量计费
bandwidth：带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。 
     * @return PayType 计费类型：
flux：流量计费
bandwidth：带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 计费类型：
flux：流量计费
bandwidth：带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
     * @param PayType 计费类型：
flux：流量计费
bandwidth：带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 计费周期：
day：日结计费
month：月结计费 
     * @return BillingCycle 计费周期：
day：日结计费
month：月结计费
     */
    public String getBillingCycle() {
        return this.BillingCycle;
    }

    /**
     * Set 计费周期：
day：日结计费
month：月结计费
     * @param BillingCycle 计费周期：
day：日结计费
month：月结计费
     */
    public void setBillingCycle(String BillingCycle) {
        this.BillingCycle = BillingCycle;
    }

    /**
     * Get 计费方式：
monthMax：日峰值月平均计费，月结模式
day95：日 95 带宽计费，月结模式
month95：月95带宽计费，月结模式
sum：总流量计费，日结与月结均有流量计费模式
max：峰值带宽计费，日结模式 
     * @return StatType 计费方式：
monthMax：日峰值月平均计费，月结模式
day95：日 95 带宽计费，月结模式
month95：月95带宽计费，月结模式
sum：总流量计费，日结与月结均有流量计费模式
max：峰值带宽计费，日结模式
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set 计费方式：
monthMax：日峰值月平均计费，月结模式
day95：日 95 带宽计费，月结模式
month95：月95带宽计费，月结模式
sum：总流量计费，日结与月结均有流量计费模式
max：峰值带宽计费，日结模式
     * @param StatType 计费方式：
monthMax：日峰值月平均计费，月结模式
day95：日 95 带宽计费，月结模式
month95：月95带宽计费，月结模式
sum：总流量计费，日结与月结均有流量计费模式
max：峰值带宽计费，日结模式
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get 境外计费类型：
all：全地区统一计费
multiple：分地区计费 
     * @return RegionType 境外计费类型：
all：全地区统一计费
multiple：分地区计费
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set 境外计费类型：
all：全地区统一计费
multiple：分地区计费
     * @param RegionType 境外计费类型：
all：全地区统一计费
multiple：分地区计费
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get 当前生效计费类型：
flux：流量计费
bandwidth：带宽计费 
     * @return CurrentPayType 当前生效计费类型：
flux：流量计费
bandwidth：带宽计费
     */
    public String getCurrentPayType() {
        return this.CurrentPayType;
    }

    /**
     * Set 当前生效计费类型：
flux：流量计费
bandwidth：带宽计费
     * @param CurrentPayType 当前生效计费类型：
flux：流量计费
bandwidth：带宽计费
     */
    public void setCurrentPayType(String CurrentPayType) {
        this.CurrentPayType = CurrentPayType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "BillingCycle", this.BillingCycle);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "CurrentPayType", this.CurrentPayType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

