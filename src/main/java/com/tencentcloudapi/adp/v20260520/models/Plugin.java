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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Plugin extends AbstractModel {

    /**
    * 创建时间，unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 插件运营管理信息
    */
    @SerializedName("Operation")
    @Expose
    private PluginOperation Operation;

    /**
    * 插件id
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 插件版本号
    */
    @SerializedName("PluginVersion")
    @Expose
    private Long PluginVersion;

    /**
    * 插件基础信息
    */
    @SerializedName("Profile")
    @Expose
    private PluginProfile Profile;

    /**
    * 插件统计信息
    */
    @SerializedName("Statistics")
    @Expose
    private PluginStatistics Statistics;

    /**
    * <p>插件状态，1:可用，2:不可用 </p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 工具列表
    */
    @SerializedName("ToolList")
    @Expose
    private Tool [] ToolList;

    /**
    * 更新时间，Unix时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 用户维度的插件状态信息
    */
    @SerializedName("UserState")
    @Expose
    private PluginUserState UserState;

    /**
     * Get 创建时间，unix时间戳 
     * @return CreateTime 创建时间，unix时间戳
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，unix时间戳
     * @param CreateTime 创建时间，unix时间戳
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 插件运营管理信息 
     * @return Operation 插件运营管理信息
     */
    public PluginOperation getOperation() {
        return this.Operation;
    }

    /**
     * Set 插件运营管理信息
     * @param Operation 插件运营管理信息
     */
    public void setOperation(PluginOperation Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 插件id 
     * @return PluginId 插件id
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件id
     * @param PluginId 插件id
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 插件版本号 
     * @return PluginVersion 插件版本号
     */
    public Long getPluginVersion() {
        return this.PluginVersion;
    }

    /**
     * Set 插件版本号
     * @param PluginVersion 插件版本号
     */
    public void setPluginVersion(Long PluginVersion) {
        this.PluginVersion = PluginVersion;
    }

    /**
     * Get 插件基础信息 
     * @return Profile 插件基础信息
     */
    public PluginProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set 插件基础信息
     * @param Profile 插件基础信息
     */
    public void setProfile(PluginProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 插件统计信息 
     * @return Statistics 插件统计信息
     */
    public PluginStatistics getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 插件统计信息
     * @param Statistics 插件统计信息
     */
    public void setStatistics(PluginStatistics Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get <p>插件状态，1:可用，2:不可用 </p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li></ul> 
     * @return Status <p>插件状态，1:可用，2:不可用 </p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>插件状态，1:可用，2:不可用 </p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li></ul>
     * @param Status <p>插件状态，1:可用，2:不可用 </p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 工具列表 
     * @return ToolList 工具列表
     */
    public Tool [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set 工具列表
     * @param ToolList 工具列表
     */
    public void setToolList(Tool [] ToolList) {
        this.ToolList = ToolList;
    }

    /**
     * Get 更新时间，Unix时间戳 
     * @return UpdateTime 更新时间，Unix时间戳
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，Unix时间戳
     * @param UpdateTime 更新时间，Unix时间戳
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户维度的插件状态信息 
     * @return UserState 用户维度的插件状态信息
     */
    public PluginUserState getUserState() {
        return this.UserState;
    }

    /**
     * Set 用户维度的插件状态信息
     * @param UserState 用户维度的插件状态信息
     */
    public void setUserState(PluginUserState UserState) {
        this.UserState = UserState;
    }

    public Plugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Plugin(Plugin source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Operation != null) {
            this.Operation = new PluginOperation(source.Operation);
        }
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginVersion != null) {
            this.PluginVersion = new Long(source.PluginVersion);
        }
        if (source.Profile != null) {
            this.Profile = new PluginProfile(source.Profile);
        }
        if (source.Statistics != null) {
            this.Statistics = new PluginStatistics(source.Statistics);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ToolList != null) {
            this.ToolList = new Tool[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new Tool(source.ToolList[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UserState != null) {
            this.UserState = new PluginUserState(source.UserState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Operation.", this.Operation);
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginVersion", this.PluginVersion);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "UserState.", this.UserState);

    }
}

