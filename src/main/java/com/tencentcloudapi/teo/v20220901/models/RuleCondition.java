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

public class RuleCondition extends AbstractModel{

    /**
    * 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于；</li>
<li> exist: 存在； </li>
<li> notexist: 不存在。</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 匹配类型，取值有：
<li> filename：文件名； </li>
<li> extension：文件后缀； </li>
<li> host：HOST； </li>
<li> full_url：URL Full，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> url：URL Path，当前站点下 URL 路径的请求； </li><li>client_country：客户端国家/地区；</li>
<li> query_string：查询字符串，当前站点下请求URL的查询字符串； </li>
<li> request_header：HTTP请求头部。 </li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 对应匹配类型的参数值，仅在匹配类型为查询字符串或HTTP请求头并且运算符取值为存在或不存在时允许传空数组，对应匹配类型有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example；</li>
<li> 客户端国家/地区：符合ISO3166标准的国家/地区标识；</li>
<li> 查询字符串: 当前站点下URL请求中查询字符串的参数值，例如lang=cn&version=1中的cn和1； </li>
<li> HTTP 请求头: HTTP请求头部字段值，例如Accept-Language:zh-CN,zh;q=0.9中的zh-CN,zh;q=0.9。 </li>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否忽略参数值的大小写，默认值为 false。
    */
    @SerializedName("IgnoreCase")
    @Expose
    private Boolean IgnoreCase;

