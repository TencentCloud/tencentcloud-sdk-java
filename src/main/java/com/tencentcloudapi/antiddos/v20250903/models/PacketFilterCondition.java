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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PacketFilterCondition extends AbstractModel {

    /**
    * <p>报文匹配的起始位置。</p><p>枚举值：</p><ul><li>ip_header： 从 IP 头部开始匹配。</li><li>transport_header： 从 TCP/UDP 头部开始匹配。</li><li>payload： 从应用层载荷开始匹配。</li></ul>
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * <p>报文匹配内容。</p>
    */
    @SerializedName("Content")
    @Expose
    private PacketMatchContent Content;

    /**
     * Get <p>报文匹配的起始位置。</p><p>枚举值：</p><ul><li>ip_header： 从 IP 头部开始匹配。</li><li>transport_header： 从 TCP/UDP 头部开始匹配。</li><li>payload： 从应用层载荷开始匹配。</li></ul> 
     * @return MatchBegin <p>报文匹配的起始位置。</p><p>枚举值：</p><ul><li>ip_header： 从 IP 头部开始匹配。</li><li>transport_header： 从 TCP/UDP 头部开始匹配。</li><li>payload： 从应用层载荷开始匹配。</li></ul>
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set <p>报文匹配的起始位置。</p><p>枚举值：</p><ul><li>ip_header： 从 IP 头部开始匹配。</li><li>transport_header： 从 TCP/UDP 头部开始匹配。</li><li>payload： 从应用层载荷开始匹配。</li></ul>
     * @param MatchBegin <p>报文匹配的起始位置。</p><p>枚举值：</p><ul><li>ip_header： 从 IP 头部开始匹配。</li><li>transport_header： 从 TCP/UDP 头部开始匹配。</li><li>payload： 从应用层载荷开始匹配。</li></ul>
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get <p>报文匹配内容。</p> 
     * @return Content <p>报文匹配内容。</p>
     */
    public PacketMatchContent getContent() {
        return this.Content;
    }

    /**
     * Set <p>报文匹配内容。</p>
     * @param Content <p>报文匹配内容。</p>
     */
    public void setContent(PacketMatchContent Content) {
        this.Content = Content;
    }

    public PacketFilterCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PacketFilterCondition(PacketFilterCondition source) {
        if (source.MatchBegin != null) {
            this.MatchBegin = new String(source.MatchBegin);
        }
        if (source.Content != null) {
            this.Content = new PacketMatchContent(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamObj(map, prefix + "Content.", this.Content);

    }
}

