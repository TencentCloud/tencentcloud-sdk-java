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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnSevenLayerRules extends AbstractModel{

    /**
    * 区分大小写
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * 规则类型：
protocol：协议，填写 HTTP/HTTPS
method：请求方法，支持 HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT
all：域名 匹配内容固定为"*",不可编辑修改
ip：IP 填写 CIDR 表达式
directory：路径，以/开头，支持目录和具体路径，128字符以内
index：首页 默认固定值：/;/index.html,不可编辑修改
path：文件全路径，资源地址，如/acb/test.png，支持通配符，如/abc/*.jpg
file：文件扩展名，填写具体扩展名，如 jpg;png;css
param：请求参数，填写具体 value 值，512字符以内
referer：Referer，填写具体 value 值，512字符以内
cookie：Cookie，填写具体 value 值，512字符以内
user-agent：User-Agent，填写具体 value 值，512字符以内
head：自定义请求头，填写具体value值，512字符以内；内容为空或者不存在时，无匹配内容输入框，填写匹配参数即可
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 逻辑操作符，取值 ：
不包含：exclude, 
包含：include, 
不等于：notequal, 
等于：equal, 
前缀匹配：matching
内容为空或不存在：null
    */
    @SerializedName("LogicOperator")
    @Expose
    private String LogicOperator;

    /**
    * 规则值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * 匹配参数，只有请求参数、Cookie、自定义请求头 有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleParam")
    @Expose
    private String RuleParam;

    /**
     * Get 区分大小写 
     * @return CaseSensitive 区分大小写
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 区分大小写
     * @param CaseSensitive 区分大小写
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get 规则类型：
protocol：协议，填写 HTTP/HTTPS
method：请求方法，支持 HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT
all：域名 匹配内容固定为"*",不可编辑修改
ip：IP 填写 CIDR 表达式
directory：路径，以/开头，支持目录和具体路径，128字符以内
index：首页 默认固定值：/;/index.html,不可编辑修改
path：文件全路径，资源地址，如/acb/test.png，支持通配符，如/abc/*.jpg
file：文件扩展名，填写具体扩展名，如 jpg;png;css
param：请求参数，填写具体 value 值，512字符以内
referer：Referer，填写具体 value 值，512字符以内
cookie：Cookie，填写具体 value 值，512字符以内
user-agent：User-Agent，填写具体 value 值，512字符以内
head：自定义请求头，填写具体value值，512字符以内；内容为空或者不存在时，无匹配内容输入框，填写匹配参数即可 
     * @return RuleType 规则类型：
protocol：协议，填写 HTTP/HTTPS
method：请求方法，支持 HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT
all：域名 匹配内容固定为"*",不可编辑修改
ip：IP 填写 CIDR 表达式
directory：路径，以/开头，支持目录和具体路径，128字符以内
index：首页 默认固定值：/;/index.html,不可编辑修改
path：文件全路径，资源地址，如/acb/test.png，支持通配符，如/abc/*.jpg
file：文件扩展名，填写具体扩展名，如 jpg;png;css
param：请求参数，填写具体 value 值，512字符以内
referer：Referer，填写具体 value 值，512字符以内
cookie：Cookie，填写具体 value 值，512字符以内
user-agent：User-Agent，填写具体 value 值，512字符以内
head：自定义请求头，填写具体value值，512字符以内；内容为空或者不存在时，无匹配内容输入框，填写匹配参数即可
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：
protocol：协议，填写 HTTP/HTTPS
method：请求方法，支持 HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT
all：域名 匹配内容固定为"*",不可编辑修改
ip：IP 填写 CIDR 表达式
directory：路径，以/开头，支持目录和具体路径，128字符以内
index：首页 默认固定值：/;/index.html,不可编辑修改
path：文件全路径，资源地址，如/acb/test.png，支持通配符，如/abc/*.jpg
file：文件扩展名，填写具体扩展名，如 jpg;png;css
param：请求参数，填写具体 value 值，512字符以内
referer：Referer，填写具体 value 值，512字符以内
cookie：Cookie，填写具体 value 值，512字符以内
user-agent：User-Agent，填写具体 value 值，512字符以内
head：自定义请求头，填写具体value值，512字符以内；内容为空或者不存在时，无匹配内容输入框，填写匹配参数即可
     * @param RuleType 规则类型：
protocol：协议，填写 HTTP/HTTPS
method：请求方法，支持 HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT
all：域名 匹配内容固定为"*",不可编辑修改
ip：IP 填写 CIDR 表达式
directory：路径，以/开头，支持目录和具体路径，128字符以内
index：首页 默认固定值：/;/index.html,不可编辑修改
path：文件全路径，资源地址，如/acb/test.png，支持通配符，如/abc/*.jpg
file：文件扩展名，填写具体扩展名，如 jpg;png;css
param：请求参数，填写具体 value 值，512字符以内
referer：Referer，填写具体 value 值，512字符以内
cookie：Cookie，填写具体 value 值，512字符以内
user-agent：User-Agent，填写具体 value 值，512字符以内
head：自定义请求头，填写具体value值，512字符以内；内容为空或者不存在时，无匹配内容输入框，填写匹配参数即可
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 逻辑操作符，取值 ：
不包含：exclude, 
包含：include, 
不等于：notequal, 
等于：equal, 
前缀匹配：matching
内容为空或不存在：null 
     * @return LogicOperator 逻辑操作符，取值 ：
不包含：exclude, 
包含：include, 
不等于：notequal, 
等于：equal, 
前缀匹配：matching
内容为空或不存在：null
     */
    public String getLogicOperator() {
        return this.LogicOperator;
    }

    /**
     * Set 逻辑操作符，取值 ：
不包含：exclude, 
包含：include, 
不等于：notequal, 
等于：equal, 
前缀匹配：matching
内容为空或不存在：null
     * @param LogicOperator 逻辑操作符，取值 ：
不包含：exclude, 
包含：include, 
不等于：notequal, 
等于：equal, 
前缀匹配：matching
内容为空或不存在：null
     */
    public void setLogicOperator(String LogicOperator) {
        this.LogicOperator = LogicOperator;
    }

    /**
     * Get 规则值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleValue 规则值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set 规则值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleValue 规则值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get 匹配参数，只有请求参数、Cookie、自定义请求头 有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleParam 匹配参数，只有请求参数、Cookie、自定义请求头 有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleParam() {
        return this.RuleParam;
    }

    /**
     * Set 匹配参数，只有请求参数、Cookie、自定义请求头 有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleParam 匹配参数，只有请求参数、Cookie、自定义请求头 有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleParam(String RuleParam) {
        this.RuleParam = RuleParam;
    }

    public ScdnSevenLayerRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnSevenLayerRules(ScdnSevenLayerRules source) {
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.LogicOperator != null) {
            this.LogicOperator = new String(source.LogicOperator);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
        if (source.RuleParam != null) {
            this.RuleParam = new String(source.RuleParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "LogicOperator", this.LogicOperator);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "RuleParam", this.RuleParam);

    }
}

