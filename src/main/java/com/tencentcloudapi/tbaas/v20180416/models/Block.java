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

public class Block extends AbstractModel{

    /**
    * 区块编号
    */
    @SerializedName("BlockNum")
    @Expose
    private Long BlockNum;

    /**
    * 区块数据Hash数值
    */
    @SerializedName("DataHash")
    @Expose
    private String DataHash;

    /**
    * 区块ID，与区块编号一致
    */
    @SerializedName("BlockId")
    @Expose
    private Long BlockId;

    /**
    * 前一个区块Hash
    */
    @SerializedName("PreHash")
    @Expose
    private String PreHash;

    /**
    * 区块内的交易数量
    */
    @SerializedName("TxCount")
    @Expose
    private Long TxCount;

    /**
     * Get 区块编号 
     * @return BlockNum 区块编号
     */
    public Long getBlockNum() {
        return this.BlockNum;
    }

    /**
     * Set 区块编号
     * @param BlockNum 区块编号
     */
    public void setBlockNum(Long BlockNum) {
        this.BlockNum = BlockNum;
    }

    /**
     * Get 区块数据Hash数值 
     * @return DataHash 区块数据Hash数值
     */
    public String getDataHash() {
        return this.DataHash;
    }

    /**
     * Set 区块数据Hash数值
     * @param DataHash 区块数据Hash数值
     */
    public void setDataHash(String DataHash) {
        this.DataHash = DataHash;
    }

    /**
     * Get 区块ID，与区块编号一致 
     * @return BlockId 区块ID，与区块编号一致
     */
    public Long getBlockId() {
        return this.BlockId;
    }

    /**
     * Set 区块ID，与区块编号一致
     * @param BlockId 区块ID，与区块编号一致
     */
    public void setBlockId(Long BlockId) {
        this.BlockId = BlockId;
    }

    /**
     * Get 前一个区块Hash 
     * @return PreHash 前一个区块Hash
     */
    public String getPreHash() {
        return this.PreHash;
    }

    /**
     * Set 前一个区块Hash
     * @param PreHash 前一个区块Hash
     */
    public void setPreHash(String PreHash) {
        this.PreHash = PreHash;
    }

    /**
     * Get 区块内的交易数量 
     * @return TxCount 区块内的交易数量
     */
    public Long getTxCount() {
        return this.TxCount;
    }

    /**
     * Set 区块内的交易数量
     * @param TxCount 区块内的交易数量
     */
    public void setTxCount(Long TxCount) {
        this.TxCount = TxCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockNum", this.BlockNum);
        this.setParamSimple(map, prefix + "DataHash", this.DataHash);
        this.setParamSimple(map, prefix + "BlockId", this.BlockId);
        this.setParamSimple(map, prefix + "PreHash", this.PreHash);
        this.setParamSimple(map, prefix + "TxCount", this.TxCount);

    }
}

