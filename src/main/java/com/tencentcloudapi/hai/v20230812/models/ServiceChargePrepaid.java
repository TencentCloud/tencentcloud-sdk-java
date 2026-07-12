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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceChargePrepaid extends AbstractModel {

    /**
    * <p>购买时长，默认1</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>时长单位：MONTH(月)/DAY(天)</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>自动续费：NOTIFY_AND_AUTO_RENEW/NOTIFY_AND_MANUAL_RENEW/DISABLE_NOTIFY_AND_MANUAL_RENEW</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get <p>购买时长，默认1</p> 
     * @return Period <p>购买时长，默认1</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，默认1</p>
     * @param Period <p>购买时长，默认1</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>时长单位：MONTH(月)/DAY(天)</p> 
     * @return TimeUnit <p>时长单位：MONTH(月)/DAY(天)</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时长单位：MONTH(月)/DAY(天)</p>
     * @param TimeUnit <p>时长单位：MONTH(月)/DAY(天)</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>自动续费：NOTIFY_AND_AUTO_RENEW/NOTIFY_AND_MANUAL_RENEW/DISABLE_NOTIFY_AND_MANUAL_RENEW</p> 
     * @return RenewFlag <p>自动续费：NOTIFY_AND_AUTO_RENEW/NOTIFY_AND_MANUAL_RENEW/DISABLE_NOTIFY_AND_MANUAL_RENEW</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费：NOTIFY_AND_AUTO_RENEW/NOTIFY_AND_MANUAL_RENEW/DISABLE_NOTIFY_AND_MANUAL_RENEW</p>
     * @param RenewFlag <p>自动续费：NOTIFY_AND_AUTO_RENEW/NOTIFY_AND_MANUAL_RENEW/DISABLE_NOTIFY_AND_MANUAL_RENEW</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public ServiceChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceChargePrepaid(ServiceChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
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
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

