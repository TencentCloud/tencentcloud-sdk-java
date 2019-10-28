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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployGroupInfo  extends AbstractModel{

    /**
    * 置放群组 ID。
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * 置放群组名称。
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 置放群组描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 置放群组实例配额。
    */
    @SerializedName("Quota")
    @Expose
    private Integer Quota;

    /**
     * 获取置放群组 ID。
     * @return DeployGroupId 置放群组 ID。
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * 设置置放群组 ID。
     * @param DeployGroupId 置放群组 ID。
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * 获取置放群组名称。
     * @return DeployGroupName 置放群组名称。
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * 设置置放群组名称。
     * @param DeployGroupName 置放群组名称。
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * 获取创建时间。
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取置放群组描述。
     * @return Description 置放群组描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置置放群组描述。
     * @param Description 置放群组描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取置放群组实例配额。
     * @return Quota 置放群组实例配额。
     */
    public Integer getQuota() {
        return this.Quota;
    }

    /**
     * 设置置放群组实例配额。
     * @param Quota 置放群组实例配额。
     */
    public void setQuota(Integer Quota) {
        this.Quota = Quota;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

