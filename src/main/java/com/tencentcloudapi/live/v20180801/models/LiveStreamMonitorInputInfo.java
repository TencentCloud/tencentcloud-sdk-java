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

public class LiveStreamMonitorInputInfo extends AbstractModel {

    /**
    * 待监播的输入流名称。256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputStreamName")
    @Expose
    private String InputStreamName;

    /**
    * 待监播的输入流推流域名。128字节以内，只允许填处于启用状态的推流域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputDomain")
    @Expose
    private String InputDomain;

    /**
    * 待监播的输入流推流路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputApp")
    @Expose
    private String InputApp;

    /**
    * 待监播的输入流推流url。一般场景下，无需该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * 描述。256字节以内。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 导播台输入源索引（10000 pvw， 10001 pgm， 其余代表输入下标）
    */
    @SerializedName("CasterInputIndex")
    @Expose
    private Long CasterInputIndex;

    /**
    * 该输入源是否正在监播
    */
    @SerializedName("NeedMonitor")
    @Expose
    private Boolean NeedMonitor;

    /**
    * 导播台pvw pgm的cdn流id
    */
    @SerializedName("CdnStreamId")
    @Expose
    private String CdnStreamId;

    /**
     * Get 待监播的输入流名称。256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputStreamName 待监播的输入流名称。256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputStreamName() {
        return this.InputStreamName;
    }

    /**
     * Set 待监播的输入流名称。256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputStreamName 待监播的输入流名称。256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputStreamName(String InputStreamName) {
        this.InputStreamName = InputStreamName;
    }

    /**
     * Get 待监播的输入流推流域名。128字节以内，只允许填处于启用状态的推流域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputDomain 待监播的输入流推流域名。128字节以内，只允许填处于启用状态的推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputDomain() {
        return this.InputDomain;
    }

    /**
     * Set 待监播的输入流推流域名。128字节以内，只允许填处于启用状态的推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputDomain 待监播的输入流推流域名。128字节以内，只允许填处于启用状态的推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputDomain(String InputDomain) {
        this.InputDomain = InputDomain;
    }

    /**
     * Get 待监播的输入流推流路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputApp 待监播的输入流推流路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputApp() {
        return this.InputApp;
    }

    /**
     * Set 待监播的输入流推流路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputApp 待监播的输入流推流路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputApp(String InputApp) {
        this.InputApp = InputApp;
    }

    /**
     * Get 待监播的输入流推流url。一般场景下，无需该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputUrl 待监播的输入流推流url。一般场景下，无需该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set 待监播的输入流推流url。一般场景下，无需该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputUrl 待监播的输入流推流url。一般场景下，无需该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get 描述。256字节以内。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述。256字节以内。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。256字节以内。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述。256字节以内。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 导播台输入源索引（10000 pvw， 10001 pgm， 其余代表输入下标） 
     * @return CasterInputIndex 导播台输入源索引（10000 pvw， 10001 pgm， 其余代表输入下标）
     */
    public Long getCasterInputIndex() {
        return this.CasterInputIndex;
    }

    /**
     * Set 导播台输入源索引（10000 pvw， 10001 pgm， 其余代表输入下标）
     * @param CasterInputIndex 导播台输入源索引（10000 pvw， 10001 pgm， 其余代表输入下标）
     */
    public void setCasterInputIndex(Long CasterInputIndex) {
        this.CasterInputIndex = CasterInputIndex;
    }

    /**
     * Get 该输入源是否正在监播 
     * @return NeedMonitor 该输入源是否正在监播
     */
    public Boolean getNeedMonitor() {
        return this.NeedMonitor;
    }

    /**
     * Set 该输入源是否正在监播
     * @param NeedMonitor 该输入源是否正在监播
     */
    public void setNeedMonitor(Boolean NeedMonitor) {
        this.NeedMonitor = NeedMonitor;
    }

    /**
     * Get 导播台pvw pgm的cdn流id 
     * @return CdnStreamId 导播台pvw pgm的cdn流id
     */
    public String getCdnStreamId() {
        return this.CdnStreamId;
    }

    /**
     * Set 导播台pvw pgm的cdn流id
     * @param CdnStreamId 导播台pvw pgm的cdn流id
     */
    public void setCdnStreamId(String CdnStreamId) {
        this.CdnStreamId = CdnStreamId;
    }

    public LiveStreamMonitorInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamMonitorInputInfo(LiveStreamMonitorInputInfo source) {
        if (source.InputStreamName != null) {
            this.InputStreamName = new String(source.InputStreamName);
        }
        if (source.InputDomain != null) {
            this.InputDomain = new String(source.InputDomain);
        }
        if (source.InputApp != null) {
            this.InputApp = new String(source.InputApp);
        }
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CasterInputIndex != null) {
            this.CasterInputIndex = new Long(source.CasterInputIndex);
        }
        if (source.NeedMonitor != null) {
            this.NeedMonitor = new Boolean(source.NeedMonitor);
        }
        if (source.CdnStreamId != null) {
            this.CdnStreamId = new String(source.CdnStreamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputStreamName", this.InputStreamName);
        this.setParamSimple(map, prefix + "InputDomain", this.InputDomain);
        this.setParamSimple(map, prefix + "InputApp", this.InputApp);
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CasterInputIndex", this.CasterInputIndex);
        this.setParamSimple(map, prefix + "NeedMonitor", this.NeedMonitor);
        this.setParamSimple(map, prefix + "CdnStreamId", this.CdnStreamId);

    }
}

