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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdrAlertCountForContainerRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>集群 ID 列表（≤500）；非空且 ContainerIds 为空时按集群分组统计</p>
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * <p>容器 ID 列表（≤500）；非空时按容器分组统计（优先级高于 ClusterIds）</p>
    */
    @SerializedName("ContainerIds")
    @Expose
    private String [] ContainerIds;

    /**
    * <li>PolicyType - int - 是否必填：否 - 策略类型</li><li>PolicyName - string - 是否必填：否 - 策略名称</li><li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li><li>PolicyAction- int - 是否必填：否 - 策略动作</li><li>IsEnabled - int - 是否必填：否 - 是否生效</li><li>ContainerId - string - 是否必填：否 - 容器ID（精确/IN，容器维度筛选）</li><li>ClusterId - string - 是否必填：否 - 集群ID（精确/IN，容器维度筛选）</li><li>ClusterName - string - 是否必填：否 - 集群名称（前缀模糊）</li><li>ContainerName - string - 是否必填：否 - 容器名称（前缀模糊）</li><li>AlertSource - string - 是否必填：否 - 告警来源：HOST-主机告警 / CONTAINER-容器告警，不传返回全部</li>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>集群 ID 列表（≤500）；非空且 ContainerIds 为空时按集群分组统计</p> 
     * @return ClusterIds <p>集群 ID 列表（≤500）；非空且 ContainerIds 为空时按集群分组统计</p>
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set <p>集群 ID 列表（≤500）；非空且 ContainerIds 为空时按集群分组统计</p>
     * @param ClusterIds <p>集群 ID 列表（≤500）；非空且 ContainerIds 为空时按集群分组统计</p>
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get <p>容器 ID 列表（≤500）；非空时按容器分组统计（优先级高于 ClusterIds）</p> 
     * @return ContainerIds <p>容器 ID 列表（≤500）；非空时按容器分组统计（优先级高于 ClusterIds）</p>
     */
    public String [] getContainerIds() {
        return this.ContainerIds;
    }

    /**
     * Set <p>容器 ID 列表（≤500）；非空时按容器分组统计（优先级高于 ClusterIds）</p>
     * @param ContainerIds <p>容器 ID 列表（≤500）；非空时按容器分组统计（优先级高于 ClusterIds）</p>
     */
    public void setContainerIds(String [] ContainerIds) {
        this.ContainerIds = ContainerIds;
    }

    /**
     * Get <li>PolicyType - int - 是否必填：否 - 策略类型</li><li>PolicyName - string - 是否必填：否 - 策略名称</li><li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li><li>PolicyAction- int - 是否必填：否 - 策略动作</li><li>IsEnabled - int - 是否必填：否 - 是否生效</li><li>ContainerId - string - 是否必填：否 - 容器ID（精确/IN，容器维度筛选）</li><li>ClusterId - string - 是否必填：否 - 集群ID（精确/IN，容器维度筛选）</li><li>ClusterName - string - 是否必填：否 - 集群名称（前缀模糊）</li><li>ContainerName - string - 是否必填：否 - 容器名称（前缀模糊）</li><li>AlertSource - string - 是否必填：否 - 告警来源：HOST-主机告警 / CONTAINER-容器告警，不传返回全部</li> 
     * @return Filters <li>PolicyType - int - 是否必填：否 - 策略类型</li><li>PolicyName - string - 是否必填：否 - 策略名称</li><li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li><li>PolicyAction- int - 是否必填：否 - 策略动作</li><li>IsEnabled - int - 是否必填：否 - 是否生效</li><li>ContainerId - string - 是否必填：否 - 容器ID（精确/IN，容器维度筛选）</li><li>ClusterId - string - 是否必填：否 - 集群ID（精确/IN，容器维度筛选）</li><li>ClusterName - string - 是否必填：否 - 集群名称（前缀模糊）</li><li>ContainerName - string - 是否必填：否 - 容器名称（前缀模糊）</li><li>AlertSource - string - 是否必填：否 - 告警来源：HOST-主机告警 / CONTAINER-容器告警，不传返回全部</li>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>PolicyType - int - 是否必填：否 - 策略类型</li><li>PolicyName - string - 是否必填：否 - 策略名称</li><li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li><li>PolicyAction- int - 是否必填：否 - 策略动作</li><li>IsEnabled - int - 是否必填：否 - 是否生效</li><li>ContainerId - string - 是否必填：否 - 容器ID（精确/IN，容器维度筛选）</li><li>ClusterId - string - 是否必填：否 - 集群ID（精确/IN，容器维度筛选）</li><li>ClusterName - string - 是否必填：否 - 集群名称（前缀模糊）</li><li>ContainerName - string - 是否必填：否 - 容器名称（前缀模糊）</li><li>AlertSource - string - 是否必填：否 - 告警来源：HOST-主机告警 / CONTAINER-容器告警，不传返回全部</li>
     * @param Filters <li>PolicyType - int - 是否必填：否 - 策略类型</li><li>PolicyName - string - 是否必填：否 - 策略名称</li><li>Domain - string - 是否必填：否 - 域名(先对域名做urlencode,再base64)</li><li>PolicyAction- int - 是否必填：否 - 策略动作</li><li>IsEnabled - int - 是否必填：否 - 是否生效</li><li>ContainerId - string - 是否必填：否 - 容器ID（精确/IN，容器维度筛选）</li><li>ClusterId - string - 是否必填：否 - 集群ID（精确/IN，容器维度筛选）</li><li>ClusterName - string - 是否必填：否 - 集群名称（前缀模糊）</li><li>ContainerName - string - 是否必填：否 - 容器名称（前缀模糊）</li><li>AlertSource - string - 是否必填：否 - 告警来源：HOST-主机告警 / CONTAINER-容器告警，不传返回全部</li>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeEdrAlertCountForContainerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertCountForContainerRequest(DescribeEdrAlertCountForContainerRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.ContainerIds != null) {
            this.ContainerIds = new String[source.ContainerIds.length];
            for (int i = 0; i < source.ContainerIds.length; i++) {
                this.ContainerIds[i] = new String(source.ContainerIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "ContainerIds.", this.ContainerIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

