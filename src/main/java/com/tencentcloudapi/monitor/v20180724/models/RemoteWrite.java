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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteWrite extends AbstractModel {

    /**
    * <p>多写url</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>RelabelConfig</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URLRelabelConfig")
    @Expose
    private String URLRelabelConfig;

    /**
    * <p>鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicAuth")
    @Expose
    private BasicAuth BasicAuth;

    /**
    * <p>最大block</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxBlockSize")
    @Expose
    private String MaxBlockSize;

    /**
    * <p>Label</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>HTTP 额外添加的头</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private RemoteWriteHeader [] Headers;

    /**
    * <p>数据多写类型:<br>1- 只多写采集指标<br>2- 只多写预聚合指标<br>3- 同时多写采集和预聚合指标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteWriteType")
    @Expose
    private Long RemoteWriteType;

    /**
     * Get <p>多写url</p> 
     * @return URL <p>多写url</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>多写url</p>
     * @param URL <p>多写url</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>RelabelConfig</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URLRelabelConfig <p>RelabelConfig</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getURLRelabelConfig() {
        return this.URLRelabelConfig;
    }

    /**
     * Set <p>RelabelConfig</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param URLRelabelConfig <p>RelabelConfig</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURLRelabelConfig(String URLRelabelConfig) {
        this.URLRelabelConfig = URLRelabelConfig;
    }

    /**
     * Get <p>鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicAuth <p>鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicAuth getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set <p>鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicAuth <p>鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicAuth(BasicAuth BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get <p>最大block</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxBlockSize <p>最大block</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getMaxBlockSize() {
        return this.MaxBlockSize;
    }

    /**
     * Set <p>最大block</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxBlockSize <p>最大block</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setMaxBlockSize(String MaxBlockSize) {
        this.MaxBlockSize = MaxBlockSize;
    }

    /**
     * Get <p>Label</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label <p>Label</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Label</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label <p>Label</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>HTTP 额外添加的头</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers <p>HTTP 额外添加的头</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoteWriteHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>HTTP 额外添加的头</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers <p>HTTP 额外添加的头</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(RemoteWriteHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>数据多写类型:<br>1- 只多写采集指标<br>2- 只多写预聚合指标<br>3- 同时多写采集和预聚合指标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteWriteType <p>数据多写类型:<br>1- 只多写采集指标<br>2- 只多写预聚合指标<br>3- 同时多写采集和预聚合指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemoteWriteType() {
        return this.RemoteWriteType;
    }

    /**
     * Set <p>数据多写类型:<br>1- 只多写采集指标<br>2- 只多写预聚合指标<br>3- 同时多写采集和预聚合指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteWriteType <p>数据多写类型:<br>1- 只多写采集指标<br>2- 只多写预聚合指标<br>3- 同时多写采集和预聚合指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteWriteType(Long RemoteWriteType) {
        this.RemoteWriteType = RemoteWriteType;
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
        if (source.RemoteWriteType != null) {
            this.RemoteWriteType = new Long(source.RemoteWriteType);
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
        this.setParamSimple(map, prefix + "RemoteWriteType", this.RemoteWriteType);

    }
}

