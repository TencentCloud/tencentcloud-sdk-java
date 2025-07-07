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

public class LBChargePrepaid extends AbstractModel {

    /**
    * 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 购买时长，单位：月
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费 
     * @return RenewFlag 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
     * @param RenewFlag 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 购买时长，单位：月 
     * @return Period 购买时长，单位：月
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位：月
     * @param Period 购买时长，单位：月
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public LBChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LBChargePrepaid(LBChargePrepaid source) {
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

