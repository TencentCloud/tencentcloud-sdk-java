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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargeParam extends AbstractModel{

    /**
    * 实例付费类型: PREPAID(包年包月), POSTPAID_BY_HOUR(按量付费)
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 购买时长: 包年包月时需要填写, 按量计费无需填写
    */
    @SerializedName("InstanceChargePeriod")
    @Expose
    private Long InstanceChargePeriod;

    /**
     * Get 实例付费类型: PREPAID(包年包月), POSTPAID_BY_HOUR(按量付费) 
     * @return InstanceChargeType 实例付费类型: PREPAID(包年包月), POSTPAID_BY_HOUR(按量付费)
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例付费类型: PREPAID(包年包月), POSTPAID_BY_HOUR(按量付费)
     * @param InstanceChargeType 实例付费类型: PREPAID(包年包月), POSTPAID_BY_HOUR(按量付费)
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 购买时长: 包年包月时需要填写, 按量计费无需填写 
     * @return InstanceChargePeriod 购买时长: 包年包月时需要填写, 按量计费无需填写
     */
    public Long getInstanceChargePeriod() {
        return this.InstanceChargePeriod;
    }

    /**
     * Set 购买时长: 包年包月时需要填写, 按量计费无需填写
     * @param InstanceChargePeriod 购买时长: 包年包月时需要填写, 按量计费无需填写
     */
    public void setInstanceChargePeriod(Long InstanceChargePeriod) {
        this.InstanceChargePeriod = InstanceChargePeriod;
    }

    public InstanceChargeParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceChargeParam(InstanceChargeParam source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePeriod != null) {
            this.InstanceChargePeriod = new Long(source.InstanceChargePeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceChargePeriod", this.InstanceChargePeriod);

    }
}

