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

public class CustomAction extends AbstractModel {

    /**
    * <p>定制配置的配置项 Id。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口的返回值 CustomActionSet[].ActionId 获取。</p>
    */
    @SerializedName("ActionId")
    @Expose
    private String ActionId;

    /**
    * <p>该定制配置项下各参数字段的取值。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取。</p>
    */
    @SerializedName("Parameters")
    @Expose
    private CustomActionParameter [] Parameters;

    /**
     * Get <p>定制配置的配置项 Id。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口的返回值 CustomActionSet[].ActionId 获取。</p> 
     * @return ActionId <p>定制配置的配置项 Id。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口的返回值 CustomActionSet[].ActionId 获取。</p>
     */
    public String getActionId() {
        return this.ActionId;
    }

    /**
     * Set <p>定制配置的配置项 Id。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口的返回值 CustomActionSet[].ActionId 获取。</p>
     * @param ActionId <p>定制配置的配置项 Id。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口的返回值 CustomActionSet[].ActionId 获取。</p>
     */
    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get <p>该定制配置项下各参数字段的取值。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取。</p> 
     * @return Parameters <p>该定制配置项下各参数字段的取值。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取。</p>
     */
    public CustomActionParameter [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>该定制配置项下各参数字段的取值。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取。</p>
     * @param Parameters <p>该定制配置项下各参数字段的取值。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取。</p>
     */
    public void setParameters(CustomActionParameter [] Parameters) {
        this.Parameters = Parameters;
    }

    public CustomAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomAction(CustomAction source) {
        if (source.ActionId != null) {
            this.ActionId = new String(source.ActionId);
        }
        if (source.Parameters != null) {
            this.Parameters = new CustomActionParameter[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new CustomActionParameter(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

