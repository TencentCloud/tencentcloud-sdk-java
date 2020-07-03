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

public class BcosTransInfo extends AbstractModel{

    /**
    * 所属区块高度
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
    * 交易哈希
    */
    @SerializedName("TransHash")
    @Expose
    private String TransHash;

    /**
    * 交易发起者
    */
    @SerializedName("TransFrom")
    @Expose
    private String TransFrom;

    /**
    * 交易接收者
    */
    @SerializedName("TransTo")
    @Expose
    private String TransTo;

    /**
    * 落库时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 所属区块高度 
     * @return BlockNumber 所属区块高度
     */
    public Long getBlockNumber() {
        return this.BlockNumber;
    }

    /**
     * Set 所属区块高度
     * @param BlockNumber 所属区块高度
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
     * Get 交易哈希 
     * @return TransHash 交易哈希
     */
    public String getTransHash() {
        return this.TransHash;
    }

    /**
     * Set 交易哈希
     * @param TransHash 交易哈希
     */
    public void setTransHash(String TransHash) {
        this.TransHash = TransHash;
    }

    /**
     * Get 交易发起者 
     * @return TransFrom 交易发起者
     */
    public String getTransFrom() {
        return this.TransFrom;
    }

    /**
     * Set 交易发起者
     * @param TransFrom 交易发起者
     */
    public void setTransFrom(String TransFrom) {
        this.TransFrom = TransFrom;
    }

    /**
     * Get 交易接收者 
     * @return TransTo 交易接收者
     */
    public String getTransTo() {
        return this.TransTo;
    }

    /**
     * Set 交易接收者
     * @param TransTo 交易接收者
     */
    public void setTransTo(String TransTo) {
        this.TransTo = TransTo;
    }

    /**
     * Get 落库时间 
     * @return CreateTime 落库时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 落库时间
     * @param CreateTime 落库时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockNumber", this.BlockNumber);
        this.setParamSimple(map, prefix + "BlockTimestamp", this.BlockTimestamp);
        this.setParamSimple(map, prefix + "TransHash", this.TransHash);
        this.setParamSimple(map, prefix + "TransFrom", this.TransFrom);
        this.setParamSimple(map, prefix + "TransTo", this.TransTo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

