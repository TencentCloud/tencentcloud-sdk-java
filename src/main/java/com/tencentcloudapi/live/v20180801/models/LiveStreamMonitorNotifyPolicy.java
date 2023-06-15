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

public class LiveStreamMonitorNotifyPolicy extends AbstractModel{

    /**
    * 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyPolicyType")
    @Expose
    private Long NotifyPolicyType;

    /**
    * 回调URL：长度[0,512]
只支持http和https类型的url。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyPolicyType 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotifyPolicyType() {
        return this.NotifyPolicyType;
    }

    /**
     * Set 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyPolicyType 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyPolicyType(Long NotifyPolicyType) {
        this.NotifyPolicyType = NotifyPolicyType;
    }

    /**
     * Get 回调URL：长度[0,512]
只支持http和https类型的url。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackUrl 回调URL：长度[0,512]
只支持http和https类型的url。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调URL：长度[0,512]
只支持http和https类型的url。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackUrl 回调URL：长度[0,512]
只支持http和https类型的url。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public LiveStreamMonitorNotifyPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamMonitorNotifyPolicy(LiveStreamMonitorNotifyPolicy source) {
        if (source.NotifyPolicyType != null) {
            this.NotifyPolicyType = new Long(source.NotifyPolicyType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyPolicyType", this.NotifyPolicyType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

