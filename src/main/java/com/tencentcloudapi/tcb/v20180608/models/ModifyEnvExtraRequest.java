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

public class ModifyEnvExtraRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>开启或关闭 <code>超限转按量</code>。<br>可取值： TRUE/FALSE （字符串类型）<br>非法制、不传、为空 则不变更该字段。</p>
    */
    @SerializedName("EnableOverrun")
    @Expose
    private String EnableOverrun;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>开启或关闭 <code>超限转按量</code>。<br>可取值： TRUE/FALSE （字符串类型）<br>非法制、不传、为空 则不变更该字段。</p> 
     * @return EnableOverrun <p>开启或关闭 <code>超限转按量</code>。<br>可取值： TRUE/FALSE （字符串类型）<br>非法制、不传、为空 则不变更该字段。</p>
     */
    public String getEnableOverrun() {
        return this.EnableOverrun;
    }

    /**
     * Set <p>开启或关闭 <code>超限转按量</code>。<br>可取值： TRUE/FALSE （字符串类型）<br>非法制、不传、为空 则不变更该字段。</p>
     * @param EnableOverrun <p>开启或关闭 <code>超限转按量</code>。<br>可取值： TRUE/FALSE （字符串类型）<br>非法制、不传、为空 则不变更该字段。</p>
     */
    public void setEnableOverrun(String EnableOverrun) {
        this.EnableOverrun = EnableOverrun;
    }

    public ModifyEnvExtraRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvExtraRequest(ModifyEnvExtraRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.EnableOverrun != null) {
            this.EnableOverrun = new String(source.EnableOverrun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnableOverrun", this.EnableOverrun);

    }
}

