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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlayErrorCodeDetailInfoListResponse extends AbstractModel {

    /**
    * 统计信息列表。
    */
    @SerializedName("HttpCodeList")
    @Expose
    private HttpCodeInfo [] HttpCodeList;

    /**
    * 统计类型。
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 统计信息列表。 
     * @return HttpCodeList 统计信息列表。
     */
    public HttpCodeInfo [] getHttpCodeList() {
        return this.HttpCodeList;
    }

    /**
     * Set 统计信息列表。
     * @param HttpCodeList 统计信息列表。
     */
    public void setHttpCodeList(HttpCodeInfo [] HttpCodeList) {
        this.HttpCodeList = HttpCodeList;
    }

    /**
     * Get 统计类型。 
     * @return StatType 统计类型。
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set 统计类型。
     * @param StatType 统计类型。
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
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

    public DescribePlayErrorCodeDetailInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlayErrorCodeDetailInfoListResponse(DescribePlayErrorCodeDetailInfoListResponse source) {
        if (source.HttpCodeList != null) {
            this.HttpCodeList = new HttpCodeInfo[source.HttpCodeList.length];
            for (int i = 0; i < source.HttpCodeList.length; i++) {
                this.HttpCodeList[i] = new HttpCodeInfo(source.HttpCodeList[i]);
            }
        }
        if (source.StatType != null) {
            this.StatType = new String(source.StatType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HttpCodeList.", this.HttpCodeList);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

