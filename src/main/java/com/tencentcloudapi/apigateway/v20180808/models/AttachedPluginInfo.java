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

public class AttachedPluginInfo extends AbstractModel{

    /**
    * 插件ID。
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 环境信息。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 绑定时间。
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
    * 插件名称。
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 插件类型。
    */
    @SerializedName("PluginType")
    @Expose
    private String PluginType;

    /**
    * 插件描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 插件定义语句。
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
     * Get 插件ID。 
     * @return PluginId 插件ID。
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件ID。
     * @param PluginId 插件ID。
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 环境信息。 
     * @return Environment 环境信息。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境信息。
     * @param Environment 环境信息。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 绑定时间。 
     * @return AttachedTime 绑定时间。
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set 绑定时间。
     * @param AttachedTime 绑定时间。
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    /**
     * Get 插件名称。 
     * @return PluginName 插件名称。
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 插件名称。
     * @param PluginName 插件名称。
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 插件类型。 
     * @return PluginType 插件类型。
     */
    public String getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 插件类型。
     * @param PluginType 插件类型。
     */
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get 插件描述。 
     * @return Description 插件描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 插件描述。
     * @param Description 插件描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 插件定义语句。 
     * @return PluginData 插件定义语句。
     */
    public String getPluginData() {
        return this.PluginData;
    }

    /**
     * Set 插件定义语句。
     * @param PluginData 插件定义语句。
     */
    public void setPluginData(String PluginData) {
        this.PluginData = PluginData;
    }

    public AttachedPluginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedPluginInfo(AttachedPluginInfo source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.AttachedTime != null) {
            this.AttachedTime = new String(source.AttachedTime);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginType != null) {
            this.PluginType = new String(source.PluginType);
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
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);

    }
}

