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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrivateZoneRecordRequest extends AbstractModel{

    /**
    * 私有域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 记录ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 记录ID数组，RecordId 优先
    */
    @SerializedName("RecordIdSet")
    @Expose
    private String [] RecordIdSet;

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
     * Get 记录ID 
     * @return RecordId 记录ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录ID
     * @param RecordId 记录ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 记录ID数组，RecordId 优先 
     * @return RecordIdSet 记录ID数组，RecordId 优先
     */
    public String [] getRecordIdSet() {
        return this.RecordIdSet;
    }

    /**
     * Set 记录ID数组，RecordId 优先
     * @param RecordIdSet 记录ID数组，RecordId 优先
     */
    public void setRecordIdSet(String [] RecordIdSet) {
        this.RecordIdSet = RecordIdSet;
    }

    public DeletePrivateZoneRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrivateZoneRecordRequest(DeletePrivateZoneRecordRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RecordIdSet != null) {
            this.RecordIdSet = new String[source.RecordIdSet.length];
            for (int i = 0; i < source.RecordIdSet.length; i++) {
                this.RecordIdSet[i] = new String(source.RecordIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamArraySimple(map, prefix + "RecordIdSet.", this.RecordIdSet);

    }
}

