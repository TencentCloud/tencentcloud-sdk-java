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
    * <p>同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。</p>
    */
    @SerializedName("InitType")
    @Expose
    private String InitType;

    /**
    * <p>同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)</p>
    */
    @SerializedName("DealOfExistSameTable")
    @Expose
    private String DealOfExistSameTable;

    /**
    * <p>冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)</p>
    */
    @SerializedName("ConflictHandleType")
    @Expose
    private String ConflictHandleType;

    /**
    * <p>是否添加附加列</p>
    */
    @SerializedName("AddAdditionalColumn")
    @Expose
    private Boolean AddAdditionalColumn;

    /**
    * <p>所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * <p>冲突处理的详细选项，如条件覆盖中的条件行和条件操作</p>
    */
    @SerializedName("ConflictHandleOption")
    @Expose
    private ConflictHandleOption ConflictHandleOption;

    /**
    * <p>DDL同步选项，具体描述要同步哪些DDL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
    * <p>kafka同步选项</p>
    */
    @SerializedName("KafkaOption")
    @Expose
    private KafkaOption KafkaOption;

    /**
    * <p>任务限速信息</p>
    */
    @SerializedName("RateLimitOption")
    @Expose
    private RateLimitOption RateLimitOption;

    /**
    * <p>自动重试的时间窗口设置</p>
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * <p>同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。</p>
    */
    @SerializedName("StartPosition")
    @Expose
    private String StartPosition;

    /**
    * <p>同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持</p>
    */
    @SerializedName("FilterBeginCommit")
    @Expose
    private Boolean FilterBeginCommit;

    /**
    * <p>同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持</p>
    */
    @SerializedName("FilterCheckpoint")
    @Expose
    private Boolean FilterCheckpoint;

    /**
     * Get <p>同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。</p> 
     * @return InitType <p>同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。</p>
     */
    public String getInitType() {
        return this.InitType;
    }

    /**
     * Set <p>同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。</p>
     * @param InitType <p>同步初始化选项，Data(全量数据初始化)、Structure(结构初始化)、Full(全量数据且结构初始化，默认)、None(仅增量)；mongodb链路只支持全量数据初始化或仅增量。</p>
     */
    public void setInitType(String InitType) {
        this.InitType = InitType;
    }

    /**
     * Get <p>同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)</p> 
     * @return DealOfExistSameTable <p>同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)</p>
     */
    public String getDealOfExistSameTable() {
        return this.DealOfExistSameTable;
    }

    /**
     * Set <p>同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)</p>
     * @param DealOfExistSameTable <p>同名表的处理，ReportErrorAfterCheck(前置校验并报错，默认)、ExecuteAfterIgnore(忽略并继续执行)</p>
     */
    public void setDealOfExistSameTable(String DealOfExistSameTable) {
        this.DealOfExistSameTable = DealOfExistSameTable;
    }

    /**
     * Get <p>冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)</p> 
     * @return ConflictHandleType <p>冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)</p>
     */
    public String getConflictHandleType() {
        return this.ConflictHandleType;
    }

    /**
     * Set <p>冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)</p>
     * @param ConflictHandleType <p>冲突处理选项，ReportError(报错，默认为该值)、Ignore(忽略)、Cover(覆盖)、ConditionCover(条件覆盖)</p>
     */
    public void setConflictHandleType(String ConflictHandleType) {
        this.ConflictHandleType = ConflictHandleType;
    }

    /**
     * Get <p>是否添加附加列</p> 
     * @return AddAdditionalColumn <p>是否添加附加列</p>
     */
    public Boolean getAddAdditionalColumn() {
        return this.AddAdditionalColumn;
    }

    /**
     * Set <p>是否添加附加列</p>
     * @param AddAdditionalColumn <p>是否添加附加列</p>
     */
    public void setAddAdditionalColumn(Boolean AddAdditionalColumn) {
        this.AddAdditionalColumn = AddAdditionalColumn;
    }

    /**
     * Get <p>所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpTypes <p>所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set <p>所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpTypes <p>所要同步的DML和DDL的选项，Insert(插入操作)、Update(更新操作)、Delete(删除操作)、DDL(结构同步)， PartialDDL(自定义,和DdlOptions一起配合使用)。注意，这里至少需要包含DML中的一种。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get <p>冲突处理的详细选项，如条件覆盖中的条件行和条件操作</p> 
     * @return ConflictHandleOption <p>冲突处理的详细选项，如条件覆盖中的条件行和条件操作</p>
     */
    public ConflictHandleOption getConflictHandleOption() {
        return this.ConflictHandleOption;
    }

    /**
     * Set <p>冲突处理的详细选项，如条件覆盖中的条件行和条件操作</p>
     * @param ConflictHandleOption <p>冲突处理的详细选项，如条件覆盖中的条件行和条件操作</p>
     */
    public void setConflictHandleOption(ConflictHandleOption ConflictHandleOption) {
        this.ConflictHandleOption = ConflictHandleOption;
    }

    /**
     * Get <p>DDL同步选项，具体描述要同步哪些DDL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdlOptions <p>DDL同步选项，具体描述要同步哪些DDL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set <p>DDL同步选项，具体描述要同步哪些DDL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdlOptions <p>DDL同步选项，具体描述要同步哪些DDL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    /**
     * Get <p>kafka同步选项</p> 
     * @return KafkaOption <p>kafka同步选项</p>
     */
    public KafkaOption getKafkaOption() {
        return this.KafkaOption;
    }

    /**
     * Set <p>kafka同步选项</p>
     * @param KafkaOption <p>kafka同步选项</p>
     */
    public void setKafkaOption(KafkaOption KafkaOption) {
        this.KafkaOption = KafkaOption;
    }

    /**
     * Get <p>任务限速信息</p> 
     * @return RateLimitOption <p>任务限速信息</p>
     */
    public RateLimitOption getRateLimitOption() {
        return this.RateLimitOption;
    }

    /**
     * Set <p>任务限速信息</p>
     * @param RateLimitOption <p>任务限速信息</p>
     */
    public void setRateLimitOption(RateLimitOption RateLimitOption) {
        this.RateLimitOption = RateLimitOption;
    }

    /**
     * Get <p>自动重试的时间窗口设置</p> 
     * @return AutoRetryTimeRangeMinutes <p>自动重试的时间窗口设置</p>
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set <p>自动重试的时间窗口设置</p>
     * @param AutoRetryTimeRangeMinutes <p>自动重试的时间窗口设置</p>
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get <p>同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。</p> 
     * @return StartPosition <p>同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。</p>
     */
    public String getStartPosition() {
        return this.StartPosition;
    }

    /**
     * Set <p>同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。</p>
     * @param StartPosition <p>同步到kafka链路指定位点。目前只支持时间格式：2023-12-20T19:24:23+08:00。如果没有指定位点，为空。</p>
     */
    public void setStartPosition(String StartPosition) {
        this.StartPosition = StartPosition;
    }

    /**
     * Get <p>同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持</p> 
     * @return FilterBeginCommit <p>同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持</p>
     */
    public Boolean getFilterBeginCommit() {
        return this.FilterBeginCommit;
    }

    /**
     * Set <p>同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持</p>
     * @param FilterBeginCommit <p>同步到kafka链路是否过滤掉begin和commit消息。目前仅mysql2kafka链路支持</p>
     */
    public void setFilterBeginCommit(Boolean FilterBeginCommit) {
        this.FilterBeginCommit = FilterBeginCommit;
    }

    /**
     * Get <p>同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持</p> 
     * @return FilterCheckpoint <p>同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持</p>
     */
    public Boolean getFilterCheckpoint() {
        return this.FilterCheckpoint;
    }

    /**
     * Set <p>同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持</p>
     * @param FilterCheckpoint <p>同步到kafka链路是否过滤掉checkpoint消息。目前仅mysql2kafka链路支持</p>
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

