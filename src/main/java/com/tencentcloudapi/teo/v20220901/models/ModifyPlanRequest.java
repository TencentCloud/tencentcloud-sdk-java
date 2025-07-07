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

public class ModifyPlanRequest extends AbstractModel {

    /**
    * 套餐 ID，形如 edgeone-2unuvzjmmn2q。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 预付费套餐自动续费配置。若开启了自动续费，则会在套餐到期前一天自动续费，仅支持个人版，基础版，标准版套餐。不填写表示保持原有配置。
    */
    @SerializedName("RenewFlag")
    @Expose
    private RenewFlag RenewFlag;

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
     * Get 预付费套餐自动续费配置。若开启了自动续费，则会在套餐到期前一天自动续费，仅支持个人版，基础版，标准版套餐。不填写表示保持原有配置。 
     * @return RenewFlag 预付费套餐自动续费配置。若开启了自动续费，则会在套餐到期前一天自动续费，仅支持个人版，基础版，标准版套餐。不填写表示保持原有配置。
     */
    public RenewFlag getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 预付费套餐自动续费配置。若开启了自动续费，则会在套餐到期前一天自动续费，仅支持个人版，基础版，标准版套餐。不填写表示保持原有配置。
     * @param RenewFlag 预付费套餐自动续费配置。若开启了自动续费，则会在套餐到期前一天自动续费，仅支持个人版，基础版，标准版套餐。不填写表示保持原有配置。
     */
    public void setRenewFlag(RenewFlag RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public ModifyPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPlanRequest(ModifyPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new RenewFlag(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamObj(map, prefix + "RenewFlag.", this.RenewFlag);

    }
}

