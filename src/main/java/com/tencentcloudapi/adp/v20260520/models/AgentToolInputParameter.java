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

public class AgentToolInputParameter extends AbstractModel {

    /**
    * <p>工具名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>工具描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>工具参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>是否必填</p>
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * <p>子参数，仅 OBJECT 或 ARRAY&lt;&gt; 类型时使用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubParameterList")
    @Expose
    private AgentToolInputParameter [] SubParameterList;

    /**
    * <p>模式下是否对模型隐藏</p>
    */
    @SerializedName("IsHidden")
    @Expose
    private Boolean IsHidden;

    /**
    * <p>OneOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OneOfList")
    @Expose
    private AgentToolInputParameter [] OneOfList;

    /**
    * <p>AnyOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnyOfList")
    @Expose
    private AgentToolInputParameter [] AnyOfList;

    /**
    * <p>参数取值来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
     * Get <p>工具名称</p> 
     * @return Name <p>工具名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>工具名称</p>
     * @param Name <p>工具名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>工具描述</p> 
     * @return Description <p>工具描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工具描述</p>
     * @param Description <p>工具描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>工具参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul> 
     * @return Type <p>工具参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>工具参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
     * @param Type <p>工具参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否必填</p> 
     * @return IsRequired <p>是否必填</p>
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set <p>是否必填</p>
     * @param IsRequired <p>是否必填</p>
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get <p>子参数，仅 OBJECT 或 ARRAY&lt;&gt; 类型时使用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubParameterList <p>子参数，仅 OBJECT 或 ARRAY&lt;&gt; 类型时使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentToolInputParameter [] getSubParameterList() {
        return this.SubParameterList;
    }

    /**
     * Set <p>子参数，仅 OBJECT 或 ARRAY&lt;&gt; 类型时使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubParameterList <p>子参数，仅 OBJECT 或 ARRAY&lt;&gt; 类型时使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubParameterList(AgentToolInputParameter [] SubParameterList) {
        this.SubParameterList = SubParameterList;
    }

    /**
     * Get <p>模式下是否对模型隐藏</p> 
     * @return IsHidden <p>模式下是否对模型隐藏</p>
     */
    public Boolean getIsHidden() {
        return this.IsHidden;
    }

    /**
     * Set <p>模式下是否对模型隐藏</p>
     * @param IsHidden <p>模式下是否对模型隐藏</p>
     */
    public void setIsHidden(Boolean IsHidden) {
        this.IsHidden = IsHidden;
    }

    /**
     * Get <p>OneOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OneOfList <p>OneOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentToolInputParameter [] getOneOfList() {
        return this.OneOfList;
    }

    /**
     * Set <p>OneOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OneOfList <p>OneOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOneOfList(AgentToolInputParameter [] OneOfList) {
        this.OneOfList = OneOfList;
    }

    /**
     * Get <p>AnyOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnyOfList <p>AnyOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentToolInputParameter [] getAnyOfList() {
        return this.AnyOfList;
    }

    /**
     * Set <p>AnyOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnyOfList <p>AnyOf类型的参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnyOfList(AgentToolInputParameter [] AnyOfList) {
        this.AnyOfList = AnyOfList;
    }

    /**
     * Get <p>参数取值来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Input <p>参数取值来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>参数取值来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Input <p>参数取值来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInput(AgentInput Input) {
        this.Input = Input;
    }

    public AgentToolInputParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolInputParameter(AgentToolInputParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.SubParameterList != null) {
            this.SubParameterList = new AgentToolInputParameter[source.SubParameterList.length];
            for (int i = 0; i < source.SubParameterList.length; i++) {
                this.SubParameterList[i] = new AgentToolInputParameter(source.SubParameterList[i]);
            }
        }
        if (source.IsHidden != null) {
            this.IsHidden = new Boolean(source.IsHidden);
        }
        if (source.OneOfList != null) {
            this.OneOfList = new AgentToolInputParameter[source.OneOfList.length];
            for (int i = 0; i < source.OneOfList.length; i++) {
                this.OneOfList[i] = new AgentToolInputParameter(source.OneOfList[i]);
            }
        }
        if (source.AnyOfList != null) {
            this.AnyOfList = new AgentToolInputParameter[source.AnyOfList.length];
            for (int i = 0; i < source.AnyOfList.length; i++) {
                this.AnyOfList[i] = new AgentToolInputParameter(source.AnyOfList[i]);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamArrayObj(map, prefix + "SubParameterList.", this.SubParameterList);
        this.setParamSimple(map, prefix + "IsHidden", this.IsHidden);
        this.setParamArrayObj(map, prefix + "OneOfList.", this.OneOfList);
        this.setParamArrayObj(map, prefix + "AnyOfList.", this.AnyOfList);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

