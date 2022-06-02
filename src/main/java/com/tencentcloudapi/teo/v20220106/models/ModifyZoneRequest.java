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

public class ModifyZoneRequest extends AbstractModel{

    /**
    * 站点 ID，用于唯一标识站点信息
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 站点接入方式
- full NS 接入
- partial CNAME 接入
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自定义站点信息
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
     * Get 站点 ID，用于唯一标识站点信息 
     * @return Id 站点 ID，用于唯一标识站点信息
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 站点 ID，用于唯一标识站点信息
     * @param Id 站点 ID，用于唯一标识站点信息
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 站点接入方式
- full NS 接入
- partial CNAME 接入 
     * @return Type 站点接入方式
- full NS 接入
- partial CNAME 接入
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 站点接入方式
- full NS 接入
- partial CNAME 接入
     * @param Type 站点接入方式
- full NS 接入
- partial CNAME 接入
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自定义站点信息 
     * @return VanityNameServers 自定义站点信息
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set 自定义站点信息
     * @param VanityNameServers 自定义站点信息
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    public ModifyZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneRequest(ModifyZoneRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);

    }
}

