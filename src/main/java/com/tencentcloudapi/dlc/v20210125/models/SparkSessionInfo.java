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

public class SparkSessionInfo extends AbstractModel {

    /**
    * spark session id
    */
    @SerializedName("SparkSessionId")
    @Expose
    private String SparkSessionId;

    /**
    * spark session名称
    */
    @SerializedName("SparkSessionName")
    @Expose
    private String SparkSessionName;

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * engine session id
    */
    @SerializedName("EngineSessionId")
    @Expose
    private String EngineSessionId;

    /**
    * engine session   
name
    */
    @SerializedName("EngineSessionName")
    @Expose
    private String EngineSessionName;

    /**
    * 自动销毁时间
    */
    @SerializedName("IdleTimeoutMin")
    @Expose
    private Long IdleTimeoutMin;

    /**
    * driver规格
    */
    @SerializedName("DriverSpec")
    @Expose
    private String DriverSpec;

    /**
    * executor规格
    */
    @SerializedName("ExecutorSpec")
    @Expose
    private String ExecutorSpec;

    /**
    * executor最小数量
    */
    @SerializedName("ExecutorNumMin")
    @Expose
    private Long ExecutorNumMin;

    /**
    * executor最大数量
    */
    @SerializedName("ExecutorNumMax")
    @Expose
    private Long ExecutorNumMax;

    /**
    * 总规格最小
    */
    @SerializedName("TotalSpecMin")
    @Expose
    private Long TotalSpecMin;

    /**
    * 总规格最大
    */
    @SerializedName("TotalSpecMax")
    @Expose
    private Long TotalSpecMax;

    /**
    * 状态，STARTING、RUNNING、TERMINATED
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get spark session id 
     * @return SparkSessionId spark session id
     */
    public String getSparkSessionId() {
        return this.SparkSessionId;
    }

    /**
     * Set spark session id
     * @param SparkSessionId spark session id
     */
    public void setSparkSessionId(String SparkSessionId) {
        this.SparkSessionId = SparkSessionId;
    }

    /**
     * Get spark session名称 
     * @return SparkSessionName spark session名称
     */
    public String getSparkSessionName() {
        return this.SparkSessionName;
    }

    /**
     * Set spark session名称
     * @param SparkSessionName spark session名称
     */
    public void setSparkSessionName(String SparkSessionName) {
        this.SparkSessionName = SparkSessionName;
    }

    /**
     * Get 资源组id 
     * @return ResourceGroupId 资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组id
     * @param ResourceGroupId 资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get engine session id 
     * @return EngineSessionId engine session id
     */
    public String getEngineSessionId() {
        return this.EngineSessionId;
    }

    /**
     * Set engine session id
     * @param EngineSessionId engine session id
     */
    public void setEngineSessionId(String EngineSessionId) {
        this.EngineSessionId = EngineSessionId;
    }

    /**
     * Get engine session   
name 
     * @return EngineSessionName engine session   
name
     */
    public String getEngineSessionName() {
        return this.EngineSessionName;
    }

    /**
     * Set engine session   
name
     * @param EngineSessionName engine session   
name
     */
    public void setEngineSessionName(String EngineSessionName) {
        this.EngineSessionName = EngineSessionName;
    }

    /**
     * Get 自动销毁时间 
     * @return IdleTimeoutMin 自动销毁时间
     */
    public Long getIdleTimeoutMin() {
        return this.IdleTimeoutMin;
    }

    /**
     * Set 自动销毁时间
     * @param IdleTimeoutMin 自动销毁时间
     */
    public void setIdleTimeoutMin(Long IdleTimeoutMin) {
        this.IdleTimeoutMin = IdleTimeoutMin;
    }

    /**
     * Get driver规格 
     * @return DriverSpec driver规格
     */
    public String getDriverSpec() {
        return this.DriverSpec;
    }

    /**
     * Set driver规格
     * @param DriverSpec driver规格
     */
    public void setDriverSpec(String DriverSpec) {
        this.DriverSpec = DriverSpec;
    }

    /**
     * Get executor规格 
     * @return ExecutorSpec executor规格
     */
    public String getExecutorSpec() {
        return this.ExecutorSpec;
    }

    /**
     * Set executor规格
     * @param ExecutorSpec executor规格
     */
    public void setExecutorSpec(String ExecutorSpec) {
        this.ExecutorSpec = ExecutorSpec;
    }

