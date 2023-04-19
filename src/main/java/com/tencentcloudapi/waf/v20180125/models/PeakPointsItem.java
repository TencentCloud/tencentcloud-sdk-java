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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakPointsItem extends AbstractModel{

    /**
    * 秒级别时间戳
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * QPS
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * 上行带宽峰值，单位B
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * 下行带宽峰值，单位B
    */
    @SerializedName("Down")
    @Expose
    private Long Down;

    /**
    * Web攻击次数
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * CC攻击次数
    */
    @SerializedName("Cc")
    @Expose
    private Long Cc;

    /**
    * Bot qps
    */
    @SerializedName("BotAccess")
    @Expose
    private Long BotAccess;

    /**
    * WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusServerError")
    @Expose
    private Long StatusServerError;

    /**
    * WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusClientError")
    @Expose
    private Long StatusClientError;

    /**
    * WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusRedirect")
    @Expose
    private Long StatusRedirect;

    /**
    * WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusOk")
    @Expose
    private Long StatusOk;

    /**
    * 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamServerError")
    @Expose
    private Long UpstreamServerError;

    /**
    * 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamClientError")
    @Expose
    private Long UpstreamClientError;

    /**
    * 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamRedirect")
    @Expose
    private Long UpstreamRedirect;

    /**
     * Get 秒级别时间戳 
     * @return Time 秒级别时间戳
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 秒级别时间戳
     * @param Time 秒级别时间戳
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get QPS 
     * @return Access QPS
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set QPS
     * @param Access QPS
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get 上行带宽峰值，单位B 
     * @return Up 上行带宽峰值，单位B
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set 上行带宽峰值，单位B
     * @param Up 上行带宽峰值，单位B
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    /**
     * Get 下行带宽峰值，单位B 
     * @return Down 下行带宽峰值，单位B
     */
    public Long getDown() {
        return this.Down;
    }

    /**
     * Set 下行带宽峰值，单位B
     * @param Down 下行带宽峰值，单位B
     */
    public void setDown(Long Down) {
        this.Down = Down;
    }

    /**
     * Get Web攻击次数 
     * @return Attack Web攻击次数
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Web攻击次数
     * @param Attack Web攻击次数
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get CC攻击次数 
     * @return Cc CC攻击次数
     */
    public Long getCc() {
        return this.Cc;
    }

    /**
     * Set CC攻击次数
     * @param Cc CC攻击次数
     */
    public void setCc(Long Cc) {
        this.Cc = Cc;
    }

    /**
     * Get Bot qps 
     * @return BotAccess Bot qps
     */
    public Long getBotAccess() {
        return this.BotAccess;
    }

    /**
     * Set Bot qps
     * @param BotAccess Bot qps
     */
    public void setBotAccess(Long BotAccess) {
        this.BotAccess = BotAccess;
    }

    /**
     * Get WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusServerError WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusServerError() {
        return this.StatusServerError;
    }

    /**
     * Set WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusServerError WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusServerError(Long StatusServerError) {
        this.StatusServerError = StatusServerError;
    }

    /**
     * Get WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusClientError WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusClientError() {
        return this.StatusClientError;
    }

    /**
     * Set WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusClientError WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusClientError(Long StatusClientError) {
        this.StatusClientError = StatusClientError;
    }

    /**
     * Get WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusRedirect WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusRedirect() {
        return this.StatusRedirect;
    }

    /**
     * Set WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusRedirect WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusRedirect(Long StatusRedirect) {
        this.StatusRedirect = StatusRedirect;
    }

    /**
     * Get WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusOk WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatusOk() {
        return this.StatusOk;
    }

    /**
     * Set WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusOk WAF返回给客户端状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusOk(Long StatusOk) {
        this.StatusOk = StatusOk;
    }

    /**
     * Get 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamServerError 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpstreamServerError() {
        return this.UpstreamServerError;
    }

    /**
     * Set 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamServerError 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamServerError(Long UpstreamServerError) {
        this.UpstreamServerError = UpstreamServerError;
    }

    /**
     * Get 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamClientError 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpstreamClientError() {
        return this.UpstreamClientError;
    }

    /**
     * Set 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamClientError 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamClientError(Long UpstreamClientError) {
        this.UpstreamClientError = UpstreamClientError;
    }

    /**
     * Get 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamRedirect 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpstreamRedirect() {
        return this.UpstreamRedirect;
    }

    /**
     * Set 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamRedirect 源站返回给WAF状态码次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamRedirect(Long UpstreamRedirect) {
        this.UpstreamRedirect = UpstreamRedirect;
    }

    public PeakPointsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakPointsItem(PeakPointsItem source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Access != null) {
            this.Access = new Long(source.Access);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.Down != null) {
            this.Down = new Long(source.Down);
        }
        if (source.Attack != null) {
            this.Attack = new Long(source.Attack);
        }
        if (source.Cc != null) {
            this.Cc = new Long(source.Cc);
        }
        if (source.BotAccess != null) {
            this.BotAccess = new Long(source.BotAccess);
        }
        if (source.StatusServerError != null) {
            this.StatusServerError = new Long(source.StatusServerError);
        }
        if (source.StatusClientError != null) {
            this.StatusClientError = new Long(source.StatusClientError);
        }
        if (source.StatusRedirect != null) {
            this.StatusRedirect = new Long(source.StatusRedirect);
        }
        if (source.StatusOk != null) {
            this.StatusOk = new Long(source.StatusOk);
        }
        if (source.UpstreamServerError != null) {
            this.UpstreamServerError = new Long(source.UpstreamServerError);
        }
        if (source.UpstreamClientError != null) {
            this.UpstreamClientError = new Long(source.UpstreamClientError);
        }
        if (source.UpstreamRedirect != null) {
            this.UpstreamRedirect = new Long(source.UpstreamRedirect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "Down", this.Down);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Cc", this.Cc);
        this.setParamSimple(map, prefix + "BotAccess", this.BotAccess);
        this.setParamSimple(map, prefix + "StatusServerError", this.StatusServerError);
        this.setParamSimple(map, prefix + "StatusClientError", this.StatusClientError);
        this.setParamSimple(map, prefix + "StatusRedirect", this.StatusRedirect);
        this.setParamSimple(map, prefix + "StatusOk", this.StatusOk);
        this.setParamSimple(map, prefix + "UpstreamServerError", this.UpstreamServerError);
        this.setParamSimple(map, prefix + "UpstreamClientError", this.UpstreamClientError);
        this.setParamSimple(map, prefix + "UpstreamRedirect", this.UpstreamRedirect);

    }
}

