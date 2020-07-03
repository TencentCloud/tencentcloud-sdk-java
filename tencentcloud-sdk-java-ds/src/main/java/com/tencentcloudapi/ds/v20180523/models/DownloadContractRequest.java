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

public class DownloadContractRequest extends AbstractModel{

    /**
    * 模块名ContractMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名DownloadContract
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
     * Get 模块名ContractMng 
     * @return Module 模块名ContractMng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名ContractMng
     * @param Module 模块名ContractMng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名DownloadContract 
     * @return Operation 操作名DownloadContract
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名DownloadContract
     * @param Operation 操作名DownloadContract
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ContractResId", this.ContractResId);

    }
}

