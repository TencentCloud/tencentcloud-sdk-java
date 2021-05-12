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
    * eID 中心针对商户方EidCode的电子签名
    */
    @SerializedName("EidSign")
    @Expose
    private String EidSign;

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
     * Get eID 中心针对商户方EidCode的电子签名 
     * @return EidSign eID 中心针对商户方EidCode的电子签名
     */
    public String getEidSign() {
        return this.EidSign;
    }

    /**
     * Set eID 中心针对商户方EidCode的电子签名
     * @param EidSign eID 中心针对商户方EidCode的电子签名
     */
    public void setEidSign(String EidSign) {
        this.EidSign = EidSign;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EidCode", this.EidCode);
        this.setParamSimple(map, prefix + "EidSign", this.EidSign);

    }
}

