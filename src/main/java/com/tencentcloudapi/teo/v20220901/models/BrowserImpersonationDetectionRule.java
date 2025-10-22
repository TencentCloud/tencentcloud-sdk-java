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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrowserImpersonationDetectionRule extends AbstractModel {

    /**
    * 浏览器伪造识别规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BrowserImpersonationDetection 参数中，Rules 列表中未包含的已有规则将被删除。</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 浏览器伪造识别规则的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 浏览器伪造识别规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 浏览器伪造识别规则的具体内容，其中仅支持请求方式（Method）、请求路径（Path）和请求 URL 的配置，需符合表达式语法，详细规范参见产品文档。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 浏览器伪造识别规则的处置方式，包括 Cookie 校验和会话跟踪配置以及客户端行为校验配置。
    */
    @SerializedName("Action")
    @Expose
    private BrowserImpersonationDetectionAction Action;

    /**
     * Get 浏览器伪造识别规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BrowserImpersonationDetection 参数中，Rules 列表中未包含的已有规则将被删除。</li> 
     * @return Id 浏览器伪造识别规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BrowserImpersonationDetection 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 浏览器伪造识别规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BrowserImpersonationDetection 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     * @param Id 浏览器伪造识别规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li><b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li><b>删除</b>已有规则：BrowserImpersonationDetection 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 浏览器伪造识别规则的名称。 
     * @return Name 浏览器伪造识别规则的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 浏览器伪造识别规则的名称。
     * @param Name 浏览器伪造识别规则的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 浏览器伪造识别规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 浏览器伪造识别规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 浏览器伪造识别规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 浏览器伪造识别规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 浏览器伪造识别规则的具体内容，其中仅支持请求方式（Method）、请求路径（Path）和请求 URL 的配置，需符合表达式语法，详细规范参见产品文档。 
     * @return Condition 浏览器伪造识别规则的具体内容，其中仅支持请求方式（Method）、请求路径（Path）和请求 URL 的配置，需符合表达式语法，详细规范参见产品文档。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 浏览器伪造识别规则的具体内容，其中仅支持请求方式（Method）、请求路径（Path）和请求 URL 的配置，需符合表达式语法，详细规范参见产品文档。
     * @param Condition 浏览器伪造识别规则的具体内容，其中仅支持请求方式（Method）、请求路径（Path）和请求 URL 的配置，需符合表达式语法，详细规范参见产品文档。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 浏览器伪造识别规则的处置方式，包括 Cookie 校验和会话跟踪配置以及客户端行为校验配置。 
     * @return Action 浏览器伪造识别规则的处置方式，包括 Cookie 校验和会话跟踪配置以及客户端行为校验配置。
     */
    public BrowserImpersonationDetectionAction getAction() {
        return this.Action;
    }

    /**
     * Set 浏览器伪造识别规则的处置方式，包括 Cookie 校验和会话跟踪配置以及客户端行为校验配置。
     * @param Action 浏览器伪造识别规则的处置方式，包括 Cookie 校验和会话跟踪配置以及客户端行为校验配置。
     */
    public void setAction(BrowserImpersonationDetectionAction Action) {
        this.Action = Action;
    }

    public BrowserImpersonationDetectionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowserImpersonationDetectionRule(BrowserImpersonationDetectionRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new BrowserImpersonationDetectionAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

