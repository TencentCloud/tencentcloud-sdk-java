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
    * <p>AnyOf类型的参数</p>
    */
    @SerializedName("AnyOf")
    @Expose
    private RequestParam [] AnyOf;

    /**
    * <p>默认值</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>参数描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见</p>
    */
    @SerializedName("IsGlobalHidden")
    @Expose
    private Boolean IsGlobalHidden;

    /**
    * <p>是否必选</p>
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * <p>参数名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>OneOf类型的参数</p>
    */
    @SerializedName("OneOf")
    @Expose
    private RequestParam [] OneOf;

    /**
    * <p>子参数,ParamType 是OBJECT 或 ARRAY&lt;&gt;类型有用</p>
    */
    @SerializedName("SubParams")
    @Expose
    private RequestParam [] SubParams;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>字符串</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>整数</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>浮点数</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>布尔值</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>对象</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>字符串数组</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>整数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>浮点数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>布尔值数组</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>对象数组</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>数组嵌套</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>空值</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>未指定类型，用于OneOf和AnyOf场景</td></tr></tbody></table>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>AnyOf类型的参数</p> 
     * @return AnyOf <p>AnyOf类型的参数</p>
     */
    public RequestParam [] getAnyOf() {
        return this.AnyOf;
    }

    /**
     * Set <p>AnyOf类型的参数</p>
     * @param AnyOf <p>AnyOf类型的参数</p>
     */
    public void setAnyOf(RequestParam [] AnyOf) {
        this.AnyOf = AnyOf;
    }

    /**
     * Get <p>默认值</p> 
     * @return DefaultValue <p>默认值</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>默认值</p>
     * @param DefaultValue <p>默认值</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>参数描述</p> 
     * @return Description <p>参数描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>参数描述</p>
     * @param Description <p>参数描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见</p> 
     * @return IsGlobalHidden <p>全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见</p>
     */
    public Boolean getIsGlobalHidden() {
        return this.IsGlobalHidden;
    }

    /**
     * Set <p>全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见</p>
     * @param IsGlobalHidden <p>全局隐藏不可见（区别于Agent场景的agent_hidden），true-全局隐藏不可见，false-可见</p>
     */
    public void setIsGlobalHidden(Boolean IsGlobalHidden) {
        this.IsGlobalHidden = IsGlobalHidden;
    }

    /**
     * Get <p>是否必选</p> 
     * @return IsRequired <p>是否必选</p>
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set <p>是否必选</p>
     * @param IsRequired <p>是否必选</p>
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get <p>参数名称</p> 
     * @return Name <p>参数名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>参数名称</p>
     * @param Name <p>参数名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>OneOf类型的参数</p> 
     * @return OneOf <p>OneOf类型的参数</p>
     */
    public RequestParam [] getOneOf() {
        return this.OneOf;
    }

    /**
     * Set <p>OneOf类型的参数</p>
     * @param OneOf <p>OneOf类型的参数</p>
     */
    public void setOneOf(RequestParam [] OneOf) {
        this.OneOf = OneOf;
    }

    /**
     * Get <p>子参数,ParamType 是OBJECT 或 ARRAY&lt;&gt;类型有用</p> 
     * @return SubParams <p>子参数,ParamType 是OBJECT 或 ARRAY&lt;&gt;类型有用</p>
     */
    public RequestParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set <p>子参数,ParamType 是OBJECT 或 ARRAY&lt;&gt;类型有用</p>
     * @param SubParams <p>子参数,ParamType 是OBJECT 或 ARRAY&lt;&gt;类型有用</p>
     */
    public void setSubParams(RequestParam [] SubParams) {
        this.SubParams = SubParams;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>字符串</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>整数</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>浮点数</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>布尔值</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>对象</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>字符串数组</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>整数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>浮点数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>布尔值数组</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>对象数组</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>数组嵌套</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>空值</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>未指定类型，用于OneOf和AnyOf场景</td></tr></tbody></table> 
     * @return Type <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>字符串</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>整数</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>浮点数</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>布尔值</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>对象</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>字符串数组</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>整数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>浮点数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>布尔值数组</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>对象数组</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>数组嵌套</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>空值</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>未指定类型，用于OneOf和AnyOf场景</td></tr></tbody></table>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>字符串</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>整数</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>浮点数</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>布尔值</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>对象</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>字符串数组</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>整数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>浮点数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>布尔值数组</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>对象数组</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>数组嵌套</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>空值</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>未指定类型，用于OneOf和AnyOf场景</td></tr></tbody></table>
     * @param Type <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>字符串</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>整数</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>浮点数</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>布尔值</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>对象</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>字符串数组</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>整数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>浮点数数组</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>布尔值数组</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>对象数组</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>数组嵌套</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>空值</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>未指定类型，用于OneOf和AnyOf场景</td></tr></tbody></table>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public RequestParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestParam(RequestParam source) {
        if (source.AnyOf != null) {
            this.AnyOf = new RequestParam[source.AnyOf.length];
            for (int i = 0; i < source.AnyOf.length; i++) {
                this.AnyOf[i] = new RequestParam(source.AnyOf[i]);
            }
        }
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
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AnyOf.", this.AnyOf);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsGlobalHidden", this.IsGlobalHidden);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "OneOf.", this.OneOf);
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

