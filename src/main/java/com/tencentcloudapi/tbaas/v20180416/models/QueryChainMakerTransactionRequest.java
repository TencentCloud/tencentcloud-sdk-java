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

public class QueryChainMakerTransactionRequest extends AbstractModel{

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
    * 交易ID，通过调用合约的返回值获取
    */
    @SerializedName("TxID")
    @Expose
    private String TxID;

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
     * Get 交易ID，通过调用合约的返回值获取 
     * @return TxID 交易ID，通过调用合约的返回值获取
     */
    public String getTxID() {
        return this.TxID;
    }

    /**
     * Set 交易ID，通过调用合约的返回值获取
     * @param TxID 交易ID，通过调用合约的返回值获取
     */
    public void setTxID(String TxID) {
        this.TxID = TxID;
    }

    public QueryChainMakerTransactionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryChainMakerTransactionRequest(QueryChainMakerTransactionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
        if (source.TxID != null) {
            this.TxID = new String(source.TxID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "TxID", this.TxID);

    }
}

