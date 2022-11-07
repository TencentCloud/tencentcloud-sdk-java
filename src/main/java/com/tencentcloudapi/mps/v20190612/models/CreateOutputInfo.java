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

public class CreateOutputInfo extends AbstractModel{

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
    * 输出协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
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
     * Get 输出协议，可选[SRT|RTP|RTMP|RTMP_PULL]。 
     * @return Protocol 输出协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 输出协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
     * @param Protocol 输出协议，可选[SRT|RTP|RTMP|RTMP_PULL]。
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "OutputRegion", this.OutputRegion);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);

    }
}

