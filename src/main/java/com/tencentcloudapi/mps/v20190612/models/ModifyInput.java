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

public class ModifyInput extends AbstractModel {

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
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 允许的推流的IP，CIDR格式。
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * SRT的配置信息。
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateInputSRTSettings SRTSettings;

    /**
    * RTP的配置信息。
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateInputRTPSettings RTPSettings;

    /**
    * 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST]。	-
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 输入的主备开关，可选[OPEN|CLOSE]。
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * RTMP_PULL的配置信息。
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private CreateInputRTMPPullSettings RTMPPullSettings;

    /**
    * RTSP_PULL的配置信息。
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private CreateInputRTSPPullSettings RTSPPullSettings;

    /**
    * HLS_PULL的配置信息。
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private CreateInputHLSPullSettings HLSPullSettings;

    /**
    * 延播平滑吐流配置信息。
    */
    @SerializedName("ResilientStream")
    @Expose
    private ResilientStreamConf ResilientStream;

    /**
    * 绑定的输入安全组 ID。 仅支持关联一组安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 可用区，非必填，最多支持输入两个可用区，对于需改接口，只要第二个可用区会参与到资源分配。如果input开启容灾或者涉及RTSP_PULL协议切换时有效(会重新分配地址)。	
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * RIST的配置信息。
    */
    @SerializedName("RISTSettings")
    @Expose
    private CreateInputRISTSettings RISTSettings;

    /**
    * 输入节点的地区
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

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
     * @return Description 输入描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 输入描述。
     * @param Description 输入描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 允许的推流的IP，CIDR格式。 
     * @return AllowIpList 允许的推流的IP，CIDR格式。
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set 允许的推流的IP，CIDR格式。
     * @param AllowIpList 允许的推流的IP，CIDR格式。
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get SRT的配置信息。 
     * @return SRTSettings SRT的配置信息。
     */
    public CreateInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set SRT的配置信息。
     * @param SRTSettings SRT的配置信息。
     */
    public void setSRTSettings(CreateInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get RTP的配置信息。 
     * @return RTPSettings RTP的配置信息。
     */
    public CreateInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set RTP的配置信息。
     * @param RTPSettings RTP的配置信息。
     */
    public void setRTPSettings(CreateInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST]。	- 
     * @return Protocol 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST]。	-
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST]。	-
     * @param Protocol 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL|RTSP_PULL|RIST]。	-
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 输入的主备开关，可选[OPEN|CLOSE]。 
     * @return FailOver 输入的主备开关，可选[OPEN|CLOSE]。
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 输入的主备开关，可选[OPEN|CLOSE]。
     * @param FailOver 输入的主备开关，可选[OPEN|CLOSE]。
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get RTMP_PULL的配置信息。 
     * @return RTMPPullSettings RTMP_PULL的配置信息。
     */
    public CreateInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set RTMP_PULL的配置信息。
     * @param RTMPPullSettings RTMP_PULL的配置信息。
     */
    public void setRTMPPullSettings(CreateInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get RTSP_PULL的配置信息。 
     * @return RTSPPullSettings RTSP_PULL的配置信息。
     */
    public CreateInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set RTSP_PULL的配置信息。
     * @param RTSPPullSettings RTSP_PULL的配置信息。
     */
    public void setRTSPPullSettings(CreateInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get HLS_PULL的配置信息。 
     * @return HLSPullSettings HLS_PULL的配置信息。
     */
    public CreateInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set HLS_PULL的配置信息。
     * @param HLSPullSettings HLS_PULL的配置信息。
     */
    public void setHLSPullSettings(CreateInputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
    }

    /**
     * Get 延播平滑吐流配置信息。 
     * @return ResilientStream 延播平滑吐流配置信息。
     */
    public ResilientStreamConf getResilientStream() {
        return this.ResilientStream;
    }

    /**
     * Set 延播平滑吐流配置信息。
     * @param ResilientStream 延播平滑吐流配置信息。
     */
    public void setResilientStream(ResilientStreamConf ResilientStream) {
        this.ResilientStream = ResilientStream;
    }

    /**
     * Get 绑定的输入安全组 ID。 仅支持关联一组安全组。 
     * @return SecurityGroupIds 绑定的输入安全组 ID。 仅支持关联一组安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 绑定的输入安全组 ID。 仅支持关联一组安全组。
     * @param SecurityGroupIds 绑定的输入安全组 ID。 仅支持关联一组安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 可用区，非必填，最多支持输入两个可用区，对于需改接口，只要第二个可用区会参与到资源分配。如果input开启容灾或者涉及RTSP_PULL协议切换时有效(会重新分配地址)。	 
     * @return Zones 可用区，非必填，最多支持输入两个可用区，对于需改接口，只要第二个可用区会参与到资源分配。如果input开启容灾或者涉及RTSP_PULL协议切换时有效(会重新分配地址)。	
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区，非必填，最多支持输入两个可用区，对于需改接口，只要第二个可用区会参与到资源分配。如果input开启容灾或者涉及RTSP_PULL协议切换时有效(会重新分配地址)。	
     * @param Zones 可用区，非必填，最多支持输入两个可用区，对于需改接口，只要第二个可用区会参与到资源分配。如果input开启容灾或者涉及RTSP_PULL协议切换时有效(会重新分配地址)。	
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get RIST的配置信息。 
     * @return RISTSettings RIST的配置信息。
     */
    public CreateInputRISTSettings getRISTSettings() {
        return this.RISTSettings;
    }

    /**
     * Set RIST的配置信息。
     * @param RISTSettings RIST的配置信息。
     */
    public void setRISTSettings(CreateInputRISTSettings RISTSettings) {
        this.RISTSettings = RISTSettings;
    }

    /**
     * Get 输入节点的地区 
     * @return InputRegion 输入节点的地区
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set 输入节点的地区
     * @param InputRegion 输入节点的地区
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    public ModifyInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInput(ModifyInput source) {
        if (source.InputId != null) {
            this.InputId = new String(source.InputId);
        }
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AllowIpList != null) {
            this.AllowIpList = new String[source.AllowIpList.length];
            for (int i = 0; i < source.AllowIpList.length; i++) {
                this.AllowIpList[i] = new String(source.AllowIpList[i]);
            }
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new CreateInputSRTSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new CreateInputRTPSettings(source.RTPSettings);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.RTMPPullSettings != null) {
            this.RTMPPullSettings = new CreateInputRTMPPullSettings(source.RTMPPullSettings);
        }
        if (source.RTSPPullSettings != null) {
            this.RTSPPullSettings = new CreateInputRTSPPullSettings(source.RTSPPullSettings);
        }
        if (source.HLSPullSettings != null) {
            this.HLSPullSettings = new CreateInputHLSPullSettings(source.HLSPullSettings);
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
            this.RISTSettings = new CreateInputRISTSettings(source.RISTSettings);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputId", this.InputId);
        this.setParamSimple(map, prefix + "InputName", this.InputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamObj(map, prefix + "ResilientStream.", this.ResilientStream);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamObj(map, prefix + "RISTSettings.", this.RISTSettings);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);

    }
}

