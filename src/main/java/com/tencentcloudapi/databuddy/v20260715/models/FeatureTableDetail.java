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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeatureTableDetail extends AbstractModel {

    /**
    * <p>特征表主键字段列表</p>
    */
    @SerializedName("PrimaryKeys")
    @Expose
    private String [] PrimaryKeys;

    /**
    * <p>特征表时间戳字段名称</p>
    */
    @SerializedName("TimestampField")
    @Expose
    private String TimestampField;

    /**
    * <p>在线特征表对应的来源表名称（离线表）</p>
    */
    @SerializedName("SourceTableName")
    @Expose
    private String SourceTableName;

    /**
    * <p>在线特征表关联的工作流ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>离线特征表对应生成的在线特征表名称</p>
    */
    @SerializedName("OnlineTableName")
    @Expose
    private String OnlineTableName;

    /**
    * <p>离线特征表对应生成的在线特征表类型，取值：TENCENT_POSTGRESQL | REDIS），缺省 TENCENT_POSTGRESQL</p>
    */
    @SerializedName("OnlineTableType")
    @Expose
    private String OnlineTableType;

    /**
    * <p>离线特征表对应生成的在线特征表ConnectionId</p>
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
     * Get <p>特征表主键字段列表</p> 
     * @return PrimaryKeys <p>特征表主键字段列表</p>
     */
    public String [] getPrimaryKeys() {
        return this.PrimaryKeys;
    }

    /**
     * Set <p>特征表主键字段列表</p>
     * @param PrimaryKeys <p>特征表主键字段列表</p>
     */
    public void setPrimaryKeys(String [] PrimaryKeys) {
        this.PrimaryKeys = PrimaryKeys;
    }

    /**
     * Get <p>特征表时间戳字段名称</p> 
     * @return TimestampField <p>特征表时间戳字段名称</p>
     */
    public String getTimestampField() {
        return this.TimestampField;
    }

    /**
     * Set <p>特征表时间戳字段名称</p>
     * @param TimestampField <p>特征表时间戳字段名称</p>
     */
    public void setTimestampField(String TimestampField) {
        this.TimestampField = TimestampField;
    }

    /**
     * Get <p>在线特征表对应的来源表名称（离线表）</p> 
     * @return SourceTableName <p>在线特征表对应的来源表名称（离线表）</p>
     */
    public String getSourceTableName() {
        return this.SourceTableName;
    }

    /**
     * Set <p>在线特征表对应的来源表名称（离线表）</p>
     * @param SourceTableName <p>在线特征表对应的来源表名称（离线表）</p>
     */
    public void setSourceTableName(String SourceTableName) {
        this.SourceTableName = SourceTableName;
    }

    /**
     * Get <p>在线特征表关联的工作流ID</p> 
     * @return WorkflowId <p>在线特征表关联的工作流ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>在线特征表关联的工作流ID</p>
     * @param WorkflowId <p>在线特征表关联的工作流ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>离线特征表对应生成的在线特征表名称</p> 
     * @return OnlineTableName <p>离线特征表对应生成的在线特征表名称</p>
     */
    public String getOnlineTableName() {
        return this.OnlineTableName;
    }

    /**
     * Set <p>离线特征表对应生成的在线特征表名称</p>
     * @param OnlineTableName <p>离线特征表对应生成的在线特征表名称</p>
     */
    public void setOnlineTableName(String OnlineTableName) {
        this.OnlineTableName = OnlineTableName;
    }

    /**
     * Get <p>离线特征表对应生成的在线特征表类型，取值：TENCENT_POSTGRESQL | REDIS），缺省 TENCENT_POSTGRESQL</p> 
     * @return OnlineTableType <p>离线特征表对应生成的在线特征表类型，取值：TENCENT_POSTGRESQL | REDIS），缺省 TENCENT_POSTGRESQL</p>
     */
    public String getOnlineTableType() {
        return this.OnlineTableType;
    }

    /**
     * Set <p>离线特征表对应生成的在线特征表类型，取值：TENCENT_POSTGRESQL | REDIS），缺省 TENCENT_POSTGRESQL</p>
     * @param OnlineTableType <p>离线特征表对应生成的在线特征表类型，取值：TENCENT_POSTGRESQL | REDIS），缺省 TENCENT_POSTGRESQL</p>
     */
    public void setOnlineTableType(String OnlineTableType) {
        this.OnlineTableType = OnlineTableType;
    }

    /**
     * Get <p>离线特征表对应生成的在线特征表ConnectionId</p> 
     * @return ConnectionId <p>离线特征表对应生成的在线特征表ConnectionId</p>
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set <p>离线特征表对应生成的在线特征表ConnectionId</p>
     * @param ConnectionId <p>离线特征表对应生成的在线特征表ConnectionId</p>
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    public FeatureTableDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeatureTableDetail(FeatureTableDetail source) {
        if (source.PrimaryKeys != null) {
            this.PrimaryKeys = new String[source.PrimaryKeys.length];
            for (int i = 0; i < source.PrimaryKeys.length; i++) {
                this.PrimaryKeys[i] = new String(source.PrimaryKeys[i]);
            }
        }
        if (source.TimestampField != null) {
            this.TimestampField = new String(source.TimestampField);
        }
        if (source.SourceTableName != null) {
            this.SourceTableName = new String(source.SourceTableName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.OnlineTableName != null) {
            this.OnlineTableName = new String(source.OnlineTableName);
        }
        if (source.OnlineTableType != null) {
            this.OnlineTableType = new String(source.OnlineTableType);
        }
        if (source.ConnectionId != null) {
            this.ConnectionId = new String(source.ConnectionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PrimaryKeys.", this.PrimaryKeys);
        this.setParamSimple(map, prefix + "TimestampField", this.TimestampField);
        this.setParamSimple(map, prefix + "SourceTableName", this.SourceTableName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "OnlineTableName", this.OnlineTableName);
        this.setParamSimple(map, prefix + "OnlineTableType", this.OnlineTableType);
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);

    }
}

