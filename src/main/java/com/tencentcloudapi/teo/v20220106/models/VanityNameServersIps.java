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

public class VanityNameServersIps extends AbstractModel{

    /**
    * 自定义名字服务器名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义名字服务器 IPv4 地址
    */
    @SerializedName("IPv4")
    @Expose
    private String IPv4;

    /**
     * Get 自定义名字服务器名称 
     * @return Name 自定义名字服务器名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义名字服务器名称
     * @param Name 自定义名字服务器名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义名字服务器 IPv4 地址 
     * @return IPv4 自定义名字服务器 IPv4 地址
     */
    public String getIPv4() {
        return this.IPv4;
    }

    /**
     * Set 自定义名字服务器 IPv4 地址
     * @param IPv4 自定义名字服务器 IPv4 地址
     */
    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    public VanityNameServersIps() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VanityNameServersIps(VanityNameServersIps source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IPv4 != null) {
            this.IPv4 = new String(source.IPv4);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IPv4", this.IPv4);

    }
}

