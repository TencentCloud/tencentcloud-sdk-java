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

public class SignContractByCoordinateRequest  extends AbstractModel{

    /**
    * 模块名ContractMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名SignContractByCoordinate
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
    * 帐户ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;

    /**
    * 授权时间，格式为年月日时分秒，例20160801095509
    */
    @SerializedName("AuthorizationTime")
    @Expose
    private String AuthorizationTime;

    /**
    * 授权IP地址
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 签署坐标，坐标原点在文件左下角，坐标单位为磅，坐标不得超过合同文件边界
    */
    @SerializedName("SignLocations")
    @Expose
    private SignLocation [] SignLocations;

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
    private Integer CertType;

    /**
    * 签名图片，base64编码
    */
    @SerializedName("ImageData")
    @Expose
    private String ImageData;

    /**
     * 获取模块名ContractMng
     * @return Module 模块名ContractMng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名ContractMng
     * @param Module 模块名ContractMng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名SignContractByCoordinate
     * @return Operation 操作名SignContractByCoordinate
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名SignContractByCoordinate
     * @param Operation 操作名SignContractByCoordinate
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
     * 获取帐户ID
     * @return AccountResId 帐户ID
     */
    public String getAccountResId() {
        return this.AccountResId;
    }

    /**
     * 设置帐户ID
     * @param AccountResId 帐户ID
     */
    public void setAccountResId(String AccountResId) {
        this.AccountResId = AccountResId;
    }

    /**
     * 获取授权时间，格式为年月日时分秒，例20160801095509
     * @return AuthorizationTime 授权时间，格式为年月日时分秒，例20160801095509
     */
    public String getAuthorizationTime() {
        return this.AuthorizationTime;
    }

    /**
     * 设置授权时间，格式为年月日时分秒，例20160801095509
     * @param AuthorizationTime 授权时间，格式为年月日时分秒，例20160801095509
     */
    public void setAuthorizationTime(String AuthorizationTime) {
        this.AuthorizationTime = AuthorizationTime;
    }

    /**
     * 获取授权IP地址
     * @return Position 授权IP地址
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * 设置授权IP地址
     * @param Position 授权IP地址
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * 获取签署坐标，坐标原点在文件左下角，坐标单位为磅，坐标不得超过合同文件边界
     * @return SignLocations 签署坐标，坐标原点在文件左下角，坐标单位为磅，坐标不得超过合同文件边界
     */
    public SignLocation [] getSignLocations() {
        return this.SignLocations;
    }

    /**
     * 设置签署坐标，坐标原点在文件左下角，坐标单位为磅，坐标不得超过合同文件边界
     * @param SignLocations 签署坐标，坐标原点在文件左下角，坐标单位为磅，坐标不得超过合同文件边界
     */
    public void setSignLocations(SignLocation [] SignLocations) {
        this.SignLocations = SignLocations;
    }

    /**
     * 获取签章ID
     * @return SealResId 签章ID
     */
    public String getSealResId() {
        return this.SealResId;
    }

    /**
     * 设置签章ID
     * @param SealResId 签章ID
     */
    public void setSealResId(String SealResId) {
        this.SealResId = SealResId;
    }

    /**
     * 获取选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     * @return CertType 选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     */
    public Integer getCertType() {
        return this.CertType;
    }

    /**
     * 设置选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     * @param CertType 选用证书类型：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     */
    public void setCertType(Integer CertType) {
        this.CertType = CertType;
    }

    /**
     * 获取签名图片，base64编码
     * @return ImageData 签名图片，base64编码
     */
    public String getImageData() {
        return this.ImageData;
    }

    /**
     * 设置签名图片，base64编码
     * @param ImageData 签名图片，base64编码
     */
    public void setImageData(String ImageData) {
        this.ImageData = ImageData;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ContractResId", this.ContractResId);
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);
        this.setParamSimple(map, prefix + "AuthorizationTime", this.AuthorizationTime);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamArrayObj(map, prefix + "SignLocations.", this.SignLocations);
        this.setParamSimple(map, prefix + "SealResId", this.SealResId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "ImageData", this.ImageData);

    }
}

