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

public class PrepaidPlanParam extends AbstractModel {

    /**
    * 订阅预付费套餐的周期，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。

不填写使用默认值 1。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 预付费套餐的自动续费标志，取值有：
<li> on：开启自动续费；</li>
<li> off：不开启自动续费。</li>
不填写使用默认值 off，自动续费时，默认续费1个月。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get 订阅预付费套餐的周期，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。

不填写使用默认值 1。 
     * @return Period 订阅预付费套餐的周期，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。

不填写使用默认值 1。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 订阅预付费套餐的周期，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。

不填写使用默认值 1。
     * @param Period 订阅预付费套餐的周期，单位：月，取值有：1，2，3，4，5，6，7，8，9，10，11，12，24，36。

不填写使用默认值 1。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 预付费套餐的自动续费标志，取值有：
<li> on：开启自动续费；</li>
<li> off：不开启自动续费。</li>
不填写使用默认值 off，自动续费时，默认续费1个月。 
     * @return RenewFlag 预付费套餐的自动续费标志，取值有：
<li> on：开启自动续费；</li>
<li> off：不开启自动续费。</li>
不填写使用默认值 off，自动续费时，默认续费1个月。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 预付费套餐的自动续费标志，取值有：
<li> on：开启自动续费；</li>
<li> off：不开启自动续费。</li>
不填写使用默认值 off，自动续费时，默认续费1个月。
     * @param RenewFlag 预付费套餐的自动续费标志，取值有：
<li> on：开启自动续费；</li>
<li> off：不开启自动续费。</li>
不填写使用默认值 off，自动续费时，默认续费1个月。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public PrepaidPlanParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrepaidPlanParam(PrepaidPlanParam source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

