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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DialProbe extends AbstractModel {

    /**
    * <p>探测目标 IP</p>
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * <p>本次探测是否成功</p>
    */
    @SerializedName("PingSuccess")
    @Expose
    private Boolean PingSuccess;

    /**
    * <p>发送包数</p>
    */
    @SerializedName("Sent")
    @Expose
    private Float Sent;

    /**
    * <p>接收包数</p>
    */
    @SerializedName("Received")
    @Expose
    private Float Received;

    /**
    * <p>丢包率，0 到 100</p>
    */
    @SerializedName("Loss")
    @Expose
    private Float Loss;

    /**
    * <p>最小时延，单位毫秒</p>
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * <p>最大时延，单位毫秒</p>
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * <p>平均时延，单位毫秒</p>
    */
    @SerializedName("Avg")
    @Expose
    private Float Avg;

    /**
    * <p>探测协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>探测目标域名或地址</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>未探测原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkipReason")
    @Expose
    private String SkipReason;

    /**
    * <p>目标 IP 所在地区。与客户端地区无关。无法解析时为未知。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>目标 IP 所属运营商。与客户端运营商无关。无法解析时为未知。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>探测目标 IP</p> 
     * @return TargetIp <p>探测目标 IP</p>
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set <p>探测目标 IP</p>
     * @param TargetIp <p>探测目标 IP</p>
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get <p>本次探测是否成功</p> 
     * @return PingSuccess <p>本次探测是否成功</p>
     */
    public Boolean getPingSuccess() {
        return this.PingSuccess;
    }

    /**
     * Set <p>本次探测是否成功</p>
     * @param PingSuccess <p>本次探测是否成功</p>
     */
    public void setPingSuccess(Boolean PingSuccess) {
        this.PingSuccess = PingSuccess;
    }

    /**
     * Get <p>发送包数</p> 
     * @return Sent <p>发送包数</p>
     */
    public Float getSent() {
        return this.Sent;
    }

    /**
     * Set <p>发送包数</p>
     * @param Sent <p>发送包数</p>
     */
    public void setSent(Float Sent) {
        this.Sent = Sent;
    }

    /**
     * Get <p>接收包数</p> 
     * @return Received <p>接收包数</p>
     */
    public Float getReceived() {
        return this.Received;
    }

    /**
     * Set <p>接收包数</p>
     * @param Received <p>接收包数</p>
     */
    public void setReceived(Float Received) {
        this.Received = Received;
    }

    /**
     * Get <p>丢包率，0 到 100</p> 
     * @return Loss <p>丢包率，0 到 100</p>
     */
    public Float getLoss() {
        return this.Loss;
    }

    /**
     * Set <p>丢包率，0 到 100</p>
     * @param Loss <p>丢包率，0 到 100</p>
     */
    public void setLoss(Float Loss) {
        this.Loss = Loss;
    }

    /**
     * Get <p>最小时延，单位毫秒</p> 
     * @return Min <p>最小时延，单位毫秒</p>
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set <p>最小时延，单位毫秒</p>
     * @param Min <p>最小时延，单位毫秒</p>
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get <p>最大时延，单位毫秒</p> 
     * @return Max <p>最大时延，单位毫秒</p>
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set <p>最大时延，单位毫秒</p>
     * @param Max <p>最大时延，单位毫秒</p>
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get <p>平均时延，单位毫秒</p> 
     * @return Avg <p>平均时延，单位毫秒</p>
     */
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set <p>平均时延，单位毫秒</p>
     * @param Avg <p>平均时延，单位毫秒</p>
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get <p>探测协议</p> 
     * @return Protocol <p>探测协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>探测协议</p>
     * @param Protocol <p>探测协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>探测目标域名或地址</p> 
     * @return Domain <p>探测目标域名或地址</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>探测目标域名或地址</p>
     * @param Domain <p>探测目标域名或地址</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>未探测原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkipReason <p>未探测原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkipReason() {
        return this.SkipReason;
    }

    /**
     * Set <p>未探测原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkipReason <p>未探测原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkipReason(String SkipReason) {
        this.SkipReason = SkipReason;
    }

    /**
     * Get <p>目标 IP 所在地区。与客户端地区无关。无法解析时为未知。</p> 
     * @return Region <p>目标 IP 所在地区。与客户端地区无关。无法解析时为未知。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>目标 IP 所在地区。与客户端地区无关。无法解析时为未知。</p>
     * @param Region <p>目标 IP 所在地区。与客户端地区无关。无法解析时为未知。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>目标 IP 所属运营商。与客户端运营商无关。无法解析时为未知。</p> 
     * @return Operator <p>目标 IP 所属运营商。与客户端运营商无关。无法解析时为未知。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>目标 IP 所属运营商。与客户端运营商无关。无法解析时为未知。</p>
     * @param Operator <p>目标 IP 所属运营商。与客户端运营商无关。无法解析时为未知。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DialProbe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DialProbe(DialProbe source) {
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.PingSuccess != null) {
            this.PingSuccess = new Boolean(source.PingSuccess);
        }
        if (source.Sent != null) {
            this.Sent = new Float(source.Sent);
        }
        if (source.Received != null) {
            this.Received = new Float(source.Received);
        }
        if (source.Loss != null) {
            this.Loss = new Float(source.Loss);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Avg != null) {
            this.Avg = new Float(source.Avg);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SkipReason != null) {
            this.SkipReason = new String(source.SkipReason);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "PingSuccess", this.PingSuccess);
        this.setParamSimple(map, prefix + "Sent", this.Sent);
        this.setParamSimple(map, prefix + "Received", this.Received);
        this.setParamSimple(map, prefix + "Loss", this.Loss);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Avg", this.Avg);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SkipReason", this.SkipReason);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

