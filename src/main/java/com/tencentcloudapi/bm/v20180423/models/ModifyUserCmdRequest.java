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

public class ModifyUserCmdRequest extends AbstractModel{

    /**
    * 待修改的脚本ID
    */
    @SerializedName("CmdId")
    @Expose
    private String CmdId;

    /**
    * 待修改的脚本名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 脚本适用的操作系统类型
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 待修改的脚本内容，必须经过base64编码
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 待修改的脚本ID 
     * @return CmdId 待修改的脚本ID
     */
    public String getCmdId() {
        return this.CmdId;
    }

    /**
     * Set 待修改的脚本ID
     * @param CmdId 待修改的脚本ID
     */
    public void setCmdId(String CmdId) {
        this.CmdId = CmdId;
    }

    /**
     * Get 待修改的脚本名称 
     * @return Alias 待修改的脚本名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 待修改的脚本名称
     * @param Alias 待修改的脚本名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 脚本适用的操作系统类型 
     * @return OsType 脚本适用的操作系统类型
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 脚本适用的操作系统类型
     * @param OsType 脚本适用的操作系统类型
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 待修改的脚本内容，必须经过base64编码 
     * @return Content 待修改的脚本内容，必须经过base64编码
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 待修改的脚本内容，必须经过base64编码
     * @param Content 待修改的脚本内容，必须经过base64编码
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmdId", this.CmdId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

