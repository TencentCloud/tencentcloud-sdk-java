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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiKeyAuthApplyVO extends AbstractModel {

    /**
    * <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>企业id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * <p>apiKey</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>默认用户</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultUser")
    @Expose
    private String DefaultUser;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>企业id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId <p>企业id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set <p>企业id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId <p>企业id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get <p>apiKey</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiKey <p>apiKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>apiKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiKey <p>apiKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>默认用户</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultUser <p>默认用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultUser() {
        return this.DefaultUser;
    }

    /**
     * Set <p>默认用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultUser <p>默认用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultUser(String DefaultUser) {
        this.DefaultUser = DefaultUser;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedUser <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedUser <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser <p>更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public ApiKeyAuthApplyVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKeyAuthApplyVO(ApiKeyAuthApplyVO source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.DefaultUser != null) {
            this.DefaultUser = new String(source.DefaultUser);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "DefaultUser", this.DefaultUser);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

