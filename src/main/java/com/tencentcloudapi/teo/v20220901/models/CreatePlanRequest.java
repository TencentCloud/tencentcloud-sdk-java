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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePlanRequest extends AbstractModel {

    /**
    * 订阅的套餐类型，取值有：<li> personal：个人版套餐，预付费套餐；</li><li> basic：基础版套餐，预付费套餐；</li><li> standard：标准版套餐，预付费套餐；</li><li> enterprise：企业版套餐，后付费套餐。</li>订阅预付费套餐时，请确保账号内有足够余额，余额不足会产生一个待支付的订单。
计费概述参考 [Edgeone计费概述](https://cloud.tencent.com/document/product/1552/94156)
不同套餐区别参考 [Edgeone计费套餐选型对比](https://cloud.tencent.com/document/product/1552/94165)
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>该参数仅在 PlanType 为 personal, basic, standard 时有效。
不填写使用默认值 false。
    */
    @SerializedName("AutoUseVoucher")
    @Expose
    private String AutoUseVoucher;

    /**
    * 订阅预付费套餐参数，PlanType 为 personal, basic, standard 时，可以选填该参数，用于传入套餐的订阅时长和是否开启自动续费。
不填该参数时，默认开通套餐时长为 1 个月，不开启自动续费。
    */
    @SerializedName("PrepaidPlanParam")
    @Expose
    private PrepaidPlanParam PrepaidPlanParam;

    /**
     * Get 订阅的套餐类型，取值有：<li> personal：个人版套餐，预付费套餐；</li><li> basic：基础版套餐，预付费套餐；</li><li> standard：标准版套餐，预付费套餐；</li><li> enterprise：企业版套餐，后付费套餐。</li>订阅预付费套餐时，请确保账号内有足够余额，余额不足会产生一个待支付的订单。
计费概述参考 [Edgeone计费概述](https://cloud.tencent.com/document/product/1552/94156)
不同套餐区别参考 [Edgeone计费套餐选型对比](https://cloud.tencent.com/document/product/1552/94165) 
     * @return PlanType 订阅的套餐类型，取值有：<li> personal：个人版套餐，预付费套餐；</li><li> basic：基础版套餐，预付费套餐；</li><li> standard：标准版套餐，预付费套餐；</li><li> enterprise：企业版套餐，后付费套餐。</li>订阅预付费套餐时，请确保账号内有足够余额，余额不足会产生一个待支付的订单。
计费概述参考 [Edgeone计费概述](https://cloud.tencent.com/document/product/1552/94156)
不同套餐区别参考 [Edgeone计费套餐选型对比](https://cloud.tencent.com/document/product/1552/94165)
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 订阅的套餐类型，取值有：<li> personal：个人版套餐，预付费套餐；</li><li> basic：基础版套餐，预付费套餐；</li><li> standard：标准版套餐，预付费套餐；</li><li> enterprise：企业版套餐，后付费套餐。</li>订阅预付费套餐时，请确保账号内有足够余额，余额不足会产生一个待支付的订单。
计费概述参考 [Edgeone计费概述](https://cloud.tencent.com/document/product/1552/94156)
不同套餐区别参考 [Edgeone计费套餐选型对比](https://cloud.tencent.com/document/product/1552/94165)
     * @param PlanType 订阅的套餐类型，取值有：<li> personal：个人版套餐，预付费套餐；</li><li> basic：基础版套餐，预付费套餐；</li><li> standard：标准版套餐，预付费套餐；</li><li> enterprise：企业版套餐，后付费套餐。</li>订阅预付费套餐时，请确保账号内有足够余额，余额不足会产生一个待支付的订单。
计费概述参考 [Edgeone计费概述](https://cloud.tencent.com/document/product/1552/94156)
不同套餐区别参考 [Edgeone计费套餐选型对比](https://cloud.tencent.com/document/product/1552/94165)
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>该参数仅在 PlanType 为 personal, basic, standard 时有效。
不填写使用默认值 false。 
     * @return AutoUseVoucher 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>该参数仅在 PlanType 为 personal, basic, standard 时有效。
不填写使用默认值 false。
     */
    public String getAutoUseVoucher() {
        return this.AutoUseVoucher;
    }

    /**
     * Set 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>该参数仅在 PlanType 为 personal, basic, standard 时有效。
不填写使用默认值 false。
     * @param AutoUseVoucher 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>该参数仅在 PlanType 为 personal, basic, standard 时有效。
不填写使用默认值 false。
     */
    public void setAutoUseVoucher(String AutoUseVoucher) {
        this.AutoUseVoucher = AutoUseVoucher;
    }

    /**
     * Get 订阅预付费套餐参数，PlanType 为 personal, basic, standard 时，可以选填该参数，用于传入套餐的订阅时长和是否开启自动续费。
不填该参数时，默认开通套餐时长为 1 个月，不开启自动续费。 
     * @return PrepaidPlanParam 订阅预付费套餐参数，PlanType 为 personal, basic, standard 时，可以选填该参数，用于传入套餐的订阅时长和是否开启自动续费。
不填该参数时，默认开通套餐时长为 1 个月，不开启自动续费。
     */
    public PrepaidPlanParam getPrepaidPlanParam() {
        return this.PrepaidPlanParam;
    }

    /**
     * Set 订阅预付费套餐参数，PlanType 为 personal, basic, standard 时，可以选填该参数，用于传入套餐的订阅时长和是否开启自动续费。
不填该参数时，默认开通套餐时长为 1 个月，不开启自动续费。
     * @param PrepaidPlanParam 订阅预付费套餐参数，PlanType 为 personal, basic, standard 时，可以选填该参数，用于传入套餐的订阅时长和是否开启自动续费。
不填该参数时，默认开通套餐时长为 1 个月，不开启自动续费。
     */
    public void setPrepaidPlanParam(PrepaidPlanParam PrepaidPlanParam) {
        this.PrepaidPlanParam = PrepaidPlanParam;
    }

    public CreatePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePlanRequest(CreatePlanRequest source) {
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.AutoUseVoucher != null) {
            this.AutoUseVoucher = new String(source.AutoUseVoucher);
        }
        if (source.PrepaidPlanParam != null) {
            this.PrepaidPlanParam = new PrepaidPlanParam(source.PrepaidPlanParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "AutoUseVoucher", this.AutoUseVoucher);
        this.setParamObj(map, prefix + "PrepaidPlanParam.", this.PrepaidPlanParam);

    }
}

