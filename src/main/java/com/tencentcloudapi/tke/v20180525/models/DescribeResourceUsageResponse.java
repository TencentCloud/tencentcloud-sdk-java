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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceUsageResponse extends AbstractModel{

    /**
    * CRD使用量
    */
    @SerializedName("CRDUsage")
    @Expose
    private ResourceUsage CRDUsage;

    /**
    * Pod使用量
    */
    @SerializedName("PodUsage")
    @Expose
    private Long PodUsage;

    /**
    * ConfigMap使用量
    */
    @SerializedName("ConfigMapUsage")
    @Expose
    private Long ConfigMapUsage;

    /**
    * 其他资源使用量
    */
    @SerializedName("OtherUsage")
    @Expose
    private ResourceUsage OtherUsage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CRD使用量 
     * @return CRDUsage CRD使用量
     */
    public ResourceUsage getCRDUsage() {
        return this.CRDUsage;
    }

    /**
     * Set CRD使用量
     * @param CRDUsage CRD使用量
     */
    public void setCRDUsage(ResourceUsage CRDUsage) {
        this.CRDUsage = CRDUsage;
    }

    /**
     * Get Pod使用量 
     * @return PodUsage Pod使用量
     */
    public Long getPodUsage() {
        return this.PodUsage;
    }

    /**
     * Set Pod使用量
     * @param PodUsage Pod使用量
     */
    public void setPodUsage(Long PodUsage) {
        this.PodUsage = PodUsage;
    }

    /**
     * Get ConfigMap使用量 
     * @return ConfigMapUsage ConfigMap使用量
     */
    public Long getConfigMapUsage() {
        return this.ConfigMapUsage;
    }

    /**
     * Set ConfigMap使用量
     * @param ConfigMapUsage ConfigMap使用量
     */
    public void setConfigMapUsage(Long ConfigMapUsage) {
        this.ConfigMapUsage = ConfigMapUsage;
    }

    /**
     * Get 其他资源使用量 
     * @return OtherUsage 其他资源使用量
     */
    public ResourceUsage getOtherUsage() {
        return this.OtherUsage;
    }

    /**
     * Set 其他资源使用量
     * @param OtherUsage 其他资源使用量
     */
    public void setOtherUsage(ResourceUsage OtherUsage) {
        this.OtherUsage = OtherUsage;
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

    public DescribeResourceUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceUsageResponse(DescribeResourceUsageResponse source) {
        if (source.CRDUsage != null) {
            this.CRDUsage = new ResourceUsage(source.CRDUsage);
        }
        if (source.PodUsage != null) {
            this.PodUsage = new Long(source.PodUsage);
        }
        if (source.ConfigMapUsage != null) {
            this.ConfigMapUsage = new Long(source.ConfigMapUsage);
        }
        if (source.OtherUsage != null) {
            this.OtherUsage = new ResourceUsage(source.OtherUsage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CRDUsage.", this.CRDUsage);
        this.setParamSimple(map, prefix + "PodUsage", this.PodUsage);
        this.setParamSimple(map, prefix + "ConfigMapUsage", this.ConfigMapUsage);
        this.setParamObj(map, prefix + "OtherUsage.", this.OtherUsage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

