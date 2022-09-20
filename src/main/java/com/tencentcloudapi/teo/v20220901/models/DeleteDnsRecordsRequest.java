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

public class DeleteDnsRecordsRequest extends AbstractModel{

    /**
    * 待删除记录所属站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 待删除记录 ID。
    */
    @SerializedName("DnsRecordIds")
    @Expose
    private String [] DnsRecordIds;

    /**
     * Get 待删除记录所属站点 ID。 
     * @return ZoneId 待删除记录所属站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 待删除记录所属站点 ID。
     * @param ZoneId 待删除记录所属站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 待删除记录 ID。 
     * @return DnsRecordIds 待删除记录 ID。
     */
    public String [] getDnsRecordIds() {
        return this.DnsRecordIds;
    }

    /**
     * Set 待删除记录 ID。
     * @param DnsRecordIds 待删除记录 ID。
     */
    public void setDnsRecordIds(String [] DnsRecordIds) {
        this.DnsRecordIds = DnsRecordIds;
    }

    public DeleteDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDnsRecordsRequest(DeleteDnsRecordsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DnsRecordIds != null) {
            this.DnsRecordIds = new String[source.DnsRecordIds.length];
            for (int i = 0; i < source.DnsRecordIds.length; i++) {
                this.DnsRecordIds[i] = new String(source.DnsRecordIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "DnsRecordIds.", this.DnsRecordIds);

    }
}

