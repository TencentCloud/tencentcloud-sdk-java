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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallBackStatusRequest extends AbstractModel{

    /**
    * 业务appid
    */
    @SerializedName("BizAppId")
    @Expose
    private String BizAppId;

    /**
    * 回拨请求响应中返回的 callId
    */
    @SerializedName("CallId")
    @Expose
    private String CallId;

    /**
    * 主叫号码
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 被叫号码
    */
    @SerializedName("Dst")
    @Expose
    private String Dst;

    /**
    * 通话最后状态：0：未知状态 1：主叫响铃中 2：主叫接听 3：被叫响铃中 4：正常通话中 5：通话结束
    */
    @SerializedName("CallStatus")
    @Expose
    private String CallStatus;

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
     * Get 回拨请求响应中返回的 callId 
     * @return CallId 回拨请求响应中返回的 callId
     */
    public String getCallId() {
        return this.CallId;
    }

    /**
     * Set 回拨请求响应中返回的 callId
     * @param CallId 回拨请求响应中返回的 callId
     */
    public void setCallId(String CallId) {
        this.CallId = CallId;
    }

    /**
     * Get 主叫号码 
     * @return Src 主叫号码
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 主叫号码
     * @param Src 主叫号码
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 被叫号码 
     * @return Dst 被叫号码
     */
    public String getDst() {
        return this.Dst;
    }

    /**
     * Set 被叫号码
     * @param Dst 被叫号码
     */
    public void setDst(String Dst) {
        this.Dst = Dst;
    }

    /**
     * Get 通话最后状态：0：未知状态 1：主叫响铃中 2：主叫接听 3：被叫响铃中 4：正常通话中 5：通话结束 
     * @return CallStatus 通话最后状态：0：未知状态 1：主叫响铃中 2：主叫接听 3：被叫响铃中 4：正常通话中 5：通话结束
     */
    public String getCallStatus() {
        return this.CallStatus;
    }

    /**
     * Set 通话最后状态：0：未知状态 1：主叫响铃中 2：主叫接听 3：被叫响铃中 4：正常通话中 5：通话结束
     * @param CallStatus 通话最后状态：0：未知状态 1：主叫响铃中 2：主叫接听 3：被叫响铃中 4：正常通话中 5：通话结束
     */
    public void setCallStatus(String CallStatus) {
        this.CallStatus = CallStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizAppId", this.BizAppId);
        this.setParamSimple(map, prefix + "CallId", this.CallId);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Dst", this.Dst);
        this.setParamSimple(map, prefix + "CallStatus", this.CallStatus);

    }
}

