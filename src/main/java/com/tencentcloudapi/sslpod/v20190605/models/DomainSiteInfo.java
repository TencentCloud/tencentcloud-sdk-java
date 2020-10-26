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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainSiteInfo extends AbstractModel{

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 是否自动获取IP
    */
    @SerializedName("AutoIP")
    @Expose
    private Boolean AutoIP;

    /**
    * 监控服务类型
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * 证书品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 评级
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 评级Code
    */
    @SerializedName("GradeCode")
    @Expose
    private Long GradeCode;

    /**
    * 是否监控告警
    */
    @SerializedName("Notice")
    @Expose
    private Boolean Notice;

    /**
    * 账号域名关系ID
    */
    @SerializedName("AccountDomainId")
    @Expose
    private Long AccountDomainId;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 域名状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 是否自动获取IP 
     * @return AutoIP 是否自动获取IP
     */
    public Boolean getAutoIP() {
        return this.AutoIP;
    }

    /**
     * Set 是否自动获取IP
     * @param AutoIP 是否自动获取IP
     */
    public void setAutoIP(Boolean AutoIP) {
        this.AutoIP = AutoIP;
    }

    /**
     * Get 监控服务类型 
     * @return ServerType 监控服务类型
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set 监控服务类型
     * @param ServerType 监控服务类型
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get 证书品牌 
     * @return Brand 证书品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 证书品牌
     * @param Brand 证书品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 评级 
     * @return Grade 评级
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 评级
     * @param Grade 评级
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 评级Code 
     * @return GradeCode 评级Code
     */
    public Long getGradeCode() {
        return this.GradeCode;
    }

    /**
     * Set 评级Code
     * @param GradeCode 评级Code
     */
    public void setGradeCode(Long GradeCode) {
        this.GradeCode = GradeCode;
    }

    /**
     * Get 是否监控告警 
     * @return Notice 是否监控告警
     */
    public Boolean getNotice() {
        return this.Notice;
    }

    /**
     * Set 是否监控告警
     * @param Notice 是否监控告警
     */
    public void setNotice(Boolean Notice) {
        this.Notice = Notice;
    }

    /**
     * Get 账号域名关系ID 
     * @return AccountDomainId 账号域名关系ID
     */
    public Long getAccountDomainId() {
        return this.AccountDomainId;
    }

    /**
     * Set 账号域名关系ID
     * @param AccountDomainId 账号域名关系ID
     */
    public void setAccountDomainId(Long AccountDomainId) {
        this.AccountDomainId = AccountDomainId;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 域名状态 
     * @return Status 域名状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态
     * @param Status 域名状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名端口 
     * @return Port 域名端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 域名端口
     * @param Port 域名端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "AutoIP", this.AutoIP);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "GradeCode", this.GradeCode);
        this.setParamSimple(map, prefix + "Notice", this.Notice);
        this.setParamSimple(map, prefix + "AccountDomainId", this.AccountDomainId);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

