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

public class ModifyDnsRecordsRequest extends AbstractModel {

    /**
    * 站点 ID 。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DNS 记录修改数据列表，一次最多修改100条。
    */
    @SerializedName("DnsRecords")
    @Expose
    private DnsRecord [] DnsRecords;

    /**
     * Get 站点 ID 。 
     * @return ZoneId 站点 ID 。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID 。
     * @param ZoneId 站点 ID 。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get DNS 记录修改数据列表，一次最多修改100条。 
     * @return DnsRecords DNS 记录修改数据列表，一次最多修改100条。
     */
    public DnsRecord [] getDnsRecords() {
        return this.DnsRecords;
    }

    /**
     * Set DNS 记录修改数据列表，一次最多修改100条。
     * @param DnsRecords DNS 记录修改数据列表，一次最多修改100条。
     */
    public void setDnsRecords(DnsRecord [] DnsRecords) {
        this.DnsRecords = DnsRecords;
    }

    public ModifyDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDnsRecordsRequest(ModifyDnsRecordsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DnsRecords != null) {
            this.DnsRecords = new DnsRecord[source.DnsRecords.length];
            for (int i = 0; i < source.DnsRecords.length; i++) {
                this.DnsRecords[i] = new DnsRecord(source.DnsRecords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "DnsRecords.", this.DnsRecords);

    }
}

