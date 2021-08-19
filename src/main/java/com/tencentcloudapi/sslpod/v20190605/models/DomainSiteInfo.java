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
    * ID标识
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
    * 是否自动获取IP：true：是，false:否
    */
    @SerializedName("AutoIP")
    @Expose
    private Boolean AutoIP;

    /**
    * 评级
"A+"，
 "A"，
"A-"，
"B"，
"C"，
"D"，
 "E"，
 "F"，
"T"，
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 证书品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 监控服务类型
0 :Web
1: SMTP
2: IMAP
3: POP3
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * 评级Code
0："unknown"，
1："A+"，
2： "A"，
3："A-"，
4："B"，
5："C"，
6："D"，
7： "E"，
8： "F"，
9："T"，
    */
    @SerializedName("GradeCode")
    @Expose
    private Long GradeCode;

    /**
    * 是否监控告警；true：是，false:否
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
    * 域名状态:
连接异常，
证书已过期，
证书已吊销，
证书黑名单，
证书域名不匹配，
证书不可信，
证书密钥弱，
证书即将过期，少于7天，
证书即将过期，少于30天，
正常，
部分异常
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
     * Get ID标识 
     * @return Id ID标识
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID标识
     * @param Id ID标识
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
     * Get 是否自动获取IP：true：是，false:否 
     * @return AutoIP 是否自动获取IP：true：是，false:否
     */
    public Boolean getAutoIP() {
        return this.AutoIP;
    }

    /**
     * Set 是否自动获取IP：true：是，false:否
     * @param AutoIP 是否自动获取IP：true：是，false:否
     */
    public void setAutoIP(Boolean AutoIP) {
        this.AutoIP = AutoIP;
    }

    /**
     * Get 评级
"A+"，
 "A"，
"A-"，
"B"，
"C"，
"D"，
 "E"，
 "F"，
"T"， 
     * @return Grade 评级
"A+"，
 "A"，
"A-"，
"B"，
"C"，
"D"，
 "E"，
 "F"，
"T"，
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 评级
"A+"，
 "A"，
"A-"，
"B"，
"C"，
"D"，
 "E"，
 "F"，
"T"，
     * @param Grade 评级
"A+"，
 "A"，
"A-"，
"B"，
"C"，
"D"，
 "E"，
 "F"，
"T"，
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
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
     * Get 监控服务类型
0 :Web
1: SMTP
2: IMAP
3: POP3 
     * @return ServerType 监控服务类型
0 :Web
1: SMTP
2: IMAP
3: POP3
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set 监控服务类型
0 :Web
1: SMTP
2: IMAP
3: POP3
     * @param ServerType 监控服务类型
0 :Web
1: SMTP
2: IMAP
3: POP3
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get 评级Code
0："unknown"，
1："A+"，
2： "A"，
3："A-"，
4："B"，
5："C"，
6："D"，
7： "E"，
8： "F"，
9："T"， 
     * @return GradeCode 评级Code
0："unknown"，
1："A+"，
2： "A"，
3："A-"，
4："B"，
5："C"，
6："D"，
7： "E"，
8： "F"，
9："T"，
     */
    public Long getGradeCode() {
        return this.GradeCode;
    }

    /**
     * Set 评级Code
0："unknown"，
1："A+"，
2： "A"，
3："A-"，
4："B"，
5："C"，
6："D"，
7： "E"，
8： "F"，
9："T"，
     * @param GradeCode 评级Code
0："unknown"，
1："A+"，
2： "A"，
3："A-"，
4："B"，
5："C"，
6："D"，
7： "E"，
8： "F"，
9："T"，
     */
    public void setGradeCode(Long GradeCode) {
        this.GradeCode = GradeCode;
    }

    /**
     * Get 是否监控告警；true：是，false:否 
     * @return Notice 是否监控告警；true：是，false:否
     */
    public Boolean getNotice() {
        return this.Notice;
    }

    /**
     * Set 是否监控告警；true：是，false:否
     * @param Notice 是否监控告警；true：是，false:否
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
     * Get 域名状态:
连接异常，
证书已过期，
证书已吊销，
证书黑名单，
证书域名不匹配，
证书不可信，
证书密钥弱，
证书即将过期，少于7天，
证书即将过期，少于30天，
正常，
部分异常 
     * @return Status 域名状态:
连接异常，
证书已过期，
证书已吊销，
证书黑名单，
证书域名不匹配，
证书不可信，
证书密钥弱，
证书即将过期，少于7天，
证书即将过期，少于30天，
正常，
部分异常
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态:
连接异常，
证书已过期，
证书已吊销，
证书黑名单，
证书域名不匹配，
证书不可信，
证书密钥弱，
证书即将过期，少于7天，
证书即将过期，少于30天，
正常，
部分异常
     * @param Status 域名状态:
连接异常，
证书已过期，
证书已吊销，
证书黑名单，
证书域名不匹配，
证书不可信，
证书密钥弱，
证书即将过期，少于7天，
证书即将过期，少于30天，
正常，
部分异常
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

    public DomainSiteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainSiteInfo(DomainSiteInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.AutoIP != null) {
            this.AutoIP = new Boolean(source.AutoIP);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.ServerType != null) {
            this.ServerType = new Long(source.ServerType);
        }
        if (source.GradeCode != null) {
            this.GradeCode = new Long(source.GradeCode);
        }
        if (source.Notice != null) {
            this.Notice = new Boolean(source.Notice);
        }
        if (source.AccountDomainId != null) {
            this.AccountDomainId = new Long(source.AccountDomainId);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "AutoIP", this.AutoIP);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "GradeCode", this.GradeCode);
        this.setParamSimple(map, prefix + "Notice", this.Notice);
        this.setParamSimple(map, prefix + "AccountDomainId", this.AccountDomainId);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

