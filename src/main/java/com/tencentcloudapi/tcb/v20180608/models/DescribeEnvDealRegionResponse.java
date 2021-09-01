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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvDealRegionResponse extends AbstractModel{

    /**
    * 下单region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 下单zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 下单regionId
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 下单zoneId
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下单region 
     * @return Region 下单region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 下单region
     * @param Region 下单region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 下单zone 
     * @return Zone 下单zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 下单zone
     * @param Zone 下单zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 下单regionId 
     * @return RegionId 下单regionId
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 下单regionId
     * @param RegionId 下单regionId
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 下单zoneId 
     * @return ZoneId 下单zoneId
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 下单zoneId
     * @param ZoneId 下单zoneId
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEnvDealRegionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvDealRegionResponse(DescribeEnvDealRegionResponse source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

