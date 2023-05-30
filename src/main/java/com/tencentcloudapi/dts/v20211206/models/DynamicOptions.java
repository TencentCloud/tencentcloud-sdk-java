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

public class DynamicOptions extends AbstractModel{

    /**
    * 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)，PartialDDL(自定义,和DdlOptions一起起作用 )；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * DDL同步选项，具体描述要同步那些DDL; 当OpTypes取值PartialDDL时、字段不能为空；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
    * 冲突处理选项，ReportError(报错)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖); 目前目标端为kafka的链路不支持修改该配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConflictHandleType")
    @Expose
    private String ConflictHandleType;

    /**
    * 冲突处理的详细选项，如条件覆盖中的条件行和条件操作；不能部分更新该选项的内部字段；有更新时、需要全量更新该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConflictHandleOption")
    @Expose
    private ConflictHandleOption ConflictHandleOption;

    /**
     * Get 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)，PartialDDL(自定义,和DdlOptions一起起作用 )；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpTypes 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)，PartialDDL(自定义,和DdlOptions一起起作用 )；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)，PartialDDL(自定义,和DdlOptions一起起作用 )；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpTypes 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)，PartialDDL(自定义,和DdlOptions一起起作用 )；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get DDL同步选项，具体描述要同步那些DDL; 当OpTypes取值PartialDDL时、字段不能为空；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdlOptions DDL同步选项，具体描述要同步那些DDL; 当OpTypes取值PartialDDL时、字段不能为空；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set DDL同步选项，具体描述要同步那些DDL; 当OpTypes取值PartialDDL时、字段不能为空；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdlOptions DDL同步选项，具体描述要同步那些DDL; 当OpTypes取值PartialDDL时、字段不能为空；必填、dts会用该值覆盖原有的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    /**
     * Get 冲突处理选项，ReportError(报错)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖); 目前目标端为kafka的链路不支持修改该配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConflictHandleType 冲突处理选项，ReportError(报错)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖); 目前目标端为kafka的链路不支持修改该配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConflictHandleType() {
        return this.ConflictHandleType;
    }

    /**
     * Set 冲突处理选项，ReportError(报错)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖); 目前目标端为kafka的链路不支持修改该配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConflictHandleType 冲突处理选项，ReportError(报错)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖); 目前目标端为kafka的链路不支持修改该配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConflictHandleType(String ConflictHandleType) {
        this.ConflictHandleType = ConflictHandleType;
    }

    /**
     * Get 冲突处理的详细选项，如条件覆盖中的条件行和条件操作；不能部分更新该选项的内部字段；有更新时、需要全量更新该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConflictHandleOption 冲突处理的详细选项，如条件覆盖中的条件行和条件操作；不能部分更新该选项的内部字段；有更新时、需要全量更新该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConflictHandleOption getConflictHandleOption() {
        return this.ConflictHandleOption;
    }

    /**
     * Set 冲突处理的详细选项，如条件覆盖中的条件行和条件操作；不能部分更新该选项的内部字段；有更新时、需要全量更新该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConflictHandleOption 冲突处理的详细选项，如条件覆盖中的条件行和条件操作；不能部分更新该选项的内部字段；有更新时、需要全量更新该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConflictHandleOption(ConflictHandleOption ConflictHandleOption) {
        this.ConflictHandleOption = ConflictHandleOption;
    }

    public DynamicOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicOptions(DynamicOptions source) {
        if (source.OpTypes != null) {
            this.OpTypes = new String[source.OpTypes.length];
            for (int i = 0; i < source.OpTypes.length; i++) {
                this.OpTypes[i] = new String(source.OpTypes[i]);
            }
        }
        if (source.DdlOptions != null) {
            this.DdlOptions = new DdlOption[source.DdlOptions.length];
            for (int i = 0; i < source.DdlOptions.length; i++) {
                this.DdlOptions[i] = new DdlOption(source.DdlOptions[i]);
            }
        }
        if (source.ConflictHandleType != null) {
            this.ConflictHandleType = new String(source.ConflictHandleType);
        }
        if (source.ConflictHandleOption != null) {
            this.ConflictHandleOption = new ConflictHandleOption(source.ConflictHandleOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OpTypes.", this.OpTypes);
        this.setParamArrayObj(map, prefix + "DdlOptions.", this.DdlOptions);
        this.setParamSimple(map, prefix + "ConflictHandleType", this.ConflictHandleType);
        this.setParamObj(map, prefix + "ConflictHandleOption.", this.ConflictHandleOption);

    }
}

