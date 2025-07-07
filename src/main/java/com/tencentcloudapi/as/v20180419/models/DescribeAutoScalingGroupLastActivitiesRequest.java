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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScalingGroupLastActivitiesRequest extends AbstractModel {

    /**
    * 伸缩组ID列表。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
    */
    @SerializedName("AutoScalingGroupIds")
    @Expose
    private String [] AutoScalingGroupIds;

    /**
    * 查询时排除取消类型活动。默认值为 false，表示不排除取消类型活动。
    */
    @SerializedName("ExcludeCancelledActivity")
    @Expose
    private Boolean ExcludeCancelledActivity;

    /**
     * Get 伸缩组ID列表。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。 
     * @return AutoScalingGroupIds 伸缩组ID列表。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
     */
    public String [] getAutoScalingGroupIds() {
        return this.AutoScalingGroupIds;
    }

    /**
     * Set 伸缩组ID列表。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
     * @param AutoScalingGroupIds 伸缩组ID列表。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
     */
    public void setAutoScalingGroupIds(String [] AutoScalingGroupIds) {
        this.AutoScalingGroupIds = AutoScalingGroupIds;
    }

    /**
     * Get 查询时排除取消类型活动。默认值为 false，表示不排除取消类型活动。 
     * @return ExcludeCancelledActivity 查询时排除取消类型活动。默认值为 false，表示不排除取消类型活动。
     */
    public Boolean getExcludeCancelledActivity() {
        return this.ExcludeCancelledActivity;
    }

    /**
     * Set 查询时排除取消类型活动。默认值为 false，表示不排除取消类型活动。
     * @param ExcludeCancelledActivity 查询时排除取消类型活动。默认值为 false，表示不排除取消类型活动。
     */
    public void setExcludeCancelledActivity(Boolean ExcludeCancelledActivity) {
        this.ExcludeCancelledActivity = ExcludeCancelledActivity;
    }

    public DescribeAutoScalingGroupLastActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingGroupLastActivitiesRequest(DescribeAutoScalingGroupLastActivitiesRequest source) {
        if (source.AutoScalingGroupIds != null) {
            this.AutoScalingGroupIds = new String[source.AutoScalingGroupIds.length];
            for (int i = 0; i < source.AutoScalingGroupIds.length; i++) {
                this.AutoScalingGroupIds[i] = new String(source.AutoScalingGroupIds[i]);
            }
        }
        if (source.ExcludeCancelledActivity != null) {
            this.ExcludeCancelledActivity = new Boolean(source.ExcludeCancelledActivity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoScalingGroupIds.", this.AutoScalingGroupIds);
        this.setParamSimple(map, prefix + "ExcludeCancelledActivity", this.ExcludeCancelledActivity);

    }
}

