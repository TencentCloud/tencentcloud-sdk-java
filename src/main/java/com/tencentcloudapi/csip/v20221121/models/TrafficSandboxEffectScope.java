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

public class TrafficSandboxEffectScope extends AbstractModel {

    /**
    * 生效模式
枚举值：
INCLUDE：指定资产生效
EXCLUDE：剔除指定资产（默认全部生效）
    */
    @SerializedName("EffectType")
    @Expose
    private String EffectType;

    /**
    * 生效资产列表
入参限制：EffectType=INCLUDE 时必填且非空；EffectType=EXCLUDE 时可传空数组
    */
    @SerializedName("EffectAssets")
    @Expose
    private TrafficSandboxAssetScope [] EffectAssets;

    /**
     * Get 生效模式
枚举值：
INCLUDE：指定资产生效
EXCLUDE：剔除指定资产（默认全部生效） 
     * @return EffectType 生效模式
枚举值：
INCLUDE：指定资产生效
EXCLUDE：剔除指定资产（默认全部生效）
     */
    public String getEffectType() {
        return this.EffectType;
    }

    /**
     * Set 生效模式
枚举值：
INCLUDE：指定资产生效
EXCLUDE：剔除指定资产（默认全部生效）
     * @param EffectType 生效模式
枚举值：
INCLUDE：指定资产生效
EXCLUDE：剔除指定资产（默认全部生效）
     */
    public void setEffectType(String EffectType) {
        this.EffectType = EffectType;
    }

    /**
     * Get 生效资产列表
入参限制：EffectType=INCLUDE 时必填且非空；EffectType=EXCLUDE 时可传空数组 
     * @return EffectAssets 生效资产列表
入参限制：EffectType=INCLUDE 时必填且非空；EffectType=EXCLUDE 时可传空数组
     */
    public TrafficSandboxAssetScope [] getEffectAssets() {
        return this.EffectAssets;
    }

    /**
     * Set 生效资产列表
入参限制：EffectType=INCLUDE 时必填且非空；EffectType=EXCLUDE 时可传空数组
     * @param EffectAssets 生效资产列表
入参限制：EffectType=INCLUDE 时必填且非空；EffectType=EXCLUDE 时可传空数组
     */
    public void setEffectAssets(TrafficSandboxAssetScope [] EffectAssets) {
        this.EffectAssets = EffectAssets;
    }

    public TrafficSandboxEffectScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxEffectScope(TrafficSandboxEffectScope source) {
        if (source.EffectType != null) {
            this.EffectType = new String(source.EffectType);
        }
        if (source.EffectAssets != null) {
            this.EffectAssets = new TrafficSandboxAssetScope[source.EffectAssets.length];
            for (int i = 0; i < source.EffectAssets.length; i++) {
                this.EffectAssets[i] = new TrafficSandboxAssetScope(source.EffectAssets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EffectType", this.EffectType);
        this.setParamArrayObj(map, prefix + "EffectAssets.", this.EffectAssets);

    }
}

