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

public class ModifyOutputInfo extends AbstractModel{

    /**
    * 需要修改的Output的Id。
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * 输出的名称。
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * 输出的描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 输出的转推协议，支持SRT|RTP|RTMP。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 转推SRT的配置。
    */
    @SerializedName("SRTSettings")
    @Expose
    private CreateOutputSRTSettings SRTSettings;

    /**
    * 转推RTP的配置。
    */
    @SerializedName("RTPSettings")
    @Expose
    private CreateOutputInfoRTPSettings RTPSettings;

    /**
    * 转推RTMP的配置。
    */
    @SerializedName("RTMPSettings")
    @Expose
    private CreateOutputRTMPSettings RTMPSettings;

    /**
    * IP白名单列表，格式为CIDR，如0.0.0.0/0。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
     * Get 需要修改的Output的Id。 
     * @return OutputId 需要修改的Output的Id。
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set 需要修改的Output的Id。
     * @param OutputId 需要修改的Output的Id。
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

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
     * Get 输出的描述。 
     * @return Description 输出的描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 输出的描述。
     * @param Description 输出的描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 输出的转推协议，支持SRT|RTP|RTMP。 
     * @return Protocol 输出的转推协议，支持SRT|RTP|RTMP。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 输出的转推协议，支持SRT|RTP|RTMP。
     * @param Protocol 输出的转推协议，支持SRT|RTP|RTMP。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 转推SRT的配置。 
     * @return SRTSettings 转推SRT的配置。
     */
    public CreateOutputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set 转推SRT的配置。
     * @param SRTSettings 转推SRT的配置。
     */
    public void setSRTSettings(CreateOutputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get 转推RTP的配置。 
     * @return RTPSettings 转推RTP的配置。
     */
    public CreateOutputInfoRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set 转推RTP的配置。
     * @param RTPSettings 转推RTP的配置。
     */
    public void setRTPSettings(CreateOutputInfoRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get 转推RTMP的配置。 
     * @return RTMPSettings 转推RTMP的配置。
     */
    public CreateOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set 转推RTMP的配置。
     * @param RTMPSettings 转推RTMP的配置。
     */
    public void setRTMPSettings(CreateOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
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

    public ModifyOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOutputInfo(ModifyOutputInfo source) {
        if (source.OutputId != null) {
            this.OutputId = new String(source.OutputId);
        }
        if (source.OutputName != null) {
            this.OutputName = new String(source.OutputName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SRTSettings != null) {
            this.SRTSettings = new CreateOutputSRTSettings(source.SRTSettings);
        }
        if (source.RTPSettings != null) {
            this.RTPSettings = new CreateOutputInfoRTPSettings(source.RTPSettings);
        }
        if (source.RTMPSettings != null) {
            this.RTMPSettings = new CreateOutputRTMPSettings(source.RTMPSettings);
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
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "SRTSettings.", this.SRTSettings);
        this.setParamObj(map, prefix + "RTPSettings.", this.RTPSettings);
        this.setParamObj(map, prefix + "RTMPSettings.", this.RTMPSettings);
        this.setParamArraySimple(map, prefix + "AllowIpList.", this.AllowIpList);

    }
}

