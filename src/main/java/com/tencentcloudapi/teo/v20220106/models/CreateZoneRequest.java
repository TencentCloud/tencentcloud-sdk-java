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

public class CreateZoneRequest extends AbstractModel{

    /**
    * 站点名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 接入方式，默认full
- full NS接入
- partial CNAME接入
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否跳过站点历史解析记录扫描
    */
    @SerializedName("JumpStart")
    @Expose
    private Boolean JumpStart;

    /**
     * Get 站点名字 
     * @return Name 站点名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名字
     * @param Name 站点名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 接入方式，默认full
- full NS接入
- partial CNAME接入 
     * @return Type 接入方式，默认full
- full NS接入
- partial CNAME接入
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 接入方式，默认full
- full NS接入
- partial CNAME接入
     * @param Type 接入方式，默认full
- full NS接入
- partial CNAME接入
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否跳过站点历史解析记录扫描 
     * @return JumpStart 是否跳过站点历史解析记录扫描
     */
    public Boolean getJumpStart() {
        return this.JumpStart;
    }

    /**
     * Set 是否跳过站点历史解析记录扫描
     * @param JumpStart 是否跳过站点历史解析记录扫描
     */
    public void setJumpStart(Boolean JumpStart) {
        this.JumpStart = JumpStart;
    }

    public CreateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateZoneRequest(CreateZoneRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.JumpStart != null) {
            this.JumpStart = new Boolean(source.JumpStart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "JumpStart", this.JumpStart);

    }
}

