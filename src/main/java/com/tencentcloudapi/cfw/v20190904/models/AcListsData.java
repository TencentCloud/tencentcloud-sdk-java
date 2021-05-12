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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcListsData extends AbstractModel{

    /**
    * 规则id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 访问源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 访问目的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 命中次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 执行顺序
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 告警规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
     * Get 规则id 
     * @return Id 规则id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id
     * @param Id 规则id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 访问源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceIp 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 访问源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceIp 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 访问目的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetIp 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetIp 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Strategy 策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Strategy 策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 命中次数 
     * @return Count 命中次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 命中次数
     * @param Count 命中次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 执行顺序 
     * @return OrderIndex 执行顺序
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 执行顺序
     * @param OrderIndex 执行顺序
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 告警规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogId 告警规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 告警规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogId 告警规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    public AcListsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcListsData(AcListsData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "LogId", this.LogId);

    }
}

