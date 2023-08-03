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

public class ModifyDDoSThresholdRequest extends AbstractModel{

    /**
    * DDoS清洗阈值，取值[0, 60, 80, 100, 150, 200, 250, 300, 400, 500, 700, 1000];
当设置值为0时，表示采用默认值；
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * DDoS防护子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 配置其他阈值标志位，1表示配置其他阈值
    */
    @SerializedName("OtherThresholdFlag")
    @Expose
    private Long OtherThresholdFlag;

    /**
    * SYN FLOOD流量阈值
    */
    @SerializedName("SynFloodThreshold")
    @Expose
    private Long SynFloodThreshold;

    /**
    * SYN FLOOD包量阈值
    */
    @SerializedName("SynFloodPktThreshold")
    @Expose
    private Long SynFloodPktThreshold;

    /**
    * UDP FLOOD流量阈值
    */
    @SerializedName("UdpFloodThreshold")
    @Expose
    private Long UdpFloodThreshold;

    /**
    * UDP FLOOD包量阈值
    */
    @SerializedName("UdpFloodPktThreshold")
    @Expose
    private Long UdpFloodPktThreshold;

    /**
    * ACK FLOOD流量阈值
    */
    @SerializedName("AckFloodThreshold")
    @Expose
    private Long AckFloodThreshold;

    /**
    * ACK FLOOD包量阈值
    */
    @SerializedName("AckFloodPktThreshold")
    @Expose
    private Long AckFloodPktThreshold;

    /**
    * SYNACK FLOOD流量阈值
    */
    @SerializedName("SynAckFloodThreshold")
    @Expose
    private Long SynAckFloodThreshold;

    /**
    * SYNACK FLOOD包量阈值
    */
    @SerializedName("SynAckFloodPktThreshold")
    @Expose
    private Long SynAckFloodPktThreshold;

    /**
    * RST FLOOD流量阈值
    */
    @SerializedName("RstFloodThreshold")
    @Expose
    private Long RstFloodThreshold;

    /**
    * RST FLOOD包量阈值
    */
    @SerializedName("RstFloodPktThreshold")
    @Expose
    private Long RstFloodPktThreshold;

    /**
     * Get DDoS清洗阈值，取值[0, 60, 80, 100, 150, 200, 250, 300, 400, 500, 700, 1000];
当设置值为0时，表示采用默认值； 
     * @return Threshold DDoS清洗阈值，取值[0, 60, 80, 100, 150, 200, 250, 300, 400, 500, 700, 1000];
当设置值为0时，表示采用默认值；
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set DDoS清洗阈值，取值[0, 60, 80, 100, 150, 200, 250, 300, 400, 500, 700, 1000];
当设置值为0时，表示采用默认值；
     * @param Threshold DDoS清洗阈值，取值[0, 60, 80, 100, 150, 200, 250, 300, 400, 500, 700, 1000];
当设置值为0时，表示采用默认值；
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 资源ID 
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get DDoS防护子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版） 
     * @return Business DDoS防护子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set DDoS防护子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business DDoS防护子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 配置其他阈值标志位，1表示配置其他阈值 
     * @return OtherThresholdFlag 配置其他阈值标志位，1表示配置其他阈值
     */
    public Long getOtherThresholdFlag() {
        return this.OtherThresholdFlag;
    }

    /**
     * Set 配置其他阈值标志位，1表示配置其他阈值
     * @param OtherThresholdFlag 配置其他阈值标志位，1表示配置其他阈值
     */
    public void setOtherThresholdFlag(Long OtherThresholdFlag) {
        this.OtherThresholdFlag = OtherThresholdFlag;
    }

    /**
     * Get SYN FLOOD流量阈值 
     * @return SynFloodThreshold SYN FLOOD流量阈值
     */
    public Long getSynFloodThreshold() {
        return this.SynFloodThreshold;
    }

    /**
     * Set SYN FLOOD流量阈值
     * @param SynFloodThreshold SYN FLOOD流量阈值
     */
    public void setSynFloodThreshold(Long SynFloodThreshold) {
        this.SynFloodThreshold = SynFloodThreshold;
    }

    /**
     * Get SYN FLOOD包量阈值 
     * @return SynFloodPktThreshold SYN FLOOD包量阈值
     */
    public Long getSynFloodPktThreshold() {
        return this.SynFloodPktThreshold;
    }

    /**
     * Set SYN FLOOD包量阈值
     * @param SynFloodPktThreshold SYN FLOOD包量阈值
     */
    public void setSynFloodPktThreshold(Long SynFloodPktThreshold) {
        this.SynFloodPktThreshold = SynFloodPktThreshold;
    }

