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

public class Get400CdrRequest extends AbstractModel{

    /**
    * 业务appid
    */
    @SerializedName("BizAppId")
    @Expose
    private String BizAppId;

    /**
    * 通话唯一标识 callId，即直拨呼叫响应中返回的 callId
    */
    @SerializedName("CallId")
    @Expose
    private String CallId;

    /**
    * 查询主叫用户产生的呼叫话单（0086开头），设置为空表示拉取该时间段的所有话单
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
     * Get 通话唯一标识 callId，即直拨呼叫响应中返回的 callId 
     * @return CallId 通话唯一标识 callId，即直拨呼叫响应中返回的 callId
     */
    public String getCallId() {
        return this.CallId;
    }

    /**
     * Set 通话唯一标识 callId，即直拨呼叫响应中返回的 callId
     * @param CallId 通话唯一标识 callId，即直拨呼叫响应中返回的 callId
     */
    public void setCallId(String CallId) {
        this.CallId = CallId;
    }

    /**
     * Get 查询主叫用户产生的呼叫话单（0086开头），设置为空表示拉取该时间段的所有话单 
     * @return Src 查询主叫用户产生的呼叫话单（0086开头），设置为空表示拉取该时间段的所有话单
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 查询主叫用户产生的呼叫话单（0086开头），设置为空表示拉取该时间段的所有话单
     * @param Src 查询主叫用户产生的呼叫话单（0086开头），设置为空表示拉取该时间段的所有话单
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

