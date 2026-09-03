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

public class DescribeOutput extends AbstractModel {

    /**
    * <p>输出Id。</p>
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * <p>输出名称。</p>
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * <p>输出类型。</p>
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * <p>输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出。</p>
    */
    @SerializedName("OutputKind")
    @Expose
    private String OutputKind;

    /**
    * <p>输出描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>输出协议。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>输出的出口地址信息列表。</p>
    */
    @SerializedName("OutputAddressList")
    @Expose
    private OutputAddress [] OutputAddressList;

    /**
    * <p>输出的地区。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * <p>输出的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeOutputSRTSettings SRTSettings;

    /**
    * <p>输出的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTPSettings")
    @Expose
    private DescribeOutputRTPSettings RTPSettings;

    /**
    * <p>输出的RTMP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeOutputRTMPSettings RTMPSettings;

    /**
    * <p>输出的RTMP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeOutputRTMPPullSettings RTMPPullSettings;

    /**
    * <p>CIDR白名单列表。<br>当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * <p>输出的RTSP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeOutputRTSPPullSettings RTSPPullSettings;

    /**
    * <p>输出的HLS拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeOutputHLSPullSettings HLSPullSettings;

    /**
    * <p>最大拉流并发数，最大为4，默认4。</p>
    */
    @SerializedName("MaxConcurrent")
    @Expose
    private Long MaxConcurrent;

    /**
    * <p>绑定的安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>可用区，output目前最多只支持一个。</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>输出的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RISTSettings")
    @Expose
    private DescribeOutputRISTSettings RISTSettings;

    /**
    * <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
    * <p>输出模块配置，相关的URL，包括提供的拉流地址，或者配置的输出到第三方的转推地址</p>
    */
    @SerializedName("StreamUrls")
    @Expose
    private StreamUrlDetail [] StreamUrls;

    /**
    * <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
    */
    @SerializedName("StreamSelector")
    @Expose
    private StreamSelector StreamSelector;

    /**
    * <p>启用或者禁用输出</p><p>枚举值：</p><ul><li>DISABLED： 禁用</li><li>ENABLED： 启用</li></ul>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get <p>输出Id。</p> 
     * @return OutputId <p>输出Id。</p>
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set <p>输出Id。</p>
     * @param OutputId <p>输出Id。</p>
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    /**
     * Get <p>输出名称。</p> 
     * @return OutputName <p>输出名称。</p>
     */
    public String getOutputName() {
        return this.OutputName;
    }

    /**
     * Set <p>输出名称。</p>
     * @param OutputName <p>输出名称。</p>
     */
    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    /**
     * Get <p>输出类型。</p> 
     * @return OutputType <p>输出类型。</p>
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set <p>输出类型。</p>
     * @param OutputType <p>输出类型。</p>
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get <p>输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出。</p> 
     * @return OutputKind <p>输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出。</p>
     */
    public String getOutputKind() {
        return this.OutputKind;
    }

    /**
     * Set <p>输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出。</p>
     * @param OutputKind <p>输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出。</p>
     */
    public void setOutputKind(String OutputKind) {
        this.OutputKind = OutputKind;
    }

    /**
     * Get <p>输出描述。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>输出描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>输出描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>输出描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>输出协议。</p> 
     * @return Protocol <p>输出协议。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>输出协议。</p>
     * @param Protocol <p>输出协议。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>输出的出口地址信息列表。</p> 
     * @return OutputAddressList <p>输出的出口地址信息列表。</p>
     */
    public OutputAddress [] getOutputAddressList() {
        return this.OutputAddressList;
    }

    /**
     * Set <p>输出的出口地址信息列表。</p>
     * @param OutputAddressList <p>输出的出口地址信息列表。</p>
     */
    public void setOutputAddressList(OutputAddress [] OutputAddressList) {
        this.OutputAddressList = OutputAddressList;
    }

    /**
     * Get <p>输出的地区。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputRegion <p>输出的地区。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set <p>输出的地区。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputRegion <p>输出的地区。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get <p>输出的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SRTSettings <p>输出的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set <p>输出的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SRTSettings <p>输出的SRT配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSRTSettings(DescribeOutputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get <p>输出的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTPSettings <p>输出的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set <p>输出的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTPSettings <p>输出的RTP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTPSettings(DescribeOutputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get <p>输出的RTMP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMPSettings <p>输出的RTMP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set <p>输出的RTMP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMPSettings <p>输出的RTMP配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMPSettings(DescribeOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get <p>输出的RTMP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMPPullSettings <p>输出的RTMP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set <p>输出的RTMP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMPPullSettings <p>输出的RTMP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMPPullSettings(DescribeOutputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get <p>CIDR白名单列表。<br>当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowIpList <p>CIDR白名单列表。<br>当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set <p>CIDR白名单列表。<br>当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowIpList <p>CIDR白名单列表。<br>当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get <p>输出的RTSP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTSPPullSettings <p>输出的RTSP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set <p>输出的RTSP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTSPPullSettings <p>输出的RTSP拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTSPPullSettings(DescribeOutputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get <p>输出的HLS拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HLSPullSettings <p>输出的HLS拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set <p>输出的HLS拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HLSPullSettings <p>输出的HLS拉流配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHLSPullSettings(DescribeOutputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get <p>最大拉流并发数，最大为4，默认4。</p> 
     * @return MaxConcurrent <p>最大拉流并发数，最大为4，默认4。</p>
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set <p>最大拉流并发数，最大为4，默认4。</p>
     * @param MaxConcurrent <p>最大拉流并发数，最大为4，默认4。</p>
     */
    public void setMaxConcurrent(Long MaxConcurrent) {
        this.MaxConcurrent = MaxConcurrent;
    }

