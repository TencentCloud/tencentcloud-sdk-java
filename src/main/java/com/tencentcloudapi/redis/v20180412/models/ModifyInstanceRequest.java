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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest  extends AbstractModel{

    /**
    * 修改实例操作，如填写：rename-表示实例重命名；modifyProject-修改实例所属项目；modifyAutoRenew-修改实例续费标记
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例的新名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Integer AutoRenew;

    /**
     * 获取修改实例操作，如填写：rename-表示实例重命名；modifyProject-修改实例所属项目；modifyAutoRenew-修改实例续费标记
     * @return Operation 修改实例操作，如填写：rename-表示实例重命名；modifyProject-修改实例所属项目；modifyAutoRenew-修改实例续费标记
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置修改实例操作，如填写：rename-表示实例重命名；modifyProject-修改实例所属项目；modifyAutoRenew-修改实例续费标记
     * @param Operation 修改实例操作，如填写：rename-表示实例重命名；modifyProject-修改实例所属项目；modifyAutoRenew-修改实例续费标记
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取实例Id
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取实例的新名称
     * @return InstanceName 实例的新名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例的新名称
     * @param InstanceName 实例的新名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取项目Id
     * @return ProjectId 项目Id
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     * @return AutoRenew 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public Integer getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * 设置自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     * @param AutoRenew 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public void setAutoRenew(Integer AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);

    }
}

