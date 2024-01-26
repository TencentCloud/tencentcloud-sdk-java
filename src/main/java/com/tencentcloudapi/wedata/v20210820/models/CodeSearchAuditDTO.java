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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeSearchAuditDTO extends AbstractModel {

    /**
    * 当前租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private Long TenantId;

    /**
    * 当前用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserId")
    @Expose
    private Long OwnerUserId;

    /**
    * 当前用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 关键词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 当前租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 当前租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 当前租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 当前租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(Long TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 当前用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserId 当前用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set 当前用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserId 当前用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserId(Long OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get 当前用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 当前用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 当前用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 当前用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 关键词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keyword 关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keyword 关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public CodeSearchAuditDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeSearchAuditDTO(CodeSearchAuditDTO source) {
        if (source.TenantId != null) {
            this.TenantId = new Long(source.TenantId);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new Long(source.OwnerUserId);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

