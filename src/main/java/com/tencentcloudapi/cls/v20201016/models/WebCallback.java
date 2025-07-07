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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebCallback extends AbstractModel {

    /**
    * 回调的类型。可选值：
- Http
- WeCom
- DingTalk
- Lark
    */
    @SerializedName("CallbackType")
    @Expose
    private String CallbackType;

    /**
    * 回调地址，最大支持1024个字节。
也可使用WebCallbackId引用集成配置中的URL，此时该字段请填写为空字符串。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 集成配置ID。
    */
    @SerializedName("WebCallbackId")
    @Expose
    private String WebCallbackId;

    /**
    * 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选，其它回调方式无需填写。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 通知内容模板ID，使用Default-zh引用默认模板（中文），使用Default-en引用DefaultTemplate(English)。
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * 提醒类型。

0：不提醒；1：指定人；2：所有人
    */
    @SerializedName("RemindType")
    @Expose
    private Long RemindType;

    /**
    * 电话列表。
    */
    @SerializedName("Mobiles")
    @Expose
    private String [] Mobiles;

    /**
    * 用户ID列表。
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 该参数已废弃，请使用NoticeContentId。
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * 该参数已废弃，请使用NoticeContentId。
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
     * Get 回调的类型。可选值：
- Http
- WeCom
- DingTalk
- Lark 
     * @return CallbackType 回调的类型。可选值：
- Http
- WeCom
- DingTalk
- Lark
     */
    public String getCallbackType() {
        return this.CallbackType;
    }

    /**
     * Set 回调的类型。可选值：
- Http
- WeCom
- DingTalk
- Lark
     * @param CallbackType 回调的类型。可选值：
- Http
- WeCom
- DingTalk
- Lark
     */
    public void setCallbackType(String CallbackType) {
        this.CallbackType = CallbackType;
    }

    /**
     * Get 回调地址，最大支持1024个字节。
也可使用WebCallbackId引用集成配置中的URL，此时该字段请填写为空字符串。 
     * @return Url 回调地址，最大支持1024个字节。
也可使用WebCallbackId引用集成配置中的URL，此时该字段请填写为空字符串。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 回调地址，最大支持1024个字节。
也可使用WebCallbackId引用集成配置中的URL，此时该字段请填写为空字符串。
     * @param Url 回调地址，最大支持1024个字节。
也可使用WebCallbackId引用集成配置中的URL，此时该字段请填写为空字符串。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 集成配置ID。 
     * @return WebCallbackId 集成配置ID。
     */
    public String getWebCallbackId() {
        return this.WebCallbackId;
    }

    /**
     * Set 集成配置ID。
     * @param WebCallbackId 集成配置ID。
     */
    public void setWebCallbackId(String WebCallbackId) {
        this.WebCallbackId = WebCallbackId;
    }

    /**
     * Get 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选，其它回调方式无需填写。 
     * @return Method 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选，其它回调方式无需填写。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选，其它回调方式无需填写。
     * @param Method 回调方法。可选值：
- POST（默认值）
- PUT

注意：
- 参数CallbackType为Http时为必选，其它回调方式无需填写。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 通知内容模板ID，使用Default-zh引用默认模板（中文），使用Default-en引用DefaultTemplate(English)。 
     * @return NoticeContentId 通知内容模板ID，使用Default-zh引用默认模板（中文），使用Default-en引用DefaultTemplate(English)。
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set 通知内容模板ID，使用Default-zh引用默认模板（中文），使用Default-en引用DefaultTemplate(English)。
     * @param NoticeContentId 通知内容模板ID，使用Default-zh引用默认模板（中文），使用Default-en引用DefaultTemplate(English)。
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get 提醒类型。

0：不提醒；1：指定人；2：所有人 
     * @return RemindType 提醒类型。

0：不提醒；1：指定人；2：所有人
     */
    public Long getRemindType() {
        return this.RemindType;
    }

    /**
     * Set 提醒类型。

0：不提醒；1：指定人；2：所有人
     * @param RemindType 提醒类型。

0：不提醒；1：指定人；2：所有人
     */
    public void setRemindType(Long RemindType) {
        this.RemindType = RemindType;
    }

    /**
     * Get 电话列表。 
     * @return Mobiles 电话列表。
     */
    public String [] getMobiles() {
        return this.Mobiles;
    }

    /**
     * Set 电话列表。
     * @param Mobiles 电话列表。
     */
    public void setMobiles(String [] Mobiles) {
        this.Mobiles = Mobiles;
    }

    /**
     * Get 用户ID列表。 
     * @return UserIds 用户ID列表。
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 用户ID列表。
     * @param UserIds 用户ID列表。
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 该参数已废弃，请使用NoticeContentId。 
     * @return Headers 该参数已废弃，请使用NoticeContentId。
     * @deprecated
     */
    @Deprecated
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 该参数已废弃，请使用NoticeContentId。
     * @param Headers 该参数已废弃，请使用NoticeContentId。
     * @deprecated
     */
    @Deprecated
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Body 该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Body 该参数已废弃，请使用NoticeContentId。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
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

    public WebCallback() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebCallback(WebCallback source) {
        if (source.CallbackType != null) {
            this.CallbackType = new String(source.CallbackType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.WebCallbackId != null) {
            this.WebCallbackId = new String(source.WebCallbackId);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
        if (source.RemindType != null) {
            this.RemindType = new Long(source.RemindType);
        }
        if (source.Mobiles != null) {
            this.Mobiles = new String[source.Mobiles.length];
            for (int i = 0; i < source.Mobiles.length; i++) {
                this.Mobiles[i] = new String(source.Mobiles[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackType", this.CallbackType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "WebCallbackId", this.WebCallbackId);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "RemindType", this.RemindType);
        this.setParamArraySimple(map, prefix + "Mobiles.", this.Mobiles);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

