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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesResponse extends AbstractModel{

    /**
    * 返回多少个可用区信息
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 可用区数组
    */
    @SerializedName("ZoneSet")
    @Expose
    private ZoneInfo [] ZoneSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回多少个可用区信息 
     * @return TotalCount 返回多少个可用区信息
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回多少个可用区信息
     * @param TotalCount 返回多少个可用区信息
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 可用区数组 
     * @return ZoneSet 可用区数组
     */
    public ZoneInfo [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set 可用区数组
     * @param ZoneSet 可用区数组
     */
    public void setZoneSet(ZoneInfo [] ZoneSet) {
        this.ZoneSet = ZoneSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

