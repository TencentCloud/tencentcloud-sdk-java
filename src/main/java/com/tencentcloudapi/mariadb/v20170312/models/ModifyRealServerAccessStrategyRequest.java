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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRealServerAccessStrategyRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * RS就近模式, 0-无策略, 1-可用区就近访问。
    */
    @SerializedName("RsAccessStrategy")
    @Expose
    private Long RsAccessStrategy;

    /**
     * Get 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get RS就近模式, 0-无策略, 1-可用区就近访问。 
     * @return RsAccessStrategy RS就近模式, 0-无策略, 1-可用区就近访问。
     */
    public Long getRsAccessStrategy() {
        return this.RsAccessStrategy;
    }

    /**
     * Set RS就近模式, 0-无策略, 1-可用区就近访问。
     * @param RsAccessStrategy RS就近模式, 0-无策略, 1-可用区就近访问。
     */
    public void setRsAccessStrategy(Long RsAccessStrategy) {
        this.RsAccessStrategy = RsAccessStrategy;
    }

    public ModifyRealServerAccessStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRealServerAccessStrategyRequest(ModifyRealServerAccessStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RsAccessStrategy != null) {
            this.RsAccessStrategy = new Long(source.RsAccessStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RsAccessStrategy", this.RsAccessStrategy);

    }
}

