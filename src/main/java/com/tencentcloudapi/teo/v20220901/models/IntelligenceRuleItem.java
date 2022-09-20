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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntelligenceRuleItem extends AbstractModel{

    /**
    * 智能分析标签，取值有：
<li>evil_bot：恶意bot；</li>
<li>suspect_bot：疑似bot；</li>
<li>good_bot：良好bot；</li>
<li>normal：正常请求。</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 触发智能分析标签对应的处置方式，取值有：
<li>drop：拦截；</li>
<li>trans：放行；</li>
<li>alg：Javascript挑战；</li>
<li>captcha：数字验证码；</li>
<li>monitor：观察。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 智能分析标签，取值有：
<li>evil_bot：恶意bot；</li>
<li>suspect_bot：疑似bot；</li>
<li>good_bot：良好bot；</li>
<li>normal：正常请求。</li> 
     * @return Label 智能分析标签，取值有：
<li>evil_bot：恶意bot；</li>
<li>suspect_bot：疑似bot；</li>
<li>good_bot：良好bot；</li>
<li>normal：正常请求。</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 智能分析标签，取值有：
<li>evil_bot：恶意bot；</li>
<li>suspect_bot：疑似bot；</li>
<li>good_bot：良好bot；</li>
<li>normal：正常请求。</li>
     * @param Label 智能分析标签，取值有：
<li>evil_bot：恶意bot；</li>
<li>suspect_bot：疑似bot；</li>
<li>good_bot：良好bot；</li>
<li>normal：正常请求。</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 触发智能分析标签对应的处置方式，取值有：
<li>drop：拦截；</li>
<li>trans：放行；</li>
<li>alg：Javascript挑战；</li>
<li>captcha：数字验证码；</li>
<li>monitor：观察。</li> 
     * @return Action 触发智能分析标签对应的处置方式，取值有：
<li>drop：拦截；</li>
<li>trans：放行；</li>
<li>alg：Javascript挑战；</li>
<li>captcha：数字验证码；</li>
<li>monitor：观察。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 触发智能分析标签对应的处置方式，取值有：
<li>drop：拦截；</li>
<li>trans：放行；</li>
<li>alg：Javascript挑战；</li>
<li>captcha：数字验证码；</li>
<li>monitor：观察。</li>
     * @param Action 触发智能分析标签对应的处置方式，取值有：
<li>drop：拦截；</li>
<li>trans：放行；</li>
<li>alg：Javascript挑战；</li>
<li>captcha：数字验证码；</li>
<li>monitor：观察。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public IntelligenceRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceRuleItem(IntelligenceRuleItem source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

