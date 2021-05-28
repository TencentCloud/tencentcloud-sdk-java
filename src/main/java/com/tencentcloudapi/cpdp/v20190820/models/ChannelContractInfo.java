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

public class ChannelContractInfo extends AbstractModel{

    /**
    * 外部合约协议号
    */
    @SerializedName("OutContractCode")
    @Expose
    private String OutContractCode;

    /**
    * 米大师内部生成的合约协议号
    */
    @SerializedName("ChannelContractCode")
    @Expose
    private String ChannelContractCode;

    /**
     * Get 外部合约协议号 
     * @return OutContractCode 外部合约协议号
     */
    public String getOutContractCode() {
        return this.OutContractCode;
    }

    /**
     * Set 外部合约协议号
     * @param OutContractCode 外部合约协议号
     */
    public void setOutContractCode(String OutContractCode) {
        this.OutContractCode = OutContractCode;
    }

    /**
     * Get 米大师内部生成的合约协议号 
     * @return ChannelContractCode 米大师内部生成的合约协议号
     */
    public String getChannelContractCode() {
        return this.ChannelContractCode;
    }

    /**
     * Set 米大师内部生成的合约协议号
     * @param ChannelContractCode 米大师内部生成的合约协议号
     */
    public void setChannelContractCode(String ChannelContractCode) {
        this.ChannelContractCode = ChannelContractCode;
    }

    public ChannelContractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelContractInfo(ChannelContractInfo source) {
        if (source.OutContractCode != null) {
            this.OutContractCode = new String(source.OutContractCode);
        }
        if (source.ChannelContractCode != null) {
            this.ChannelContractCode = new String(source.ChannelContractCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutContractCode", this.OutContractCode);
        this.setParamSimple(map, prefix + "ChannelContractCode", this.ChannelContractCode);

    }
}

