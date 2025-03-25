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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChainMakerTransactionResult extends AbstractModel {

    /**
    * 交易结果码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 交易结果码含义
    */
    @SerializedName("CodeMessage")
    @Expose
    private String CodeMessage;

    /**
    * 交易ID
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * Gas使用量
    */
    @SerializedName("GasUsed")
    @Expose
    private Long GasUsed;

    /**
    * 区块高度
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * 合约执行结果
    */
    @SerializedName("ContractEvent")
    @Expose
    private String ContractEvent;

    /**
    * 合约返回信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 交易时间，单位是秒
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get 交易结果码 
     * @return Code 交易结果码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 交易结果码
     * @param Code 交易结果码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 交易结果码含义 
     * @return CodeMessage 交易结果码含义
     */
    public String getCodeMessage() {
        return this.CodeMessage;
    }

    /**
     * Set 交易结果码含义
     * @param CodeMessage 交易结果码含义
     */
    public void setCodeMessage(String CodeMessage) {
        this.CodeMessage = CodeMessage;
    }

    /**
     * Get 交易ID 
     * @return TxId 交易ID
     */
    public String getTxId() {
        return this.TxId;
    }

    /**
     * Set 交易ID
     * @param TxId 交易ID
     */
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

    /**
     * Get Gas使用量 
     * @return GasUsed Gas使用量
     */
    public Long getGasUsed() {
        return this.GasUsed;
    }

    /**
     * Set Gas使用量
     * @param GasUsed Gas使用量
     */
    public void setGasUsed(Long GasUsed) {
        this.GasUsed = GasUsed;
    }

    /**
     * Get 区块高度 
     * @return BlockHeight 区块高度
     */
    public Long getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set 区块高度
     * @param BlockHeight 区块高度
     */
    public void setBlockHeight(Long BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * Get 合约执行结果 
     * @return ContractEvent 合约执行结果
     */
    public String getContractEvent() {
        return this.ContractEvent;
    }

    /**
     * Set 合约执行结果
     * @param ContractEvent 合约执行结果
     */
    public void setContractEvent(String ContractEvent) {
        this.ContractEvent = ContractEvent;
    }

    /**
     * Get 合约返回信息 
     * @return Message 合约返回信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 合约返回信息
     * @param Message 合约返回信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 交易时间，单位是秒 
     * @return Timestamp 交易时间，单位是秒
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 交易时间，单位是秒
     * @param Timestamp 交易时间，单位是秒
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public ChainMakerTransactionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChainMakerTransactionResult(ChainMakerTransactionResult source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.CodeMessage != null) {
            this.CodeMessage = new String(source.CodeMessage);
        }
        if (source.TxId != null) {
            this.TxId = new String(source.TxId);
        }
        if (source.GasUsed != null) {
            this.GasUsed = new Long(source.GasUsed);
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.ContractEvent != null) {
            this.ContractEvent = new String(source.ContractEvent);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CodeMessage", this.CodeMessage);
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "GasUsed", this.GasUsed);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "ContractEvent", this.ContractEvent);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

