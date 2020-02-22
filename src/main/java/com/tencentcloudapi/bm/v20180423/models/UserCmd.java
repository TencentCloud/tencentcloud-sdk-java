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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserCmd extends AbstractModel{

    /**
    * 用户自定义脚本名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 脚本自增ID
    */
    @SerializedName("AutoId")
    @Expose
    private Long AutoId;

    /**
    * 脚本ID
    */
    @SerializedName("CmdId")
    @Expose
    private String CmdId;

    /**
    * 脚本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 命令适用的操作系统类型
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
     * Get 用户自定义脚本名 
     * @return Alias 用户自定义脚本名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 用户自定义脚本名
     * @param Alias 用户自定义脚本名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get AppId 
     * @return AppId AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId
     * @param AppId AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 脚本自增ID 
     * @return AutoId 脚本自增ID
     */
    public Long getAutoId() {
        return this.AutoId;
    }

    /**
     * Set 脚本自增ID
     * @param AutoId 脚本自增ID
     */
    public void setAutoId(Long AutoId) {
        this.AutoId = AutoId;
    }

    /**
     * Get 脚本ID 
     * @return CmdId 脚本ID
     */
    public String getCmdId() {
        return this.CmdId;
    }

    /**
     * Set 脚本ID
     * @param CmdId 脚本ID
     */
    public void setCmdId(String CmdId) {
        this.CmdId = CmdId;
    }

    /**
     * Get 脚本内容 
     * @return Content 脚本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 脚本内容
     * @param Content 脚本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 命令适用的操作系统类型 
     * @return OsType 命令适用的操作系统类型
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 命令适用的操作系统类型
     * @param OsType 命令适用的操作系统类型
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AutoId", this.AutoId);
        this.setParamSimple(map, prefix + "CmdId", this.CmdId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

