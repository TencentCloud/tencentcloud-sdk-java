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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeBindPolicys extends AbstractModel {

    /**
    * <p>告警通知模板 ID</p>
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * <p>告警通知模板绑定的告警策略ID列表</p>
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
     * Get <p>告警通知模板 ID</p> 
     * @return NoticeId <p>告警通知模板 ID</p>
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set <p>告警通知模板 ID</p>
     * @param NoticeId <p>告警通知模板 ID</p>
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get <p>告警通知模板绑定的告警策略ID列表</p> 
     * @return PolicyIds <p>告警通知模板绑定的告警策略ID列表</p>
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set <p>告警通知模板绑定的告警策略ID列表</p>
     * @param PolicyIds <p>告警通知模板绑定的告警策略ID列表</p>
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public NoticeBindPolicys() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeBindPolicys(NoticeBindPolicys source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

