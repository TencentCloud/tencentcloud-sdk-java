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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdsAuditInstance  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 续费标识
    */
    @SerializedName("RenewFlag")
    @Expose
    private Integer RenewFlag;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 付费模式（数据安全审计只支持预付费：1）
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * 实例创建时间，格式： yyyy-mm-dd HH:ii:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例过期时间，格式：yyyy-mm-dd HH:ii:ss
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取用户AppId
     * @return AppId 用户AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * 设置用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取用户Uin
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取续费标识
     * @return RenewFlag 续费标识
     */
    public Integer getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置续费标识
     * @param RenewFlag 续费标识
     */
    public void setRenewFlag(Integer RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 获取所属地域
     * @return Region 所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置所属地域
     * @param Region 所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取付费模式（数据安全审计只支持预付费：1）
     * @return PayMode 付费模式（数据安全审计只支持预付费：1）
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置付费模式（数据安全审计只支持预付费：1）
     * @param PayMode 付费模式（数据安全审计只支持预付费：1）
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
     * @return Status 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
     * @param Status 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
     * @return IsolatedTimestamp 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * 设置实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
     * @param IsolatedTimestamp 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * 获取实例创建时间，格式： yyyy-mm-dd HH:ii:ss
     * @return CreateTime 实例创建时间，格式： yyyy-mm-dd HH:ii:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置实例创建时间，格式： yyyy-mm-dd HH:ii:ss
     * @param CreateTime 实例创建时间，格式： yyyy-mm-dd HH:ii:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取实例过期时间，格式：yyyy-mm-dd HH:ii:ss
     * @return ExpireTime 实例过期时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置实例过期时间，格式：yyyy-mm-dd HH:ii:ss
     * @param ExpireTime 实例过期时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

