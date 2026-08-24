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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleConfiguration extends AbstractModel {

    /**
    * <p>Sandbox Instance 没有活跃 Deployment 请求或连接后进入 IdleAction 的秒数，必须大于等于 30。</p>
    */
    @SerializedName("IdleTimeoutSeconds")
    @Expose
    private Long IdleTimeoutSeconds;

    /**
    * <p>空闲处理动作。</p><p>枚举值：</p><ul><li>STOP：停止并释放 Sandbox Instance。</li><li>PAUSE：暂停并保留 Sandbox Instance 状态。</li></ul>
    */
    @SerializedName("IdleAction")
    @Expose
    private String IdleAction;

    /**
     * Get <p>Sandbox Instance 没有活跃 Deployment 请求或连接后进入 IdleAction 的秒数，必须大于等于 30。</p> 
     * @return IdleTimeoutSeconds <p>Sandbox Instance 没有活跃 Deployment 请求或连接后进入 IdleAction 的秒数，必须大于等于 30。</p>
     */
    public Long getIdleTimeoutSeconds() {
        return this.IdleTimeoutSeconds;
    }

    /**
     * Set <p>Sandbox Instance 没有活跃 Deployment 请求或连接后进入 IdleAction 的秒数，必须大于等于 30。</p>
     * @param IdleTimeoutSeconds <p>Sandbox Instance 没有活跃 Deployment 请求或连接后进入 IdleAction 的秒数，必须大于等于 30。</p>
     */
    public void setIdleTimeoutSeconds(Long IdleTimeoutSeconds) {
        this.IdleTimeoutSeconds = IdleTimeoutSeconds;
    }

    /**
     * Get <p>空闲处理动作。</p><p>枚举值：</p><ul><li>STOP：停止并释放 Sandbox Instance。</li><li>PAUSE：暂停并保留 Sandbox Instance 状态。</li></ul> 
     * @return IdleAction <p>空闲处理动作。</p><p>枚举值：</p><ul><li>STOP：停止并释放 Sandbox Instance。</li><li>PAUSE：暂停并保留 Sandbox Instance 状态。</li></ul>
     */
    public String getIdleAction() {
        return this.IdleAction;
    }

    /**
     * Set <p>空闲处理动作。</p><p>枚举值：</p><ul><li>STOP：停止并释放 Sandbox Instance。</li><li>PAUSE：暂停并保留 Sandbox Instance 状态。</li></ul>
     * @param IdleAction <p>空闲处理动作。</p><p>枚举值：</p><ul><li>STOP：停止并释放 Sandbox Instance。</li><li>PAUSE：暂停并保留 Sandbox Instance 状态。</li></ul>
     */
    public void setIdleAction(String IdleAction) {
        this.IdleAction = IdleAction;
    }

    public LifecycleConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleConfiguration(LifecycleConfiguration source) {
        if (source.IdleTimeoutSeconds != null) {
            this.IdleTimeoutSeconds = new Long(source.IdleTimeoutSeconds);
        }
        if (source.IdleAction != null) {
            this.IdleAction = new String(source.IdleAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdleTimeoutSeconds", this.IdleTimeoutSeconds);
        this.setParamSimple(map, prefix + "IdleAction", this.IdleAction);

    }
}

