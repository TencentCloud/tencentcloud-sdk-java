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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotSceneOverviewResponse extends AbstractModel {

    /**
    * BOT总开关
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 场景总数
    */
    @SerializedName("SceneCount")
    @Expose
    private Long SceneCount;

    /**
    * 生效场景数
    */
    @SerializedName("ValidSceneCount")
    @Expose
    private Long ValidSceneCount;

    /**
    * 当前开启的、匹配范围为全局、优先级最高的场景
    */
    @SerializedName("CurrentGlobalScene")
    @Expose
    private GlobalSceneInfo CurrentGlobalScene;

    /**
    * 自定义规则总数，不包括BOT白名单
    */
    @SerializedName("CustomRuleNums")
    @Expose
    private Long CustomRuleNums;

    /**
    * 图灵盾开关状态
    */
    @SerializedName("TldStatus")
    @Expose
    private Boolean TldStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get BOT总开关 
     * @return Status BOT总开关
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set BOT总开关
     * @param Status BOT总开关
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 场景总数 
     * @return SceneCount 场景总数
     */
    public Long getSceneCount() {
        return this.SceneCount;
    }

    /**
     * Set 场景总数
     * @param SceneCount 场景总数
     */
    public void setSceneCount(Long SceneCount) {
        this.SceneCount = SceneCount;
    }

    /**
     * Get 生效场景数 
     * @return ValidSceneCount 生效场景数
     */
    public Long getValidSceneCount() {
        return this.ValidSceneCount;
    }

    /**
     * Set 生效场景数
     * @param ValidSceneCount 生效场景数
     */
    public void setValidSceneCount(Long ValidSceneCount) {
        this.ValidSceneCount = ValidSceneCount;
    }

    /**
     * Get 当前开启的、匹配范围为全局、优先级最高的场景 
     * @return CurrentGlobalScene 当前开启的、匹配范围为全局、优先级最高的场景
     */
    public GlobalSceneInfo getCurrentGlobalScene() {
        return this.CurrentGlobalScene;
    }

    /**
     * Set 当前开启的、匹配范围为全局、优先级最高的场景
     * @param CurrentGlobalScene 当前开启的、匹配范围为全局、优先级最高的场景
     */
    public void setCurrentGlobalScene(GlobalSceneInfo CurrentGlobalScene) {
        this.CurrentGlobalScene = CurrentGlobalScene;
    }

    /**
     * Get 自定义规则总数，不包括BOT白名单 
     * @return CustomRuleNums 自定义规则总数，不包括BOT白名单
     */
    public Long getCustomRuleNums() {
        return this.CustomRuleNums;
    }

    /**
     * Set 自定义规则总数，不包括BOT白名单
     * @param CustomRuleNums 自定义规则总数，不包括BOT白名单
     */
    public void setCustomRuleNums(Long CustomRuleNums) {
        this.CustomRuleNums = CustomRuleNums;
    }

    /**
     * Get 图灵盾开关状态 
     * @return TldStatus 图灵盾开关状态
     */
    public Boolean getTldStatus() {
        return this.TldStatus;
    }

    /**
     * Set 图灵盾开关状态
     * @param TldStatus 图灵盾开关状态
     */
    public void setTldStatus(Boolean TldStatus) {
        this.TldStatus = TldStatus;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBotSceneOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotSceneOverviewResponse(DescribeBotSceneOverviewResponse source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.SceneCount != null) {
            this.SceneCount = new Long(source.SceneCount);
        }
        if (source.ValidSceneCount != null) {
            this.ValidSceneCount = new Long(source.ValidSceneCount);
        }
        if (source.CurrentGlobalScene != null) {
            this.CurrentGlobalScene = new GlobalSceneInfo(source.CurrentGlobalScene);
        }
        if (source.CustomRuleNums != null) {
            this.CustomRuleNums = new Long(source.CustomRuleNums);
        }
        if (source.TldStatus != null) {
            this.TldStatus = new Boolean(source.TldStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SceneCount", this.SceneCount);
        this.setParamSimple(map, prefix + "ValidSceneCount", this.ValidSceneCount);
        this.setParamObj(map, prefix + "CurrentGlobalScene.", this.CurrentGlobalScene);
        this.setParamSimple(map, prefix + "CustomRuleNums", this.CustomRuleNums);
        this.setParamSimple(map, prefix + "TldStatus", this.TldStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

