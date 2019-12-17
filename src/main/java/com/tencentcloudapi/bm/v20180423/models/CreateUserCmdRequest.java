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

public class CreateUserCmdRequest extends AbstractModel{

    /**
    * 用户自定义脚本的名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 命令适用的操作系统类型，取值linux或xserver
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 脚本内容，必须经过base64编码
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 用户自定义脚本的名称 
     * @return Alias 用户自定义脚本的名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 用户自定义脚本的名称
     * @param Alias 用户自定义脚本的名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 命令适用的操作系统类型，取值linux或xserver 
     * @return OsType 命令适用的操作系统类型，取值linux或xserver
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 命令适用的操作系统类型，取值linux或xserver
     * @param OsType 命令适用的操作系统类型，取值linux或xserver
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 脚本内容，必须经过base64编码 
     * @return Content 脚本内容，必须经过base64编码
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 脚本内容，必须经过base64编码
     * @param Content 脚本内容，必须经过base64编码
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

