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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserAvailableCloudDedicatedZonesResponse extends AbstractModel {

    /**
    * 返回当前用户可使用的专属可用区 ID 
    */
    @SerializedName("ZoneIdSet")
    @Expose
    private String [] ZoneIdSet;

    /**
    * 专属可用区列表信息。
    */
    @SerializedName("ZoneSet")
    @Expose
    private CloudDedicatedZone [] ZoneSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回当前用户可使用的专属可用区 ID  
     * @return ZoneIdSet 返回当前用户可使用的专属可用区 ID 
     */
    public String [] getZoneIdSet() {
        return this.ZoneIdSet;
    }

    /**
     * Set 返回当前用户可使用的专属可用区 ID 
     * @param ZoneIdSet 返回当前用户可使用的专属可用区 ID 
     */
    public void setZoneIdSet(String [] ZoneIdSet) {
        this.ZoneIdSet = ZoneIdSet;
    }

    /**
     * Get 专属可用区列表信息。 
     * @return ZoneSet 专属可用区列表信息。
     */
    public CloudDedicatedZone [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set 专属可用区列表信息。
     * @param ZoneSet 专属可用区列表信息。
     */
    public void setZoneSet(CloudDedicatedZone [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUserAvailableCloudDedicatedZonesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserAvailableCloudDedicatedZonesResponse(DescribeUserAvailableCloudDedicatedZonesResponse source) {
        if (source.ZoneIdSet != null) {
            this.ZoneIdSet = new String[source.ZoneIdSet.length];
            for (int i = 0; i < source.ZoneIdSet.length; i++) {
                this.ZoneIdSet[i] = new String(source.ZoneIdSet[i]);
            }
        }
        if (source.ZoneSet != null) {
            this.ZoneSet = new CloudDedicatedZone[source.ZoneSet.length];
            for (int i = 0; i < source.ZoneSet.length; i++) {
                this.ZoneSet[i] = new CloudDedicatedZone(source.ZoneSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIdSet.", this.ZoneIdSet);
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

