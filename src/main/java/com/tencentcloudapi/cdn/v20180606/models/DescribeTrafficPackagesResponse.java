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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficPackagesResponse  extends AbstractModel{

    /**
    * 流量包总个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 流量包详情
    */
    @SerializedName("TrafficPackages")
    @Expose
    private TrafficPackage [] TrafficPackages;

    /**
    * 即将过期的流量包个数（7天内）
    */
    @SerializedName("ExpiringCount")
    @Expose
    private Integer ExpiringCount;

    /**
    * 有效流量包个数
    */
    @SerializedName("EnabledCount")
    @Expose
    private Integer EnabledCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取流量包总个数
     * @return TotalCount 流量包总个数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置流量包总个数
     * @param TotalCount 流量包总个数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取流量包详情
     * @return TrafficPackages 流量包详情
     */
    public TrafficPackage [] getTrafficPackages() {
        return this.TrafficPackages;
    }

    /**
     * 设置流量包详情
     * @param TrafficPackages 流量包详情
     */
    public void setTrafficPackages(TrafficPackage [] TrafficPackages) {
        this.TrafficPackages = TrafficPackages;
    }

    /**
     * 获取即将过期的流量包个数（7天内）
     * @return ExpiringCount 即将过期的流量包个数（7天内）
     */
    public Integer getExpiringCount() {
        return this.ExpiringCount;
    }

    /**
     * 设置即将过期的流量包个数（7天内）
     * @param ExpiringCount 即将过期的流量包个数（7天内）
     */
    public void setExpiringCount(Integer ExpiringCount) {
        this.ExpiringCount = ExpiringCount;
    }

    /**
     * 获取有效流量包个数
     * @return EnabledCount 有效流量包个数
     */
    public Integer getEnabledCount() {
        return this.EnabledCount;
    }

    /**
     * 设置有效流量包个数
     * @param EnabledCount 有效流量包个数
     */
    public void setEnabledCount(Integer EnabledCount) {
        this.EnabledCount = EnabledCount;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TrafficPackages.", this.TrafficPackages);
        this.setParamSimple(map, prefix + "ExpiringCount", this.ExpiringCount);
        this.setParamSimple(map, prefix + "EnabledCount", this.EnabledCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

