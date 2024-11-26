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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CasterOutputInfo extends AbstractModel {

    /**
    * 推流信息Index。
当OutputType为1（表示推流到腾讯云直播）时，该值固定为0。
范围[0,10]。
    */
    @SerializedName("OutputIndex")
    @Expose
    private Long OutputIndex;

    /**
    * rtmp协议推流地址。
最大允许长度512字符。
    */
    @SerializedName("OutputUrl")
    @Expose
    private String OutputUrl;

    /**
    * 描述信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 推流到腾讯云直播源站时，使用的流ID。
仅当OutputType为1时生效。
最大允许128字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStreamId")
    @Expose
    private String OutputStreamId;

    /**
    * 推流类型。
范围[1,2]
1. 推送到腾讯云直播源站。
2. 推送到第三方源站。
    */
    @SerializedName("OutputType")
    @Expose
    private Long OutputType;

    /**
    * 推到腾讯云直播源站时，使用的域名。
最大允许128字符，且域名需属于当前账号绑定的云直播推流域名。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputDomainName")
    @Expose
    private String OutputDomainName;

    /**
    * 推到腾讯云直播源站时，使用的AppName。
最大允许64字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputAppName")
    @Expose
    private String OutputAppName;

    /**
    * 推到腾讯云直播源站时需要添加的推流参数。
最大允许长度256字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputParam")
    @Expose
    private String OutputParam;

    /**
     * Get 推流信息Index。
当OutputType为1（表示推流到腾讯云直播）时，该值固定为0。
范围[0,10]。 
     * @return OutputIndex 推流信息Index。
当OutputType为1（表示推流到腾讯云直播）时，该值固定为0。
范围[0,10]。
     */
    public Long getOutputIndex() {
        return this.OutputIndex;
    }

    /**
     * Set 推流信息Index。
当OutputType为1（表示推流到腾讯云直播）时，该值固定为0。
范围[0,10]。
     * @param OutputIndex 推流信息Index。
当OutputType为1（表示推流到腾讯云直播）时，该值固定为0。
范围[0,10]。
     */
    public void setOutputIndex(Long OutputIndex) {
        this.OutputIndex = OutputIndex;
    }

    /**
     * Get rtmp协议推流地址。
最大允许长度512字符。 
     * @return OutputUrl rtmp协议推流地址。
最大允许长度512字符。
     */
    public String getOutputUrl() {
        return this.OutputUrl;
    }

    /**
     * Set rtmp协议推流地址。
最大允许长度512字符。
     * @param OutputUrl rtmp协议推流地址。
最大允许长度512字符。
     */
    public void setOutputUrl(String OutputUrl) {
        this.OutputUrl = OutputUrl;
    }

    /**
     * Get 描述信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 推流到腾讯云直播源站时，使用的流ID。
仅当OutputType为1时生效。
最大允许128字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStreamId 推流到腾讯云直播源站时，使用的流ID。
仅当OutputType为1时生效。
最大允许128字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputStreamId() {
        return this.OutputStreamId;
    }

    /**
     * Set 推流到腾讯云直播源站时，使用的流ID。
仅当OutputType为1时生效。
最大允许128字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStreamId 推流到腾讯云直播源站时，使用的流ID。
仅当OutputType为1时生效。
最大允许128字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStreamId(String OutputStreamId) {
        this.OutputStreamId = OutputStreamId;
    }

    /**
     * Get 推流类型。
范围[1,2]
1. 推送到腾讯云直播源站。
2. 推送到第三方源站。 
     * @return OutputType 推流类型。
范围[1,2]
1. 推送到腾讯云直播源站。
2. 推送到第三方源站。
     */
    public Long getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 推流类型。
范围[1,2]
1. 推送到腾讯云直播源站。
2. 推送到第三方源站。
     * @param OutputType 推流类型。
范围[1,2]
1. 推送到腾讯云直播源站。
2. 推送到第三方源站。
     */
    public void setOutputType(Long OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get 推到腾讯云直播源站时，使用的域名。
最大允许128字符，且域名需属于当前账号绑定的云直播推流域名。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputDomainName 推到腾讯云直播源站时，使用的域名。
最大允许128字符，且域名需属于当前账号绑定的云直播推流域名。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputDomainName() {
        return this.OutputDomainName;
    }

    /**
     * Set 推到腾讯云直播源站时，使用的域名。
最大允许128字符，且域名需属于当前账号绑定的云直播推流域名。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputDomainName 推到腾讯云直播源站时，使用的域名。
最大允许128字符，且域名需属于当前账号绑定的云直播推流域名。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputDomainName(String OutputDomainName) {
        this.OutputDomainName = OutputDomainName;
    }

    /**
     * Get 推到腾讯云直播源站时，使用的AppName。
最大允许64字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputAppName 推到腾讯云直播源站时，使用的AppName。
最大允许64字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputAppName() {
        return this.OutputAppName;
    }

    /**
     * Set 推到腾讯云直播源站时，使用的AppName。
最大允许64字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputAppName 推到腾讯云直播源站时，使用的AppName。
最大允许64字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputAppName(String OutputAppName) {
        this.OutputAppName = OutputAppName;
    }

    /**
     * Get 推到腾讯云直播源站时需要添加的推流参数。
最大允许长度256字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputParam 推到腾讯云直播源站时需要添加的推流参数。
最大允许长度256字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputParam() {
        return this.OutputParam;
    }

    /**
     * Set 推到腾讯云直播源站时需要添加的推流参数。
最大允许长度256字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputParam 推到腾讯云直播源站时需要添加的推流参数。
最大允许长度256字符。
仅在OutputType为1时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputParam(String OutputParam) {
        this.OutputParam = OutputParam;
    }

    public CasterOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterOutputInfo(CasterOutputInfo source) {
        if (source.OutputIndex != null) {
            this.OutputIndex = new Long(source.OutputIndex);
        }
        if (source.OutputUrl != null) {
            this.OutputUrl = new String(source.OutputUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OutputStreamId != null) {
            this.OutputStreamId = new String(source.OutputStreamId);
        }
        if (source.OutputType != null) {
            this.OutputType = new Long(source.OutputType);
        }
        if (source.OutputDomainName != null) {
            this.OutputDomainName = new String(source.OutputDomainName);
        }
        if (source.OutputAppName != null) {
            this.OutputAppName = new String(source.OutputAppName);
        }
        if (source.OutputParam != null) {
            this.OutputParam = new String(source.OutputParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputIndex", this.OutputIndex);
        this.setParamSimple(map, prefix + "OutputUrl", this.OutputUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OutputStreamId", this.OutputStreamId);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "OutputDomainName", this.OutputDomainName);
        this.setParamSimple(map, prefix + "OutputAppName", this.OutputAppName);
        this.setParamSimple(map, prefix + "OutputParam", this.OutputParam);

    }
}

