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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPerformanceDetailsResponse extends AbstractModel{

    /**
    * 主节点性能监控数据
    */
    @SerializedName("Master")
    @Expose
    private PerformanceMonitorSet Master;

    /**
    * 备机1性能监控数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Slave1")
    @Expose
    private PerformanceMonitorSet Slave1;

    /**
    * 备机2性能监控数据，如果实例是一主一从，则没有该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Slave2")
    @Expose
    private PerformanceMonitorSet Slave2;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主节点性能监控数据 
     * @return Master 主节点性能监控数据
     */
    public PerformanceMonitorSet getMaster() {
        return this.Master;
    }

    /**
     * Set 主节点性能监控数据
     * @param Master 主节点性能监控数据
     */
    public void setMaster(PerformanceMonitorSet Master) {
        this.Master = Master;
    }

    /**
     * Get 备机1性能监控数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Slave1 备机1性能监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PerformanceMonitorSet getSlave1() {
        return this.Slave1;
    }

    /**
     * Set 备机1性能监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Slave1 备机1性能监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlave1(PerformanceMonitorSet Slave1) {
        this.Slave1 = Slave1;
    }

    /**
     * Get 备机2性能监控数据，如果实例是一主一从，则没有该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Slave2 备机2性能监控数据，如果实例是一主一从，则没有该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PerformanceMonitorSet getSlave2() {
        return this.Slave2;
    }

    /**
     * Set 备机2性能监控数据，如果实例是一主一从，则没有该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Slave2 备机2性能监控数据，如果实例是一主一从，则没有该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlave2(PerformanceMonitorSet Slave2) {
        this.Slave2 = Slave2;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Master.", this.Master);
        this.setParamObj(map, prefix + "Slave1.", this.Slave1);
        this.setParamObj(map, prefix + "Slave2.", this.Slave2);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

