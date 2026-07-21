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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessDeviceRiskPremiumRsp extends AbstractModel {

    /**
    * <p>决策信息</p>
    */
    @SerializedName("Decision")
    @Expose
    private Decision Decision;

    /**
    * <p>设备风险分信息</p>
    */
    @SerializedName("Score")
    @Expose
    private DataScore Score;

    /**
    * <p>设备基础信息</p>
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * <p>IP环境基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
     * Get <p>决策信息</p> 
     * @return Decision <p>决策信息</p>
     */
    public Decision getDecision() {
        return this.Decision;
    }

    /**
     * Set <p>决策信息</p>
     * @param Decision <p>决策信息</p>
     */
    public void setDecision(Decision Decision) {
        this.Decision = Decision;
    }

    /**
     * Get <p>设备风险分信息</p> 
     * @return Score <p>设备风险分信息</p>
     */
    public DataScore getScore() {
        return this.Score;
    }

    /**
     * Set <p>设备风险分信息</p>
     * @param Score <p>设备风险分信息</p>
     */
    public void setScore(DataScore Score) {
        this.Score = Score;
    }

    /**
     * Get <p>设备基础信息</p> 
     * @return Device <p>设备基础信息</p>
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set <p>设备基础信息</p>
     * @param Device <p>设备基础信息</p>
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get <p>IP环境基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Environment <p>IP环境基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Environment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set <p>IP环境基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Environment <p>IP环境基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironment(Environment Environment) {
        this.Environment = Environment;
    }

    public AssessDeviceRiskPremiumRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessDeviceRiskPremiumRsp(AssessDeviceRiskPremiumRsp source) {
        if (source.Decision != null) {
            this.Decision = new Decision(source.Decision);
        }
        if (source.Score != null) {
            this.Score = new DataScore(source.Score);
        }
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
        if (source.Environment != null) {
            this.Environment = new Environment(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Decision.", this.Decision);
        this.setParamObj(map, prefix + "Score.", this.Score);
        this.setParamObj(map, prefix + "Device.", this.Device);
        this.setParamObj(map, prefix + "Environment.", this.Environment);

    }
}

