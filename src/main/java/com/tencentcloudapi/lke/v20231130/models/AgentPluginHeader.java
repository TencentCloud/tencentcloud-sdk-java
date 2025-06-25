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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginHeader extends AbstractModel {

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
    * header参数配置是否隐藏不可见
    */
    @SerializedName("GlobalHidden")
    @Expose
    private Boolean GlobalHidden;

    /**
    * 输入的值
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
    * 参数是否可以为空
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

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
     * Get header参数配置是否隐藏不可见 
     * @return GlobalHidden header参数配置是否隐藏不可见
     */
    public Boolean getGlobalHidden() {
        return this.GlobalHidden;
    }

    /**
     * Set header参数配置是否隐藏不可见
     * @param GlobalHidden header参数配置是否隐藏不可见
     */
    public void setGlobalHidden(Boolean GlobalHidden) {
        this.GlobalHidden = GlobalHidden;
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

    public AgentPluginHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginHeader(AgentPluginHeader source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
        if (source.GlobalHidden != null) {
            this.GlobalHidden = new Boolean(source.GlobalHidden);
        }
        if (source.Input != null) {
            this.Input = new AgentInput(source.Input);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);
        this.setParamSimple(map, prefix + "GlobalHidden", this.GlobalHidden);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);

    }
}

