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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamMonitorNotifyPolicy extends AbstractModel {

    /**
    * 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
    */
    @SerializedName("NotifyPolicyType")
    @Expose
    private Long NotifyPolicyType;

    /**
    * 回调URL：长度[0,512]
只支持http和https类型的url。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。 
     * @return NotifyPolicyType 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
     */
    public Long getNotifyPolicyType() {
        return this.NotifyPolicyType;
    }

    /**
     * Set 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
     * @param NotifyPolicyType 通知策略类型：范围[0,1]
0:代表不使用任何通知策略
1:代表使用全局回调策略，所有事件通知到CallbackUrl。
     */
    public void setNotifyPolicyType(Long NotifyPolicyType) {
        this.NotifyPolicyType = NotifyPolicyType;
    }

    /**
     * Get 回调URL：长度[0,512]
只支持http和https类型的url。 
     * @return CallbackUrl 回调URL：长度[0,512]
只支持http和https类型的url。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调URL：长度[0,512]
只支持http和https类型的url。
     * @param CallbackUrl 回调URL：长度[0,512]
只支持http和https类型的url。
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

