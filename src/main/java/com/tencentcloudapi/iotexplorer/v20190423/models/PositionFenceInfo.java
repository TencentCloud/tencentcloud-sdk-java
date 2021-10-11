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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PositionFenceInfo extends AbstractModel{

    /**
    * 围栏信息
    */
    @SerializedName("GeoFence")
    @Expose
    private PositionFenceItem GeoFence;

    /**
    * 围栏创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 围栏更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 围栏信息 
     * @return GeoFence 围栏信息
     */
    public PositionFenceItem getGeoFence() {
        return this.GeoFence;
    }

    /**
     * Set 围栏信息
     * @param GeoFence 围栏信息
     */
    public void setGeoFence(PositionFenceItem GeoFence) {
        this.GeoFence = GeoFence;
    }

    /**
     * Get 围栏创建时间 
     * @return CreateTime 围栏创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 围栏创建时间
     * @param CreateTime 围栏创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 围栏更新时间 
     * @return UpdateTime 围栏更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 围栏更新时间
     * @param UpdateTime 围栏更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public PositionFenceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PositionFenceInfo(PositionFenceInfo source) {
        if (source.GeoFence != null) {
            this.GeoFence = new PositionFenceItem(source.GeoFence);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "GeoFence.", this.GeoFence);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

