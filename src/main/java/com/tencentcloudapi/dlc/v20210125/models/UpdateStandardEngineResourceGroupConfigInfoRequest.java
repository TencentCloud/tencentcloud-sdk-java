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

public class UpdateStandardEngineResourceGroupConfigInfoRequest extends AbstractModel {

    /**
    * 引擎资源组名称
    */
    @SerializedName("EngineResourceGroupName")
    @Expose
    private String EngineResourceGroupName;

    /**
    * 需要更新的配置
    */
    @SerializedName("UpdateConfContext")
    @Expose
    private UpdateConfContext [] UpdateConfContext;

    /**
    * 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
    */
    @SerializedName("IsEffectiveNow")
    @Expose
    private Long IsEffectiveNow;

    /**
     * Get 引擎资源组名称 
     * @return EngineResourceGroupName 引擎资源组名称
     */
    public String getEngineResourceGroupName() {
        return this.EngineResourceGroupName;
    }

    /**
     * Set 引擎资源组名称
     * @param EngineResourceGroupName 引擎资源组名称
     */
    public void setEngineResourceGroupName(String EngineResourceGroupName) {
        this.EngineResourceGroupName = EngineResourceGroupName;
    }

    /**
     * Get 需要更新的配置 
     * @return UpdateConfContext 需要更新的配置
     */
    public UpdateConfContext [] getUpdateConfContext() {
        return this.UpdateConfContext;
    }

    /**
     * Set 需要更新的配置
     * @param UpdateConfContext 需要更新的配置
     */
    public void setUpdateConfContext(UpdateConfContext [] UpdateConfContext) {
        this.UpdateConfContext = UpdateConfContext;
    }

    /**
     * Get 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效 
     * @return IsEffectiveNow 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     */
    public Long getIsEffectiveNow() {
        return this.IsEffectiveNow;
    }

    /**
     * Set 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     * @param IsEffectiveNow 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     */
    public void setIsEffectiveNow(Long IsEffectiveNow) {
        this.IsEffectiveNow = IsEffectiveNow;
    }

    public UpdateStandardEngineResourceGroupConfigInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateStandardEngineResourceGroupConfigInfoRequest(UpdateStandardEngineResourceGroupConfigInfoRequest source) {
        if (source.EngineResourceGroupName != null) {
            this.EngineResourceGroupName = new String(source.EngineResourceGroupName);
        }
        if (source.UpdateConfContext != null) {
            this.UpdateConfContext = new UpdateConfContext[source.UpdateConfContext.length];
            for (int i = 0; i < source.UpdateConfContext.length; i++) {
                this.UpdateConfContext[i] = new UpdateConfContext(source.UpdateConfContext[i]);
            }
        }
        if (source.IsEffectiveNow != null) {
            this.IsEffectiveNow = new Long(source.IsEffectiveNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineResourceGroupName", this.EngineResourceGroupName);
        this.setParamArrayObj(map, prefix + "UpdateConfContext.", this.UpdateConfContext);
        this.setParamSimple(map, prefix + "IsEffectiveNow", this.IsEffectiveNow);

    }
}

