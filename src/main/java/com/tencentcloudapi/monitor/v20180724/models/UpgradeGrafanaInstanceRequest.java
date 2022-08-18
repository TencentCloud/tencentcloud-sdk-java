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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeGrafanaInstanceRequest extends AbstractModel{

    /**
    * 实例名
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 版本别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 实例名 
     * @return InstanceId 实例名
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名
     * @param InstanceId 实例名
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 版本别名 
     * @return Alias 版本别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 版本别名
     * @param Alias 版本别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public UpgradeGrafanaInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeGrafanaInstanceRequest(UpgradeGrafanaInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

