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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusClusterAgentsResponse extends AbstractModel {

    /**
    * 被关联集群信息
    */
    @SerializedName("Agents")
    @Expose
    private PrometheusAgentOverview [] Agents;

    /**
    * 被关联集群总量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 是否为首次绑定，如果是首次绑定则需要安装预聚合规则
    */
    @SerializedName("IsFirstBind")
    @Expose
    private Boolean IsFirstBind;

    /**
    * 实例组件是否需要更新镜像版本
    */
    @SerializedName("ImageNeedUpdate")
    @Expose
    private Boolean ImageNeedUpdate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 被关联集群信息 
     * @return Agents 被关联集群信息
     */
    public PrometheusAgentOverview [] getAgents() {
        return this.Agents;
    }

    /**
     * Set 被关联集群信息
     * @param Agents 被关联集群信息
     */
    public void setAgents(PrometheusAgentOverview [] Agents) {
        this.Agents = Agents;
    }

    /**
     * Get 被关联集群总量 
     * @return Total 被关联集群总量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 被关联集群总量
     * @param Total 被关联集群总量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 是否为首次绑定，如果是首次绑定则需要安装预聚合规则 
     * @return IsFirstBind 是否为首次绑定，如果是首次绑定则需要安装预聚合规则
     */
    public Boolean getIsFirstBind() {
        return this.IsFirstBind;
    }

    /**
     * Set 是否为首次绑定，如果是首次绑定则需要安装预聚合规则
     * @param IsFirstBind 是否为首次绑定，如果是首次绑定则需要安装预聚合规则
     */
    public void setIsFirstBind(Boolean IsFirstBind) {
        this.IsFirstBind = IsFirstBind;
    }

    /**
     * Get 实例组件是否需要更新镜像版本 
     * @return ImageNeedUpdate 实例组件是否需要更新镜像版本
     */
    public Boolean getImageNeedUpdate() {
        return this.ImageNeedUpdate;
    }

    /**
     * Set 实例组件是否需要更新镜像版本
     * @param ImageNeedUpdate 实例组件是否需要更新镜像版本
     */
    public void setImageNeedUpdate(Boolean ImageNeedUpdate) {
        this.ImageNeedUpdate = ImageNeedUpdate;
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

    public DescribePrometheusClusterAgentsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusClusterAgentsResponse(DescribePrometheusClusterAgentsResponse source) {
        if (source.Agents != null) {
            this.Agents = new PrometheusAgentOverview[source.Agents.length];
            for (int i = 0; i < source.Agents.length; i++) {
                this.Agents[i] = new PrometheusAgentOverview(source.Agents[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.IsFirstBind != null) {
            this.IsFirstBind = new Boolean(source.IsFirstBind);
        }
        if (source.ImageNeedUpdate != null) {
            this.ImageNeedUpdate = new Boolean(source.ImageNeedUpdate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Agents.", this.Agents);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "IsFirstBind", this.IsFirstBind);
        this.setParamSimple(map, prefix + "ImageNeedUpdate", this.ImageNeedUpdate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

