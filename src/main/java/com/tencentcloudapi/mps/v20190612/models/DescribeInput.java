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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInput extends AbstractModel {

    /**
    * <p>输入Id。</p>
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * <p>输入名称。</p>
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * <p>输入描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>输入协议。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>输入地址列表。</p>
    */
    @SerializedName("InputAddressList")
    @Expose
    private InputAddress [] InputAddressList;

    /**
    * <p>输入IP白名单列表。</p>
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * <p>输入的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeInputSRTSettings SRTSettings;

    /**
    * <p>输入的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTPSettings")
    @Expose
    private DescribeInputRTPSettings RTPSettings;

    /**
    * <p>输入的地区。</p>
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * <p>输入的RTMP配置信息。</p>
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeInputRTMPSettings RTMPSettings;

    /**
    * <p>输入的主备开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>输入的RTMP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeInputRTMPPullSettings RTMPPullSettings;

    /**
    * <p>输入的RTSP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeInputRTSPPullSettings RTSPPullSettings;

    /**
    * <p>输入的HLS_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeInputHLSPullSettings HLSPullSettings;

    /**
    * <p>延播平滑吐流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResilientStream")
    @Expose
    private ResilientStreamConf ResilientStream;

    /**
    * <p>绑定的输入安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>可用区配置，开启容灾情况下最多有两个，顺序和pipeline 0、1对应，否则最多只有一个可用区。</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>输入的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RISTSettings")
    @Expose
    private DescribeInputRISTSettings RISTSettings;

    /**
    * <p>输入模块配置相关的URL信息，包含提供的推流地址，或者配置的第三方源流地址</p>
    */
    @SerializedName("StreamUrls")
    @Expose
    private StreamUrlDetail [] StreamUrls;

    /**
     * Get <p>输入Id。</p> 
     * @return InputId <p>输入Id。</p>
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set <p>输入Id。</p>
     * @param InputId <p>输入Id。</p>
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get <p>输入名称。</p> 
     * @return InputName <p>输入名称。</p>
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set <p>输入名称。</p>
     * @param InputName <p>输入名称。</p>
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get <p>输入描述。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>输入描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>输入描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>输入描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>输入协议。</p> 
     * @return Protocol <p>输入协议。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>输入协议。</p>
     * @param Protocol <p>输入协议。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>输入地址列表。</p> 
     * @return InputAddressList <p>输入地址列表。</p>
     */
    public InputAddress [] getInputAddressList() {
        return this.InputAddressList;
    }

    /**
     * Set <p>输入地址列表。</p>
     * @param InputAddressList <p>输入地址列表。</p>
     */
    public void setInputAddressList(InputAddress [] InputAddressList) {
        this.InputAddressList = InputAddressList;
    }

    /**
     * Get <p>输入IP白名单列表。</p> 
     * @return AllowIpList <p>输入IP白名单列表。</p>
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set <p>输入IP白名单列表。</p>
     * @param AllowIpList <p>输入IP白名单列表。</p>
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get <p>输入的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SRTSettings <p>输入的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set <p>输入的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SRTSettings <p>输入的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSRTSettings(DescribeInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get <p>输入的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTPSettings <p>输入的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set <p>输入的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTPSettings <p>输入的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTPSettings(DescribeInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get <p>输入的地区。</p> 
     * @return InputRegion <p>输入的地区。</p>
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set <p>输入的地区。</p>
     * @param InputRegion <p>输入的地区。</p>
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get <p>输入的RTMP配置信息。</p> 
     * @return RTMPSettings <p>输入的RTMP配置信息。</p>
     */
    public DescribeInputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set <p>输入的RTMP配置信息。</p>
     * @param RTMPSettings <p>输入的RTMP配置信息。</p>
     */
    public void setRTMPSettings(DescribeInputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get <p>输入的主备开关。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailOver <p>输入的主备开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>输入的主备开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailOver <p>输入的主备开关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>输入的RTMP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMPPullSettings <p>输入的RTMP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set <p>输入的RTMP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMPPullSettings <p>输入的RTMP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMPPullSettings(DescribeInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get <p>输入的RTSP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTSPPullSettings <p>输入的RTSP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set <p>输入的RTSP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTSPPullSettings <p>输入的RTSP_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTSPPullSettings(DescribeInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get <p>输入的HLS_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HLSPullSettings <p>输入的HLS_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set <p>输入的HLS_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HLSPullSettings <p>输入的HLS_PULL配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHLSPullSettings(DescribeInputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get <p>延播平滑吐流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResilientStream <p>延播平滑吐流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResilientStreamConf getResilientStream() {
        return this.ResilientStream;
    }

    /**
     * Set <p>延播平滑吐流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResilientStream <p>延播平滑吐流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResilientStream(ResilientStreamConf ResilientStream) {
        this.ResilientStream = ResilientStream;
    }

    /**
     * Get <p>绑定的输入安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIds <p>绑定的输入安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>绑定的输入安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIds <p>绑定的输入安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>可用区配置，开启容灾情况下最多有两个，顺序和pipeline 0、1对应，否则最多只有一个可用区。</p> 
     * @return Zones <p>可用区配置，开启容灾情况下最多有两个，顺序和pipeline 0、1对应，否则最多只有一个可用区。</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>可用区配置，开启容灾情况下最多有两个，顺序和pipeline 0、1对应，否则最多只有一个可用区。</p>
     * @param Zones <p>可用区配置，开启容灾情况下最多有两个，顺序和pipeline 0、1对应，否则最多只有一个可用区。</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>输入的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RISTSettings <p>输入的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set <p>输入的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RISTSettings <p>输入的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRISTSettings(DescribeInputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get <p>输入模块配置相关的URL信息，包含提供的推流地址，或者配置的第三方源流地址</p> 
     * @return StreamUrls <p>输入模块配置相关的URL信息，包含提供的推流地址，或者配置的第三方源流地址</p>
     */
    public StreamUrlDetail [] getStreamUrls() {
        return this.StreamUrls;
    }

    /**
     * Set <p>输入模块配置相关的URL信息，包含提供的推流地址，或者配置的第三方源流地址</p>
     * @param StreamUrls <p>输入模块配置相关的URL信息，包含提供的推流地址，或者配置的第三方源流地址</p>
     */
    public void setStreamUrls(StreamUrlDetail [] StreamUrls) {
        this.StreamUrls = StreamUrls;
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
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.RISTSettings != null) {
            this.RISTSettings = new DescribeInputRISTSettings(source.RISTSettings);
        }
        if (source.StreamUrls != null) {
            this.StreamUrls = new StreamUrlDetail[source.StreamUrls.length];
            for (int i = 0; i < source.StreamUrls.length; i++) {
                this.StreamUrls[i] = new StreamUrlDetail(source.StreamUrls[i]);
            }
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
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamArrayObj(map, prefix + "StreamUrls.", this.StreamUrls);

    }
}

