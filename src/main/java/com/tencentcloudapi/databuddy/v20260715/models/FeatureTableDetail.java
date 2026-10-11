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
    * 特征表主键字段列表
    */
    @SerializedName("PrimaryKeys")
    @Expose
    private String [] PrimaryKeys;

    /**
    * 特征表时间戳字段名称
    */
    @SerializedName("TimestampField")
    @Expose
    private String TimestampField;

    /**
    * 在线特征表对应的来源表名称（离线表）
    */
    @SerializedName("SourceTableName")
    @Expose
    private String SourceTableName;

    /**
    * 在线特征表关联的工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 离线特征表对应生成的在线特征表名称
    */
    @SerializedName("OnlineTableName")
    @Expose
    private String OnlineTableName;

    /**
     * Get 特征表主键字段列表 
     * @return PrimaryKeys 特征表主键字段列表
     */
    public String [] getPrimaryKeys() {
        return this.PrimaryKeys;
    }

    /**
     * Set 特征表主键字段列表
     * @param PrimaryKeys 特征表主键字段列表
     */
    public void setPrimaryKeys(String [] PrimaryKeys) {
        this.PrimaryKeys = PrimaryKeys;
    }

    /**
     * Get 特征表时间戳字段名称 
     * @return TimestampField 特征表时间戳字段名称
     */
    public String getTimestampField() {
        return this.TimestampField;
    }

    /**
     * Set 特征表时间戳字段名称
     * @param TimestampField 特征表时间戳字段名称
     */
    public void setTimestampField(String TimestampField) {
        this.TimestampField = TimestampField;
    }

    /**
     * Get 在线特征表对应的来源表名称（离线表） 
     * @return SourceTableName 在线特征表对应的来源表名称（离线表）
     */
    public String getSourceTableName() {
        return this.SourceTableName;
    }

    /**
     * Set 在线特征表对应的来源表名称（离线表）
     * @param SourceTableName 在线特征表对应的来源表名称（离线表）
     */
    public void setSourceTableName(String SourceTableName) {
        this.SourceTableName = SourceTableName;
    }

    /**
     * Get 在线特征表关联的工作流ID 
     * @return WorkflowId 在线特征表关联的工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 在线特征表关联的工作流ID
     * @param WorkflowId 在线特征表关联的工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 离线特征表对应生成的在线特征表名称 
     * @return OnlineTableName 离线特征表对应生成的在线特征表名称
     */
    public String getOnlineTableName() {
        return this.OnlineTableName;
    }

    /**
     * Set 离线特征表对应生成的在线特征表名称
     * @param OnlineTableName 离线特征表对应生成的在线特征表名称
     */
    public void setOnlineTableName(String OnlineTableName) {
        this.OnlineTableName = OnlineTableName;
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

    }
}

