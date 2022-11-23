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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectThresholdRelation extends AbstractModel{

    /**
    * DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
    */
    @SerializedName("DDoSLevel")
    @Expose
    private String DDoSLevel;

    /**
    * DDoS清洗阈值，单位Mbps
    */
    @SerializedName("DDoSThreshold")
    @Expose
    private Long DDoSThreshold;

    /**
    * DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
    */
    @SerializedName("DDoSAI")
    @Expose
    private String DDoSAI;

    /**
    * CC清洗开关，取值[
0(关闭)
1(开启)
]
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * CC清洗阈值，单位QPS
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * 所属的资源实例
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
    * 域名与协议纬度的防护阈值
    */
    @SerializedName("ListenerCcThresholdList")
    @Expose
    private ListenerCcThreholdConfig [] ListenerCcThresholdList;

    /**
    * SYN FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SynFloodThreshold")
    @Expose
    private Long SynFloodThreshold;

    /**
    * SYN FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SynFloodPktThreshold")
    @Expose
    private Long SynFloodPktThreshold;

    /**
    * UDP FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UdpFloodThreshold")
    @Expose
    private Long UdpFloodThreshold;

    /**
    * UDP FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UdpFloodPktThreshold")
    @Expose
    private Long UdpFloodPktThreshold;

    /**
    * ACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AckFloodThreshold")
    @Expose
    private Long AckFloodThreshold;

    /**
    * ACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AckFloodPktThreshold")
    @Expose
    private Long AckFloodPktThreshold;

    /**
    * SYNACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SynAckFloodThreshold")
    @Expose
    private Long SynAckFloodThreshold;

    /**
    * SYNACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SynAckFloodPktThreshold")
    @Expose
    private Long SynAckFloodPktThreshold;

    /**
    * RST FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RstFloodThreshold")
    @Expose
    private Long RstFloodThreshold;

    /**
    * RST FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RstFloodPktThreshold")
    @Expose
    private Long RstFloodPktThreshold;

    /**
     * Get DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
] 
     * @return DDoSLevel DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
     */
    public String getDDoSLevel() {
        return this.DDoSLevel;
    }

    /**
     * Set DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
     * @param DDoSLevel DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
     */
    public void setDDoSLevel(String DDoSLevel) {
        this.DDoSLevel = DDoSLevel;
    }

    /**
     * Get DDoS清洗阈值，单位Mbps 
     * @return DDoSThreshold DDoS清洗阈值，单位Mbps
     */
    public Long getDDoSThreshold() {
        return this.DDoSThreshold;
    }

    /**
     * Set DDoS清洗阈值，单位Mbps
     * @param DDoSThreshold DDoS清洗阈值，单位Mbps
     */
    public void setDDoSThreshold(Long DDoSThreshold) {
        this.DDoSThreshold = DDoSThreshold;
    }

    /**
     * Get DDoS的AI防护开关，取值[
on(开启)
off(关闭)
] 
     * @return DDoSAI DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
     */
    public String getDDoSAI() {
        return this.DDoSAI;
    }

    /**
     * Set DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
     * @param DDoSAI DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
     */
    public void setDDoSAI(String DDoSAI) {
        this.DDoSAI = DDoSAI;
    }

    /**
     * Get CC清洗开关，取值[
0(关闭)
1(开启)
] 
     * @return CCEnable CC清洗开关，取值[
0(关闭)
1(开启)
]
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set CC清洗开关，取值[
0(关闭)
1(开启)
]
     * @param CCEnable CC清洗开关，取值[
0(关闭)
1(开启)
]
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get CC清洗阈值，单位QPS 
     * @return CCThreshold CC清洗阈值，单位QPS
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set CC清洗阈值，单位QPS
     * @param CCThreshold CC清洗阈值，单位QPS
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    /**
     * Get 所属的资源实例 
     * @return InstanceDetailList 所属的资源实例
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set 所属的资源实例
     * @param InstanceDetailList 所属的资源实例
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    /**
     * Get 域名与协议纬度的防护阈值 
     * @return ListenerCcThresholdList 域名与协议纬度的防护阈值
     */
    public ListenerCcThreholdConfig [] getListenerCcThresholdList() {
        return this.ListenerCcThresholdList;
    }

    /**
     * Set 域名与协议纬度的防护阈值
     * @param ListenerCcThresholdList 域名与协议纬度的防护阈值
     */
    public void setListenerCcThresholdList(ListenerCcThreholdConfig [] ListenerCcThresholdList) {
        this.ListenerCcThresholdList = ListenerCcThresholdList;
    }

    /**
     * Get SYN FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SynFloodThreshold SYN FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSynFloodThreshold() {
        return this.SynFloodThreshold;
    }

    /**
     * Set SYN FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SynFloodThreshold SYN FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSynFloodThreshold(Long SynFloodThreshold) {
        this.SynFloodThreshold = SynFloodThreshold;
    }

    /**
     * Get SYN FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SynFloodPktThreshold SYN FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSynFloodPktThreshold() {
        return this.SynFloodPktThreshold;
    }

    /**
     * Set SYN FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SynFloodPktThreshold SYN FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSynFloodPktThreshold(Long SynFloodPktThreshold) {
        this.SynFloodPktThreshold = SynFloodPktThreshold;
    }

    /**
     * Get UDP FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UdpFloodThreshold UDP FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUdpFloodThreshold() {
        return this.UdpFloodThreshold;
    }

    /**
     * Set UDP FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param UdpFloodThreshold UDP FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUdpFloodThreshold(Long UdpFloodThreshold) {
        this.UdpFloodThreshold = UdpFloodThreshold;
    }

    /**
     * Get UDP FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UdpFloodPktThreshold UDP FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUdpFloodPktThreshold() {
        return this.UdpFloodPktThreshold;
    }

    /**
     * Set UDP FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param UdpFloodPktThreshold UDP FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUdpFloodPktThreshold(Long UdpFloodPktThreshold) {
        this.UdpFloodPktThreshold = UdpFloodPktThreshold;
    }

    /**
     * Get ACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AckFloodThreshold ACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAckFloodThreshold() {
        return this.AckFloodThreshold;
    }

    /**
     * Set ACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param AckFloodThreshold ACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAckFloodThreshold(Long AckFloodThreshold) {
        this.AckFloodThreshold = AckFloodThreshold;
    }

    /**
     * Get ACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AckFloodPktThreshold ACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAckFloodPktThreshold() {
        return this.AckFloodPktThreshold;
    }

    /**
     * Set ACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param AckFloodPktThreshold ACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAckFloodPktThreshold(Long AckFloodPktThreshold) {
        this.AckFloodPktThreshold = AckFloodPktThreshold;
    }

    /**
     * Get SYNACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SynAckFloodThreshold SYNACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSynAckFloodThreshold() {
        return this.SynAckFloodThreshold;
    }

    /**
     * Set SYNACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SynAckFloodThreshold SYNACK FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSynAckFloodThreshold(Long SynAckFloodThreshold) {
        this.SynAckFloodThreshold = SynAckFloodThreshold;
    }

    /**
     * Get SYNACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SynAckFloodPktThreshold SYNACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSynAckFloodPktThreshold() {
        return this.SynAckFloodPktThreshold;
    }

    /**
     * Set SYNACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SynAckFloodPktThreshold SYNACK FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSynAckFloodPktThreshold(Long SynAckFloodPktThreshold) {
        this.SynAckFloodPktThreshold = SynAckFloodPktThreshold;
    }

    /**
     * Get RST FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RstFloodThreshold RST FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRstFloodThreshold() {
        return this.RstFloodThreshold;
    }

    /**
     * Set RST FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RstFloodThreshold RST FLOOD流量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRstFloodThreshold(Long RstFloodThreshold) {
        this.RstFloodThreshold = RstFloodThreshold;
    }

    /**
     * Get RST FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RstFloodPktThreshold RST FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRstFloodPktThreshold() {
        return this.RstFloodPktThreshold;
    }

    /**
     * Set RST FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RstFloodPktThreshold RST FLOOD包量阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRstFloodPktThreshold(Long RstFloodPktThreshold) {
        this.RstFloodPktThreshold = RstFloodPktThreshold;
    }

    public ProtectThresholdRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectThresholdRelation(ProtectThresholdRelation source) {
        if (source.DDoSLevel != null) {
            this.DDoSLevel = new String(source.DDoSLevel);
        }
        if (source.DDoSThreshold != null) {
            this.DDoSThreshold = new Long(source.DDoSThreshold);
        }
        if (source.DDoSAI != null) {
            this.DDoSAI = new String(source.DDoSAI);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.CCThreshold != null) {
            this.CCThreshold = new Long(source.CCThreshold);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
        if (source.ListenerCcThresholdList != null) {
            this.ListenerCcThresholdList = new ListenerCcThreholdConfig[source.ListenerCcThresholdList.length];
            for (int i = 0; i < source.ListenerCcThresholdList.length; i++) {
                this.ListenerCcThresholdList[i] = new ListenerCcThreholdConfig(source.ListenerCcThresholdList[i]);
            }
        }
        if (source.SynFloodThreshold != null) {
            this.SynFloodThreshold = new Long(source.SynFloodThreshold);
        }
        if (source.SynFloodPktThreshold != null) {
            this.SynFloodPktThreshold = new Long(source.SynFloodPktThreshold);
        }
        if (source.UdpFloodThreshold != null) {
            this.UdpFloodThreshold = new Long(source.UdpFloodThreshold);
        }
        if (source.UdpFloodPktThreshold != null) {
            this.UdpFloodPktThreshold = new Long(source.UdpFloodPktThreshold);
        }
        if (source.AckFloodThreshold != null) {
            this.AckFloodThreshold = new Long(source.AckFloodThreshold);
        }
        if (source.AckFloodPktThreshold != null) {
            this.AckFloodPktThreshold = new Long(source.AckFloodPktThreshold);
        }
        if (source.SynAckFloodThreshold != null) {
            this.SynAckFloodThreshold = new Long(source.SynAckFloodThreshold);
        }
        if (source.SynAckFloodPktThreshold != null) {
            this.SynAckFloodPktThreshold = new Long(source.SynAckFloodPktThreshold);
        }
        if (source.RstFloodThreshold != null) {
            this.RstFloodThreshold = new Long(source.RstFloodThreshold);
        }
        if (source.RstFloodPktThreshold != null) {
            this.RstFloodPktThreshold = new Long(source.RstFloodPktThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DDoSLevel", this.DDoSLevel);
        this.setParamSimple(map, prefix + "DDoSThreshold", this.DDoSThreshold);
        this.setParamSimple(map, prefix + "DDoSAI", this.DDoSAI);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);
        this.setParamArrayObj(map, prefix + "ListenerCcThresholdList.", this.ListenerCcThresholdList);
        this.setParamSimple(map, prefix + "SynFloodThreshold", this.SynFloodThreshold);
        this.setParamSimple(map, prefix + "SynFloodPktThreshold", this.SynFloodPktThreshold);
        this.setParamSimple(map, prefix + "UdpFloodThreshold", this.UdpFloodThreshold);
        this.setParamSimple(map, prefix + "UdpFloodPktThreshold", this.UdpFloodPktThreshold);
        this.setParamSimple(map, prefix + "AckFloodThreshold", this.AckFloodThreshold);
        this.setParamSimple(map, prefix + "AckFloodPktThreshold", this.AckFloodPktThreshold);
        this.setParamSimple(map, prefix + "SynAckFloodThreshold", this.SynAckFloodThreshold);
        this.setParamSimple(map, prefix + "SynAckFloodPktThreshold", this.SynAckFloodPktThreshold);
        this.setParamSimple(map, prefix + "RstFloodThreshold", this.RstFloodThreshold);
        this.setParamSimple(map, prefix + "RstFloodPktThreshold", this.RstFloodPktThreshold);

    }
}

