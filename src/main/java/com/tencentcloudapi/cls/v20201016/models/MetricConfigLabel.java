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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricConfigLabel extends AbstractModel {

    /**
    * 元数据。
支持
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * 元数据Pod Label信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private AppointLabel Label;

    /**
    * 自定义label信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomLabels")
    @Expose
    private CustomLabel [] CustomLabels;

    /**
     * Get 元数据。
支持
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 元数据。
支持
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 元数据。
支持
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 元数据。
支持
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 元数据Pod Label信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 元数据Pod Label信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppointLabel getLabel() {
        return this.Label;
    }

    /**
     * Set 元数据Pod Label信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 元数据Pod Label信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(AppointLabel Label) {
        this.Label = Label;
    }

    /**
     * Get 自定义label信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomLabels 自定义label信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomLabel [] getCustomLabels() {
        return this.CustomLabels;
    }

    /**
     * Set 自定义label信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomLabels 自定义label信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomLabels(CustomLabel [] CustomLabels) {
        this.CustomLabels = CustomLabels;
    }

    public MetricConfigLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricConfigLabel(MetricConfigLabel source) {
        if (source.Metadata != null) {
            this.Metadata = new String[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new String(source.Metadata[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new AppointLabel(source.Label);
        }
        if (source.CustomLabels != null) {
            this.CustomLabels = new CustomLabel[source.CustomLabels.length];
            for (int i = 0; i < source.CustomLabels.length; i++) {
                this.CustomLabels[i] = new CustomLabel(source.CustomLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "Label.", this.Label);
        this.setParamArrayObj(map, prefix + "CustomLabels.", this.CustomLabels);

    }
}

