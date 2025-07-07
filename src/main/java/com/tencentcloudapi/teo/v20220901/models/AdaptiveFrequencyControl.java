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

public class AdaptiveFrequencyControl extends AbstractModel {

    /**
    * 自适应频控是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 自适应频控的限制等级，当 Enabled 为 on 时，此字段必填。取值有：<li>Loose：宽松；</li><li>Moderate：适中；</li><li>Strict：严格。</li>
    */
    @SerializedName("Sensitivity")
    @Expose
    private String Sensitivity;

    /**
    * 自适应频控的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get 自适应频控是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 自适应频控是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 自适应频控是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 自适应频控是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 自适应频控的限制等级，当 Enabled 为 on 时，此字段必填。取值有：<li>Loose：宽松；</li><li>Moderate：适中；</li><li>Strict：严格。</li> 
     * @return Sensitivity 自适应频控的限制等级，当 Enabled 为 on 时，此字段必填。取值有：<li>Loose：宽松；</li><li>Moderate：适中；</li><li>Strict：严格。</li>
     */
    public String getSensitivity() {
        return this.Sensitivity;
    }

    /**
     * Set 自适应频控的限制等级，当 Enabled 为 on 时，此字段必填。取值有：<li>Loose：宽松；</li><li>Moderate：适中；</li><li>Strict：严格。</li>
     * @param Sensitivity 自适应频控的限制等级，当 Enabled 为 on 时，此字段必填。取值有：<li>Loose：宽松；</li><li>Moderate：适中；</li><li>Strict：严格。</li>
     */
    public void setSensitivity(String Sensitivity) {
        this.Sensitivity = Sensitivity;
    }

    /**
     * Get 自适应频控的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li> 
     * @return Action 自适应频控的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set 自适应频控的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
     * @param Action 自适应频控的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li><li>Challenge：挑战，其中ChallengeActionParameters.Name仅支持JSChallenge。</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public AdaptiveFrequencyControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveFrequencyControl(AdaptiveFrequencyControl source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Sensitivity != null) {
            this.Sensitivity = new String(source.Sensitivity);
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
        this.setParamSimple(map, prefix + "Sensitivity", this.Sensitivity);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

