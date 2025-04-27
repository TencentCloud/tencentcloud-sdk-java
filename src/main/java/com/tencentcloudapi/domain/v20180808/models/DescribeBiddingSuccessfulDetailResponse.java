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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBiddingSuccessfulDetailResponse extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 得标时间
    */
    @SerializedName("SuccessfulTime")
    @Expose
    private String SuccessfulTime;

    /**
    * 得标价格 单位元
    */
    @SerializedName("SuccessfulPrice")
    @Expose
    private Float SuccessfulPrice;

    /**
    *  注册时间
    */
    @SerializedName("RegTime")
    @Expose
    private String RegTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 删除时间
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * 付款结束时间
    */
    @SerializedName("PayEndTime")
    @Expose
    private String PayEndTime;

    /**
    * 保证金，是否退款，yes表示退款，no表示不退款
    */
    @SerializedName("BiddingBondRefund")
    @Expose
    private String BiddingBondRefund;

    /**
    * 保证金 单位元
    */
    @SerializedName("BiddingBondPrice")
    @Expose
    private Float BiddingBondPrice;

    /**
    * 状态：5 等待支付 6 等待转移， 7 转移中，8 交易成功，11 尾款阶段持有者索回，12 已违约
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 得标时间 
     * @return SuccessfulTime 得标时间
     */
    public String getSuccessfulTime() {
        return this.SuccessfulTime;
    }

    /**
     * Set 得标时间
     * @param SuccessfulTime 得标时间
     */
    public void setSuccessfulTime(String SuccessfulTime) {
        this.SuccessfulTime = SuccessfulTime;
    }

    /**
     * Get 得标价格 单位元 
     * @return SuccessfulPrice 得标价格 单位元
     */
    public Float getSuccessfulPrice() {
        return this.SuccessfulPrice;
    }

    /**
     * Set 得标价格 单位元
     * @param SuccessfulPrice 得标价格 单位元
     */
    public void setSuccessfulPrice(Float SuccessfulPrice) {
        this.SuccessfulPrice = SuccessfulPrice;
    }

    /**
     * Get  注册时间 
     * @return RegTime  注册时间
     */
    public String getRegTime() {
        return this.RegTime;
    }

    /**
     * Set  注册时间
     * @param RegTime  注册时间
     */
    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 删除时间 
     * @return DeleteTime 删除时间
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 删除时间
     * @param DeleteTime 删除时间
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 付款结束时间 
     * @return PayEndTime 付款结束时间
     */
    public String getPayEndTime() {
        return this.PayEndTime;
    }

    /**
     * Set 付款结束时间
     * @param PayEndTime 付款结束时间
     */
    public void setPayEndTime(String PayEndTime) {
        this.PayEndTime = PayEndTime;
    }

    /**
     * Get 保证金，是否退款，yes表示退款，no表示不退款 
     * @return BiddingBondRefund 保证金，是否退款，yes表示退款，no表示不退款
     */
    public String getBiddingBondRefund() {
        return this.BiddingBondRefund;
    }

    /**
     * Set 保证金，是否退款，yes表示退款，no表示不退款
     * @param BiddingBondRefund 保证金，是否退款，yes表示退款，no表示不退款
     */
    public void setBiddingBondRefund(String BiddingBondRefund) {
        this.BiddingBondRefund = BiddingBondRefund;
    }

    /**
     * Get 保证金 单位元 
     * @return BiddingBondPrice 保证金 单位元
     */
    public Float getBiddingBondPrice() {
        return this.BiddingBondPrice;
    }

    /**
     * Set 保证金 单位元
     * @param BiddingBondPrice 保证金 单位元
     */
    public void setBiddingBondPrice(Float BiddingBondPrice) {
        this.BiddingBondPrice = BiddingBondPrice;
    }

    /**
     * Get 状态：5 等待支付 6 等待转移， 7 转移中，8 交易成功，11 尾款阶段持有者索回，12 已违约 
     * @return Status 状态：5 等待支付 6 等待转移， 7 转移中，8 交易成功，11 尾款阶段持有者索回，12 已违约
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：5 等待支付 6 等待转移， 7 转移中，8 交易成功，11 尾款阶段持有者索回，12 已违约
     * @param Status 状态：5 等待支付 6 等待转移， 7 转移中，8 交易成功，11 尾款阶段持有者索回，12 已违约
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeBiddingSuccessfulDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBiddingSuccessfulDetailResponse(DescribeBiddingSuccessfulDetailResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SuccessfulTime != null) {
            this.SuccessfulTime = new String(source.SuccessfulTime);
        }
        if (source.SuccessfulPrice != null) {
            this.SuccessfulPrice = new Float(source.SuccessfulPrice);
        }
        if (source.RegTime != null) {
            this.RegTime = new String(source.RegTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.PayEndTime != null) {
            this.PayEndTime = new String(source.PayEndTime);
        }
        if (source.BiddingBondRefund != null) {
            this.BiddingBondRefund = new String(source.BiddingBondRefund);
        }
        if (source.BiddingBondPrice != null) {
            this.BiddingBondPrice = new Float(source.BiddingBondPrice);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "SuccessfulTime", this.SuccessfulTime);
        this.setParamSimple(map, prefix + "SuccessfulPrice", this.SuccessfulPrice);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "PayEndTime", this.PayEndTime);
        this.setParamSimple(map, prefix + "BiddingBondRefund", this.BiddingBondRefund);
        this.setParamSimple(map, prefix + "BiddingBondPrice", this.BiddingBondPrice);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

