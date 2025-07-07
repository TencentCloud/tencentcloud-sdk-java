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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyVersionDetail extends AbstractModel {

    /**
    * 策略版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * 策略版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 是否是正在生效的版本。0表示不是，1表示是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefaultVersion")
    @Expose
    private Long IsDefaultVersion;

    /**
    * 策略语法文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
     * Get 策略版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId 策略版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 策略版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId 策略版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 策略版本创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateDate 策略版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 策略版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateDate 策略版本创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 是否是正在生效的版本。0表示不是，1表示是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefaultVersion 是否是正在生效的版本。0表示不是，1表示是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefaultVersion() {
        return this.IsDefaultVersion;
    }

    /**
     * Set 是否是正在生效的版本。0表示不是，1表示是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefaultVersion 是否是正在生效的版本。0表示不是，1表示是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefaultVersion(Long IsDefaultVersion) {
        this.IsDefaultVersion = IsDefaultVersion;
    }

    /**
     * Get 策略语法文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Document 策略语法文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set 策略语法文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Document 策略语法文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocument(String Document) {
        this.Document = Document;
    }

    public PolicyVersionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyVersionDetail(PolicyVersionDetail source) {
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.IsDefaultVersion != null) {
            this.IsDefaultVersion = new Long(source.IsDefaultVersion);
        }
        if (source.Document != null) {
            this.Document = new String(source.Document);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "IsDefaultVersion", this.IsDefaultVersion);
        this.setParamSimple(map, prefix + "Document", this.Document);

    }
}

