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
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendVcodeRequest  extends AbstractModel{

    /**
    * 模块名VerifyCode
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名SendVcode
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 合同ID
    */
    @SerializedName("ContractResId")
    @Expose
    private String ContractResId;

    /**
    * 帐号ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;

    /**
     * 获取模块名VerifyCode
     * @return Module 模块名VerifyCode
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名VerifyCode
     * @param Module 模块名VerifyCode
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名SendVcode
     * @return Operation 操作名SendVcode
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名SendVcode
     * @param Operation 操作名SendVcode
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取合同ID
     * @return ContractResId 合同ID
     */
    public String getContractResId() {
        return this.ContractResId;
    }

    /**
     * 设置合同ID
     * @param ContractResId 合同ID
     */
    public void setContractResId(String ContractResId) {
        this.ContractResId = ContractResId;
    }

    /**
     * 获取帐号ID
     * @return AccountResId 帐号ID
     */
    public String getAccountResId() {
        return this.AccountResId;
    }

    /**
     * 设置帐号ID
     * @param AccountResId 帐号ID
     */
    public void setAccountResId(String AccountResId) {
        this.AccountResId = AccountResId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ContractResId", this.ContractResId);
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);

    }
}

