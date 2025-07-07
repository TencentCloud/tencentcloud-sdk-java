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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BidDetailPageResponse extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 当前域名价格 单位元
    */
    @SerializedName("CurrentPrice")
    @Expose
    private Float CurrentPrice;

    /**
    * 用户上次出价 单位元
    */
    @SerializedName("BidPrice")
    @Expose
    private Float BidPrice;

    /**
    * 当前加价幅度 单位元
    */
    @SerializedName("CurrentPriceScope")
    @Expose
    private Float CurrentPriceScope;

    /**
    * 加价幅度区间配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceScope")
    @Expose
    private PriceScopeConf [] PriceScope;

    /**
    * 用户当前已经支付了的保证金 单位元
    */
    @SerializedName("DepositPrice")
    @Expose
    private Float DepositPrice;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 当前域名价格 单位元 
     * @return CurrentPrice 当前域名价格 单位元
     */
    public Float getCurrentPrice() {
        return this.CurrentPrice;
    }

    /**
     * Set 当前域名价格 单位元
     * @param CurrentPrice 当前域名价格 单位元
     */
    public void setCurrentPrice(Float CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }

    /**
     * Get 用户上次出价 单位元 
     * @return BidPrice 用户上次出价 单位元
     */
    public Float getBidPrice() {
        return this.BidPrice;
    }

    /**
     * Set 用户上次出价 单位元
     * @param BidPrice 用户上次出价 单位元
     */
    public void setBidPrice(Float BidPrice) {
        this.BidPrice = BidPrice;
    }

    /**
     * Get 当前加价幅度 单位元 
     * @return CurrentPriceScope 当前加价幅度 单位元
     */
    public Float getCurrentPriceScope() {
        return this.CurrentPriceScope;
    }

    /**
     * Set 当前加价幅度 单位元
     * @param CurrentPriceScope 当前加价幅度 单位元
     */
    public void setCurrentPriceScope(Float CurrentPriceScope) {
        this.CurrentPriceScope = CurrentPriceScope;
    }

    /**
     * Get 加价幅度区间配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceScope 加价幅度区间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PriceScopeConf [] getPriceScope() {
        return this.PriceScope;
    }

    /**
     * Set 加价幅度区间配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceScope 加价幅度区间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceScope(PriceScopeConf [] PriceScope) {
        this.PriceScope = PriceScope;
    }

    /**
     * Get 用户当前已经支付了的保证金 单位元 
     * @return DepositPrice 用户当前已经支付了的保证金 单位元
     */
    public Float getDepositPrice() {
        return this.DepositPrice;
    }

    /**
     * Set 用户当前已经支付了的保证金 单位元
     * @param DepositPrice 用户当前已经支付了的保证金 单位元
     */
    public void setDepositPrice(Float DepositPrice) {
        this.DepositPrice = DepositPrice;
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

    public BidDetailPageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BidDetailPageResponse(BidDetailPageResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CurrentPrice != null) {
            this.CurrentPrice = new Float(source.CurrentPrice);
        }
        if (source.BidPrice != null) {
            this.BidPrice = new Float(source.BidPrice);
        }
        if (source.CurrentPriceScope != null) {
            this.CurrentPriceScope = new Float(source.CurrentPriceScope);
        }
        if (source.PriceScope != null) {
            this.PriceScope = new PriceScopeConf[source.PriceScope.length];
            for (int i = 0; i < source.PriceScope.length; i++) {
                this.PriceScope[i] = new PriceScopeConf(source.PriceScope[i]);
            }
        }
        if (source.DepositPrice != null) {
            this.DepositPrice = new Float(source.DepositPrice);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CurrentPrice", this.CurrentPrice);
        this.setParamSimple(map, prefix + "BidPrice", this.BidPrice);
        this.setParamSimple(map, prefix + "CurrentPriceScope", this.CurrentPriceScope);
        this.setParamArrayObj(map, prefix + "PriceScope.", this.PriceScope);
        this.setParamSimple(map, prefix + "DepositPrice", this.DepositPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

