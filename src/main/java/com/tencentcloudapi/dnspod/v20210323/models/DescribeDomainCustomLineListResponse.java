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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainCustomLineListResponse extends AbstractModel {

    /**
    * 自定义线路列表
    */
    @SerializedName("LineList")
    @Expose
    private CustomLineInfo [] LineList;

    /**
    * 可添加的自定义线路条数
    */
    @SerializedName("AvailableCount")
    @Expose
    private Long AvailableCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义线路列表 
     * @return LineList 自定义线路列表
     */
    public CustomLineInfo [] getLineList() {
        return this.LineList;
    }

    /**
     * Set 自定义线路列表
     * @param LineList 自定义线路列表
     */
    public void setLineList(CustomLineInfo [] LineList) {
        this.LineList = LineList;
    }

    /**
     * Get 可添加的自定义线路条数 
     * @return AvailableCount 可添加的自定义线路条数
     */
    public Long getAvailableCount() {
        return this.AvailableCount;
    }

    /**
     * Set 可添加的自定义线路条数
     * @param AvailableCount 可添加的自定义线路条数
     */
    public void setAvailableCount(Long AvailableCount) {
        this.AvailableCount = AvailableCount;
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

    public DescribeDomainCustomLineListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainCustomLineListResponse(DescribeDomainCustomLineListResponse source) {
        if (source.LineList != null) {
            this.LineList = new CustomLineInfo[source.LineList.length];
            for (int i = 0; i < source.LineList.length; i++) {
                this.LineList[i] = new CustomLineInfo(source.LineList[i]);
            }
        }
        if (source.AvailableCount != null) {
            this.AvailableCount = new Long(source.AvailableCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LineList.", this.LineList);
        this.setParamSimple(map, prefix + "AvailableCount", this.AvailableCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

