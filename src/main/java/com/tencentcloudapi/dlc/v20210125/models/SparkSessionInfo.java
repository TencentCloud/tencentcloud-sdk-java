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
    * <p>spark session id</p>
    */
    @SerializedName("SparkSessionId")
    @Expose
    private String SparkSessionId;

    /**
    * <p>spark session名称</p>
    */
    @SerializedName("SparkSessionName")
    @Expose
    private String SparkSessionName;

    /**
    * <p>资源组id</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>engine session id</p>
    */
    @SerializedName("EngineSessionId")
    @Expose
    private String EngineSessionId;

    /**
    * <p>engine session<br>name</p>
    */
    @SerializedName("EngineSessionName")
    @Expose
    private String EngineSessionName;

    /**
    * <p>自动销毁时间</p>
    */
    @SerializedName("IdleTimeoutMin")
    @Expose
    private Long IdleTimeoutMin;

    /**
    * <p>driver规格</p>
    */
    @SerializedName("DriverSpec")
    @Expose
    private String DriverSpec;

    /**
    * <p>executor规格</p>
    */
    @SerializedName("ExecutorSpec")
    @Expose
    private String ExecutorSpec;

    /**
    * <p>executor最小数量</p>
    */
    @SerializedName("ExecutorNumMin")
    @Expose
    private Long ExecutorNumMin;

    /**
    * <p>executor最大数量</p>
    */
    @SerializedName("ExecutorNumMax")
    @Expose
    private Long ExecutorNumMax;

    /**
    * <p>总规格最小</p>
    */
    @SerializedName("TotalSpecMin")
    @Expose
    private Long TotalSpecMin;

    /**
    * <p>总规格最大</p>
    */
    @SerializedName("TotalSpecMax")
    @Expose
    private Long TotalSpecMax;

    /**
    * <p>状态，STARTING、RUNNING、TERMINATED</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>应用启动时间</p>
    */
    @SerializedName("ApplicationStartTime")
    @Expose
    private Long ApplicationStartTime;

    /**
     * Get <p>spark session id</p> 
     * @return SparkSessionId <p>spark session id</p>
     */
    public String getSparkSessionId() {
        return this.SparkSessionId;
    }

    /**
     * Set <p>spark session id</p>
     * @param SparkSessionId <p>spark session id</p>
     */
    public void setSparkSessionId(String SparkSessionId) {
        this.SparkSessionId = SparkSessionId;
    }

    /**
     * Get <p>spark session名称</p> 
     * @return SparkSessionName <p>spark session名称</p>
     */
    public String getSparkSessionName() {
        return this.SparkSessionName;
    }

    /**
     * Set <p>spark session名称</p>
     * @param SparkSessionName <p>spark session名称</p>
     */
    public void setSparkSessionName(String SparkSessionName) {
        this.SparkSessionName = SparkSessionName;
    }

    /**
     * Get <p>资源组id</p> 
     * @return ResourceGroupId <p>资源组id</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>资源组id</p>
     * @param ResourceGroupId <p>资源组id</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>engine session id</p> 
     * @return EngineSessionId <p>engine session id</p>
     */
    public String getEngineSessionId() {
        return this.EngineSessionId;
    }

    /**
     * Set <p>engine session id</p>
     * @param EngineSessionId <p>engine session id</p>
     */
    public void setEngineSessionId(String EngineSessionId) {
        this.EngineSessionId = EngineSessionId;
    }

    /**
     * Get <p>engine session<br>name</p> 
     * @return EngineSessionName <p>engine session<br>name</p>
     */
    public String getEngineSessionName() {
        return this.EngineSessionName;
    }

    /**
     * Set <p>engine session<br>name</p>
     * @param EngineSessionName <p>engine session<br>name</p>
     */
    public void setEngineSessionName(String EngineSessionName) {
        this.EngineSessionName = EngineSessionName;
    }

    /**
     * Get <p>自动销毁时间</p> 
     * @return IdleTimeoutMin <p>自动销毁时间</p>
     */
    public Long getIdleTimeoutMin() {
        return this.IdleTimeoutMin;
    }

    /**
     * Set <p>自动销毁时间</p>
     * @param IdleTimeoutMin <p>自动销毁时间</p>
     */
    public void setIdleTimeoutMin(Long IdleTimeoutMin) {
        this.IdleTimeoutMin = IdleTimeoutMin;
    }

    /**
     * Get <p>driver规格</p> 
     * @return DriverSpec <p>driver规格</p>
     */
    public String getDriverSpec() {
        return this.DriverSpec;
    }

    /**
     * Set <p>driver规格</p>
     * @param DriverSpec <p>driver规格</p>
     */
    public void setDriverSpec(String DriverSpec) {
        this.DriverSpec = DriverSpec;
    }

    /**
     * Get <p>executor规格</p> 
     * @return ExecutorSpec <p>executor规格</p>
     */
    public String getExecutorSpec() {
        return this.ExecutorSpec;
    }

    /**
     * Set <p>executor规格</p>
     * @param ExecutorSpec <p>executor规格</p>
     */
    public void setExecutorSpec(String ExecutorSpec) {
        this.ExecutorSpec = ExecutorSpec;
    }

    /**
     * Get <p>executor最小数量</p> 
     * @return ExecutorNumMin <p>executor最小数量</p>
     */
    public Long getExecutorNumMin() {
        return this.ExecutorNumMin;
    }

    /**
     * Set <p>executor最小数量</p>
     * @param ExecutorNumMin <p>executor最小数量</p>
     */
    public void setExecutorNumMin(Long ExecutorNumMin) {
        this.ExecutorNumMin = ExecutorNumMin;
    }

    /**
     * Get <p>executor最大数量</p> 
     * @return ExecutorNumMax <p>executor最大数量</p>
     */
    public Long getExecutorNumMax() {
        return this.ExecutorNumMax;
    }

    /**
     * Set <p>executor最大数量</p>
     * @param ExecutorNumMax <p>executor最大数量</p>
     */
    public void setExecutorNumMax(Long ExecutorNumMax) {
        this.ExecutorNumMax = ExecutorNumMax;
    }

    /**
     * Get <p>总规格最小</p> 
     * @return TotalSpecMin <p>总规格最小</p>
     */
    public Long getTotalSpecMin() {
        return this.TotalSpecMin;
    }

    /**
     * Set <p>总规格最小</p>
     * @param TotalSpecMin <p>总规格最小</p>
     */
    public void setTotalSpecMin(Long TotalSpecMin) {
        this.TotalSpecMin = TotalSpecMin;
    }

    /**
     * Get <p>总规格最大</p> 
     * @return TotalSpecMax <p>总规格最大</p>
     */
    public Long getTotalSpecMax() {
        return this.TotalSpecMax;
    }

    /**
     * Set <p>总规格最大</p>
     * @param TotalSpecMax <p>总规格最大</p>
     */
    public void setTotalSpecMax(Long TotalSpecMax) {
        this.TotalSpecMax = TotalSpecMax;
    }

    /**
     * Get <p>状态，STARTING、RUNNING、TERMINATED</p> 
     * @return State <p>状态，STARTING、RUNNING、TERMINATED</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>状态，STARTING、RUNNING、TERMINATED</p>
     * @param State <p>状态，STARTING、RUNNING、TERMINATED</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>应用 ID</p> 
     * @return ApplicationId <p>应用 ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param ApplicationId <p>应用 ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>应用启动时间</p> 
     * @return ApplicationStartTime <p>应用启动时间</p>
     */
    public Long getApplicationStartTime() {
        return this.ApplicationStartTime;
    }

    /**
     * Set <p>应用启动时间</p>
     * @param ApplicationStartTime <p>应用启动时间</p>
     */
    public void setApplicationStartTime(Long ApplicationStartTime) {
        this.ApplicationStartTime = ApplicationStartTime;
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
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationStartTime != null) {
            this.ApplicationStartTime = new Long(source.ApplicationStartTime);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationStartTime", this.ApplicationStartTime);

    }
}

