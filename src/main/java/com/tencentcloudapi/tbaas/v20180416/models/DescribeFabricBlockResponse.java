/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class DescribeFabricBlockResponse extends AbstractModel {

    /**
    * 区块高度
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * 区块Hash
    */
    @SerializedName("BlockHash")
    @Expose
    private String BlockHash;

    /**
    * 前置区块Hash
    */
    @SerializedName("PreBlockHash")
    @Expose
    private String PreBlockHash;

    /**
    * 区块中交易数量
    */
    @SerializedName("TxCount")
    @Expose
    private Long TxCount;

    /**
    * 区块中交易列表
    */
    @SerializedName("TransactionList")
    @Expose
    private Transaction [] TransactionList;

    /**
    * 创建时间戳
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private String CreateTimestamp;

    /**
    * 提案组织
    */
    @SerializedName("ProposerOrg")
    @Expose
    private String ProposerOrg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 区块Hash 
     * @return BlockHash 区块Hash
     */
    public String getBlockHash() {
        return this.BlockHash;
    }

    /**
     * Set 区块Hash
     * @param BlockHash 区块Hash
     */
    public void setBlockHash(String BlockHash) {
        this.BlockHash = BlockHash;
    }

    /**
     * Get 前置区块Hash 
     * @return PreBlockHash 前置区块Hash
     */
    public String getPreBlockHash() {
        return this.PreBlockHash;
    }

    /**
     * Set 前置区块Hash
     * @param PreBlockHash 前置区块Hash
     */
    public void setPreBlockHash(String PreBlockHash) {
        this.PreBlockHash = PreBlockHash;
    }

    /**
     * Get 区块中交易数量 
     * @return TxCount 区块中交易数量
     */
    public Long getTxCount() {
        return this.TxCount;
    }

    /**
     * Set 区块中交易数量
     * @param TxCount 区块中交易数量
     */
    public void setTxCount(Long TxCount) {
        this.TxCount = TxCount;
    }

    /**
     * Get 区块中交易列表 
     * @return TransactionList 区块中交易列表
     */
    public Transaction [] getTransactionList() {
        return this.TransactionList;
    }

    /**
     * Set 区块中交易列表
     * @param TransactionList 区块中交易列表
     */
    public void setTransactionList(Transaction [] TransactionList) {
        this.TransactionList = TransactionList;
    }

    /**
     * Get 创建时间戳 
     * @return CreateTimestamp 创建时间戳
     */
    public String getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set 创建时间戳
     * @param CreateTimestamp 创建时间戳
     */
    public void setCreateTimestamp(String CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get 提案组织 
     * @return ProposerOrg 提案组织
     */
    public String getProposerOrg() {
        return this.ProposerOrg;
    }

    /**
     * Set 提案组织
     * @param ProposerOrg 提案组织
     */
    public void setProposerOrg(String ProposerOrg) {
        this.ProposerOrg = ProposerOrg;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFabricBlockResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFabricBlockResponse(DescribeFabricBlockResponse source) {
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.BlockHash != null) {
            this.BlockHash = new String(source.BlockHash);
        }
        if (source.PreBlockHash != null) {
            this.PreBlockHash = new String(source.PreBlockHash);
        }
        if (source.TxCount != null) {
            this.TxCount = new Long(source.TxCount);
        }
        if (source.TransactionList != null) {
            this.TransactionList = new Transaction[source.TransactionList.length];
            for (int i = 0; i < source.TransactionList.length; i++) {
                this.TransactionList[i] = new Transaction(source.TransactionList[i]);
            }
        }
        if (source.CreateTimestamp != null) {
            this.CreateTimestamp = new String(source.CreateTimestamp);
        }
        if (source.ProposerOrg != null) {
            this.ProposerOrg = new String(source.ProposerOrg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "BlockHash", this.BlockHash);
        this.setParamSimple(map, prefix + "PreBlockHash", this.PreBlockHash);
        this.setParamSimple(map, prefix + "TxCount", this.TxCount);
        this.setParamArrayObj(map, prefix + "TransactionList.", this.TransactionList);
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "ProposerOrg", this.ProposerOrg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

