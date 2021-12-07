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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAssetRequest extends AbstractModel{

    /**
    * 全部同步
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 要同步的主机列表 两个参数必选一个 All优先
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
     * Get 全部同步 
     * @return All 全部同步
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 全部同步
     * @param All 全部同步
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 要同步的主机列表 两个参数必选一个 All优先 
     * @return Hosts 要同步的主机列表 两个参数必选一个 All优先
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 要同步的主机列表 两个参数必选一个 All优先
     * @param Hosts 要同步的主机列表 两个参数必选一个 All优先
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    public ModifyAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetRequest(ModifyAssetRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);

    }
}

