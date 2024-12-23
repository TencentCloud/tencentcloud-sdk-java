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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteWrite extends AbstractModel {

    /**
    * 多写url
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * RelabelConfig
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URLRelabelConfig")
    @Expose
    private String URLRelabelConfig;

    /**
    * 鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicAuth")
    @Expose
    private BasicAuth BasicAuth;

    /**
    * 最大block
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxBlockSize")
    @Expose
    private String MaxBlockSize;

    /**
    * Label
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * HTTP 额外添加的头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private RemoteWriteHeader [] Headers;

    /**
     * Get 多写url 
     * @return URL 多写url
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 多写url
     * @param URL 多写url
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get RelabelConfig
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URLRelabelConfig RelabelConfig
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getURLRelabelConfig() {
        return this.URLRelabelConfig;
    }

    /**
     * Set RelabelConfig
注意：此字段可能返回 null，表示取不到有效值。
     * @param URLRelabelConfig RelabelConfig
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURLRelabelConfig(String URLRelabelConfig) {
        this.URLRelabelConfig = URLRelabelConfig;
    }

    /**
     * Get 鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicAuth 鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicAuth getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set 鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicAuth 鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicAuth(BasicAuth BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get 最大block
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxBlockSize 最大block
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxBlockSize() {
        return this.MaxBlockSize;
    }

    /**
     * Set 最大block
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxBlockSize 最大block
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxBlockSize(String MaxBlockSize) {
        this.MaxBlockSize = MaxBlockSize;
    }

    /**
     * Get Label
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label Label
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Label
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label Label
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get HTTP 额外添加的头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers HTTP 额外添加的头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoteWriteHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set HTTP 额外添加的头
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers HTTP 额外添加的头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(RemoteWriteHeader [] Headers) {
        this.Headers = Headers;
    }

    public RemoteWrite() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteWrite(RemoteWrite source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.URLRelabelConfig != null) {
            this.URLRelabelConfig = new String(source.URLRelabelConfig);
        }
        if (source.BasicAuth != null) {
            this.BasicAuth = new BasicAuth(source.BasicAuth);
        }
        if (source.MaxBlockSize != null) {
            this.MaxBlockSize = new String(source.MaxBlockSize);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Headers != null) {
            this.Headers = new RemoteWriteHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new RemoteWriteHeader(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "URLRelabelConfig", this.URLRelabelConfig);
        this.setParamObj(map, prefix + "BasicAuth.", this.BasicAuth);
        this.setParamSimple(map, prefix + "MaxBlockSize", this.MaxBlockSize);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

