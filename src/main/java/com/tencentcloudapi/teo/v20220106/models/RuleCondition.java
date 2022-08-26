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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCondition extends AbstractModel{

    /**
    * 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于。</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 匹配类型，取值有：
<li> 全部（站点任意请求）: host。 </li>
<li> 文件名: filename； </li>
<li> 文件后缀: extension； </li>
<li> HOST: host； </li>
<li> URL Full: full_url，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> URL Path: url，当前站点下 URL 路径的请求。 </li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 对应匹配类型的参数值，对应匹配类型的取值有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example。</li>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于。</li> 
     * @return Operator 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于。</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于。</li>
     * @param Operator 运算符，取值有：
<li> equal: 等于； </li>
<li> notequal: 不等于。</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 匹配类型，取值有：
<li> 全部（站点任意请求）: host。 </li>
<li> 文件名: filename； </li>
<li> 文件后缀: extension； </li>
<li> HOST: host； </li>
<li> URL Full: full_url，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> URL Path: url，当前站点下 URL 路径的请求。 </li> 
     * @return Target 匹配类型，取值有：
<li> 全部（站点任意请求）: host。 </li>
<li> 文件名: filename； </li>
<li> 文件后缀: extension； </li>
<li> HOST: host； </li>
<li> URL Full: full_url，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> URL Path: url，当前站点下 URL 路径的请求。 </li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 匹配类型，取值有：
<li> 全部（站点任意请求）: host。 </li>
<li> 文件名: filename； </li>
<li> 文件后缀: extension； </li>
<li> HOST: host； </li>
<li> URL Full: full_url，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> URL Path: url，当前站点下 URL 路径的请求。 </li>
     * @param Target 匹配类型，取值有：
<li> 全部（站点任意请求）: host。 </li>
<li> 文件名: filename； </li>
<li> 文件后缀: extension； </li>
<li> HOST: host； </li>
<li> URL Full: full_url，当前站点下完整 URL 路径，必须包含 HTTP 协议，Host 和 路径； </li>
<li> URL Path: url，当前站点下 URL 路径的请求。 </li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 对应匹配类型的参数值，对应匹配类型的取值有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example。</li> 
     * @return Values 对应匹配类型的参数值，对应匹配类型的取值有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example。</li>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 对应匹配类型的参数值，对应匹配类型的取值有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example。</li>
     * @param Values 对应匹配类型的参数值，对应匹配类型的取值有：
<li> 文件后缀：jpg、txt等文件后缀；</li>
<li> 文件名称：例如 foo.jpg 中的 foo；</li>
<li> 全部（站点任意请求）： all； </li>
<li> HOST：当前站点下的 host ，例如www.maxx55.com；</li>
<li> URL Path：当前站点下 URL 路径的请求，例如：/example；</li>
<li> URL Full：当前站点下完整 URL 请求，必须包含 HTTP 协议，Host 和 路径，例如：https://www.maxx55.cn/example。</li>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

