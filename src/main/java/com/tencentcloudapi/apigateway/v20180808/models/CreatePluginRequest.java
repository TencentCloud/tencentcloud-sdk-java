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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePluginRequest extends AbstractModel{

    /**
    * 用户自定义的插件名称。最长50个字符，最短2个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 插件类型。目前支持IPControl, TrafficControl, Cors, CustomReq, CustomAuth，Routing，TrafficControlByParameter, CircuitBreaker, ProxyCache。
    */
    @SerializedName("PluginType")
    @Expose
    private String PluginType;

    /**
    * 插件定义语句，支持json。
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
    * 插件描述，限定200字以内。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 用户自定义的插件名称。最长50个字符，最短2个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。 
     * @return PluginName 用户自定义的插件名称。最长50个字符，最短2个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 用户自定义的插件名称。最长50个字符，最短2个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
     * @param PluginName 用户自定义的插件名称。最长50个字符，最短2个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 插件类型。目前支持IPControl, TrafficControl, Cors, CustomReq, CustomAuth，Routing，TrafficControlByParameter, CircuitBreaker, ProxyCache。 
     * @return PluginType 插件类型。目前支持IPControl, TrafficControl, Cors, CustomReq, CustomAuth，Routing，TrafficControlByParameter, CircuitBreaker, ProxyCache。
     */
    public String getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 插件类型。目前支持IPControl, TrafficControl, Cors, CustomReq, CustomAuth，Routing，TrafficControlByParameter, CircuitBreaker, ProxyCache。
     * @param PluginType 插件类型。目前支持IPControl, TrafficControl, Cors, CustomReq, CustomAuth，Routing，TrafficControlByParameter, CircuitBreaker, ProxyCache。
     */
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get 插件定义语句，支持json。 
     * @return PluginData 插件定义语句，支持json。
     */
    public String getPluginData() {
        return this.PluginData;
    }

    /**
     * Set 插件定义语句，支持json。
     * @param PluginData 插件定义语句，支持json。
     */
    public void setPluginData(String PluginData) {
        this.PluginData = PluginData;
    }

    /**
     * Get 插件描述，限定200字以内。 
     * @return Description 插件描述，限定200字以内。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 插件描述，限定200字以内。
     * @param Description 插件描述，限定200字以内。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreatePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePluginRequest(CreatePluginRequest source) {
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginType != null) {
            this.PluginType = new String(source.PluginType);
        }
        if (source.PluginData != null) {
            this.PluginData = new String(source.PluginData);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

