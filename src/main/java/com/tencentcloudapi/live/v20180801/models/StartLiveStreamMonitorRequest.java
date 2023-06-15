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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartLiveStreamMonitorRequest extends AbstractModel{

    /**
    * 监播ID。
    */
    @SerializedName("MonitorId")
    @Expose
    private String MonitorId;

    /**
    * 监播画面声音InputIndex,支持多个输入声音。
取值范围 InputIndex必须已经存在。
不填默认无声音输出。
    */
    @SerializedName("AudibleInputIndexList")
    @Expose
    private Long [] AudibleInputIndexList;

    /**
     * Get 监播ID。 
     * @return MonitorId 监播ID。
     */
    public String getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监播ID。
     * @param MonitorId 监播ID。
     */
    public void setMonitorId(String MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 监播画面声音InputIndex,支持多个输入声音。
取值范围 InputIndex必须已经存在。
不填默认无声音输出。 
     * @return AudibleInputIndexList 监播画面声音InputIndex,支持多个输入声音。
取值范围 InputIndex必须已经存在。
不填默认无声音输出。
     */
    public Long [] getAudibleInputIndexList() {
        return this.AudibleInputIndexList;
    }

    /**
     * Set 监播画面声音InputIndex,支持多个输入声音。
取值范围 InputIndex必须已经存在。
不填默认无声音输出。
     * @param AudibleInputIndexList 监播画面声音InputIndex,支持多个输入声音。
取值范围 InputIndex必须已经存在。
不填默认无声音输出。
     */
    public void setAudibleInputIndexList(Long [] AudibleInputIndexList) {
        this.AudibleInputIndexList = AudibleInputIndexList;
    }

    public StartLiveStreamMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartLiveStreamMonitorRequest(StartLiveStreamMonitorRequest source) {
        if (source.MonitorId != null) {
            this.MonitorId = new String(source.MonitorId);
        }
        if (source.AudibleInputIndexList != null) {
            this.AudibleInputIndexList = new Long[source.AudibleInputIndexList.length];
            for (int i = 0; i < source.AudibleInputIndexList.length; i++) {
                this.AudibleInputIndexList[i] = new Long(source.AudibleInputIndexList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamArraySimple(map, prefix + "AudibleInputIndexList.", this.AudibleInputIndexList);

    }
}

