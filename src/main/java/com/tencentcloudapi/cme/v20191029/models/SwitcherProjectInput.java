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

public class SwitcherProjectInput extends AbstractModel{

    /**
    * 导播台停止时间，格式按照 ISO 8601 标准表示。若不填，该值默认为当前时间加七天。
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
    * 导播台主监输出配置信息。若不填，默认输出 720P。
    */
    @SerializedName("PgmOutputConfig")
    @Expose
    private SwitcherPgmOutputConfig PgmOutputConfig;

    /**
     * Get 导播台停止时间，格式按照 ISO 8601 标准表示。若不填，该值默认为当前时间加七天。 
     * @return StopTime 导播台停止时间，格式按照 ISO 8601 标准表示。若不填，该值默认为当前时间加七天。
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set 导播台停止时间，格式按照 ISO 8601 标准表示。若不填，该值默认为当前时间加七天。
     * @param StopTime 导播台停止时间，格式按照 ISO 8601 标准表示。若不填，该值默认为当前时间加七天。
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get 导播台主监输出配置信息。若不填，默认输出 720P。 
     * @return PgmOutputConfig 导播台主监输出配置信息。若不填，默认输出 720P。
     */
    public SwitcherPgmOutputConfig getPgmOutputConfig() {
        return this.PgmOutputConfig;
    }

    /**
     * Set 导播台主监输出配置信息。若不填，默认输出 720P。
     * @param PgmOutputConfig 导播台主监输出配置信息。若不填，默认输出 720P。
     */
    public void setPgmOutputConfig(SwitcherPgmOutputConfig PgmOutputConfig) {
        this.PgmOutputConfig = PgmOutputConfig;
    }

    public SwitcherProjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitcherProjectInput(SwitcherProjectInput source) {
        if (source.StopTime != null) {
            this.StopTime = new String(source.StopTime);
        }
        if (source.PgmOutputConfig != null) {
            this.PgmOutputConfig = new SwitcherPgmOutputConfig(source.PgmOutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamObj(map, prefix + "PgmOutputConfig.", this.PgmOutputConfig);

    }
}

