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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetDomainAutoRenewRequest extends AbstractModel{

    /**
    * 域名ID。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * AutoRenew 有三个可选值：
 0：不设置自动续费
1：设置自动续费
2：设置到期后不续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
     * Get 域名ID。 
     * @return DomainId 域名ID。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID。
     * @param DomainId 域名ID。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get AutoRenew 有三个可选值：
 0：不设置自动续费
1：设置自动续费
2：设置到期后不续费 
     * @return AutoRenew AutoRenew 有三个可选值：
 0：不设置自动续费
1：设置自动续费
2：设置到期后不续费
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set AutoRenew 有三个可选值：
 0：不设置自动续费
1：设置自动续费
2：设置到期后不续费
     * @param AutoRenew AutoRenew 有三个可选值：
 0：不设置自动续费
1：设置自动续费
2：设置到期后不续费
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    public SetDomainAutoRenewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetDomainAutoRenewRequest(SetDomainAutoRenewRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);

    }
}

