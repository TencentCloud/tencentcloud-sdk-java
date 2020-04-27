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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressChargePrepaid extends AbstractModel{

    /**
    * 购买实例的时长
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 自动续费标志
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get 购买实例的时长 
     * @return Period 购买实例的时长
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买实例的时长
     * @param Period 购买实例的时长
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 自动续费标志 
     * @return RenewFlag 自动续费标志
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标志
     * @param RenewFlag 自动续费标志
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

