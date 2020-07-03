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

public class SignContractByKeywordRequest extends AbstractModel{

    /**
    * 模块名ContractMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名SignContractByKeyword
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
    * 账户ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;

    /**
    * 签署关键字，偏移坐标原点为关键字中心
    */
    @SerializedName("SignKeyword")
    @Expose
    private SignKeyword SignKeyword;

    /**
    * 授权时间（由平台自动填充）
    */
    @SerializedName("AuthorizationTime")
    @Expose
    private String AuthorizationTime;

    /**
    * 授权IP地址（由平台自动填充）
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 签章ID
    */
    @SerializedName("SealResId")
    @Expose
    private String SealResId;

    /**
    * 选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 签名图片，base64编码
    */
    @SerializedName("ImageData")
    @Expose
    private String ImageData;

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
     * Get 操作名SignContractByKeyword 
     * @return Operation 操作名SignContractByKeyword
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名SignContractByKeyword
     * @param Operation 操作名SignContractByKeyword
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
     * Get 账户ID 
     * @return AccountResId 账户ID
     */
    public String getAccountResId() {
        return this.AccountResId;
    }

    /**
     * Set 账户ID
     * @param AccountResId 账户ID
     */
    public void setAccountResId(String AccountResId) {
        this.AccountResId = AccountResId;
    }

    /**
     * Get 签署关键字，偏移坐标原点为关键字中心 
     * @return SignKeyword 签署关键字，偏移坐标原点为关键字中心
     */
    public SignKeyword getSignKeyword() {
        return this.SignKeyword;
    }

    /**
     * Set 签署关键字，偏移坐标原点为关键字中心
     * @param SignKeyword 签署关键字，偏移坐标原点为关键字中心
     */
    public void setSignKeyword(SignKeyword SignKeyword) {
        this.SignKeyword = SignKeyword;
    }

    /**
     * Get 授权时间（由平台自动填充） 
     * @return AuthorizationTime 授权时间（由平台自动填充）
     */
    public String getAuthorizationTime() {
        return this.AuthorizationTime;
    }

    /**
     * Set 授权时间（由平台自动填充）
     * @param AuthorizationTime 授权时间（由平台自动填充）
     */
    public void setAuthorizationTime(String AuthorizationTime) {
        this.AuthorizationTime = AuthorizationTime;
    }

    /**
     * Get 授权IP地址（由平台自动填充） 
     * @return Position 授权IP地址（由平台自动填充）
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 授权IP地址（由平台自动填充）
     * @param Position 授权IP地址（由平台自动填充）
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 签章ID 
     * @return SealResId 签章ID
     */
    public String getSealResId() {
        return this.SealResId;
    }

    /**
     * Set 签章ID
     * @param SealResId 签章ID
     */
    public void setSealResId(String SealResId) {
        this.SealResId = SealResId;
    }

    /**
     * Get 选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1 
     * @return CertType 选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     * @param CertType 选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 签名图片，base64编码 
     * @return ImageData 签名图片，base64编码
     */
    public String getImageData() {
        return this.ImageData;
    }

    /**
     * Set 签名图片，base64编码
     * @param ImageData 签名图片，base64编码
     */
    public void setImageData(String ImageData) {
        this.ImageData = ImageData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ContractResId", this.ContractResId);
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);
        this.setParamObj(map, prefix + "SignKeyword.", this.SignKeyword);
        this.setParamSimple(map, prefix + "AuthorizationTime", this.AuthorizationTime);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "SealResId", this.SealResId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "ImageData", this.ImageData);

    }
}

