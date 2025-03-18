/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRuleAutoUpdate extends AbstractModel {

    /**
    * 是否开启自动更新至最新版本。取值有：<li>on：开启</li><li>off：关闭</li>
    */
    @SerializedName("AutoUpdateToLatestVersion")
    @Expose
    private String AutoUpdateToLatestVersion;

    /**
    * 当前使用的版本，格式符合ISO 8601标准，如2023-12-21T12:00:32Z，默认为空，仅出参。
    */
    @SerializedName("RulesetVersion")
    @Expose
    private String RulesetVersion;

    /**
     * Get 是否开启自动更新至最新版本。取值有：<li>on：开启</li><li>off：关闭</li> 
     * @return AutoUpdateToLatestVersion 是否开启自动更新至最新版本。取值有：<li>on：开启</li><li>off：关闭</li>
     */
    public String getAutoUpdateToLatestVersion() {
        return this.AutoUpdateToLatestVersion;
    }

    /**
     * Set 是否开启自动更新至最新版本。取值有：<li>on：开启</li><li>off：关闭</li>
     * @param AutoUpdateToLatestVersion 是否开启自动更新至最新版本。取值有：<li>on：开启</li><li>off：关闭</li>
     */
    public void setAutoUpdateToLatestVersion(String AutoUpdateToLatestVersion) {
        this.AutoUpdateToLatestVersion = AutoUpdateToLatestVersion;
    }

    /**
     * Get 当前使用的版本，格式符合ISO 8601标准，如2023-12-21T12:00:32Z，默认为空，仅出参。 
     * @return RulesetVersion 当前使用的版本，格式符合ISO 8601标准，如2023-12-21T12:00:32Z，默认为空，仅出参。
     */
    public String getRulesetVersion() {
        return this.RulesetVersion;
    }

    /**
     * Set 当前使用的版本，格式符合ISO 8601标准，如2023-12-21T12:00:32Z，默认为空，仅出参。
     * @param RulesetVersion 当前使用的版本，格式符合ISO 8601标准，如2023-12-21T12:00:32Z，默认为空，仅出参。
     */
    public void setRulesetVersion(String RulesetVersion) {
        this.RulesetVersion = RulesetVersion;
    }

    public ManagedRuleAutoUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleAutoUpdate(ManagedRuleAutoUpdate source) {
        if (source.AutoUpdateToLatestVersion != null) {
            this.AutoUpdateToLatestVersion = new String(source.AutoUpdateToLatestVersion);
        }
        if (source.RulesetVersion != null) {
            this.RulesetVersion = new String(source.RulesetVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoUpdateToLatestVersion", this.AutoUpdateToLatestVersion);
        this.setParamSimple(map, prefix + "RulesetVersion", this.RulesetVersion);

    }
}

