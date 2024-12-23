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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDnsRecordsRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 待删除的 DNS 记录 ID 列表，上限：1000。
    */
    @SerializedName("RecordIds")
    @Expose
    private String [] RecordIds;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 待删除的 DNS 记录 ID 列表，上限：1000。 
     * @return RecordIds 待删除的 DNS 记录 ID 列表，上限：1000。
     */
    public String [] getRecordIds() {
        return this.RecordIds;
    }

    /**
     * Set 待删除的 DNS 记录 ID 列表，上限：1000。
     * @param RecordIds 待删除的 DNS 记录 ID 列表，上限：1000。
     */
    public void setRecordIds(String [] RecordIds) {
        this.RecordIds = RecordIds;
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
        if (source.RecordIds != null) {
            this.RecordIds = new String[source.RecordIds.length];
            for (int i = 0; i < source.RecordIds.length; i++) {
                this.RecordIds[i] = new String(source.RecordIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RecordIds.", this.RecordIds);

    }
}

