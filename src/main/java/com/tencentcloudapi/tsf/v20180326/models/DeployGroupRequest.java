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

public class DeployGroupRequest extends AbstractModel{

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 程序包ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 部署组启动参数
    */
    @SerializedName("StartupParameters")
    @Expose
    private String StartupParameters;

    /**
    * 部署应用描述信息
    */
    @SerializedName("DeployDesc")
    @Expose
    private String DeployDesc;

    /**
    * 是否允许强制启动
    */
    @SerializedName("ForceStart")
    @Expose
    private Boolean ForceStart;

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 程序包ID 
     * @return PkgId 程序包ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 程序包ID
     * @param PkgId 程序包ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 部署组启动参数 
     * @return StartupParameters 部署组启动参数
     */
    public String getStartupParameters() {
        return this.StartupParameters;
    }

    /**
     * Set 部署组启动参数
     * @param StartupParameters 部署组启动参数
     */
    public void setStartupParameters(String StartupParameters) {
        this.StartupParameters = StartupParameters;
    }

    /**
     * Get 部署应用描述信息 
     * @return DeployDesc 部署应用描述信息
     */
    public String getDeployDesc() {
        return this.DeployDesc;
    }

    /**
     * Set 部署应用描述信息
     * @param DeployDesc 部署应用描述信息
     */
    public void setDeployDesc(String DeployDesc) {
        this.DeployDesc = DeployDesc;
    }

    /**
     * Get 是否允许强制启动 
     * @return ForceStart 是否允许强制启动
     */
    public Boolean getForceStart() {
        return this.ForceStart;
    }

    /**
     * Set 是否允许强制启动
     * @param ForceStart 是否允许强制启动
     */
    public void setForceStart(Boolean ForceStart) {
        this.ForceStart = ForceStart;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "StartupParameters", this.StartupParameters);
        this.setParamSimple(map, prefix + "DeployDesc", this.DeployDesc);
        this.setParamSimple(map, prefix + "ForceStart", this.ForceStart);

    }
}

