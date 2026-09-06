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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBCustomNodesDisasterRecoverGroupRequest extends AbstractModel {

    /**
    * <p>节点ID</p><p>入参限制：单次数量上限为100</p>
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
    * <p>置放群组ID</p><p>入参限制：支持传一个ID</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>是否强制更换节点宿主机</p><p>枚举值：</p><ul><li>true： 表示允许节点更换宿主机，允许重启。本地盘节点不支持指定此参数。</li><li>false： 不允许节点更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li></ul><p>默认值：false</p>
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get <p>节点ID</p><p>入参限制：单次数量上限为100</p> 
     * @return NodeIds <p>节点ID</p><p>入参限制：单次数量上限为100</p>
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set <p>节点ID</p><p>入参限制：单次数量上限为100</p>
     * @param NodeIds <p>节点ID</p><p>入参限制：单次数量上限为100</p>
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    /**
     * Get <p>置放群组ID</p><p>入参限制：支持传一个ID</p> 
     * @return DisasterRecoverGroupIds <p>置放群组ID</p><p>入参限制：支持传一个ID</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>置放群组ID</p><p>入参限制：支持传一个ID</p>
     * @param DisasterRecoverGroupIds <p>置放群组ID</p><p>入参限制：支持传一个ID</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>是否强制更换节点宿主机</p><p>枚举值：</p><ul><li>true： 表示允许节点更换宿主机，允许重启。本地盘节点不支持指定此参数。</li><li>false： 不允许节点更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li></ul><p>默认值：false</p> 
     * @return Force <p>是否强制更换节点宿主机</p><p>枚举值：</p><ul><li>true： 表示允许节点更换宿主机，允许重启。本地盘节点不支持指定此参数。</li><li>false： 不允许节点更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li></ul><p>默认值：false</p>
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set <p>是否强制更换节点宿主机</p><p>枚举值：</p><ul><li>true： 表示允许节点更换宿主机，允许重启。本地盘节点不支持指定此参数。</li><li>false： 不允许节点更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li></ul><p>默认值：false</p>
     * @param Force <p>是否强制更换节点宿主机</p><p>枚举值：</p><ul><li>true： 表示允许节点更换宿主机，允许重启。本地盘节点不支持指定此参数。</li><li>false： 不允许节点更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li></ul><p>默认值：false</p>
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public ModifyDBCustomNodesDisasterRecoverGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBCustomNodesDisasterRecoverGroupRequest(ModifyDBCustomNodesDisasterRecoverGroupRequest source) {
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

