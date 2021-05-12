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

public class ServiceParameter extends AbstractModel{

    /**
    * API的后端服务参数名称。只有ServiceType是HTTP才会用到此参数。前后端参数名称可不同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API 的后端服务参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。前后端参数位置可配置不同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * API 的后端服务参数对应的前端参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelevantRequestParameterPosition")
    @Expose
    private String RelevantRequestParameterPosition;

    /**
    * API 的后端服务参数对应的前端参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelevantRequestParameterName")
    @Expose
    private String RelevantRequestParameterName;

    /**
    * API 的后端服务参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * API 的后端服务参数备注。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelevantRequestParameterDesc")
    @Expose
    private String RelevantRequestParameterDesc;

    /**
    * API 的后端服务参数类型。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelevantRequestParameterType")
    @Expose
    private String RelevantRequestParameterType;

    /**
     * Get API的后端服务参数名称。只有ServiceType是HTTP才会用到此参数。前后端参数名称可不同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name API的后端服务参数名称。只有ServiceType是HTTP才会用到此参数。前后端参数名称可不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API的后端服务参数名称。只有ServiceType是HTTP才会用到此参数。前后端参数名称可不同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name API的后端服务参数名称。只有ServiceType是HTTP才会用到此参数。前后端参数名称可不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API 的后端服务参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。前后端参数位置可配置不同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position API 的后端服务参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。前后端参数位置可配置不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set API 的后端服务参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。前后端参数位置可配置不同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position API 的后端服务参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。前后端参数位置可配置不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get API 的后端服务参数对应的前端参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelevantRequestParameterPosition API 的后端服务参数对应的前端参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelevantRequestParameterPosition() {
        return this.RelevantRequestParameterPosition;
    }

    /**
     * Set API 的后端服务参数对应的前端参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelevantRequestParameterPosition API 的后端服务参数对应的前端参数位置，如 head。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelevantRequestParameterPosition(String RelevantRequestParameterPosition) {
        this.RelevantRequestParameterPosition = RelevantRequestParameterPosition;
    }

    /**
     * Get API 的后端服务参数对应的前端参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelevantRequestParameterName API 的后端服务参数对应的前端参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelevantRequestParameterName() {
        return this.RelevantRequestParameterName;
    }

    /**
     * Set API 的后端服务参数对应的前端参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelevantRequestParameterName API 的后端服务参数对应的前端参数名称。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelevantRequestParameterName(String RelevantRequestParameterName) {
        this.RelevantRequestParameterName = RelevantRequestParameterName;
    }

    /**
     * Get API 的后端服务参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue API 的后端服务参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set API 的后端服务参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue API 的后端服务参数默认值。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get API 的后端服务参数备注。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelevantRequestParameterDesc API 的后端服务参数备注。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelevantRequestParameterDesc() {
        return this.RelevantRequestParameterDesc;
    }

    /**
     * Set API 的后端服务参数备注。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelevantRequestParameterDesc API 的后端服务参数备注。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelevantRequestParameterDesc(String RelevantRequestParameterDesc) {
        this.RelevantRequestParameterDesc = RelevantRequestParameterDesc;
    }

    /**
     * Get API 的后端服务参数类型。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelevantRequestParameterType API 的后端服务参数类型。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelevantRequestParameterType() {
        return this.RelevantRequestParameterType;
    }

    /**
     * Set API 的后端服务参数类型。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelevantRequestParameterType API 的后端服务参数类型。只有 ServiceType 是 HTTP 才会用到此参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelevantRequestParameterType(String RelevantRequestParameterType) {
        this.RelevantRequestParameterType = RelevantRequestParameterType;
    }

    public ServiceParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceParameter(ServiceParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.RelevantRequestParameterPosition != null) {
            this.RelevantRequestParameterPosition = new String(source.RelevantRequestParameterPosition);
        }
        if (source.RelevantRequestParameterName != null) {
            this.RelevantRequestParameterName = new String(source.RelevantRequestParameterName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.RelevantRequestParameterDesc != null) {
            this.RelevantRequestParameterDesc = new String(source.RelevantRequestParameterDesc);
        }
        if (source.RelevantRequestParameterType != null) {
            this.RelevantRequestParameterType = new String(source.RelevantRequestParameterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "RelevantRequestParameterPosition", this.RelevantRequestParameterPosition);
        this.setParamSimple(map, prefix + "RelevantRequestParameterName", this.RelevantRequestParameterName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "RelevantRequestParameterDesc", this.RelevantRequestParameterDesc);
        this.setParamSimple(map, prefix + "RelevantRequestParameterType", this.RelevantRequestParameterType);

    }
}

