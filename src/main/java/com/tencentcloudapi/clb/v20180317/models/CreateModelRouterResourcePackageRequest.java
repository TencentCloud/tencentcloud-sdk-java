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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelRouterResourcePackageRequest extends AbstractModel {

    /**
    * <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
    */
    @SerializedName("ModelRouterResourcePackageAmount")
    @Expose
    private Long ModelRouterResourcePackageAmount;

    /**
    * <p>是否自动续订。</p><p>0:不自动续订, 1:用尽到期续订</p>
    */
    @SerializedName("AutoPurchaseFlag")
    @Expose
    private Long AutoPurchaseFlag;

    /**
    * <p>该笔订单是否自动选择代金券</p><p>默认值：false（不自动选择代金券）</p><p>true时会为本笔订单自动匹配满足条件、最优惠的代金券</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
     * Get <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p> 
     * @return ModelRouterResourcePackageAmount <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
     */
    public Long getModelRouterResourcePackageAmount() {
        return this.ModelRouterResourcePackageAmount;
    }

    /**
     * Set <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
     * @param ModelRouterResourcePackageAmount <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
     */
    public void setModelRouterResourcePackageAmount(Long ModelRouterResourcePackageAmount) {
        this.ModelRouterResourcePackageAmount = ModelRouterResourcePackageAmount;
    }

    /**
     * Get <p>是否自动续订。</p><p>0:不自动续订, 1:用尽到期续订</p> 
     * @return AutoPurchaseFlag <p>是否自动续订。</p><p>0:不自动续订, 1:用尽到期续订</p>
     */
    public Long getAutoPurchaseFlag() {
        return this.AutoPurchaseFlag;
    }

    /**
     * Set <p>是否自动续订。</p><p>0:不自动续订, 1:用尽到期续订</p>
     * @param AutoPurchaseFlag <p>是否自动续订。</p><p>0:不自动续订, 1:用尽到期续订</p>
     */
    public void setAutoPurchaseFlag(Long AutoPurchaseFlag) {
        this.AutoPurchaseFlag = AutoPurchaseFlag;
    }

    /**
     * Get <p>该笔订单是否自动选择代金券</p><p>默认值：false（不自动选择代金券）</p><p>true时会为本笔订单自动匹配满足条件、最优惠的代金券</p> 
     * @return AutoVoucher <p>该笔订单是否自动选择代金券</p><p>默认值：false（不自动选择代金券）</p><p>true时会为本笔订单自动匹配满足条件、最优惠的代金券</p>
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>该笔订单是否自动选择代金券</p><p>默认值：false（不自动选择代金券）</p><p>true时会为本笔订单自动匹配满足条件、最优惠的代金券</p>
     * @param AutoVoucher <p>该笔订单是否自动选择代金券</p><p>默认值：false（不自动选择代金券）</p><p>true时会为本笔订单自动匹配满足条件、最优惠的代金券</p>
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public CreateModelRouterResourcePackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelRouterResourcePackageRequest(CreateModelRouterResourcePackageRequest source) {
        if (source.ModelRouterResourcePackageAmount != null) {
            this.ModelRouterResourcePackageAmount = new Long(source.ModelRouterResourcePackageAmount);
        }
        if (source.AutoPurchaseFlag != null) {
            this.AutoPurchaseFlag = new Long(source.AutoPurchaseFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterResourcePackageAmount", this.ModelRouterResourcePackageAmount);
        this.setParamSimple(map, prefix + "AutoPurchaseFlag", this.AutoPurchaseFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

