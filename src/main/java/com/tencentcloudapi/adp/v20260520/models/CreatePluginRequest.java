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

public class CreatePluginRequest extends AbstractModel {

    /**
    * <p>插件基础资料</p>
    */
    @SerializedName("Profile")
    @Expose
    private PluginProfile Profile;

    /**
    * <p>插件类型配置</p>
    */
    @SerializedName("Config")
    @Expose
    private PluginConfig Config;

    /**
    * <p>当前空间id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>插件的工具列表</p>
    */
    @SerializedName("ToolList")
    @Expose
    private Tool [] ToolList;

    /**
    * <p>登录用户主账号(集成商模式必填)</p>
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * <p>登录用户子账号(集成商模式必填)</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get <p>插件基础资料</p> 
     * @return Profile <p>插件基础资料</p>
     */
    public PluginProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>插件基础资料</p>
     * @param Profile <p>插件基础资料</p>
     */
    public void setProfile(PluginProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>插件类型配置</p> 
     * @return Config <p>插件类型配置</p>
     */
    public PluginConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>插件类型配置</p>
     * @param Config <p>插件类型配置</p>
     */
    public void setConfig(PluginConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>当前空间id</p> 
     * @return SpaceId <p>当前空间id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>当前空间id</p>
     * @param SpaceId <p>当前空间id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>插件的工具列表</p> 
     * @return ToolList <p>插件的工具列表</p>
     */
    public Tool [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>插件的工具列表</p>
     * @param ToolList <p>插件的工具列表</p>
     */
    public void setToolList(Tool [] ToolList) {
        this.ToolList = ToolList;
    }

    /**
     * Get <p>登录用户主账号(集成商模式必填)</p> 
     * @return LoginUin <p>登录用户主账号(集成商模式必填)</p>
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set <p>登录用户主账号(集成商模式必填)</p>
     * @param LoginUin <p>登录用户主账号(集成商模式必填)</p>
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get <p>登录用户子账号(集成商模式必填)</p> 
     * @return LoginSubAccountUin <p>登录用户子账号(集成商模式必填)</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>登录用户子账号(集成商模式必填)</p>
     * @param LoginSubAccountUin <p>登录用户子账号(集成商模式必填)</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public CreatePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePluginRequest(CreatePluginRequest source) {
        if (source.Profile != null) {
            this.Profile = new PluginProfile(source.Profile);
        }
        if (source.Config != null) {
            this.Config = new PluginConfig(source.Config);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.ToolList != null) {
            this.ToolList = new Tool[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new Tool(source.ToolList[i]);
            }
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

