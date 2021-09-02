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

public class QueryChainMakerBlockTransactionResponse extends AbstractModel{

    /**
    * 区块交易
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private ChainMakerTransactionResult [] Result;

    /**
    * 区块高度
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * 交易数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TxCount")
    @Expose
    private Long TxCount;

    /**
    * 区块时间戳，单位是秒
    */
    @SerializedName("BlockTimestamp")
    @Expose
    private Long BlockTimestamp;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 区块交易
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 区块交易
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChainMakerTransactionResult [] getResult() {
        return this.Result;
    }

    /**
     * Set 区块交易
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 区块交易
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(ChainMakerTransactionResult [] Result) {
        this.Result = Result;
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
     * Get 交易数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TxCount 交易数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTxCount() {
        return this.TxCount;
    }

    /**
     * Set 交易数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TxCount 交易数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTxCount(Long TxCount) {
        this.TxCount = TxCount;
    }

    /**
     * Get 区块时间戳，单位是秒 
     * @return BlockTimestamp 区块时间戳，单位是秒
     */
    public Long getBlockTimestamp() {
        return this.BlockTimestamp;
    }

    /**
     * Set 区块时间戳，单位是秒
     * @param BlockTimestamp 区块时间戳，单位是秒
     */
    public void setBlockTimestamp(Long BlockTimestamp) {
        this.BlockTimestamp = BlockTimestamp;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryChainMakerBlockTransactionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryChainMakerBlockTransactionResponse(QueryChainMakerBlockTransactionResponse source) {
        if (source.Result != null) {
            this.Result = new ChainMakerTransactionResult[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new ChainMakerTransactionResult(source.Result[i]);
            }
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.TxCount != null) {
            this.TxCount = new Long(source.TxCount);
        }
        if (source.BlockTimestamp != null) {
            this.BlockTimestamp = new Long(source.BlockTimestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "TxCount", this.TxCount);
        this.setParamSimple(map, prefix + "BlockTimestamp", this.BlockTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

