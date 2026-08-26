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

public class InstallSandboxPluginRequest extends AbstractModel {

    /**
    * 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * 安装目标范围
入参限制：EffectType=INCLUDE 时 EffectAssets 必须非空；EffectType=EXCLUDE 时 EffectAssets 可为空数组（表示对全部 AI Agent 资产下发）
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
     * Get 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器 
     * @return BelongAssetType 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     * @param BelongAssetType 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get 安装目标范围
入参限制：EffectType=INCLUDE 时 EffectAssets 必须非空；EffectType=EXCLUDE 时 EffectAssets 可为空数组（表示对全部 AI Agent 资产下发） 
     * @return EffectScope 安装目标范围
入参限制：EffectType=INCLUDE 时 EffectAssets 必须非空；EffectType=EXCLUDE 时 EffectAssets 可为空数组（表示对全部 AI Agent 资产下发）
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set 安装目标范围
入参限制：EffectType=INCLUDE 时 EffectAssets 必须非空；EffectType=EXCLUDE 时 EffectAssets 可为空数组（表示对全部 AI Agent 资产下发）
     * @param EffectScope 安装目标范围
入参限制：EffectType=INCLUDE 时 EffectAssets 必须非空；EffectType=EXCLUDE 时 EffectAssets 可为空数组（表示对全部 AI Agent 资产下发）
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    public InstallSandboxPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallSandboxPluginRequest(InstallSandboxPluginRequest source) {
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);

    }
}

