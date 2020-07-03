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

public class ShopHourTrafficInfo extends AbstractModel{

    /**
    * 日期，格式yyyy-MM-dd
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 分时客流详细信息
    */
    @SerializedName("HourTrafficInfoDetailSet")
    @Expose
    private HourTrafficInfoDetail [] HourTrafficInfoDetailSet;

    /**
     * Get 日期，格式yyyy-MM-dd 
     * @return Date 日期，格式yyyy-MM-dd
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期，格式yyyy-MM-dd
     * @param Date 日期，格式yyyy-MM-dd
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 分时客流详细信息 
     * @return HourTrafficInfoDetailSet 分时客流详细信息
     */
    public HourTrafficInfoDetail [] getHourTrafficInfoDetailSet() {
        return this.HourTrafficInfoDetailSet;
    }

    /**
     * Set 分时客流详细信息
     * @param HourTrafficInfoDetailSet 分时客流详细信息
     */
    public void setHourTrafficInfoDetailSet(HourTrafficInfoDetail [] HourTrafficInfoDetailSet) {
        this.HourTrafficInfoDetailSet = HourTrafficInfoDetailSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArrayObj(map, prefix + "HourTrafficInfoDetailSet.", this.HourTrafficInfoDetailSet);

    }
}

