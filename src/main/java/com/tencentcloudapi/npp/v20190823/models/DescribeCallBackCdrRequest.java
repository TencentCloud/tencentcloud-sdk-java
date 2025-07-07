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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallBackCdrRequest extends AbstractModel {

    /**
    * 业务appid
    */
    @SerializedName("BizAppId")
    @Expose
    private String BizAppId;

    /**
    * 回拨请求响应中返回的 callId，按 callId 查询该话单详细信息
    */
    @SerializedName("CallId")
    @Expose
    private String CallId;

    /**
    * 查询主叫用户产生的呼叫话单，如填空表示拉取这个时间段所有话单
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 话单开始时间戳
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private String StartTimeStamp;

    /**
    * 话单结束时间戳
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private String EndTimeStamp;

    /**
     * Get 业务appid 
     * @return BizAppId 业务appid
     */
    public String getBizAppId() {
        return this.BizAppId;
    }

    /**
     * Set 业务appid
     * @param BizAppId 业务appid
     */
    public void setBizAppId(String BizAppId) {
        this.BizAppId = BizAppId;
    }

    /**
     * Get 回拨请求响应中返回的 callId，按 callId 查询该话单详细信息 
     * @return CallId 回拨请求响应中返回的 callId，按 callId 查询该话单详细信息
     */
    public String getCallId() {
        return this.CallId;
    }

    /**
     * Set 回拨请求响应中返回的 callId，按 callId 查询该话单详细信息
     * @param CallId 回拨请求响应中返回的 callId，按 callId 查询该话单详细信息
     */
    public void setCallId(String CallId) {
        this.CallId = CallId;
    }

    /**
     * Get 查询主叫用户产生的呼叫话单，如填空表示拉取这个时间段所有话单 
     * @return Src 查询主叫用户产生的呼叫话单，如填空表示拉取这个时间段所有话单
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 查询主叫用户产生的呼叫话单，如填空表示拉取这个时间段所有话单
     * @param Src 查询主叫用户产生的呼叫话单，如填空表示拉取这个时间段所有话单
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 话单开始时间戳 
     * @return StartTimeStamp 话单开始时间戳
     */
    public String getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set 话单开始时间戳
     * @param StartTimeStamp 话单开始时间戳
     */
    public void setStartTimeStamp(String StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get 话单结束时间戳 
     * @return EndTimeStamp 话单结束时间戳
     */
    public String getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set 话单结束时间戳
     * @param EndTimeStamp 话单结束时间戳
     */
    public void setEndTimeStamp(String EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    public DescribeCallBackCdrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallBackCdrRequest(DescribeCallBackCdrRequest source) {
        if (source.BizAppId != null) {
            this.BizAppId = new String(source.BizAppId);
        }
        if (source.CallId != null) {
            this.CallId = new String(source.CallId);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new String(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new String(source.EndTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizAppId", this.BizAppId);
        this.setParamSimple(map, prefix + "CallId", this.CallId);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);

    }
}

