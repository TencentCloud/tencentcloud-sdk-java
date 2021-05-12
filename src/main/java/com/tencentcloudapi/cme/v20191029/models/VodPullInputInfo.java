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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VodPullInputInfo extends AbstractModel{

    /**
    * 点播输入拉流 URL 。
    */
    @SerializedName("InputUrls")
    @Expose
    private String [] InputUrls;

    /**
    * 播放次数，取值有：
<li>-1 : 循环播放，直到转推结束；</li>
<li>0 : 不循环；</li>
<li>大于0 : 具体循环次数，次数和时间以先结束的为准。</li>
默认不循环。
    */
    @SerializedName("LoopTimes")
    @Expose
    private Long LoopTimes;

    /**
     * Get 点播输入拉流 URL 。 
     * @return InputUrls 点播输入拉流 URL 。
     */
    public String [] getInputUrls() {
        return this.InputUrls;
    }

    /**
     * Set 点播输入拉流 URL 。
     * @param InputUrls 点播输入拉流 URL 。
     */
    public void setInputUrls(String [] InputUrls) {
        this.InputUrls = InputUrls;
    }

    /**
     * Get 播放次数，取值有：
<li>-1 : 循环播放，直到转推结束；</li>
<li>0 : 不循环；</li>
<li>大于0 : 具体循环次数，次数和时间以先结束的为准。</li>
默认不循环。 
     * @return LoopTimes 播放次数，取值有：
<li>-1 : 循环播放，直到转推结束；</li>
<li>0 : 不循环；</li>
<li>大于0 : 具体循环次数，次数和时间以先结束的为准。</li>
默认不循环。
     */
    public Long getLoopTimes() {
        return this.LoopTimes;
    }

    /**
     * Set 播放次数，取值有：
<li>-1 : 循环播放，直到转推结束；</li>
<li>0 : 不循环；</li>
<li>大于0 : 具体循环次数，次数和时间以先结束的为准。</li>
默认不循环。
     * @param LoopTimes 播放次数，取值有：
<li>-1 : 循环播放，直到转推结束；</li>
<li>0 : 不循环；</li>
<li>大于0 : 具体循环次数，次数和时间以先结束的为准。</li>
默认不循环。
     */
    public void setLoopTimes(Long LoopTimes) {
        this.LoopTimes = LoopTimes;
    }

    public VodPullInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VodPullInputInfo(VodPullInputInfo source) {
        if (source.InputUrls != null) {
            this.InputUrls = new String[source.InputUrls.length];
            for (int i = 0; i < source.InputUrls.length; i++) {
                this.InputUrls[i] = new String(source.InputUrls[i]);
            }
        }
        if (source.LoopTimes != null) {
            this.LoopTimes = new Long(source.LoopTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InputUrls.", this.InputUrls);
        this.setParamSimple(map, prefix + "LoopTimes", this.LoopTimes);

    }
}

