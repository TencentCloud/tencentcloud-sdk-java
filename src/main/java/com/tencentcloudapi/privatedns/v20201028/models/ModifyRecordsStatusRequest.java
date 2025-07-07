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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordsStatusRequest extends AbstractModel {

    /**
    * 私有域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 解析记录ID列表
    */
    @SerializedName("RecordIds")
    @Expose
    private Long [] RecordIds;

    /**
    * enabled：生效，disabled：失效
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 私有域ID 
     * @return ZoneId 私有域ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域ID
     * @param ZoneId 私有域ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 解析记录ID列表 
     * @return RecordIds 解析记录ID列表
     */
    public Long [] getRecordIds() {
        return this.RecordIds;
    }

    /**
     * Set 解析记录ID列表
     * @param RecordIds 解析记录ID列表
     */
    public void setRecordIds(Long [] RecordIds) {
        this.RecordIds = RecordIds;
    }

    /**
     * Get enabled：生效，disabled：失效 
     * @return Status enabled：生效，disabled：失效
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set enabled：生效，disabled：失效
     * @param Status enabled：生效，disabled：失效
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyRecordsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordsStatusRequest(ModifyRecordsStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordIds != null) {
            this.RecordIds = new Long[source.RecordIds.length];
            for (int i = 0; i < source.RecordIds.length; i++) {
                this.RecordIds[i] = new Long(source.RecordIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RecordIds.", this.RecordIds);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

