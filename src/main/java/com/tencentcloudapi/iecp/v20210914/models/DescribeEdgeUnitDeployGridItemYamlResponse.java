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

public class DescribeEdgeUnitDeployGridItemYamlResponse extends AbstractModel{

    /**
    * yaml，base64编码字符串
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 对应类型的副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long [] Replicas;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get yaml，base64编码字符串 
     * @return Yaml yaml，base64编码字符串
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set yaml，base64编码字符串
     * @param Yaml yaml，base64编码字符串
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get 对应类型的副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas 对应类型的副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 对应类型的副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 对应类型的副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long [] Replicas) {
        this.Replicas = Replicas;
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

    public DescribeEdgeUnitDeployGridItemYamlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitDeployGridItemYamlResponse(DescribeEdgeUnitDeployGridItemYamlResponse source) {
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long[source.Replicas.length];
            for (int i = 0; i < source.Replicas.length; i++) {
                this.Replicas[i] = new Long(source.Replicas[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamArraySimple(map, prefix + "Replicas.", this.Replicas);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

