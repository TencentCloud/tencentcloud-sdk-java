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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceClusterGroupConfig extends AbstractModel {

    /**
    * 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否已导入，作为入参时无效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Imported")
    @Expose
    private Boolean Imported;

    /**
    * 命名空间，仅4.x集群有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 导入状态
Unknown 未知
Success 成功
Failure 失败
AlreadyExists 已存在
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportStatus")
    @Expose
    private String ImportStatus;

    /**
    * 4.x的命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * 4.x的消费组名，出参使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNameV4")
    @Expose
    private String GroupNameV4;

    /**
    * 4.x的完整命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * 是否为顺序投递，5.0有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
     * Get 消费组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否已导入，作为入参时无效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Imported 是否已导入，作为入参时无效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getImported() {
        return this.Imported;
    }

    /**
     * Set 是否已导入，作为入参时无效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Imported 是否已导入，作为入参时无效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImported(Boolean Imported) {
        this.Imported = Imported;
    }

    /**
     * Get 命名空间，仅4.x集群有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间，仅4.x集群有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，仅4.x集群有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间，仅4.x集群有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 导入状态
Unknown 未知
Success 成功
Failure 失败
AlreadyExists 已存在
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportStatus 导入状态
Unknown 未知
Success 成功
Failure 失败
AlreadyExists 已存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImportStatus() {
        return this.ImportStatus;
    }

    /**
     * Set 导入状态
Unknown 未知
Success 成功
Failure 失败
AlreadyExists 已存在
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportStatus 导入状态
Unknown 未知
Success 成功
Failure 失败
AlreadyExists 已存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportStatus(String ImportStatus) {
        this.ImportStatus = ImportStatus;
    }

    /**
     * Get 4.x的命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceV4 4.x的命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set 4.x的命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceV4 4.x的命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get 4.x的消费组名，出参使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNameV4 4.x的消费组名，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupNameV4() {
        return this.GroupNameV4;
    }

    /**
     * Set 4.x的消费组名，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNameV4 4.x的消费组名，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNameV4(String GroupNameV4) {
        this.GroupNameV4 = GroupNameV4;
    }

    /**
     * Get 4.x的完整命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullNamespaceV4 4.x的完整命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set 4.x的完整命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullNamespaceV4 4.x的完整命名空间，出参使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get 是否为顺序投递，5.0有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumeMessageOrderly 是否为顺序投递，5.0有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set 是否为顺序投递，5.0有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumeMessageOrderly 是否为顺序投递，5.0有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    public SourceClusterGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceClusterGroupConfig(SourceClusterGroupConfig source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Imported != null) {
            this.Imported = new Boolean(source.Imported);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ImportStatus != null) {
            this.ImportStatus = new String(source.ImportStatus);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.GroupNameV4 != null) {
            this.GroupNameV4 = new String(source.GroupNameV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Imported", this.Imported);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ImportStatus", this.ImportStatus);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "GroupNameV4", this.GroupNameV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);

    }
}

