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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputInfo extends AbstractModel {

    /**
    * 输出的名称。
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * 输出描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 输出的转推协议，支持SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 输出地区。
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * 输出类型：Internet/TencentCSS
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * 输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出
    */
    @SerializedName("OutputKind")
    @Expose
    private String OutputKind;

    /**
    * 输出的SRT的配置。
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateOutputSRTSettings SRTSettings;

    /**
    * 输出的RTMP的配置。
    */
    @SerializedName("RTMPSettings")
    @Expose
    private CreateOutputRTMPSettings RTMPSettings;

    /**
    * 输出的RTP的配置。
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateOutputInfoRTPSettings RTPSettings;

    /**
    * IP白名单列表，格式为CIDR，如0.0.0.0/0。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * 最大拉流并发数，最大4，默认4。
    */
    @SerializedName("MaxConcurrent")
    @Expose
    private Long MaxConcurrent;

    /**
    * 绑定的输入安全组 ID。 
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 可用区，output最多只支持输入一个可用区。	
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 输出的RIST的配置。
    */
    @SerializedName("RISTSettings")
    @Expose
    private CreateOutputRistSettings RISTSettings;

    /**
    * 对于含有多个音/视频轨的流，可以指定需要使用的轨道
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
     * Get 输出的名称。 
     * @return OutputName 输出的名称。
     */
    public String getOutputName() {
        return this.OutputName;
    }

    /**
     * Set 输出的名称。
     * @param OutputName 输出的名称。
     */
    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    /**
     * Get 输出描述。 
     * @return Description 输出描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 输出描述。
     * @param Description 输出描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 输出的转推协议，支持SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST。 
     * @return Protocol 输出的转推协议，支持SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 输出的转推协议，支持SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST。
     * @param Protocol 输出的转推协议，支持SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 输出地区。 
     * @return OutputRegion 输出地区。
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set 输出地区。
     * @param OutputRegion 输出地区。
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get 输出类型：Internet/TencentCSS 
     * @return OutputType 输出类型：Internet/TencentCSS
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 输出类型：Internet/TencentCSS
     * @param OutputType 输出类型：Internet/TencentCSS
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get 输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出 
     * @return OutputKind 输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出
     */
    public String getOutputKind() {
        return this.OutputKind;
    }

    /**
     * Set 输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出
     * @param OutputKind 输出模块类型，包括Pinpoint（单点输出，最多支持四路并发输出）；MultiMesh（多路输出，支持大于四路的并发输出，目前可以达到200路）。默认类型为 Pinpoint 输出。对于单个 Flow 一个区域最多只能有一个 MultiMesh 输出
     */
    public void setOutputKind(String OutputKind) {
        this.OutputKind = OutputKind;
    }

    /**
     * Get 输出的SRT的配置。 
     * @return SRTSettings 输出的SRT的配置。
     */
    public CreateOutputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set 输出的SRT的配置。
     * @param SRTSettings 输出的SRT的配置。
     */
    public void setSRTSettings(CreateOutputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get 输出的RTMP的配置。 
     * @return RTMPSettings 输出的RTMP的配置。
     */
    public CreateOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set 输出的RTMP的配置。
     * @param RTMPSettings 输出的RTMP的配置。
     */
    public void setRTMPSettings(CreateOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get 输出的RTP的配置。 
     * @return RTPSettings 输出的RTP的配置。
     */
    public CreateOutputInfoRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set 输出的RTP的配置。
     * @param RTPSettings 输出的RTP的配置。
     */
    public void setRTPSettings(CreateOutputInfoRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get IP白名单列表，格式为CIDR，如0.0.0.0/0。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。 
     * @return AllowIpList IP白名单列表，格式为CIDR，如0.0.0.0/0。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set IP白名单列表，格式为CIDR，如0.0.0.0/0。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
     * @param AllowIpList IP白名单列表，格式为CIDR，如0.0.0.0/0。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get 最大拉流并发数，最大4，默认4。 
     * @return MaxConcurrent 最大拉流并发数，最大4，默认4。
     */
    public Long getMaxConcurrent() {
        return this.MaxConcurrent;
    }

    /**
     * Set 最大拉流并发数，最大4，默认4。
     * @param MaxConcurrent 最大拉流并发数，最大4，默认4。
     */
    public void setMaxConcurrent(Long MaxConcurrent) {
        this.MaxConcurrent = MaxConcurrent;
    }

    /**
     * Get 绑定的输入安全组 ID。  
     * @return SecurityGroupIds 绑定的输入安全组 ID。 
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 绑定的输入安全组 ID。 
     * @param SecurityGroupIds 绑定的输入安全组 ID。 
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 可用区，output最多只支持输入一个可用区。	 
     * @return Zones 可用区，output最多只支持输入一个可用区。	
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区，output最多只支持输入一个可用区。	
     * @param Zones 可用区，output最多只支持输入一个可用区。	
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 输出的RIST的配置。 
     * @return RISTSettings 输出的RIST的配置。
     */
    public CreateOutputRistSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set 输出的RIST的配置。
     * @param RISTSettings 输出的RIST的配置。
     */
    public void setRISTSettings(CreateOutputRistSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get 对于含有多个音/视频轨的流，可以指定需要使用的轨道 
     * @return PidSelector 对于含有多个音/视频轨的流，可以指定需要使用的轨道
     */
    public PidSelector getPidSelector() {
        return this.PidSelector;
    }

    /**
     * Set 对于含有多个音/视频轨的流，可以指定需要使用的轨道
     * @param PidSelector 对于含有多个音/视频轨的流，可以指定需要使用的轨道
     */
    public void setPidSelector(PidSelector PidSelector) {
        this.PidSelector = PidSelector;
    }

    public CreateOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputInfo(CreateOutputInfo source) {
        if (source.OutputName != null) {
            this.OutputName = new String(source.OutputName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OutputRegion != null) {
            this.OutputRegion = new String(source.OutputRegion);
        }
        if (source.OutputType != null) {
            this.OutputType = new String(source.OutputType);
        }
        if (source.OutputKind != null) {
            this.OutputKind = new String(source.OutputKind);
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new CreateOutputSRTSettings(source.SRTSettings);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new CreateOutputRTMPSettings(source.RTMPSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new CreateOutputInfoRTPSettings(source.RTPSettings);
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
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
            this.RISTSettings = new CreateOutputRistSettings(source.RISTSettings);
        }
        if (source.PidSelector != null) {
            this.PidSelector = new PidSelector(source.PidSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "OutputRegion", this.OutputRegion);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "OutputKind", this.OutputKind);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamSimple(map, prefix + "MaxConcurrent", this.MaxConcurrent);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamObj(map, prefix + "PidSelector.", this.PidSelector);

    }
}

