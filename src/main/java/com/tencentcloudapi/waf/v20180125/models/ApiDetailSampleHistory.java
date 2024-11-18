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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiDetailSampleHistory extends AbstractModel {

    /**
    * 样例名称
    */
    @SerializedName("SampleNme")
    @Expose
    private String SampleNme;

    /**
    * 请求样例
    */
    @SerializedName("RepLog")
    @Expose
    private String RepLog;

    /**
    * 响应样例
    */
    @SerializedName("RspLog")
    @Expose
    private String RspLog;

    /**
     * Get 样例名称 
     * @return SampleNme 样例名称
     */
    public String getSampleNme() {
        return this.SampleNme;
    }

    /**
     * Set 样例名称
     * @param SampleNme 样例名称
     */
    public void setSampleNme(String SampleNme) {
        this.SampleNme = SampleNme;
    }

    /**
     * Get 请求样例 
     * @return RepLog 请求样例
     */
    public String getRepLog() {
        return this.RepLog;
    }

    /**
     * Set 请求样例
     * @param RepLog 请求样例
     */
    public void setRepLog(String RepLog) {
        this.RepLog = RepLog;
    }

    /**
     * Get 响应样例 
     * @return RspLog 响应样例
     */
    public String getRspLog() {
        return this.RspLog;
    }

    /**
     * Set 响应样例
     * @param RspLog 响应样例
     */
    public void setRspLog(String RspLog) {
        this.RspLog = RspLog;
    }

    public ApiDetailSampleHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiDetailSampleHistory(ApiDetailSampleHistory source) {
        if (source.SampleNme != null) {
            this.SampleNme = new String(source.SampleNme);
        }
        if (source.RepLog != null) {
            this.RepLog = new String(source.RepLog);
        }
        if (source.RspLog != null) {
            this.RspLog = new String(source.RspLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SampleNme", this.SampleNme);
        this.setParamSimple(map, prefix + "RepLog", this.RepLog);
        this.setParamSimple(map, prefix + "RspLog", this.RspLog);

    }
}

