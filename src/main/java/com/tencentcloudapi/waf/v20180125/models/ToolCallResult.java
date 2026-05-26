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

public class ToolCallResult extends AbstractModel {

    /**
    * <p>命中规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则动作</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>风险等级</p><p>枚举值：</p><ul><li>critical： 严重</li><li>high： 高危    </li><li>medium： 中危    </li><li>low： 低危</li></ul>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
     * Get <p>命中规则名称</p> 
     * @return RuleName <p>命中规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>命中规则名称</p>
     * @param RuleName <p>命中规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则动作</p> 
     * @return Action <p>规则动作</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>规则动作</p>
     * @param Action <p>规则动作</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>风险等级</p><p>枚举值：</p><ul><li>critical： 严重</li><li>high： 高危    </li><li>medium： 中危    </li><li>low： 低危</li></ul> 
     * @return Severity <p>风险等级</p><p>枚举值：</p><ul><li>critical： 严重</li><li>high： 高危    </li><li>medium： 中危    </li><li>low： 低危</li></ul>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>风险等级</p><p>枚举值：</p><ul><li>critical： 严重</li><li>high： 高危    </li><li>medium： 中危    </li><li>low： 低危</li></ul>
     * @param Severity <p>风险等级</p><p>枚举值：</p><ul><li>critical： 严重</li><li>high： 高危    </li><li>medium： 中危    </li><li>low： 低危</li></ul>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    public ToolCallResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolCallResult(ToolCallResult source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Severity", this.Severity);

    }
}

