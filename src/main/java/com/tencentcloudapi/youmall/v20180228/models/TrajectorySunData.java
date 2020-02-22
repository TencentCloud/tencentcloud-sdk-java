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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrajectorySunData extends AbstractModel{

    /**
    * 区域动线，形如 x-x-x-x-x，其中 x 为区域 ID
    */
    @SerializedName("Zones")
    @Expose
    private String Zones;

    /**
    * 该动线出现次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 该动线平均停留时间（秒）
    */
    @SerializedName("AvgStayTime")
    @Expose
    private Long AvgStayTime;

    /**
     * Get 区域动线，形如 x-x-x-x-x，其中 x 为区域 ID 
     * @return Zones 区域动线，形如 x-x-x-x-x，其中 x 为区域 ID
     */
    public String getZones() {
        return this.Zones;
    }

    /**
     * Set 区域动线，形如 x-x-x-x-x，其中 x 为区域 ID
     * @param Zones 区域动线，形如 x-x-x-x-x，其中 x 为区域 ID
     */
    public void setZones(String Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 该动线出现次数 
     * @return Count 该动线出现次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该动线出现次数
     * @param Count 该动线出现次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 该动线平均停留时间（秒） 
     * @return AvgStayTime 该动线平均停留时间（秒）
     */
    public Long getAvgStayTime() {
        return this.AvgStayTime;
    }

    /**
     * Set 该动线平均停留时间（秒）
     * @param AvgStayTime 该动线平均停留时间（秒）
     */
    public void setAvgStayTime(Long AvgStayTime) {
        this.AvgStayTime = AvgStayTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zones", this.Zones);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AvgStayTime", this.AvgStayTime);

    }
}

