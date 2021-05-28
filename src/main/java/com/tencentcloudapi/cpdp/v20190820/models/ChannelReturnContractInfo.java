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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelReturnContractInfo extends AbstractModel{

    /**
    * 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
    */
    @SerializedName("ContractStatus")
    @Expose
    private String ContractStatus;

    /**
    * 米大师内部存放的合约信息
    */
    @SerializedName("ChannelContractInfo")
    @Expose
    private ChannelContractInfo ChannelContractInfo;

    /**
     * Get 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中 
     * @return ContractStatus 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
     */
    public String getContractStatus() {
        return this.ContractStatus;
    }

    /**
     * Set 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
     * @param ContractStatus 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
     */
    public void setContractStatus(String ContractStatus) {
        this.ContractStatus = ContractStatus;
    }

    /**
     * Get 米大师内部存放的合约信息 
     * @return ChannelContractInfo 米大师内部存放的合约信息
     */
    public ChannelContractInfo getChannelContractInfo() {
        return this.ChannelContractInfo;
    }

    /**
     * Set 米大师内部存放的合约信息
     * @param ChannelContractInfo 米大师内部存放的合约信息
     */
    public void setChannelContractInfo(ChannelContractInfo ChannelContractInfo) {
        this.ChannelContractInfo = ChannelContractInfo;
    }

    public ChannelReturnContractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelReturnContractInfo(ChannelReturnContractInfo source) {
        if (source.ContractStatus != null) {
            this.ContractStatus = new String(source.ContractStatus);
        }
        if (source.ChannelContractInfo != null) {
            this.ChannelContractInfo = new ChannelContractInfo(source.ChannelContractInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContractStatus", this.ContractStatus);
        this.setParamObj(map, prefix + "ChannelContractInfo.", this.ChannelContractInfo);

    }
}

