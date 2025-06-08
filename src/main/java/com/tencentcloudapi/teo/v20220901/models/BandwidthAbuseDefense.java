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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthAbuseDefense extends AbstractModel {

    /**
    * 流量防盗刷（仅适用中国大陆地区）是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 流量防盗刷（仅适用中国大陆地区）的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get 流量防盗刷（仅适用中国大陆地区）是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 流量防盗刷（仅适用中国大陆地区）是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 流量防盗刷（仅适用中国大陆地区）是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 流量防盗刷（仅适用中国大陆地区）是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 流量防盗刷（仅适用中国大陆地区）的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li> 
     * @return Action 流量防盗刷（仅适用中国大陆地区）的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set 流量防盗刷（仅适用中国大陆地区）的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
     * @param Action 流量防盗刷（仅适用中国大陆地区）的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public BandwidthAbuseDefense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthAbuseDefense(BandwidthAbuseDefense source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

