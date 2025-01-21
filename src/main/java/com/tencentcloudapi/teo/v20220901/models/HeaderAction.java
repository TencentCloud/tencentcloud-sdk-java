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

public class HeaderAction extends AbstractModel {

    /**
    * HTTP 头部设置方式。取值有：
<li>set：设置。变更指定头部参数的取值为设置后的值；</li>
<li>del：删除。删除指定的头部参数；</li>
<li>add：增加。增加指定的头部参数。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * HTTP 头部名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * HTTP 头部值。当 Action 取值为 set 或者 add 时，该参数必填；当 Action 取值为 del 时，该参数无需填写。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get HTTP 头部设置方式。取值有：
<li>set：设置。变更指定头部参数的取值为设置后的值；</li>
<li>del：删除。删除指定的头部参数；</li>
<li>add：增加。增加指定的头部参数。</li> 
     * @return Action HTTP 头部设置方式。取值有：
<li>set：设置。变更指定头部参数的取值为设置后的值；</li>
<li>del：删除。删除指定的头部参数；</li>
<li>add：增加。增加指定的头部参数。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set HTTP 头部设置方式。取值有：
<li>set：设置。变更指定头部参数的取值为设置后的值；</li>
<li>del：删除。删除指定的头部参数；</li>
<li>add：增加。增加指定的头部参数。</li>
     * @param Action HTTP 头部设置方式。取值有：
<li>set：设置。变更指定头部参数的取值为设置后的值；</li>
<li>del：删除。删除指定的头部参数；</li>
<li>add：增加。增加指定的头部参数。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get HTTP 头部名称。 
     * @return Name HTTP 头部名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set HTTP 头部名称。
     * @param Name HTTP 头部名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get HTTP 头部值。当 Action 取值为 set 或者 add 时，该参数必填；当 Action 取值为 del 时，该参数无需填写。 
     * @return Value HTTP 头部值。当 Action 取值为 set 或者 add 时，该参数必填；当 Action 取值为 del 时，该参数无需填写。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set HTTP 头部值。当 Action 取值为 set 或者 add 时，该参数必填；当 Action 取值为 del 时，该参数无需填写。
     * @param Value HTTP 头部值。当 Action 取值为 set 或者 add 时，该参数必填；当 Action 取值为 del 时，该参数无需填写。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public HeaderAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeaderAction(HeaderAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

