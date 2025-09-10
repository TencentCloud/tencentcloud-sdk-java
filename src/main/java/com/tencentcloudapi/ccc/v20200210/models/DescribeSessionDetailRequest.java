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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionDetailRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 通话的 session id
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 起始时间戳，Unix 秒级时间戳，最大支持近180天。
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 通话的 session id 
     * @return SessionId 通话的 session id
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 通话的 session id
     * @param SessionId 通话的 session id
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 起始时间戳，Unix 秒级时间戳，最大支持近180天。 
     * @return StartTimestamp 起始时间戳，Unix 秒级时间戳，最大支持近180天。
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 起始时间戳，Unix 秒级时间戳，最大支持近180天。
     * @param StartTimestamp 起始时间戳，Unix 秒级时间戳，最大支持近180天。
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。 
     * @return EndTimestamp 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
     * @param EndTimestamp 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    public DescribeSessionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionDetailRequest(DescribeSessionDetailRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.EndTimestamp != null) {
            this.EndTimestamp = new Long(source.EndTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "EndTimestamp", this.EndTimestamp);

    }
}

