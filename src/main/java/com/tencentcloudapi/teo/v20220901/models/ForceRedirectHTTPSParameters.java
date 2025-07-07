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

public class ForceRedirectHTTPSParameters extends AbstractModel {

    /**
    * 访问强制跳转配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 重定向状态码。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>301：301跳转；</li>
<li>302：302跳转。</li>
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
     * Get 访问强制跳转配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 访问强制跳转配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 访问强制跳转配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 访问强制跳转配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 重定向状态码。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>301：301跳转；</li>
<li>302：302跳转。</li> 
     * @return RedirectStatusCode 重定向状态码。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>301：301跳转；</li>
<li>302：302跳转。</li>
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set 重定向状态码。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>301：301跳转；</li>
<li>302：302跳转。</li>
     * @param RedirectStatusCode 重定向状态码。当 Switch 为 on 时，此字段必填，否则此字段不生效。取值有：
<li>301：301跳转；</li>
<li>302：302跳转。</li>
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    public ForceRedirectHTTPSParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForceRedirectHTTPSParameters(ForceRedirectHTTPSParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RedirectStatusCode != null) {
            this.RedirectStatusCode = new Long(source.RedirectStatusCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);

    }
}

