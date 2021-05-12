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

public class MobileNetworkTimeVerificationRequest extends AbstractModel{

    /**
    * 手机号码
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 敏感数据加密信息。对传入信息（手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get 手机号码 
     * @return Mobile 手机号码
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号码
     * @param Mobile 手机号码
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 敏感数据加密信息。对传入信息（手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 敏感数据加密信息。对传入信息（手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。对传入信息（手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 敏感数据加密信息。对传入信息（手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public MobileNetworkTimeVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MobileNetworkTimeVerificationRequest(MobileNetworkTimeVerificationRequest source) {
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