    /**
    * 对应匹配类型的参数名称，在 Target 值为以下取值时有效，有效时值不能为空：
<li> query_string（查询字符串）: 当前站点下URL请求中查询字符串的参数名称，例如lang=cn&version=1中的lang和version； </li>
<li> request_header（HTTP 请求头）: HTTP请求头部字段名，例如Accept-Language:zh-CN,zh;q=0.9中的Accept-Language。 </li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否忽略参数名称的大小写，默认值为 false。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreNameCase")
    @Expose
    private Boolean IgnoreNameCase;

    /**
     * Get 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于；</li>
<li> exist: 存在； </li>
<li> notexist: 不存在。</li> 
     * @return Operator 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于；</li>
<li> exist: 存在； </li>
<li> notexist: 不存在。</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于；</li>
<li> exist: 存在； </li>
<li> notexist: 不存在。</li>
     * @param Operator 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于；</li>
<li> exist: 存在； </li>
<li> notexist: 不存在。</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 匹配类型，取值有：
<li> filename：文件名； </li>
<li> extension：文件后缀； </li>
<li> host：HOST； </li>
<li> full_url：URL Full，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> url：URL Path，当前站点下 URL 路径的请求； </li><li>client_country：客户端国家/地区；</li>
<li> query_string：查询字符串，当前站点下请求URL的查询字符串； </li>
<li> request_header：HTTP请求头部。 </li> 
     * @return Target 匹配类型，取值有：
<li> filename：文件名； </li>
<li> extension：文件后缀； </li>
<li> host：HOST； </li>
<li> full_url：URL Full，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> url：URL Path，当前站点下 URL 路径的请求； </li><li>client_country：客户端国家/地区；</li>
<li> query_string：查询字符串，当前站点下请求URL的查询字符串； </li>
<li> request_header：HTTP请求头部。 </li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 匹配类型，取值有：
<li> filename：文件名； </li>
<li> extension：文件后缀； </li>
<li> host：HOST； </li>
<li> full_url：URL Full，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> url：URL Path，当前站点下 URL 路径的请求； </li><li>client_country：客户端国家/地区；</li>
<li> query_string：查询字符串，当前站点下请求URL的查询字符串； </li>
<li> request_header：HTTP请求头部。 </li>
     * @param Target 匹配类型，取值有：
<li> filename：文件名； </li>
<li> extension：文件后缀； </li>
<li> host：HOST； </li>
<li> full_url：URL Full，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> url：URL Path，当前站点下 URL 路径的请求； </li><li>client_country：客户端国家/地区；</li>
<li> query_string：查询字符串，当前站点下请求URL的查询字符串； </li>
<li> request_header：HTTP请求头部。 </li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 对应匹配类型的参数值，仅在匹配类型为查询字符串或HTTP请求头并且运算符取值为存在或不存在时允许传空数组，对应匹配类型有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example；</li>
<li> 客户端国家/地区：符合ISO3166标准的国家/地区标识；</li>
<li> 查询字符串: 当前站点下URL请求中查询字符串的参数值，例如lang=cn&version=1中的cn和1； </li>
<li> HTTP 请求头: HTTP请求头部字段值，例如Accept-Language:zh-CN,zh;q=0.9中的zh-CN,zh;q=0.9。 </li> 
     * @return Values 对应匹配类型的参数值，仅在匹配类型为查询字符串或HTTP请求头并且运算符取值为存在或不存在时允许传空数组，对应匹配类型有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example；</li>
<li> 客户端国家/地区：符合ISO3166标准的国家/地区标识；</li>
<li> 查询字符串: 当前站点下URL请求中查询字符串的参数值，例如lang=cn&version=1中的cn和1； </li>
<li> HTTP 请求头: HTTP请求头部字段值，例如Accept-Language:zh-CN,zh;q=0.9中的zh-CN,zh;q=0.9。 </li>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 对应匹配类型的参数值，仅在匹配类型为查询字符串或HTTP请求头并且运算符取值为存在或不存在时允许传空数组，对应匹配类型有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example；</li>
<li> 客户端国家/地区：符合ISO3166标准的国家/地区标识；</li>
<li> 查询字符串: 当前站点下URL请求中查询字符串的参数值，例如lang=cn&version=1中的cn和1； </li>
<li> HTTP 请求头: HTTP请求头部字段值，例如Accept-Language:zh-CN,zh;q=0.9中的zh-CN,zh;q=0.9。 </li>
     * @param Values 对应匹配类型的参数值，仅在匹配类型为查询字符串或HTTP请求头并且运算符取值为存在或不存在时允许传空数组，对应匹配类型有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example；</li>
<li> 客户端国家/地区：符合ISO3166标准的国家/地区标识；</li>
<li> 查询字符串: 当前站点下URL请求中查询字符串的参数值，例如lang=cn&version=1中的cn和1； </li>
<li> HTTP 请求头: HTTP请求头部字段值，例如Accept-Language:zh-CN,zh;q=0.9中的zh-CN,zh;q=0.9。 </li>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否忽略参数值的大小写，默认值为 false。 
     * @return IgnoreCase 是否忽略参数值的大小写，默认值为 false。
     */
    public Boolean getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set 是否忽略参数值的大小写，默认值为 false。
     * @param IgnoreCase 是否忽略参数值的大小写，默认值为 false。
     */
    public void setIgnoreCase(Boolean IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get 对应匹配类型的参数名称，在 Target 值为以下取值时有效，有效时值不能为空：
<li> query_string（查询字符串）: 当前站点下URL请求中查询字符串的参数名称，例如lang=cn&version=1中的lang和version； </li>
<li> request_header（HTTP 请求头）: HTTP请求头部字段名，例如Accept-Language:zh-CN,zh;q=0.9中的Accept-Language。 </li> 
     * @return Name 对应匹配类型的参数名称，在 Target 值为以下取值时有效，有效时值不能为空：
<li> query_string（查询字符串）: 当前站点下URL请求中查询字符串的参数名称，例如lang=cn&version=1中的lang和version； </li>
<li> request_header（HTTP 请求头）: HTTP请求头部字段名，例如Accept-Language:zh-CN,zh;q=0.9中的Accept-Language。 </li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 对应匹配类型的参数名称，在 Target 值为以下取值时有效，有效时值不能为空：
<li> query_string（查询字符串）: 当前站点下URL请求中查询字符串的参数名称，例如lang=cn&version=1中的lang和version； </li>
<li> request_header（HTTP 请求头）: HTTP请求头部字段名，例如Accept-Language:zh-CN,zh;q=0.9中的Accept-Language。 </li>
     * @param Name 对应匹配类型的参数名称，在 Target 值为以下取值时有效，有效时值不能为空：
<li> query_string（查询字符串）: 当前站点下URL请求中查询字符串的参数名称，例如lang=cn&version=1中的lang和version； </li>
<li> request_header（HTTP 请求头）: HTTP请求头部字段名，例如Accept-Language:zh-CN,zh;q=0.9中的Accept-Language。 </li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否忽略参数名称的大小写，默认值为 false。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreNameCase 是否忽略参数名称的大小写，默认值为 false。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIgnoreNameCase() {
        return this.IgnoreNameCase;
    }

    /**
     * Set 是否忽略参数名称的大小写，默认值为 false。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreNameCase 是否忽略参数名称的大小写，默认值为 false。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreNameCase(Boolean IgnoreNameCase) {
        this.IgnoreNameCase = IgnoreNameCase;
    }

    public RuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCondition(RuleCondition source) {
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new Boolean(source.IgnoreCase);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IgnoreNameCase != null) {
            this.IgnoreNameCase = new Boolean(source.IgnoreNameCase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IgnoreNameCase", this.IgnoreNameCase);

    }
}

