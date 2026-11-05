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

public class VulFixableMachineAction extends AbstractModel {

    /**
    * 动作类型
枚举值：
UPGRADE_PROTECTION：升级防护
REINSTALL_CLIENT：重新安装客户端
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 动作按钮文案
    */
    @SerializedName("ActionText")
    @Expose
    private String ActionText;

    /**
     * Get 动作类型
枚举值：
UPGRADE_PROTECTION：升级防护
REINSTALL_CLIENT：重新安装客户端 
     * @return ActionType 动作类型
枚举值：
UPGRADE_PROTECTION：升级防护
REINSTALL_CLIENT：重新安装客户端
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型
枚举值：
UPGRADE_PROTECTION：升级防护
REINSTALL_CLIENT：重新安装客户端
     * @param ActionType 动作类型
枚举值：
UPGRADE_PROTECTION：升级防护
REINSTALL_CLIENT：重新安装客户端
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 动作按钮文案 
     * @return ActionText 动作按钮文案
     */
    public String getActionText() {
        return this.ActionText;
    }

    /**
     * Set 动作按钮文案
     * @param ActionText 动作按钮文案
     */
    public void setActionText(String ActionText) {
        this.ActionText = ActionText;
    }

    public VulFixableMachineAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixableMachineAction(VulFixableMachineAction source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionText != null) {
            this.ActionText = new String(source.ActionText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionText", this.ActionText);

    }
}

