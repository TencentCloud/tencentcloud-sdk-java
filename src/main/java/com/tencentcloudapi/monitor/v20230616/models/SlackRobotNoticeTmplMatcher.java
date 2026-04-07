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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlackRobotNoticeTmplMatcher extends AbstractModel {

    /**
    * <p>匹配状态 Invalid;<br>Trigger 告警触发; Recovery 告警恢复</p>
    */
    @SerializedName("MatchingStatus")
    @Expose
    private String [] MatchingStatus;

    /**
    * <p>模板配置</p>
    */
    @SerializedName("Template")
    @Expose
    private SlackRobotNoticeTmpl Template;

    /**
     * Get <p>匹配状态 Invalid;<br>Trigger 告警触发; Recovery 告警恢复</p> 
     * @return MatchingStatus <p>匹配状态 Invalid;<br>Trigger 告警触发; Recovery 告警恢复</p>
     */
    public String [] getMatchingStatus() {
        return this.MatchingStatus;
    }

    /**
     * Set <p>匹配状态 Invalid;<br>Trigger 告警触发; Recovery 告警恢复</p>
     * @param MatchingStatus <p>匹配状态 Invalid;<br>Trigger 告警触发; Recovery 告警恢复</p>
     */
    public void setMatchingStatus(String [] MatchingStatus) {
        this.MatchingStatus = MatchingStatus;
    }

    /**
     * Get <p>模板配置</p> 
     * @return Template <p>模板配置</p>
     */
    public SlackRobotNoticeTmpl getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>模板配置</p>
     * @param Template <p>模板配置</p>
     */
    public void setTemplate(SlackRobotNoticeTmpl Template) {
        this.Template = Template;
    }

    public SlackRobotNoticeTmplMatcher() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlackRobotNoticeTmplMatcher(SlackRobotNoticeTmplMatcher source) {
        if (source.MatchingStatus != null) {
            this.MatchingStatus = new String[source.MatchingStatus.length];
            for (int i = 0; i < source.MatchingStatus.length; i++) {
                this.MatchingStatus[i] = new String(source.MatchingStatus[i]);
            }
        }
        if (source.Template != null) {
            this.Template = new SlackRobotNoticeTmpl(source.Template);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MatchingStatus.", this.MatchingStatus);
        this.setParamObj(map, prefix + "Template.", this.Template);

    }
}

