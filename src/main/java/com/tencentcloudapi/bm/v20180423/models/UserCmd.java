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

public class UserCmd  extends AbstractModel{

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
    private Integer AppId;

    /**
    * 脚本自增ID
    */
    @SerializedName("AutoId")
    @Expose
    private Integer AutoId;

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
     * 获取用户自定义脚本名
     * @return Alias 用户自定义脚本名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置用户自定义脚本名
     * @param Alias 用户自定义脚本名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取AppId
     * @return AppId AppId
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置AppId
     * @param AppId AppId
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取脚本自增ID
     * @return AutoId 脚本自增ID
     */
    public Integer getAutoId() {
        return this.AutoId;
    }

    /**
     * 设置脚本自增ID
     * @param AutoId 脚本自增ID
     */
    public void setAutoId(Integer AutoId) {
        this.AutoId = AutoId;
    }

    /**
     * 获取脚本ID
     * @return CmdId 脚本ID
     */
    public String getCmdId() {
        return this.CmdId;
    }

    /**
     * 设置脚本ID
     * @param CmdId 脚本ID
     */
    public void setCmdId(String CmdId) {
        this.CmdId = CmdId;
    }

    /**
     * 获取脚本内容
     * @return Content 脚本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * 设置脚本内容
     * @param Content 脚本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取修改时间
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * 设置修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * 获取命令适用的操作系统类型
     * @return OsType 命令适用的操作系统类型
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * 设置命令适用的操作系统类型
     * @param OsType 命令适用的操作系统类型
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * 内部实现，用户禁止调用
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

