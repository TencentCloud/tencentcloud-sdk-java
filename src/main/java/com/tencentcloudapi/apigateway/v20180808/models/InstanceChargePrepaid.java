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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel{

    /**
    * 自动续费标示
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 预付费到期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
     * Get 自动续费标示 
     * @return RenewFlag 自动续费标示
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标示
     * @param RenewFlag 自动续费标示
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 预付费到期时间 
     * @return ExpiredTime 预付费到期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 预付费到期时间
     * @param ExpiredTime 预付费到期时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public InstanceChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceChargePrepaid(InstanceChargePrepaid source) {
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

