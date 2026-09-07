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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceRestriction extends AbstractModel {

    /**
    * <p>下发访问限制的原因。</p><p>枚举值：</p><ul><li>ICP_RECORD_REQUIRED： 未备案；</li><li>GOVERNMENT_ORDER： 政府指令。</li></ul>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>限制访问地区的具体国家/地区码，使用“ISO 3166 国家/地区代码标准”。</p><p>参数格式：查看链接：https://www.iso.org/iso-3166-country-codes.html。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get <p>下发访问限制的原因。</p><p>枚举值：</p><ul><li>ICP_RECORD_REQUIRED： 未备案；</li><li>GOVERNMENT_ORDER： 政府指令。</li></ul> 
     * @return Reason <p>下发访问限制的原因。</p><p>枚举值：</p><ul><li>ICP_RECORD_REQUIRED： 未备案；</li><li>GOVERNMENT_ORDER： 政府指令。</li></ul>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>下发访问限制的原因。</p><p>枚举值：</p><ul><li>ICP_RECORD_REQUIRED： 未备案；</li><li>GOVERNMENT_ORDER： 政府指令。</li></ul>
     * @param Reason <p>下发访问限制的原因。</p><p>枚举值：</p><ul><li>ICP_RECORD_REQUIRED： 未备案；</li><li>GOVERNMENT_ORDER： 政府指令。</li></ul>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>限制访问地区的具体国家/地区码，使用“ISO 3166 国家/地区代码标准”。</p><p>参数格式：查看链接：https://www.iso.org/iso-3166-country-codes.html。</p> 
     * @return Region <p>限制访问地区的具体国家/地区码，使用“ISO 3166 国家/地区代码标准”。</p><p>参数格式：查看链接：https://www.iso.org/iso-3166-country-codes.html。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>限制访问地区的具体国家/地区码，使用“ISO 3166 国家/地区代码标准”。</p><p>参数格式：查看链接：https://www.iso.org/iso-3166-country-codes.html。</p>
     * @param Region <p>限制访问地区的具体国家/地区码，使用“ISO 3166 国家/地区代码标准”。</p><p>参数格式：查看链接：https://www.iso.org/iso-3166-country-codes.html。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ComplianceRestriction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceRestriction(ComplianceRestriction source) {
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

