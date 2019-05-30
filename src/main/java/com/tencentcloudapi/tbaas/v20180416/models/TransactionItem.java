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

public class TransactionItem  extends AbstractModel{

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
    * 交易所在区块号
    */
    @SerializedName("BlockId")
    @Expose
    private Integer BlockId;

    /**
    * 交易类型（普通交易和配置交易）
    */
    @SerializedName("TransactionType")
    @Expose
    private String TransactionType;

    /**
    * 交易创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 交易所在区块高度
    */
    @SerializedName("BlockHeight")
    @Expose
    private Integer BlockHeight;

    /**
    * 交易状态
    */
    @SerializedName("TransactionStatus")
    @Expose
    private String TransactionStatus;

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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "TransactionHash", this.TransactionHash);
        this.setParamSimple(map, prefix + "CreateOrgName", this.CreateOrgName);
        this.setParamSimple(map, prefix + "BlockId", this.BlockId);
        this.setParamSimple(map, prefix + "TransactionType", this.TransactionType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "TransactionStatus", this.TransactionStatus);

    }
}

