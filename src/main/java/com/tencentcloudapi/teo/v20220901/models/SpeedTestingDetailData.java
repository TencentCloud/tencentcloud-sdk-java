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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingDetailData extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 地域性能数据。
    */
    @SerializedName("DistrictStatistics")
    @Expose
    private DistrictStatistics [] DistrictStatistics;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 地域性能数据。 
     * @return DistrictStatistics 地域性能数据。
     */
    public DistrictStatistics [] getDistrictStatistics() {
        return this.DistrictStatistics;
    }

    /**
     * Set 地域性能数据。
     * @param DistrictStatistics 地域性能数据。
     */
    public void setDistrictStatistics(DistrictStatistics [] DistrictStatistics) {
        this.DistrictStatistics = DistrictStatistics;
    }

    public SpeedTestingDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingDetailData(SpeedTestingDetailData source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.DistrictStatistics != null) {
            this.DistrictStatistics = new DistrictStatistics[source.DistrictStatistics.length];
            for (int i = 0; i < source.DistrictStatistics.length; i++) {
                this.DistrictStatistics[i] = new DistrictStatistics(source.DistrictStatistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamArrayObj(map, prefix + "DistrictStatistics.", this.DistrictStatistics);

    }
}

