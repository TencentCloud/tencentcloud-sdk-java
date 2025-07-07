/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancePluginInfo extends AbstractModel {

    /**
    * 插件名
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 插件版本
    */
    @SerializedName("PluginVersion")
    @Expose
    private String PluginVersion;

    /**
    * 插件描述
    */
    @SerializedName("PluginDesc")
    @Expose
    private String PluginDesc;

    /**
    * 插件状态：-2 已卸载 -1 卸载中 0 安装中 1 已安装
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 插件是否可卸载
    */
    @SerializedName("Removable")
    @Expose
    private Boolean Removable;

    /**
    * 0：系统插件
    */
    @SerializedName("PluginType")
    @Expose
    private Long PluginType;

    /**
    * 插件变更时间
    */
    @SerializedName("PluginUpdateTime")
    @Expose
    private String PluginUpdateTime;

    /**
     * Get 插件名 
     * @return PluginName 插件名
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 插件名
     * @param PluginName 插件名
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 插件版本 
     * @return PluginVersion 插件版本
     */
    public String getPluginVersion() {
        return this.PluginVersion;
    }

    /**
     * Set 插件版本
     * @param PluginVersion 插件版本
     */
    public void setPluginVersion(String PluginVersion) {
        this.PluginVersion = PluginVersion;
    }

    /**
     * Get 插件描述 
     * @return PluginDesc 插件描述
     */
    public String getPluginDesc() {
        return this.PluginDesc;
    }

    /**
     * Set 插件描述
     * @param PluginDesc 插件描述
     */
    public void setPluginDesc(String PluginDesc) {
        this.PluginDesc = PluginDesc;
    }

    /**
     * Get 插件状态：-2 已卸载 -1 卸载中 0 安装中 1 已安装 
     * @return Status 插件状态：-2 已卸载 -1 卸载中 0 安装中 1 已安装
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 插件状态：-2 已卸载 -1 卸载中 0 安装中 1 已安装
     * @param Status 插件状态：-2 已卸载 -1 卸载中 0 安装中 1 已安装
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 插件是否可卸载 
     * @return Removable 插件是否可卸载
     */
    public Boolean getRemovable() {
        return this.Removable;
    }

    /**
     * Set 插件是否可卸载
     * @param Removable 插件是否可卸载
     */
    public void setRemovable(Boolean Removable) {
        this.Removable = Removable;
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

    /**
     * Get 插件变更时间 
     * @return PluginUpdateTime 插件变更时间
     */
    public String getPluginUpdateTime() {
        return this.PluginUpdateTime;
    }

    /**
     * Set 插件变更时间
     * @param PluginUpdateTime 插件变更时间
     */
    public void setPluginUpdateTime(String PluginUpdateTime) {
        this.PluginUpdateTime = PluginUpdateTime;
    }

    public DescribeInstancePluginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancePluginInfo(DescribeInstancePluginInfo source) {
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginVersion != null) {
            this.PluginVersion = new String(source.PluginVersion);
        }
        if (source.PluginDesc != null) {
            this.PluginDesc = new String(source.PluginDesc);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Removable != null) {
            this.Removable = new Boolean(source.Removable);
        }
        if (source.PluginType != null) {
            this.PluginType = new Long(source.PluginType);
        }
        if (source.PluginUpdateTime != null) {
            this.PluginUpdateTime = new String(source.PluginUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginVersion", this.PluginVersion);
        this.setParamSimple(map, prefix + "PluginDesc", this.PluginDesc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Removable", this.Removable);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "PluginUpdateTime", this.PluginUpdateTime);

    }
}

