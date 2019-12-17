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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceOpenProVersionPrepaidRequest extends AbstractModel{

    /**
    * 预付费模式(包年包月)参数设置。
    */
    @SerializedName("ChargePrepaid")
    @Expose
    private ChargePrepaid ChargePrepaid;

    /**
    * 需要开通专业版机器列表数组。
    */
    @SerializedName("Machines")
    @Expose
    private ProVersionMachine [] Machines;

    /**
     * Get 预付费模式(包年包月)参数设置。 
     * @return ChargePrepaid 预付费模式(包年包月)参数设置。
     */
    public ChargePrepaid getChargePrepaid() {
        return this.ChargePrepaid;
    }

    /**
     * Set 预付费模式(包年包月)参数设置。
     * @param ChargePrepaid 预付费模式(包年包月)参数设置。
     */
    public void setChargePrepaid(ChargePrepaid ChargePrepaid) {
        this.ChargePrepaid = ChargePrepaid;
    }

    /**
     * Get 需要开通专业版机器列表数组。 
     * @return Machines 需要开通专业版机器列表数组。
     */
    public ProVersionMachine [] getMachines() {
        return this.Machines;
    }

    /**
     * Set 需要开通专业版机器列表数组。
     * @param Machines 需要开通专业版机器列表数组。
     */
    public void setMachines(ProVersionMachine [] Machines) {
        this.Machines = Machines;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ChargePrepaid.", this.ChargePrepaid);
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);

    }
}

