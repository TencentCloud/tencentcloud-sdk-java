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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPADiscoveryTaskRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 任务开关，0 关闭，1 启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 执行计划， 0立即 1定时，选择“立即”时，扫描周期只能选择单次
    */
    @SerializedName("Plan")
    @Expose
    private Long Plan;

    /**
    * 扫描周期，0单次 1每天 2每周 3每月
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 资源所在地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 数据源类型，可取值如下：
cdb 表示云数据库 MySQL,
dcdb 表示TDSQL MySQL版,
mariadb 表示云数据库 MariaDB,
postgres 表示云数据库 PostgreSQL,
cynosdbpg 表示TDSQL-C PostgreSQL版,
cynosdbmysql 表示TDSQL-C MySQL版,
selfbuilt-db 表示自建数据库
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 通用规则集开关，0 关闭，1 启用
    */
    @SerializedName("GeneralRuleSetEnable")
    @Expose
    private Long GeneralRuleSetEnable;

    /**
    * 任务描述，最大长度为1024个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用于传入的数据源的条件，目前只支持数据库，所以目前表示数据库的名称，选择多个数据库，之间通过逗号分隔，若不选，则默认选择全部数据库
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 此参数必选。合规组ID列表，最多支持添加5个
    */
    @SerializedName("ComplianceGroupIds")
    @Expose
    private Long [] ComplianceGroupIds;

    /**
    * 任务定时启动时间，格式如：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
    */
    @SerializedName("TimingStartTime")
    @Expose
    private String TimingStartTime;

    /**
    * random-随机，asc生序，desc降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 抽样的条数，范围30-1000
    */
    @SerializedName("Rows")
    @Expose
    private Long Rows;

    /**
    * 抽样的排序字段
    */
    @SerializedName("GlobalOrderField")
    @Expose
    private String GlobalOrderField;

    /**
    * full:全量扫描 incre:变更扫描
    */
    @SerializedName("ScanRange")
    @Expose
    private String ScanRange;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复 
     * @return Name 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     * @param Name 任务名称，1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字，Name不可重复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 任务开关，0 关闭，1 启用 
     * @return Enable 任务开关，0 关闭，1 启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 任务开关，0 关闭，1 启用
     * @param Enable 任务开关，0 关闭，1 启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 执行计划， 0立即 1定时，选择“立即”时，扫描周期只能选择单次 
     * @return Plan 执行计划， 0立即 1定时，选择“立即”时，扫描周期只能选择单次
     */
    public Long getPlan() {
        return this.Plan;
    }

    /**
     * Set 执行计划， 0立即 1定时，选择“立即”时，扫描周期只能选择单次
     * @param Plan 执行计划， 0立即 1定时，选择“立即”时，扫描周期只能选择单次
     */
    public void setPlan(Long Plan) {
        this.Plan = Plan;
    }

    /**
     * Get 扫描周期，0单次 1每天 2每周 3每月 
     * @return Period 扫描周期，0单次 1每天 2每周 3每月
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 扫描周期，0单次 1每天 2每周 3每月
     * @param Period 扫描周期，0单次 1每天 2每周 3每月
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 资源所在地域 
     * @return ResourceRegion 资源所在地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
     * @param ResourceRegion 资源所在地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 数据源类型，可取值如下：
cdb 表示云数据库 MySQL,
dcdb 表示TDSQL MySQL版,
mariadb 表示云数据库 MariaDB,
postgres 表示云数据库 PostgreSQL,
cynosdbpg 表示TDSQL-C PostgreSQL版,
cynosdbmysql 表示TDSQL-C MySQL版,
selfbuilt-db 表示自建数据库 
     * @return DataSourceType 数据源类型，可取值如下：
cdb 表示云数据库 MySQL,
dcdb 表示TDSQL MySQL版,
mariadb 表示云数据库 MariaDB,
postgres 表示云数据库 PostgreSQL,
cynosdbpg 表示TDSQL-C PostgreSQL版,
cynosdbmysql 表示TDSQL-C MySQL版,
selfbuilt-db 表示自建数据库
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型，可取值如下：
cdb 表示云数据库 MySQL,
dcdb 表示TDSQL MySQL版,
mariadb 表示云数据库 MariaDB,
postgres 表示云数据库 PostgreSQL,
cynosdbpg 表示TDSQL-C PostgreSQL版,
cynosdbmysql 表示TDSQL-C MySQL版,
selfbuilt-db 表示自建数据库
     * @param DataSourceType 数据源类型，可取值如下：
cdb 表示云数据库 MySQL,
dcdb 表示TDSQL MySQL版,
mariadb 表示云数据库 MariaDB,
postgres 表示云数据库 PostgreSQL,
cynosdbpg 表示TDSQL-C PostgreSQL版,
cynosdbmysql 表示TDSQL-C MySQL版,
selfbuilt-db 表示自建数据库
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 通用规则集开关，0 关闭，1 启用 
     * @return GeneralRuleSetEnable 通用规则集开关，0 关闭，1 启用
     * @deprecated
     */
    @Deprecated
    public Long getGeneralRuleSetEnable() {
        return this.GeneralRuleSetEnable;
    }

    /**
     * Set 通用规则集开关，0 关闭，1 启用
     * @param GeneralRuleSetEnable 通用规则集开关，0 关闭，1 启用
     * @deprecated
     */
    @Deprecated
    public void setGeneralRuleSetEnable(Long GeneralRuleSetEnable) {
        this.GeneralRuleSetEnable = GeneralRuleSetEnable;
    }

    /**
     * Get 任务描述，最大长度为1024个字符 
     * @return Description 任务描述，最大长度为1024个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述，最大长度为1024个字符
     * @param Description 任务描述，最大长度为1024个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用于传入的数据源的条件，目前只支持数据库，所以目前表示数据库的名称，选择多个数据库，之间通过逗号分隔，若不选，则默认选择全部数据库 
     * @return Condition 用于传入的数据源的条件，目前只支持数据库，所以目前表示数据库的名称，选择多个数据库，之间通过逗号分隔，若不选，则默认选择全部数据库
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 用于传入的数据源的条件，目前只支持数据库，所以目前表示数据库的名称，选择多个数据库，之间通过逗号分隔，若不选，则默认选择全部数据库
     * @param Condition 用于传入的数据源的条件，目前只支持数据库，所以目前表示数据库的名称，选择多个数据库，之间通过逗号分隔，若不选，则默认选择全部数据库
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 此参数必选。合规组ID列表，最多支持添加5个 
     * @return ComplianceGroupIds 此参数必选。合规组ID列表，最多支持添加5个
     */
    public Long [] getComplianceGroupIds() {
        return this.ComplianceGroupIds;
    }

    /**
     * Set 此参数必选。合规组ID列表，最多支持添加5个
     * @param ComplianceGroupIds 此参数必选。合规组ID列表，最多支持添加5个
     */
    public void setComplianceGroupIds(Long [] ComplianceGroupIds) {
        this.ComplianceGroupIds = ComplianceGroupIds;
    }

    /**
     * Get 任务定时启动时间，格式如：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。 
     * @return TimingStartTime 任务定时启动时间，格式如：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
     */
    public String getTimingStartTime() {
        return this.TimingStartTime;
    }

    /**
     * Set 任务定时启动时间，格式如：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
     * @param TimingStartTime 任务定时启动时间，格式如：2006-01-02 15:04:05
当执行计划（Plan字段）为”立即“时，定时启动时间不会生效，此场景下给该字段传值不会被保存。
     */
    public void setTimingStartTime(String TimingStartTime) {
        this.TimingStartTime = TimingStartTime;
    }

    /**
     * Get random-随机，asc生序，desc降序 
     * @return Order random-随机，asc生序，desc降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set random-随机，asc生序，desc降序
     * @param Order random-随机，asc生序，desc降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 抽样的条数，范围30-1000 
     * @return Rows 抽样的条数，范围30-1000
     */
    public Long getRows() {
        return this.Rows;
    }

    /**
     * Set 抽样的条数，范围30-1000
     * @param Rows 抽样的条数，范围30-1000
     */
    public void setRows(Long Rows) {
        this.Rows = Rows;
    }

    /**
     * Get 抽样的排序字段 
     * @return GlobalOrderField 抽样的排序字段
     */
    public String getGlobalOrderField() {
        return this.GlobalOrderField;
    }

    /**
     * Set 抽样的排序字段
     * @param GlobalOrderField 抽样的排序字段
     */
    public void setGlobalOrderField(String GlobalOrderField) {
        this.GlobalOrderField = GlobalOrderField;
    }

    /**
     * Get full:全量扫描 incre:变更扫描 
     * @return ScanRange full:全量扫描 incre:变更扫描
     */
    public String getScanRange() {
        return this.ScanRange;
    }

    /**
     * Set full:全量扫描 incre:变更扫描
     * @param ScanRange full:全量扫描 incre:变更扫描
     */
    public void setScanRange(String ScanRange) {
        this.ScanRange = ScanRange;
    }

    public CreateDSPADiscoveryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPADiscoveryTaskRequest(CreateDSPADiscoveryTaskRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Plan != null) {
            this.Plan = new Long(source.Plan);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.GeneralRuleSetEnable != null) {
            this.GeneralRuleSetEnable = new Long(source.GeneralRuleSetEnable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.ComplianceGroupIds != null) {
            this.ComplianceGroupIds = new Long[source.ComplianceGroupIds.length];
            for (int i = 0; i < source.ComplianceGroupIds.length; i++) {
                this.ComplianceGroupIds[i] = new Long(source.ComplianceGroupIds[i]);
            }
        }
        if (source.TimingStartTime != null) {
            this.TimingStartTime = new String(source.TimingStartTime);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Rows != null) {
            this.Rows = new Long(source.Rows);
        }
        if (source.GlobalOrderField != null) {
            this.GlobalOrderField = new String(source.GlobalOrderField);
        }
        if (source.ScanRange != null) {
            this.ScanRange = new String(source.ScanRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Plan", this.Plan);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "GeneralRuleSetEnable", this.GeneralRuleSetEnable);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArraySimple(map, prefix + "ComplianceGroupIds.", this.ComplianceGroupIds);
        this.setParamSimple(map, prefix + "TimingStartTime", this.TimingStartTime);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "GlobalOrderField", this.GlobalOrderField);
        this.setParamSimple(map, prefix + "ScanRange", this.ScanRange);

    }
}

