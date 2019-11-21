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

public class GetTransactionDetailForUserResponse  extends AbstractModel{

    /**
    * 交易ID
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 交易hash
    */
    @SerializedName("TransactionHash")
    @Expose
    private String TransactionHash;

    /**
    * 创建交易的组织名
    */
    @SerializedName("CreateOrgName")
    @Expose
    private String CreateOrgName;

    /**
    * 交易类型（普通交易和配置交易）
    */
    @SerializedName("TransactionType")
    @Expose
    private String TransactionType;

    /**
    * 交易状态
    */
    @SerializedName("TransactionStatus")
    @Expose
    private String TransactionStatus;

    /**
    * 交易创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 交易数据
    */
    @SerializedName("TransactionData")
    @Expose
    private String TransactionData;

    /**
    * 交易所在区块号
    */
    @SerializedName("BlockId")
    @Expose
    private Integer BlockId;

    /**
    * 交易所在区块哈希
    */
    @SerializedName("BlockHash")
    @Expose
    private String BlockHash;

    /**
    * 交易所在区块高度
    */
    @SerializedName("BlockHeight")
    @Expose
    private Integer BlockHeight;

    /**
    * 通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 交易所在合约名称
    */
    @SerializedName("ContractName")
    @Expose
    private String ContractName;

    /**
    * 背书组织列表
    */
    @SerializedName("EndorserOrgList")
    @Expose
    private EndorserGroup [] EndorserOrgList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取交易ID
     * @return TransactionId 交易ID
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * 设置交易ID
     * @param TransactionId 交易ID
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * 获取交易hash
     * @return TransactionHash 交易hash
     */
    public String getTransactionHash() {
        return this.TransactionHash;
    }

    /**
     * 设置交易hash
     * @param TransactionHash 交易hash
     */
    public void setTransactionHash(String TransactionHash) {
        this.TransactionHash = TransactionHash;
    }

    /**
     * 获取创建交易的组织名
     * @return CreateOrgName 创建交易的组织名
     */
    public String getCreateOrgName() {
        return this.CreateOrgName;
    }

    /**
     * 设置创建交易的组织名
     * @param CreateOrgName 创建交易的组织名
     */
    public void setCreateOrgName(String CreateOrgName) {
        this.CreateOrgName = CreateOrgName;
    }

    /**
     * 获取交易类型（普通交易和配置交易）
     * @return TransactionType 交易类型（普通交易和配置交易）
     */
    public String getTransactionType() {
        return this.TransactionType;
    }

    /**
     * 设置交易类型（普通交易和配置交易）
     * @param TransactionType 交易类型（普通交易和配置交易）
     */
    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    /**
     * 获取交易状态
     * @return TransactionStatus 交易状态
     */
    public String getTransactionStatus() {
        return this.TransactionStatus;
    }

    /**
     * 设置交易状态
     * @param TransactionStatus 交易状态
     */
    public void setTransactionStatus(String TransactionStatus) {
        this.TransactionStatus = TransactionStatus;
    }

    /**
     * 获取交易创建时间
     * @return CreateTime 交易创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置交易创建时间
     * @param CreateTime 交易创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取交易数据
     * @return TransactionData 交易数据
     */
    public String getTransactionData() {
        return this.TransactionData;
    }

    /**
     * 设置交易数据
     * @param TransactionData 交易数据
     */
    public void setTransactionData(String TransactionData) {
        this.TransactionData = TransactionData;
    }

    /**
     * 获取交易所在区块号
     * @return BlockId 交易所在区块号
     */
    public Integer getBlockId() {
        return this.BlockId;
    }

    /**
     * 设置交易所在区块号
     * @param BlockId 交易所在区块号
     */
    public void setBlockId(Integer BlockId) {
        this.BlockId = BlockId;
    }

    /**
     * 获取交易所在区块哈希
     * @return BlockHash 交易所在区块哈希
     */
    public String getBlockHash() {
        return this.BlockHash;
    }

    /**
     * 设置交易所在区块哈希
     * @param BlockHash 交易所在区块哈希
     */
    public void setBlockHash(String BlockHash) {
        this.BlockHash = BlockHash;
    }

    /**
     * 获取交易所在区块高度
     * @return BlockHeight 交易所在区块高度
     */
    public Integer getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * 设置交易所在区块高度
     * @param BlockHeight 交易所在区块高度
     */
    public void setBlockHeight(Integer BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * 获取通道名称
     * @return ChannelName 通道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * 设置通道名称
     * @param ChannelName 通道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * 获取交易所在合约名称
     * @return ContractName 交易所在合约名称
     */
    public String getContractName() {
        return this.ContractName;
    }

    /**
     * 设置交易所在合约名称
     * @param ContractName 交易所在合约名称
     */
    public void setContractName(String ContractName) {
        this.ContractName = ContractName;
    }

    /**
     * 获取背书组织列表
     * @return EndorserOrgList 背书组织列表
     */
    public EndorserGroup [] getEndorserOrgList() {
        return this.EndorserOrgList;
    }

    /**
     * 设置背书组织列表
     * @param EndorserOrgList 背书组织列表
     */
    public void setEndorserOrgList(EndorserGroup [] EndorserOrgList) {
        this.EndorserOrgList = EndorserOrgList;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "TransactionHash", this.TransactionHash);
        this.setParamSimple(map, prefix + "CreateOrgName", this.CreateOrgName);
        this.setParamSimple(map, prefix + "TransactionType", this.TransactionType);
        this.setParamSimple(map, prefix + "TransactionStatus", this.TransactionStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TransactionData", this.TransactionData);
        this.setParamSimple(map, prefix + "BlockId", this.BlockId);
        this.setParamSimple(map, prefix + "BlockHash", this.BlockHash);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ContractName", this.ContractName);
        this.setParamArrayObj(map, prefix + "EndorserOrgList.", this.EndorserOrgList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

