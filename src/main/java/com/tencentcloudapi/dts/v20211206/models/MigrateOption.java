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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateOption extends AbstractModel{

    /**
    * 迁移对象选项，需要告知迁移服务迁移哪些库表对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseTable")
    @Expose
    private DatabaseTableObject DatabaseTable;

    /**
    * 迁移类型，full(全量迁移)，structure(结构迁移)，fullAndIncrement(全量加增量迁移)， 默认为fullAndIncrement
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrateType")
    @Expose
    private String MigrateType;

    /**
    * 数据一致性校验选项， 默认为不开启一致性校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Consistency")
    @Expose
    private ConsistencyOption Consistency;

    /**
    * 是否迁移账号，yes(迁移账号)，no(不迁移账号)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMigrateAccount")
    @Expose
    private Boolean IsMigrateAccount;

    /**
    * 是否用源库Root账户覆盖目标库，值包括：false-不覆盖，true-覆盖，选择库表或者结构迁移时应该为false，注意只对旧版迁移有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOverrideRoot")
    @Expose
    private Boolean IsOverrideRoot;

    /**
    * 是否在迁移时设置目标库只读(仅对mysql有效)，true(设置只读)、false(不设置只读，默认此值)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDstReadOnly")
    @Expose
    private Boolean IsDstReadOnly;

    /**
    * 其他附加信息，对于特定库可设置额外参数，Redis可定义如下的参数: 
["ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 	"ReplTimeout":120，		复制超时时间(秒) ]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
     * Get 迁移对象选项，需要告知迁移服务迁移哪些库表对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseTable 迁移对象选项，需要告知迁移服务迁移哪些库表对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatabaseTableObject getDatabaseTable() {
        return this.DatabaseTable;
    }

    /**
     * Set 迁移对象选项，需要告知迁移服务迁移哪些库表对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseTable 迁移对象选项，需要告知迁移服务迁移哪些库表对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseTable(DatabaseTableObject DatabaseTable) {
        this.DatabaseTable = DatabaseTable;
    }

    /**
     * Get 迁移类型，full(全量迁移)，structure(结构迁移)，fullAndIncrement(全量加增量迁移)， 默认为fullAndIncrement
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrateType 迁移类型，full(全量迁移)，structure(结构迁移)，fullAndIncrement(全量加增量迁移)， 默认为fullAndIncrement
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set 迁移类型，full(全量迁移)，structure(结构迁移)，fullAndIncrement(全量加增量迁移)， 默认为fullAndIncrement
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrateType 迁移类型，full(全量迁移)，structure(结构迁移)，fullAndIncrement(全量加增量迁移)， 默认为fullAndIncrement
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrateType(String MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get 数据一致性校验选项， 默认为不开启一致性校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Consistency 数据一致性校验选项， 默认为不开启一致性校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsistencyOption getConsistency() {
        return this.Consistency;
    }

    /**
     * Set 数据一致性校验选项， 默认为不开启一致性校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param Consistency 数据一致性校验选项， 默认为不开启一致性校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsistency(ConsistencyOption Consistency) {
        this.Consistency = Consistency;
    }

    /**
     * Get 是否迁移账号，yes(迁移账号)，no(不迁移账号)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMigrateAccount 是否迁移账号，yes(迁移账号)，no(不迁移账号)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsMigrateAccount() {
        return this.IsMigrateAccount;
    }

    /**
     * Set 是否迁移账号，yes(迁移账号)，no(不迁移账号)
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMigrateAccount 是否迁移账号，yes(迁移账号)，no(不迁移账号)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMigrateAccount(Boolean IsMigrateAccount) {
        this.IsMigrateAccount = IsMigrateAccount;
    }

    /**
     * Get 是否用源库Root账户覆盖目标库，值包括：false-不覆盖，true-覆盖，选择库表或者结构迁移时应该为false，注意只对旧版迁移有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOverrideRoot 是否用源库Root账户覆盖目标库，值包括：false-不覆盖，true-覆盖，选择库表或者结构迁移时应该为false，注意只对旧版迁移有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOverrideRoot() {
        return this.IsOverrideRoot;
    }

    /**
     * Set 是否用源库Root账户覆盖目标库，值包括：false-不覆盖，true-覆盖，选择库表或者结构迁移时应该为false，注意只对旧版迁移有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOverrideRoot 是否用源库Root账户覆盖目标库，值包括：false-不覆盖，true-覆盖，选择库表或者结构迁移时应该为false，注意只对旧版迁移有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOverrideRoot(Boolean IsOverrideRoot) {
        this.IsOverrideRoot = IsOverrideRoot;
    }

    /**
     * Get 是否在迁移时设置目标库只读(仅对mysql有效)，true(设置只读)、false(不设置只读，默认此值)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDstReadOnly 是否在迁移时设置目标库只读(仅对mysql有效)，true(设置只读)、false(不设置只读，默认此值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDstReadOnly() {
        return this.IsDstReadOnly;
    }

    /**
     * Set 是否在迁移时设置目标库只读(仅对mysql有效)，true(设置只读)、false(不设置只读，默认此值)
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDstReadOnly 是否在迁移时设置目标库只读(仅对mysql有效)，true(设置只读)、false(不设置只读，默认此值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDstReadOnly(Boolean IsDstReadOnly) {
        this.IsDstReadOnly = IsDstReadOnly;
    }

    /**
     * Get 其他附加信息，对于特定库可设置额外参数，Redis可定义如下的参数: 
["ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 	"ReplTimeout":120，		复制超时时间(秒) ]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraAttr 其他附加信息，对于特定库可设置额外参数，Redis可定义如下的参数: 
["ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 	"ReplTimeout":120，		复制超时时间(秒) ]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set 其他附加信息，对于特定库可设置额外参数，Redis可定义如下的参数: 
["ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 	"ReplTimeout":120，		复制超时时间(秒) ]
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraAttr 其他附加信息，对于特定库可设置额外参数，Redis可定义如下的参数: 
["ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 	"ReplTimeout":120，		复制超时时间(秒) ]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    public MigrateOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateOption(MigrateOption source) {
        if (source.DatabaseTable != null) {
            this.DatabaseTable = new DatabaseTableObject(source.DatabaseTable);
        }
        if (source.MigrateType != null) {
            this.MigrateType = new String(source.MigrateType);
        }
        if (source.Consistency != null) {
            this.Consistency = new ConsistencyOption(source.Consistency);
        }
        if (source.IsMigrateAccount != null) {
            this.IsMigrateAccount = new Boolean(source.IsMigrateAccount);
        }
        if (source.IsOverrideRoot != null) {
            this.IsOverrideRoot = new Boolean(source.IsOverrideRoot);
        }
        if (source.IsDstReadOnly != null) {
            this.IsDstReadOnly = new Boolean(source.IsDstReadOnly);
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabaseTable.", this.DatabaseTable);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamObj(map, prefix + "Consistency.", this.Consistency);
        this.setParamSimple(map, prefix + "IsMigrateAccount", this.IsMigrateAccount);
        this.setParamSimple(map, prefix + "IsOverrideRoot", this.IsOverrideRoot);
        this.setParamSimple(map, prefix + "IsDstReadOnly", this.IsDstReadOnly);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);

    }
}

