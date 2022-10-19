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

public class TicketCheckTrendObj extends AbstractModel{

    /**
    * 时间参数
    */
    @SerializedName("Ftime")
    @Expose
    private String Ftime;

    /**
    * 票据校验量
    */
    @SerializedName("TicketCount")
    @Expose
    private Long TicketCount;

    /**
    * 票据通过量
    */
    @SerializedName("TicketThroughput")
    @Expose
    private Long TicketThroughput;

    /**
    * 票据拦截量
    */
    @SerializedName("TicketIntercept")
    @Expose
    private Long TicketIntercept;

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
     * Get 票据校验量 
     * @return TicketCount 票据校验量
     */
    public Long getTicketCount() {
        return this.TicketCount;
    }

    /**
     * Set 票据校验量
     * @param TicketCount 票据校验量
     */
    public void setTicketCount(Long TicketCount) {
        this.TicketCount = TicketCount;
    }

    /**
     * Get 票据通过量 
     * @return TicketThroughput 票据通过量
     */
    public Long getTicketThroughput() {
        return this.TicketThroughput;
    }

    /**
     * Set 票据通过量
     * @param TicketThroughput 票据通过量
     */
    public void setTicketThroughput(Long TicketThroughput) {
        this.TicketThroughput = TicketThroughput;
    }

    /**
     * Get 票据拦截量 
     * @return TicketIntercept 票据拦截量
     */
    public Long getTicketIntercept() {
        return this.TicketIntercept;
    }

    /**
     * Set 票据拦截量
     * @param TicketIntercept 票据拦截量
     */
    public void setTicketIntercept(Long TicketIntercept) {
        this.TicketIntercept = TicketIntercept;
    }

    public TicketCheckTrendObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TicketCheckTrendObj(TicketCheckTrendObj source) {
        if (source.Ftime != null) {
            this.Ftime = new String(source.Ftime);
        }
        if (source.TicketCount != null) {
            this.TicketCount = new Long(source.TicketCount);
        }
        if (source.TicketThroughput != null) {
            this.TicketThroughput = new Long(source.TicketThroughput);
        }
        if (source.TicketIntercept != null) {
            this.TicketIntercept = new Long(source.TicketIntercept);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ftime", this.Ftime);
        this.setParamSimple(map, prefix + "TicketCount", this.TicketCount);
        this.setParamSimple(map, prefix + "TicketThroughput", this.TicketThroughput);
        this.setParamSimple(map, prefix + "TicketIntercept", this.TicketIntercept);

    }
}

