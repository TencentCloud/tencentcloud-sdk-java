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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountConfigRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：tdsqlshard-kpkvq5oj，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账号的名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账号的域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 配置列表，每一个元素是Config和Value的组合
    */
    @SerializedName("Configs")
    @Expose
    private ConfigValue [] Configs;

    /**
     * Get 实例 ID，格式如：tdsqlshard-kpkvq5oj，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：tdsqlshard-kpkvq5oj，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：tdsqlshard-kpkvq5oj，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：tdsqlshard-kpkvq5oj，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 账号的名称 
     * @return UserName 账号的名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账号的名称
     * @param UserName 账号的名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账号的域名 
     * @return Host 账号的域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 账号的域名
     * @param Host 账号的域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 配置列表，每一个元素是Config和Value的组合 
     * @return Configs 配置列表，每一个元素是Config和Value的组合
     */
    public ConfigValue [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set 配置列表，每一个元素是Config和Value的组合
     * @param Configs 配置列表，每一个元素是Config和Value的组合
     */
    public void setConfigs(ConfigValue [] Configs) {
        this.Configs = Configs;
    }

    public ModifyAccountConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountConfigRequest(ModifyAccountConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Configs != null) {
            this.Configs = new ConfigValue[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new ConfigValue(source.Configs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

