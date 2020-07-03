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

public class GetOrganizationResponse extends AbstractModel{

    /**
    * 企业组织ID
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * 创建者UIN
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * 创建者昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 创建者邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 企业组织类型
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * 是否为空
    */
    @SerializedName("IsEmpty")
    @Expose
    private Long IsEmpty;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 企业组织ID 
     * @return OrgId 企业组织ID
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 企业组织ID
     * @param OrgId 企业组织ID
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 创建者UIN 
     * @return HostUin 创建者UIN
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * Set 创建者UIN
     * @param HostUin 创建者UIN
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * Get 创建者昵称 
     * @return Nickname 创建者昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 创建者昵称
     * @param Nickname 创建者昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 创建者邮箱 
     * @return Mail 创建者邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 创建者邮箱
     * @param Mail 创建者邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 企业组织类型 
     * @return OrgType 企业组织类型
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set 企业组织类型
     * @param OrgType 企业组织类型
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * Get 是否为空 
     * @return IsEmpty 是否为空
     */
    public Long getIsEmpty() {
        return this.IsEmpty;
    }

    /**
     * Set 是否为空
     * @param IsEmpty 是否为空
     */
    public void setIsEmpty(Long IsEmpty) {
        this.IsEmpty = IsEmpty;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "HostUin", this.HostUin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "OrgType", this.OrgType);
        this.setParamSimple(map, prefix + "IsEmpty", this.IsEmpty);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

