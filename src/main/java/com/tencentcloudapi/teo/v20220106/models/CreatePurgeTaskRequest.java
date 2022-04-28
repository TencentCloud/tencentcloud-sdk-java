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

public class CreatePurgeTaskRequest extends AbstractModel{

    /**
    * Zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 类型，当前支持的类型：
- purge_url：URL
- purge_prefix：前缀
- purge_host：Hostname
- purge_all：全部缓存
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 内容，一行一个
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * 若有编码转换，仅清除编码转换后匹配的资源
若内容含有非 ASCII 字符集的字符，请打开 URL Encode 开关，编码转换（编码规则遵循 RFC3986）
    */
    @SerializedName("EncodeUrl")
    @Expose
    private Boolean EncodeUrl;

    /**
     * Get Zone ID 
     * @return ZoneId Zone ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID
     * @param ZoneId Zone ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 类型，当前支持的类型：
- purge_url：URL
- purge_prefix：前缀
- purge_host：Hostname
- purge_all：全部缓存 
     * @return Type 类型，当前支持的类型：
- purge_url：URL
- purge_prefix：前缀
- purge_host：Hostname
- purge_all：全部缓存
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，当前支持的类型：
- purge_url：URL
- purge_prefix：前缀
- purge_host：Hostname
- purge_all：全部缓存
     * @param Type 类型，当前支持的类型：
- purge_url：URL
- purge_prefix：前缀
- purge_host：Hostname
- purge_all：全部缓存
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 内容，一行一个 
     * @return Targets 内容，一行一个
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 内容，一行一个
     * @param Targets 内容，一行一个
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 若有编码转换，仅清除编码转换后匹配的资源
若内容含有非 ASCII 字符集的字符，请打开 URL Encode 开关，编码转换（编码规则遵循 RFC3986） 
     * @return EncodeUrl 若有编码转换，仅清除编码转换后匹配的资源
若内容含有非 ASCII 字符集的字符，请打开 URL Encode 开关，编码转换（编码规则遵循 RFC3986）
     */
    public Boolean getEncodeUrl() {
        return this.EncodeUrl;
    }

    /**
     * Set 若有编码转换，仅清除编码转换后匹配的资源
若内容含有非 ASCII 字符集的字符，请打开 URL Encode 开关，编码转换（编码规则遵循 RFC3986）
     * @param EncodeUrl 若有编码转换，仅清除编码转换后匹配的资源
若内容含有非 ASCII 字符集的字符，请打开 URL Encode 开关，编码转换（编码规则遵循 RFC3986）
     */
    public void setEncodeUrl(Boolean EncodeUrl) {
        this.EncodeUrl = EncodeUrl;
    }

    public CreatePurgeTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePurgeTaskRequest(CreatePurgeTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Targets != null) {
            this.Targets = new String[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new String(source.Targets[i]);
            }
        }
        if (source.EncodeUrl != null) {
            this.EncodeUrl = new Boolean(source.EncodeUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "EncodeUrl", this.EncodeUrl);

    }
}

