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

public class ApplyReWithdrawalRequest extends AbstractModel{

    /**
    * 聚鑫业务类型
    */
    @SerializedName("BusinessType")
    @Expose
    private Long BusinessType;

    /**
    * 由平台客服提供的计费密钥Id
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 计费签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 提现信息
    */
    @SerializedName("Body")
    @Expose
    private WithdrawBill Body;

    /**
    * 聚鑫业务ID
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

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
     * Get 聚鑫业务类型 
     * @return BusinessType 聚鑫业务类型
     */
    public Long getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 聚鑫业务类型
     * @param BusinessType 聚鑫业务类型
     */
    public void setBusinessType(Long BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 由平台客服提供的计费密钥Id 
     * @return MidasSecretId 由平台客服提供的计费密钥Id
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 由平台客服提供的计费密钥Id
     * @param MidasSecretId 由平台客服提供的计费密钥Id
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 计费签名 
     * @return MidasSignature 计费签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 计费签名
     * @param MidasSignature 计费签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 提现信息 
     * @return Body 提现信息
     */
    public WithdrawBill getBody() {
        return this.Body;
    }

    /**
     * Set 提现信息
     * @param Body 提现信息
     */
    public void setBody(WithdrawBill Body) {
        this.Body = Body;
    }

    /**
     * Get 聚鑫业务ID 
     * @return MidasAppId 聚鑫业务ID
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫业务ID
     * @param MidasAppId 聚鑫业务ID
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
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

    public ApplyReWithdrawalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyReWithdrawalRequest(ApplyReWithdrawalRequest source) {
        if (source.BusinessType != null) {
            this.BusinessType = new Long(source.BusinessType);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.Body != null) {
            this.Body = new WithdrawBill(source.Body);
        }
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamObj(map, prefix + "Body.", this.Body);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

