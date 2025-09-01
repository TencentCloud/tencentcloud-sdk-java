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

public class RowColumnStatus extends AbstractModel {

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenStatus")
    @Expose
    private String OpenStatus;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenStatus 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenStatus 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenStatus(String OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    public RowColumnStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RowColumnStatus(RowColumnStatus source) {
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new String(source.OpenStatus);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);

    }
}

