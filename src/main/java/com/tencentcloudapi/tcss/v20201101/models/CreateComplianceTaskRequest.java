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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateComplianceTaskRequest extends AbstractModel{

    /**
    * 指定要扫描的资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
AssetTypeSet, PolicySetId, PeriodTaskId三个参数，必须要给其中一个参数填写有效的值。
    */
    @SerializedName("AssetTypeSet")
    @Expose
    private String [] AssetTypeSet;

    /**
    * 按照策略集ID指定的策略执行合规检查。
    */
    @SerializedName("PolicySetId")
    @Expose
    private Long PolicySetId;

    /**
    * 按照定时任务ID指定的策略执行合规检查。
    */
    @SerializedName("PeriodTaskId")
    @Expose
    private Long PeriodTaskId;

    /**
     * Get 指定要扫描的资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
AssetTypeSet, PolicySetId, PeriodTaskId三个参数，必须要给其中一个参数填写有效的值。 
     * @return AssetTypeSet 指定要扫描的资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
AssetTypeSet, PolicySetId, PeriodTaskId三个参数，必须要给其中一个参数填写有效的值。
     */
    public String [] getAssetTypeSet() {
        return this.AssetTypeSet;
    }

    /**
     * Set 指定要扫描的资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
AssetTypeSet, PolicySetId, PeriodTaskId三个参数，必须要给其中一个参数填写有效的值。
     * @param AssetTypeSet 指定要扫描的资产类型列表。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
AssetTypeSet, PolicySetId, PeriodTaskId三个参数，必须要给其中一个参数填写有效的值。
     */
    public void setAssetTypeSet(String [] AssetTypeSet) {
        this.AssetTypeSet = AssetTypeSet;
    }

    /**
     * Get 按照策略集ID指定的策略执行合规检查。 
     * @return PolicySetId 按照策略集ID指定的策略执行合规检查。
     */
    public Long getPolicySetId() {
        return this.PolicySetId;
    }

    /**
     * Set 按照策略集ID指定的策略执行合规检查。
     * @param PolicySetId 按照策略集ID指定的策略执行合规检查。
     */
    public void setPolicySetId(Long PolicySetId) {
        this.PolicySetId = PolicySetId;
    }

    /**
     * Get 按照定时任务ID指定的策略执行合规检查。 
     * @return PeriodTaskId 按照定时任务ID指定的策略执行合规检查。
     */
    public Long getPeriodTaskId() {
        return this.PeriodTaskId;
    }

    /**
     * Set 按照定时任务ID指定的策略执行合规检查。
     * @param PeriodTaskId 按照定时任务ID指定的策略执行合规检查。
     */
    public void setPeriodTaskId(Long PeriodTaskId) {
        this.PeriodTaskId = PeriodTaskId;
    }

    public CreateComplianceTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateComplianceTaskRequest(CreateComplianceTaskRequest source) {
        if (source.AssetTypeSet != null) {
            this.AssetTypeSet = new String[source.AssetTypeSet.length];
            for (int i = 0; i < source.AssetTypeSet.length; i++) {
                this.AssetTypeSet[i] = new String(source.AssetTypeSet[i]);
            }
        }
        if (source.PolicySetId != null) {
            this.PolicySetId = new Long(source.PolicySetId);
        }
        if (source.PeriodTaskId != null) {
            this.PeriodTaskId = new Long(source.PeriodTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetTypeSet.", this.AssetTypeSet);
        this.setParamSimple(map, prefix + "PolicySetId", this.PolicySetId);
        this.setParamSimple(map, prefix + "PeriodTaskId", this.PeriodTaskId);

    }
}

