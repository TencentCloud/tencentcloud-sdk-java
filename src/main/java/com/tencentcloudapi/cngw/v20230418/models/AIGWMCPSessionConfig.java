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

public class AIGWMCPSessionConfig extends AbstractModel {

    /**
    * <p>会话存储类型</p><p>枚举值：</p><ul><li>memory： 内存</li><li>redis： redis</li></ul>
    */
    @SerializedName("SessionStorage")
    @Expose
    private String SessionStorage;

    /**
    * <p>Redis配置</p>
    */
    @SerializedName("RedisConfig")
    @Expose
    private AIGWRedisConfig RedisConfig;

    /**
     * Get <p>会话存储类型</p><p>枚举值：</p><ul><li>memory： 内存</li><li>redis： redis</li></ul> 
     * @return SessionStorage <p>会话存储类型</p><p>枚举值：</p><ul><li>memory： 内存</li><li>redis： redis</li></ul>
     */
    public String getSessionStorage() {
        return this.SessionStorage;
    }

    /**
     * Set <p>会话存储类型</p><p>枚举值：</p><ul><li>memory： 内存</li><li>redis： redis</li></ul>
     * @param SessionStorage <p>会话存储类型</p><p>枚举值：</p><ul><li>memory： 内存</li><li>redis： redis</li></ul>
     */
    public void setSessionStorage(String SessionStorage) {
        this.SessionStorage = SessionStorage;
    }

    /**
     * Get <p>Redis配置</p> 
     * @return RedisConfig <p>Redis配置</p>
     */
    public AIGWRedisConfig getRedisConfig() {
        return this.RedisConfig;
    }

    /**
     * Set <p>Redis配置</p>
     * @param RedisConfig <p>Redis配置</p>
     */
    public void setRedisConfig(AIGWRedisConfig RedisConfig) {
        this.RedisConfig = RedisConfig;
    }

    public AIGWMCPSessionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPSessionConfig(AIGWMCPSessionConfig source) {
        if (source.SessionStorage != null) {
            this.SessionStorage = new String(source.SessionStorage);
        }
        if (source.RedisConfig != null) {
            this.RedisConfig = new AIGWRedisConfig(source.RedisConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionStorage", this.SessionStorage);
        this.setParamObj(map, prefix + "RedisConfig.", this.RedisConfig);

    }
}

