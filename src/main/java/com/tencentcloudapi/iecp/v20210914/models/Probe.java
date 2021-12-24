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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Probe extends AbstractModel{

    /**
    * 启动后，延迟探测时间 单位:秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * 探测间隔，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
    * 探测超时时间 单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * 失败后检查成功的最小连续成功次数。默认为1.活跃度必须为1。最小值为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
    * 当Pod成功启动且检查失败时，放弃之前尝试次数。默认为3.最小值为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
    * HTTP探测配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpProbe")
    @Expose
    private HttpProbe HttpProbe;

    /**
    * TCP探测配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcpProbe")
    @Expose
    private TcpProbe TcpProbe;

    /**
     * Get 启动后，延迟探测时间 单位:秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitialDelaySeconds 启动后，延迟探测时间 单位:秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 启动后，延迟探测时间 单位:秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitialDelaySeconds 启动后，延迟探测时间 单位:秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get 探测间隔，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodSeconds 探测间隔，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set 探测间隔，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodSeconds 探测间隔，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    /**
     * Get 探测超时时间 单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutSeconds 探测超时时间 单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set 探测超时时间 单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutSeconds 探测超时时间 单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get 失败后检查成功的最小连续成功次数。默认为1.活跃度必须为1。最小值为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessThreshold 失败后检查成功的最小连续成功次数。默认为1.活跃度必须为1。最小值为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set 失败后检查成功的最小连续成功次数。默认为1.活跃度必须为1。最小值为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessThreshold 失败后检查成功的最小连续成功次数。默认为1.活跃度必须为1。最小值为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    /**
     * Get 当Pod成功启动且检查失败时，放弃之前尝试次数。默认为3.最小值为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureThreshold 当Pod成功启动且检查失败时，放弃之前尝试次数。默认为3.最小值为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set 当Pod成功启动且检查失败时，放弃之前尝试次数。默认为3.最小值为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureThreshold 当Pod成功启动且检查失败时，放弃之前尝试次数。默认为3.最小值为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    /**
     * Get HTTP探测配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpProbe HTTP探测配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpProbe getHttpProbe() {
        return this.HttpProbe;
    }

    /**
     * Set HTTP探测配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpProbe HTTP探测配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpProbe(HttpProbe HttpProbe) {
        this.HttpProbe = HttpProbe;
    }

    /**
     * Get TCP探测配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcpProbe TCP探测配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TcpProbe getTcpProbe() {
        return this.TcpProbe;
    }

    /**
     * Set TCP探测配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcpProbe TCP探测配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcpProbe(TcpProbe TcpProbe) {
        this.TcpProbe = TcpProbe;
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
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.SuccessThreshold != null) {
            this.SuccessThreshold = new Long(source.SuccessThreshold);
        }
        if (source.FailureThreshold != null) {
            this.FailureThreshold = new Long(source.FailureThreshold);
        }
        if (source.HttpProbe != null) {
            this.HttpProbe = new HttpProbe(source.HttpProbe);
        }
        if (source.TcpProbe != null) {
            this.TcpProbe = new TcpProbe(source.TcpProbe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "SuccessThreshold", this.SuccessThreshold);
        this.setParamSimple(map, prefix + "FailureThreshold", this.FailureThreshold);
        this.setParamObj(map, prefix + "HttpProbe.", this.HttpProbe);
        this.setParamObj(map, prefix + "TcpProbe.", this.TcpProbe);

    }
}

