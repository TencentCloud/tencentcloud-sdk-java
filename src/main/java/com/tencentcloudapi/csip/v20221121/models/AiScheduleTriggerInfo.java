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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiScheduleTriggerInfo extends AbstractModel {

    /**
    * <p>触发器 ID。</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>触发器类型。取值：1（Cron 表达式）、2（固定时间）。</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get <p>触发器 ID。</p> 
     * @return TriggerId <p>触发器 ID。</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>触发器 ID。</p>
     * @param TriggerId <p>触发器 ID。</p>
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>触发器类型。取值：1（Cron 表达式）、2（固定时间）。</p> 
     * @return TriggerType <p>触发器类型。取值：1（Cron 表达式）、2（固定时间）。</p>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发器类型。取值：1（Cron 表达式）、2（固定时间）。</p>
     * @param TriggerType <p>触发器类型。取值：1（Cron 表达式）、2（固定时间）。</p>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    public AiScheduleTriggerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiScheduleTriggerInfo(AiScheduleTriggerInfo source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

