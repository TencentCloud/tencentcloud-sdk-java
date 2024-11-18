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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLineGroupListResponse extends AbstractModel {

    /**
    * 自定义线路分组列表
    */
    @SerializedName("LineGroups")
    @Expose
    private LineGroupItem [] LineGroups;

    /**
    * 自定义线路分组数量信息
    */
    @SerializedName("Info")
    @Expose
    private LineGroupSum Info;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义线路分组列表 
     * @return LineGroups 自定义线路分组列表
     */
    public LineGroupItem [] getLineGroups() {
        return this.LineGroups;
    }

    /**
     * Set 自定义线路分组列表
     * @param LineGroups 自定义线路分组列表
     */
    public void setLineGroups(LineGroupItem [] LineGroups) {
        this.LineGroups = LineGroups;
    }

    /**
     * Get 自定义线路分组数量信息 
     * @return Info 自定义线路分组数量信息
     */
    public LineGroupSum getInfo() {
        return this.Info;
    }

    /**
     * Set 自定义线路分组数量信息
     * @param Info 自定义线路分组数量信息
     */
    public void setInfo(LineGroupSum Info) {
        this.Info = Info;
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

    public DescribeLineGroupListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLineGroupListResponse(DescribeLineGroupListResponse source) {
        if (source.LineGroups != null) {
            this.LineGroups = new LineGroupItem[source.LineGroups.length];
            for (int i = 0; i < source.LineGroups.length; i++) {
                this.LineGroups[i] = new LineGroupItem(source.LineGroups[i]);
            }
        }
        if (source.Info != null) {
            this.Info = new LineGroupSum(source.Info);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LineGroups.", this.LineGroups);
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

