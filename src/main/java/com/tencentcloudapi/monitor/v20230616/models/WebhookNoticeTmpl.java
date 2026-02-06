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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookNoticeTmpl extends AbstractModel {

    /**
    * 请求体
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 请求体的类型，非必填、默认为JSON
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BodyContentType")
    @Expose
    private String BodyContentType;

    /**
    * 请求头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private WebhookNoticeTmplHeader [] Headers;

    /**
     * Get 请求体 
     * @return Body 请求体
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 请求体
     * @param Body 请求体
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 请求体的类型，非必填、默认为JSON
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BodyContentType 请求体的类型，非必填、默认为JSON
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBodyContentType() {
        return this.BodyContentType;
    }

    /**
     * Set 请求体的类型，非必填、默认为JSON
注意：此字段可能返回 null，表示取不到有效值。
     * @param BodyContentType 请求体的类型，非必填、默认为JSON
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBodyContentType(String BodyContentType) {
        this.BodyContentType = BodyContentType;
    }

    /**
     * Get 请求头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers 请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebhookNoticeTmplHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 请求头
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers 请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(WebhookNoticeTmplHeader [] Headers) {
        this.Headers = Headers;
    }

    public WebhookNoticeTmpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookNoticeTmpl(WebhookNoticeTmpl source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.BodyContentType != null) {
            this.BodyContentType = new String(source.BodyContentType);
        }
        if (source.Headers != null) {
            this.Headers = new WebhookNoticeTmplHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new WebhookNoticeTmplHeader(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "BodyContentType", this.BodyContentType);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

