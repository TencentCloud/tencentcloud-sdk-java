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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatementOutput extends AbstractModel{

    /**
    * 执行总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionCount")
    @Expose
    private Long ExecutionCount;

    /**
    * Statement数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private KVPair [] Data;

    /**
    * Statement状态:ok,error
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorName")
    @Expose
    private String ErrorName;

    /**
    * 错误类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorValue")
    @Expose
    private String ErrorValue;

    /**
    * 错误堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String [] ErrorMessage;

    /**
    * SQL类型任务结果返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQLResult")
    @Expose
    private String SQLResult;

    /**
     * Get 执行总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionCount 执行总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutionCount() {
        return this.ExecutionCount;
    }

    /**
     * Set 执行总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionCount 执行总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionCount(Long ExecutionCount) {
        this.ExecutionCount = ExecutionCount;
    }

    /**
     * Get Statement数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data Statement数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getData() {
        return this.Data;
    }

    /**
     * Set Statement数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data Statement数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(KVPair [] Data) {
        this.Data = Data;
    }

    /**
     * Get Statement状态:ok,error
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status Statement状态:ok,error
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Statement状态:ok,error
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status Statement状态:ok,error
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorName 错误名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorName() {
        return this.ErrorName;
    }

    /**
     * Set 错误名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorName 错误名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorName(String ErrorName) {
        this.ErrorName = ErrorName;
    }

    /**
     * Get 错误类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorValue 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorValue() {
        return this.ErrorValue;
    }

    /**
     * Set 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorValue 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorValue(String ErrorValue) {
        this.ErrorValue = ErrorValue;
    }

    /**
     * Get 错误堆栈信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String [] ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get SQL类型任务结果返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQLResult SQL类型任务结果返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSQLResult() {
        return this.SQLResult;
    }

    /**
     * Set SQL类型任务结果返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQLResult SQL类型任务结果返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQLResult(String SQLResult) {
        this.SQLResult = SQLResult;
    }

    public StatementOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatementOutput(StatementOutput source) {
        if (source.ExecutionCount != null) {
            this.ExecutionCount = new Long(source.ExecutionCount);
        }
        if (source.Data != null) {
            this.Data = new KVPair[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new KVPair(source.Data[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorName != null) {
            this.ErrorName = new String(source.ErrorName);
        }
        if (source.ErrorValue != null) {
            this.ErrorValue = new String(source.ErrorValue);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String[source.ErrorMessage.length];
            for (int i = 0; i < source.ErrorMessage.length; i++) {
                this.ErrorMessage[i] = new String(source.ErrorMessage[i]);
            }
        }
        if (source.SQLResult != null) {
            this.SQLResult = new String(source.SQLResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionCount", this.ExecutionCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorName", this.ErrorName);
        this.setParamSimple(map, prefix + "ErrorValue", this.ErrorValue);
        this.setParamArraySimple(map, prefix + "ErrorMessage.", this.ErrorMessage);
        this.setParamSimple(map, prefix + "SQLResult", this.SQLResult);

    }
}

