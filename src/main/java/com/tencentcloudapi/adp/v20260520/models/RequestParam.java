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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestParam extends AbstractModel {

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 参数描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见
    */
    @SerializedName("IsGlobalHidden")
    @Expose
    private Boolean IsGlobalHidden;

    /**
    * 是否必选
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * AnyOf类型的参数
    */
    @SerializedName("AnyOf")
    @Expose
    private RequestParam [] AnyOf;

    /**
    * OneOf类型的参数
    */
    @SerializedName("OneOf")
    @Expose
    private RequestParam [] OneOf;

    /**
    * 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
    */
    @SerializedName("SubParams")
    @Expose
    private RequestParam [] SubParams;

    /**
     * Get 默认值 
     * @return DefaultValue 默认值
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值
     * @param DefaultValue 默认值
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 参数描述 
     * @return Description 参数描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 参数描述
     * @param Description 参数描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见 
     * @return IsGlobalHidden 全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见
     */
    public Boolean getIsGlobalHidden() {
        return this.IsGlobalHidden;
    }

    /**
     * Set 全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见
     * @param IsGlobalHidden 全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见
     */
    public void setIsGlobalHidden(Boolean IsGlobalHidden) {
        this.IsGlobalHidden = IsGlobalHidden;
    }

    /**
     * Get 是否必选 
     * @return IsRequired 是否必选
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set 是否必选
     * @param IsRequired 是否必选
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

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
     * Get 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 | 
     * @return Type 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
     * @param Type 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get AnyOf类型的参数 
     * @return AnyOf AnyOf类型的参数
     */
    public RequestParam [] getAnyOf() {
        return this.AnyOf;
    }

    /**
     * Set AnyOf类型的参数
     * @param AnyOf AnyOf类型的参数
     */
    public void setAnyOf(RequestParam [] AnyOf) {
        this.AnyOf = AnyOf;
    }

    /**
     * Get OneOf类型的参数 
     * @return OneOf OneOf类型的参数
     */
    public RequestParam [] getOneOf() {
        return this.OneOf;
    }

    /**
     * Set OneOf类型的参数
     * @param OneOf OneOf类型的参数
     */
    public void setOneOf(RequestParam [] OneOf) {
        this.OneOf = OneOf;
    }

    /**
     * Get 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用 
     * @return SubParams 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
     */
    public RequestParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
     * @param SubParams 子参数,ParamType 是OBJECT 或 ARRAY<>类型有用
     */
    public void setSubParams(RequestParam [] SubParams) {
        this.SubParams = SubParams;
    }

    public RequestParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestParam(RequestParam source) {
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsGlobalHidden != null) {
            this.IsGlobalHidden = new Boolean(source.IsGlobalHidden);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AnyOf != null) {
            this.AnyOf = new RequestParam[source.AnyOf.length];
            for (int i = 0; i < source.AnyOf.length; i++) {
                this.AnyOf[i] = new RequestParam(source.AnyOf[i]);
            }
        }
        if (source.OneOf != null) {
            this.OneOf = new RequestParam[source.OneOf.length];
            for (int i = 0; i < source.OneOf.length; i++) {
                this.OneOf[i] = new RequestParam(source.OneOf[i]);
            }
        }
        if (source.SubParams != null) {
            this.SubParams = new RequestParam[source.SubParams.length];
            for (int i = 0; i < source.SubParams.length; i++) {
                this.SubParams[i] = new RequestParam(source.SubParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsGlobalHidden", this.IsGlobalHidden);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "AnyOf.", this.AnyOf);
        this.setParamArrayObj(map, prefix + "OneOf.", this.OneOf);
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);

    }
}

