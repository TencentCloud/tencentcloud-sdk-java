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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAppWebHook extends AbstractModel {

    /**
    * <p>开启 webhook 触发</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>触发分支</p>
    */
    @SerializedName("Branches")
    @Expose
    private String [] Branches;

    /**
    * <p>触发事件</p>
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
     * Get <p>开启 webhook 触发</p> 
     * @return Enabled <p>开启 webhook 触发</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>开启 webhook 触发</p>
     * @param Enabled <p>开启 webhook 触发</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>触发分支</p> 
     * @return Branches <p>触发分支</p>
     */
    public String [] getBranches() {
        return this.Branches;
    }

    /**
     * Set <p>触发分支</p>
     * @param Branches <p>触发分支</p>
     */
    public void setBranches(String [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get <p>触发事件</p> 
     * @return Events <p>触发事件</p>
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>触发事件</p>
     * @param Events <p>触发事件</p>
     */
    public void setEvents(String [] Events) {
        this.Events = Events;
    }

    public CloudAppWebHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAppWebHook(CloudAppWebHook source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Branches != null) {
            this.Branches = new String[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new String(source.Branches[i]);
            }
        }
        if (source.Events != null) {
            this.Events = new String[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new String(source.Events[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "Branches.", this.Branches);
        this.setParamArraySimple(map, prefix + "Events.", this.Events);

    }
}

