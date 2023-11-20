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

public class Transaction extends AbstractModel {

    /**
    * 交易ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * 合约名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChaincodeName")
    @Expose
    private String ChaincodeName;

    /**
    * 交易发送者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sender")
    @Expose
    private String Sender;

    /**
    * 交易创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 交易所在区块高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * 交易在区块中的序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TxIndex")
    @Expose
    private Long TxIndex;

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
     * Get 合约名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChaincodeName 合约名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChaincodeName() {
        return this.ChaincodeName;
    }

    /**
     * Set 合约名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChaincodeName 合约名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChaincodeName(String ChaincodeName) {
        this.ChaincodeName = ChaincodeName;
    }

    /**
     * Get 交易发送者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sender 交易发送者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSender() {
        return this.Sender;
    }

    /**
     * Set 交易发送者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sender 交易发送者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSender(String Sender) {
        this.Sender = Sender;
    }

    /**
     * Get 交易创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 交易创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 交易创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 交易创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 交易所在区块高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockHeight 交易所在区块高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set 交易所在区块高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockHeight 交易所在区块高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockHeight(Long BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * Get 交易在区块中的序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TxIndex 交易在区块中的序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTxIndex() {
        return this.TxIndex;
    }

    /**
     * Set 交易在区块中的序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TxIndex 交易在区块中的序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTxIndex(Long TxIndex) {
        this.TxIndex = TxIndex;
    }

    public Transaction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Transaction(Transaction source) {
        if (source.TxId != null) {
            this.TxId = new String(source.TxId);
        }
        if (source.ChaincodeName != null) {
            this.ChaincodeName = new String(source.ChaincodeName);
        }
        if (source.Sender != null) {
            this.Sender = new String(source.Sender);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.TxIndex != null) {
            this.TxIndex = new Long(source.TxIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "ChaincodeName", this.ChaincodeName);
        this.setParamSimple(map, prefix + "Sender", this.Sender);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "TxIndex", this.TxIndex);

    }
}

