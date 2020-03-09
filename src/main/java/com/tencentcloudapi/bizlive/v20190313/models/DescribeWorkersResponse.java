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
package com.tencentcloudapi.bizlive.v20190313.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkersResponse extends AbstractModel{

    /**
    * 各个区域的机器情况
    */
    @SerializedName("RegionDetail")
    @Expose
    private WorkerRegionInfo [] RegionDetail;

    /**
    * 空闲机器总数量
    */
    @SerializedName("Idle")
    @Expose
    private Long Idle;

    /**
    * 区域个数
    */
    @SerializedName("RegionNum")
    @Expose
    private Long RegionNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 各个区域的机器情况 
     * @return RegionDetail 各个区域的机器情况
     */
    public WorkerRegionInfo [] getRegionDetail() {
        return this.RegionDetail;
    }

    /**
     * Set 各个区域的机器情况
     * @param RegionDetail 各个区域的机器情况
     */
    public void setRegionDetail(WorkerRegionInfo [] RegionDetail) {
        this.RegionDetail = RegionDetail;
    }

    /**
     * Get 空闲机器总数量 
     * @return Idle 空闲机器总数量
     */
    public Long getIdle() {
        return this.Idle;
    }

    /**
     * Set 空闲机器总数量
     * @param Idle 空闲机器总数量
     */
    public void setIdle(Long Idle) {
        this.Idle = Idle;
    }

    /**
     * Get 区域个数 
     * @return RegionNum 区域个数
     */
    public Long getRegionNum() {
        return this.RegionNum;
    }

    /**
     * Set 区域个数
     * @param RegionNum 区域个数
     */
    public void setRegionNum(Long RegionNum) {
        this.RegionNum = RegionNum;
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
        this.setParamArrayObj(map, prefix + "RegionDetail.", this.RegionDetail);
        this.setParamSimple(map, prefix + "Idle", this.Idle);
        this.setParamSimple(map, prefix + "RegionNum", this.RegionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

