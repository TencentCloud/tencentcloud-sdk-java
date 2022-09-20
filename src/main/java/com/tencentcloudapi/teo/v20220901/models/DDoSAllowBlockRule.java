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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAllowBlockRule extends AbstractModel{

    /**
    * 客户端IP，支持格式有：单IP、IP范围、网段、网段范围。例如"1.1.1.1","1.1.1.2-1.1.1.3","1.2.1.0/24-1.2.2.0/24"。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 类型，取值有：
<li> block ：丢弃 ；</li><li> allow ：允许。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 10位时间戳，例如1199116800。不填写系统取当前时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 客户端IP，支持格式有：单IP、IP范围、网段、网段范围。例如"1.1.1.1","1.1.1.2-1.1.1.3","1.2.1.0/24-1.2.2.0/24"。 
     * @return Ip 客户端IP，支持格式有：单IP、IP范围、网段、网段范围。例如"1.1.1.1","1.1.1.2-1.1.1.3","1.2.1.0/24-1.2.2.0/24"。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 客户端IP，支持格式有：单IP、IP范围、网段、网段范围。例如"1.1.1.1","1.1.1.2-1.1.1.3","1.2.1.0/24-1.2.2.0/24"。
     * @param Ip 客户端IP，支持格式有：单IP、IP范围、网段、网段范围。例如"1.1.1.1","1.1.1.2-1.1.1.3","1.2.1.0/24-1.2.2.0/24"。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 类型，取值有：
<li> block ：丢弃 ；</li><li> allow ：允许。</li> 
     * @return Type 类型，取值有：
<li> block ：丢弃 ；</li><li> allow ：允许。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，取值有：
<li> block ：丢弃 ；</li><li> allow ：允许。</li>
     * @param Type 类型，取值有：
<li> block ：丢弃 ；</li><li> allow ：允许。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 10位时间戳，例如1199116800。不填写系统取当前时间。 
     * @return UpdateTime 10位时间戳，例如1199116800。不填写系统取当前时间。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 10位时间戳，例如1199116800。不填写系统取当前时间。
     * @param UpdateTime 10位时间戳，例如1199116800。不填写系统取当前时间。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DDoSAllowBlockRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAllowBlockRule(DDoSAllowBlockRule source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

