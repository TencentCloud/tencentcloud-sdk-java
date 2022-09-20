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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnsRecordsResponse extends AbstractModel{

    /**
    * DNS记录总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * DNS 记录列表。
    */
    @SerializedName("DnsRecords")
    @Expose
    private DnsRecord [] DnsRecords;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DNS记录总数。 
     * @return TotalCount DNS记录总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set DNS记录总数。
     * @param TotalCount DNS记录总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get DNS 记录列表。 
     * @return DnsRecords DNS 记录列表。
     */
    public DnsRecord [] getDnsRecords() {
        return this.DnsRecords;
    }

    /**
     * Set DNS 记录列表。
     * @param DnsRecords DNS 记录列表。
     */
    public void setDnsRecords(DnsRecord [] DnsRecords) {
        this.DnsRecords = DnsRecords;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDnsRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnsRecordsResponse(DescribeDnsRecordsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DnsRecords != null) {
            this.DnsRecords = new DnsRecord[source.DnsRecords.length];
            for (int i = 0; i < source.DnsRecords.length; i++) {
                this.DnsRecords[i] = new DnsRecord(source.DnsRecords[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DnsRecords.", this.DnsRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

