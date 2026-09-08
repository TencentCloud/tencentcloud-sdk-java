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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EBPFCollectFilters extends AbstractModel {

    /**
    * 进程名过滤
    */
    @SerializedName("ProcessName")
    @Expose
    private EBPFProcessNameFilter ProcessName;

    /**
    * 目的端点过滤
    */
    @SerializedName("DestEndpoint")
    @Expose
    private EBPFDestEndpointFilter DestEndpoint;

    /**
    * DNS 过滤
    */
    @SerializedName("DNS")
    @Expose
    private EBPFDNSFilter DNS;

    /**
     * Get 进程名过滤 
     * @return ProcessName 进程名过滤
     */
    public EBPFProcessNameFilter getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名过滤
     * @param ProcessName 进程名过滤
     */
    public void setProcessName(EBPFProcessNameFilter ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 目的端点过滤 
     * @return DestEndpoint 目的端点过滤
     */
    public EBPFDestEndpointFilter getDestEndpoint() {
        return this.DestEndpoint;
    }

    /**
     * Set 目的端点过滤
     * @param DestEndpoint 目的端点过滤
     */
    public void setDestEndpoint(EBPFDestEndpointFilter DestEndpoint) {
        this.DestEndpoint = DestEndpoint;
    }

    /**
     * Get DNS 过滤 
     * @return DNS DNS 过滤
     */
    public EBPFDNSFilter getDNS() {
        return this.DNS;
    }

    /**
     * Set DNS 过滤
     * @param DNS DNS 过滤
     */
    public void setDNS(EBPFDNSFilter DNS) {
        this.DNS = DNS;
    }

    public EBPFCollectFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EBPFCollectFilters(EBPFCollectFilters source) {
        if (source.ProcessName != null) {
            this.ProcessName = new EBPFProcessNameFilter(source.ProcessName);
        }
        if (source.DestEndpoint != null) {
            this.DestEndpoint = new EBPFDestEndpointFilter(source.DestEndpoint);
        }
        if (source.DNS != null) {
            this.DNS = new EBPFDNSFilter(source.DNS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProcessName.", this.ProcessName);
        this.setParamObj(map, prefix + "DestEndpoint.", this.DestEndpoint);
        this.setParamObj(map, prefix + "DNS.", this.DNS);

    }
}

