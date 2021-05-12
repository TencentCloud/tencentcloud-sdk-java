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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInAndOutTimeResponse extends AbstractModel{

    /**
    * 用户在房间得进出时间列表
    */
    @SerializedName("InOutList")
    @Expose
    private InOutTimeInfo [] InOutList;

    /**
    * 用户在房间中总时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户在房间得进出时间列表 
     * @return InOutList 用户在房间得进出时间列表
     */
    public InOutTimeInfo [] getInOutList() {
        return this.InOutList;
    }

    /**
     * Set 用户在房间得进出时间列表
     * @param InOutList 用户在房间得进出时间列表
     */
    public void setInOutList(InOutTimeInfo [] InOutList) {
        this.InOutList = InOutList;
    }

    /**
     * Get 用户在房间中总时长 
     * @return Duration 用户在房间中总时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 用户在房间中总时长
     * @param Duration 用户在房间中总时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
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

    public DescribeUserInAndOutTimeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInAndOutTimeResponse(DescribeUserInAndOutTimeResponse source) {
        if (source.InOutList != null) {
            this.InOutList = new InOutTimeInfo[source.InOutList.length];
            for (int i = 0; i < source.InOutList.length; i++) {
                this.InOutList[i] = new InOutTimeInfo(source.InOutList[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InOutList.", this.InOutList);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

