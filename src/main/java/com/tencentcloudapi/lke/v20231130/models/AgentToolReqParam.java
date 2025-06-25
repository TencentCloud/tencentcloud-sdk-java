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

public class AgentToolReqParam extends AbstractModel {

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 参数类型，0:string, 1:int, 2:float，3:bool 4:object 5:array_string, 6:array_int, 7:array_float, 8:array_bool, 9:array_object
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 参数是否必填
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * 参数默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
    */
    @SerializedName("SubParams")
    @Expose
    private AgentToolReqParam [] SubParams;

    /**
    * 是否隐藏不可见
    */
    @SerializedName("GlobalHidden")
    @Expose
    private Boolean GlobalHidden;

    /**
    * agent模式下模型是否可见
    */
    @SerializedName("AgentHidden")
    @Expose
    private Boolean AgentHidden;

    /**
    * 其中任意
    */
    @SerializedName("AnyOf")
    @Expose
    private AgentToolReqParam [] AnyOf;

    /**
    * 其中一个
    */
    @SerializedName("OneOf")
    @Expose
    private AgentToolReqParam [] OneOf;

    /**
    * 输入
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
     * Get 参数名称 
     * @return Name 参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称
     * @param Name 参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数描述 
     * @return Desc 参数描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 参数描述
     * @param Desc 参数描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 参数类型，0:string, 1:int, 2:float，3:bool 4:object 5:array_string, 6:array_int, 7:array_float, 8:array_bool, 9:array_object 
     * @return Type 参数类型，0:string, 1:int, 2:float，3:bool 4:object 5:array_string, 6:array_int, 7:array_float, 8:array_bool, 9:array_object
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 参数类型，0:string, 1:int, 2:float，3:bool 4:object 5:array_string, 6:array_int, 7:array_float, 8:array_bool, 9:array_object
     * @param Type 参数类型，0:string, 1:int, 2:float，3:bool 4:object 5:array_string, 6:array_int, 7:array_float, 8:array_bool, 9:array_object
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 参数是否必填 
     * @return IsRequired 参数是否必填
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set 参数是否必填
     * @param IsRequired 参数是否必填
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get 参数默认值 
     * @return DefaultValue 参数默认值
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 参数默认值
     * @param DefaultValue 参数默认值
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用 
     * @return SubParams 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
     */
    public AgentToolReqParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
     * @param SubParams 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
     */
    public void setSubParams(AgentToolReqParam [] SubParams) {
        this.SubParams = SubParams;
    }

    /**
     * Get 是否隐藏不可见 
     * @return GlobalHidden 是否隐藏不可见
     */
    public Boolean getGlobalHidden() {
        return this.GlobalHidden;
    }

    /**
     * Set 是否隐藏不可见
     * @param GlobalHidden 是否隐藏不可见
     */
    public void setGlobalHidden(Boolean GlobalHidden) {
        this.GlobalHidden = GlobalHidden;
    }

    /**
     * Get agent模式下模型是否可见 
     * @return AgentHidden agent模式下模型是否可见
     */
    public Boolean getAgentHidden() {
        return this.AgentHidden;
    }

    /**
     * Set agent模式下模型是否可见
     * @param AgentHidden agent模式下模型是否可见
     */
    public void setAgentHidden(Boolean AgentHidden) {
        this.AgentHidden = AgentHidden;
    }

    /**
     * Get 其中任意 
     * @return AnyOf 其中任意
     */
    public AgentToolReqParam [] getAnyOf() {
        return this.AnyOf;
    }

    /**
     * Set 其中任意
     * @param AnyOf 其中任意
     */
    public void setAnyOf(AgentToolReqParam [] AnyOf) {
        this.AnyOf = AnyOf;
    }

    /**
     * Get 其中一个 
     * @return OneOf 其中一个
     */
    public AgentToolReqParam [] getOneOf() {
        return this.OneOf;
    }

    /**
     * Set 其中一个
     * @param OneOf 其中一个
     */
    public void setOneOf(AgentToolReqParam [] OneOf) {
        this.OneOf = OneOf;
    }

    /**
     * Get 输入 
     * @return Input 输入
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set 输入
     * @param Input 输入
     */
    public void setInput(AgentInput Input) {
        this.Input = Input;
    }

    public AgentToolReqParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolReqParam(AgentToolReqParam source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.SubParams != null) {
            this.SubParams = new AgentToolReqParam[source.SubParams.length];
            for (int i = 0; i < source.SubParams.length; i++) {
                this.SubParams[i] = new AgentToolReqParam(source.SubParams[i]);
            }
        }
        if (source.GlobalHidden != null) {
            this.GlobalHidden = new Boolean(source.GlobalHidden);
        }
        if (source.AgentHidden != null) {
            this.AgentHidden = new Boolean(source.AgentHidden);
        }
        if (source.AnyOf != null) {
            this.AnyOf = new AgentToolReqParam[source.AnyOf.length];
            for (int i = 0; i < source.AnyOf.length; i++) {
                this.AnyOf[i] = new AgentToolReqParam(source.AnyOf[i]);
            }
        }
        if (source.OneOf != null) {
            this.OneOf = new AgentToolReqParam[source.OneOf.length];
            for (int i = 0; i < source.OneOf.length; i++) {
                this.OneOf[i] = new AgentToolReqParam(source.OneOf[i]);
            }
        }
        if (source.Input != null) {
            this.Input = new AgentInput(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);
        this.setParamSimple(map, prefix + "GlobalHidden", this.GlobalHidden);
        this.setParamSimple(map, prefix + "AgentHidden", this.AgentHidden);
        this.setParamArrayObj(map, prefix + "AnyOf.", this.AnyOf);
        this.setParamArrayObj(map, prefix + "OneOf.", this.OneOf);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

