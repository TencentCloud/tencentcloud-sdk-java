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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestParameter extends AbstractModel{

    /**
    * 请求参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 参数位置
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 参数类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 是否必须
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
     * Get 请求参数名称 
     * @return Name 请求参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 请求参数名称
     * @param Name 请求参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 参数位置 
     * @return Position 参数位置
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 参数位置
     * @param Position 参数位置
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 参数类型 
     * @return Type 参数类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数类型
     * @param Type 参数类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

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
     * Get 是否必须 
     * @return Required 是否必须
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set 是否必须
     * @param Required 是否必须
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    public RequestParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestParameter(RequestParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Required", this.Required);

    }
}

