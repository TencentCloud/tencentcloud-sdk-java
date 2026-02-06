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

public class PagerDutyRobotNoticeTmpl extends AbstractModel {

    /**
    * 请求体模板 仅支持json
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 请求头 暂时未支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private PagerDutyRobotNoticeTmplHeader [] Headers;

    /**
    * 标题模板
    */
    @SerializedName("TitleTmpl")
    @Expose
    private String TitleTmpl;

    /**
     * Get 请求体模板 仅支持json 
     * @return Body 请求体模板 仅支持json
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 请求体模板 仅支持json
     * @param Body 请求体模板 仅支持json
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 请求头 暂时未支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers 请求头 暂时未支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PagerDutyRobotNoticeTmplHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 请求头 暂时未支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers 请求头 暂时未支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(PagerDutyRobotNoticeTmplHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 标题模板 
     * @return TitleTmpl 标题模板
     */
    public String getTitleTmpl() {
        return this.TitleTmpl;
    }

    /**
     * Set 标题模板
     * @param TitleTmpl 标题模板
     */
    public void setTitleTmpl(String TitleTmpl) {
        this.TitleTmpl = TitleTmpl;
    }

    public PagerDutyRobotNoticeTmpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PagerDutyRobotNoticeTmpl(PagerDutyRobotNoticeTmpl source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Headers != null) {
            this.Headers = new PagerDutyRobotNoticeTmplHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new PagerDutyRobotNoticeTmplHeader(source.Headers[i]);
            }
        }
        if (source.TitleTmpl != null) {
            this.TitleTmpl = new String(source.TitleTmpl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "TitleTmpl", this.TitleTmpl);

    }
}

