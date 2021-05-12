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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryChargePrepaid extends AbstractModel{

    /**
    * 购买实例的时长，单位：月
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 自动续费标识，0：手动续费，1：自动续费，2：不续费并且不通知
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
     * Get 购买实例的时长，单位：月 
     * @return Period 购买实例的时长，单位：月
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买实例的时长，单位：月
     * @param Period 购买实例的时长，单位：月
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 自动续费标识，0：手动续费，1：自动续费，2：不续费并且不通知 
     * @return RenewFlag 自动续费标识，0：手动续费，1：自动续费，2：不续费并且不通知
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识，0：手动续费，1：自动续费，2：不续费并且不通知
     * @param RenewFlag 自动续费标识，0：手动续费，1：自动续费，2：不续费并且不通知
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public RegistryChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryChargePrepaid(RegistryChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
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

