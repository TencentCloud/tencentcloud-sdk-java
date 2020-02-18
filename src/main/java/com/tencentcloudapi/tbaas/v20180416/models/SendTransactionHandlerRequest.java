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

public class SendTransactionHandlerRequest extends AbstractModel{

    /**
    * 模块名，固定字段：transaction
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：send_transaction
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 群组编号
    */
    @SerializedName("GroupPk")
    @Expose
    private String GroupPk;

    /**
    * 合约编号
    */
    @SerializedName("ContractId")
    @Expose
    private Long ContractId;

    /**
    * 合约方法名
    */
    @SerializedName("FuncName")
    @Expose
    private String FuncName;

    /**
    * 合约方法入参
    */
    @SerializedName("FuncParam")
    @Expose
    private String [] FuncParam;

    /**
     * Get 模块名，固定字段：transaction 
     * @return Module 模块名，固定字段：transaction
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定字段：transaction
     * @param Module 模块名，固定字段：transaction
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，固定字段：send_transaction 
     * @return Operation 操作名，固定字段：send_transaction
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，固定字段：send_transaction
     * @param Operation 操作名，固定字段：send_transaction
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 群组编号 
     * @return GroupPk 群组编号
     */
    public String getGroupPk() {
        return this.GroupPk;
    }

    /**
     * Set 群组编号
     * @param GroupPk 群组编号
     */
    public void setGroupPk(String GroupPk) {
        this.GroupPk = GroupPk;
    }

    /**
     * Get 合约编号 
     * @return ContractId 合约编号
     */
    public Long getContractId() {
        return this.ContractId;
    }

    /**
     * Set 合约编号
     * @param ContractId 合约编号
     */
    public void setContractId(Long ContractId) {
        this.ContractId = ContractId;
    }

    /**
     * Get 合约方法名 
     * @return FuncName 合约方法名
     */
    public String getFuncName() {
        return this.FuncName;
    }

    /**
     * Set 合约方法名
     * @param FuncName 合约方法名
     */
    public void setFuncName(String FuncName) {
        this.FuncName = FuncName;
    }

    /**
     * Get 合约方法入参 
     * @return FuncParam 合约方法入参
     */
    public String [] getFuncParam() {
        return this.FuncParam;
    }

    /**
     * Set 合约方法入参
     * @param FuncParam 合约方法入参
     */
    public void setFuncParam(String [] FuncParam) {
        this.FuncParam = FuncParam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "GroupPk", this.GroupPk);
        this.setParamSimple(map, prefix + "ContractId", this.ContractId);
        this.setParamSimple(map, prefix + "FuncName", this.FuncName);
        this.setParamArraySimple(map, prefix + "FuncParam.", this.FuncParam);

    }
}