    /**
     * Get executor最小数量 
     * @return ExecutorNumMin executor最小数量
     */
    public Long getExecutorNumMin() {
        return this.ExecutorNumMin;
    }

    /**
     * Set executor最小数量
     * @param ExecutorNumMin executor最小数量
     */
    public void setExecutorNumMin(Long ExecutorNumMin) {
        this.ExecutorNumMin = ExecutorNumMin;
    }

    /**
     * Get executor最大数量 
     * @return ExecutorNumMax executor最大数量
     */
    public Long getExecutorNumMax() {
        return this.ExecutorNumMax;
    }

    /**
     * Set executor最大数量
     * @param ExecutorNumMax executor最大数量
     */
    public void setExecutorNumMax(Long ExecutorNumMax) {
        this.ExecutorNumMax = ExecutorNumMax;
    }

    /**
     * Get 总规格最小 
     * @return TotalSpecMin 总规格最小
     */
    public Long getTotalSpecMin() {
        return this.TotalSpecMin;
    }

    /**
     * Set 总规格最小
     * @param TotalSpecMin 总规格最小
     */
    public void setTotalSpecMin(Long TotalSpecMin) {
        this.TotalSpecMin = TotalSpecMin;
    }

    /**
     * Get 总规格最大 
     * @return TotalSpecMax 总规格最大
     */
    public Long getTotalSpecMax() {
        return this.TotalSpecMax;
    }

    /**
     * Set 总规格最大
     * @param TotalSpecMax 总规格最大
     */
    public void setTotalSpecMax(Long TotalSpecMax) {
        this.TotalSpecMax = TotalSpecMax;
    }

    /**
     * Get 状态，STARTING、RUNNING、TERMINATED 
     * @return State 状态，STARTING、RUNNING、TERMINATED
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态，STARTING、RUNNING、TERMINATED
     * @param State 状态，STARTING、RUNNING、TERMINATED
     */
    public void setState(String State) {
        this.State = State;
    }

    public SparkSessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkSessionInfo(SparkSessionInfo source) {
        if (source.SparkSessionId != null) {
            this.SparkSessionId = new String(source.SparkSessionId);
        }
        if (source.SparkSessionName != null) {
            this.SparkSessionName = new String(source.SparkSessionName);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.EngineSessionId != null) {
            this.EngineSessionId = new String(source.EngineSessionId);
        }
        if (source.EngineSessionName != null) {
            this.EngineSessionName = new String(source.EngineSessionName);
        }
        if (source.IdleTimeoutMin != null) {
            this.IdleTimeoutMin = new Long(source.IdleTimeoutMin);
        }
        if (source.DriverSpec != null) {
            this.DriverSpec = new String(source.DriverSpec);
        }
        if (source.ExecutorSpec != null) {
            this.ExecutorSpec = new String(source.ExecutorSpec);
        }
        if (source.ExecutorNumMin != null) {
            this.ExecutorNumMin = new Long(source.ExecutorNumMin);
        }
        if (source.ExecutorNumMax != null) {
            this.ExecutorNumMax = new Long(source.ExecutorNumMax);
        }
        if (source.TotalSpecMin != null) {
            this.TotalSpecMin = new Long(source.TotalSpecMin);
        }
        if (source.TotalSpecMax != null) {
            this.TotalSpecMax = new Long(source.TotalSpecMax);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SparkSessionId", this.SparkSessionId);
        this.setParamSimple(map, prefix + "SparkSessionName", this.SparkSessionName);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "EngineSessionId", this.EngineSessionId);
        this.setParamSimple(map, prefix + "EngineSessionName", this.EngineSessionName);
        this.setParamSimple(map, prefix + "IdleTimeoutMin", this.IdleTimeoutMin);
        this.setParamSimple(map, prefix + "DriverSpec", this.DriverSpec);
        this.setParamSimple(map, prefix + "ExecutorSpec", this.ExecutorSpec);
        this.setParamSimple(map, prefix + "ExecutorNumMin", this.ExecutorNumMin);
        this.setParamSimple(map, prefix + "ExecutorNumMax", this.ExecutorNumMax);
        this.setParamSimple(map, prefix + "TotalSpecMin", this.TotalSpecMin);
        this.setParamSimple(map, prefix + "TotalSpecMax", this.TotalSpecMax);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

