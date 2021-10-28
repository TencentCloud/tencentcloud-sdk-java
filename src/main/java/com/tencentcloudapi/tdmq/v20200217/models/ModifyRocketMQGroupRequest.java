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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRocketMQGroupRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 消费组名称
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 说明信息，最长128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否开启消费
    */
    @SerializedName("ReadEnable")
    @Expose
    private Boolean ReadEnable;

    /**
    * 是否开启广播消费
    */
    @SerializedName("BroadcastEnable")
    @Expose
    private Boolean BroadcastEnable;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间 
     * @return NamespaceId 命名空间
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间
     * @param NamespaceId 命名空间
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 消费组名称 
     * @return GroupId 消费组名称
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 消费组名称
     * @param GroupId 消费组名称
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 说明信息，最长128个字符 
     * @return Remark 说明信息，最长128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息，最长128个字符
     * @param Remark 说明信息，最长128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否开启消费 
     * @return ReadEnable 是否开启消费
     */
    public Boolean getReadEnable() {
        return this.ReadEnable;
    }

    /**
     * Set 是否开启消费
     * @param ReadEnable 是否开启消费
     */
    public void setReadEnable(Boolean ReadEnable) {
        this.ReadEnable = ReadEnable;
    }

    /**
     * Get 是否开启广播消费 
     * @return BroadcastEnable 是否开启广播消费
     */
    public Boolean getBroadcastEnable() {
        return this.BroadcastEnable;
    }

    /**
     * Set 是否开启广播消费
     * @param BroadcastEnable 是否开启广播消费
     */
    public void setBroadcastEnable(Boolean BroadcastEnable) {
        this.BroadcastEnable = BroadcastEnable;
    }

    public ModifyRocketMQGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQGroupRequest(ModifyRocketMQGroupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ReadEnable != null) {
            this.ReadEnable = new Boolean(source.ReadEnable);
        }
        if (source.BroadcastEnable != null) {
            this.BroadcastEnable = new Boolean(source.BroadcastEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReadEnable", this.ReadEnable);
        this.setParamSimple(map, prefix + "BroadcastEnable", this.BroadcastEnable);

    }
}

