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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneTrafficInfo extends AbstractModel {

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 门店区域客流详细信息
    */
    @SerializedName("ZoneTrafficInfoDetailSet")
    @Expose
    private ZoneTrafficInfoDetail [] ZoneTrafficInfoDetailSet;

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
     * Get 门店区域客流详细信息 
     * @return ZoneTrafficInfoDetailSet 门店区域客流详细信息
     */
    public ZoneTrafficInfoDetail [] getZoneTrafficInfoDetailSet() {
        return this.ZoneTrafficInfoDetailSet;
    }

    /**
     * Set 门店区域客流详细信息
     * @param ZoneTrafficInfoDetailSet 门店区域客流详细信息
     */
    public void setZoneTrafficInfoDetailSet(ZoneTrafficInfoDetail [] ZoneTrafficInfoDetailSet) {
        this.ZoneTrafficInfoDetailSet = ZoneTrafficInfoDetailSet;
    }

    public ZoneTrafficInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneTrafficInfo(ZoneTrafficInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.ZoneTrafficInfoDetailSet != null) {
            this.ZoneTrafficInfoDetailSet = new ZoneTrafficInfoDetail[source.ZoneTrafficInfoDetailSet.length];
            for (int i = 0; i < source.ZoneTrafficInfoDetailSet.length; i++) {
                this.ZoneTrafficInfoDetailSet[i] = new ZoneTrafficInfoDetail(source.ZoneTrafficInfoDetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArrayObj(map, prefix + "ZoneTrafficInfoDetailSet.", this.ZoneTrafficInfoDetailSet);

    }
}

