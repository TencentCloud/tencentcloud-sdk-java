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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageAccelerateServiceResponse extends AbstractModel{

    /**
    * 镜像加速状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CFS的VIP
    */
    @SerializedName("CFSVIP")
    @Expose
    private String CFSVIP;

    /**
    * 是否开通
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像加速状态 
     * @return Status 镜像加速状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 镜像加速状态
     * @param Status 镜像加速状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CFS的VIP 
     * @return CFSVIP CFS的VIP
     */
    public String getCFSVIP() {
        return this.CFSVIP;
    }

    /**
     * Set CFS的VIP
     * @param CFSVIP CFS的VIP
     */
    public void setCFSVIP(String CFSVIP) {
        this.CFSVIP = CFSVIP;
    }

    /**
     * Get 是否开通 
     * @return IsEnable 是否开通
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set 是否开通
     * @param IsEnable 是否开通
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
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

    public DescribeImageAccelerateServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAccelerateServiceResponse(DescribeImageAccelerateServiceResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CFSVIP != null) {
            this.CFSVIP = new String(source.CFSVIP);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CFSVIP", this.CFSVIP);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

