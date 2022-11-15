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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecDateStat extends AbstractModel{

    /**
    * 统计日期
    */
    @SerializedName("StatDate")
    @Expose
    private String StatDate;

    /**
    * 告警数
    */
    @SerializedName("AlarmCnt")
    @Expose
    private Long AlarmCnt;

    /**
    * 阻塞数
    */
    @SerializedName("PipelineCnt")
    @Expose
    private Long PipelineCnt;

    /**
     * Get 统计日期 
     * @return StatDate 统计日期
     */
    public String getStatDate() {
        return this.StatDate;
    }

    /**
     * Set 统计日期
     * @param StatDate 统计日期
     */
    public void setStatDate(String StatDate) {
        this.StatDate = StatDate;
    }

    /**
     * Get 告警数 
     * @return AlarmCnt 告警数
     */
    public Long getAlarmCnt() {
        return this.AlarmCnt;
    }

    /**
     * Set 告警数
     * @param AlarmCnt 告警数
     */
    public void setAlarmCnt(Long AlarmCnt) {
        this.AlarmCnt = AlarmCnt;
    }

    /**
     * Get 阻塞数 
     * @return PipelineCnt 阻塞数
     */
    public Long getPipelineCnt() {
        return this.PipelineCnt;
    }

    /**
     * Set 阻塞数
     * @param PipelineCnt 阻塞数
     */
    public void setPipelineCnt(Long PipelineCnt) {
        this.PipelineCnt = PipelineCnt;
    }

    public RuleExecDateStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecDateStat(RuleExecDateStat source) {
        if (source.StatDate != null) {
            this.StatDate = new String(source.StatDate);
        }
        if (source.AlarmCnt != null) {
            this.AlarmCnt = new Long(source.AlarmCnt);
        }
        if (source.PipelineCnt != null) {
            this.PipelineCnt = new Long(source.PipelineCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatDate", this.StatDate);
        this.setParamSimple(map, prefix + "AlarmCnt", this.AlarmCnt);
        this.setParamSimple(map, prefix + "PipelineCnt", this.PipelineCnt);

    }
}

