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
package com.tencentcloudapi.af.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FinanceAntiFraudCryptoFilter extends AbstractModel{

    /**
    * 值1定义：AES加密方式[加密模式ECB；填充格式pkcs7padding；秘钥16字节即128位
    */
    @SerializedName("CryptoType")
    @Expose
    private String CryptoType;

    /**
    * 业务字段BusinessSecurityData的json数据格式，采用CryptoType相应的加密方式计算后得到的bash64编码内容。比如对{"PhoneNumber":"13430420001","IdNumber":"420115199501010001","BankCardNumber":"6214000100010001"}包体做加密。
    */
    @SerializedName("CryptoContent")
    @Expose
    private String CryptoContent;

    /**
     * Get 值1定义：AES加密方式[加密模式ECB；填充格式pkcs7padding；秘钥16字节即128位 
     * @return CryptoType 值1定义：AES加密方式[加密模式ECB；填充格式pkcs7padding；秘钥16字节即128位
     */
    public String getCryptoType() {
        return this.CryptoType;
    }

    /**
     * Set 值1定义：AES加密方式[加密模式ECB；填充格式pkcs7padding；秘钥16字节即128位
     * @param CryptoType 值1定义：AES加密方式[加密模式ECB；填充格式pkcs7padding；秘钥16字节即128位
     */
    public void setCryptoType(String CryptoType) {
        this.CryptoType = CryptoType;
    }

    /**
     * Get 业务字段BusinessSecurityData的json数据格式，采用CryptoType相应的加密方式计算后得到的bash64编码内容。比如对{"PhoneNumber":"13430420001","IdNumber":"420115199501010001","BankCardNumber":"6214000100010001"}包体做加密。 
     * @return CryptoContent 业务字段BusinessSecurityData的json数据格式，采用CryptoType相应的加密方式计算后得到的bash64编码内容。比如对{"PhoneNumber":"13430420001","IdNumber":"420115199501010001","BankCardNumber":"6214000100010001"}包体做加密。
     */
    public String getCryptoContent() {
        return this.CryptoContent;
    }

    /**
     * Set 业务字段BusinessSecurityData的json数据格式，采用CryptoType相应的加密方式计算后得到的bash64编码内容。比如对{"PhoneNumber":"13430420001","IdNumber":"420115199501010001","BankCardNumber":"6214000100010001"}包体做加密。
     * @param CryptoContent 业务字段BusinessSecurityData的json数据格式，采用CryptoType相应的加密方式计算后得到的bash64编码内容。比如对{"PhoneNumber":"13430420001","IdNumber":"420115199501010001","BankCardNumber":"6214000100010001"}包体做加密。
     */
    public void setCryptoContent(String CryptoContent) {
        this.CryptoContent = CryptoContent;
    }

    public FinanceAntiFraudCryptoFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinanceAntiFraudCryptoFilter(FinanceAntiFraudCryptoFilter source) {
        if (source.CryptoType != null) {
            this.CryptoType = new String(source.CryptoType);
        }
        if (source.CryptoContent != null) {
            this.CryptoContent = new String(source.CryptoContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CryptoType", this.CryptoType);
        this.setParamSimple(map, prefix + "CryptoContent", this.CryptoContent);

    }
}

