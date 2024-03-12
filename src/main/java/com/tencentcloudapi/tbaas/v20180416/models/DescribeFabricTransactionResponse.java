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

public class DescribeFabricTransactionResponse extends AbstractModel {

    /**
    * 交易ID
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * 交易Hash
    */
    @SerializedName("TxHash")
    @Expose
    private String TxHash;

    /**
    * 交易状态
    */
    @SerializedName("TxStatus")
    @Expose
    private String TxStatus;

    /**
    * 参与的组织列表
    */
    @SerializedName("JoinOrgList")
    @Expose
    private String [] JoinOrgList;

    /**
    * 交易发送者
    */
    @SerializedName("Sender")
    @Expose
    private String Sender;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 区块高度
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * 交易所属合约
    */
    @SerializedName("ChaincodeName")
    @Expose
    private String ChaincodeName;

    /**
    * 交易数据，base64编码，解码后为json化的字符串
    */
    @SerializedName("TransactionData")
    @Expose
    private String TransactionData;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 交易Hash 
     * @return TxHash 交易Hash
     */
    public String getTxHash() {
        return this.TxHash;
    }

    /**
     * Set 交易Hash
     * @param TxHash 交易Hash
     */
    public void setTxHash(String TxHash) {
        this.TxHash = TxHash;
    }

    /**
     * Get 交易状态 
     * @return TxStatus 交易状态
     */
    public String getTxStatus() {
        return this.TxStatus;
    }

    /**
     * Set 交易状态
     * @param TxStatus 交易状态
     */
    public void setTxStatus(String TxStatus) {
        this.TxStatus = TxStatus;
    }

    /**
     * Get 参与的组织列表 
     * @return JoinOrgList 参与的组织列表
     */
    public String [] getJoinOrgList() {
        return this.JoinOrgList;
    }

    /**
     * Set 参与的组织列表
     * @param JoinOrgList 参与的组织列表
     */
    public void setJoinOrgList(String [] JoinOrgList) {
        this.JoinOrgList = JoinOrgList;
    }

    /**
     * Get 交易发送者 
     * @return Sender 交易发送者
     */
    public String getSender() {
        return this.Sender;
    }

    /**
     * Set 交易发送者
     * @param Sender 交易发送者
     */
    public void setSender(String Sender) {
        this.Sender = Sender;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 交易所属合约 
     * @return ChaincodeName 交易所属合约
     */
    public String getChaincodeName() {
        return this.ChaincodeName;
    }

    /**
     * Set 交易所属合约
     * @param ChaincodeName 交易所属合约
     */
    public void setChaincodeName(String ChaincodeName) {
        this.ChaincodeName = ChaincodeName;
    }

    /**
     * Get 交易数据，base64编码，解码后为json化的字符串 
     * @return TransactionData 交易数据，base64编码，解码后为json化的字符串
     */
    public String getTransactionData() {
        return this.TransactionData;
    }

    /**
     * Set 交易数据，base64编码，解码后为json化的字符串
     * @param TransactionData 交易数据，base64编码，解码后为json化的字符串
     */
    public void setTransactionData(String TransactionData) {
        this.TransactionData = TransactionData;
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

    public DescribeFabricTransactionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFabricTransactionResponse(DescribeFabricTransactionResponse source) {
        if (source.TxId != null) {
            this.TxId = new String(source.TxId);
        }
        if (source.TxHash != null) {
            this.TxHash = new String(source.TxHash);
        }
        if (source.TxStatus != null) {
            this.TxStatus = new String(source.TxStatus);
        }
        if (source.JoinOrgList != null) {
            this.JoinOrgList = new String[source.JoinOrgList.length];
            for (int i = 0; i < source.JoinOrgList.length; i++) {
                this.JoinOrgList[i] = new String(source.JoinOrgList[i]);
            }
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
        if (source.ChaincodeName != null) {
            this.ChaincodeName = new String(source.ChaincodeName);
        }
        if (source.TransactionData != null) {
            this.TransactionData = new String(source.TransactionData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "TxHash", this.TxHash);
        this.setParamSimple(map, prefix + "TxStatus", this.TxStatus);
        this.setParamArraySimple(map, prefix + "JoinOrgList.", this.JoinOrgList);
        this.setParamSimple(map, prefix + "Sender", this.Sender);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "ChaincodeName", this.ChaincodeName);
        this.setParamSimple(map, prefix + "TransactionData", this.TransactionData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

