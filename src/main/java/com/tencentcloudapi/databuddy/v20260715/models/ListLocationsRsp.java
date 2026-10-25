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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLocationsRsp extends AbstractModel {

    /**
    * 存储位置详情列表
    */
    @SerializedName("Locations")
    @Expose
    private LocationInfo [] Locations;

    /**
    * 结果总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 快照ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
     * Get 存储位置详情列表 
     * @return Locations 存储位置详情列表
     */
    public LocationInfo [] getLocations() {
        return this.Locations;
    }

    /**
     * Set 存储位置详情列表
     * @param Locations 存储位置详情列表
     */
    public void setLocations(LocationInfo [] Locations) {
        this.Locations = Locations;
    }

    /**
     * Get 结果总条数 
     * @return TotalCount 结果总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 结果总条数
     * @param TotalCount 结果总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 快照ID 
     * @return SnapshotId 快照ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID
     * @param SnapshotId 快照ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    public ListLocationsRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLocationsRsp(ListLocationsRsp source) {
        if (source.Locations != null) {
            this.Locations = new LocationInfo[source.Locations.length];
            for (int i = 0; i < source.Locations.length; i++) {
                this.Locations[i] = new LocationInfo(source.Locations[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Locations.", this.Locations);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);

    }
}

