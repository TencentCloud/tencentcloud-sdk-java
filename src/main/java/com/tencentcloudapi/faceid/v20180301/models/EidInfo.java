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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EidInfo extends AbstractModel{

    /**
    * 商户方 appeIDcode 的数字证书
    */
    @SerializedName("EidCode")
    @Expose
    private String EidCode;

    /**
    * Eid中心针对商户方EidCode的电子签名
    */
    @SerializedName("EidSign")
    @Expose
    private String EidSign;

    /**
    * 商户方公钥加密的会话密钥的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
    */
    @SerializedName("DesKey")
    @Expose
    private String DesKey;

    /**
    * 会话密钥sm2加密后的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
    */
    @SerializedName("UserInfo")
    @Expose
    private String UserInfo;

    /**
     * Get 商户方 appeIDcode 的数字证书 
     * @return EidCode 商户方 appeIDcode 的数字证书
     */
    public String getEidCode() {
        return this.EidCode;
    }

    /**
     * Set 商户方 appeIDcode 的数字证书
     * @param EidCode 商户方 appeIDcode 的数字证书
     */
    public void setEidCode(String EidCode) {
        this.EidCode = EidCode;
    }

    /**
     * Get Eid中心针对商户方EidCode的电子签名 
     * @return EidSign Eid中心针对商户方EidCode的电子签名
     */
    public String getEidSign() {
        return this.EidSign;
    }

    /**
     * Set Eid中心针对商户方EidCode的电子签名
     * @param EidSign Eid中心针对商户方EidCode的电子签名
     */
    public void setEidSign(String EidSign) {
        this.EidSign = EidSign;
    }

    /**
     * Get 商户方公钥加密的会话密钥的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370) 
     * @return DesKey 商户方公钥加密的会话密钥的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
     */
    public String getDesKey() {
        return this.DesKey;
    }

    /**
     * Set 商户方公钥加密的会话密钥的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
     * @param DesKey 商户方公钥加密的会话密钥的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
     */
    public void setDesKey(String DesKey) {
        this.DesKey = DesKey;
    }

    /**
     * Get 会话密钥sm2加密后的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370) 
     * @return UserInfo 会话密钥sm2加密后的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
     */
    public String getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 会话密钥sm2加密后的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
     * @param UserInfo 会话密钥sm2加密后的base64字符串，[指引详见](https://cloud.tencent.com/document/product/1007/63370)
     */
    public void setUserInfo(String UserInfo) {
        this.UserInfo = UserInfo;
    }

    public EidInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EidInfo(EidInfo source) {
        if (source.EidCode != null) {
            this.EidCode = new String(source.EidCode);
        }
        if (source.EidSign != null) {
            this.EidSign = new String(source.EidSign);
        }
        if (source.DesKey != null) {
            this.DesKey = new String(source.DesKey);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new String(source.UserInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EidCode", this.EidCode);
        this.setParamSimple(map, prefix + "EidSign", this.EidSign);
        this.setParamSimple(map, prefix + "DesKey", this.DesKey);
        this.setParamSimple(map, prefix + "UserInfo", this.UserInfo);

    }
}

