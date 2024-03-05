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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeP2PInfoResponse extends AbstractModel {

    /**
    * xp2pinfo信息
    */
    @SerializedName("P2PInfo")
    @Expose
    private String P2PInfo;

    /**
    * 上报时间
    */
    @SerializedName("ReportTime")
    @Expose
    private Long ReportTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get xp2pinfo信息 
     * @return P2PInfo xp2pinfo信息
     */
    public String getP2PInfo() {
        return this.P2PInfo;
    }

    /**
     * Set xp2pinfo信息
     * @param P2PInfo xp2pinfo信息
     */
    public void setP2PInfo(String P2PInfo) {
        this.P2PInfo = P2PInfo;
    }

    /**
     * Get 上报时间 
     * @return ReportTime 上报时间
     */
    public Long getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 上报时间
     * @param ReportTime 上报时间
     */
    public void setReportTime(Long ReportTime) {
        this.ReportTime = ReportTime;
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

    public DescribeP2PInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeP2PInfoResponse(DescribeP2PInfoResponse source) {
        if (source.P2PInfo != null) {
            this.P2PInfo = new String(source.P2PInfo);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new Long(source.ReportTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "P2PInfo", this.P2PInfo);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

