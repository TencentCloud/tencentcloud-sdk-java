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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputCryptoManageMarketingRisk extends AbstractModel{

    /**
    * 是否授权
    */
    @SerializedName("IsAuthorized")
    @Expose
    private String IsAuthorized;

    /**
    * 加密类型
    */
    @SerializedName("CryptoType")
    @Expose
    private String CryptoType;

    /**
    * 加密内容
    */
    @SerializedName("CryptoContent")
    @Expose
    private String CryptoContent;

    /**
     * Get 是否授权 
     * @return IsAuthorized 是否授权
     */
    public String getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 是否授权
     * @param IsAuthorized 是否授权
     */
    public void setIsAuthorized(String IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get 加密类型 
     * @return CryptoType 加密类型
     */
    public String getCryptoType() {
        return this.CryptoType;
    }

    /**
     * Set 加密类型
     * @param CryptoType 加密类型
     */
    public void setCryptoType(String CryptoType) {
        this.CryptoType = CryptoType;
    }

    /**
     * Get 加密内容 
     * @return CryptoContent 加密内容
     */
    public String getCryptoContent() {
        return this.CryptoContent;
    }

    /**
     * Set 加密内容
     * @param CryptoContent 加密内容
     */
    public void setCryptoContent(String CryptoContent) {
        this.CryptoContent = CryptoContent;
    }

    public InputCryptoManageMarketingRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputCryptoManageMarketingRisk(InputCryptoManageMarketingRisk source) {
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new String(source.IsAuthorized);
        }
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
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "CryptoType", this.CryptoType);
        this.setParamSimple(map, prefix + "CryptoContent", this.CryptoContent);

    }
}

