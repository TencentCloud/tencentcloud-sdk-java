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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceDataTotalStatsRes extends AbstractModel {

    /**
    * 总楼栋数量
    */
    @SerializedName("BuildingCount")
    @Expose
    private Long BuildingCount;

    /**
    * 总建筑面积
    */
    @SerializedName("BuildingArea")
    @Expose
    private Float BuildingArea;

    /**
     * Get 总楼栋数量 
     * @return BuildingCount 总楼栋数量
     */
    public Long getBuildingCount() {
        return this.BuildingCount;
    }

    /**
     * Set 总楼栋数量
     * @param BuildingCount 总楼栋数量
     */
    public void setBuildingCount(Long BuildingCount) {
        this.BuildingCount = BuildingCount;
    }

    /**
     * Get 总建筑面积 
     * @return BuildingArea 总建筑面积
     */
    public Float getBuildingArea() {
        return this.BuildingArea;
    }

    /**
     * Set 总建筑面积
     * @param BuildingArea 总建筑面积
     */
    public void setBuildingArea(Float BuildingArea) {
        this.BuildingArea = BuildingArea;
    }

    public SpaceDataTotalStatsRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceDataTotalStatsRes(SpaceDataTotalStatsRes source) {
        if (source.BuildingCount != null) {
            this.BuildingCount = new Long(source.BuildingCount);
        }
        if (source.BuildingArea != null) {
            this.BuildingArea = new Float(source.BuildingArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildingCount", this.BuildingCount);
        this.setParamSimple(map, prefix + "BuildingArea", this.BuildingArea);

    }
}

