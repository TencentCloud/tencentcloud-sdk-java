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

public class BlockByNumberHandlerRequest extends AbstractModel{

    /**
    * 模块名，固定字段：block
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：block_by_number
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 当前群组编号
    */
    @SerializedName("GroupPk")
    @Expose
    private String GroupPk;

    /**
    * 区块高度
    */
    @SerializedName("BlockNumber")
    @Expose
    private Long BlockNumber;

    /**
     * Get 模块名，固定字段：block 
     * @return Module 模块名，固定字段：block
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定字段：block
     * @param Module 模块名，固定字段：block
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，固定字段：block_by_number 
     * @return Operation 操作名，固定字段：block_by_number
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，固定字段：block_by_number
     * @param Operation 操作名，固定字段：block_by_number
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 当前群组编号 
     * @return GroupPk 当前群组编号
     */
    public String getGroupPk() {
        return this.GroupPk;
    }

    /**
     * Set 当前群组编号
     * @param GroupPk 当前群组编号
     */
    public void setGroupPk(String GroupPk) {
        this.GroupPk = GroupPk;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "GroupPk", this.GroupPk);
        this.setParamSimple(map, prefix + "BlockNumber", this.BlockNumber);

    }
}

