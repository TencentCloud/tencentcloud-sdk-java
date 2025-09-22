/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmWayWebHook extends AbstractModel {

    /**
    * 告警渠道值
7.企业微信群,8 飞书群 9 钉钉群 10 Slack群 11 Teams群
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * 告警群的webhook地址列表
    */
    @SerializedName("WebHooks")
    @Expose
    private String [] WebHooks;

    /**
     * Get 告警渠道值
7.企业微信群,8 飞书群 9 钉钉群 10 Slack群 11 Teams群 
     * @return AlarmWay 告警渠道值
7.企业微信群,8 飞书群 9 钉钉群 10 Slack群 11 Teams群
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set 告警渠道值
7.企业微信群,8 飞书群 9 钉钉群 10 Slack群 11 Teams群
     * @param AlarmWay 告警渠道值
7.企业微信群,8 飞书群 9 钉钉群 10 Slack群 11 Teams群
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get 告警群的webhook地址列表 
     * @return WebHooks 告警群的webhook地址列表
     */
    public String [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set 告警群的webhook地址列表
     * @param WebHooks 告警群的webhook地址列表
     */
    public void setWebHooks(String [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    public AlarmWayWebHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmWayWebHook(AlarmWayWebHook source) {
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.WebHooks != null) {
            this.WebHooks = new String[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new String(source.WebHooks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamArraySimple(map, prefix + "WebHooks.", this.WebHooks);

    }
}

