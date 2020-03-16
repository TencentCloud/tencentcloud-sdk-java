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

public class CreateContractByUploadRequest extends AbstractModel{

    /**
    * 模块名ContractMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名CreateContractByUpload
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 签署人信息
    */
    @SerializedName("SignInfos")
    @Expose
    private SignInfo [] SignInfos;

    /**
    * 合同上传链接地址
    */
    @SerializedName("ContractFile")
    @Expose
    private String ContractFile;

    /**
    * 合同名称
    */
    @SerializedName("ContractName")
    @Expose
    private String ContractName;

    /**
    * 备注
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * 合同发起方腾讯云帐号ID（由平台自动填写）
    */
    @SerializedName("Initiator")
    @Expose
    private String Initiator;

    /**
    * 合同长时间未签署的过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

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
     * Get 操作名CreateContractByUpload 
     * @return Operation 操作名CreateContractByUpload
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名CreateContractByUpload
     * @param Operation 操作名CreateContractByUpload
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 签署人信息 
     * @return SignInfos 签署人信息
     */
    public SignInfo [] getSignInfos() {
        return this.SignInfos;
    }

    /**
     * Set 签署人信息
     * @param SignInfos 签署人信息
     */
    public void setSignInfos(SignInfo [] SignInfos) {
        this.SignInfos = SignInfos;
    }

    /**
     * Get 合同上传链接地址 
     * @return ContractFile 合同上传链接地址
     */
    public String getContractFile() {
        return this.ContractFile;
    }

    /**
     * Set 合同上传链接地址
     * @param ContractFile 合同上传链接地址
     */
    public void setContractFile(String ContractFile) {
        this.ContractFile = ContractFile;
    }

    /**
     * Get 合同名称 
     * @return ContractName 合同名称
     */
    public String getContractName() {
        return this.ContractName;
    }

    /**
     * Set 合同名称
     * @param ContractName 合同名称
     */
    public void setContractName(String ContractName) {
        this.ContractName = ContractName;
    }

    /**
     * Get 备注 
     * @return Remarks 备注
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set 备注
     * @param Remarks 备注
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get 合同发起方腾讯云帐号ID（由平台自动填写） 
     * @return Initiator 合同发起方腾讯云帐号ID（由平台自动填写）
     */
    public String getInitiator() {
        return this.Initiator;
    }

    /**
     * Set 合同发起方腾讯云帐号ID（由平台自动填写）
     * @param Initiator 合同发起方腾讯云帐号ID（由平台自动填写）
     */
    public void setInitiator(String Initiator) {
        this.Initiator = Initiator;
    }

    /**
     * Get 合同长时间未签署的过期时间 
     * @return ExpireTime 合同长时间未签署的过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 合同长时间未签署的过期时间
     * @param ExpireTime 合同长时间未签署的过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "SignInfos.", this.SignInfos);
        this.setParamSimple(map, prefix + "ContractFile", this.ContractFile);
        this.setParamSimple(map, prefix + "ContractName", this.ContractName);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "Initiator", this.Initiator);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

