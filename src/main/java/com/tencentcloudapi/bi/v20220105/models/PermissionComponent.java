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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionComponent extends AbstractModel {

    /**
    * 权限值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 可见/可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeType")
    @Expose
    private String IncludeType;

    /**
    * 目标升级版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpgradeVersionType")
    @Expose
    private String UpgradeVersionType;

    /**
    * 补充信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * 补充信息的key值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TipsKey")
    @Expose
    private String TipsKey;

    /**
     * Get 权限值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleId 权限值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 权限值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleId 权限值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 可见/可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeType 可见/可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncludeType() {
        return this.IncludeType;
    }

    /**
     * Set 可见/可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeType 可见/可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeType(String IncludeType) {
        this.IncludeType = IncludeType;
    }

    /**
     * Get 目标升级版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpgradeVersionType 目标升级版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpgradeVersionType() {
        return this.UpgradeVersionType;
    }

    /**
     * Set 目标升级版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpgradeVersionType 目标升级版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpgradeVersionType(String UpgradeVersionType) {
        this.UpgradeVersionType = UpgradeVersionType;
    }

    /**
     * Get 补充信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tips 补充信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set 补充信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tips 补充信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get 补充信息的key值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TipsKey 补充信息的key值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTipsKey() {
        return this.TipsKey;
    }

    /**
     * Set 补充信息的key值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TipsKey 补充信息的key值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTipsKey(String TipsKey) {
        this.TipsKey = TipsKey;
    }

    public PermissionComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionComponent(PermissionComponent source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.IncludeType != null) {
            this.IncludeType = new String(source.IncludeType);
        }
        if (source.UpgradeVersionType != null) {
            this.UpgradeVersionType = new String(source.UpgradeVersionType);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
        }
        if (source.TipsKey != null) {
            this.TipsKey = new String(source.TipsKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "IncludeType", this.IncludeType);
        this.setParamSimple(map, prefix + "UpgradeVersionType", this.UpgradeVersionType);
        this.setParamSimple(map, prefix + "Tips", this.Tips);
        this.setParamSimple(map, prefix + "TipsKey", this.TipsKey);

    }
}

