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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainShareUserInfo extends AbstractModel {

    /**
    * 共享记录ID
    */
    @SerializedName("DomainShareId")
    @Expose
    private Long DomainShareId;

    /**
    * 共享模式。r-只读；w-可写；rw-可读写。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 共享到的用户昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 共享到的用户UIN
    */
    @SerializedName("QCloudUIN")
    @Expose
    private String QCloudUIN;

    /**
    * 共享状态。enabled-有效；pause-无效。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 共享的子域名
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
     * Get 共享记录ID 
     * @return DomainShareId 共享记录ID
     */
    public Long getDomainShareId() {
        return this.DomainShareId;
    }

    /**
     * Set 共享记录ID
     * @param DomainShareId 共享记录ID
     */
    public void setDomainShareId(Long DomainShareId) {
        this.DomainShareId = DomainShareId;
    }

    /**
     * Get 共享模式。r-只读；w-可写；rw-可读写。 
     * @return Mode 共享模式。r-只读；w-可写；rw-可读写。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 共享模式。r-只读；w-可写；rw-可读写。
     * @param Mode 共享模式。r-只读；w-可写；rw-可读写。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 共享到的用户昵称 
     * @return Nickname 共享到的用户昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 共享到的用户昵称
     * @param Nickname 共享到的用户昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 共享到的用户UIN 
     * @return QCloudUIN 共享到的用户UIN
     */
    public String getQCloudUIN() {
        return this.QCloudUIN;
    }

    /**
     * Set 共享到的用户UIN
     * @param QCloudUIN 共享到的用户UIN
     */
    public void setQCloudUIN(String QCloudUIN) {
        this.QCloudUIN = QCloudUIN;
    }

    /**
     * Get 共享状态。enabled-有效；pause-无效。 
     * @return Status 共享状态。enabled-有效；pause-无效。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 共享状态。enabled-有效；pause-无效。
     * @param Status 共享状态。enabled-有效；pause-无效。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 共享的子域名 
     * @return SubDomain 共享的子域名
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 共享的子域名
     * @param SubDomain 共享的子域名
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    public DomainShareUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainShareUserInfo(DomainShareUserInfo source) {
        if (source.DomainShareId != null) {
            this.DomainShareId = new Long(source.DomainShareId);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.QCloudUIN != null) {
            this.QCloudUIN = new String(source.QCloudUIN);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainShareId", this.DomainShareId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "QCloudUIN", this.QCloudUIN);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);

    }
}

