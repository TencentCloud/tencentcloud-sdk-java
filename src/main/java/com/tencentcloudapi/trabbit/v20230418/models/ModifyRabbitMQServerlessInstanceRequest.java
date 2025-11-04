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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRabbitMQServerlessInstanceRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群名
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否开启trace
    */
    @SerializedName("TraceFlag")
    @Expose
    private Boolean TraceFlag;

    /**
    * 限流生产消费比例
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * 是否删除所有标签，默认为false
    */
    @SerializedName("DeleteAllTags")
    @Expose
    private Boolean DeleteAllTags;

    /**
    * 修改的实例标签列表
    */
    @SerializedName("InstanceTags")
    @Expose
    private RabbitMQServerlessTag [] InstanceTags;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群名 
     * @return ClusterName 集群名
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名
     * @param ClusterName 集群名
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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
     * Get 是否开启trace 
     * @return TraceFlag 是否开启trace
     */
    public Boolean getTraceFlag() {
        return this.TraceFlag;
    }

    /**
     * Set 是否开启trace
     * @param TraceFlag 是否开启trace
     */
    public void setTraceFlag(Boolean TraceFlag) {
        this.TraceFlag = TraceFlag;
    }

    /**
     * Get 限流生产消费比例 
     * @return SendReceiveRatio 限流生产消费比例
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set 限流生产消费比例
     * @param SendReceiveRatio 限流生产消费比例
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get 是否删除所有标签，默认为false 
     * @return DeleteAllTags 是否删除所有标签，默认为false
     */
    public Boolean getDeleteAllTags() {
        return this.DeleteAllTags;
    }

    /**
     * Set 是否删除所有标签，默认为false
     * @param DeleteAllTags 是否删除所有标签，默认为false
     */
    public void setDeleteAllTags(Boolean DeleteAllTags) {
        this.DeleteAllTags = DeleteAllTags;
    }

    /**
     * Get 修改的实例标签列表 
     * @return InstanceTags 修改的实例标签列表
     */
    public RabbitMQServerlessTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set 修改的实例标签列表
     * @param InstanceTags 修改的实例标签列表
     */
    public void setInstanceTags(RabbitMQServerlessTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    public ModifyRabbitMQServerlessInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQServerlessInstanceRequest(ModifyRabbitMQServerlessInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TraceFlag != null) {
            this.TraceFlag = new Boolean(source.TraceFlag);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.DeleteAllTags != null) {
            this.DeleteAllTags = new Boolean(source.DeleteAllTags);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new RabbitMQServerlessTag[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new RabbitMQServerlessTag(source.InstanceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TraceFlag", this.TraceFlag);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamSimple(map, prefix + "DeleteAllTags", this.DeleteAllTags);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);

    }
}

