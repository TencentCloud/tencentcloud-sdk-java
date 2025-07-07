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

public class UpstreamRequestParameters extends AbstractModel {

    /**
    * 查询字符串配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryString")
    @Expose
    private UpstreamRequestQueryString QueryString;

    /**
    * Cookie 配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cookie")
    @Expose
    private UpstreamRequestCookie Cookie;

    /**
     * Get 查询字符串配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryString 查询字符串配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamRequestQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set 查询字符串配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryString 查询字符串配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryString(UpstreamRequestQueryString QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Cookie 配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cookie Cookie 配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamRequestCookie getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie 配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cookie Cookie 配置。可选配置项，不填表示不配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCookie(UpstreamRequestCookie Cookie) {
        this.Cookie = Cookie;
    }

    public UpstreamRequestParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRequestParameters(UpstreamRequestParameters source) {
        if (source.QueryString != null) {
            this.QueryString = new UpstreamRequestQueryString(source.QueryString);
        }
        if (source.Cookie != null) {
            this.Cookie = new UpstreamRequestCookie(source.Cookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamObj(map, prefix + "Cookie.", this.Cookie);

    }
}

