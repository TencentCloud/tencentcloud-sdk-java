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

public class DescribeCreateRecordListResultRequest extends AbstractModel {

    /**
    * 私有域ID数组
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 私有域解析记录数据
    */
    @SerializedName("RecordsInfo")
    @Expose
    private RecordsInfo [] RecordsInfo;

    /**
     * Get 私有域ID数组 
     * @return ZoneIds 私有域ID数组
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 私有域ID数组
     * @param ZoneIds 私有域ID数组
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 私有域解析记录数据 
     * @return RecordsInfo 私有域解析记录数据
     */
    public RecordsInfo [] getRecordsInfo() {
        return this.RecordsInfo;
    }

    /**
     * Set 私有域解析记录数据
     * @param RecordsInfo 私有域解析记录数据
     */
    public void setRecordsInfo(RecordsInfo [] RecordsInfo) {
        this.RecordsInfo = RecordsInfo;
    }

    public DescribeCreateRecordListResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCreateRecordListResultRequest(DescribeCreateRecordListResultRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.RecordsInfo != null) {
            this.RecordsInfo = new RecordsInfo[source.RecordsInfo.length];
            for (int i = 0; i < source.RecordsInfo.length; i++) {
                this.RecordsInfo[i] = new RecordsInfo(source.RecordsInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "RecordsInfo.", this.RecordsInfo);

    }
}

