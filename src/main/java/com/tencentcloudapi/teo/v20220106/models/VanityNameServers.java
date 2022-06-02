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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VanityNameServers extends AbstractModel{

    /**
    * 自定义 ns 开关
- on 开启
- off 关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 自定义 ns 列表
    */
    @SerializedName("Servers")
    @Expose
    private String [] Servers;

    /**
     * Get 自定义 ns 开关
- on 开启
- off 关闭 
     * @return Switch 自定义 ns 开关
- on 开启
- off 关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 自定义 ns 开关
- on 开启
- off 关闭
     * @param Switch 自定义 ns 开关
- on 开启
- off 关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 自定义 ns 列表 
     * @return Servers 自定义 ns 列表
     */
    public String [] getServers() {
        return this.Servers;
    }

    /**
     * Set 自定义 ns 列表
     * @param Servers 自定义 ns 列表
     */
    public void setServers(String [] Servers) {
        this.Servers = Servers;
    }

    public VanityNameServers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VanityNameServers(VanityNameServers source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Servers != null) {
            this.Servers = new String[source.Servers.length];
            for (int i = 0; i < source.Servers.length; i++) {
                this.Servers[i] = new String(source.Servers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "Servers.", this.Servers);

    }
}

