/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckVcodeRequest extends AbstractModel {

    /**
    * 模块名VerifyCode
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名CheckVcode
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 帐号ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;

    /**
    * 合同ID
    */
    @SerializedName("ContractResId")
    @Expose
    private String ContractResId;

    /**
    * 验证码
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
     * Get 模块名VerifyCode 
     * @return Module 模块名VerifyCode
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名VerifyCode
     * @param Module 模块名VerifyCode
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名CheckVcode 
     * @return Operation 操作名CheckVcode
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名CheckVcode
     * @param Operation 操作名CheckVcode
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 帐号ID 
     * @return AccountResId 帐号ID
     */
    public String getAccountResId() {
        return this.AccountResId;
    }

    /**
     * Set 帐号ID
     * @param AccountResId 帐号ID
     */
    public void setAccountResId(String AccountResId) {
        this.AccountResId = AccountResId;
    }

    /**
     * Get 合同ID 
     * @return ContractResId 合同ID
     */
    public String getContractResId() {
        return this.ContractResId;
    }

    /**
     * Set 合同ID
     * @param ContractResId 合同ID
     */
    public void setContractResId(String ContractResId) {
        this.ContractResId = ContractResId;
    }

    /**
     * Get 验证码 
     * @return VerifyCode 验证码
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 验证码
     * @param VerifyCode 验证码
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    public CheckVcodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckVcodeRequest(CheckVcodeRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.AccountResId != null) {
            this.AccountResId = new String(source.AccountResId);
        }
        if (source.ContractResId != null) {
            this.ContractResId = new String(source.ContractResId);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);
        this.setParamSimple(map, prefix + "ContractResId", this.ContractResId);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);

    }
}

