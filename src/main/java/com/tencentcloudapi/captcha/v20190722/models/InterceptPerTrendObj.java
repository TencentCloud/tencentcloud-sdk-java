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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InterceptPerTrendObj extends AbstractModel{

    /**
    * 时间参数
    */
    @SerializedName("Ftime")
    @Expose
    private String Ftime;

    /**
    * 拦截率
    */
    @SerializedName("RequestInterceptPer")
    @Expose
    private Float RequestInterceptPer;

    /**
    * 答案拦截率
    */
    @SerializedName("AnswerInterceptPer")
    @Expose
    private Float AnswerInterceptPer;

    /**
    * 策略拦截率
    */
    @SerializedName("PolicyInterceptPer")
    @Expose
    private Float PolicyInterceptPer;

    /**
     * Get 时间参数 
     * @return Ftime 时间参数
     */
    public String getFtime() {
        return this.Ftime;
    }

    /**
     * Set 时间参数
     * @param Ftime 时间参数
     */
    public void setFtime(String Ftime) {
        this.Ftime = Ftime;
    }

    /**
     * Get 拦截率 
     * @return RequestInterceptPer 拦截率
     */
    public Float getRequestInterceptPer() {
        return this.RequestInterceptPer;
    }

    /**
     * Set 拦截率
     * @param RequestInterceptPer 拦截率
     */
    public void setRequestInterceptPer(Float RequestInterceptPer) {
        this.RequestInterceptPer = RequestInterceptPer;
    }

    /**
     * Get 答案拦截率 
     * @return AnswerInterceptPer 答案拦截率
     */
    public Float getAnswerInterceptPer() {
        return this.AnswerInterceptPer;
    }

    /**
     * Set 答案拦截率
     * @param AnswerInterceptPer 答案拦截率
     */
    public void setAnswerInterceptPer(Float AnswerInterceptPer) {
        this.AnswerInterceptPer = AnswerInterceptPer;
    }

    /**
     * Get 策略拦截率 
     * @return PolicyInterceptPer 策略拦截率
     */
    public Float getPolicyInterceptPer() {
        return this.PolicyInterceptPer;
    }

    /**
     * Set 策略拦截率
     * @param PolicyInterceptPer 策略拦截率
     */
    public void setPolicyInterceptPer(Float PolicyInterceptPer) {
        this.PolicyInterceptPer = PolicyInterceptPer;
    }

    public InterceptPerTrendObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InterceptPerTrendObj(InterceptPerTrendObj source) {
        if (source.Ftime != null) {
            this.Ftime = new String(source.Ftime);
        }
        if (source.RequestInterceptPer != null) {
            this.RequestInterceptPer = new Float(source.RequestInterceptPer);
        }
        if (source.AnswerInterceptPer != null) {
            this.AnswerInterceptPer = new Float(source.AnswerInterceptPer);
        }
        if (source.PolicyInterceptPer != null) {
            this.PolicyInterceptPer = new Float(source.PolicyInterceptPer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ftime", this.Ftime);
        this.setParamSimple(map, prefix + "RequestInterceptPer", this.RequestInterceptPer);
        this.setParamSimple(map, prefix + "AnswerInterceptPer", this.AnswerInterceptPer);
        this.setParamSimple(map, prefix + "PolicyInterceptPer", this.PolicyInterceptPer);

    }
}

