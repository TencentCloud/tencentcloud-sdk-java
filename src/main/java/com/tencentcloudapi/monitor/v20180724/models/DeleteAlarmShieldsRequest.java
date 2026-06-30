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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAlarmShieldsRequest extends AbstractModel {

    /**
    * <p>模块名，这里填“monitor”</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>屏蔽策略Id列表</p>
    */
    @SerializedName("Shields")
    @Expose
    private String [] Shields;

    /**
     * Get <p>模块名，这里填“monitor”</p> 
     * @return Module <p>模块名，这里填“monitor”</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块名，这里填“monitor”</p>
     * @param Module <p>模块名，这里填“monitor”</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>屏蔽策略Id列表</p> 
     * @return Shields <p>屏蔽策略Id列表</p>
     */
    public String [] getShields() {
        return this.Shields;
    }

    /**
     * Set <p>屏蔽策略Id列表</p>
     * @param Shields <p>屏蔽策略Id列表</p>
     */
    public void setShields(String [] Shields) {
        this.Shields = Shields;
    }

    public DeleteAlarmShieldsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlarmShieldsRequest(DeleteAlarmShieldsRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Shields != null) {
            this.Shields = new String[source.Shields.length];
            for (int i = 0; i < source.Shields.length; i++) {
                this.Shields[i] = new String(source.Shields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "Shields.", this.Shields);

    }
}

