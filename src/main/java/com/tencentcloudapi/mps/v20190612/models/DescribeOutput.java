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

public class DescribeOutput extends AbstractModel{

    /**
    * 输出Id。
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * 输出名称。
    */
    @SerializedName("OutputName")
    @Expose
    private String OutputName;

    /**
    * 输出类型。
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * 输出描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 输出协议。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 输出的出口地址信息列表。
    */
    @SerializedName("OutputAddressList")
    @Expose
    private OutputAddress [] OutputAddressList;

    /**
    * 输出的地区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputRegion")
    @Expose
    private String OutputRegion;

    /**
    * 输出的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SRTSettings")
    @Expose
    private DescribeOutputSRTSettings SRTSettings;

    /**
    * 输出的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTPSettings")
    @Expose
    private DescribeOutputRTPSettings RTPSettings;

    /**
    * 输出的RTMP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMPSettings")
    @Expose
    private DescribeOutputRTMPSettings RTMPSettings;

    /**
    * 输出的RTMP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMPPullSettings")
    @Expose
    private DescribeOutputRTMPPullSettings RTMPPullSettings;

    /**
    * CIDR白名单列表。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowIpList")
    @Expose
    private String [] AllowIpList;

    /**
    * 输出的RTSP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTSPPullSettings")
    @Expose
    private DescribeOutputRTSPPullSettings RTSPPullSettings;

    /**
    * 输出的HLS拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HLSPullSettings")
    @Expose
    private DescribeOutputHLSPullSettings HLSPullSettings;

    /**
     * Get 输出Id。 
     * @return OutputId 输出Id。
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set 输出Id。
     * @param OutputId 输出Id。
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    /**
     * Get 输出名称。 
     * @return OutputName 输出名称。
     */
    public String getOutputName() {
        return this.OutputName;
    }

    /**
     * Set 输出名称。
     * @param OutputName 输出名称。
     */
    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    /**
     * Get 输出类型。 
     * @return OutputType 输出类型。
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 输出类型。
     * @param OutputType 输出类型。
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get 输出描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 输出描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 输出描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 输出描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 输出协议。 
     * @return Protocol 输出协议。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 输出协议。
     * @param Protocol 输出协议。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 输出的出口地址信息列表。 
     * @return OutputAddressList 输出的出口地址信息列表。
     */
    public OutputAddress [] getOutputAddressList() {
        return this.OutputAddressList;
    }

    /**
     * Set 输出的出口地址信息列表。
     * @param OutputAddressList 输出的出口地址信息列表。
     */
    public void setOutputAddressList(OutputAddress [] OutputAddressList) {
        this.OutputAddressList = OutputAddressList;
    }

    /**
     * Get 输出的地区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputRegion 输出的地区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputRegion() {
        return this.OutputRegion;
    }

    /**
     * Set 输出的地区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputRegion 输出的地区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputRegion(String OutputRegion) {
        this.OutputRegion = OutputRegion;
    }

    /**
     * Get 输出的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SRTSettings 输出的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputSRTSettings getSRTSettings() {
        return this.SRTSettings;
    }

    /**
     * Set 输出的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SRTSettings 输出的SRT配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSRTSettings(DescribeOutputSRTSettings SRTSettings) {
        this.SRTSettings = SRTSettings;
    }

    /**
     * Get 输出的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTPSettings 输出的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTPSettings getRTPSettings() {
        return this.RTPSettings;
    }

    /**
     * Set 输出的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTPSettings 输出的RTP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTPSettings(DescribeOutputRTPSettings RTPSettings) {
        this.RTPSettings = RTPSettings;
    }

    /**
     * Get 输出的RTMP配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMPSettings 输出的RTMP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTMPSettings getRTMPSettings() {
        return this.RTMPSettings;
    }

    /**
     * Set 输出的RTMP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMPSettings 输出的RTMP配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMPSettings(DescribeOutputRTMPSettings RTMPSettings) {
        this.RTMPSettings = RTMPSettings;
    }

    /**
     * Get 输出的RTMP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMPPullSettings 输出的RTMP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTMPPullSettings getRTMPPullSettings() {
        return this.RTMPPullSettings;
    }

    /**
     * Set 输出的RTMP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMPPullSettings 输出的RTMP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMPPullSettings(DescribeOutputRTMPPullSettings RTMPPullSettings) {
        this.RTMPPullSettings = RTMPPullSettings;
    }

    /**
     * Get CIDR白名单列表。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowIpList CIDR白名单列表。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowIpList() {
        return this.AllowIpList;
    }

    /**
     * Set CIDR白名单列表。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowIpList CIDR白名单列表。
当Protocol为RTMP_PULL有效，为空代表不限制客户端IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowIpList(String [] AllowIpList) {
        this.AllowIpList = AllowIpList;
    }

    /**
     * Get 输出的RTSP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTSPPullSettings 输出的RTSP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTSPPullSettings getRTSPPullSettings() {
        return this.RTSPPullSettings;
    }

    /**
     * Set 输出的RTSP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTSPPullSettings 输出的RTSP拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTSPPullSettings(DescribeOutputRTSPPullSettings RTSPPullSettings) {
        this.RTSPPullSettings = RTSPPullSettings;
    }

    /**
     * Get 输出的HLS拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HLSPullSettings 输出的HLS拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputHLSPullSettings getHLSPullSettings() {
        return this.HLSPullSettings;
    }

    /**
     * Set 输出的HLS拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HLSPullSettings 输出的HLS拉流配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHLSPullSettings(DescribeOutputHLSPullSettings HLSPullSettings) {
        this.HLSPullSettings = HLSPullSettings;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);
        this.setParamSimple(map, prefix + "OutputName", this.OutputName);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
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

    }
}

