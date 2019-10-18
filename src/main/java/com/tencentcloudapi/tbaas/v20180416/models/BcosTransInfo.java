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

public class BcosTransInfo  extends AbstractModel{

    /**
    * 所属区块高度
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
     * 获取所属区块高度
     * @return BlockNumber 所属区块高度
     */
    public Integer getBlockNumber() {
        return this.BlockNumber;
    }

    /**
     * 设置所属区块高度
     * @param BlockNumber 所属区块高度
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
     * 获取交易哈希
     * @return TransHash 交易哈希
     */
    public String getTransHash() {
        return this.TransHash;
    }

    /**
     * 设置交易哈希
     * @param TransHash 交易哈希
     */
    public void setTransHash(String TransHash) {
        this.TransHash = TransHash;
    }

    /**
     * 获取交易发起者
     * @return TransFrom 交易发起者
     */
    public String getTransFrom() {
        return this.TransFrom;
    }

    /**
     * 设置交易发起者
     * @param TransFrom 交易发起者
     */
    public void setTransFrom(String TransFrom) {
        this.TransFrom = TransFrom;
    }

    /**
     * 获取交易接收者
     * @return TransTo 交易接收者
     */
    public String getTransTo() {
        return this.TransTo;
    }

    /**
     * 设置交易接收者
     * @param TransTo 交易接收者
     */
    public void setTransTo(String TransTo) {
        this.TransTo = TransTo;
    }

    /**
     * 获取落库时间
     * @return CreateTime 落库时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置落库时间
     * @param CreateTime 落库时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取修改时间
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * 设置修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * 内部实现，用户禁止调用
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

