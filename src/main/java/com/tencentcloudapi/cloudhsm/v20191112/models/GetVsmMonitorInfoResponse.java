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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVsmMonitorInfoResponse extends AbstractModel {

    /**
    * <p>VSM监控信息</p>
    */
    @SerializedName("MonitorInfo")
    @Expose
    private String [] MonitorInfo;

    /**
    * <p>vsm摘要列表</p>
    */
    @SerializedName("DigestList")
    @Expose
    private VsmDigestItem [] DigestList;

    /**
    * <p>初始化状态</p>
    */
    @SerializedName("InitStatus")
    @Expose
    private Long InitStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>VSM监控信息</p> 
     * @return MonitorInfo <p>VSM监控信息</p>
     */
    public String [] getMonitorInfo() {
        return this.MonitorInfo;
    }

    /**
     * Set <p>VSM监控信息</p>
     * @param MonitorInfo <p>VSM监控信息</p>
     */
    public void setMonitorInfo(String [] MonitorInfo) {
        this.MonitorInfo = MonitorInfo;
    }

    /**
     * Get <p>vsm摘要列表</p> 
     * @return DigestList <p>vsm摘要列表</p>
     */
    public VsmDigestItem [] getDigestList() {
        return this.DigestList;
    }

    /**
     * Set <p>vsm摘要列表</p>
     * @param DigestList <p>vsm摘要列表</p>
     */
    public void setDigestList(VsmDigestItem [] DigestList) {
        this.DigestList = DigestList;
    }

    /**
     * Get <p>初始化状态</p> 
     * @return InitStatus <p>初始化状态</p>
     */
    public Long getInitStatus() {
        return this.InitStatus;
    }

    /**
     * Set <p>初始化状态</p>
     * @param InitStatus <p>初始化状态</p>
     */
    public void setInitStatus(Long InitStatus) {
        this.InitStatus = InitStatus;
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

    public GetVsmMonitorInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVsmMonitorInfoResponse(GetVsmMonitorInfoResponse source) {
        if (source.MonitorInfo != null) {
            this.MonitorInfo = new String[source.MonitorInfo.length];
            for (int i = 0; i < source.MonitorInfo.length; i++) {
                this.MonitorInfo[i] = new String(source.MonitorInfo[i]);
            }
        }
        if (source.DigestList != null) {
            this.DigestList = new VsmDigestItem[source.DigestList.length];
            for (int i = 0; i < source.DigestList.length; i++) {
                this.DigestList[i] = new VsmDigestItem(source.DigestList[i]);
            }
        }
        if (source.InitStatus != null) {
            this.InitStatus = new Long(source.InitStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MonitorInfo.", this.MonitorInfo);
        this.setParamArrayObj(map, prefix + "DigestList.", this.DigestList);
        this.setParamSimple(map, prefix + "InitStatus", this.InitStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

