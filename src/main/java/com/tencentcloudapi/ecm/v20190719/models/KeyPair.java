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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyPair extends AbstractModel{

    /**
    * 密钥对的ID，是密钥对的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥对名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 密钥对描述信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 密钥对的纯文本公钥。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 钥关联的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedInstanceIds")
    @Expose
    private String [] AssociatedInstanceIds;

    /**
    * 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 密钥对的ID，是密钥对的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId 密钥对的ID，是密钥对的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥对的ID，是密钥对的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId 密钥对的ID，是密钥对的唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥对名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyName 密钥对名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 密钥对名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyName 密钥对名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 密钥对所属的项目ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 密钥对描述信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 密钥对描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 密钥对描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 密钥对描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 密钥对的纯文本公钥。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicKey 密钥对的纯文本公钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 密钥对的纯文本公钥。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicKey 密钥对的纯文本公钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateKey 钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateKey 钥对的纯文本私钥。腾讯云不会保管私钥，请用户自行妥善保存。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 钥关联的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedInstanceIds 钥关联的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssociatedInstanceIds() {
        return this.AssociatedInstanceIds;
    }

    /**
     * Set 钥关联的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedInstanceIds 钥关联的实例ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedInstanceIds(String [] AssociatedInstanceIds) {
        this.AssociatedInstanceIds = AssociatedInstanceIds;
    }

    /**
     * Get 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public KeyPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyPair(KeyPair source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.AssociatedInstanceIds != null) {
            this.AssociatedInstanceIds = new String[source.AssociatedInstanceIds.length];
            for (int i = 0; i < source.AssociatedInstanceIds.length; i++) {
                this.AssociatedInstanceIds[i] = new String(source.AssociatedInstanceIds[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIds.", this.AssociatedInstanceIds);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

