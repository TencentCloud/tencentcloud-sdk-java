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

public class ParameterConfig extends AbstractModel {

    /**
    * 字段名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 字段类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否必填
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * 子参数
    */
    @SerializedName("SubParams")
    @Expose
    private ParameterConfig [] SubParams;

    /**
    * OneOf类型的参数
    */
    @SerializedName("OneOf")
    @Expose
    private ParameterConfig [] OneOf;

    /**
    * AnyOf类型的参数
    */
    @SerializedName("AnyOf")
    @Expose
    private ParameterConfig [] AnyOf;

    /**
     * Get 字段名称 
     * @return Name 字段名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称
     * @param Name 字段名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段描述 
     * @return Description 字段描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 字段描述
     * @param Description 字段描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 字段类型 
     * @return Type 字段类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
     * @param Type 字段类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否必填 
     * @return IsRequired 是否必填
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set 是否必填
     * @param IsRequired 是否必填
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get 子参数 
     * @return SubParams 子参数
     */
    public ParameterConfig [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set 子参数
     * @param SubParams 子参数
     */
    public void setSubParams(ParameterConfig [] SubParams) {
        this.SubParams = SubParams;
    }

    /**
     * Get OneOf类型的参数 
     * @return OneOf OneOf类型的参数
     */
    public ParameterConfig [] getOneOf() {
        return this.OneOf;
    }

    /**
     * Set OneOf类型的参数
     * @param OneOf OneOf类型的参数
     */
    public void setOneOf(ParameterConfig [] OneOf) {
        this.OneOf = OneOf;
    }

    /**
     * Get AnyOf类型的参数 
     * @return AnyOf AnyOf类型的参数
     */
    public ParameterConfig [] getAnyOf() {
        return this.AnyOf;
    }

    /**
     * Set AnyOf类型的参数
     * @param AnyOf AnyOf类型的参数
     */
    public void setAnyOf(ParameterConfig [] AnyOf) {
        this.AnyOf = AnyOf;
    }

    public ParameterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParameterConfig(ParameterConfig source) {
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
        if (source.SubParams != null) {
            this.SubParams = new ParameterConfig[source.SubParams.length];
            for (int i = 0; i < source.SubParams.length; i++) {
                this.SubParams[i] = new ParameterConfig(source.SubParams[i]);
            }
        }
        if (source.OneOf != null) {
            this.OneOf = new ParameterConfig[source.OneOf.length];
            for (int i = 0; i < source.OneOf.length; i++) {
                this.OneOf[i] = new ParameterConfig(source.OneOf[i]);
            }
        }
        if (source.AnyOf != null) {
            this.AnyOf = new ParameterConfig[source.AnyOf.length];
            for (int i = 0; i < source.AnyOf.length; i++) {
                this.AnyOf[i] = new ParameterConfig(source.AnyOf[i]);
            }
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
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);
        this.setParamArrayObj(map, prefix + "OneOf.", this.OneOf);
        this.setParamArrayObj(map, prefix + "AnyOf.", this.AnyOf);

    }
}

