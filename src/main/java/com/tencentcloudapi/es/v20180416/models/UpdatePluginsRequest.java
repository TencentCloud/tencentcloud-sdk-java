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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePluginsRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要安装的插件名列表
    */
    @SerializedName("InstallPluginList")
    @Expose
    private String [] InstallPluginList;

    /**
    * 需要卸载的插件名列表
    */
    @SerializedName("RemovePluginList")
    @Expose
    private String [] RemovePluginList;

    /**
    * 是否强制重启，默认值false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * 是否重新安装，默认值false
    */
    @SerializedName("ForceUpdate")
    @Expose
    private Boolean ForceUpdate;

    /**
    * 0：系统插件
    */
    @SerializedName("PluginType")
    @Expose
    private Long PluginType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要安装的插件名列表 
     * @return InstallPluginList 需要安装的插件名列表
     */
    public String [] getInstallPluginList() {
        return this.InstallPluginList;
    }

    /**
     * Set 需要安装的插件名列表
     * @param InstallPluginList 需要安装的插件名列表
     */
    public void setInstallPluginList(String [] InstallPluginList) {
        this.InstallPluginList = InstallPluginList;
    }

    /**
     * Get 需要卸载的插件名列表 
     * @return RemovePluginList 需要卸载的插件名列表
     */
    public String [] getRemovePluginList() {
        return this.RemovePluginList;
    }

    /**
     * Set 需要卸载的插件名列表
     * @param RemovePluginList 需要卸载的插件名列表
     */
    public void setRemovePluginList(String [] RemovePluginList) {
        this.RemovePluginList = RemovePluginList;
    }

    /**
     * Get 是否强制重启，默认值false 
     * @return ForceRestart 是否强制重启，默认值false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 是否强制重启，默认值false
     * @param ForceRestart 是否强制重启，默认值false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get 是否重新安装，默认值false 
     * @return ForceUpdate 是否重新安装，默认值false
     */
    public Boolean getForceUpdate() {
        return this.ForceUpdate;
    }

    /**
     * Set 是否重新安装，默认值false
     * @param ForceUpdate 是否重新安装，默认值false
     */
    public void setForceUpdate(Boolean ForceUpdate) {
        this.ForceUpdate = ForceUpdate;
    }

    /**
     * Get 0：系统插件 
     * @return PluginType 0：系统插件
     */
    public Long getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 0：系统插件
     * @param PluginType 0：系统插件
     */
    public void setPluginType(Long PluginType) {
        this.PluginType = PluginType;
    }

    public UpdatePluginsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePluginsRequest(UpdatePluginsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstallPluginList != null) {
            this.InstallPluginList = new String[source.InstallPluginList.length];
            for (int i = 0; i < source.InstallPluginList.length; i++) {
                this.InstallPluginList[i] = new String(source.InstallPluginList[i]);
            }
        }
        if (source.RemovePluginList != null) {
            this.RemovePluginList = new String[source.RemovePluginList.length];
            for (int i = 0; i < source.RemovePluginList.length; i++) {
                this.RemovePluginList[i] = new String(source.RemovePluginList[i]);
            }
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
        if (source.ForceUpdate != null) {
            this.ForceUpdate = new Boolean(source.ForceUpdate);
        }
        if (source.PluginType != null) {
            this.PluginType = new Long(source.PluginType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "InstallPluginList.", this.InstallPluginList);
        this.setParamArraySimple(map, prefix + "RemovePluginList.", this.RemovePluginList);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamSimple(map, prefix + "ForceUpdate", this.ForceUpdate);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);

    }
}

