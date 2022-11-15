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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupMonitor extends AbstractModel{

    /**
    * 规则组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 表guid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据库guid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 监控状态 0.false 1.true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 规则组创建人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * 规则组创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserName")
    @Expose
    private String CreateUserName;

    /**
    * 规则创建时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 规则组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 表guid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表guid
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据库guid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库guid
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 监控状态 0.false 1.true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorStatus 监控状态 0.false 1.true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监控状态 0.false 1.true
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorStatus 监控状态 0.false 1.true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 规则组创建人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserId 规则组创建人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 规则组创建人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserId 规则组创建人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get 规则组创建人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserName 规则组创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserName() {
        return this.CreateUserName;
    }

    /**
     * Set 规则组创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserName 规则组创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserName(String CreateUserName) {
        this.CreateUserName = CreateUserName;
    }

    /**
     * Get 规则创建时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 规则创建时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 规则创建时间 yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public RuleGroupMonitor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupMonitor(RuleGroupMonitor source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.CreateUserName != null) {
            this.CreateUserName = new String(source.CreateUserName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "CreateUserName", this.CreateUserName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

