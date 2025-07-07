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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubdomainValidateStatusRequest extends AbstractModel {

    /**
    * 要查看 TXT 记录校验状态的子域名 Zone 域。
    */
    @SerializedName("DomainZone")
    @Expose
    private String DomainZone;

    /**
     * Get 要查看 TXT 记录校验状态的子域名 Zone 域。 
     * @return DomainZone 要查看 TXT 记录校验状态的子域名 Zone 域。
     */
    public String getDomainZone() {
        return this.DomainZone;
    }

    /**
     * Set 要查看 TXT 记录校验状态的子域名 Zone 域。
     * @param DomainZone 要查看 TXT 记录校验状态的子域名 Zone 域。
     */
    public void setDomainZone(String DomainZone) {
        this.DomainZone = DomainZone;
    }

    public DescribeSubdomainValidateStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubdomainValidateStatusRequest(DescribeSubdomainValidateStatusRequest source) {
        if (source.DomainZone != null) {
            this.DomainZone = new String(source.DomainZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainZone", this.DomainZone);

    }
}

