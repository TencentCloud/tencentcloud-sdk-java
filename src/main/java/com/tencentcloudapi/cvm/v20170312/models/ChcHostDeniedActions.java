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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChcHostDeniedActions extends AbstractModel{

    /**
    * CHC物理服务器的实例id
    */
    @SerializedName("ChcId")
    @Expose
    private String ChcId;

    /**
    * CHC物理服务器的状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 当前CHC物理服务器禁止做的操作
    */
    @SerializedName("DenyActions")
    @Expose
    private String [] DenyActions;

    /**
     * Get CHC物理服务器的实例id 
     * @return ChcId CHC物理服务器的实例id
     */
    public String getChcId() {
        return this.ChcId;
    }

    /**
     * Set CHC物理服务器的实例id
     * @param ChcId CHC物理服务器的实例id
     */
    public void setChcId(String ChcId) {
        this.ChcId = ChcId;
    }

    /**
     * Get CHC物理服务器的状态 
     * @return State CHC物理服务器的状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set CHC物理服务器的状态
     * @param State CHC物理服务器的状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 当前CHC物理服务器禁止做的操作 
     * @return DenyActions 当前CHC物理服务器禁止做的操作
     */
    public String [] getDenyActions() {
        return this.DenyActions;
    }

    /**
     * Set 当前CHC物理服务器禁止做的操作
     * @param DenyActions 当前CHC物理服务器禁止做的操作
     */
    public void setDenyActions(String [] DenyActions) {
        this.DenyActions = DenyActions;
    }

    public ChcHostDeniedActions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChcHostDeniedActions(ChcHostDeniedActions source) {
        if (source.ChcId != null) {
            this.ChcId = new String(source.ChcId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.DenyActions != null) {
            this.DenyActions = new String[source.DenyActions.length];
            for (int i = 0; i < source.DenyActions.length; i++) {
                this.DenyActions[i] = new String(source.DenyActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChcId", this.ChcId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArraySimple(map, prefix + "DenyActions.", this.DenyActions);

    }
}

