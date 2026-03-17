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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageDenyEventTendencyResponse extends AbstractModel {

    /**
    * 镜像拦截成功事件趋势
    */
    @SerializedName("DenyList")
    @Expose
    private ImageDenyEventTendency [] DenyList;

    /**
    * 镜像拦截告警事件趋势
    */
    @SerializedName("AlarmList")
    @Expose
    private ImageDenyEventTendency [] AlarmList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像拦截成功事件趋势 
     * @return DenyList 镜像拦截成功事件趋势
     */
    public ImageDenyEventTendency [] getDenyList() {
        return this.DenyList;
    }

    /**
     * Set 镜像拦截成功事件趋势
     * @param DenyList 镜像拦截成功事件趋势
     */
    public void setDenyList(ImageDenyEventTendency [] DenyList) {
        this.DenyList = DenyList;
    }

    /**
     * Get 镜像拦截告警事件趋势 
     * @return AlarmList 镜像拦截告警事件趋势
     */
    public ImageDenyEventTendency [] getAlarmList() {
        return this.AlarmList;
    }

    /**
     * Set 镜像拦截告警事件趋势
     * @param AlarmList 镜像拦截告警事件趋势
     */
    public void setAlarmList(ImageDenyEventTendency [] AlarmList) {
        this.AlarmList = AlarmList;
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

    public DescribeImageDenyEventTendencyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageDenyEventTendencyResponse(DescribeImageDenyEventTendencyResponse source) {
        if (source.DenyList != null) {
            this.DenyList = new ImageDenyEventTendency[source.DenyList.length];
            for (int i = 0; i < source.DenyList.length; i++) {
                this.DenyList[i] = new ImageDenyEventTendency(source.DenyList[i]);
            }
        }
        if (source.AlarmList != null) {
            this.AlarmList = new ImageDenyEventTendency[source.AlarmList.length];
            for (int i = 0; i < source.AlarmList.length; i++) {
                this.AlarmList[i] = new ImageDenyEventTendency(source.AlarmList[i]);
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
        this.setParamArrayObj(map, prefix + "DenyList.", this.DenyList);
        this.setParamArrayObj(map, prefix + "AlarmList.", this.AlarmList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

