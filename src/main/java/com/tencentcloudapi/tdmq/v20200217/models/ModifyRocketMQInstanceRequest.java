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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRocketMQInstanceRequest extends AbstractModel {

    /**
    * <p>专享实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>实例消息保留时间，小时为单位</p>
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * <p>是否开启删除保护</p>
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * <p>控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5</p>
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * <p>是否开启ACL</p>
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
     * Get <p>专享实例ID</p> 
     * @return InstanceId <p>专享实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>专享实例ID</p>
     * @param InstanceId <p>专享实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return Name <p>实例名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例名称</p>
     * @param Name <p>实例名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例备注信息</p> 
     * @return Remark <p>实例备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>实例备注信息</p>
     * @param Remark <p>实例备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>实例消息保留时间，小时为单位</p> 
     * @return MessageRetention <p>实例消息保留时间，小时为单位</p>
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set <p>实例消息保留时间，小时为单位</p>
     * @param MessageRetention <p>实例消息保留时间，小时为单位</p>
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get <p>是否开启删除保护</p> 
     * @return EnableDeletionProtection <p>是否开启删除保护</p>
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set <p>是否开启删除保护</p>
     * @param EnableDeletionProtection <p>是否开启删除保护</p>
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get <p>控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5</p> 
     * @return SendReceiveRatio <p>控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5</p>
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set <p>控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5</p>
     * @param SendReceiveRatio <p>控制生产和消费消息的 TPS 占比，取值范围0～1，默认值为0.5</p>
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get <p>是否开启ACL</p> 
     * @return AclEnabled <p>是否开启ACL</p>
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set <p>是否开启ACL</p>
     * @param AclEnabled <p>是否开启ACL</p>
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    public ModifyRocketMQInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQInstanceRequest(ModifyRocketMQInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);

    }
}

