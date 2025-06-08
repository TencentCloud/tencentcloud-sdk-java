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

public class ChallengeActionParameters extends AbstractModel {

    /**
    * 安全执行的具体挑战动作。取值有：<li> InterstitialChallenge：插页式挑战；</li><li> InlineChallenge：内嵌式挑战；</li><li> JSChallenge：JavaScript 挑战；</li><li> ManagedChallenge：托管挑战。</li>
    */
    @SerializedName("ChallengeOption")
    @Expose
    private String ChallengeOption;

    /**
    * 重复挑战的时间间隔，当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li>

    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
     * Get 安全执行的具体挑战动作。取值有：<li> InterstitialChallenge：插页式挑战；</li><li> InlineChallenge：内嵌式挑战；</li><li> JSChallenge：JavaScript 挑战；</li><li> ManagedChallenge：托管挑战。</li> 
     * @return ChallengeOption 安全执行的具体挑战动作。取值有：<li> InterstitialChallenge：插页式挑战；</li><li> InlineChallenge：内嵌式挑战；</li><li> JSChallenge：JavaScript 挑战；</li><li> ManagedChallenge：托管挑战。</li>
     */
    public String getChallengeOption() {
        return this.ChallengeOption;
    }

    /**
     * Set 安全执行的具体挑战动作。取值有：<li> InterstitialChallenge：插页式挑战；</li><li> InlineChallenge：内嵌式挑战；</li><li> JSChallenge：JavaScript 挑战；</li><li> ManagedChallenge：托管挑战。</li>
     * @param ChallengeOption 安全执行的具体挑战动作。取值有：<li> InterstitialChallenge：插页式挑战；</li><li> InlineChallenge：内嵌式挑战；</li><li> JSChallenge：JavaScript 挑战；</li><li> ManagedChallenge：托管挑战。</li>
     */
    public void setChallengeOption(String ChallengeOption) {
        this.ChallengeOption = ChallengeOption;
    }

    /**
     * Get 重复挑战的时间间隔，当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li>
 
     * @return Interval 重复挑战的时间间隔，当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li>

     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 重复挑战的时间间隔，当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li>

     * @param Interval 重复挑战的时间间隔，当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li>

     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。 
     * @return AttesterId 客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set 客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。
     * @param AttesterId 客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。
     */
    public void setAttesterId(String AttesterId) {
        this.AttesterId = AttesterId;
    }

    public ChallengeActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChallengeActionParameters(ChallengeActionParameters source) {
        if (source.ChallengeOption != null) {
            this.ChallengeOption = new String(source.ChallengeOption);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.AttesterId != null) {
            this.AttesterId = new String(source.AttesterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChallengeOption", this.ChallengeOption);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "AttesterId", this.AttesterId);

    }
}

