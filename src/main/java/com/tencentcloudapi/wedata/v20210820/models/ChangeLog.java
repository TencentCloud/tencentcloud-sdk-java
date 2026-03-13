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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeLog extends AbstractModel {

    /**
    * 变更类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeType")
    @Expose
    private String ChangeType;

    /**
    * 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * 修改后的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * 修改人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedAccount")
    @Expose
    private String ModifiedAccount;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 修改原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeReason")
    @Expose
    private String ChangeReason;

    /**
    * 修改人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedAccountName")
    @Expose
    private String ModifiedAccountName;

    /**
     * Get 变更类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeType 变更类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChangeType() {
        return this.ChangeType;
    }

    /**
     * Set 变更类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeType 变更类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeType(String ChangeType) {
        this.ChangeType = ChangeType;
    }

    /**
     * Get 修改前的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldValue 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldValue 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get 修改后的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewValue 修改后的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 修改后的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewValue 修改后的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get 修改人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedAccount 修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedAccount() {
        return this.ModifiedAccount;
    }

    /**
     * Set 修改人
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedAccount 修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedAccount(String ModifiedAccount) {
        this.ModifiedAccount = ModifiedAccount;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 修改原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeReason 修改原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChangeReason() {
        return this.ChangeReason;
    }

    /**
     * Set 修改原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeReason 修改原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeReason(String ChangeReason) {
        this.ChangeReason = ChangeReason;
    }

    /**
     * Get 修改人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedAccountName 修改人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedAccountName() {
        return this.ModifiedAccountName;
    }

    /**
     * Set 修改人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedAccountName 修改人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedAccountName(String ModifiedAccountName) {
        this.ModifiedAccountName = ModifiedAccountName;
    }

    public ChangeLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeLog(ChangeLog source) {
        if (source.ChangeType != null) {
            this.ChangeType = new String(source.ChangeType);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
        if (source.ModifiedAccount != null) {
            this.ModifiedAccount = new String(source.ModifiedAccount);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ChangeReason != null) {
            this.ChangeReason = new String(source.ChangeReason);
        }
        if (source.ModifiedAccountName != null) {
            this.ModifiedAccountName = new String(source.ModifiedAccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChangeType", this.ChangeType);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "ModifiedAccount", this.ModifiedAccount);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ChangeReason", this.ChangeReason);
        this.setParamSimple(map, prefix + "ModifiedAccountName", this.ModifiedAccountName);

    }
}

