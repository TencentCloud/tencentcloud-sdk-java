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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartFleetActionsRequest extends AbstractModel{

    /**
    * 服务器舰队 Id
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 服务器舰队扩展策略，值为["AUTO_SCALING"]
    */
    @SerializedName("Actions")
    @Expose
    private String [] Actions;

    /**
     * Get 服务器舰队 Id 
     * @return FleetId 服务器舰队 Id
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队 Id
     * @param FleetId 服务器舰队 Id
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 服务器舰队扩展策略，值为["AUTO_SCALING"] 
     * @return Actions 服务器舰队扩展策略，值为["AUTO_SCALING"]
     */
    public String [] getActions() {
        return this.Actions;
    }

    /**
     * Set 服务器舰队扩展策略，值为["AUTO_SCALING"]
     * @param Actions 服务器舰队扩展策略，值为["AUTO_SCALING"]
     */
    public void setActions(String [] Actions) {
        this.Actions = Actions;
    }

    public StartFleetActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartFleetActionsRequest(StartFleetActionsRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.Actions != null) {
            this.Actions = new String[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new String(source.Actions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);

    }
}

