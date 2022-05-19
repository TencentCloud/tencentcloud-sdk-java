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

public class GetPayRollAuthResultRequest extends AbstractModel{

    /**
    * 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
    */
    @SerializedName("AuthNumber")
    @Expose
    private String AuthNumber;

    /**
    * 微信服务商下特约商户的商户号，由微信支付生成并下发
    */
    @SerializedName("SubMerchantId")
    @Expose
    private String SubMerchantId;

    /**
     * Get 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一 
     * @return AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public String getAuthNumber() {
        return this.AuthNumber;
    }

    /**
     * Set 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     * @param AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public void setAuthNumber(String AuthNumber) {
        this.AuthNumber = AuthNumber;
    }

    /**
     * Get 微信服务商下特约商户的商户号，由微信支付生成并下发 
     * @return SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public String getSubMerchantId() {
        return this.SubMerchantId;
    }

    /**
     * Set 微信服务商下特约商户的商户号，由微信支付生成并下发
     * @param SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public void setSubMerchantId(String SubMerchantId) {
        this.SubMerchantId = SubMerchantId;
    }

    public GetPayRollAuthResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPayRollAuthResultRequest(GetPayRollAuthResultRequest source) {
        if (source.AuthNumber != null) {
            this.AuthNumber = new String(source.AuthNumber);
        }
        if (source.SubMerchantId != null) {
            this.SubMerchantId = new String(source.SubMerchantId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthNumber", this.AuthNumber);
        this.setParamSimple(map, prefix + "SubMerchantId", this.SubMerchantId);

    }
}

