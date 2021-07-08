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

public class ModifyPluginRequest extends AbstractModel{

    /**
    * 要修改的插件ID。
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 要修改的API网关插件名称。最长50个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 要修改的插件描述，限定200字以内。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 要修改的插件定义语句，支持json。
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
     * Get 要修改的插件ID。 
     * @return PluginId 要修改的插件ID。
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 要修改的插件ID。
     * @param PluginId 要修改的插件ID。
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 要修改的API网关插件名称。最长50个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。 
     * @return PluginName 要修改的API网关插件名称。最长50个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 要修改的API网关插件名称。最长50个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
     * @param PluginName 要修改的API网关插件名称。最长50个字符，支持 a-z,A-Z,0-9,_, 必须字母开头，字母或者数字结尾。
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 要修改的插件描述，限定200字以内。 
     * @return Description 要修改的插件描述，限定200字以内。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 要修改的插件描述，限定200字以内。
     * @param Description 要修改的插件描述，限定200字以内。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 要修改的插件定义语句，支持json。 
     * @return PluginData 要修改的插件定义语句，支持json。
     */
    public String getPluginData() {
        return this.PluginData;
    }

    /**
     * Set 要修改的插件定义语句，支持json。
     * @param PluginData 要修改的插件定义语句，支持json。
     */
    public void setPluginData(String PluginData) {
        this.PluginData = PluginData;
    }

    public ModifyPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPluginRequest(ModifyPluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PluginData != null) {
            this.PluginData = new String(source.PluginData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);

    }
}

