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

public class SignInfo extends AbstractModel{

    /**
    * 账户ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;

    /**
    * 授权时间（上传合同可不传该参数）
    */
    @SerializedName("AuthorizationTime")
    @Expose
    private String AuthorizationTime;

    /**
    * 授权IP地址（上传合同可不传该参数）
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 签章ID
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 签名图片，优先级比SealId高
    */
    @SerializedName("ImageData")
    @Expose
    private String ImageData;

    /**
    * 默认值：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 签名域的标签值
    */
    @SerializedName("SignLocation")
    @Expose
    private String SignLocation;

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
     * Get 授权时间（上传合同可不传该参数） 
     * @return AuthorizationTime 授权时间（上传合同可不传该参数）
     */
    public String getAuthorizationTime() {
        return this.AuthorizationTime;
    }

    /**
     * Set 授权时间（上传合同可不传该参数）
     * @param AuthorizationTime 授权时间（上传合同可不传该参数）
     */
    public void setAuthorizationTime(String AuthorizationTime) {
        this.AuthorizationTime = AuthorizationTime;
    }

    /**
     * Get 授权IP地址（上传合同可不传该参数） 
     * @return Location 授权IP地址（上传合同可不传该参数）
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 授权IP地址（上传合同可不传该参数）
     * @param Location 授权IP地址（上传合同可不传该参数）
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 签章ID 
     * @return SealId 签章ID
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 签章ID
     * @param SealId 签章ID
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 签名图片，优先级比SealId高 
     * @return ImageData 签名图片，优先级比SealId高
     */
    public String getImageData() {
        return this.ImageData;
    }

    /**
     * Set 签名图片，优先级比SealId高
     * @param ImageData 签名图片，优先级比SealId高
     */
    public void setImageData(String ImageData) {
        this.ImageData = ImageData;
    }

    /**
     * Get 默认值：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1 
     * @return CertType 默认值：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 默认值：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     * @param CertType 默认值：1  表示RSA证书， 2 表示国密证书， 参数不传时默认为1
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 签名域的标签值 
     * @return SignLocation 签名域的标签值
     */
    public String getSignLocation() {
        return this.SignLocation;
    }

    /**
     * Set 签名域的标签值
     * @param SignLocation 签名域的标签值
     */
    public void setSignLocation(String SignLocation) {
        this.SignLocation = SignLocation;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);
        this.setParamSimple(map, prefix + "AuthorizationTime", this.AuthorizationTime);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "ImageData", this.ImageData);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "SignLocation", this.SignLocation);

    }
}

