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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebCallback extends AbstractModel {

    /**
    * 回调地址。最大支持1024个字节数。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 回调的类型。可选值：
- WeCom
- Http
- DingTalk
- Lark
    */
    @SerializedName("CallbackType")
    @Expose
    private String CallbackType;

    /**
    * 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 请求头。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * 请求内容。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 序号。
- 入参无效。
- 出参有效。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * 集成配置ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebCallbackId")
    @Expose
    private String WebCallbackId;

    /**
     * Get 回调地址。最大支持1024个字节数。 
     * @return Url 回调地址。最大支持1024个字节数。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 回调地址。最大支持1024个字节数。
     * @param Url 回调地址。最大支持1024个字节数。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 回调的类型。可选值：
- WeCom
- Http
- DingTalk
- Lark 
     * @return CallbackType 回调的类型。可选值：
- WeCom
- Http
- DingTalk
- Lark
     */
    public String getCallbackType() {
        return this.CallbackType;
    }

    /**
     * Set 回调的类型。可选值：
- WeCom
- Http
- DingTalk
- Lark
     * @param CallbackType 回调的类型。可选值：
- WeCom
- Http
- DingTalk
- Lark
     */
    public void setCallbackType(String CallbackType) {
        this.CallbackType = CallbackType;
    }

    /**
     * Get 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 请求头。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers 请求头。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 请求头。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers 请求头。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 请求内容。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Body 请求内容。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 请求内容。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Body 请求内容。
注意：该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 序号。
- 入参无效。
- 出参有效。 
     * @return Index 序号。
- 入参无效。
- 出参有效。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 序号。
- 入参无效。
- 出参有效。
     * @param Index 序号。
- 入参无效。
- 出参有效。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeContentId 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeContentId 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get 集成配置ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebCallbackId 集成配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebCallbackId() {
        return this.WebCallbackId;
    }

    /**
     * Set 集成配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebCallbackId 集成配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebCallbackId(String WebCallbackId) {
        this.WebCallbackId = WebCallbackId;
    }

    public WebCallback() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebCallback(WebCallback source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CallbackType != null) {
            this.CallbackType = new String(source.CallbackType);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
        if (source.WebCallbackId != null) {
            this.WebCallbackId = new String(source.WebCallbackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CallbackType", this.CallbackType);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "WebCallbackId", this.WebCallbackId);

    }
}

