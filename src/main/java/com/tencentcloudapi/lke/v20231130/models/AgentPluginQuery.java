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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginQuery extends AbstractModel {

    /**
    * 参数名称
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数值
    */
    @SerializedName("ParamValue")
    @Expose
    private String ParamValue;

    /**
    * query参数配置是否隐藏不可见，true-隐藏不可见，false-可见
    */
    @SerializedName("GlobalHidden")
    @Expose
    private Boolean GlobalHidden;

    /**
    * 参数是否可以为空
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * 输入的值
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
     * Get 参数名称 
     * @return ParamName 参数名称
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称
     * @param ParamName 参数名称
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 参数值 
     * @return ParamValue 参数值
     */
    public String getParamValue() {
        return this.ParamValue;
    }

    /**
     * Set 参数值
     * @param ParamValue 参数值
     */
    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }

    /**
     * Get query参数配置是否隐藏不可见，true-隐藏不可见，false-可见 
     * @return GlobalHidden query参数配置是否隐藏不可见，true-隐藏不可见，false-可见
     */
    public Boolean getGlobalHidden() {
        return this.GlobalHidden;
    }

    /**
     * Set query参数配置是否隐藏不可见，true-隐藏不可见，false-可见
     * @param GlobalHidden query参数配置是否隐藏不可见，true-隐藏不可见，false-可见
     */
    public void setGlobalHidden(Boolean GlobalHidden) {
        this.GlobalHidden = GlobalHidden;
    }

    /**
     * Get 参数是否可以为空 
     * @return IsRequired 参数是否可以为空
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set 参数是否可以为空
     * @param IsRequired 参数是否可以为空
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get 输入的值 
     * @return Input 输入的值
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set 输入的值
     * @param Input 输入的值
     */
    public void setInput(AgentInput Input) {
        this.Input = Input;
    }

    public AgentPluginQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginQuery(AgentPluginQuery source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
        if (source.GlobalHidden != null) {
            this.GlobalHidden = new Boolean(source.GlobalHidden);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.Input != null) {
            this.Input = new AgentInput(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);
        this.setParamSimple(map, prefix + "GlobalHidden", this.GlobalHidden);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

