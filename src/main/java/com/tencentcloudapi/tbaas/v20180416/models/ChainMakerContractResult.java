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

public class ChainMakerContractResult extends AbstractModel{

    /**
    * 交易结果码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 交易结果码含义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeMessage")
    @Expose
    private String CodeMessage;

    /**
    * 交易ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * Gas使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GasUsed")
    @Expose
    private Long GasUsed;

    /**
    * 合约返回消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 合约函数返回，base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeMessage 交易结果码含义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeMessage() {
        return this.CodeMessage;
    }

    /**
     * Set 交易结果码含义
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeMessage 交易结果码含义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeMessage(String CodeMessage) {
        this.CodeMessage = CodeMessage;
    }

    /**
     * Get 交易ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TxId 交易ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTxId() {
        return this.TxId;
    }

    /**
     * Set 交易ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TxId 交易ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

    /**
     * Get Gas使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GasUsed Gas使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGasUsed() {
        return this.GasUsed;
    }

    /**
     * Set Gas使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GasUsed Gas使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGasUsed(Long GasUsed) {
        this.GasUsed = GasUsed;
    }

    /**
     * Get 合约返回消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 合约返回消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 合约返回消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 合约返回消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 合约函数返回，base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 合约函数返回，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 合约函数返回，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 合约函数返回，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public ChainMakerContractResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChainMakerContractResult(ChainMakerContractResult source) {
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
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
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
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

