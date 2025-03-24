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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTInstanceItem extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 实例类型
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例状态，
RUNNING, 运行中
MAINTAINING，维护中
ABNORMAL，异常
OVERDUE，欠费
DESTROYED，已删除
CREATING，创建中
MODIFYING，变配中
CREATE_FAILURE，创建失败
MODIFY_FAILURE，变配失败
DELETING，删除中
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例主题数上限
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 主题数量
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 商品规格
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 弹性TPS限流值
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 创建时间，毫秒级时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 单客户端最大订阅数量
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * 客户端连接数上线
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * 是否自动续费。仅包年包月就去那生效。
1:自动续费
0:非自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 计费模式， POSTPAID，按量计费 PREPAID，包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 到期时间，毫秒级时间戳
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * 预销毁时间，毫秒级时间戳
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * 授权规则条数限制
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * 最大ca配额
    */
    @SerializedName("MaxCaNum")
    @Expose
    private Long MaxCaNum;

    /**
    * 最大订阅数
    */
    @SerializedName("MaxSubscription")
    @Expose
    private Long MaxSubscription;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例版本 
     * @return Version 实例版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 实例版本
     * @param Version 实例版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 实例类型
BASIC，基础版
PRO，专业版
PLATINUM，铂金版 
     * @return InstanceType 实例类型
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
     * @param InstanceType 实例类型
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例状态，
RUNNING, 运行中
MAINTAINING，维护中
ABNORMAL，异常
OVERDUE，欠费
DESTROYED，已删除
CREATING，创建中
MODIFYING，变配中
CREATE_FAILURE，创建失败
MODIFY_FAILURE，变配失败
DELETING，删除中 
     * @return InstanceStatus 实例状态，
RUNNING, 运行中
MAINTAINING，维护中
ABNORMAL，异常
OVERDUE，欠费
DESTROYED，已删除
CREATING，创建中
MODIFYING，变配中
CREATE_FAILURE，创建失败
MODIFY_FAILURE，变配失败
DELETING，删除中
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态，
RUNNING, 运行中
MAINTAINING，维护中
ABNORMAL，异常
OVERDUE，欠费
DESTROYED，已删除
CREATING，创建中
MODIFYING，变配中
CREATE_FAILURE，创建失败
MODIFY_FAILURE，变配失败
DELETING，删除中
     * @param InstanceStatus 实例状态，
RUNNING, 运行中
MAINTAINING，维护中
ABNORMAL，异常
OVERDUE，欠费
DESTROYED，已删除
CREATING，创建中
MODIFYING，变配中
CREATE_FAILURE，创建失败
MODIFY_FAILURE，变配失败
DELETING，删除中
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例主题数上限 
     * @return TopicNumLimit 实例主题数上限
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set 实例主题数上限
     * @param TopicNumLimit 实例主题数上限
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 主题数量 
     * @return TopicNum 主题数量
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set 主题数量
     * @param TopicNum 主题数量
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 商品规格 
     * @return SkuCode 商品规格
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 商品规格
     * @param SkuCode 商品规格
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 弹性TPS限流值 
     * @return TpsLimit 弹性TPS限流值
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set 弹性TPS限流值
     * @param TpsLimit 弹性TPS限流值
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get 创建时间，毫秒级时间戳 
     * @return CreateTime 创建时间，毫秒级时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒级时间戳
     * @param CreateTime 创建时间，毫秒级时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 单客户端最大订阅数量 
     * @return MaxSubscriptionPerClient 单客户端最大订阅数量
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set 单客户端最大订阅数量
     * @param MaxSubscriptionPerClient 单客户端最大订阅数量
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get 客户端连接数上线 
     * @return ClientNumLimit 客户端连接数上线
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set 客户端连接数上线
     * @param ClientNumLimit 客户端连接数上线
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get 是否自动续费。仅包年包月就去那生效。
1:自动续费
0:非自动续费 
     * @return RenewFlag 是否自动续费。仅包年包月就去那生效。
1:自动续费
0:非自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费。仅包年包月就去那生效。
1:自动续费
0:非自动续费
     * @param RenewFlag 是否自动续费。仅包年包月就去那生效。
1:自动续费
0:非自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 计费模式， POSTPAID，按量计费 PREPAID，包年包月 
     * @return PayMode 计费模式， POSTPAID，按量计费 PREPAID，包年包月
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式， POSTPAID，按量计费 PREPAID，包年包月
     * @param PayMode 计费模式， POSTPAID，按量计费 PREPAID，包年包月
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 到期时间，毫秒级时间戳 
     * @return ExpiryTime 到期时间，毫秒级时间戳
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set 到期时间，毫秒级时间戳
     * @param ExpiryTime 到期时间，毫秒级时间戳
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get 预销毁时间，毫秒级时间戳 
     * @return DestroyTime 预销毁时间，毫秒级时间戳
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set 预销毁时间，毫秒级时间戳
     * @param DestroyTime 预销毁时间，毫秒级时间戳
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get 授权规则条数限制 
     * @return AuthorizationPolicyLimit 授权规则条数限制
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set 授权规则条数限制
     * @param AuthorizationPolicyLimit 授权规则条数限制
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
    }

    /**
     * Get 最大ca配额 
     * @return MaxCaNum 最大ca配额
     */
    public Long getMaxCaNum() {
        return this.MaxCaNum;
    }

    /**
     * Set 最大ca配额
     * @param MaxCaNum 最大ca配额
     */
    public void setMaxCaNum(Long MaxCaNum) {
        this.MaxCaNum = MaxCaNum;
    }

    /**
     * Get 最大订阅数 
     * @return MaxSubscription 最大订阅数
     */
    public Long getMaxSubscription() {
        return this.MaxSubscription;
    }

    /**
     * Set 最大订阅数
     * @param MaxSubscription 最大订阅数
     */
    public void setMaxSubscription(Long MaxSubscription) {
        this.MaxSubscription = MaxSubscription;
    }

    public MQTTInstanceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTInstanceItem(MQTTInstanceItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.MaxSubscriptionPerClient != null) {
            this.MaxSubscriptionPerClient = new Long(source.MaxSubscriptionPerClient);
        }
        if (source.ClientNumLimit != null) {
            this.ClientNumLimit = new Long(source.ClientNumLimit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ExpiryTime != null) {
            this.ExpiryTime = new Long(source.ExpiryTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new Long(source.DestroyTime);
        }
        if (source.AuthorizationPolicyLimit != null) {
            this.AuthorizationPolicyLimit = new Long(source.AuthorizationPolicyLimit);
        }
        if (source.MaxCaNum != null) {
            this.MaxCaNum = new Long(source.MaxCaNum);
        }
        if (source.MaxSubscription != null) {
            this.MaxSubscription = new Long(source.MaxSubscription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MaxSubscriptionPerClient", this.MaxSubscriptionPerClient);
        this.setParamSimple(map, prefix + "ClientNumLimit", this.ClientNumLimit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "AuthorizationPolicyLimit", this.AuthorizationPolicyLimit);
        this.setParamSimple(map, prefix + "MaxCaNum", this.MaxCaNum);
        this.setParamSimple(map, prefix + "MaxSubscription", this.MaxSubscription);

    }
}

