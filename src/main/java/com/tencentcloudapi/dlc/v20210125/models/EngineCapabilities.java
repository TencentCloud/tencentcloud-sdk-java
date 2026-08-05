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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineCapabilities extends AbstractModel {

    /**
    * <p>GPU 是否可选</p>
    */
    @SerializedName("GpuOptional")
    @Expose
    private Boolean GpuOptional;

    /**
    * <p>是否支持并行配置</p>
    */
    @SerializedName("SupportsParallelConfig")
    @Expose
    private Boolean SupportsParallelConfig;

    /**
    * <p>是否支持远程代码</p>
    */
    @SerializedName("SupportsRemoteCode")
    @Expose
    private Boolean SupportsRemoteCode;

    /**
    * <p>GPU 显存配置键名</p>
    */
    @SerializedName("GpuMemoryKey")
    @Expose
    private String GpuMemoryKey;

    /**
    * <p>并行配置键名列表</p>
    */
    @SerializedName("ParallelKeys")
    @Expose
    private ParallelKeyMapping [] ParallelKeys;

    /**
     * Get <p>GPU 是否可选</p> 
     * @return GpuOptional <p>GPU 是否可选</p>
     */
    public Boolean getGpuOptional() {
        return this.GpuOptional;
    }

    /**
     * Set <p>GPU 是否可选</p>
     * @param GpuOptional <p>GPU 是否可选</p>
     */
    public void setGpuOptional(Boolean GpuOptional) {
        this.GpuOptional = GpuOptional;
    }

    /**
     * Get <p>是否支持并行配置</p> 
     * @return SupportsParallelConfig <p>是否支持并行配置</p>
     */
    public Boolean getSupportsParallelConfig() {
        return this.SupportsParallelConfig;
    }

    /**
     * Set <p>是否支持并行配置</p>
     * @param SupportsParallelConfig <p>是否支持并行配置</p>
     */
    public void setSupportsParallelConfig(Boolean SupportsParallelConfig) {
        this.SupportsParallelConfig = SupportsParallelConfig;
    }

    /**
     * Get <p>是否支持远程代码</p> 
     * @return SupportsRemoteCode <p>是否支持远程代码</p>
     */
    public Boolean getSupportsRemoteCode() {
        return this.SupportsRemoteCode;
    }

    /**
     * Set <p>是否支持远程代码</p>
     * @param SupportsRemoteCode <p>是否支持远程代码</p>
     */
    public void setSupportsRemoteCode(Boolean SupportsRemoteCode) {
        this.SupportsRemoteCode = SupportsRemoteCode;
    }

    /**
     * Get <p>GPU 显存配置键名</p> 
     * @return GpuMemoryKey <p>GPU 显存配置键名</p>
     */
    public String getGpuMemoryKey() {
        return this.GpuMemoryKey;
    }

    /**
     * Set <p>GPU 显存配置键名</p>
     * @param GpuMemoryKey <p>GPU 显存配置键名</p>
     */
    public void setGpuMemoryKey(String GpuMemoryKey) {
        this.GpuMemoryKey = GpuMemoryKey;
    }

    /**
     * Get <p>并行配置键名列表</p> 
     * @return ParallelKeys <p>并行配置键名列表</p>
     */
    public ParallelKeyMapping [] getParallelKeys() {
        return this.ParallelKeys;
    }

    /**
     * Set <p>并行配置键名列表</p>
     * @param ParallelKeys <p>并行配置键名列表</p>
     */
    public void setParallelKeys(ParallelKeyMapping [] ParallelKeys) {
        this.ParallelKeys = ParallelKeys;
    }

    public EngineCapabilities() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineCapabilities(EngineCapabilities source) {
        if (source.GpuOptional != null) {
            this.GpuOptional = new Boolean(source.GpuOptional);
        }
        if (source.SupportsParallelConfig != null) {
            this.SupportsParallelConfig = new Boolean(source.SupportsParallelConfig);
        }
        if (source.SupportsRemoteCode != null) {
            this.SupportsRemoteCode = new Boolean(source.SupportsRemoteCode);
        }
        if (source.GpuMemoryKey != null) {
            this.GpuMemoryKey = new String(source.GpuMemoryKey);
        }
        if (source.ParallelKeys != null) {
            this.ParallelKeys = new ParallelKeyMapping[source.ParallelKeys.length];
            for (int i = 0; i < source.ParallelKeys.length; i++) {
                this.ParallelKeys[i] = new ParallelKeyMapping(source.ParallelKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GpuOptional", this.GpuOptional);
        this.setParamSimple(map, prefix + "SupportsParallelConfig", this.SupportsParallelConfig);
        this.setParamSimple(map, prefix + "SupportsRemoteCode", this.SupportsRemoteCode);
        this.setParamSimple(map, prefix + "GpuMemoryKey", this.GpuMemoryKey);
        this.setParamArrayObj(map, prefix + "ParallelKeys.", this.ParallelKeys);

    }
}

