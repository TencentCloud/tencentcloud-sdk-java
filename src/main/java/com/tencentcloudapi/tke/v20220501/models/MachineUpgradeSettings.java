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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineUpgradeSettings extends AbstractModel {

    /**
    * 是否开启自动升级
    */
    @SerializedName("AutoUpgrade")
    @Expose
    private Boolean AutoUpgrade;

    /**
    * 运维窗口
    */
    @SerializedName("UpgradeOptions")
    @Expose
    private AutoUpgradeOptions UpgradeOptions;

    /**
    * 升级项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * 升级时，最大不可升级的节点数
    */
    @SerializedName("MaxUnavailable")
    @Expose
    private IntOrString MaxUnavailable;

    /**
     * Get 是否开启自动升级 
     * @return AutoUpgrade 是否开启自动升级
     */
    public Boolean getAutoUpgrade() {
        return this.AutoUpgrade;
    }

    /**
     * Set 是否开启自动升级
     * @param AutoUpgrade 是否开启自动升级
     */
    public void setAutoUpgrade(Boolean AutoUpgrade) {
        this.AutoUpgrade = AutoUpgrade;
    }

    /**
     * Get 运维窗口 
     * @return UpgradeOptions 运维窗口
     */
    public AutoUpgradeOptions getUpgradeOptions() {
        return this.UpgradeOptions;
    }

    /**
     * Set 运维窗口
     * @param UpgradeOptions 运维窗口
     */
    public void setUpgradeOptions(AutoUpgradeOptions UpgradeOptions) {
        this.UpgradeOptions = UpgradeOptions;
    }

    /**
     * Get 升级项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Components 升级项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set 升级项
注意：此字段可能返回 null，表示取不到有效值。
     * @param Components 升级项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get 升级时，最大不可升级的节点数 
     * @return MaxUnavailable 升级时，最大不可升级的节点数
     */
    public IntOrString getMaxUnavailable() {
        return this.MaxUnavailable;
    }

    /**
     * Set 升级时，最大不可升级的节点数
     * @param MaxUnavailable 升级时，最大不可升级的节点数
     */
    public void setMaxUnavailable(IntOrString MaxUnavailable) {
        this.MaxUnavailable = MaxUnavailable;
    }

    public MachineUpgradeSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineUpgradeSettings(MachineUpgradeSettings source) {
        if (source.AutoUpgrade != null) {
            this.AutoUpgrade = new Boolean(source.AutoUpgrade);
        }
        if (source.UpgradeOptions != null) {
            this.UpgradeOptions = new AutoUpgradeOptions(source.UpgradeOptions);
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.MaxUnavailable != null) {
            this.MaxUnavailable = new IntOrString(source.MaxUnavailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoUpgrade", this.AutoUpgrade);
        this.setParamObj(map, prefix + "UpgradeOptions.", this.UpgradeOptions);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamObj(map, prefix + "MaxUnavailable.", this.MaxUnavailable);

    }
}

