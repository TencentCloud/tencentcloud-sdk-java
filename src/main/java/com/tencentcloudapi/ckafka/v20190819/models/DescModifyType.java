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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescModifyType extends AbstractModel {

    /**
    * 变配类型
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * 是否迁移标志
    */
    @SerializedName("MigrateFlag")
    @Expose
    private Boolean MigrateFlag;

    /**
    * 迁移预计耗时(稳定模式)秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrateCostTime")
    @Expose
    private Long MigrateCostTime;

    /**
    * 升配模式(1:稳定模式，2:高速模式)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpgradeStrategy")
    @Expose
    private Long UpgradeStrategy;

    /**
    * 迁移预计耗时(高速模式)秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrateCostTimeHighSpeed")
    @Expose
    private Long MigrateCostTimeHighSpeed;

    /**
     * Get 变配类型 
     * @return ModifyType 变配类型
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 变配类型
     * @param ModifyType 变配类型
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 是否迁移标志 
     * @return MigrateFlag 是否迁移标志
     */
    public Boolean getMigrateFlag() {
        return this.MigrateFlag;
    }

    /**
     * Set 是否迁移标志
     * @param MigrateFlag 是否迁移标志
     */
    public void setMigrateFlag(Boolean MigrateFlag) {
        this.MigrateFlag = MigrateFlag;
    }

    /**
     * Get 迁移预计耗时(稳定模式)秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrateCostTime 迁移预计耗时(稳定模式)秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMigrateCostTime() {
        return this.MigrateCostTime;
    }

    /**
     * Set 迁移预计耗时(稳定模式)秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrateCostTime 迁移预计耗时(稳定模式)秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrateCostTime(Long MigrateCostTime) {
        this.MigrateCostTime = MigrateCostTime;
    }

    /**
     * Get 升配模式(1:稳定模式，2:高速模式)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpgradeStrategy 升配模式(1:稳定模式，2:高速模式)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpgradeStrategy() {
        return this.UpgradeStrategy;
    }

    /**
     * Set 升配模式(1:稳定模式，2:高速模式)
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpgradeStrategy 升配模式(1:稳定模式，2:高速模式)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpgradeStrategy(Long UpgradeStrategy) {
        this.UpgradeStrategy = UpgradeStrategy;
    }

    /**
     * Get 迁移预计耗时(高速模式)秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrateCostTimeHighSpeed 迁移预计耗时(高速模式)秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMigrateCostTimeHighSpeed() {
        return this.MigrateCostTimeHighSpeed;
    }

    /**
     * Set 迁移预计耗时(高速模式)秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrateCostTimeHighSpeed 迁移预计耗时(高速模式)秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrateCostTimeHighSpeed(Long MigrateCostTimeHighSpeed) {
        this.MigrateCostTimeHighSpeed = MigrateCostTimeHighSpeed;
    }

    public DescModifyType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescModifyType(DescModifyType source) {
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.MigrateFlag != null) {
            this.MigrateFlag = new Boolean(source.MigrateFlag);
        }
        if (source.MigrateCostTime != null) {
            this.MigrateCostTime = new Long(source.MigrateCostTime);
        }
        if (source.UpgradeStrategy != null) {
            this.UpgradeStrategy = new Long(source.UpgradeStrategy);
        }
        if (source.MigrateCostTimeHighSpeed != null) {
            this.MigrateCostTimeHighSpeed = new Long(source.MigrateCostTimeHighSpeed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "MigrateFlag", this.MigrateFlag);
        this.setParamSimple(map, prefix + "MigrateCostTime", this.MigrateCostTime);
        this.setParamSimple(map, prefix + "UpgradeStrategy", this.UpgradeStrategy);
        this.setParamSimple(map, prefix + "MigrateCostTimeHighSpeed", this.MigrateCostTimeHighSpeed);

    }
}

