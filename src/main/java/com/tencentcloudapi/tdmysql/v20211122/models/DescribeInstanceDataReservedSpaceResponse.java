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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDataReservedSpaceResponse extends AbstractModel {

    /**
    * <p>实际保留比例（%，单节点）</p>
    */
    @SerializedName("ReservedRate")
    @Expose
    private Float ReservedRate;

    /**
    * <p>实际保留空间 GB（单节点）</p><p>单位：GB</p>
    */
    @SerializedName("ReservedSpaceGB")
    @Expose
    private Float ReservedSpaceGB;

    /**
    * <p>用户可用空间 GB（单节点）</p><p>单位：GB</p>
    */
    @SerializedName("UsableSpaceGB")
    @Expose
    private Float UsableSpaceGB;

    /**
    * <p>true=旧版本（&lt;21.6.4.0），值取自老参数 tdstore_enter_readonly_threshold；false=新版本</p>
    */
    @SerializedName("IsLegacy")
    @Expose
    private Boolean IsLegacy;

    /**
    * <p>内核版本号</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实际保留比例（%，单节点）</p> 
     * @return ReservedRate <p>实际保留比例（%，单节点）</p>
     */
    public Float getReservedRate() {
        return this.ReservedRate;
    }

    /**
     * Set <p>实际保留比例（%，单节点）</p>
     * @param ReservedRate <p>实际保留比例（%，单节点）</p>
     */
    public void setReservedRate(Float ReservedRate) {
        this.ReservedRate = ReservedRate;
    }

    /**
     * Get <p>实际保留空间 GB（单节点）</p><p>单位：GB</p> 
     * @return ReservedSpaceGB <p>实际保留空间 GB（单节点）</p><p>单位：GB</p>
     */
    public Float getReservedSpaceGB() {
        return this.ReservedSpaceGB;
    }

    /**
     * Set <p>实际保留空间 GB（单节点）</p><p>单位：GB</p>
     * @param ReservedSpaceGB <p>实际保留空间 GB（单节点）</p><p>单位：GB</p>
     */
    public void setReservedSpaceGB(Float ReservedSpaceGB) {
        this.ReservedSpaceGB = ReservedSpaceGB;
    }

    /**
     * Get <p>用户可用空间 GB（单节点）</p><p>单位：GB</p> 
     * @return UsableSpaceGB <p>用户可用空间 GB（单节点）</p><p>单位：GB</p>
     */
    public Float getUsableSpaceGB() {
        return this.UsableSpaceGB;
    }

    /**
     * Set <p>用户可用空间 GB（单节点）</p><p>单位：GB</p>
     * @param UsableSpaceGB <p>用户可用空间 GB（单节点）</p><p>单位：GB</p>
     */
    public void setUsableSpaceGB(Float UsableSpaceGB) {
        this.UsableSpaceGB = UsableSpaceGB;
    }

    /**
     * Get <p>true=旧版本（&lt;21.6.4.0），值取自老参数 tdstore_enter_readonly_threshold；false=新版本</p> 
     * @return IsLegacy <p>true=旧版本（&lt;21.6.4.0），值取自老参数 tdstore_enter_readonly_threshold；false=新版本</p>
     */
    public Boolean getIsLegacy() {
        return this.IsLegacy;
    }

    /**
     * Set <p>true=旧版本（&lt;21.6.4.0），值取自老参数 tdstore_enter_readonly_threshold；false=新版本</p>
     * @param IsLegacy <p>true=旧版本（&lt;21.6.4.0），值取自老参数 tdstore_enter_readonly_threshold；false=新版本</p>
     */
    public void setIsLegacy(Boolean IsLegacy) {
        this.IsLegacy = IsLegacy;
    }

    /**
     * Get <p>内核版本号</p> 
     * @return KernelVersion <p>内核版本号</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>内核版本号</p>
     * @param KernelVersion <p>内核版本号</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
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

    public DescribeInstanceDataReservedSpaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceDataReservedSpaceResponse(DescribeInstanceDataReservedSpaceResponse source) {
        if (source.ReservedRate != null) {
            this.ReservedRate = new Float(source.ReservedRate);
        }
        if (source.ReservedSpaceGB != null) {
            this.ReservedSpaceGB = new Float(source.ReservedSpaceGB);
        }
        if (source.UsableSpaceGB != null) {
            this.UsableSpaceGB = new Float(source.UsableSpaceGB);
        }
        if (source.IsLegacy != null) {
            this.IsLegacy = new Boolean(source.IsLegacy);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservedRate", this.ReservedRate);
        this.setParamSimple(map, prefix + "ReservedSpaceGB", this.ReservedSpaceGB);
        this.setParamSimple(map, prefix + "UsableSpaceGB", this.UsableSpaceGB);
        this.setParamSimple(map, prefix + "IsLegacy", this.IsLegacy);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

