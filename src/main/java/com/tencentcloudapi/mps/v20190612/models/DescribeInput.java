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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInput extends AbstractModel{

    /**
    * 输入Id。
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * 输入名称。
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * 输入描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 输入协议。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 输入地址列表。
    */
    @SerializedName("InputAddressList")
    @Expose
    private InputAddress [] InputAddressList;

    /**
    * 输入IP白名单列表。
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * 输入的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeInputSRTSettings SRTSettings;

    /**
    * 输入的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTPSettings")
    @Expose
    private DescribeInputRTPSettings RTPSettings;

    /**
    * 输入的地区。
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * 输入的RTMP配置信息。
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeInputRTMPSettings RTMPSettings;

    /**
    * 输入的主备开关。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * 输入的RTMP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeInputRTMPPullSettings RTMPPullSettings;

    /**
    * 输入的RTSP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeInputRTSPPullSettings RTSPPullSettings;

    /**
    * 输入的HLS_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeInputHLSPullSettings HLSPullSettings;

    /**
    * 延播平滑吐流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResilientStream")
    @Expose
    private ResilientStreamConf ResilientStream;

    /**
     * Get 输入Id。 
     * @return InputId 输入Id。
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set 输入Id。
     * @param InputId 输入Id。
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get 输入名称。 
     * @return InputName 输入名称。
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set 输入名称。
     * @param InputName 输入名称。
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get 输入描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 输入描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 输入描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 输入描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 输入协议。 
     * @return Protocol 输入协议。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 输入协议。
     * @param Protocol 输入协议。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 输入地址列表。 
     * @return InputAddressList 输入地址列表。
     */
    public InputAddress [] getInputAddressList() {
        return this.InputAddressList;
    }

    /**
     * Set 输入地址列表。
     * @param InputAddressList 输入地址列表。
     */
    public void setInputAddressList(InputAddress [] InputAddressList) {
        this.InputAddressList = InputAddressList;
    }

    /**
     * Get 输入IP白名单列表。 
     * @return AllowIpList 输入IP白名单列表。
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set 输入IP白名单列表。
     * @param AllowIpList 输入IP白名单列表。
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get 输入的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SRTSettings 输入的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set 输入的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SRTSettings 输入的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSRTSettings(DescribeInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get 输入的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTPSettings 输入的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set 输入的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTPSettings 输入的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTPSettings(DescribeInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get 输入的地区。 
     * @return InputRegion 输入的地区。
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set 输入的地区。
     * @param InputRegion 输入的地区。
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get 输入的RTMP配置信息。 
     * @return RTMPSettings 输入的RTMP配置信息。
     */
    public DescribeInputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set 输入的RTMP配置信息。
     * @param RTMPSettings 输入的RTMP配置信息。
     */
    public void setRTMPSettings(DescribeInputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get 输入的主备开关。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailOver 输入的主备开关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 输入的主备开关。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailOver 输入的主备开关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 输入的RTMP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMPPullSettings 输入的RTMP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set 输入的RTMP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMPPullSettings 输入的RTMP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMPPullSettings(DescribeInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get 输入的RTSP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTSPPullSettings 输入的RTSP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set 输入的RTSP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTSPPullSettings 输入的RTSP_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTSPPullSettings(DescribeInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get 输入的HLS_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HLSPullSettings 输入的HLS_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set 输入的HLS_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HLSPullSettings 输入的HLS_PULL配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHLSPullSettings(DescribeInputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get 延播平滑吐流配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResilientStream 延播平滑吐流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResilientStreamConf getResilientStream() {
        return this.ResilientStream;
    }

    /**
     * Set 延播平滑吐流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResilientStream 延播平滑吐流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResilientStream(ResilientStreamConf ResilientStream) {
        this.ResilientStream = ResilientStream;
    }

    public DescribeInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInput(DescribeInput source) {
        if (source.InputId != null) {
            this.InputId = new String(source.InputId);
        }
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.InputAddressList != null) {
            this.InputAddressList = new InputAddress[source.InputAddressList.length];
            for (int i = 0; i < source.InputAddressList.length; i++) {
                this.InputAddressList[i] = new InputAddress(source.InputAddressList[i]);
            }
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new DescribeInputSRTSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new DescribeInputRTPSettings(source.RTPSettings);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new DescribeInputRTMPSettings(source.RTMPSettings);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.RTMPPullSettings != null) {
            this.RTMPPullSettings = new DescribeInputRTMPPullSettings(source.RTMPPullSettings);
        }
        if (source.RTSPPullSettings != null) {
            this.RTSPPullSettings = new DescribeInputRTSPPullSettings(source.RTSPPullSettings);
        }
        if (source.HLSPullSettings != null) {
            this.HLSPullSettings = new DescribeInputHLSPullSettings(source.HLSPullSettings);
        }
        if (source.ResilientStream != null) {
            this.ResilientStream = new ResilientStreamConf(source.ResilientStream);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputId", this.InputId);
        this.setParamSimple(map, prefix + "InputName", this.InputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "InputAddressList.", this.InputAddressList);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamObj(map, prefix + "ResilientStream.", this.ResilientStream);

    }
}

