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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAccountInfo extends AbstractModel {

    /**
    * 腾讯云主账号UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 腾讯云子账号UIN
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 子账号名称
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * 子账号在Linux下的UID
    */
    @SerializedName("LinuxUid")
    @Expose
    private Long LinuxUid;

    /**
    * 子账号在Linux下的GID
    */
    @SerializedName("LinuxGid")
    @Expose
    private Long LinuxGid;

    /**
    * 子账号在Linux下的用户名
    */
    @SerializedName("LinuxUserName")
    @Expose
    private String LinuxUserName;

    /**
    * 是否开启 root 登录
    */
    @SerializedName("EnableRootLogin")
    @Expose
    private Boolean EnableRootLogin;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 腾讯云主账号UIN 
     * @return Uin 腾讯云主账号UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云主账号UIN
     * @param Uin 腾讯云主账号UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 腾讯云子账号UIN 
     * @return SubUin 腾讯云子账号UIN
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 腾讯云子账号UIN
     * @param SubUin 腾讯云子账号UIN
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 子账号名称 
     * @return SubUinName 子账号名称
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set 子账号名称
     * @param SubUinName 子账号名称
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get 子账号在Linux下的UID 
     * @return LinuxUid 子账号在Linux下的UID
     */
    public Long getLinuxUid() {
        return this.LinuxUid;
    }

    /**
     * Set 子账号在Linux下的UID
     * @param LinuxUid 子账号在Linux下的UID
     */
    public void setLinuxUid(Long LinuxUid) {
        this.LinuxUid = LinuxUid;
    }

    /**
     * Get 子账号在Linux下的GID 
     * @return LinuxGid 子账号在Linux下的GID
     */
    public Long getLinuxGid() {
        return this.LinuxGid;
    }

    /**
     * Set 子账号在Linux下的GID
     * @param LinuxGid 子账号在Linux下的GID
     */
    public void setLinuxGid(Long LinuxGid) {
        this.LinuxGid = LinuxGid;
    }

    /**
     * Get 子账号在Linux下的用户名 
     * @return LinuxUserName 子账号在Linux下的用户名
     */
    public String getLinuxUserName() {
        return this.LinuxUserName;
    }

    /**
     * Set 子账号在Linux下的用户名
     * @param LinuxUserName 子账号在Linux下的用户名
     */
    public void setLinuxUserName(String LinuxUserName) {
        this.LinuxUserName = LinuxUserName;
    }

    /**
     * Get 是否开启 root 登录 
     * @return EnableRootLogin 是否开启 root 登录
     */
    public Boolean getEnableRootLogin() {
        return this.EnableRootLogin;
    }

    /**
     * Set 是否开启 root 登录
     * @param EnableRootLogin 是否开启 root 登录
     */
    public void setEnableRootLogin(Boolean EnableRootLogin) {
        this.EnableRootLogin = EnableRootLogin;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SubAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubAccountInfo(SubAccountInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.LinuxUid != null) {
            this.LinuxUid = new Long(source.LinuxUid);
        }
        if (source.LinuxGid != null) {
            this.LinuxGid = new Long(source.LinuxGid);
        }
        if (source.LinuxUserName != null) {
            this.LinuxUserName = new String(source.LinuxUserName);
        }
        if (source.EnableRootLogin != null) {
            this.EnableRootLogin = new Boolean(source.EnableRootLogin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamSimple(map, prefix + "LinuxUid", this.LinuxUid);
        this.setParamSimple(map, prefix + "LinuxGid", this.LinuxGid);
        this.setParamSimple(map, prefix + "LinuxUserName", this.LinuxUserName);
        this.setParamSimple(map, prefix + "EnableRootLogin", this.EnableRootLogin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

