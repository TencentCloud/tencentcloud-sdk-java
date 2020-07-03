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

public class BcosBlockObj extends AbstractModel{

    /**
    * 区块哈希
    */
    @SerializedName("BlockHash")
    @Expose
    private String BlockHash;

    /**
    * 区块高度
    */
    @SerializedName("BlockNumber")
    @Expose
    private Long BlockNumber;

    /**
    * 区块时间戳
    */
    @SerializedName("BlockTimestamp")
    @Expose
    private String BlockTimestamp;

    /**
    * 打包节点ID
    */
    @SerializedName("Sealer")
    @Expose
    private String Sealer;

    /**
    * 打包节点索引
    */
    @SerializedName("SealerIndex")
    @Expose
    private Long SealerIndex;

    /**
    * 记录保存时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 交易数量
    */
    @SerializedName("TransCount")
    @Expose
    private Long TransCount;

    /**
    * 记录修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 区块哈希 
     * @return BlockHash 区块哈希
     */
    public String getBlockHash() {
        return this.BlockHash;
    }

    /**
     * Set 区块哈希
     * @param BlockHash 区块哈希
     */
    public void setBlockHash(String BlockHash) {
        this.BlockHash = BlockHash;
    }

    /**
     * Get 区块高度 
     * @return BlockNumber 区块高度
     */
    public Long getBlockNumber() {
        return this.BlockNumber;
    }

    /**
     * Set 区块高度
     * @param BlockNumber 区块高度
     */
    public void setBlockNumber(Long BlockNumber) {
        this.BlockNumber = BlockNumber;
    }

    /**
     * Get 区块时间戳 
     * @return BlockTimestamp 区块时间戳
     */
    public String getBlockTimestamp() {
        return this.BlockTimestamp;
    }

    /**
     * Set 区块时间戳
     * @param BlockTimestamp 区块时间戳
     */
    public void setBlockTimestamp(String BlockTimestamp) {
        this.BlockTimestamp = BlockTimestamp;
    }

    /**
     * Get 打包节点ID 
     * @return Sealer 打包节点ID
     */
    public String getSealer() {
        return this.Sealer;
    }

    /**
     * Set 打包节点ID
     * @param Sealer 打包节点ID
     */
    public void setSealer(String Sealer) {
        this.Sealer = Sealer;
    }

    /**
     * Get 打包节点索引 
     * @return SealerIndex 打包节点索引
     */
    public Long getSealerIndex() {
        return this.SealerIndex;
    }

    /**
     * Set 打包节点索引
     * @param SealerIndex 打包节点索引
     */
    public void setSealerIndex(Long SealerIndex) {
        this.SealerIndex = SealerIndex;
    }

    /**
     * Get 记录保存时间 
     * @return CreateTime 记录保存时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 记录保存时间
     * @param CreateTime 记录保存时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 交易数量 
     * @return TransCount 交易数量
     */
    public Long getTransCount() {
        return this.TransCount;
    }

    /**
     * Set 交易数量
     * @param TransCount 交易数量
     */
    public void setTransCount(Long TransCount) {
        this.TransCount = TransCount;
    }

    /**
     * Get 记录修改时间 
     * @return ModifyTime 记录修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 记录修改时间
     * @param ModifyTime 记录修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockHash", this.BlockHash);
        this.setParamSimple(map, prefix + "BlockNumber", this.BlockNumber);
        this.setParamSimple(map, prefix + "BlockTimestamp", this.BlockTimestamp);
        this.setParamSimple(map, prefix + "Sealer", this.Sealer);
        this.setParamSimple(map, prefix + "SealerIndex", this.SealerIndex);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TransCount", this.TransCount);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

