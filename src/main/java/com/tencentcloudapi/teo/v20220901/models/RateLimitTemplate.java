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

public class RateLimitTemplate extends AbstractModel{

    /**
    * 模板等级名称，取值有：
<li>sup_loose：超级宽松；</li>
<li>loose：宽松；</li>
<li>emergency：紧急；</li>
<li>normal：适中；</li>
<li>strict：严格；</li>
<li>close：关闭，仅精准速率限制生效。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 模板处置方式，取值有：
<li>alg：JavaScript挑战；</li>
<li>monitor：观察。</li>不填写默认取alg。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 模板值详情。仅出参返回。
    */
    @SerializedName("RateLimitTemplateDetail")
    @Expose
    private RateLimitTemplateDetail RateLimitTemplateDetail;

    /**
     * Get 模板等级名称，取值有：
<li>sup_loose：超级宽松；</li>
<li>loose：宽松；</li>
<li>emergency：紧急；</li>
<li>normal：适中；</li>
<li>strict：严格；</li>
<li>close：关闭，仅精准速率限制生效。</li> 
     * @return Mode 模板等级名称，取值有：
<li>sup_loose：超级宽松；</li>
<li>loose：宽松；</li>
<li>emergency：紧急；</li>
<li>normal：适中；</li>
<li>strict：严格；</li>
<li>close：关闭，仅精准速率限制生效。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模板等级名称，取值有：
<li>sup_loose：超级宽松；</li>
<li>loose：宽松；</li>
<li>emergency：紧急；</li>
<li>normal：适中；</li>
<li>strict：严格；</li>
<li>close：关闭，仅精准速率限制生效。</li>
     * @param Mode 模板等级名称，取值有：
<li>sup_loose：超级宽松；</li>
<li>loose：宽松；</li>
<li>emergency：紧急；</li>
<li>normal：适中；</li>
<li>strict：严格；</li>
<li>close：关闭，仅精准速率限制生效。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 模板处置方式，取值有：
<li>alg：JavaScript挑战；</li>
<li>monitor：观察。</li>不填写默认取alg。 
     * @return Action 模板处置方式，取值有：
<li>alg：JavaScript挑战；</li>
<li>monitor：观察。</li>不填写默认取alg。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 模板处置方式，取值有：
<li>alg：JavaScript挑战；</li>
<li>monitor：观察。</li>不填写默认取alg。
     * @param Action 模板处置方式，取值有：
<li>alg：JavaScript挑战；</li>
<li>monitor：观察。</li>不填写默认取alg。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 模板值详情。仅出参返回。 
     * @return RateLimitTemplateDetail 模板值详情。仅出参返回。
     */
    public RateLimitTemplateDetail getRateLimitTemplateDetail() {
        return this.RateLimitTemplateDetail;
    }

    /**
     * Set 模板值详情。仅出参返回。
     * @param RateLimitTemplateDetail 模板值详情。仅出参返回。
     */
    public void setRateLimitTemplateDetail(RateLimitTemplateDetail RateLimitTemplateDetail) {
        this.RateLimitTemplateDetail = RateLimitTemplateDetail;
    }

    public RateLimitTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitTemplate(RateLimitTemplate source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RateLimitTemplateDetail != null) {
            this.RateLimitTemplateDetail = new RateLimitTemplateDetail(source.RateLimitTemplateDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamObj(map, prefix + "RateLimitTemplateDetail.", this.RateLimitTemplateDetail);

    }
}

