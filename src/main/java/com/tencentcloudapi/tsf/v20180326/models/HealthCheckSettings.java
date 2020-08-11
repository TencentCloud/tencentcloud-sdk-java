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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckSettings extends AbstractModel{

    /**
    * 存活健康检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessProbe")
    @Expose
    private HealthCheckSetting LivenessProbe;

    /**
    * 就绪健康检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadinessProbe")
    @Expose
    private HealthCheckSetting ReadinessProbe;

    /**
     * Get 存活健康检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessProbe 存活健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSetting getLivenessProbe() {
        return this.LivenessProbe;
    }

    /**
     * Set 存活健康检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessProbe 存活健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessProbe(HealthCheckSetting LivenessProbe) {
        this.LivenessProbe = LivenessProbe;
    }

    /**
     * Get 就绪健康检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadinessProbe 就绪健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSetting getReadinessProbe() {
        return this.ReadinessProbe;
    }

    /**
     * Set 就绪健康检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadinessProbe 就绪健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadinessProbe(HealthCheckSetting ReadinessProbe) {
        this.ReadinessProbe = ReadinessProbe;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LivenessProbe.", this.LivenessProbe);
        this.setParamObj(map, prefix + "ReadinessProbe.", this.ReadinessProbe);

    }
}