    /**
     * Get <p>绑定的安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIds <p>绑定的安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>绑定的安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIds <p>绑定的安全组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>可用区，output目前最多只支持一个。</p> 
     * @return Zones <p>可用区，output目前最多只支持一个。</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>可用区，output目前最多只支持一个。</p>
     * @param Zones <p>可用区，output目前最多只支持一个。</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>输出的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RISTSettings <p>输出的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set <p>输出的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RISTSettings <p>输出的RIST配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRISTSettings(DescribeOutputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p> 
     * @return PidSelector <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
     * @deprecated
     */
    @Deprecated
    public PidSelector getPidSelector() {
        return this.PidSelector;
    }

    /**
     * Set <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
     * @param PidSelector <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
     * @deprecated
     */
    @Deprecated
    public void setPidSelector(PidSelector PidSelector) {
        this.PidSelector = PidSelector;
    }

    /**
     * Get <p>输出模块配置，相关的URL，包括提供的拉流地址，或者配置的输出到第三方的转推地址</p> 
     * @return StreamUrls <p>输出模块配置，相关的URL，包括提供的拉流地址，或者配置的输出到第三方的转推地址</p>
     */
    public StreamUrlDetail [] getStreamUrls() {
        return this.StreamUrls;
    }

    /**
     * Set <p>输出模块配置，相关的URL，包括提供的拉流地址，或者配置的输出到第三方的转推地址</p>
     * @param StreamUrls <p>输出模块配置，相关的URL，包括提供的拉流地址，或者配置的输出到第三方的转推地址</p>
     */
    public void setStreamUrls(StreamUrlDetail [] StreamUrls) {
        this.StreamUrls = StreamUrls;
    }

    /**
     * Get <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p> 
     * @return StreamSelector <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
     */
    public StreamSelector getStreamSelector() {
        return this.StreamSelector;
    }

    /**
     * Set <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
     * @param StreamSelector <p>对于含有多个音/视频轨的流，可以指定需要使用的轨道</p>
     */
    public void setStreamSelector(StreamSelector StreamSelector) {
        this.StreamSelector = StreamSelector;
    }

    /**
     * Get <p>启用或者禁用输出</p><p>枚举值：</p><ul><li>DISABLED： 禁用</li><li>ENABLED： 启用</li></ul> 
     * @return State <p>启用或者禁用输出</p><p>枚举值：</p><ul><li>DISABLED： 禁用</li><li>ENABLED： 启用</li></ul>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>启用或者禁用输出</p><p>枚举值：</p><ul><li>DISABLED： 禁用</li><li>ENABLED： 启用</li></ul>
     * @param State <p>启用或者禁用输出</p><p>枚举值：</p><ul><li>DISABLED： 禁用</li><li>ENABLED： 启用</li></ul>
     */
    public void setState(String State) {
        this.State = State;
    }

    public DescribeOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutput(DescribeOutput source) {
        if (source.OutputId != null) {
            this.OutputId = new String(source.OutputId);
        }
        if (source.OutputName != null) {
            this.OutputName = new String(source.OutputName);
        }
        if (source.OutputType != null) {
            this.OutputType = new String(source.OutputType);
        }
        if (source.OutputKind != null) {
            this.OutputKind = new String(source.OutputKind);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OutputAddressList != null) {
            this.OutputAddressList = new OutputAddress[source.OutputAddressList.length];
            for (int i = 0; i < source.OutputAddressList.length; i++) {
                this.OutputAddressList[i] = new OutputAddress(source.OutputAddressList[i]);
            }
        }
        if (source.OutputRegion != null) {
            this.OutputRegion = new String(source.OutputRegion);
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new DescribeOutputSRTSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new DescribeOutputRTPSettings(source.RTPSettings);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new DescribeOutputRTMPSettings(source.RTMPSettings);
        }
        if (source.RTMPPullSettings != null) {
            this.RTMPPullSettings = new DescribeOutputRTMPPullSettings(source.RTMPPullSettings);
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
        }
        if (source.RTSPPullSettings != null) {
            this.RTSPPullSettings = new DescribeOutputRTSPPullSettings(source.RTSPPullSettings);
        }
        if (source.HLSPullSettings != null) {
            this.HLSPullSettings = new DescribeOutputHLSPullSettings(source.HLSPullSettings);
        }
        if (source.MaxConcurrent != null) {
            this.MaxConcurrent = new Long(source.MaxConcurrent);
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
            this.RISTSettings = new DescribeOutputRISTSettings(source.RISTSettings);
        }
        if (source.PidSelector != null) {
            this.PidSelector = new PidSelector(source.PidSelector);
        }
        if (source.StreamUrls != null) {
            this.StreamUrls = new StreamUrlDetail[source.StreamUrls.length];
            for (int i = 0; i < source.StreamUrls.length; i++) {
                this.StreamUrls[i] = new StreamUrlDetail(source.StreamUrls[i]);
            }
        }
        if (source.StreamSelector != null) {
            this.StreamSelector = new StreamSelector(source.StreamSelector);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "OutputKind", this.OutputKind);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "OutputAddressList.", this.OutputAddressList);
        this.setParamSimple(map, prefix + "OutputRegion", this.OutputRegion);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamSimple(map, prefix + "MaxConcurrent", this.MaxConcurrent);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamObj(map, prefix + "PidSelector.", this.PidSelector);
        this.setParamArrayObj(map, prefix + "StreamUrls.", this.StreamUrls);
        this.setParamObj(map, prefix + "StreamSelector.", this.StreamSelector);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

