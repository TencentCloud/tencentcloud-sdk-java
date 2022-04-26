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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingAdvice extends AbstractModel{

    /**
    * 伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 伸缩组警告级别。取值范围：<br>
<li>NORMAL：正常<br>
<li>WARNING：警告级别<br>
<li>CRITICAL：严重级别<br>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 伸缩组配置建议集合。
    */
    @SerializedName("Advices")
    @Expose
    private Advice [] Advices;

    /**
     * Get 伸缩组ID。 
     * @return AutoScalingGroupId 伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。
     * @param AutoScalingGroupId 伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 伸缩组警告级别。取值范围：<br>
<li>NORMAL：正常<br>
<li>WARNING：警告级别<br>
<li>CRITICAL：严重级别<br> 
     * @return Level 伸缩组警告级别。取值范围：<br>
<li>NORMAL：正常<br>
<li>WARNING：警告级别<br>
<li>CRITICAL：严重级别<br>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 伸缩组警告级别。取值范围：<br>
<li>NORMAL：正常<br>
<li>WARNING：警告级别<br>
<li>CRITICAL：严重级别<br>
     * @param Level 伸缩组警告级别。取值范围：<br>
<li>NORMAL：正常<br>
<li>WARNING：警告级别<br>
<li>CRITICAL：严重级别<br>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 伸缩组配置建议集合。 
     * @return Advices 伸缩组配置建议集合。
     */
    public Advice [] getAdvices() {
        return this.Advices;
    }

    /**
     * Set 伸缩组配置建议集合。
     * @param Advices 伸缩组配置建议集合。
     */
    public void setAdvices(Advice [] Advices) {
        this.Advices = Advices;
    }

    public AutoScalingAdvice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingAdvice(AutoScalingAdvice source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Advices != null) {
            this.Advices = new Advice[source.Advices.length];
            for (int i = 0; i < source.Advices.length; i++) {
                this.Advices[i] = new Advice(source.Advices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArrayObj(map, prefix + "Advices.", this.Advices);

    }
}

