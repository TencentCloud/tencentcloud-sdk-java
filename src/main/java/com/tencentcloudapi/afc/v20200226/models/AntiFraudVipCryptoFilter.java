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
package com.tencentcloudapi.afc.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AntiFraudVipCryptoFilter extends AbstractModel{

    /**
    * 约定用入参，默认不涉及默认BusinessSecurityData 与BusinessCrptoData 不传
    */
    @SerializedName("CryptoType")
    @Expose
    private String CryptoType;

    /**
    * 约定用入参，默认不涉及
    */
    @SerializedName("CryptoContent")
    @Expose
    private String CryptoContent;

    /**
     * Get 约定用入参，默认不涉及默认BusinessSecurityData 与BusinessCrptoData 不传 
     * @return CryptoType 约定用入参，默认不涉及默认BusinessSecurityData 与BusinessCrptoData 不传
     */
    public String getCryptoType() {
        return this.CryptoType;
    }

    /**
     * Set 约定用入参，默认不涉及默认BusinessSecurityData 与BusinessCrptoData 不传
     * @param CryptoType 约定用入参，默认不涉及默认BusinessSecurityData 与BusinessCrptoData 不传
     */
    public void setCryptoType(String CryptoType) {
        this.CryptoType = CryptoType;
    }

    /**
     * Get 约定用入参，默认不涉及 
     * @return CryptoContent 约定用入参，默认不涉及
     */
    public String getCryptoContent() {
        return this.CryptoContent;
    }

    /**
     * Set 约定用入参，默认不涉及
     * @param CryptoContent 约定用入参，默认不涉及
     */
    public void setCryptoContent(String CryptoContent) {
        this.CryptoContent = CryptoContent;
    }

    public AntiFraudVipCryptoFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AntiFraudVipCryptoFilter(AntiFraudVipCryptoFilter source) {
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

