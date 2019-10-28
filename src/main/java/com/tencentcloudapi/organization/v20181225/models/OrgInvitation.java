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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgInvitation  extends AbstractModel{

    /**
    * 邀请ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 被邀请UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 创建者UIN
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * 创建者名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 创建者邮箱
    */
    @SerializedName("HostMail")
    @Expose
    private String HostMail;

    /**
    * 邀请状态。-1：已过期，0：正常，1：已接受，2：已失效，3：已取消
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 企业组织类型
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * 邀请时间
    */
    @SerializedName("InviteTime")
    @Expose
    private String InviteTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * 获取邀请ID
     * @return Id 邀请ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * 设置邀请ID
     * @param Id 邀请ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * 获取被邀请UIN
     * @return Uin 被邀请UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * 设置被邀请UIN
     * @param Uin 被邀请UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取创建者UIN
     * @return HostUin 创建者UIN
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * 设置创建者UIN
     * @param HostUin 创建者UIN
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * 获取创建者名称
     * @return HostName 创建者名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * 设置创建者名称
     * @param HostName 创建者名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * 获取创建者邮箱
     * @return HostMail 创建者邮箱
     */
    public String getHostMail() {
        return this.HostMail;
    }

    /**
     * 设置创建者邮箱
     * @param HostMail 创建者邮箱
     */
    public void setHostMail(String HostMail) {
        this.HostMail = HostMail;
    }

    /**
     * 获取邀请状态。-1：已过期，0：正常，1：已接受，2：已失效，3：已取消
     * @return Status 邀请状态。-1：已过期，0：正常，1：已接受，2：已失效，3：已取消
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * 设置邀请状态。-1：已过期，0：正常，1：已接受，2：已失效，3：已取消
     * @param Status 邀请状态。-1：已过期，0：正常，1：已接受，2：已失效，3：已取消
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * 获取名称
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取备注
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 获取企业组织类型
     * @return OrgType 企业组织类型
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * 设置企业组织类型
     * @param OrgType 企业组织类型
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * 获取邀请时间
     * @return InviteTime 邀请时间
     */
    public String getInviteTime() {
        return this.InviteTime;
    }

    /**
     * 设置邀请时间
     * @param InviteTime 邀请时间
     */
    public void setInviteTime(String InviteTime) {
        this.InviteTime = InviteTime;
    }

    /**
     * 获取过期时间
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "HostUin", this.HostUin);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostMail", this.HostMail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OrgType", this.OrgType);
        this.setParamSimple(map, prefix + "InviteTime", this.InviteTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

