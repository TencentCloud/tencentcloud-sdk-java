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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaInstancesResponse extends AbstractModel{

    /**
    * 已废弃，请使用 Instances
    */
    @SerializedName("InstanceSet")
    @Expose
    private GrafanaInstanceInfo [] InstanceSet;

    /**
    * 符合查询条件的实例总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实例列表
    */
    @SerializedName("Instances")
    @Expose
    private GrafanaInstanceInfo [] Instances;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已废弃，请使用 Instances 
     * @return InstanceSet 已废弃，请使用 Instances
     */
    public GrafanaInstanceInfo [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 已废弃，请使用 Instances
     * @param InstanceSet 已废弃，请使用 Instances
     */
    public void setInstanceSet(GrafanaInstanceInfo [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get 符合查询条件的实例总数 
     * @return TotalCount 符合查询条件的实例总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合查询条件的实例总数
     * @param TotalCount 符合查询条件的实例总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实例列表 
     * @return Instances 实例列表
     */
    public GrafanaInstanceInfo [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例列表
     * @param Instances 实例列表
     */
    public void setInstances(GrafanaInstanceInfo [] Instances) {
        this.Instances = Instances;
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

    public DescribeGrafanaInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaInstancesResponse(DescribeGrafanaInstancesResponse source) {
        if (source.InstanceSet != null) {
            this.InstanceSet = new GrafanaInstanceInfo[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new GrafanaInstanceInfo(source.InstanceSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Instances != null) {
            this.Instances = new GrafanaInstanceInfo[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new GrafanaInstanceInfo(source.Instances[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

