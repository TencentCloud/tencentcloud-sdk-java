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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenCoolDownPolicyRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * db名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * table名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 操作类型
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 逗号分隔 需要带上db的名字 db1.tb1,db1.tb2,db2.tb1
    */
    @SerializedName("BatchOpenCoolDownTables")
    @Expose
    private String BatchOpenCoolDownTables;

    /**
    * 绑定的时候用 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 逗号分隔 p1,p2,p3
    */
    @SerializedName("BatchOpenCoolDownPartitions")
    @Expose
    private String BatchOpenCoolDownPartitions;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get db名称 
     * @return DatabaseName db名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set db名称
     * @param DatabaseName db名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get table名称 
     * @return TableName table名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set table名称
     * @param TableName table名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 操作类型 
     * @return OperationType 操作类型
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型
     * @param OperationType 操作类型
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 逗号分隔 需要带上db的名字 db1.tb1,db1.tb2,db2.tb1 
     * @return BatchOpenCoolDownTables 逗号分隔 需要带上db的名字 db1.tb1,db1.tb2,db2.tb1
     */
    public String getBatchOpenCoolDownTables() {
        return this.BatchOpenCoolDownTables;
    }

    /**
     * Set 逗号分隔 需要带上db的名字 db1.tb1,db1.tb2,db2.tb1
     * @param BatchOpenCoolDownTables 逗号分隔 需要带上db的名字 db1.tb1,db1.tb2,db2.tb1
     */
    public void setBatchOpenCoolDownTables(String BatchOpenCoolDownTables) {
        this.BatchOpenCoolDownTables = BatchOpenCoolDownTables;
    }

    /**
     * Get 绑定的时候用 策略名称 
     * @return PolicyName 绑定的时候用 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 绑定的时候用 策略名称
     * @param PolicyName 绑定的时候用 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 逗号分隔 p1,p2,p3 
     * @return BatchOpenCoolDownPartitions 逗号分隔 p1,p2,p3
     */
    public String getBatchOpenCoolDownPartitions() {
        return this.BatchOpenCoolDownPartitions;
    }

    /**
     * Set 逗号分隔 p1,p2,p3
     * @param BatchOpenCoolDownPartitions 逗号分隔 p1,p2,p3
     */
    public void setBatchOpenCoolDownPartitions(String BatchOpenCoolDownPartitions) {
        this.BatchOpenCoolDownPartitions = BatchOpenCoolDownPartitions;
    }

    public OpenCoolDownPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenCoolDownPolicyRequest(OpenCoolDownPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.BatchOpenCoolDownTables != null) {
            this.BatchOpenCoolDownTables = new String(source.BatchOpenCoolDownTables);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.BatchOpenCoolDownPartitions != null) {
            this.BatchOpenCoolDownPartitions = new String(source.BatchOpenCoolDownPartitions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "BatchOpenCoolDownTables", this.BatchOpenCoolDownTables);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "BatchOpenCoolDownPartitions", this.BatchOpenCoolDownPartitions);

    }
}

