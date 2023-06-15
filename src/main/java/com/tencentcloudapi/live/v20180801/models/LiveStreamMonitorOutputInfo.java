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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamMonitorOutputInfo extends AbstractModel{

    /**
    * 监播任务输出流宽度像素。范围[1,1920]。建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStreamWidth")
    @Expose
    private Long OutputStreamWidth;

    /**
    * 监播任务输出流长度像素。范围[1,1080]，建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStreamHeight")
    @Expose
    private Long OutputStreamHeight;

    /**
    * 监播任务输出流名称。
不填时，系统会自动生成。
256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStreamName")
    @Expose
    private String OutputStreamName;

    /**
    * 监播任务播放域名。128字节以内，只允许填处于启用状态的播放域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputDomain")
    @Expose
    private String OutputDomain;

    /**
    * 监播任务播放路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputApp")
    @Expose
    private String OutputApp;

    /**
     * Get 监播任务输出流宽度像素。范围[1,1920]。建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStreamWidth 监播任务输出流宽度像素。范围[1,1920]。建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputStreamWidth() {
        return this.OutputStreamWidth;
    }

    /**
     * Set 监播任务输出流宽度像素。范围[1,1920]。建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStreamWidth 监播任务输出流宽度像素。范围[1,1920]。建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStreamWidth(Long OutputStreamWidth) {
        this.OutputStreamWidth = OutputStreamWidth;
    }

    /**
     * Get 监播任务输出流长度像素。范围[1,1080]，建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStreamHeight 监播任务输出流长度像素。范围[1,1080]，建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputStreamHeight() {
        return this.OutputStreamHeight;
    }

    /**
     * Set 监播任务输出流长度像素。范围[1,1080]，建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStreamHeight 监播任务输出流长度像素。范围[1,1080]，建议至少大于100像素。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStreamHeight(Long OutputStreamHeight) {
        this.OutputStreamHeight = OutputStreamHeight;
    }

    /**
     * Get 监播任务输出流名称。
不填时，系统会自动生成。
256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStreamName 监播任务输出流名称。
不填时，系统会自动生成。
256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputStreamName() {
        return this.OutputStreamName;
    }

    /**
     * Set 监播任务输出流名称。
不填时，系统会自动生成。
256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStreamName 监播任务输出流名称。
不填时，系统会自动生成。
256字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStreamName(String OutputStreamName) {
        this.OutputStreamName = OutputStreamName;
    }

    /**
     * Get 监播任务播放域名。128字节以内，只允许填处于启用状态的播放域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputDomain 监播任务播放域名。128字节以内，只允许填处于启用状态的播放域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputDomain() {
        return this.OutputDomain;
    }

    /**
     * Set 监播任务播放域名。128字节以内，只允许填处于启用状态的播放域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputDomain 监播任务播放域名。128字节以内，只允许填处于启用状态的播放域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputDomain(String OutputDomain) {
        this.OutputDomain = OutputDomain;
    }

    /**
     * Get 监播任务播放路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputApp 监播任务播放路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputApp() {
        return this.OutputApp;
    }

    /**
     * Set 监播任务播放路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputApp 监播任务播放路径。32字节以内，只允许包含字母、数字、‘-’，‘_’，'.'字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputApp(String OutputApp) {
        this.OutputApp = OutputApp;
    }

    public LiveStreamMonitorOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamMonitorOutputInfo(LiveStreamMonitorOutputInfo source) {
        if (source.OutputStreamWidth != null) {
            this.OutputStreamWidth = new Long(source.OutputStreamWidth);
        }
        if (source.OutputStreamHeight != null) {
            this.OutputStreamHeight = new Long(source.OutputStreamHeight);
        }
        if (source.OutputStreamName != null) {
            this.OutputStreamName = new String(source.OutputStreamName);
        }
        if (source.OutputDomain != null) {
            this.OutputDomain = new String(source.OutputDomain);
        }
        if (source.OutputApp != null) {
            this.OutputApp = new String(source.OutputApp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputStreamWidth", this.OutputStreamWidth);
        this.setParamSimple(map, prefix + "OutputStreamHeight", this.OutputStreamHeight);
        this.setParamSimple(map, prefix + "OutputStreamName", this.OutputStreamName);
        this.setParamSimple(map, prefix + "OutputDomain", this.OutputDomain);
        this.setParamSimple(map, prefix + "OutputApp", this.OutputApp);

    }
}

