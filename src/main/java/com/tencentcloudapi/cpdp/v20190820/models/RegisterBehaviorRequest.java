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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterBehaviorRequest extends AbstractModel{

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 功能标志
1：登记行为记录信息
2：查询补录信息
    */
    @SerializedName("FunctionFlag")
    @Expose
    private Long FunctionFlag;

    /**
    * 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 操作点击时间
yyyyMMddHHmmss
功能标志FunctionFlag=1时必输
    */
    @SerializedName("OperationClickTime")
    @Expose
    private String OperationClickTime;

    /**
    * IP地址
功能标志FunctionFlag=1时必输
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * MAC地址
功能标志FunctionFlag=1时必输
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 签约渠道
1:  App
2:  平台H5网页
3：公众号
4：小程序
功能标志FunctionFlag=1时必输
    */
    @SerializedName("SignChannel")
    @Expose
    private Long SignChannel;

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 聚鑫计费SubAppId，代表子商户 
     * @return SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 聚鑫计费SubAppId，代表子商户
     * @param SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 聚鑫分配的安全ID 
     * @return MidasSecretId 聚鑫分配的安全ID
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的安全ID
     * @param MidasSecretId 聚鑫分配的安全ID
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 按照聚鑫安全密钥计算的签名 
     * @return MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 按照聚鑫安全密钥计算的签名
     * @param MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 功能标志
1：登记行为记录信息
2：查询补录信息 
     * @return FunctionFlag 功能标志
1：登记行为记录信息
2：查询补录信息
     */
    public Long getFunctionFlag() {
        return this.FunctionFlag;
    }

    /**
     * Set 功能标志
1：登记行为记录信息
2：查询补录信息
     * @param FunctionFlag 功能标志
1：登记行为记录信息
2：查询补录信息
     */
    public void setFunctionFlag(Long FunctionFlag) {
        this.FunctionFlag = FunctionFlag;
    }

    /**
     * Get 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release 
     * @return MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     * @param MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get 操作点击时间
yyyyMMddHHmmss
功能标志FunctionFlag=1时必输 
     * @return OperationClickTime 操作点击时间
yyyyMMddHHmmss
功能标志FunctionFlag=1时必输
     */
    public String getOperationClickTime() {
        return this.OperationClickTime;
    }

    /**
     * Set 操作点击时间
yyyyMMddHHmmss
功能标志FunctionFlag=1时必输
     * @param OperationClickTime 操作点击时间
yyyyMMddHHmmss
功能标志FunctionFlag=1时必输
     */
    public void setOperationClickTime(String OperationClickTime) {
        this.OperationClickTime = OperationClickTime;
    }

    /**
     * Get IP地址
功能标志FunctionFlag=1时必输 
     * @return IpAddress IP地址
功能标志FunctionFlag=1时必输
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set IP地址
功能标志FunctionFlag=1时必输
     * @param IpAddress IP地址
功能标志FunctionFlag=1时必输
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get MAC地址
功能标志FunctionFlag=1时必输 
     * @return MacAddress MAC地址
功能标志FunctionFlag=1时必输
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC地址
功能标志FunctionFlag=1时必输
     * @param MacAddress MAC地址
功能标志FunctionFlag=1时必输
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get 签约渠道
1:  App
2:  平台H5网页
3：公众号
4：小程序
功能标志FunctionFlag=1时必输 
     * @return SignChannel 签约渠道
1:  App
2:  平台H5网页
3：公众号
4：小程序
功能标志FunctionFlag=1时必输
     */
    public Long getSignChannel() {
        return this.SignChannel;
    }

    /**
     * Set 签约渠道
1:  App
2:  平台H5网页
3：公众号
4：小程序
功能标志FunctionFlag=1时必输
     * @param SignChannel 签约渠道
1:  App
2:  平台H5网页
3：公众号
4：小程序
功能标志FunctionFlag=1时必输
     */
    public void setSignChannel(Long SignChannel) {
        this.SignChannel = SignChannel;
    }

    public RegisterBehaviorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterBehaviorRequest(RegisterBehaviorRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.FunctionFlag != null) {
            this.FunctionFlag = new Long(source.FunctionFlag);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.OperationClickTime != null) {
            this.OperationClickTime = new String(source.OperationClickTime);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.SignChannel != null) {
            this.SignChannel = new Long(source.SignChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "FunctionFlag", this.FunctionFlag);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "OperationClickTime", this.OperationClickTime);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "SignChannel", this.SignChannel);

    }
}

