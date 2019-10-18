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

public class BcosBlockObj  extends AbstractModel{

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
    private Integer BlockNumber;

    /**
    * 区块时间戳
    */
    @SerializedName("BlockTimestamp")
    @Expose
    private String BlockTimestamp;

    /**
    * 打包节点id
    */
    @SerializedName("Sealer")
    @Expose
    private String Sealer;

    /**
    * 打包节点索引
    */
    @SerializedName("SealerIndex")
    @Expose
    private Integer SealerIndex;

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
    private Integer TransCount;

    /**
    * 记录修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * 获取区块哈希
     * @return BlockHash 区块哈希
     */
    public String getBlockHash() {
        return this.BlockHash;
    }

    /**
     * 设置区块哈希
     * @param BlockHash 区块哈希
     */
    public void setBlockHash(String BlockHash) {
        this.BlockHash = BlockHash;
    }

    /**
     * 获取区块高度
     * @return BlockNumber 区块高度
     */
    public Integer getBlockNumber() {
        return this.BlockNumber;
    }

    /**
     * 设置区块高度
     * @param BlockNumber 区块高度
     */
    public void setBlockNumber(Integer BlockNumber) {
        this.BlockNumber = BlockNumber;
    }

    /**
     * 获取区块时间戳
     * @return BlockTimestamp 区块时间戳
     */
    public String getBlockTimestamp() {
        return this.BlockTimestamp;
    }

    /**
     * 设置区块时间戳
     * @param BlockTimestamp 区块时间戳
     */
    public void setBlockTimestamp(String BlockTimestamp) {
        this.BlockTimestamp = BlockTimestamp;
    }

    /**
     * 获取打包节点id
     * @return Sealer 打包节点id
     */
    public String getSealer() {
        return this.Sealer;
    }

    /**
     * 设置打包节点id
     * @param Sealer 打包节点id
     */
    public void setSealer(String Sealer) {
        this.Sealer = Sealer;
    }

    /**
     * 获取打包节点索引
     * @return SealerIndex 打包节点索引
     */
    public Integer getSealerIndex() {
        return this.SealerIndex;
    }

    /**
     * 设置打包节点索引
     * @param SealerIndex 打包节点索引
     */
    public void setSealerIndex(Integer SealerIndex) {
        this.SealerIndex = SealerIndex;
    }

    /**
     * 获取记录保存时间
     * @return CreateTime 记录保存时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置记录保存时间
     * @param CreateTime 记录保存时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取交易数量
     * @return TransCount 交易数量
     */
    public Integer getTransCount() {
        return this.TransCount;
    }

    /**
     * 设置交易数量
     * @param TransCount 交易数量
     */
    public void setTransCount(Integer TransCount) {
        this.TransCount = TransCount;
    }

    /**
     * 获取记录修改时间
     * @return ModifyTime 记录修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * 设置记录修改时间
     * @param ModifyTime 记录修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * 内部实现，用户禁止调用
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

