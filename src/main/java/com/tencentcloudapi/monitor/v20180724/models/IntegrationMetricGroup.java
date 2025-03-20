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

public class IntegrationMetricGroup extends AbstractModel {

    /**
    * 分组标识
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 指标详情
    */
    @SerializedName("Metrics")
    @Expose
    private IntegrationMetric [] Metrics;

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 分组标识 
     * @return Group 分组标识
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 分组标识
     * @param Group 分组标识
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 指标详情 
     * @return Metrics 指标详情
     */
    public IntegrationMetric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标详情
     * @param Metrics 指标详情
     */
    public void setMetrics(IntegrationMetric [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 分组名称 
     * @return GroupName 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
     * @param GroupName 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public IntegrationMetricGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationMetricGroup(IntegrationMetricGroup source) {
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Metrics != null) {
            this.Metrics = new IntegrationMetric[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new IntegrationMetric(source.Metrics[i]);
            }
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

