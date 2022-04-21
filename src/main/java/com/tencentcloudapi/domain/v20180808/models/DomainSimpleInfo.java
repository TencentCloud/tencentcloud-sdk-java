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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainSimpleInfo extends AbstractModel{

    /**
    * 域名资源ID。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 域名名称。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 域名实名认证状态。
NotUpload：未实名认证
InAudit：实名审核中
Approved：实名审核通过
Reject：实名审核失败
NoAudit: 无需实名认证
    */
    @SerializedName("RealNameAuditStatus")
    @Expose
    private String RealNameAuditStatus;

    /**
    * 域名实名认证不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealNameAuditUnpassReason")
    @Expose
    private String RealNameAuditUnpassReason;

    /**
    * 域名命名审核状态。
NotAudit：命名审核未上传
Pending：命名审核待上传
Auditing：域名命名审核中
Approved：域名命名审核通过
Rejected：域名命名审核拒绝
    */
    @SerializedName("DomainNameAuditStatus")
    @Expose
    private String DomainNameAuditStatus;

    /**
    * 域名命名审核不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainNameAuditUnpassReason")
    @Expose
    private String DomainNameAuditUnpassReason;

    /**
    * 注册时间。
    */
    @SerializedName("CreationDate")
    @Expose
    private String CreationDate;

    /**
    * 到期时间
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 域名状态。
ok：正常
serverHold：注册局暂停解析 
clientHold：注册商暂停解析
pendingTransfer：转移中
renewingPeriod：续费期
redemptionPeriod：偿还期
pendingDelete：删除期
serverTransferProhibited：注册局禁止转移
serverUpdateProhibited：注册局禁止更新
serverDeleteProhibited：注册局禁止删除
clientTransferProhibited：注册商禁止转移
clientUpdateProhibited：注册商禁止更新
clientDeleteProhibited：注册商禁止删除
    */
    @SerializedName("DomainStatus")
    @Expose
    private String [] DomainStatus;

    /**
    * 域名购买状态。
ok：正常
RegisterPending：待注册
RegisterDoing：注册中
RegisterFailed：注册失败
AboutToExpire: 即将过期
RenewPending：已进入续费期，需要进行续费
RenewDoing：续费中
RedemptionPending：已进入赎回期，需要进行续费
RedemptionDoing：赎回中
TransferPending：待转入中
TransferTransing：转入中
TransferFailed：转入失败
    */
    @SerializedName("BuyStatus")
    @Expose
    private String BuyStatus;

    /**
    * 注册商类型
epp: DNSPod, Inc.（烟台帝思普网络科技有限公司）
qcloud: Tencent Cloud Computing (Beijing) Limited Liability Company（腾讯云计算（北京）有限责任公司）
yunxun: Guangzhou Yunxun Information Technology Co., Ltd.（广州云讯信息科技有限公司）
xinnet: Xin Net Technology Corporation（北京新网数码信息技术有限公司）
    */
    @SerializedName("RegistrarType")
    @Expose
    private String RegistrarType;

    /**
    * 域名绑定的ns
    */
    @SerializedName("NameServer")
    @Expose
    private String [] NameServer;

    /**
    * true：开启锁定
false：关闭锁定
    */
    @SerializedName("LockTransfer")
    @Expose
    private Boolean LockTransfer;

    /**
    * 锁定结束时间
    */
    @SerializedName("LockEndTime")
    @Expose
    private String LockEndTime;

    /**
    * 认证类型：I=个人，E=企业
    */
    @SerializedName("RegistrantType")
    @Expose
    private String RegistrantType;

    /**
    * 域名所有者，中文
    */
    @SerializedName("OrganizationNameCN")
    @Expose
    private String OrganizationNameCN;

    /**
    * 域名所有者，英文
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 域名联系人，中文
    */
    @SerializedName("RegistrantNameCN")
    @Expose
    private String RegistrantNameCN;

    /**
    * 域名联系人，英文
    */
    @SerializedName("RegistrantName")
    @Expose
    private String RegistrantName;

    /**
     * Get 域名资源ID。 
     * @return DomainId 域名资源ID。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名资源ID。
     * @param DomainId 域名资源ID。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名名称。 
     * @return DomainName 域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名名称。
     * @param DomainName 域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 域名实名认证状态。
NotUpload：未实名认证
InAudit：实名审核中
Approved：实名审核通过
Reject：实名审核失败
NoAudit: 无需实名认证 
     * @return RealNameAuditStatus 域名实名认证状态。
NotUpload：未实名认证
InAudit：实名审核中
Approved：实名审核通过
Reject：实名审核失败
NoAudit: 无需实名认证
     */
    public String getRealNameAuditStatus() {
        return this.RealNameAuditStatus;
    }

    /**
     * Set 域名实名认证状态。
NotUpload：未实名认证
InAudit：实名审核中
Approved：实名审核通过
Reject：实名审核失败
NoAudit: 无需实名认证
     * @param RealNameAuditStatus 域名实名认证状态。
NotUpload：未实名认证
InAudit：实名审核中
Approved：实名审核通过
Reject：实名审核失败
NoAudit: 无需实名认证
     */
    public void setRealNameAuditStatus(String RealNameAuditStatus) {
        this.RealNameAuditStatus = RealNameAuditStatus;
    }

    /**
     * Get 域名实名认证不通过原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealNameAuditUnpassReason 域名实名认证不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealNameAuditUnpassReason() {
        return this.RealNameAuditUnpassReason;
    }

    /**
     * Set 域名实名认证不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealNameAuditUnpassReason 域名实名认证不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealNameAuditUnpassReason(String RealNameAuditUnpassReason) {
        this.RealNameAuditUnpassReason = RealNameAuditUnpassReason;
    }

    /**
     * Get 域名命名审核状态。
NotAudit：命名审核未上传
Pending：命名审核待上传
Auditing：域名命名审核中
Approved：域名命名审核通过
Rejected：域名命名审核拒绝 
     * @return DomainNameAuditStatus 域名命名审核状态。
NotAudit：命名审核未上传
Pending：命名审核待上传
Auditing：域名命名审核中
Approved：域名命名审核通过
Rejected：域名命名审核拒绝
     */
    public String getDomainNameAuditStatus() {
        return this.DomainNameAuditStatus;
    }

    /**
     * Set 域名命名审核状态。
NotAudit：命名审核未上传
Pending：命名审核待上传
Auditing：域名命名审核中
Approved：域名命名审核通过
Rejected：域名命名审核拒绝
     * @param DomainNameAuditStatus 域名命名审核状态。
NotAudit：命名审核未上传
Pending：命名审核待上传
Auditing：域名命名审核中
Approved：域名命名审核通过
Rejected：域名命名审核拒绝
     */
    public void setDomainNameAuditStatus(String DomainNameAuditStatus) {
        this.DomainNameAuditStatus = DomainNameAuditStatus;
    }

    /**
     * Get 域名命名审核不通过原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainNameAuditUnpassReason 域名命名审核不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainNameAuditUnpassReason() {
        return this.DomainNameAuditUnpassReason;
    }

    /**
     * Set 域名命名审核不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainNameAuditUnpassReason 域名命名审核不通过原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainNameAuditUnpassReason(String DomainNameAuditUnpassReason) {
        this.DomainNameAuditUnpassReason = DomainNameAuditUnpassReason;
    }

    /**
     * Get 注册时间。 
     * @return CreationDate 注册时间。
     */
    public String getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Set 注册时间。
     * @param CreationDate 注册时间。
     */
    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * Get 到期时间 
     * @return ExpirationDate 到期时间
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 到期时间
     * @param ExpirationDate 到期时间
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 域名状态。
ok：正常
serverHold：注册局暂停解析 
clientHold：注册商暂停解析
pendingTransfer：转移中
renewingPeriod：续费期
redemptionPeriod：偿还期
pendingDelete：删除期
serverTransferProhibited：注册局禁止转移
serverUpdateProhibited：注册局禁止更新
serverDeleteProhibited：注册局禁止删除
clientTransferProhibited：注册商禁止转移
clientUpdateProhibited：注册商禁止更新
clientDeleteProhibited：注册商禁止删除 
     * @return DomainStatus 域名状态。
ok：正常
serverHold：注册局暂停解析 
clientHold：注册商暂停解析
pendingTransfer：转移中
renewingPeriod：续费期
redemptionPeriod：偿还期
pendingDelete：删除期
serverTransferProhibited：注册局禁止转移
serverUpdateProhibited：注册局禁止更新
serverDeleteProhibited：注册局禁止删除
clientTransferProhibited：注册商禁止转移
clientUpdateProhibited：注册商禁止更新
clientDeleteProhibited：注册商禁止删除
     */
    public String [] getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 域名状态。
ok：正常
serverHold：注册局暂停解析 
clientHold：注册商暂停解析
pendingTransfer：转移中
renewingPeriod：续费期
redemptionPeriod：偿还期
pendingDelete：删除期
serverTransferProhibited：注册局禁止转移
serverUpdateProhibited：注册局禁止更新
serverDeleteProhibited：注册局禁止删除
clientTransferProhibited：注册商禁止转移
clientUpdateProhibited：注册商禁止更新
clientDeleteProhibited：注册商禁止删除
     * @param DomainStatus 域名状态。
ok：正常
serverHold：注册局暂停解析 
clientHold：注册商暂停解析
pendingTransfer：转移中
renewingPeriod：续费期
redemptionPeriod：偿还期
pendingDelete：删除期
serverTransferProhibited：注册局禁止转移
serverUpdateProhibited：注册局禁止更新
serverDeleteProhibited：注册局禁止删除
clientTransferProhibited：注册商禁止转移
clientUpdateProhibited：注册商禁止更新
clientDeleteProhibited：注册商禁止删除
     */
    public void setDomainStatus(String [] DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get 域名购买状态。
ok：正常
RegisterPending：待注册
RegisterDoing：注册中
RegisterFailed：注册失败
AboutToExpire: 即将过期
RenewPending：已进入续费期，需要进行续费
RenewDoing：续费中
RedemptionPending：已进入赎回期，需要进行续费
RedemptionDoing：赎回中
TransferPending：待转入中
TransferTransing：转入中
TransferFailed：转入失败 
     * @return BuyStatus 域名购买状态。
ok：正常
RegisterPending：待注册
RegisterDoing：注册中
RegisterFailed：注册失败
AboutToExpire: 即将过期
RenewPending：已进入续费期，需要进行续费
RenewDoing：续费中
RedemptionPending：已进入赎回期，需要进行续费
RedemptionDoing：赎回中
TransferPending：待转入中
TransferTransing：转入中
TransferFailed：转入失败
     */
    public String getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set 域名购买状态。
ok：正常
RegisterPending：待注册
RegisterDoing：注册中
RegisterFailed：注册失败
AboutToExpire: 即将过期
RenewPending：已进入续费期，需要进行续费
RenewDoing：续费中
RedemptionPending：已进入赎回期，需要进行续费
RedemptionDoing：赎回中
TransferPending：待转入中
TransferTransing：转入中
TransferFailed：转入失败
     * @param BuyStatus 域名购买状态。
ok：正常
RegisterPending：待注册
RegisterDoing：注册中
RegisterFailed：注册失败
AboutToExpire: 即将过期
RenewPending：已进入续费期，需要进行续费
RenewDoing：续费中
RedemptionPending：已进入赎回期，需要进行续费
RedemptionDoing：赎回中
TransferPending：待转入中
TransferTransing：转入中
TransferFailed：转入失败
     */
    public void setBuyStatus(String BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get 注册商类型
epp: DNSPod, Inc.（烟台帝思普网络科技有限公司）
qcloud: Tencent Cloud Computing (Beijing) Limited Liability Company（腾讯云计算（北京）有限责任公司）
yunxun: Guangzhou Yunxun Information Technology Co., Ltd.（广州云讯信息科技有限公司）
xinnet: Xin Net Technology Corporation（北京新网数码信息技术有限公司） 
     * @return RegistrarType 注册商类型
epp: DNSPod, Inc.（烟台帝思普网络科技有限公司）
qcloud: Tencent Cloud Computing (Beijing) Limited Liability Company（腾讯云计算（北京）有限责任公司）
yunxun: Guangzhou Yunxun Information Technology Co., Ltd.（广州云讯信息科技有限公司）
xinnet: Xin Net Technology Corporation（北京新网数码信息技术有限公司）
     */
    public String getRegistrarType() {
        return this.RegistrarType;
    }

    /**
     * Set 注册商类型
epp: DNSPod, Inc.（烟台帝思普网络科技有限公司）
qcloud: Tencent Cloud Computing (Beijing) Limited Liability Company（腾讯云计算（北京）有限责任公司）
yunxun: Guangzhou Yunxun Information Technology Co., Ltd.（广州云讯信息科技有限公司）
xinnet: Xin Net Technology Corporation（北京新网数码信息技术有限公司）
     * @param RegistrarType 注册商类型
epp: DNSPod, Inc.（烟台帝思普网络科技有限公司）
qcloud: Tencent Cloud Computing (Beijing) Limited Liability Company（腾讯云计算（北京）有限责任公司）
yunxun: Guangzhou Yunxun Information Technology Co., Ltd.（广州云讯信息科技有限公司）
xinnet: Xin Net Technology Corporation（北京新网数码信息技术有限公司）
     */
    public void setRegistrarType(String RegistrarType) {
        this.RegistrarType = RegistrarType;
    }

    /**
     * Get 域名绑定的ns 
     * @return NameServer 域名绑定的ns
     */
    public String [] getNameServer() {
        return this.NameServer;
    }

    /**
     * Set 域名绑定的ns
     * @param NameServer 域名绑定的ns
     */
    public void setNameServer(String [] NameServer) {
        this.NameServer = NameServer;
    }

    /**
     * Get true：开启锁定
false：关闭锁定 
     * @return LockTransfer true：开启锁定
false：关闭锁定
     */
    public Boolean getLockTransfer() {
        return this.LockTransfer;
    }

    /**
     * Set true：开启锁定
false：关闭锁定
     * @param LockTransfer true：开启锁定
false：关闭锁定
     */
    public void setLockTransfer(Boolean LockTransfer) {
        this.LockTransfer = LockTransfer;
    }

    /**
     * Get 锁定结束时间 
     * @return LockEndTime 锁定结束时间
     */
    public String getLockEndTime() {
        return this.LockEndTime;
    }

    /**
     * Set 锁定结束时间
     * @param LockEndTime 锁定结束时间
     */
    public void setLockEndTime(String LockEndTime) {
        this.LockEndTime = LockEndTime;
    }

    /**
     * Get 认证类型：I=个人，E=企业 
     * @return RegistrantType 认证类型：I=个人，E=企业
     */
    public String getRegistrantType() {
        return this.RegistrantType;
    }

    /**
     * Set 认证类型：I=个人，E=企业
     * @param RegistrantType 认证类型：I=个人，E=企业
     */
    public void setRegistrantType(String RegistrantType) {
        this.RegistrantType = RegistrantType;
    }

    /**
     * Get 域名所有者，中文 
     * @return OrganizationNameCN 域名所有者，中文
     */
    public String getOrganizationNameCN() {
        return this.OrganizationNameCN;
    }

    /**
     * Set 域名所有者，中文
     * @param OrganizationNameCN 域名所有者，中文
     */
    public void setOrganizationNameCN(String OrganizationNameCN) {
        this.OrganizationNameCN = OrganizationNameCN;
    }

    /**
     * Get 域名所有者，英文 
     * @return OrganizationName 域名所有者，英文
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 域名所有者，英文
     * @param OrganizationName 域名所有者，英文
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 域名联系人，中文 
     * @return RegistrantNameCN 域名联系人，中文
     */
    public String getRegistrantNameCN() {
        return this.RegistrantNameCN;
    }

    /**
     * Set 域名联系人，中文
     * @param RegistrantNameCN 域名联系人，中文
     */
    public void setRegistrantNameCN(String RegistrantNameCN) {
        this.RegistrantNameCN = RegistrantNameCN;
    }

    /**
     * Get 域名联系人，英文 
     * @return RegistrantName 域名联系人，英文
     */
    public String getRegistrantName() {
        return this.RegistrantName;
    }

    /**
     * Set 域名联系人，英文
     * @param RegistrantName 域名联系人，英文
     */
    public void setRegistrantName(String RegistrantName) {
        this.RegistrantName = RegistrantName;
    }

    public DomainSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainSimpleInfo(DomainSimpleInfo source) {
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.RealNameAuditStatus != null) {
            this.RealNameAuditStatus = new String(source.RealNameAuditStatus);
        }
        if (source.RealNameAuditUnpassReason != null) {
            this.RealNameAuditUnpassReason = new String(source.RealNameAuditUnpassReason);
        }
        if (source.DomainNameAuditStatus != null) {
            this.DomainNameAuditStatus = new String(source.DomainNameAuditStatus);
        }
        if (source.DomainNameAuditUnpassReason != null) {
            this.DomainNameAuditUnpassReason = new String(source.DomainNameAuditUnpassReason);
        }
        if (source.CreationDate != null) {
            this.CreationDate = new String(source.CreationDate);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String[source.DomainStatus.length];
            for (int i = 0; i < source.DomainStatus.length; i++) {
                this.DomainStatus[i] = new String(source.DomainStatus[i]);
            }
        }
        if (source.BuyStatus != null) {
            this.BuyStatus = new String(source.BuyStatus);
        }
        if (source.RegistrarType != null) {
            this.RegistrarType = new String(source.RegistrarType);
        }
        if (source.NameServer != null) {
            this.NameServer = new String[source.NameServer.length];
            for (int i = 0; i < source.NameServer.length; i++) {
                this.NameServer[i] = new String(source.NameServer[i]);
            }
        }
        if (source.LockTransfer != null) {
            this.LockTransfer = new Boolean(source.LockTransfer);
        }
        if (source.LockEndTime != null) {
            this.LockEndTime = new String(source.LockEndTime);
        }
        if (source.RegistrantType != null) {
            this.RegistrantType = new String(source.RegistrantType);
        }
        if (source.OrganizationNameCN != null) {
            this.OrganizationNameCN = new String(source.OrganizationNameCN);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.RegistrantNameCN != null) {
            this.RegistrantNameCN = new String(source.RegistrantNameCN);
        }
        if (source.RegistrantName != null) {
            this.RegistrantName = new String(source.RegistrantName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "RealNameAuditStatus", this.RealNameAuditStatus);
        this.setParamSimple(map, prefix + "RealNameAuditUnpassReason", this.RealNameAuditUnpassReason);
        this.setParamSimple(map, prefix + "DomainNameAuditStatus", this.DomainNameAuditStatus);
        this.setParamSimple(map, prefix + "DomainNameAuditUnpassReason", this.DomainNameAuditUnpassReason);
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamArraySimple(map, prefix + "DomainStatus.", this.DomainStatus);
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "RegistrarType", this.RegistrarType);
        this.setParamArraySimple(map, prefix + "NameServer.", this.NameServer);
        this.setParamSimple(map, prefix + "LockTransfer", this.LockTransfer);
        this.setParamSimple(map, prefix + "LockEndTime", this.LockEndTime);
        this.setParamSimple(map, prefix + "RegistrantType", this.RegistrantType);
        this.setParamSimple(map, prefix + "OrganizationNameCN", this.OrganizationNameCN);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "RegistrantNameCN", this.RegistrantNameCN);
        this.setParamSimple(map, prefix + "RegistrantName", this.RegistrantName);

    }
}

