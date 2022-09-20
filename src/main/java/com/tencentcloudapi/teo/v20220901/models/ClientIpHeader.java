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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientIpHeader extends AbstractModel{

    /**
    * 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 回源时，存放客户端IP的请求头名称。
为空则使用默认值：X-Forwarded-IP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
     * Get 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 回源时，存放客户端IP的请求头名称。
为空则使用默认值：X-Forwarded-IP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderName 回源时，存放客户端IP的请求头名称。
为空则使用默认值：X-Forwarded-IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set 回源时，存放客户端IP的请求头名称。
为空则使用默认值：X-Forwarded-IP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderName 回源时，存放客户端IP的请求头名称。
为空则使用默认值：X-Forwarded-IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    public ClientIpHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientIpHeader(ClientIpHeader source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);

    }
}

