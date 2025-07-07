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

public class CustomField extends AbstractModel {

    /**
    * 自定义日志字段类型。从 HTTP 请求和响应中的指定位置提取数据，取值有：
<li>ReqHeader：从 HTTP 请求头中提取指定字段值；</li>
<li>RspHeader：从 HTTP 响应头中提取指定字段值；</li>
<li>Cookie: 从 Cookie 中提取指定字段值；</li>
<li>ReqBody: 从 HTTP 请求正文中通过 Google RE2 正则表达式提取指定内容。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 根据字段类型（Name）填入字段值的定义。需要区分大小写。
<li>当字段类型为 ReqHeader、RspHeader、Cookie 时，填入需要提取值的参数名称，例如：Accept-Language。可输入 1-100 个字符，允许的字符开头为字母，中间为字母、数字、-，结尾为字母、数字；</li>
<li>当字段类型为 ReqBody 时，填入 Google RE2 正则表达式，正则表达式长度上限为 4KB。</li>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 是否投递该字段，不填表示不投递此字段。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 自定义日志字段类型。从 HTTP 请求和响应中的指定位置提取数据，取值有：
<li>ReqHeader：从 HTTP 请求头中提取指定字段值；</li>
<li>RspHeader：从 HTTP 响应头中提取指定字段值；</li>
<li>Cookie: 从 Cookie 中提取指定字段值；</li>
<li>ReqBody: 从 HTTP 请求正文中通过 Google RE2 正则表达式提取指定内容。</li> 
     * @return Name 自定义日志字段类型。从 HTTP 请求和响应中的指定位置提取数据，取值有：
<li>ReqHeader：从 HTTP 请求头中提取指定字段值；</li>
<li>RspHeader：从 HTTP 响应头中提取指定字段值；</li>
<li>Cookie: 从 Cookie 中提取指定字段值；</li>
<li>ReqBody: 从 HTTP 请求正文中通过 Google RE2 正则表达式提取指定内容。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义日志字段类型。从 HTTP 请求和响应中的指定位置提取数据，取值有：
<li>ReqHeader：从 HTTP 请求头中提取指定字段值；</li>
<li>RspHeader：从 HTTP 响应头中提取指定字段值；</li>
<li>Cookie: 从 Cookie 中提取指定字段值；</li>
<li>ReqBody: 从 HTTP 请求正文中通过 Google RE2 正则表达式提取指定内容。</li>
     * @param Name 自定义日志字段类型。从 HTTP 请求和响应中的指定位置提取数据，取值有：
<li>ReqHeader：从 HTTP 请求头中提取指定字段值；</li>
<li>RspHeader：从 HTTP 响应头中提取指定字段值；</li>
<li>Cookie: 从 Cookie 中提取指定字段值；</li>
<li>ReqBody: 从 HTTP 请求正文中通过 Google RE2 正则表达式提取指定内容。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 根据字段类型（Name）填入字段值的定义。需要区分大小写。
<li>当字段类型为 ReqHeader、RspHeader、Cookie 时，填入需要提取值的参数名称，例如：Accept-Language。可输入 1-100 个字符，允许的字符开头为字母，中间为字母、数字、-，结尾为字母、数字；</li>
<li>当字段类型为 ReqBody 时，填入 Google RE2 正则表达式，正则表达式长度上限为 4KB。</li> 
     * @return Value 根据字段类型（Name）填入字段值的定义。需要区分大小写。
<li>当字段类型为 ReqHeader、RspHeader、Cookie 时，填入需要提取值的参数名称，例如：Accept-Language。可输入 1-100 个字符，允许的字符开头为字母，中间为字母、数字、-，结尾为字母、数字；</li>
<li>当字段类型为 ReqBody 时，填入 Google RE2 正则表达式，正则表达式长度上限为 4KB。</li>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 根据字段类型（Name）填入字段值的定义。需要区分大小写。
<li>当字段类型为 ReqHeader、RspHeader、Cookie 时，填入需要提取值的参数名称，例如：Accept-Language。可输入 1-100 个字符，允许的字符开头为字母，中间为字母、数字、-，结尾为字母、数字；</li>
<li>当字段类型为 ReqBody 时，填入 Google RE2 正则表达式，正则表达式长度上限为 4KB。</li>
     * @param Value 根据字段类型（Name）填入字段值的定义。需要区分大小写。
<li>当字段类型为 ReqHeader、RspHeader、Cookie 时，填入需要提取值的参数名称，例如：Accept-Language。可输入 1-100 个字符，允许的字符开头为字母，中间为字母、数字、-，结尾为字母、数字；</li>
<li>当字段类型为 ReqBody 时，填入 Google RE2 正则表达式，正则表达式长度上限为 4KB。</li>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 是否投递该字段，不填表示不投递此字段。 
     * @return Enabled 是否投递该字段，不填表示不投递此字段。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否投递该字段，不填表示不投递此字段。
     * @param Enabled 是否投递该字段，不填表示不投递此字段。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CustomField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomField(CustomField source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

