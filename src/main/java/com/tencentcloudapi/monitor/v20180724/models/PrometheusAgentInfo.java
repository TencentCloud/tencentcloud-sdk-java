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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAgentInfo extends AbstractModel {

    /**
    * <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群、外部集群</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集成容器服务中关联的集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>该参数未使用，不需要填写</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
     * Get <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群、外部集群</p> 
     * @return ClusterType <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群、外部集群</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群、外部集群</p>
     * @param ClusterType <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群、外部集群</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集成容器服务中关联的集群ID</p> 
     * @return ClusterId <p>集成容器服务中关联的集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集成容器服务中关联的集群ID</p>
     * @param ClusterId <p>集成容器服务中关联的集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>该参数未使用，不需要填写</p> 
     * @return Describe <p>该参数未使用，不需要填写</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>该参数未使用，不需要填写</p>
     * @param Describe <p>该参数未使用，不需要填写</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    public PrometheusAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAgentInfo(PrometheusAgentInfo source) {
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);

    }
}

