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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorNotice extends AbstractModel {

    /**
    * 以数组的形式提供MonitorNoticeRule
    */
    @SerializedName("Notices")
    @Expose
    private MonitorNoticeRule [] Notices;

    /**
     * Get 以数组的形式提供MonitorNoticeRule 
     * @return Notices 以数组的形式提供MonitorNoticeRule
     */
    public MonitorNoticeRule [] getNotices() {
        return this.Notices;
    }

    /**
     * Set 以数组的形式提供MonitorNoticeRule
     * @param Notices 以数组的形式提供MonitorNoticeRule
     */
    public void setNotices(MonitorNoticeRule [] Notices) {
        this.Notices = Notices;
    }

    public MonitorNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorNotice(MonitorNotice source) {
        if (source.Notices != null) {
            this.Notices = new MonitorNoticeRule[source.Notices.length];
            for (int i = 0; i < source.Notices.length; i++) {
                this.Notices[i] = new MonitorNoticeRule(source.Notices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Notices.", this.Notices);

    }
}

