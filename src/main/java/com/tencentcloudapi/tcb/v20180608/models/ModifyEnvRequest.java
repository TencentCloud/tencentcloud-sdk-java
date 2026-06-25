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

public class ModifyEnvRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>环境备注名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>按量计费QPS上限，大于套餐配额时生效。-1表示关闭QPS按量计费。</p>
    */
    @SerializedName("CustomQps")
    @Expose
    private Long CustomQps;

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
     * Get <p>环境备注名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p> 
     * @return Alias <p>环境备注名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>环境备注名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
     * @param Alias <p>环境备注名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>按量计费QPS上限，大于套餐配额时生效。-1表示关闭QPS按量计费。</p> 
     * @return CustomQps <p>按量计费QPS上限，大于套餐配额时生效。-1表示关闭QPS按量计费。</p>
     */
    public Long getCustomQps() {
        return this.CustomQps;
    }

    /**
     * Set <p>按量计费QPS上限，大于套餐配额时生效。-1表示关闭QPS按量计费。</p>
     * @param CustomQps <p>按量计费QPS上限，大于套餐配额时生效。-1表示关闭QPS按量计费。</p>
     */
    public void setCustomQps(Long CustomQps) {
        this.CustomQps = CustomQps;
    }

    public ModifyEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvRequest(ModifyEnvRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.CustomQps != null) {
            this.CustomQps = new Long(source.CustomQps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CustomQps", this.CustomQps);

    }
}

