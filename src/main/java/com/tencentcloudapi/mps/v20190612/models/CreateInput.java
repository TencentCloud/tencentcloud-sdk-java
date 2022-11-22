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

public class CreateInput extends AbstractModel{

    /**
    * 输入名称，可填大小写、数字和下划线，长度为[1, 32]。
    */
    @SerializedName("InputName")
    @Expose
    private String InputName;

    /**
    * 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 输入描述，长度为[0, 255]。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 输入的IP白名单，格式为CIDR。
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * 输入的SRT配置信息。
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateInputSRTSettings SRTSettings;

    /**
    * 输入的RTP配置信息。
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateInputRTPSettings RTPSettings;

    /**
    * 输入的主备开关，可选[OPEN|CLOSE]，默认为CLOSE。
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * 输入的RTMP_PULL配置信息。
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private CreateInputRTMPPullSettings RTMPPullSettings;

    /**
    * 输入的RTSP_PULL配置信息。
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private CreateInputRTSPPullSettings RTSPPullSettings;

    /**
    * 输入的HLS_PULL配置信息。
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
     * Get 输入名称，可填大小写、数字和下划线，长度为[1, 32]。 
     * @return InputName 输入名称，可填大小写、数字和下划线，长度为[1, 32]。
     */
    public String getInputName() {
        return this.InputName;
    }

    /**
     * Set 输入名称，可填大小写、数字和下划线，长度为[1, 32]。
     * @param InputName 输入名称，可填大小写、数字和下划线，长度为[1, 32]。
     */
    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    /**
     * Get 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL]。 
     * @return Protocol 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
     * @param Protocol 输入的协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 输入描述，长度为[0, 255]。 
     * @return Description 输入描述，长度为[0, 255]。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 输入描述，长度为[0, 255]。
     * @param Description 输入描述，长度为[0, 255]。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 输入的IP白名单，格式为CIDR。 
     * @return AllowIpList 输入的IP白名单，格式为CIDR。
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set 输入的IP白名单，格式为CIDR。
     * @param AllowIpList 输入的IP白名单，格式为CIDR。
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get 输入的SRT配置信息。 
     * @return SRTSettings 输入的SRT配置信息。
     */
    public CreateInputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set 输入的SRT配置信息。
     * @param SRTSettings 输入的SRT配置信息。
     */
    public void setSRTSettings(CreateInputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get 输入的RTP配置信息。 
     * @return RTPSettings 输入的RTP配置信息。
     */
    public CreateInputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set 输入的RTP配置信息。
     * @param RTPSettings 输入的RTP配置信息。
     */
    public void setRTPSettings(CreateInputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get 输入的主备开关，可选[OPEN|CLOSE]，默认为CLOSE。 
     * @return FailOver 输入的主备开关，可选[OPEN|CLOSE]，默认为CLOSE。
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 输入的主备开关，可选[OPEN|CLOSE]，默认为CLOSE。
     * @param FailOver 输入的主备开关，可选[OPEN|CLOSE]，默认为CLOSE。
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 输入的RTMP_PULL配置信息。 
     * @return RTMPPullSettings 输入的RTMP_PULL配置信息。
     */
    public CreateInputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set 输入的RTMP_PULL配置信息。
     * @param RTMPPullSettings 输入的RTMP_PULL配置信息。
     */
    public void setRTMPPullSettings(CreateInputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get 输入的RTSP_PULL配置信息。 
     * @return RTSPPullSettings 输入的RTSP_PULL配置信息。
     */
    public CreateInputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set 输入的RTSP_PULL配置信息。
     * @param RTSPPullSettings 输入的RTSP_PULL配置信息。
     */
    public void setRTSPPullSettings(CreateInputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get 输入的HLS_PULL配置信息。 
     * @return HLSPullSettings 输入的HLS_PULL配置信息。
     */
    public CreateInputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set 输入的HLS_PULL配置信息。
     * @param HLSPullSettings 输入的HLS_PULL配置信息。
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

    public CreateInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInput(CreateInput source) {
        if (source.InputName != null) {
            this.InputName = new String(source.InputName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputName", this.InputName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamObj(map, prefix + "RTMPPullSettings.", this.RTMPPullSettings);
        this.setParamObj(map, prefix + "RTSPPullSettings.", this.RTSPPullSettings);
        this.setParamObj(map, prefix + "HLSPullSettings.", this.HLSPullSettings);
        this.setParamObj(map, prefix + "ResilientStream.", this.ResilientStream);

    }
}

