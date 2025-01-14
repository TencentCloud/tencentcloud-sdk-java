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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusTarget extends AbstractModel {

    /**
    * 抓取目标的URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get 抓取目标的URL 
     * @return Url 抓取目标的URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 抓取目标的URL
     * @param Url 抓取目标的URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知 
     * @return State target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
     * @param State target当前状态,当前支持
up = 健康
down = 不健康
unknown = 未知
     */
    public void setState(String State) {
        this.State = State;
    }

    public PrometheusTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusTarget(PrometheusTarget source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

