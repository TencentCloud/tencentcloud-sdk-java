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

public class RuleEngineCustomAction extends AbstractModel {

    /**
    * <p>定制配置唯一 ID。</p>
    */
    @SerializedName("ActionId")
    @Expose
    private String ActionId;

    /**
    * <p>定制配置名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>定制配置描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>定制配置参数定义列表。</p>
    */
    @SerializedName("Parameters")
    @Expose
    private RuleEngineCustomActionParameterSchema [] Parameters;

    /**
    * <p>定制配置支持的匹配条件。</p><p>支持匹配条件参考官方文档 <a href="https://cloud.tencent.com/document/product/1552/125344">通用参考-配置语法-变量</a>。</p>
    */
    @SerializedName("SupportedConditions")
    @Expose
    private String [] SupportedConditions;

    /**
     * Get <p>定制配置唯一 ID。</p> 
     * @return ActionId <p>定制配置唯一 ID。</p>
     */
    public String getActionId() {
        return this.ActionId;
    }

    /**
     * Set <p>定制配置唯一 ID。</p>
     * @param ActionId <p>定制配置唯一 ID。</p>
     */
    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get <p>定制配置名称。</p> 
     * @return Name <p>定制配置名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>定制配置名称。</p>
     * @param Name <p>定制配置名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>定制配置描述。</p> 
     * @return Description <p>定制配置描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>定制配置描述。</p>
     * @param Description <p>定制配置描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>定制配置参数定义列表。</p> 
     * @return Parameters <p>定制配置参数定义列表。</p>
     */
    public RuleEngineCustomActionParameterSchema [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>定制配置参数定义列表。</p>
     * @param Parameters <p>定制配置参数定义列表。</p>
     */
    public void setParameters(RuleEngineCustomActionParameterSchema [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get <p>定制配置支持的匹配条件。</p><p>支持匹配条件参考官方文档 <a href="https://cloud.tencent.com/document/product/1552/125344">通用参考-配置语法-变量</a>。</p> 
     * @return SupportedConditions <p>定制配置支持的匹配条件。</p><p>支持匹配条件参考官方文档 <a href="https://cloud.tencent.com/document/product/1552/125344">通用参考-配置语法-变量</a>。</p>
     */
    public String [] getSupportedConditions() {
        return this.SupportedConditions;
    }

    /**
     * Set <p>定制配置支持的匹配条件。</p><p>支持匹配条件参考官方文档 <a href="https://cloud.tencent.com/document/product/1552/125344">通用参考-配置语法-变量</a>。</p>
     * @param SupportedConditions <p>定制配置支持的匹配条件。</p><p>支持匹配条件参考官方文档 <a href="https://cloud.tencent.com/document/product/1552/125344">通用参考-配置语法-变量</a>。</p>
     */
    public void setSupportedConditions(String [] SupportedConditions) {
        this.SupportedConditions = SupportedConditions;
    }

    public RuleEngineCustomAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineCustomAction(RuleEngineCustomAction source) {
        if (source.ActionId != null) {
            this.ActionId = new String(source.ActionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Parameters != null) {
            this.Parameters = new RuleEngineCustomActionParameterSchema[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new RuleEngineCustomActionParameterSchema(source.Parameters[i]);
            }
        }
        if (source.SupportedConditions != null) {
            this.SupportedConditions = new String[source.SupportedConditions.length];
            for (int i = 0; i < source.SupportedConditions.length; i++) {
                this.SupportedConditions[i] = new String(source.SupportedConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamArraySimple(map, prefix + "SupportedConditions.", this.SupportedConditions);

    }
}

