/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryEnterpriseBasicInfoRequest extends AbstractModel {

    /**
    * <p>统一社会信用代码。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
    */
    @SerializedName("CreditCode")
    @Expose
    private String CreditCode;

    /**
    * <p>企业名称。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
    */
    @SerializedName("EntName")
    @Expose
    private String EntName;

    /**
     * Get <p>统一社会信用代码。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p> 
     * @return CreditCode <p>统一社会信用代码。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
     */
    public String getCreditCode() {
        return this.CreditCode;
    }

    /**
     * Set <p>统一社会信用代码。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
     * @param CreditCode <p>统一社会信用代码。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
     */
    public void setCreditCode(String CreditCode) {
        this.CreditCode = CreditCode;
    }

    /**
     * Get <p>企业名称。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p> 
     * @return EntName <p>企业名称。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
     */
    public String getEntName() {
        return this.EntName;
    }

    /**
     * Set <p>企业名称。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
     * @param EntName <p>企业名称。CreditCode、EntName 必须提供一个，如果都提供，只使用 CreditCode。</p>
     */
    public void setEntName(String EntName) {
        this.EntName = EntName;
    }

    public QueryEnterpriseBasicInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryEnterpriseBasicInfoRequest(QueryEnterpriseBasicInfoRequest source) {
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.EntName != null) {
            this.EntName = new String(source.EntName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "EntName", this.EntName);

    }
}

