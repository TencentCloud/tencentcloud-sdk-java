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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCfsPGroupRequest extends AbstractModel{

    /**
    * 权限组 ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 权限组名称，1-64个字符且只能为中文，字母，数字，下划线或横线
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权限组描述信息，1-255个字符
    */
    @SerializedName("DescInfo")
    @Expose
    private String DescInfo;

    /**
     * Get 权限组 ID 
     * @return PGroupId 权限组 ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID
     * @param PGroupId 权限组 ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 权限组名称，1-64个字符且只能为中文，字母，数字，下划线或横线 
     * @return Name 权限组名称，1-64个字符且只能为中文，字母，数字，下划线或横线
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权限组名称，1-64个字符且只能为中文，字母，数字，下划线或横线
     * @param Name 权限组名称，1-64个字符且只能为中文，字母，数字，下划线或横线
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权限组描述信息，1-255个字符 
     * @return DescInfo 权限组描述信息，1-255个字符
     */
    public String getDescInfo() {
        return this.DescInfo;
    }

    /**
     * Set 权限组描述信息，1-255个字符
     * @param DescInfo 权限组描述信息，1-255个字符
     */
    public void setDescInfo(String DescInfo) {
        this.DescInfo = DescInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescInfo", this.DescInfo);

    }
}

