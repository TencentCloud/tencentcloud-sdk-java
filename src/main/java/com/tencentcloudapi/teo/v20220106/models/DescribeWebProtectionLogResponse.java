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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebProtectionLogResponse extends AbstractModel{

    /**
    * 限速拦截数据内容。
    */
    @SerializedName("Data")
    @Expose
    private CCLogData Data;

    /**
    * 请求响应状态，取值有：
<li>1 ：失败 ；</li>
<li>0 ：成功 。</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 请求响应信息。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 限速拦截数据内容。 
     * @return Data 限速拦截数据内容。
     */
    public CCLogData getData() {
        return this.Data;
    }

    /**
     * Set 限速拦截数据内容。
     * @param Data 限速拦截数据内容。
     */
    public void setData(CCLogData Data) {
        this.Data = Data;
    }

    /**
     * Get 请求响应状态，取值有：
<li>1 ：失败 ；</li>
<li>0 ：成功 。</li> 
     * @return Status 请求响应状态，取值有：
<li>1 ：失败 ；</li>
<li>0 ：成功 。</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 请求响应状态，取值有：
<li>1 ：失败 ；</li>
<li>0 ：成功 。</li>
     * @param Status 请求响应状态，取值有：
<li>1 ：失败 ；</li>
<li>0 ：成功 。</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 请求响应信息。 
     * @return Msg 请求响应信息。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 请求响应信息。
     * @param Msg 请求响应信息。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public DescribeWebProtectionLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebProtectionLogResponse(DescribeWebProtectionLogResponse source) {
        if (source.Data != null) {
            this.Data = new CCLogData(source.Data);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

