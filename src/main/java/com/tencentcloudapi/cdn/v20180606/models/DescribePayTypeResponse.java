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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePayTypeResponse extends AbstractModel {

    /**
    * 计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 计费周期
day：日结计费
month：月结计费
hour：小时结计费
    */
    @SerializedName("BillingCycle")
    @Expose
    private String BillingCycle;

    /**
    * 统计类型
monthMax：日峰值月平均，月结模式
day95：日 95 带宽，月结模式
month95：月95带宽，月结模式
sum：总流量/总请求数，日结或月结模式
max：峰值带宽，日结模式
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * 计费区域
all：全地区统一计费
multiple：分地区计费
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * 当前生效计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
    */
    @SerializedName("CurrentPayType")
    @Expose
    private String CurrentPayType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。 
     * @return PayType 计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
     * @param PayType 计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
日结计费方式切换时，若当日产生消耗，则此字段表示第二天即将生效的计费方式，若未产生消耗，则表示已经生效的计费方式。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 计费周期
day：日结计费
month：月结计费
hour：小时结计费 
     * @return BillingCycle 计费周期
day：日结计费
month：月结计费
hour：小时结计费
     */
    public String getBillingCycle() {
        return this.BillingCycle;
    }

    /**
     * Set 计费周期
day：日结计费
month：月结计费
hour：小时结计费
     * @param BillingCycle 计费周期
day：日结计费
month：月结计费
hour：小时结计费
     */
    public void setBillingCycle(String BillingCycle) {
        this.BillingCycle = BillingCycle;
    }

    /**
     * Get 统计类型
monthMax：日峰值月平均，月结模式
day95：日 95 带宽，月结模式
month95：月95带宽，月结模式
sum：总流量/总请求数，日结或月结模式
max：峰值带宽，日结模式 
     * @return StatType 统计类型
monthMax：日峰值月平均，月结模式
day95：日 95 带宽，月结模式
month95：月95带宽，月结模式
sum：总流量/总请求数，日结或月结模式
max：峰值带宽，日结模式
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set 统计类型
monthMax：日峰值月平均，月结模式
day95：日 95 带宽，月结模式
month95：月95带宽，月结模式
sum：总流量/总请求数，日结或月结模式
max：峰值带宽，日结模式
     * @param StatType 统计类型
monthMax：日峰值月平均，月结模式
day95：日 95 带宽，月结模式
month95：月95带宽，月结模式
sum：总流量/总请求数，日结或月结模式
max：峰值带宽，日结模式
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get 计费区域
all：全地区统一计费
multiple：分地区计费 
     * @return RegionType 计费区域
all：全地区统一计费
multiple：分地区计费
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set 计费区域
all：全地区统一计费
multiple：分地区计费
     * @param RegionType 计费区域
all：全地区统一计费
multiple：分地区计费
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get 当前生效计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费 
     * @return CurrentPayType 当前生效计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
     */
    public String getCurrentPayType() {
        return this.CurrentPayType;
    }

    /**
     * Set 当前生效计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
     * @param CurrentPayType 当前生效计费类型
flux：流量计费
bandwidth：带宽计费
request：请求数计费
flux_sep：动静分离流量计费
bandwidth_sep：动静分离带宽计费
     */
    public void setCurrentPayType(String CurrentPayType) {
        this.CurrentPayType = CurrentPayType;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePayTypeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePayTypeResponse(DescribePayTypeResponse source) {
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.BillingCycle != null) {
            this.BillingCycle = new String(source.BillingCycle);
        }
        if (source.StatType != null) {
            this.StatType = new String(source.StatType);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.CurrentPayType != null) {
            this.CurrentPayType = new String(source.CurrentPayType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

