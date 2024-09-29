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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalConfigResponse extends AbstractModel {

    /**
    * 是否开启了资源调度功能
    */
    @SerializedName("EnableResourceSchedule")
    @Expose
    private Boolean EnableResourceSchedule;

    /**
    * 当前生效的资源调度器
    */
    @SerializedName("ActiveScheduler")
    @Expose
    private String ActiveScheduler;

    /**
    * 公平调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CapacityGlobalConfig")
    @Expose
    private CapacityGlobalConfig CapacityGlobalConfig;

    /**
    * 容量调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FairGlobalConfig")
    @Expose
    private FairGlobalConfig FairGlobalConfig;

    /**
    * 最新的资源调度器
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启了资源调度功能 
     * @return EnableResourceSchedule 是否开启了资源调度功能
     */
    public Boolean getEnableResourceSchedule() {
        return this.EnableResourceSchedule;
    }

    /**
     * Set 是否开启了资源调度功能
     * @param EnableResourceSchedule 是否开启了资源调度功能
     */
    public void setEnableResourceSchedule(Boolean EnableResourceSchedule) {
        this.EnableResourceSchedule = EnableResourceSchedule;
    }

    /**
     * Get 当前生效的资源调度器 
     * @return ActiveScheduler 当前生效的资源调度器
     */
    public String getActiveScheduler() {
        return this.ActiveScheduler;
    }

    /**
     * Set 当前生效的资源调度器
     * @param ActiveScheduler 当前生效的资源调度器
     */
    public void setActiveScheduler(String ActiveScheduler) {
        this.ActiveScheduler = ActiveScheduler;
    }

    /**
     * Get 公平调度器的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CapacityGlobalConfig 公平调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CapacityGlobalConfig getCapacityGlobalConfig() {
        return this.CapacityGlobalConfig;
    }

    /**
     * Set 公平调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CapacityGlobalConfig 公平调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapacityGlobalConfig(CapacityGlobalConfig CapacityGlobalConfig) {
        this.CapacityGlobalConfig = CapacityGlobalConfig;
    }

    /**
     * Get 容量调度器的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FairGlobalConfig 容量调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FairGlobalConfig getFairGlobalConfig() {
        return this.FairGlobalConfig;
    }

    /**
     * Set 容量调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FairGlobalConfig 容量调度器的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFairGlobalConfig(FairGlobalConfig FairGlobalConfig) {
        this.FairGlobalConfig = FairGlobalConfig;
    }

    /**
     * Get 最新的资源调度器 
     * @return Scheduler 最新的资源调度器
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 最新的资源调度器
     * @param Scheduler 最新的资源调度器
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeGlobalConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalConfigResponse(DescribeGlobalConfigResponse source) {
        if (source.EnableResourceSchedule != null) {
            this.EnableResourceSchedule = new Boolean(source.EnableResourceSchedule);
        }
        if (source.ActiveScheduler != null) {
            this.ActiveScheduler = new String(source.ActiveScheduler);
        }
        if (source.CapacityGlobalConfig != null) {
            this.CapacityGlobalConfig = new CapacityGlobalConfig(source.CapacityGlobalConfig);
        }
        if (source.FairGlobalConfig != null) {
            this.FairGlobalConfig = new FairGlobalConfig(source.FairGlobalConfig);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableResourceSchedule", this.EnableResourceSchedule);
        this.setParamSimple(map, prefix + "ActiveScheduler", this.ActiveScheduler);
        this.setParamObj(map, prefix + "CapacityGlobalConfig.", this.CapacityGlobalConfig);
        this.setParamObj(map, prefix + "FairGlobalConfig.", this.FairGlobalConfig);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

