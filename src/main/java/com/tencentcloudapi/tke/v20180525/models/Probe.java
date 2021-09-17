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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Probe extends AbstractModel{

    /**
    * Number of seconds after the container has started before liveness probes are initiated.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * Number of seconds after which the probe times out.
Defaults to 1 second. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
    * Minimum consecutive successes for the probe to be considered successful after having failed.Defaults to 1. Must be 1 for liveness. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded.Defaults to 3. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
     * Get Number of seconds after the container has started before liveness probes are initiated.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitialDelaySeconds Number of seconds after the container has started before liveness probes are initiated.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set Number of seconds after the container has started before liveness probes are initiated.
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitialDelaySeconds Number of seconds after the container has started before liveness probes are initiated.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get Number of seconds after which the probe times out.
Defaults to 1 second. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutSeconds Number of seconds after which the probe times out.
Defaults to 1 second. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set Number of seconds after which the probe times out.
Defaults to 1 second. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutSeconds Number of seconds after which the probe times out.
Defaults to 1 second. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodSeconds How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodSeconds How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    /**
     * Get Minimum consecutive successes for the probe to be considered successful after having failed.Defaults to 1. Must be 1 for liveness. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessThreshold Minimum consecutive successes for the probe to be considered successful after having failed.Defaults to 1. Must be 1 for liveness. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set Minimum consecutive successes for the probe to be considered successful after having failed.Defaults to 1. Must be 1 for liveness. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessThreshold Minimum consecutive successes for the probe to be considered successful after having failed.Defaults to 1. Must be 1 for liveness. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    /**
     * Get Minimum consecutive failures for the probe to be considered failed after having succeeded.Defaults to 3. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded.Defaults to 3. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set Minimum consecutive failures for the probe to be considered failed after having succeeded.Defaults to 3. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded.Defaults to 3. Minimum value is 1.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    public Probe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Probe(Probe source) {
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
        if (source.SuccessThreshold != null) {
            this.SuccessThreshold = new Long(source.SuccessThreshold);
        }
        if (source.FailureThreshold != null) {
            this.FailureThreshold = new Long(source.FailureThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);
        this.setParamSimple(map, prefix + "SuccessThreshold", this.SuccessThreshold);
        this.setParamSimple(map, prefix + "FailureThreshold", this.FailureThreshold);

    }
}

