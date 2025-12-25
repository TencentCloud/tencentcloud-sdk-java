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

public class SetInstancesProtectionRequest extends AbstractModel {

    /**
    * <p>伸缩组ID。可以通过如下方式获取可用的伸缩组ID:<li>通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 查询伸缩组ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/377/20438">DescribeAutoScalingGroups</a> ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li></p>
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * <p>实例ID。可以通过以下方式获取可用的实例ID：<li>通过登录<a href="https://console.cloud.tencent.com/cvm/index">控制台</a>查询实例ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> ，取返回信息中的 <code>InstanceId</code> 获取实例ID。</li></p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>实例是否需要设置保护。</p>
    */
    @SerializedName("ProtectedFromScaleIn")
    @Expose
    private Boolean ProtectedFromScaleIn;

    /**
     * Get <p>伸缩组ID。可以通过如下方式获取可用的伸缩组ID:<li>通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 查询伸缩组ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/377/20438">DescribeAutoScalingGroups</a> ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li></p> 
     * @return AutoScalingGroupId <p>伸缩组ID。可以通过如下方式获取可用的伸缩组ID:<li>通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 查询伸缩组ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/377/20438">DescribeAutoScalingGroups</a> ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li></p>
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set <p>伸缩组ID。可以通过如下方式获取可用的伸缩组ID:<li>通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 查询伸缩组ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/377/20438">DescribeAutoScalingGroups</a> ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li></p>
     * @param AutoScalingGroupId <p>伸缩组ID。可以通过如下方式获取可用的伸缩组ID:<li>通过登录 <a href="https://console.cloud.tencent.com/autoscaling/group">控制台</a> 查询伸缩组ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/377/20438">DescribeAutoScalingGroups</a> ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li></p>
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get <p>实例ID。可以通过以下方式获取可用的实例ID：<li>通过登录<a href="https://console.cloud.tencent.com/cvm/index">控制台</a>查询实例ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> ，取返回信息中的 <code>InstanceId</code> 获取实例ID。</li></p> 
     * @return InstanceIds <p>实例ID。可以通过以下方式获取可用的实例ID：<li>通过登录<a href="https://console.cloud.tencent.com/cvm/index">控制台</a>查询实例ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> ，取返回信息中的 <code>InstanceId</code> 获取实例ID。</li></p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例ID。可以通过以下方式获取可用的实例ID：<li>通过登录<a href="https://console.cloud.tencent.com/cvm/index">控制台</a>查询实例ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> ，取返回信息中的 <code>InstanceId</code> 获取实例ID。</li></p>
     * @param InstanceIds <p>实例ID。可以通过以下方式获取可用的实例ID：<li>通过登录<a href="https://console.cloud.tencent.com/cvm/index">控制台</a>查询实例ID。</li><li>通过调用接口 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> ，取返回信息中的 <code>InstanceId</code> 获取实例ID。</li></p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>实例是否需要设置保护。</p> 
     * @return ProtectedFromScaleIn <p>实例是否需要设置保护。</p>
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * Set <p>实例是否需要设置保护。</p>
     * @param ProtectedFromScaleIn <p>实例是否需要设置保护。</p>
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    public SetInstancesProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetInstancesProtectionRequest(SetInstancesProtectionRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ProtectedFromScaleIn != null) {
            this.ProtectedFromScaleIn = new Boolean(source.ProtectedFromScaleIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProtectedFromScaleIn", this.ProtectedFromScaleIn);

    }
}

