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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 消息发送和接收的比例
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * 调整实例规格的商品代号
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 消息保留时长，小时为单位
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * 是否开启弹性TPS
    */
    @SerializedName("ScaledTpsEnabled")
    @Expose
    private Boolean ScaledTpsEnabled;

    /**
    * 是否开启ACL
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * 最大可创建主题数
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * 免费额度之外的主题个数
    */
    @SerializedName("ExtraTopicNum")
    @Expose
    private String ExtraTopicNum;

    /**
    * 是否开启删除保护
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 消息发送和接收的比例 
     * @return SendReceiveRatio 消息发送和接收的比例
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set 消息发送和接收的比例
     * @param SendReceiveRatio 消息发送和接收的比例
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get 调整实例规格的商品代号 
     * @return SkuCode 调整实例规格的商品代号
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 调整实例规格的商品代号
     * @param SkuCode 调整实例规格的商品代号
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 消息保留时长，小时为单位 
     * @return MessageRetention 消息保留时长，小时为单位
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set 消息保留时长，小时为单位
     * @param MessageRetention 消息保留时长，小时为单位
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get 是否开启弹性TPS 
     * @return ScaledTpsEnabled 是否开启弹性TPS
     */
    public Boolean getScaledTpsEnabled() {
        return this.ScaledTpsEnabled;
    }

    /**
     * Set 是否开启弹性TPS
     * @param ScaledTpsEnabled 是否开启弹性TPS
     */
    public void setScaledTpsEnabled(Boolean ScaledTpsEnabled) {
        this.ScaledTpsEnabled = ScaledTpsEnabled;
    }

    /**
     * Get 是否开启ACL 
     * @return AclEnabled 是否开启ACL
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set 是否开启ACL
     * @param AclEnabled 是否开启ACL
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get 最大可创建主题数 
     * @return MaxTopicNum 最大可创建主题数
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set 最大可创建主题数
     * @param MaxTopicNum 最大可创建主题数
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get 免费额度之外的主题个数 
     * @return ExtraTopicNum 免费额度之外的主题个数
     */
    public String getExtraTopicNum() {
        return this.ExtraTopicNum;
    }

    /**
     * Set 免费额度之外的主题个数
     * @param ExtraTopicNum 免费额度之外的主题个数
     */
    public void setExtraTopicNum(String ExtraTopicNum) {
        this.ExtraTopicNum = ExtraTopicNum;
    }

    /**
     * Get 是否开启删除保护 
     * @return EnableDeletionProtection 是否开启删除保护
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set 是否开启删除保护
     * @param EnableDeletionProtection 是否开启删除保护
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.ScaledTpsEnabled != null) {
            this.ScaledTpsEnabled = new Boolean(source.ScaledTpsEnabled);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
        }
        if (source.ExtraTopicNum != null) {
            this.ExtraTopicNum = new String(source.ExtraTopicNum);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "ScaledTpsEnabled", this.ScaledTpsEnabled);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamSimple(map, prefix + "ExtraTopicNum", this.ExtraTopicNum);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

