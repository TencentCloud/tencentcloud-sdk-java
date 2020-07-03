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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoRenewFlagRequest extends AbstractModel{

    /**
    * 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 自动续费标记，可取值的有：0 - 不自动续费，1 - 自动续费。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
     * Get 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceIds 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceIds 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 自动续费标记，可取值的有：0 - 不自动续费，1 - 自动续费。 
     * @return AutoRenew 自动续费标记，可取值的有：0 - 不自动续费，1 - 自动续费。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标记，可取值的有：0 - 不自动续费，1 - 自动续费。
     * @param AutoRenew 自动续费标记，可取值的有：0 - 不自动续费，1 - 自动续费。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);

    }
}

