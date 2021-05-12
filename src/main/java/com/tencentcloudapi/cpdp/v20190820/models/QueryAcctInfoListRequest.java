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

public class QueryAcctInfoListRequest extends AbstractModel{

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 查询开始时间(以开户时间为准)
    */
    @SerializedName("QueryAcctBeginTime")
    @Expose
    private String QueryAcctBeginTime;

    /**
    * 查询结束时间(以开户时间为准)
    */
    @SerializedName("QueryAcctEndTime")
    @Expose
    private String QueryAcctEndTime;

    /**
    * 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
    */
    @SerializedName("PageOffset")
    @Expose
    private String PageOffset;

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
    * 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

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
     * Get 查询开始时间(以开户时间为准) 
     * @return QueryAcctBeginTime 查询开始时间(以开户时间为准)
     */
    public String getQueryAcctBeginTime() {
        return this.QueryAcctBeginTime;
    }

    /**
     * Set 查询开始时间(以开户时间为准)
     * @param QueryAcctBeginTime 查询开始时间(以开户时间为准)
     */
    public void setQueryAcctBeginTime(String QueryAcctBeginTime) {
        this.QueryAcctBeginTime = QueryAcctBeginTime;
    }

    /**
     * Get 查询结束时间(以开户时间为准) 
     * @return QueryAcctEndTime 查询结束时间(以开户时间为准)
     */
    public String getQueryAcctEndTime() {
        return this.QueryAcctEndTime;
    }

    /**
     * Set 查询结束时间(以开户时间为准)
     * @param QueryAcctEndTime 查询结束时间(以开户时间为准)
     */
    public void setQueryAcctEndTime(String QueryAcctEndTime) {
        this.QueryAcctEndTime = QueryAcctEndTime;
    }

    /**
     * Get 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后 
     * @return PageOffset 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
     */
    public String getPageOffset() {
        return this.PageOffset;
    }

    /**
     * Set 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
     * @param PageOffset 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
     */
    public void setPageOffset(String PageOffset) {
        this.PageOffset = PageOffset;
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
     * Get 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA 
     * @return EncryptType 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
     * @param EncryptType 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
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

    public QueryAcctInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAcctInfoListRequest(QueryAcctInfoListRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.QueryAcctBeginTime != null) {
            this.QueryAcctBeginTime = new String(source.QueryAcctBeginTime);
        }
        if (source.QueryAcctEndTime != null) {
            this.QueryAcctEndTime = new String(source.QueryAcctEndTime);
        }
        if (source.PageOffset != null) {
            this.PageOffset = new String(source.PageOffset);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "QueryAcctBeginTime", this.QueryAcctBeginTime);
        this.setParamSimple(map, prefix + "QueryAcctEndTime", this.QueryAcctEndTime);
        this.setParamSimple(map, prefix + "PageOffset", this.PageOffset);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

