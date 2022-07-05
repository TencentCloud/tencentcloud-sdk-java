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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyChcAttributeRequest extends AbstractModel{

    /**
    * CHC物理服务器ID。
    */
    @SerializedName("ChcIds")
    @Expose
    private String [] ChcIds;

    /**
    * CHC物理服务器名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 服务器类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 合法字符为字母,数字, 横线和下划线
    */
    @SerializedName("BmcUser")
    @Expose
    private String BmcUser;

    /**
    * 密码8-16位字符, 允许数字，字母， 和特殊字符()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * bmc网络的安全组列表
    */
    @SerializedName("BmcSecurityGroupIds")
    @Expose
    private String [] BmcSecurityGroupIds;

    /**
     * Get CHC物理服务器ID。 
     * @return ChcIds CHC物理服务器ID。
     */
    public String [] getChcIds() {
        return this.ChcIds;
    }

    /**
     * Set CHC物理服务器ID。
     * @param ChcIds CHC物理服务器ID。
     */
    public void setChcIds(String [] ChcIds) {
        this.ChcIds = ChcIds;
    }

    /**
     * Get CHC物理服务器名称 
     * @return InstanceName CHC物理服务器名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CHC物理服务器名称
     * @param InstanceName CHC物理服务器名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 服务器类型 
     * @return DeviceType 服务器类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 服务器类型
     * @param DeviceType 服务器类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 合法字符为字母,数字, 横线和下划线 
     * @return BmcUser 合法字符为字母,数字, 横线和下划线
     */
    public String getBmcUser() {
        return this.BmcUser;
    }

    /**
     * Set 合法字符为字母,数字, 横线和下划线
     * @param BmcUser 合法字符为字母,数字, 横线和下划线
     */
    public void setBmcUser(String BmcUser) {
        this.BmcUser = BmcUser;
    }

    /**
     * Get 密码8-16位字符, 允许数字，字母， 和特殊字符()`~!@#$%^&*-+=_|{}[]:;'<>,.?/ 
     * @return Password 密码8-16位字符, 允许数字，字母， 和特殊字符()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码8-16位字符, 允许数字，字母， 和特殊字符()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
     * @param Password 密码8-16位字符, 允许数字，字母， 和特殊字符()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get bmc网络的安全组列表 
     * @return BmcSecurityGroupIds bmc网络的安全组列表
     */
    public String [] getBmcSecurityGroupIds() {
        return this.BmcSecurityGroupIds;
    }

    /**
     * Set bmc网络的安全组列表
     * @param BmcSecurityGroupIds bmc网络的安全组列表
     */
    public void setBmcSecurityGroupIds(String [] BmcSecurityGroupIds) {
        this.BmcSecurityGroupIds = BmcSecurityGroupIds;
    }

    public ModifyChcAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyChcAttributeRequest(ModifyChcAttributeRequest source) {
        if (source.ChcIds != null) {
            this.ChcIds = new String[source.ChcIds.length];
            for (int i = 0; i < source.ChcIds.length; i++) {
                this.ChcIds[i] = new String(source.ChcIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.BmcUser != null) {
            this.BmcUser = new String(source.BmcUser);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.BmcSecurityGroupIds != null) {
            this.BmcSecurityGroupIds = new String[source.BmcSecurityGroupIds.length];
            for (int i = 0; i < source.BmcSecurityGroupIds.length; i++) {
                this.BmcSecurityGroupIds[i] = new String(source.BmcSecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChcIds.", this.ChcIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "BmcUser", this.BmcUser);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "BmcSecurityGroupIds.", this.BmcSecurityGroupIds);

    }
}

