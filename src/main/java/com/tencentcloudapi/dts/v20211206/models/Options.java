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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Options extends AbstractModel {

    /**
    * 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。
    */
    @SerializedName("InitType")
    @Expose
    private String InitType;

    /**
    * 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)
    */
    @SerializedName("DealOfExistSameTable")
    @Expose
    private String DealOfExistSameTable;

    /**
    * 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
    */
    @SerializedName("ConflictHandleType")
    @Expose
    private String ConflictHandleType;

    /**
    * 是否添加附加列
    */
    @SerializedName("AddAdditionalColumn")
    @Expose
    private Boolean AddAdditionalColumn;

    /**
    * 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
    */
    @SerializedName("ConflictHandleOption")
    @Expose
    private ConflictHandleOption ConflictHandleOption;

    /**
    * DDL同步选项，具体描述要同步哪些DDL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
    * kafka同步选项
    */
    @SerializedName("KafkaOption")
    @Expose
    private KafkaOption KafkaOption;

    /**
    * 任务限速信息
    */
    @SerializedName("RateLimitOption")
    @Expose
    private RateLimitOption RateLimitOption;

    /**
    * 自动重试的时间窗口设置
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * 同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。
    */
    @SerializedName("StartPosition")
    @Expose
    private String StartPosition;

    /**
    * 同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持
    */
    @SerializedName("FilterBeginCommit")
    @Expose
    private Boolean FilterBeginCommit;

    /**
    * 同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持
    */
    @SerializedName("FilterCheckpoint")
    @Expose
    private Boolean FilterCheckpoint;

    /**
     * Get 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。 
     * @return InitType 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。
     */
    public String getInitType() {
        return this.InitType;
    }

    /**
     * Set 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。
     * @param InitType 同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。
     */
    public void setInitType(String InitType) {
        this.InitType = InitType;
    }

    /**
     * Get 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行) 
     * @return DealOfExistSameTable 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)
     */
    public String getDealOfExistSameTable() {
        return this.DealOfExistSameTable;
    }

    /**
     * Set 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)
     * @param DealOfExistSameTable 同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)
     */
    public void setDealOfExistSameTable(String DealOfExistSameTable) {
        this.DealOfExistSameTable = DealOfExistSameTable;
    }

    /**
     * Get 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖) 
     * @return ConflictHandleType 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
     */
    public String getConflictHandleType() {
        return this.ConflictHandleType;
    }

    /**
     * Set 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
     * @param ConflictHandleType 冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)
     */
    public void setConflictHandleType(String ConflictHandleType) {
        this.ConflictHandleType = ConflictHandleType;
    }

    /**
     * Get 是否添加附加列 
     * @return AddAdditionalColumn 是否添加附加列
     */
    public Boolean getAddAdditionalColumn() {
        return this.AddAdditionalColumn;
    }

    /**
     * Set 是否添加附加列
     * @param AddAdditionalColumn 是否添加附加列
     */
    public void setAddAdditionalColumn(Boolean AddAdditionalColumn) {
        this.AddAdditionalColumn = AddAdditionalColumn;
    }

    /**
     * Get 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpTypes 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpTypes 所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get 冲突处理的详细选项，如条件覆盖中的条件行和条件操作 
     * @return ConflictHandleOption 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
     */
    public ConflictHandleOption getConflictHandleOption() {
        return this.ConflictHandleOption;
    }

    /**
     * Set 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
     * @param ConflictHandleOption 冲突处理的详细选项，如条件覆盖中的条件行和条件操作
     */
    public void setConflictHandleOption(ConflictHandleOption ConflictHandleOption) {
        this.ConflictHandleOption = ConflictHandleOption;
    }

    /**
     * Get DDL同步选项，具体描述要同步哪些DDL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdlOptions DDL同步选项，具体描述要同步哪些DDL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set DDL同步选项，具体描述要同步哪些DDL
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdlOptions DDL同步选项，具体描述要同步哪些DDL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    /**
     * Get kafka同步选项 
     * @return KafkaOption kafka同步选项
     */
    public KafkaOption getKafkaOption() {
        return this.KafkaOption;
    }

    /**
     * Set kafka同步选项
     * @param KafkaOption kafka同步选项
     */
    public void setKafkaOption(KafkaOption KafkaOption) {
        this.KafkaOption = KafkaOption;
    }

    /**
     * Get 任务限速信息 
     * @return RateLimitOption 任务限速信息
     */
    public RateLimitOption getRateLimitOption() {
        return this.RateLimitOption;
    }

    /**
     * Set 任务限速信息
     * @param RateLimitOption 任务限速信息
     */
    public void setRateLimitOption(RateLimitOption RateLimitOption) {
        this.RateLimitOption = RateLimitOption;
    }

    /**
     * Get 自动重试的时间窗口设置 
     * @return AutoRetryTimeRangeMinutes 自动重试的时间窗口设置
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set 自动重试的时间窗口设置
     * @param AutoRetryTimeRangeMinutes 自动重试的时间窗口设置
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get 同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。 
     * @return StartPosition 同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。
     */
    public String getStartPosition() {
        return this.StartPosition;
    }

    /**
     * Set 同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。
     * @param StartPosition 同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。
     */
    public void setStartPosition(String StartPosition) {
        this.StartPosition = StartPosition;
    }

    /**
     * Get 同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持 
     * @return FilterBeginCommit 同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持
     */
    public Boolean getFilterBeginCommit() {
        return this.FilterBeginCommit;
    }

    /**
     * Set 同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持
     * @param FilterBeginCommit 同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持
     */
    public void setFilterBeginCommit(Boolean FilterBeginCommit) {
        this.FilterBeginCommit = FilterBeginCommit;
    }

    /**
     * Get 同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持 
     * @return FilterCheckpoint 同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持
     */
    public Boolean getFilterCheckpoint() {
        return this.FilterCheckpoint;
    }

    /**
     * Set 同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持
     * @param FilterCheckpoint 同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持
     */
    public void setFilterCheckpoint(Boolean FilterCheckpoint) {
        this.FilterCheckpoint = FilterCheckpoint;
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
        if (source.KafkaOption != null) {
            this.KafkaOption = new KafkaOption(source.KafkaOption);
        }
        if (source.RateLimitOption != null) {
            this.RateLimitOption = new RateLimitOption(source.RateLimitOption);
        }
        if (source.AutoRetryTimeRangeMinutes != null) {
            this.AutoRetryTimeRangeMinutes = new Long(source.AutoRetryTimeRangeMinutes);
        }
        if (source.StartPosition != null) {
            this.StartPosition = new String(source.StartPosition);
        }
        if (source.FilterBeginCommit != null) {
            this.FilterBeginCommit = new Boolean(source.FilterBeginCommit);
        }
        if (source.FilterCheckpoint != null) {
            this.FilterCheckpoint = new Boolean(source.FilterCheckpoint);
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
        this.setParamObj(map, prefix + "KafkaOption.", this.KafkaOption);
        this.setParamObj(map, prefix + "RateLimitOption.", this.RateLimitOption);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);
        this.setParamSimple(map, prefix + "StartPosition", this.StartPosition);
        this.setParamSimple(map, prefix + "FilterBeginCommit", this.FilterBeginCommit);
        this.setParamSimple(map, prefix + "FilterCheckpoint", this.FilterCheckpoint);

    }
}

