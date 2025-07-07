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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradePlanRequest extends AbstractModel {

    /**
    * 套餐 ID，形如 edgeone-2unuvzjmmn2q。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 需要升级到的目标套餐版本，取值有：<li> basic：基础版套餐；</li><li> standard：标准版套餐。</li>
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
    */
    @SerializedName("AutoUseVoucher")
    @Expose
    private String AutoUseVoucher;

    /**
     * Get 套餐 ID，形如 edgeone-2unuvzjmmn2q。 
     * @return PlanId 套餐 ID，形如 edgeone-2unuvzjmmn2q。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 套餐 ID，形如 edgeone-2unuvzjmmn2q。
     * @param PlanId 套餐 ID，形如 edgeone-2unuvzjmmn2q。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 需要升级到的目标套餐版本，取值有：<li> basic：基础版套餐；</li><li> standard：标准版套餐。</li> 
     * @return PlanType 需要升级到的目标套餐版本，取值有：<li> basic：基础版套餐；</li><li> standard：标准版套餐。</li>
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 需要升级到的目标套餐版本，取值有：<li> basic：基础版套餐；</li><li> standard：标准版套餐。</li>
     * @param PlanType 需要升级到的目标套餐版本，取值有：<li> basic：基础版套餐；</li><li> standard：标准版套餐。</li>
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。 
     * @return AutoUseVoucher 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
     */
    public String getAutoUseVoucher() {
        return this.AutoUseVoucher;
    }

    /**
     * Set 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
     * @param AutoUseVoucher 是否自动使用代金券，取值有：<li> true：是；</li><li> false：否。</li>不填写使用默认值 false。
     */
    public void setAutoUseVoucher(String AutoUseVoucher) {
        this.AutoUseVoucher = AutoUseVoucher;
    }

    public UpgradePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradePlanRequest(UpgradePlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.AutoUseVoucher != null) {
            this.AutoUseVoucher = new String(source.AutoUseVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "AutoUseVoucher", this.AutoUseVoucher);

    }
}

