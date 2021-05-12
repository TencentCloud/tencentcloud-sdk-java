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

public class ReqParameter extends AbstractModel{

    /**
    * API 的前端参数名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API 的前端参数位置，如 header。目前支持 header、query、path。
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * API 的前端参数类型，如 String、int。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * API 的前端参数默认值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * API 的前端参数是否必填，True：表示必填，False：表示可选。
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * API 的前端参数备注。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get API 的前端参数名称。 
     * @return Name API 的前端参数名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API 的前端参数名称。
     * @param Name API 的前端参数名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API 的前端参数位置，如 header。目前支持 header、query、path。 
     * @return Position API 的前端参数位置，如 header。目前支持 header、query、path。
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set API 的前端参数位置，如 header。目前支持 header、query、path。
     * @param Position API 的前端参数位置，如 header。目前支持 header、query、path。
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get API 的前端参数类型，如 String、int。 
     * @return Type API 的前端参数类型，如 String、int。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set API 的前端参数类型，如 String、int。
     * @param Type API 的前端参数类型，如 String、int。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get API 的前端参数默认值。 
     * @return DefaultValue API 的前端参数默认值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set API 的前端参数默认值。
     * @param DefaultValue API 的前端参数默认值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get API 的前端参数是否必填，True：表示必填，False：表示可选。 
     * @return Required API 的前端参数是否必填，True：表示必填，False：表示可选。
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set API 的前端参数是否必填，True：表示必填，False：表示可选。
     * @param Required API 的前端参数是否必填，True：表示必填，False：表示可选。
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get API 的前端参数备注。 
     * @return Desc API 的前端参数备注。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set API 的前端参数备注。
     * @param Desc API 的前端参数备注。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public ReqParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReqParameter(ReqParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

