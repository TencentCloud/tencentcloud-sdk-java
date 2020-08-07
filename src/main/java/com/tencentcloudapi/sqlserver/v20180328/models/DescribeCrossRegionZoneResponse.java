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

public class DescribeCrossRegionZoneResponse extends AbstractModel{

    /**
    * 备机所在地域的字符串ID，形如：ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备机所在可用区的字符串ID，形如：ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备机所在地域的字符串ID，形如：ap-guangzhou 
     * @return Region 备机所在地域的字符串ID，形如：ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 备机所在地域的字符串ID，形如：ap-guangzhou
     * @param Region 备机所在地域的字符串ID，形如：ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 备机所在可用区的字符串ID，形如：ap-guangzhou-1 
     * @return Zone 备机所在可用区的字符串ID，形如：ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 备机所在可用区的字符串ID，形如：ap-guangzhou-1
     * @param Zone 备机所在可用区的字符串ID，形如：ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

