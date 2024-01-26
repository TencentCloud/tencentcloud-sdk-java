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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCrontabTopNDsRequest extends AbstractModel {

    /**
    * crontabExp
    */
    @SerializedName("CrontabExp")
    @Expose
    private String CrontabExp;

    /**
    * topN
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
    * StartIsoTime
    */
    @SerializedName("StartIsoTime")
    @Expose
    private String StartIsoTime;

    /**
     * Get crontabExp 
     * @return CrontabExp crontabExp
     */
    public String getCrontabExp() {
        return this.CrontabExp;
    }

    /**
     * Set crontabExp
     * @param CrontabExp crontabExp
     */
    public void setCrontabExp(String CrontabExp) {
        this.CrontabExp = CrontabExp;
    }

    /**
     * Get topN 
     * @return TopN topN
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set topN
     * @param TopN topN
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    /**
     * Get StartIsoTime 
     * @return StartIsoTime StartIsoTime
     */
    public String getStartIsoTime() {
        return this.StartIsoTime;
    }

    /**
     * Set StartIsoTime
     * @param StartIsoTime StartIsoTime
     */
    public void setStartIsoTime(String StartIsoTime) {
        this.StartIsoTime = StartIsoTime;
    }

    public DescribeCrontabTopNDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrontabTopNDsRequest(DescribeCrontabTopNDsRequest source) {
        if (source.CrontabExp != null) {
            this.CrontabExp = new String(source.CrontabExp);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
        if (source.StartIsoTime != null) {
            this.StartIsoTime = new String(source.StartIsoTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrontabExp", this.CrontabExp);
        this.setParamSimple(map, prefix + "TopN", this.TopN);
        this.setParamSimple(map, prefix + "StartIsoTime", this.StartIsoTime);

    }
}

