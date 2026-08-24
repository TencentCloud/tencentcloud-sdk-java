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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWConsumerModelScope extends AbstractModel {

    /**
    * <p>消费者模型生效范围类型</p><p>枚举值：</p><ul><li>INHERIT： 继承所在消费者组的生效模型范围</li><li>ALLOWLIST： 自定义白名单，必须 ⊆ 所在组针对该资源的生效模型集合</li></ul>
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * <p>模型授权白名单列表</p>
    */
    @SerializedName("AllowList")
    @Expose
    private String [] AllowList;

    /**
     * Get <p>消费者模型生效范围类型</p><p>枚举值：</p><ul><li>INHERIT： 继承所在消费者组的生效模型范围</li><li>ALLOWLIST： 自定义白名单，必须 ⊆ 所在组针对该资源的生效模型集合</li></ul> 
     * @return ScopeType <p>消费者模型生效范围类型</p><p>枚举值：</p><ul><li>INHERIT： 继承所在消费者组的生效模型范围</li><li>ALLOWLIST： 自定义白名单，必须 ⊆ 所在组针对该资源的生效模型集合</li></ul>
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>消费者模型生效范围类型</p><p>枚举值：</p><ul><li>INHERIT： 继承所在消费者组的生效模型范围</li><li>ALLOWLIST： 自定义白名单，必须 ⊆ 所在组针对该资源的生效模型集合</li></ul>
     * @param ScopeType <p>消费者模型生效范围类型</p><p>枚举值：</p><ul><li>INHERIT： 继承所在消费者组的生效模型范围</li><li>ALLOWLIST： 自定义白名单，必须 ⊆ 所在组针对该资源的生效模型集合</li></ul>
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get <p>模型授权白名单列表</p> 
     * @return AllowList <p>模型授权白名单列表</p>
     */
    public String [] getAllowList() {
        return this.AllowList;
    }

    /**
     * Set <p>模型授权白名单列表</p>
     * @param AllowList <p>模型授权白名单列表</p>
     */
    public void setAllowList(String [] AllowList) {
        this.AllowList = AllowList;
    }

    public AIGWConsumerModelScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWConsumerModelScope(AIGWConsumerModelScope source) {
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
        }
        if (source.AllowList != null) {
            this.AllowList = new String[source.AllowList.length];
            for (int i = 0; i < source.AllowList.length; i++) {
                this.AllowList[i] = new String(source.AllowList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamArraySimple(map, prefix + "AllowList.", this.AllowList);

    }
}

