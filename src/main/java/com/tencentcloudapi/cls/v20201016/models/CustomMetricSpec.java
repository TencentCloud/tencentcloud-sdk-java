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

public class CustomMetricSpec extends AbstractModel {

    /**
    * 端口。取值范围 [1,65535]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Metric地址。校验格式：`^/[a-zA-Z0-9-_./]*$`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 命名空间列表。
- 最大支持100个
- namespace 校验格式 `[a-z0-9]([-a-z0-9]*[a-z0-9])?` ， 长度不能超过63
- namespace 不能重复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * Pod标签。
- 最大支持100个

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodLabel")
    @Expose
    private Label [] PodLabel;

    /**
     * Get 端口。取值范围 [1,65535]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口。取值范围 [1,65535]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口。取值范围 [1,65535]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口。取值范围 [1,65535]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Metric地址。校验格式：`^/[a-zA-Z0-9-_./]*$`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path Metric地址。校验格式：`^/[a-zA-Z0-9-_./]*$`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Metric地址。校验格式：`^/[a-zA-Z0-9-_./]*$`
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path Metric地址。校验格式：`^/[a-zA-Z0-9-_./]*$`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 命名空间列表。
- 最大支持100个
- namespace 校验格式 `[a-z0-9]([-a-z0-9]*[a-z0-9])?` ， 长度不能超过63
- namespace 不能重复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespaces 命名空间列表。
- 最大支持100个
- namespace 校验格式 `[a-z0-9]([-a-z0-9]*[a-z0-9])?` ， 长度不能超过63
- namespace 不能重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set 命名空间列表。
- 最大支持100个
- namespace 校验格式 `[a-z0-9]([-a-z0-9]*[a-z0-9])?` ， 长度不能超过63
- namespace 不能重复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespaces 命名空间列表。
- 最大支持100个
- namespace 校验格式 `[a-z0-9]([-a-z0-9]*[a-z0-9])?` ， 长度不能超过63
- namespace 不能重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get Pod标签。
- 最大支持100个

注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodLabel Pod标签。
- 最大支持100个

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getPodLabel() {
        return this.PodLabel;
    }

    /**
     * Set Pod标签。
- 最大支持100个

注意：此字段可能返回 null，表示取不到有效值。
     * @param PodLabel Pod标签。
- 最大支持100个

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodLabel(Label [] PodLabel) {
        this.PodLabel = PodLabel;
    }

    public CustomMetricSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomMetricSpec(CustomMetricSpec source) {
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.PodLabel != null) {
            this.PodLabel = new Label[source.PodLabel.length];
            for (int i = 0; i < source.PodLabel.length; i++) {
                this.PodLabel[i] = new Label(source.PodLabel[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamArrayObj(map, prefix + "PodLabel.", this.PodLabel);

    }
}

