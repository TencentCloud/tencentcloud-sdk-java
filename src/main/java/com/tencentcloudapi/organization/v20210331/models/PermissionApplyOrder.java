/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionApplyOrder extends AbstractModel {

    /**
    * <p>申请单 ID</p>
    */
    @SerializedName("ApplyId")
    @Expose
    private String ApplyId;

    /**
    * <p>申请人用户 ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>申请人用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>目标成员账号 UIN</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * <p>目标成员账号名称</p>
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * <p>申请的权限配置</p>
    */
    @SerializedName("RoleConfigurations")
    @Expose
    private ApplyRoleConfiguration [] RoleConfigurations;

    /**
    * <p>申请单状态</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>审批意见</p>
    */
    @SerializedName("AuditOpinion")
    @Expose
    private String AuditOpinion;

    /**
    * <p>审批时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p><p>未审批为空</p>
    */
    @SerializedName("AuditTime")
    @Expose
    private String AuditTime;

    /**
     * Get <p>申请单 ID</p> 
     * @return ApplyId <p>申请单 ID</p>
     */
    public String getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set <p>申请单 ID</p>
     * @param ApplyId <p>申请单 ID</p>
     */
    public void setApplyId(String ApplyId) {
        this.ApplyId = ApplyId;
    }

    /**
     * Get <p>申请人用户 ID</p> 
     * @return UserId <p>申请人用户 ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>申请人用户 ID</p>
     * @param UserId <p>申请人用户 ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>申请人用户名</p> 
     * @return UserName <p>申请人用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>申请人用户名</p>
     * @param UserName <p>申请人用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>目标成员账号 UIN</p> 
     * @return TargetUin <p>目标成员账号 UIN</p>
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>目标成员账号 UIN</p>
     * @param TargetUin <p>目标成员账号 UIN</p>
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get <p>目标成员账号名称</p> 
     * @return TargetName <p>目标成员账号名称</p>
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set <p>目标成员账号名称</p>
     * @param TargetName <p>目标成员账号名称</p>
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get <p>申请的权限配置</p> 
     * @return RoleConfigurations <p>申请的权限配置</p>
     */
    public ApplyRoleConfiguration [] getRoleConfigurations() {
        return this.RoleConfigurations;
    }

    /**
     * Set <p>申请的权限配置</p>
     * @param RoleConfigurations <p>申请的权限配置</p>
     */
    public void setRoleConfigurations(ApplyRoleConfiguration [] RoleConfigurations) {
        this.RoleConfigurations = RoleConfigurations;
    }

    /**
     * Get <p>申请单状态</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul> 
     * @return Status <p>申请单状态</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>申请单状态</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
     * @param Status <p>申请单状态</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>审批意见</p> 
     * @return AuditOpinion <p>审批意见</p>
     */
    public String getAuditOpinion() {
        return this.AuditOpinion;
    }

    /**
     * Set <p>审批意见</p>
     * @param AuditOpinion <p>审批意见</p>
     */
    public void setAuditOpinion(String AuditOpinion) {
        this.AuditOpinion = AuditOpinion;
    }

    /**
     * Get <p>审批时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p><p>未审批为空</p> 
     * @return AuditTime <p>审批时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p><p>未审批为空</p>
     */
    public String getAuditTime() {
        return this.AuditTime;
    }

    /**
     * Set <p>审批时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p><p>未审批为空</p>
     * @param AuditTime <p>审批时间</p><p>参数格式：YYYY-M-DD hh:mm:ss</p><p>未审批为空</p>
     */
    public void setAuditTime(String AuditTime) {
        this.AuditTime = AuditTime;
    }

    public PermissionApplyOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionApplyOrder(PermissionApplyOrder source) {
        if (source.ApplyId != null) {
            this.ApplyId = new String(source.ApplyId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.RoleConfigurations != null) {
            this.RoleConfigurations = new ApplyRoleConfiguration[source.RoleConfigurations.length];
            for (int i = 0; i < source.RoleConfigurations.length; i++) {
                this.RoleConfigurations[i] = new ApplyRoleConfiguration(source.RoleConfigurations[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AuditOpinion != null) {
            this.AuditOpinion = new String(source.AuditOpinion);
        }
        if (source.AuditTime != null) {
            this.AuditTime = new String(source.AuditTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamArrayObj(map, prefix + "RoleConfigurations.", this.RoleConfigurations);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AuditOpinion", this.AuditOpinion);
        this.setParamSimple(map, prefix + "AuditTime", this.AuditTime);

    }
}