    /**
     * Get UDP FLOOD流量阈值 
     * @return UdpFloodThreshold UDP FLOOD流量阈值
     */
    public Long getUdpFloodThreshold() {
        return this.UdpFloodThreshold;
    }

    /**
     * Set UDP FLOOD流量阈值
     * @param UdpFloodThreshold UDP FLOOD流量阈值
     */
    public void setUdpFloodThreshold(Long UdpFloodThreshold) {
        this.UdpFloodThreshold = UdpFloodThreshold;
    }

    /**
     * Get UDP FLOOD包量阈值 
     * @return UdpFloodPktThreshold UDP FLOOD包量阈值
     */
    public Long getUdpFloodPktThreshold() {
        return this.UdpFloodPktThreshold;
    }

    /**
     * Set UDP FLOOD包量阈值
     * @param UdpFloodPktThreshold UDP FLOOD包量阈值
     */
    public void setUdpFloodPktThreshold(Long UdpFloodPktThreshold) {
        this.UdpFloodPktThreshold = UdpFloodPktThreshold;
    }

    /**
     * Get ACK FLOOD流量阈值 
     * @return AckFloodThreshold ACK FLOOD流量阈值
     */
    public Long getAckFloodThreshold() {
        return this.AckFloodThreshold;
    }

    /**
     * Set ACK FLOOD流量阈值
     * @param AckFloodThreshold ACK FLOOD流量阈值
     */
    public void setAckFloodThreshold(Long AckFloodThreshold) {
        this.AckFloodThreshold = AckFloodThreshold;
    }

    /**
     * Get ACK FLOOD包量阈值 
     * @return AckFloodPktThreshold ACK FLOOD包量阈值
     */
    public Long getAckFloodPktThreshold() {
        return this.AckFloodPktThreshold;
    }

    /**
     * Set ACK FLOOD包量阈值
     * @param AckFloodPktThreshold ACK FLOOD包量阈值
     */
    public void setAckFloodPktThreshold(Long AckFloodPktThreshold) {
        this.AckFloodPktThreshold = AckFloodPktThreshold;
    }

    /**
     * Get SYNACK FLOOD流量阈值 
     * @return SynAckFloodThreshold SYNACK FLOOD流量阈值
     */
    public Long getSynAckFloodThreshold() {
        return this.SynAckFloodThreshold;
    }

    /**
     * Set SYNACK FLOOD流量阈值
     * @param SynAckFloodThreshold SYNACK FLOOD流量阈值
     */
    public void setSynAckFloodThreshold(Long SynAckFloodThreshold) {
        this.SynAckFloodThreshold = SynAckFloodThreshold;
    }

    /**
     * Get SYNACK FLOOD包量阈值 
     * @return SynAckFloodPktThreshold SYNACK FLOOD包量阈值
     */
    public Long getSynAckFloodPktThreshold() {
        return this.SynAckFloodPktThreshold;
    }

    /**
     * Set SYNACK FLOOD包量阈值
     * @param SynAckFloodPktThreshold SYNACK FLOOD包量阈值
     */
    public void setSynAckFloodPktThreshold(Long SynAckFloodPktThreshold) {
        this.SynAckFloodPktThreshold = SynAckFloodPktThreshold;
    }

    /**
     * Get RST FLOOD流量阈值 
     * @return RstFloodThreshold RST FLOOD流量阈值
     */
    public Long getRstFloodThreshold() {
        return this.RstFloodThreshold;
    }

    /**
     * Set RST FLOOD流量阈值
     * @param RstFloodThreshold RST FLOOD流量阈值
     */
    public void setRstFloodThreshold(Long RstFloodThreshold) {
        this.RstFloodThreshold = RstFloodThreshold;
    }

    /**
     * Get RST FLOOD包量阈值 
     * @return RstFloodPktThreshold RST FLOOD包量阈值
     */
    public Long getRstFloodPktThreshold() {
        return this.RstFloodPktThreshold;
    }

    /**
     * Set RST FLOOD包量阈值
     * @param RstFloodPktThreshold RST FLOOD包量阈值
     */
    public void setRstFloodPktThreshold(Long RstFloodPktThreshold) {
        this.RstFloodPktThreshold = RstFloodPktThreshold;
    }

    public ModifyDDoSThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSThresholdRequest(ModifyDDoSThresholdRequest source) {
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.OtherThresholdFlag != null) {
            this.OtherThresholdFlag = new Long(source.OtherThresholdFlag);
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
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "OtherThresholdFlag", this.OtherThresholdFlag);
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

