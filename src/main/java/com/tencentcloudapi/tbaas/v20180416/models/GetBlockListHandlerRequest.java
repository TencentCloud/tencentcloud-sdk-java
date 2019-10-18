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

public class GetBlockListHandlerRequest  extends AbstractModel{

    /**
    * 模块名，固定字段：block
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：get_block_list
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 记录偏移数
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 每页记录数
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 当前群组编号
    */
    @SerializedName("GroupPk")
    @Expose
    private String GroupPk;

    /**
    * 区块哈希
    */
    @SerializedName("BlockHash")
    @Expose
    private String BlockHash;

    /**
     * 获取模块名，固定字段：block
     * @return Module 模块名，固定字段：block
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名，固定字段：block
     * @param Module 模块名，固定字段：block
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名，固定字段：get_block_list
     * @return Operation 操作名，固定字段：get_block_list
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名，固定字段：get_block_list
     * @param Operation 操作名，固定字段：get_block_list
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取记录偏移数
     * @return Offset 记录偏移数
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置记录偏移数
     * @param Offset 记录偏移数
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取每页记录数
     * @return Limit 每页记录数
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页记录数
     * @param Limit 每页记录数
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取当前群组编号
     * @return GroupPk 当前群组编号
     */
    public String getGroupPk() {
        return this.GroupPk;
    }

    /**
     * 设置当前群组编号
     * @param GroupPk 当前群组编号
     */
    public void setGroupPk(String GroupPk) {
        this.GroupPk = GroupPk;
    }

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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "GroupPk", this.GroupPk);
        this.setParamSimple(map, prefix + "BlockHash", this.BlockHash);

    }
}

