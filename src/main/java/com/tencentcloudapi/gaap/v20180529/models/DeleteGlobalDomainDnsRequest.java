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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGlobalDomainDnsRequest extends AbstractModel {

    /**
    * 解析记录的ID
    */
    @SerializedName("DnsRecordId")
    @Expose
    private Long DnsRecordId;

    /**
     * Get 解析记录的ID 
     * @return DnsRecordId 解析记录的ID
     */
    public Long getDnsRecordId() {
        return this.DnsRecordId;
    }

    /**
     * Set 解析记录的ID
     * @param DnsRecordId 解析记录的ID
     */
    public void setDnsRecordId(Long DnsRecordId) {
        this.DnsRecordId = DnsRecordId;
    }

    public DeleteGlobalDomainDnsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGlobalDomainDnsRequest(DeleteGlobalDomainDnsRequest source) {
        if (source.DnsRecordId != null) {
            this.DnsRecordId = new Long(source.DnsRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsRecordId", this.DnsRecordId);

    }
}

