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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ticket extends AbstractModel {

    /**
    * <p>数据库主键</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>工单ID,id-s3ed4r5e</p>
    */
    @SerializedName("TicketId")
    @Expose
    private String TicketId;

    /**
    * <p>工单类型，0-运维访问工单，1-权限工单, 2-数据库变更工单,3-自动执行命令/脚本工单</p>
    */
    @SerializedName("TicketType")
    @Expose
    private Long TicketType;

    /**
    * <p>acl权限</p>
    */
    @SerializedName("Acl")
    @Expose
    private Acl Acl;

    /**
    * <p>运维开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>运维结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>工单状态，0待提交(草稿)，1待审批，2批准，3已执行，4驳回,5删除，6过期</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>申请时间</p>
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * <p>申请人用户Id</p>
    */
    @SerializedName("ApplyUser")
    @Expose
    private Long ApplyUser;

    /**
    * <p>审批人uin</p>
    */
    @SerializedName("ApproveUser")
    @Expose
    private String ApproveUser;

    /**
    * <p>工单审批备注</p>
    */
    @SerializedName("ApproveDesc")
    @Expose
    private String ApproveDesc;

    /**
    * <p>acl权限Id</p>
    */
    @SerializedName("AclId")
    @Expose
    private Long AclId;

    /**
    * <p>待审批状态下，可以审批的人</p>
    */
    @SerializedName("ApproveUserSet")
    @Expose
    private String [] ApproveUserSet;

    /**
    * <p>审批人信息</p>
    */
    @SerializedName("ApproveUserInfoSet")
    @Expose
    private DepartmentManagerUser [] ApproveUserInfoSet;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>申请权限</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>审批时间</p>
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * <p>部门ID</p>
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * <p>部门名称</p>
    */
    @SerializedName("DepartmentName")
    @Expose
    private String DepartmentName;

    /**
    * <p>部门Sequence</p>
    */
    @SerializedName("DepartmentSequence")
    @Expose
    private Long DepartmentSequence;

    /**
    * <p>申请人用户名</p>
    */
    @SerializedName("ApplyUserName")
    @Expose
    private String ApplyUserName;

    /**
    * <p>申请人真实姓名</p>
    */
    @SerializedName("ApplyRealName")
    @Expose
    private String ApplyRealName;

    /**
    * <p>申请时间戳，微妙</p>
    */
    @SerializedName("ApplyTimeVersion")
    @Expose
    private Long ApplyTimeVersion;

    /**
     * Get <p>数据库主键</p> 
     * @return Id <p>数据库主键</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数据库主键</p>
     * @param Id <p>数据库主键</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>工单ID,id-s3ed4r5e</p> 
     * @return TicketId <p>工单ID,id-s3ed4r5e</p>
     */
    public String getTicketId() {
        return this.TicketId;
    }

    /**
     * Set <p>工单ID,id-s3ed4r5e</p>
     * @param TicketId <p>工单ID,id-s3ed4r5e</p>
     */
    public void setTicketId(String TicketId) {
        this.TicketId = TicketId;
    }

    /**
     * Get <p>工单类型，0-运维访问工单，1-权限工单, 2-数据库变更工单,3-自动执行命令/脚本工单</p> 
     * @return TicketType <p>工单类型，0-运维访问工单，1-权限工单, 2-数据库变更工单,3-自动执行命令/脚本工单</p>
     */
    public Long getTicketType() {
        return this.TicketType;
    }

    /**
     * Set <p>工单类型，0-运维访问工单，1-权限工单, 2-数据库变更工单,3-自动执行命令/脚本工单</p>
     * @param TicketType <p>工单类型，0-运维访问工单，1-权限工单, 2-数据库变更工单,3-自动执行命令/脚本工单</p>
     */
    public void setTicketType(Long TicketType) {
        this.TicketType = TicketType;
    }

    /**
     * Get <p>acl权限</p> 
     * @return Acl <p>acl权限</p>
     */
    public Acl getAcl() {
        return this.Acl;
    }

    /**
     * Set <p>acl权限</p>
     * @param Acl <p>acl权限</p>
     */
    public void setAcl(Acl Acl) {
        this.Acl = Acl;
    }

    /**
     * Get <p>运维开始时间</p> 
     * @return StartTime <p>运维开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>运维开始时间</p>
     * @param StartTime <p>运维开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>运维结束时间</p> 
     * @return EndTime <p>运维结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>运维结束时间</p>
     * @param EndTime <p>运维结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>工单状态，0待提交(草稿)，1待审批，2批准，3已执行，4驳回,5删除，6过期</p> 
     * @return Status <p>工单状态，0待提交(草稿)，1待审批，2批准，3已执行，4驳回,5删除，6过期</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>工单状态，0待提交(草稿)，1待审批，2批准，3已执行，4驳回,5删除，6过期</p>
     * @param Status <p>工单状态，0待提交(草稿)，1待审批，2批准，3已执行，4驳回,5删除，6过期</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>申请时间</p> 
     * @return ApplyTime <p>申请时间</p>
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set <p>申请时间</p>
     * @param ApplyTime <p>申请时间</p>
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get <p>申请人用户Id</p> 
     * @return ApplyUser <p>申请人用户Id</p>
     */
    public Long getApplyUser() {
        return this.ApplyUser;
    }

    /**
     * Set <p>申请人用户Id</p>
     * @param ApplyUser <p>申请人用户Id</p>
     */
    public void setApplyUser(Long ApplyUser) {
        this.ApplyUser = ApplyUser;
    }

    /**
     * Get <p>审批人uin</p> 
     * @return ApproveUser <p>审批人uin</p>
     */
    public String getApproveUser() {
        return this.ApproveUser;
    }

    /**
     * Set <p>审批人uin</p>
     * @param ApproveUser <p>审批人uin</p>
     */
    public void setApproveUser(String ApproveUser) {
        this.ApproveUser = ApproveUser;
    }

    /**
     * Get <p>工单审批备注</p> 
     * @return ApproveDesc <p>工单审批备注</p>
     */
    public String getApproveDesc() {
        return this.ApproveDesc;
    }

    /**
     * Set <p>工单审批备注</p>
     * @param ApproveDesc <p>工单审批备注</p>
     */
    public void setApproveDesc(String ApproveDesc) {
        this.ApproveDesc = ApproveDesc;
    }

    /**
     * Get <p>acl权限Id</p> 
     * @return AclId <p>acl权限Id</p>
     */
    public Long getAclId() {
        return this.AclId;
    }

    /**
     * Set <p>acl权限Id</p>
     * @param AclId <p>acl权限Id</p>
     */
    public void setAclId(Long AclId) {
        this.AclId = AclId;
    }

    /**
     * Get <p>待审批状态下，可以审批的人</p> 
     * @return ApproveUserSet <p>待审批状态下，可以审批的人</p>
     */
    public String [] getApproveUserSet() {
        return this.ApproveUserSet;
    }

    /**
     * Set <p>待审批状态下，可以审批的人</p>
     * @param ApproveUserSet <p>待审批状态下，可以审批的人</p>
     */
    public void setApproveUserSet(String [] ApproveUserSet) {
        this.ApproveUserSet = ApproveUserSet;
    }

    /**
     * Get <p>审批人信息</p> 
     * @return ApproveUserInfoSet <p>审批人信息</p>
     */
    public DepartmentManagerUser [] getApproveUserInfoSet() {
        return this.ApproveUserInfoSet;
    }

    /**
     * Set <p>审批人信息</p>
     * @param ApproveUserInfoSet <p>审批人信息</p>
     */
    public void setApproveUserInfoSet(DepartmentManagerUser [] ApproveUserInfoSet) {
        this.ApproveUserInfoSet = ApproveUserInfoSet;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>申请权限</p> 
     * @return Name <p>申请权限</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>申请权限</p>
     * @param Name <p>申请权限</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>审批时间</p> 
     * @return ApproveTime <p>审批时间</p>
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set <p>审批时间</p>
     * @param ApproveTime <p>审批时间</p>
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get <p>部门ID</p> 
     * @return DepartmentId <p>部门ID</p>
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set <p>部门ID</p>
     * @param DepartmentId <p>部门ID</p>
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get <p>部门名称</p> 
     * @return DepartmentName <p>部门名称</p>
     */
    public String getDepartmentName() {
        return this.DepartmentName;
    }

    /**
     * Set <p>部门名称</p>
     * @param DepartmentName <p>部门名称</p>
     */
    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    /**
     * Get <p>部门Sequence</p> 
     * @return DepartmentSequence <p>部门Sequence</p>
     */
    public Long getDepartmentSequence() {
        return this.DepartmentSequence;
    }

    /**
     * Set <p>部门Sequence</p>
     * @param DepartmentSequence <p>部门Sequence</p>
     */
    public void setDepartmentSequence(Long DepartmentSequence) {
        this.DepartmentSequence = DepartmentSequence;
    }

    /**
     * Get <p>申请人用户名</p> 
     * @return ApplyUserName <p>申请人用户名</p>
     */
    public String getApplyUserName() {
        return this.ApplyUserName;
    }

    /**
     * Set <p>申请人用户名</p>
     * @param ApplyUserName <p>申请人用户名</p>
     */
    public void setApplyUserName(String ApplyUserName) {
        this.ApplyUserName = ApplyUserName;
    }

    /**
     * Get <p>申请人真实姓名</p> 
     * @return ApplyRealName <p>申请人真实姓名</p>
     */
    public String getApplyRealName() {
        return this.ApplyRealName;
    }

    /**
     * Set <p>申请人真实姓名</p>
     * @param ApplyRealName <p>申请人真实姓名</p>
     */
    public void setApplyRealName(String ApplyRealName) {
        this.ApplyRealName = ApplyRealName;
    }

    /**
     * Get <p>申请时间戳，微妙</p> 
     * @return ApplyTimeVersion <p>申请时间戳，微妙</p>
     */
    public Long getApplyTimeVersion() {
        return this.ApplyTimeVersion;
    }

    /**
     * Set <p>申请时间戳，微妙</p>
     * @param ApplyTimeVersion <p>申请时间戳，微妙</p>
     */
    public void setApplyTimeVersion(Long ApplyTimeVersion) {
        this.ApplyTimeVersion = ApplyTimeVersion;
    }

    public Ticket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ticket(Ticket source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TicketId != null) {
            this.TicketId = new String(source.TicketId);
        }
        if (source.TicketType != null) {
            this.TicketType = new Long(source.TicketType);
        }
        if (source.Acl != null) {
            this.Acl = new Acl(source.Acl);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.ApplyUser != null) {
            this.ApplyUser = new Long(source.ApplyUser);
        }
        if (source.ApproveUser != null) {
            this.ApproveUser = new String(source.ApproveUser);
        }
        if (source.ApproveDesc != null) {
            this.ApproveDesc = new String(source.ApproveDesc);
        }
        if (source.AclId != null) {
            this.AclId = new Long(source.AclId);
        }
        if (source.ApproveUserSet != null) {
            this.ApproveUserSet = new String[source.ApproveUserSet.length];
            for (int i = 0; i < source.ApproveUserSet.length; i++) {
                this.ApproveUserSet[i] = new String(source.ApproveUserSet[i]);
            }
        }
        if (source.ApproveUserInfoSet != null) {
            this.ApproveUserInfoSet = new DepartmentManagerUser[source.ApproveUserInfoSet.length];
            for (int i = 0; i < source.ApproveUserInfoSet.length; i++) {
                this.ApproveUserInfoSet[i] = new DepartmentManagerUser(source.ApproveUserInfoSet[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.DepartmentName != null) {
            this.DepartmentName = new String(source.DepartmentName);
        }
        if (source.DepartmentSequence != null) {
            this.DepartmentSequence = new Long(source.DepartmentSequence);
        }
        if (source.ApplyUserName != null) {
            this.ApplyUserName = new String(source.ApplyUserName);
        }
        if (source.ApplyRealName != null) {
            this.ApplyRealName = new String(source.ApplyRealName);
        }
        if (source.ApplyTimeVersion != null) {
            this.ApplyTimeVersion = new Long(source.ApplyTimeVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TicketId", this.TicketId);
        this.setParamSimple(map, prefix + "TicketType", this.TicketType);
        this.setParamObj(map, prefix + "Acl.", this.Acl);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ApplyUser", this.ApplyUser);
        this.setParamSimple(map, prefix + "ApproveUser", this.ApproveUser);
        this.setParamSimple(map, prefix + "ApproveDesc", this.ApproveDesc);
        this.setParamSimple(map, prefix + "AclId", this.AclId);
        this.setParamArraySimple(map, prefix + "ApproveUserSet.", this.ApproveUserSet);
        this.setParamArrayObj(map, prefix + "ApproveUserInfoSet.", this.ApproveUserInfoSet);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "DepartmentName", this.DepartmentName);
        this.setParamSimple(map, prefix + "DepartmentSequence", this.DepartmentSequence);
        this.setParamSimple(map, prefix + "ApplyUserName", this.ApplyUserName);
        this.setParamSimple(map, prefix + "ApplyRealName", this.ApplyRealName);
        this.setParamSimple(map, prefix + "ApplyTimeVersion", this.ApplyTimeVersion);

    }
}

