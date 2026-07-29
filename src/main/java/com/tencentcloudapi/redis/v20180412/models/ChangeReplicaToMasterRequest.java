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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeReplicaToMasterRequest extends AbstractModel {

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>副本节点组 ID，请通过接口<a href="https://cloud.tencent.com/document/product/239/50312">DescribeInstanceZoneInfo</a>获取多 AZ备节点组的 ID 信息。单 AZ，则无需配置该参数。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>紧急模式。</p><p>枚举值：</p><ul><li>false： 标准模式（安全推荐）</li><li>true： 极速模式：（高危加速）跳过校验、极速提主。高位操作，极易在异常情况下产生单主节点。</li></ul><p>默认值：false</p>
    */
    @SerializedName("Emergency")
    @Expose
    private Boolean Emergency;

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>副本节点组 ID，请通过接口<a href="https://cloud.tencent.com/document/product/239/50312">DescribeInstanceZoneInfo</a>获取多 AZ备节点组的 ID 信息。单 AZ，则无需配置该参数。</p> 
     * @return GroupId <p>副本节点组 ID，请通过接口<a href="https://cloud.tencent.com/document/product/239/50312">DescribeInstanceZoneInfo</a>获取多 AZ备节点组的 ID 信息。单 AZ，则无需配置该参数。</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>副本节点组 ID，请通过接口<a href="https://cloud.tencent.com/document/product/239/50312">DescribeInstanceZoneInfo</a>获取多 AZ备节点组的 ID 信息。单 AZ，则无需配置该参数。</p>
     * @param GroupId <p>副本节点组 ID，请通过接口<a href="https://cloud.tencent.com/document/product/239/50312">DescribeInstanceZoneInfo</a>获取多 AZ备节点组的 ID 信息。单 AZ，则无需配置该参数。</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>紧急模式。</p><p>枚举值：</p><ul><li>false： 标准模式（安全推荐）</li><li>true： 极速模式：（高危加速）跳过校验、极速提主。高位操作，极易在异常情况下产生单主节点。</li></ul><p>默认值：false</p> 
     * @return Emergency <p>紧急模式。</p><p>枚举值：</p><ul><li>false： 标准模式（安全推荐）</li><li>true： 极速模式：（高危加速）跳过校验、极速提主。高位操作，极易在异常情况下产生单主节点。</li></ul><p>默认值：false</p>
     */
    public Boolean getEmergency() {
        return this.Emergency;
    }

    /**
     * Set <p>紧急模式。</p><p>枚举值：</p><ul><li>false： 标准模式（安全推荐）</li><li>true： 极速模式：（高危加速）跳过校验、极速提主。高位操作，极易在异常情况下产生单主节点。</li></ul><p>默认值：false</p>
     * @param Emergency <p>紧急模式。</p><p>枚举值：</p><ul><li>false： 标准模式（安全推荐）</li><li>true： 极速模式：（高危加速）跳过校验、极速提主。高位操作，极易在异常情况下产生单主节点。</li></ul><p>默认值：false</p>
     */
    public void setEmergency(Boolean Emergency) {
        this.Emergency = Emergency;
    }

    public ChangeReplicaToMasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeReplicaToMasterRequest(ChangeReplicaToMasterRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Emergency != null) {
            this.Emergency = new Boolean(source.Emergency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Emergency", this.Emergency);

    }
}

