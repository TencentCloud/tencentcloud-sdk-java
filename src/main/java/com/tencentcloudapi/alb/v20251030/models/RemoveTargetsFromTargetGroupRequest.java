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

public class RemoveTargetsFromTargetGroupRequest extends AbstractModel {

    /**
    * 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 需要从目标组移除的后端服务列表。单次请求最多移除 **50** 个后端服务。
    */
    @SerializedName("Targets")
    @Expose
    private TargetToRemove [] Targets;

    /**
    * 是否预览此次请求。 
- **false**（默认）：发送普通请求，直接移除后端服务。 
- **true**：发送预览请求，检查移除后端服务的参数、格式、业务限制等是否符合要求。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 目标组 ID，格式为 lbtg- 后接 8 位字母数字。 
     * @return TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     * @param TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 需要从目标组移除的后端服务列表。单次请求最多移除 **50** 个后端服务。 
     * @return Targets 需要从目标组移除的后端服务列表。单次请求最多移除 **50** 个后端服务。
     */
    public TargetToRemove [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 需要从目标组移除的后端服务列表。单次请求最多移除 **50** 个后端服务。
     * @param Targets 需要从目标组移除的后端服务列表。单次请求最多移除 **50** 个后端服务。
     */
    public void setTargets(TargetToRemove [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 是否预览此次请求。 
- **false**（默认）：发送普通请求，直接移除后端服务。 
- **true**：发送预览请求，检查移除后端服务的参数、格式、业务限制等是否符合要求。 
     * @return DryRun 是否预览此次请求。 
- **false**（默认）：发送普通请求，直接移除后端服务。 
- **true**：发送预览请求，检查移除后端服务的参数、格式、业务限制等是否符合要求。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否预览此次请求。 
- **false**（默认）：发送普通请求，直接移除后端服务。 
- **true**：发送预览请求，检查移除后端服务的参数、格式、业务限制等是否符合要求。
     * @param DryRun 是否预览此次请求。 
- **false**（默认）：发送普通请求，直接移除后端服务。 
- **true**：发送预览请求，检查移除后端服务的参数、格式、业务限制等是否符合要求。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public RemoveTargetsFromTargetGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveTargetsFromTargetGroupRequest(RemoveTargetsFromTargetGroupRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.Targets != null) {
            this.Targets = new TargetToRemove[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new TargetToRemove(source.Targets[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

