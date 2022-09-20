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

public class WafGroupInfo extends AbstractModel{

    /**
    * 托管规则组列表。
    */
    @SerializedName("WafGroupDetails")
    @Expose
    private WafGroupDetail [] WafGroupDetails;

    /**
    * 规则组等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格。</li>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 保留字段。
    */
    @SerializedName("Act")
    @Expose
    private String Act;

    /**
    * 模式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 托管规则组列表。 
     * @return WafGroupDetails 托管规则组列表。
     */
    public WafGroupDetail [] getWafGroupDetails() {
        return this.WafGroupDetails;
    }

    /**
     * Set 托管规则组列表。
     * @param WafGroupDetails 托管规则组列表。
     */
    public void setWafGroupDetails(WafGroupDetail [] WafGroupDetails) {
        this.WafGroupDetails = WafGroupDetails;
    }

    /**
     * Get 规则组等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格。</li> 
     * @return Level 规则组等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格。</li>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 规则组等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格。</li>
     * @param Level 规则组等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格。</li>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 保留字段。 
     * @return Act 保留字段。
     */
    public String getAct() {
        return this.Act;
    }

    /**
     * Set 保留字段。
     * @param Act 保留字段。
     */
    public void setAct(String Act) {
        this.Act = Act;
    }

    /**
     * Get 模式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li> 
     * @return Mode 模式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
     * @param Mode 模式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li> 
     * @return Switch 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     * @param Switch 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public WafGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafGroupInfo(WafGroupInfo source) {
        if (source.WafGroupDetails != null) {
            this.WafGroupDetails = new WafGroupDetail[source.WafGroupDetails.length];
            for (int i = 0; i < source.WafGroupDetails.length; i++) {
                this.WafGroupDetails[i] = new WafGroupDetail(source.WafGroupDetails[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Act != null) {
            this.Act = new String(source.Act);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WafGroupDetails.", this.WafGroupDetails);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Act", this.Act);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

