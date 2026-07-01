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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyAgentFromAppRequest extends AbstractModel {

    /**
    * <p>应用Id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>目标应用ID，kind=0时需传入</p>
    */
    @SerializedName("TargetAppId")
    @Expose
    private String TargetAppId;

    /**
    * <p>Agent 类型，区分 B 端配置态 Agent 与 C 端用户态 Agent</p><p>枚举值：</p><ul><li>0：  配置端Agent </li><li>1：  用户态 Agent</li></ul>
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
     * Get <p>应用Id</p> 
     * @return AppId <p>应用Id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用Id</p>
     * @param AppId <p>应用Id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>目标应用ID，kind=0时需传入</p> 
     * @return TargetAppId <p>目标应用ID，kind=0时需传入</p>
     */
    public String getTargetAppId() {
        return this.TargetAppId;
    }

    /**
     * Set <p>目标应用ID，kind=0时需传入</p>
     * @param TargetAppId <p>目标应用ID，kind=0时需传入</p>
     */
    public void setTargetAppId(String TargetAppId) {
        this.TargetAppId = TargetAppId;
    }

    /**
     * Get <p>Agent 类型，区分 B 端配置态 Agent 与 C 端用户态 Agent</p><p>枚举值：</p><ul><li>0：  配置端Agent </li><li>1：  用户态 Agent</li></ul> 
     * @return Kind <p>Agent 类型，区分 B 端配置态 Agent 与 C 端用户态 Agent</p><p>枚举值：</p><ul><li>0：  配置端Agent </li><li>1：  用户态 Agent</li></ul>
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set <p>Agent 类型，区分 B 端配置态 Agent 与 C 端用户态 Agent</p><p>枚举值：</p><ul><li>0：  配置端Agent </li><li>1：  用户态 Agent</li></ul>
     * @param Kind <p>Agent 类型，区分 B 端配置态 Agent 与 C 端用户态 Agent</p><p>枚举值：</p><ul><li>0：  配置端Agent </li><li>1：  用户态 Agent</li></ul>
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    public CopyAgentFromAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyAgentFromAppRequest(CopyAgentFromAppRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.TargetAppId != null) {
            this.TargetAppId = new String(source.TargetAppId);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TargetAppId", this.TargetAppId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

