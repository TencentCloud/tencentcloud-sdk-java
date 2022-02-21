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

public class QueryOpenBankExternalSubMerchantRegistrationRequest extends AbstractModel{

    /**
    * 渠道商户号。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道进件号，与外部进件号二者选填其一。
    */
    @SerializedName("ChannelRegistrationNo")
    @Expose
    private String ChannelRegistrationNo;

    /**
    * 外部进件号，与渠道进件号二者选填其一。
    */
    @SerializedName("OutRegistrationNo")
    @Expose
    private String OutRegistrationNo;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户号。 
     * @return ChannelMerchantId 渠道商户号。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号。
     * @param ChannelMerchantId 渠道商户号。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道进件号，与外部进件号二者选填其一。 
     * @return ChannelRegistrationNo 渠道进件号，与外部进件号二者选填其一。
     */
    public String getChannelRegistrationNo() {
        return this.ChannelRegistrationNo;
    }

    /**
     * Set 渠道进件号，与外部进件号二者选填其一。
     * @param ChannelRegistrationNo 渠道进件号，与外部进件号二者选填其一。
     */
    public void setChannelRegistrationNo(String ChannelRegistrationNo) {
        this.ChannelRegistrationNo = ChannelRegistrationNo;
    }

    /**
     * Get 外部进件号，与渠道进件号二者选填其一。 
     * @return OutRegistrationNo 外部进件号，与渠道进件号二者选填其一。
     */
    public String getOutRegistrationNo() {
        return this.OutRegistrationNo;
    }

    /**
     * Set 外部进件号，与渠道进件号二者选填其一。
     * @param OutRegistrationNo 外部进件号，与渠道进件号二者选填其一。
     */
    public void setOutRegistrationNo(String OutRegistrationNo) {
        this.OutRegistrationNo = OutRegistrationNo;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryOpenBankExternalSubMerchantRegistrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankExternalSubMerchantRegistrationRequest(QueryOpenBankExternalSubMerchantRegistrationRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelRegistrationNo != null) {
            this.ChannelRegistrationNo = new String(source.ChannelRegistrationNo);
        }
        if (source.OutRegistrationNo != null) {
            this.OutRegistrationNo = new String(source.OutRegistrationNo);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelRegistrationNo", this.ChannelRegistrationNo);
        this.setParamSimple(map, prefix + "OutRegistrationNo", this.OutRegistrationNo);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

