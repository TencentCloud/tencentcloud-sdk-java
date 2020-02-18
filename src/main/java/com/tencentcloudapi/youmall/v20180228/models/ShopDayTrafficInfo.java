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

public class ShopDayTrafficInfo extends AbstractModel{

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 客流量
    */
    @SerializedName("DayTrafficTotalCount")
    @Expose
    private Long DayTrafficTotalCount;

    /**
    * 性别年龄分组下的客流信息
    */
    @SerializedName("GenderAgeTrafficDetailSet")
    @Expose
    private GenderAgeTrafficDetail [] GenderAgeTrafficDetailSet;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 客流量 
     * @return DayTrafficTotalCount 客流量
     */
    public Long getDayTrafficTotalCount() {
        return this.DayTrafficTotalCount;
    }

    /**
     * Set 客流量
     * @param DayTrafficTotalCount 客流量
     */
    public void setDayTrafficTotalCount(Long DayTrafficTotalCount) {
        this.DayTrafficTotalCount = DayTrafficTotalCount;
    }

    /**
     * Get 性别年龄分组下的客流信息 
     * @return GenderAgeTrafficDetailSet 性别年龄分组下的客流信息
     */
    public GenderAgeTrafficDetail [] getGenderAgeTrafficDetailSet() {
        return this.GenderAgeTrafficDetailSet;
    }

    /**
     * Set 性别年龄分组下的客流信息
     * @param GenderAgeTrafficDetailSet 性别年龄分组下的客流信息
     */
    public void setGenderAgeTrafficDetailSet(GenderAgeTrafficDetail [] GenderAgeTrafficDetailSet) {
        this.GenderAgeTrafficDetailSet = GenderAgeTrafficDetailSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "DayTrafficTotalCount", this.DayTrafficTotalCount);
        this.setParamArrayObj(map, prefix + "GenderAgeTrafficDetailSet.", this.GenderAgeTrafficDetailSet);

    }
}

