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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmServiceMetric extends AbstractModel {

    /**
    * filed数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fields")
    @Expose
    private ApmField [] Fields;

    /**
    * tag数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 应用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDetail")
    @Expose
    private ServiceDetail ServiceDetail;

    /**
     * Get filed数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fields filed数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmField [] getFields() {
        return this.Fields;
    }

    /**
     * Set filed数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fields filed数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFields(ApmField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get tag数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags tag数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set tag数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags tag数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 应用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDetail 应用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceDetail getServiceDetail() {
        return this.ServiceDetail;
    }

    /**
     * Set 应用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDetail 应用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDetail(ServiceDetail ServiceDetail) {
        this.ServiceDetail = ServiceDetail;
    }

    public ApmServiceMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmServiceMetric(ApmServiceMetric source) {
        if (source.Fields != null) {
            this.Fields = new ApmField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new ApmField(source.Fields[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.ServiceDetail != null) {
            this.ServiceDetail = new ServiceDetail(source.ServiceDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ServiceDetail.", this.ServiceDetail);

    }
}

