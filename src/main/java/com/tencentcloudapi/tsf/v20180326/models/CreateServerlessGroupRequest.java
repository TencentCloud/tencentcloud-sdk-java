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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServerlessGroupRequest extends AbstractModel{

    /**
    * 分组所属应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 程序包Id
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * VpcConfig对象
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
     * Get 分组所属应用ID 
     * @return ApplicationId 分组所属应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 分组所属应用ID
     * @param ApplicationId 分组所属应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线 
     * @return GroupName 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     * @param GroupName 分组名称字段，长度1~60，字母或下划线开头，可包含字母数字下划线
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 程序包Id 
     * @return PkgId 程序包Id
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 程序包Id
     * @param PkgId 程序包Id
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get VpcConfig对象 
     * @return VpcConfig VpcConfig对象
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set VpcConfig对象
     * @param VpcConfig VpcConfig对象
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);

    }
}

