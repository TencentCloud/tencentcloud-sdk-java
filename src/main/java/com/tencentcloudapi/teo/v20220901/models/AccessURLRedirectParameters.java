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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessURLRedirectParameters extends AbstractModel {

    /**
    * 状态码，取值为 301、302、303、307、308 之一。
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 目标请求协议，取值有：
<li>http：目标请求协议 HTTP；</li>
<li>https：目标请求协议 HTTPS；</li>
<li>follow：跟随请求。</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 目标 HostName 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private HostName HostName;

    /**
    * 目标路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URLPath")
    @Expose
    private URLPath URLPath;

    /**
    * 携带查询参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryString")
    @Expose
    private AccessURLRedirectQueryString QueryString;

    /**
     * Get 状态码，取值为 301、302、303、307、308 之一。 
     * @return StatusCode 状态码，取值为 301、302、303、307、308 之一。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 状态码，取值为 301、302、303、307、308 之一。
     * @param StatusCode 状态码，取值为 301、302、303、307、308 之一。
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 目标请求协议，取值有：
<li>http：目标请求协议 HTTP；</li>
<li>https：目标请求协议 HTTPS；</li>
<li>follow：跟随请求。</li> 
     * @return Protocol 目标请求协议，取值有：
<li>http：目标请求协议 HTTP；</li>
<li>https：目标请求协议 HTTPS；</li>
<li>follow：跟随请求。</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 目标请求协议，取值有：
<li>http：目标请求协议 HTTP；</li>
<li>https：目标请求协议 HTTPS；</li>
<li>follow：跟随请求。</li>
     * @param Protocol 目标请求协议，取值有：
<li>http：目标请求协议 HTTP；</li>
<li>https：目标请求协议 HTTPS；</li>
<li>follow：跟随请求。</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 目标 HostName 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 目标 HostName 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostName getHostName() {
        return this.HostName;
    }

    /**
     * Set 目标 HostName 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 目标 HostName 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(HostName HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 目标路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URLPath 目标路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public URLPath getURLPath() {
        return this.URLPath;
    }

    /**
     * Set 目标路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param URLPath 目标路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURLPath(URLPath URLPath) {
        this.URLPath = URLPath;
    }

    /**
     * Get 携带查询参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryString 携带查询参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessURLRedirectQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set 携带查询参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryString 携带查询参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryString(AccessURLRedirectQueryString QueryString) {
        this.QueryString = QueryString;
    }

    public AccessURLRedirectParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessURLRedirectParameters(AccessURLRedirectParameters source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HostName != null) {
            this.HostName = new HostName(source.HostName);
        }
        if (source.URLPath != null) {
            this.URLPath = new URLPath(source.URLPath);
        }
        if (source.QueryString != null) {
            this.QueryString = new AccessURLRedirectQueryString(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HostName.", this.HostName);
        this.setParamObj(map, prefix + "URLPath.", this.URLPath);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);

    }
}

