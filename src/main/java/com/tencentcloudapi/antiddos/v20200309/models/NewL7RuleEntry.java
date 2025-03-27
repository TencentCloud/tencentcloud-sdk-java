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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewL7RuleEntry extends AbstractModel {

    /**
    * 转发协议，取值[http, https]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 转发域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 负载均衡方式，取值[1(加权轮询)]
    */
    @SerializedName("LbType")
    @Expose
    private Long LbType;

    /**
    * 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
    */
    @SerializedName("KeepEnable")
    @Expose
    private Long KeepEnable;

    /**
    * 会话保持时间，单位秒
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * 回源方式，取值[1(域名回源)，2(IP回源)]
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 回源列表
    */
    @SerializedName("SourceList")
    @Expose
    private L4RuleSource [] SourceList;

    /**
    * 区域码
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * 资源Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 规则ID，当添加新规则时可以不用填写此字段；当修改或者删除规则时需要填写此字段；
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则描述
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 证书来源，当转发协议为https时必须填，取值[2(腾讯云托管证书)]，当转发协议为http时也可以填0
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * cc防护状态，取值[0(关闭), 1(开启)]
    */
    @SerializedName("CCStatus")
    @Expose
    private Long CCStatus;

    /**
    * HTTPS协议的CC防护状态，取值[0(关闭), 1(开启)]
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * HTTPS协议的CC防护阈值（已废弃）
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * HTTPS协议的CC防护阈值 -1：默认防御阈值
0: 关闭
大于0：自定义防护阈值
    */
    @SerializedName("CCThresholdNew")
    @Expose
    private Long CCThresholdNew;

    /**
    * HTTPS协议的CC防护等级
    */
    @SerializedName("CCLevel")
    @Expose
    private String CCLevel;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 是否开启Https协议使用Http回源，取值[0(关闭), 1(开启)]，不填写默认是关闭
    */
    @SerializedName("HttpsToHttpEnable")
    @Expose
    private Long HttpsToHttpEnable;

    /**
    * 接入端口值
    */
    @SerializedName("VirtualPort")
    @Expose
    private Long VirtualPort;

    /**
    * http强制跳转https，1表示打开，0表示关闭
    */
    @SerializedName("RewriteHttps")
    @Expose
    private Long RewriteHttps;

    /**
    * 规则配置失败时的详细错误原因(仅当Status=2时有效)，1001证书不存在，1002证书获取失败，1003证书上传失败，1004证书已过期
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
     * Get 转发协议，取值[http, https] 
     * @return Protocol 转发协议，取值[http, https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 转发协议，取值[http, https]
     * @param Protocol 转发协议，取值[http, https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 转发域名 
     * @return Domain 转发域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发域名
     * @param Domain 转发域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 负载均衡方式，取值[1(加权轮询)] 
     * @return LbType 负载均衡方式，取值[1(加权轮询)]
     */
    public Long getLbType() {
        return this.LbType;
    }

    /**
     * Set 负载均衡方式，取值[1(加权轮询)]
     * @param LbType 负载均衡方式，取值[1(加权轮询)]
     */
    public void setLbType(Long LbType) {
        this.LbType = LbType;
    }

    /**
     * Get 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)] 
     * @return KeepEnable 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
     */
    public Long getKeepEnable() {
        return this.KeepEnable;
    }

    /**
     * Set 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
     * @param KeepEnable 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
     */
    public void setKeepEnable(Long KeepEnable) {
        this.KeepEnable = KeepEnable;
    }

    /**
     * Get 会话保持时间，单位秒 
     * @return KeepTime 会话保持时间，单位秒
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set 会话保持时间，单位秒
     * @param KeepTime 会话保持时间，单位秒
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Get 回源方式，取值[1(域名回源)，2(IP回源)] 
     * @return SourceType 回源方式，取值[1(域名回源)，2(IP回源)]
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 回源方式，取值[1(域名回源)，2(IP回源)]
     * @param SourceType 回源方式，取值[1(域名回源)，2(IP回源)]
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 回源列表 
     * @return SourceList 回源列表
     */
    public L4RuleSource [] getSourceList() {
        return this.SourceList;
    }

    /**
     * Set 回源列表
     * @param SourceList 回源列表
     */
    public void setSourceList(L4RuleSource [] SourceList) {
        this.SourceList = SourceList;
    }

    /**
     * Get 区域码 
     * @return Region 区域码
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set 区域码
     * @param Region 区域码
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get 资源Id 
     * @return Id 资源Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源Id
     * @param Id 资源Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资源Ip 
     * @return Ip 资源Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资源Ip
     * @param Ip 资源Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 规则ID，当添加新规则时可以不用填写此字段；当修改或者删除规则时需要填写此字段； 
     * @return RuleId 规则ID，当添加新规则时可以不用填写此字段；当修改或者删除规则时需要填写此字段；
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID，当添加新规则时可以不用填写此字段；当修改或者删除规则时需要填写此字段；
     * @param RuleId 规则ID，当添加新规则时可以不用填写此字段；当修改或者删除规则时需要填写此字段；
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则描述 
     * @return RuleName 规则描述
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则描述
     * @param RuleName 规则描述
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 证书来源，当转发协议为https时必须填，取值[2(腾讯云托管证书)]，当转发协议为http时也可以填0 
     * @return CertType 证书来源，当转发协议为https时必须填，取值[2(腾讯云托管证书)]，当转发协议为http时也可以填0
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书来源，当转发协议为https时必须填，取值[2(腾讯云托管证书)]，当转发协议为http时也可以填0
     * @param CertType 证书来源，当转发协议为https时必须填，取值[2(腾讯云托管证书)]，当转发协议为http时也可以填0
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID 
     * @return SSLId 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     * @param SSLId 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段) 
     * @return Cert 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @param Cert 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段) 
     * @return PrivateKey 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @param PrivateKey 当证书来源为自有证书时，此字段必须填写证书密钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)] 
     * @return Status 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     * @param Status 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get cc防护状态，取值[0(关闭), 1(开启)] 
     * @return CCStatus cc防护状态，取值[0(关闭), 1(开启)]
     */
    public Long getCCStatus() {
        return this.CCStatus;
    }

    /**
     * Set cc防护状态，取值[0(关闭), 1(开启)]
     * @param CCStatus cc防护状态，取值[0(关闭), 1(开启)]
     */
    public void setCCStatus(Long CCStatus) {
        this.CCStatus = CCStatus;
    }

    /**
     * Get HTTPS协议的CC防护状态，取值[0(关闭), 1(开启)] 
     * @return CCEnable HTTPS协议的CC防护状态，取值[0(关闭), 1(开启)]
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set HTTPS协议的CC防护状态，取值[0(关闭), 1(开启)]
     * @param CCEnable HTTPS协议的CC防护状态，取值[0(关闭), 1(开启)]
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get HTTPS协议的CC防护阈值（已废弃） 
     * @return CCThreshold HTTPS协议的CC防护阈值（已废弃）
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set HTTPS协议的CC防护阈值（已废弃）
     * @param CCThreshold HTTPS协议的CC防护阈值（已废弃）
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    /**
     * Get HTTPS协议的CC防护阈值 -1：默认防御阈值
0: 关闭
大于0：自定义防护阈值 
     * @return CCThresholdNew HTTPS协议的CC防护阈值 -1：默认防御阈值
0: 关闭
大于0：自定义防护阈值
     */
    public Long getCCThresholdNew() {
        return this.CCThresholdNew;
    }

    /**
     * Set HTTPS协议的CC防护阈值 -1：默认防御阈值
0: 关闭
大于0：自定义防护阈值
     * @param CCThresholdNew HTTPS协议的CC防护阈值 -1：默认防御阈值
0: 关闭
大于0：自定义防护阈值
     */
    public void setCCThresholdNew(Long CCThresholdNew) {
        this.CCThresholdNew = CCThresholdNew;
    }

    /**
     * Get HTTPS协议的CC防护等级 
     * @return CCLevel HTTPS协议的CC防护等级
     */
    public String getCCLevel() {
        return this.CCLevel;
    }

    /**
     * Set HTTPS协议的CC防护等级
     * @param CCLevel HTTPS协议的CC防护等级
     */
    public void setCCLevel(String CCLevel) {
        this.CCLevel = CCLevel;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 是否开启Https协议使用Http回源，取值[0(关闭), 1(开启)]，不填写默认是关闭 
     * @return HttpsToHttpEnable 是否开启Https协议使用Http回源，取值[0(关闭), 1(开启)]，不填写默认是关闭
     */
    public Long getHttpsToHttpEnable() {
        return this.HttpsToHttpEnable;
    }

    /**
     * Set 是否开启Https协议使用Http回源，取值[0(关闭), 1(开启)]，不填写默认是关闭
     * @param HttpsToHttpEnable 是否开启Https协议使用Http回源，取值[0(关闭), 1(开启)]，不填写默认是关闭
     */
    public void setHttpsToHttpEnable(Long HttpsToHttpEnable) {
        this.HttpsToHttpEnable = HttpsToHttpEnable;
    }

    /**
     * Get 接入端口值 
     * @return VirtualPort 接入端口值
     */
    public Long getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set 接入端口值
     * @param VirtualPort 接入端口值
     */
    public void setVirtualPort(Long VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    /**
     * Get http强制跳转https，1表示打开，0表示关闭 
     * @return RewriteHttps http强制跳转https，1表示打开，0表示关闭
     */
    public Long getRewriteHttps() {
        return this.RewriteHttps;
    }

    /**
     * Set http强制跳转https，1表示打开，0表示关闭
     * @param RewriteHttps http强制跳转https，1表示打开，0表示关闭
     */
    public void setRewriteHttps(Long RewriteHttps) {
        this.RewriteHttps = RewriteHttps;
    }

    /**
     * Get 规则配置失败时的详细错误原因(仅当Status=2时有效)，1001证书不存在，1002证书获取失败，1003证书上传失败，1004证书已过期 
     * @return ErrCode 规则配置失败时的详细错误原因(仅当Status=2时有效)，1001证书不存在，1002证书获取失败，1003证书上传失败，1004证书已过期
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 规则配置失败时的详细错误原因(仅当Status=2时有效)，1001证书不存在，1002证书获取失败，1003证书上传失败，1004证书已过期
     * @param ErrCode 规则配置失败时的详细错误原因(仅当Status=2时有效)，1001证书不存在，1002证书获取失败，1003证书上传失败，1004证书已过期
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    public NewL7RuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewL7RuleEntry(NewL7RuleEntry source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LbType != null) {
            this.LbType = new Long(source.LbType);
        }
        if (source.KeepEnable != null) {
            this.KeepEnable = new Long(source.KeepEnable);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.SourceList != null) {
            this.SourceList = new L4RuleSource[source.SourceList.length];
            for (int i = 0; i < source.SourceList.length; i++) {
                this.SourceList[i] = new L4RuleSource(source.SourceList[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CCStatus != null) {
            this.CCStatus = new Long(source.CCStatus);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.CCThreshold != null) {
            this.CCThreshold = new Long(source.CCThreshold);
        }
        if (source.CCThresholdNew != null) {
            this.CCThresholdNew = new Long(source.CCThresholdNew);
        }
        if (source.CCLevel != null) {
            this.CCLevel = new String(source.CCLevel);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.HttpsToHttpEnable != null) {
            this.HttpsToHttpEnable = new Long(source.HttpsToHttpEnable);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new Long(source.VirtualPort);
        }
        if (source.RewriteHttps != null) {
            this.RewriteHttps = new Long(source.RewriteHttps);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LbType", this.LbType);
        this.setParamSimple(map, prefix + "KeepEnable", this.KeepEnable);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArrayObj(map, prefix + "SourceList.", this.SourceList);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CCStatus", this.CCStatus);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamSimple(map, prefix + "CCThresholdNew", this.CCThresholdNew);
        this.setParamSimple(map, prefix + "CCLevel", this.CCLevel);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "HttpsToHttpEnable", this.HttpsToHttpEnable);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "RewriteHttps", this.RewriteHttps);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

