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

public class RollbackInstanceRefreshRequest extends AbstractModel {

    /**
    * <p>伸缩组ID。可以通过以下方式获取可用的伸缩组ID： </p><li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li><li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * <p>刷新设置。</p>
    */
    @SerializedName("RefreshSettings")
    @Expose
    private RefreshSettings RefreshSettings;

    /**
    * <p>原始刷新活动 ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/99175">DescribeRefreshActivities</a> ，取返回信息中的 OriginRefreshActivityId 获取原始刷新活动ID。</p>
    */
    @SerializedName("OriginRefreshActivityId")
    @Expose
    private String OriginRefreshActivityId;

    /**
    * <p>刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。</p>
    */
    @SerializedName("RefreshMode")
    @Expose
    private String RefreshMode;

    /**
     * Get <p>伸缩组ID。可以通过以下方式获取可用的伸缩组ID： </p><li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li><li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li> 
     * @return AutoScalingGroupId <p>伸缩组ID。可以通过以下方式获取可用的伸缩组ID： </p><li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li><li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set <p>伸缩组ID。可以通过以下方式获取可用的伸缩组ID： </p><li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li><li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     * @param AutoScalingGroupId <p>伸缩组ID。可以通过以下方式获取可用的伸缩组ID： </p><li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li><li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get <p>刷新设置。</p> 
     * @return RefreshSettings <p>刷新设置。</p>
     */
    public RefreshSettings getRefreshSettings() {
        return this.RefreshSettings;
    }

    /**
     * Set <p>刷新设置。</p>
     * @param RefreshSettings <p>刷新设置。</p>
     */
    public void setRefreshSettings(RefreshSettings RefreshSettings) {
        this.RefreshSettings = RefreshSettings;
    }

    /**
     * Get <p>原始刷新活动 ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/99175">DescribeRefreshActivities</a> ，取返回信息中的 OriginRefreshActivityId 获取原始刷新活动ID。</p> 
     * @return OriginRefreshActivityId <p>原始刷新活动 ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/99175">DescribeRefreshActivities</a> ，取返回信息中的 OriginRefreshActivityId 获取原始刷新活动ID。</p>
     */
    public String getOriginRefreshActivityId() {
        return this.OriginRefreshActivityId;
    }

    /**
     * Set <p>原始刷新活动 ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/99175">DescribeRefreshActivities</a> ，取返回信息中的 OriginRefreshActivityId 获取原始刷新活动ID。</p>
     * @param OriginRefreshActivityId <p>原始刷新活动 ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/99175">DescribeRefreshActivities</a> ，取返回信息中的 OriginRefreshActivityId 获取原始刷新活动ID。</p>
     */
    public void setOriginRefreshActivityId(String OriginRefreshActivityId) {
        this.OriginRefreshActivityId = OriginRefreshActivityId;
    }

    /**
     * Get <p>刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。</p> 
     * @return RefreshMode <p>刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。</p>
     */
    public String getRefreshMode() {
        return this.RefreshMode;
    }

    /**
     * Set <p>刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。</p>
     * @param RefreshMode <p>刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。</p>
     */
    public void setRefreshMode(String RefreshMode) {
        this.RefreshMode = RefreshMode;
    }

    public RollbackInstanceRefreshRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackInstanceRefreshRequest(RollbackInstanceRefreshRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.RefreshSettings != null) {
            this.RefreshSettings = new RefreshSettings(source.RefreshSettings);
        }
        if (source.OriginRefreshActivityId != null) {
            this.OriginRefreshActivityId = new String(source.OriginRefreshActivityId);
        }
        if (source.RefreshMode != null) {
            this.RefreshMode = new String(source.RefreshMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamObj(map, prefix + "RefreshSettings.", this.RefreshSettings);
        this.setParamSimple(map, prefix + "OriginRefreshActivityId", this.OriginRefreshActivityId);
        this.setParamSimple(map, prefix + "RefreshMode", this.RefreshMode);

    }
}

