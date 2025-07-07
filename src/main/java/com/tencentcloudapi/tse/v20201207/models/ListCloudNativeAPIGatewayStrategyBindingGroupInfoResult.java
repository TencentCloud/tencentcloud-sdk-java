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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCloudNativeAPIGatewayStrategyBindingGroupInfoResult extends AbstractModel {

    /**
    * 数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 云原生API网关实例策略绑定网关分组列表
    */
    @SerializedName("GroupInfos")
    @Expose
    private CloudNativeAPIGatewayStrategyBindingGroupInfo [] GroupInfos;

    /**
     * Get 数量 
     * @return TotalCount 数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数量
     * @param TotalCount 数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 云原生API网关实例策略绑定网关分组列表 
     * @return GroupInfos 云原生API网关实例策略绑定网关分组列表
     */
    public CloudNativeAPIGatewayStrategyBindingGroupInfo [] getGroupInfos() {
        return this.GroupInfos;
    }

    /**
     * Set 云原生API网关实例策略绑定网关分组列表
     * @param GroupInfos 云原生API网关实例策略绑定网关分组列表
     */
    public void setGroupInfos(CloudNativeAPIGatewayStrategyBindingGroupInfo [] GroupInfos) {
        this.GroupInfos = GroupInfos;
    }

    public ListCloudNativeAPIGatewayStrategyBindingGroupInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCloudNativeAPIGatewayStrategyBindingGroupInfoResult(ListCloudNativeAPIGatewayStrategyBindingGroupInfoResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.GroupInfos != null) {
            this.GroupInfos = new CloudNativeAPIGatewayStrategyBindingGroupInfo[source.GroupInfos.length];
            for (int i = 0; i < source.GroupInfos.length; i++) {
                this.GroupInfos[i] = new CloudNativeAPIGatewayStrategyBindingGroupInfo(source.GroupInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "GroupInfos.", this.GroupInfos);

    }
}

