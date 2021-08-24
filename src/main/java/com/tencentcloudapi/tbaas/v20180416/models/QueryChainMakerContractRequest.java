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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryChainMakerContractRequest extends AbstractModel{

    /**
    * 网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 业务链编号，可在业务链列表中获取
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
    * 合约名称，可在合约管理中获取
    */
    @SerializedName("ContractName")
    @Expose
    private String ContractName;

    /**
    * 合约方法名
    */
    @SerializedName("FuncName")
    @Expose
    private String FuncName;

    /**
    * 合约方法入参，json格式字符串，key/value都是string类型的map
    */
    @SerializedName("FuncParam")
    @Expose
    private String FuncParam;

    /**
     * Get 网络ID，可在区块链网络详情或列表中获取 
     * @return ClusterId 网络ID，可在区块链网络详情或列表中获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID，可在区块链网络详情或列表中获取
     * @param ClusterId 网络ID，可在区块链网络详情或列表中获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 业务链编号，可在业务链列表中获取 
     * @return ChainId 业务链编号，可在业务链列表中获取
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set 业务链编号，可在业务链列表中获取
     * @param ChainId 业务链编号，可在业务链列表中获取
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get 合约名称，可在合约管理中获取 
     * @return ContractName 合约名称，可在合约管理中获取
     */
    public String getContractName() {
        return this.ContractName;
    }

    /**
     * Set 合约名称，可在合约管理中获取
     * @param ContractName 合约名称，可在合约管理中获取
     */
    public void setContractName(String ContractName) {
        this.ContractName = ContractName;
    }

    /**
     * Get 合约方法名 
     * @return FuncName 合约方法名
     */
    public String getFuncName() {
        return this.FuncName;
    }

    /**
     * Set 合约方法名
     * @param FuncName 合约方法名
     */
    public void setFuncName(String FuncName) {
        this.FuncName = FuncName;
    }

    /**
     * Get 合约方法入参，json格式字符串，key/value都是string类型的map 
     * @return FuncParam 合约方法入参，json格式字符串，key/value都是string类型的map
     */
    public String getFuncParam() {
        return this.FuncParam;
    }

    /**
     * Set 合约方法入参，json格式字符串，key/value都是string类型的map
     * @param FuncParam 合约方法入参，json格式字符串，key/value都是string类型的map
     */
    public void setFuncParam(String FuncParam) {
        this.FuncParam = FuncParam;
    }

    public QueryChainMakerContractRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryChainMakerContractRequest(QueryChainMakerContractRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
        if (source.ContractName != null) {
            this.ContractName = new String(source.ContractName);
        }
        if (source.FuncName != null) {
            this.FuncName = new String(source.FuncName);
        }
        if (source.FuncParam != null) {
            this.FuncParam = new String(source.FuncParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "ContractName", this.ContractName);
        this.setParamSimple(map, prefix + "FuncName", this.FuncName);
        this.setParamSimple(map, prefix + "FuncParam", this.FuncParam);

    }
}

