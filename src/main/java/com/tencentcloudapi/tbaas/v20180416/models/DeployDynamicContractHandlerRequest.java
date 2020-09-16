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

public class DeployDynamicContractHandlerRequest extends AbstractModel{

    /**
    * 模块名，固定字段：contract
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：deploy_dynamic_contract
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
    * 合约名称
    */
    @SerializedName("ContractName")
    @Expose
    private String ContractName;

    /**
    * 合约编译后的abi
    */
    @SerializedName("AbiInfo")
    @Expose
    private String AbiInfo;

    /**
    * 合约编译后的binary
    */
    @SerializedName("ByteCodeBin")
    @Expose
    private String ByteCodeBin;

    /**
    * 构造函数入参
    */
    @SerializedName("ConstructorParams")
    @Expose
    private String [] ConstructorParams;

    /**
     * Get 模块名，固定字段：contract 
     * @return Module 模块名，固定字段：contract
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定字段：contract
     * @param Module 模块名，固定字段：contract
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，固定字段：deploy_dynamic_contract 
     * @return Operation 操作名，固定字段：deploy_dynamic_contract
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，固定字段：deploy_dynamic_contract
     * @param Operation 操作名，固定字段：deploy_dynamic_contract
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
     * Get 合约名称 
     * @return ContractName 合约名称
     */
    public String getContractName() {
        return this.ContractName;
    }

    /**
     * Set 合约名称
     * @param ContractName 合约名称
     */
    public void setContractName(String ContractName) {
        this.ContractName = ContractName;
    }

    /**
     * Get 合约编译后的abi 
     * @return AbiInfo 合约编译后的abi
     */
    public String getAbiInfo() {
        return this.AbiInfo;
    }

    /**
     * Set 合约编译后的abi
     * @param AbiInfo 合约编译后的abi
     */
    public void setAbiInfo(String AbiInfo) {
        this.AbiInfo = AbiInfo;
    }

    /**
     * Get 合约编译后的binary 
     * @return ByteCodeBin 合约编译后的binary
     */
    public String getByteCodeBin() {
        return this.ByteCodeBin;
    }

    /**
     * Set 合约编译后的binary
     * @param ByteCodeBin 合约编译后的binary
     */
    public void setByteCodeBin(String ByteCodeBin) {
        this.ByteCodeBin = ByteCodeBin;
    }

    /**
     * Get 构造函数入参 
     * @return ConstructorParams 构造函数入参
     */
    public String [] getConstructorParams() {
        return this.ConstructorParams;
    }

    /**
     * Set 构造函数入参
     * @param ConstructorParams 构造函数入参
     */
    public void setConstructorParams(String [] ConstructorParams) {
        this.ConstructorParams = ConstructorParams;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "GroupPk", this.GroupPk);
        this.setParamSimple(map, prefix + "ContractName", this.ContractName);
        this.setParamSimple(map, prefix + "AbiInfo", this.AbiInfo);
        this.setParamSimple(map, prefix + "ByteCodeBin", this.ByteCodeBin);
        this.setParamArraySimple(map, prefix + "ConstructorParams.", this.ConstructorParams);

    }
}

