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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigMapResponse extends AbstractModel{

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * yaml配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 配置项的json格式(base64编码)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Json")
    @Expose
    private String Json;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get yaml配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Yaml yaml配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set yaml配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Yaml yaml配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get 配置项的json格式(base64编码)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Json 配置项的json格式(base64编码)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJson() {
        return this.Json;
    }

    /**
     * Set 配置项的json格式(base64编码)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Json 配置项的json格式(base64编码)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJson(String Json) {
        this.Json = Json;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeConfigMapResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigMapResponse(DescribeConfigMapResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.Json != null) {
            this.Json = new String(source.Json);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamSimple(map, prefix + "Json", this.Json);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

