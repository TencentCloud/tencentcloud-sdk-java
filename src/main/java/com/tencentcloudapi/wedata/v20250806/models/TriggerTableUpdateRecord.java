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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTableUpdateRecord extends AbstractModel {

    /**
    * <p>表全名</p><p>参数格式：格式 catalog.schema.table</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableQualifier")
    @Expose
    private String TableQualifier;

    /**
    * <p>表更新时间</p><p>参数格式：时间戳格式，如：1792951200000</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>表更新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateVersion")
    @Expose
    private String UpdateVersion;

    /**
    * <p>数据资产ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
     * Get <p>表全名</p><p>参数格式：格式 catalog.schema.table</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableQualifier <p>表全名</p><p>参数格式：格式 catalog.schema.table</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableQualifier() {
        return this.TableQualifier;
    }

    /**
     * Set <p>表全名</p><p>参数格式：格式 catalog.schema.table</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableQualifier <p>表全名</p><p>参数格式：格式 catalog.schema.table</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableQualifier(String TableQualifier) {
        this.TableQualifier = TableQualifier;
    }

    /**
     * Get <p>表更新时间</p><p>参数格式：时间戳格式，如：1792951200000</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>表更新时间</p><p>参数格式：时间戳格式，如：1792951200000</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>表更新时间</p><p>参数格式：时间戳格式，如：1792951200000</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>表更新时间</p><p>参数格式：时间戳格式，如：1792951200000</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>表更新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateVersion <p>表更新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateVersion() {
        return this.UpdateVersion;
    }

    /**
     * Set <p>表更新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateVersion <p>表更新版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateVersion(String UpdateVersion) {
        this.UpdateVersion = UpdateVersion;
    }

    /**
     * Get <p>数据资产ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetGuid <p>数据资产ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set <p>数据资产ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetGuid <p>数据资产ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    public TriggerTableUpdateRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTableUpdateRecord(TriggerTableUpdateRecord source) {
        if (source.TableQualifier != null) {
            this.TableQualifier = new String(source.TableQualifier);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UpdateVersion != null) {
            this.UpdateVersion = new String(source.UpdateVersion);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableQualifier", this.TableQualifier);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateVersion", this.UpdateVersion);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);

    }
}

