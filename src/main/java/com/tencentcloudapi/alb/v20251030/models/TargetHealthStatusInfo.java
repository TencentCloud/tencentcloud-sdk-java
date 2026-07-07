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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHealthStatusInfo extends AbstractModel {

    /**
    * 后端服务健康状态。DescribeListenerHealthStatus 仅返回非健康后端时，该值为 UnHealthy。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 后端目标服务IP。
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * 后端服务器端口。
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
     * Get 后端服务健康状态。DescribeListenerHealthStatus 仅返回非健康后端时，该值为 UnHealthy。 
     * @return Status 后端服务健康状态。DescribeListenerHealthStatus 仅返回非健康后端时，该值为 UnHealthy。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 后端服务健康状态。DescribeListenerHealthStatus 仅返回非健康后端时，该值为 UnHealthy。
     * @param Status 后端服务健康状态。DescribeListenerHealthStatus 仅返回非健康后端时，该值为 UnHealthy。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。 
     * @return TargetId 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
     * @param TargetId 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 后端目标服务IP。 
     * @return TargetIp 后端目标服务IP。
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set 后端目标服务IP。
     * @param TargetIp 后端目标服务IP。
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get 后端服务器端口。 
     * @return TargetPort 后端服务器端口。
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set 后端服务器端口。
     * @param TargetPort 后端服务器端口。
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    public TargetHealthStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetHealthStatusInfo(TargetHealthStatusInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.TargetPort != null) {
            this.TargetPort = new Long(source.TargetPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);

    }
}

