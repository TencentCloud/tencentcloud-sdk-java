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

public class Options extends AbstractModel{

    /**
    * 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitType")
    @Expose
    private String InitType;

    /**
    * 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、InitializeAfterDelete(删除并重新初始化)、ExecuteAfterIgnore(忽略并继续执行)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealOfExistSameTable")
    @Expose
    private String DealOfExistSameTable;

    /**
    * 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConflictHandleType")
    @Expose
    private String ConflictHandleType;

    /**
    * 是否添加附加列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddAdditionalColumn")
    @Expose
    private Boolean AddAdditionalColumn;

    /**
    * 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， 不填（不选），PartialDDL(自定义,和DdlOptions一起起作用 )
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConflictHandleOption")
    @Expose
    private ConflictHandleOption ConflictHandleOption;

    /**
    * DDL同步选项，具体描述要同步那些DDL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
     * Get 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitType 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInitType() {
        return this.InitType;
    }

    /**
     * Set 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitType 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitType(String InitType) {
        this.InitType = InitType;
    }

    /**
     * Get 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、InitializeAfterDelete(删除并重新初始化)、ExecuteAfterIgnore(忽略并继续执行)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealOfExistSameTable 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、InitializeAfterDelete(删除并重新初始化)、ExecuteAfterIgnore(忽略并继续执行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealOfExistSameTable() {
        return this.DealOfExistSameTable;
    }

    /**
     * Set 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、InitializeAfterDelete(删除并重新初始化)、ExecuteAfterIgnore(忽略并继续执行)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealOfExistSameTable 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、InitializeAfterDelete(删除并重新初始化)、ExecuteAfterIgnore(忽略并继续执行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealOfExistSameTable(String DealOfExistSameTable) {
        this.DealOfExistSameTable = DealOfExistSameTable;
    }

    /**
     * Get 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConflictHandleType 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConflictHandleType() {
        return this.ConflictHandleType;
    }

    /**
     * Set 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConflictHandleType 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConflictHandleType(String ConflictHandleType) {
        this.ConflictHandleType = ConflictHandleType;
    }

    /**
     * Get 是否添加附加列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddAdditionalColumn 是否添加附加列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAddAdditionalColumn() {
        return this.AddAdditionalColumn;
    }

    /**
     * Set 是否添加附加列
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddAdditionalColumn 是否添加附加列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddAdditionalColumn(Boolean AddAdditionalColumn) {
        this.AddAdditionalColumn = AddAdditionalColumn;
    }

    /**
     * Get 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， 不填（不选），PartialDDL(自定义,和DdlOptions一起起作用 )
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpTypes 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， 不填（不选），PartialDDL(自定义,和DdlOptions一起起作用 )
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， 不填（不选），PartialDDL(自定义,和DdlOptions一起起作用 )
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpTypes 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， 不填（不选），PartialDDL(自定义,和DdlOptions一起起作用 )
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConflictHandleOption 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConflictHandleOption getConflictHandleOption() {
        return this.ConflictHandleOption;
    }

    /**
     * Set 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConflictHandleOption 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConflictHandleOption(ConflictHandleOption ConflictHandleOption) {
        this.ConflictHandleOption = ConflictHandleOption;
    }

    /**
     * Get DDL同步选项，具体描述要同步那些DDL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdlOptions DDL同步选项，具体描述要同步那些DDL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set DDL同步选项，具体描述要同步那些DDL
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdlOptions DDL同步选项，具体描述要同步那些DDL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    public Options() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Options(Options source) {
        if (source.InitType != null) {
            this.InitType = new String(source.InitType);
        }
        if (source.DealOfExistSameTable != null) {
            this.DealOfExistSameTable = new String(source.DealOfExistSameTable);
        }
        if (source.ConflictHandleType != null) {
            this.ConflictHandleType = new String(source.ConflictHandleType);
        }
        if (source.AddAdditionalColumn != null) {
            this.AddAdditionalColumn = new Boolean(source.AddAdditionalColumn);
        }
        if (source.OpTypes != null) {
            this.OpTypes = new String[source.OpTypes.length];
            for (int i = 0; i < source.OpTypes.length; i++) {
                this.OpTypes[i] = new String(source.OpTypes[i]);
            }
        }
        if (source.ConflictHandleOption != null) {
            this.ConflictHandleOption = new ConflictHandleOption(source.ConflictHandleOption);
        }
        if (source.DdlOptions != null) {
            this.DdlOptions = new DdlOption[source.DdlOptions.length];
            for (int i = 0; i < source.DdlOptions.length; i++) {
                this.DdlOptions[i] = new DdlOption(source.DdlOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitType", this.InitType);
        this.setParamSimple(map, prefix + "DealOfExistSameTable", this.DealOfExistSameTable);
        this.setParamSimple(map, prefix + "ConflictHandleType", this.ConflictHandleType);
        this.setParamSimple(map, prefix + "AddAdditionalColumn", this.AddAdditionalColumn);
        this.setParamArraySimple(map, prefix + "OpTypes.", this.OpTypes);
        this.setParamObj(map, prefix + "ConflictHandleOption.", this.ConflictHandleOption);
        this.setParamArrayObj(map, prefix + "DdlOptions.", this.DdlOptions);

    }
}

