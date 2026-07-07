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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultAction extends AbstractModel {

    /**
    * 转发目标组配置。创建监听器时转发动作中的目标组配置仅支持单个目标组。
    */
    @SerializedName("TargetGroupConfig")
    @Expose
    private TargetGroupConfig TargetGroupConfig;

    /**
    * 转发动作类型。创建监听器时，默认转发动作类型仅支持转发至目标组。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 转发目标组配置。创建监听器时转发动作中的目标组配置仅支持单个目标组。 
     * @return TargetGroupConfig 转发目标组配置。创建监听器时转发动作中的目标组配置仅支持单个目标组。
     */
    public TargetGroupConfig getTargetGroupConfig() {
        return this.TargetGroupConfig;
    }

    /**
     * Set 转发目标组配置。创建监听器时转发动作中的目标组配置仅支持单个目标组。
     * @param TargetGroupConfig 转发目标组配置。创建监听器时转发动作中的目标组配置仅支持单个目标组。
     */
    public void setTargetGroupConfig(TargetGroupConfig TargetGroupConfig) {
        this.TargetGroupConfig = TargetGroupConfig;
    }

    /**
     * Get 转发动作类型。创建监听器时，默认转发动作类型仅支持转发至目标组。 
     * @return Type 转发动作类型。创建监听器时，默认转发动作类型仅支持转发至目标组。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 转发动作类型。创建监听器时，默认转发动作类型仅支持转发至目标组。
     * @param Type 转发动作类型。创建监听器时，默认转发动作类型仅支持转发至目标组。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DefaultAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultAction(DefaultAction source) {
        if (source.TargetGroupConfig != null) {
            this.TargetGroupConfig = new TargetGroupConfig(source.TargetGroupConfig);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TargetGroupConfig.", this.TargetGroupConfig);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

