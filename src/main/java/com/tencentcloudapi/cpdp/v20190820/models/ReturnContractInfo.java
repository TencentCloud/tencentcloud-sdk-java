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

public class ReturnContractInfo extends AbstractModel{

    /**
    * 合约信息
    */
    @SerializedName("ContractInfo")
    @Expose
    private ContractInfo ContractInfo;

    /**
    * 米大师内部生成的合约信息
    */
    @SerializedName("ChannelReturnContractInfo")
    @Expose
    private ChannelReturnContractInfo ChannelReturnContractInfo;

    /**
    * 第三方渠道合约信息
    */
    @SerializedName("ExternalReturnContractInfo")
    @Expose
    private ExternalReturnContractInfo ExternalReturnContractInfo;

    /**
     * Get 合约信息 
     * @return ContractInfo 合约信息
     */
    public ContractInfo getContractInfo() {
        return this.ContractInfo;
    }

    /**
     * Set 合约信息
     * @param ContractInfo 合约信息
     */
    public void setContractInfo(ContractInfo ContractInfo) {
        this.ContractInfo = ContractInfo;
    }

    /**
     * Get 米大师内部生成的合约信息 
     * @return ChannelReturnContractInfo 米大师内部生成的合约信息
     */
    public ChannelReturnContractInfo getChannelReturnContractInfo() {
        return this.ChannelReturnContractInfo;
    }

    /**
     * Set 米大师内部生成的合约信息
     * @param ChannelReturnContractInfo 米大师内部生成的合约信息
     */
    public void setChannelReturnContractInfo(ChannelReturnContractInfo ChannelReturnContractInfo) {
        this.ChannelReturnContractInfo = ChannelReturnContractInfo;
    }

    /**
     * Get 第三方渠道合约信息 
     * @return ExternalReturnContractInfo 第三方渠道合约信息
     */
    public ExternalReturnContractInfo getExternalReturnContractInfo() {
        return this.ExternalReturnContractInfo;
    }

    /**
     * Set 第三方渠道合约信息
     * @param ExternalReturnContractInfo 第三方渠道合约信息
     */
    public void setExternalReturnContractInfo(ExternalReturnContractInfo ExternalReturnContractInfo) {
        this.ExternalReturnContractInfo = ExternalReturnContractInfo;
    }

    public ReturnContractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReturnContractInfo(ReturnContractInfo source) {
        if (source.ContractInfo != null) {
            this.ContractInfo = new ContractInfo(source.ContractInfo);
        }
        if (source.ChannelReturnContractInfo != null) {
            this.ChannelReturnContractInfo = new ChannelReturnContractInfo(source.ChannelReturnContractInfo);
        }
        if (source.ExternalReturnContractInfo != null) {
            this.ExternalReturnContractInfo = new ExternalReturnContractInfo(source.ExternalReturnContractInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ContractInfo.", this.ContractInfo);
        this.setParamObj(map, prefix + "ChannelReturnContractInfo.", this.ChannelReturnContractInfo);
        this.setParamObj(map, prefix + "ExternalReturnContractInfo.", this.ExternalReturnContractInfo);

    }
}

