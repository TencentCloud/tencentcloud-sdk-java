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

public class ConstantParameter extends AbstractModel{

    /**
    * 常量参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 常量参数描述。只有 ServiceType 是 HTTP 才会用到此参数。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 常量参数位置。只有 ServiceType 是 HTTP 才会用到此参数。
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 常量参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
     * Get 常量参数名称。只有 ServiceType 是 HTTP 才会用到此参数。 
     * @return Name 常量参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 常量参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
     * @param Name 常量参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 常量参数描述。只有 ServiceType 是 HTTP 才会用到此参数。 
     * @return Desc 常量参数描述。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 常量参数描述。只有 ServiceType 是 HTTP 才会用到此参数。
     * @param Desc 常量参数描述。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 常量参数位置。只有 ServiceType 是 HTTP 才会用到此参数。 
     * @return Position 常量参数位置。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 常量参数位置。只有 ServiceType 是 HTTP 才会用到此参数。
     * @param Position 常量参数位置。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 常量参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。 
     * @return DefaultValue 常量参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 常量参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
     * @param DefaultValue 常量参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    public ConstantParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConstantParameter(ConstantParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);

    }
}

