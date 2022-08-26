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

public class RuleCodeAction extends AbstractModel{

    /**
    * 功能名称，功能名称填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 操作参数。
    */
    @SerializedName("Parameters")
    @Expose
    private RuleCodeActionParams [] Parameters;

    /**
     * Get 功能名称，功能名称填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。 
     * @return Action 功能名称，功能名称填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 功能名称，功能名称填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。
     * @param Action 功能名称，功能名称填写规范可调用接口 [查询规则引擎的设置参数](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) 查看。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 操作参数。 
     * @return Parameters 操作参数。
     */
    public RuleCodeActionParams [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 操作参数。
     * @param Parameters 操作参数。
     */
    public void setParameters(RuleCodeActionParams [] Parameters) {
        this.Parameters = Parameters;
    }

    public RuleCodeAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCodeAction(RuleCodeAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Parameters != null) {
            this.Parameters = new RuleCodeActionParams[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new RuleCodeActionParams(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

