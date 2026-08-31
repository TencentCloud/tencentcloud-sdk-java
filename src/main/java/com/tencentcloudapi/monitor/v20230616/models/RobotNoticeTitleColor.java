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

public class RobotNoticeTitleColor extends AbstractModel {

    /**
    * <p>通知内容模版自定义标题颜色默认颜色</p>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>通知内容模版自定义标题颜色规则，label 匹配设置颜色</p>
    */
    @SerializedName("Rules")
    @Expose
    private RobotNoticeTitleColorRules [] Rules;

    /**
     * Get <p>通知内容模版自定义标题颜色默认颜色</p> 
     * @return Default <p>通知内容模版自定义标题颜色默认颜色</p>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>通知内容模版自定义标题颜色默认颜色</p>
     * @param Default <p>通知内容模版自定义标题颜色默认颜色</p>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>通知内容模版自定义标题颜色规则，label 匹配设置颜色</p> 
     * @return Rules <p>通知内容模版自定义标题颜色规则，label 匹配设置颜色</p>
     */
    public RobotNoticeTitleColorRules [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>通知内容模版自定义标题颜色规则，label 匹配设置颜色</p>
     * @param Rules <p>通知内容模版自定义标题颜色规则，label 匹配设置颜色</p>
     */
    public void setRules(RobotNoticeTitleColorRules [] Rules) {
        this.Rules = Rules;
    }

    public RobotNoticeTitleColor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RobotNoticeTitleColor(RobotNoticeTitleColor source) {
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Rules != null) {
            this.Rules = new RobotNoticeTitleColorRules[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RobotNoticeTitleColorRules(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

