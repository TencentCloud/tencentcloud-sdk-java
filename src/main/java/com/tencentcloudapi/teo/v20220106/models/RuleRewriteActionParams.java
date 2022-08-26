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

public class RuleRewriteActionParams extends AbstractModel{

    /**
    * 功能参数名称，参数填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。现在只有三种取值：
<li> add：添加 HTTP 头部；</li>
<li> set：重写 HTTP 头部；</li>
<li> del：删除 HTTP 头部。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 参数名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 功能参数名称，参数填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。现在只有三种取值：
<li> add：添加 HTTP 头部；</li>
<li> set：重写 HTTP 头部；</li>
<li> del：删除 HTTP 头部。</li> 
     * @return Action 功能参数名称，参数填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。现在只有三种取值：
<li> add：添加 HTTP 头部；</li>
<li> set：重写 HTTP 头部；</li>
<li> del：删除 HTTP 头部。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 功能参数名称，参数填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。现在只有三种取值：
<li> add：添加 HTTP 头部；</li>
<li> set：重写 HTTP 头部；</li>
<li> del：删除 HTTP 头部。</li>
     * @param Action 功能参数名称，参数填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。现在只有三种取值：
<li> add：添加 HTTP 头部；</li>
<li> set：重写 HTTP 头部；</li>
<li> del：删除 HTTP 头部。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 参数名称。 
     * @return Name 参数名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称。
     * @param Name 参数名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数值。 
     * @return Values 参数值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 参数值。
     * @param Values 参数值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public RuleRewriteActionParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleRewriteActionParams(RuleRewriteActionParams source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

