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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseInfoResponse extends AbstractModel {

    /**
    * 最后发布时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 发布状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否编辑过

    */
    @SerializedName("IsUpdated")
    @Expose
    private Boolean IsUpdated;

    /**
    * 失败原因

    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 最后发布时间 
     * @return LastTime 最后发布时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最后发布时间
     * @param LastTime 最后发布时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 发布状态 
     * @return Status 发布状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态
     * @param Status 发布状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否编辑过
 
     * @return IsUpdated 是否编辑过

     */
    public Boolean getIsUpdated() {
        return this.IsUpdated;
    }

    /**
     * Set 是否编辑过

     * @param IsUpdated 是否编辑过

     */
    public void setIsUpdated(Boolean IsUpdated) {
        this.IsUpdated = IsUpdated;
    }

    /**
     * Get 失败原因
 
     * @return Msg 失败原因

     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 失败原因

     * @param Msg 失败原因

     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public DescribeReleaseInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseInfoResponse(DescribeReleaseInfoResponse source) {
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsUpdated != null) {
            this.IsUpdated = new Boolean(source.IsUpdated);
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
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsUpdated", this.IsUpdated);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

