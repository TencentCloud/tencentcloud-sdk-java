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

public class StandardEngineResourceGroupConfigInfo extends AbstractModel {

    /**
    * 引擎资源组 ID
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 引擎ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 资源组静态参数，需要重启资源组生效
    */
    @SerializedName("StaticConfigPairs")
    @Expose
    private EngineResourceGroupConfigPair [] StaticConfigPairs;

    /**
    * 资源组动态参数，下一个任务生效。
    */
    @SerializedName("DynamicConfigPairs")
    @Expose
    private EngineResourceGroupConfigPair [] DynamicConfigPairs;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 引擎资源组 ID 
     * @return ResourceGroupId 引擎资源组 ID
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 引擎资源组 ID
     * @param ResourceGroupId 引擎资源组 ID
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 引擎ID 
     * @return DataEngineId 引擎ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎ID
     * @param DataEngineId 引擎ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 资源组静态参数，需要重启资源组生效 
     * @return StaticConfigPairs 资源组静态参数，需要重启资源组生效
     */
    public EngineResourceGroupConfigPair [] getStaticConfigPairs() {
        return this.StaticConfigPairs;
    }

    /**
     * Set 资源组静态参数，需要重启资源组生效
     * @param StaticConfigPairs 资源组静态参数，需要重启资源组生效
     */
    public void setStaticConfigPairs(EngineResourceGroupConfigPair [] StaticConfigPairs) {
        this.StaticConfigPairs = StaticConfigPairs;
    }

    /**
     * Get 资源组动态参数，下一个任务生效。 
     * @return DynamicConfigPairs 资源组动态参数，下一个任务生效。
     */
    public EngineResourceGroupConfigPair [] getDynamicConfigPairs() {
        return this.DynamicConfigPairs;
    }

    /**
     * Set 资源组动态参数，下一个任务生效。
     * @param DynamicConfigPairs 资源组动态参数，下一个任务生效。
     */
    public void setDynamicConfigPairs(EngineResourceGroupConfigPair [] DynamicConfigPairs) {
        this.DynamicConfigPairs = DynamicConfigPairs;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public StandardEngineResourceGroupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardEngineResourceGroupConfigInfo(StandardEngineResourceGroupConfigInfo source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.StaticConfigPairs != null) {
            this.StaticConfigPairs = new EngineResourceGroupConfigPair[source.StaticConfigPairs.length];
            for (int i = 0; i < source.StaticConfigPairs.length; i++) {
                this.StaticConfigPairs[i] = new EngineResourceGroupConfigPair(source.StaticConfigPairs[i]);
            }
        }
        if (source.DynamicConfigPairs != null) {
            this.DynamicConfigPairs = new EngineResourceGroupConfigPair[source.DynamicConfigPairs.length];
            for (int i = 0; i < source.DynamicConfigPairs.length; i++) {
                this.DynamicConfigPairs[i] = new EngineResourceGroupConfigPair(source.DynamicConfigPairs[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamArrayObj(map, prefix + "StaticConfigPairs.", this.StaticConfigPairs);
        this.setParamArrayObj(map, prefix + "DynamicConfigPairs.", this.DynamicConfigPairs);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

