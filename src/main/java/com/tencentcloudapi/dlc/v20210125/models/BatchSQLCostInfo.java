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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchSQLCostInfo extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 引擎id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 本次消耗，单位cu
    */
    @SerializedName("Cost")
    @Expose
    private Float Cost;

    /**
    * 时间开销，秒
    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * 操作者
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 任务id 
     * @return BatchId 任务id
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 任务id
     * @param BatchId 任务id
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 引擎名称 
     * @return DataEngineName 引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 引擎名称
     * @param DataEngineName 引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 引擎id 
     * @return DataEngineId 引擎id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎id
     * @param DataEngineId 引擎id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 本次消耗，单位cu 
     * @return Cost 本次消耗，单位cu
     */
    public Float getCost() {
        return this.Cost;
    }

    /**
     * Set 本次消耗，单位cu
     * @param Cost 本次消耗，单位cu
     */
    public void setCost(Float Cost) {
        this.Cost = Cost;
    }

    /**
     * Get 时间开销，秒 
     * @return TimeCost 时间开销，秒
     */
    public Long getTimeCost() {
        return this.TimeCost;
    }

    /**
     * Set 时间开销，秒
     * @param TimeCost 时间开销，秒
     */
    public void setTimeCost(Long TimeCost) {
        this.TimeCost = TimeCost;
    }

    /**
     * Get 操作者 
     * @return Operator 操作者
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者
     * @param Operator 操作者
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public BatchSQLCostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSQLCostInfo(BatchSQLCostInfo source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.Cost != null) {
            this.Cost = new Float(source.Cost);
        }
        if (source.TimeCost != null) {
            this.TimeCost = new Long(source.TimeCost);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "TimeCost", this.TimeCost);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

