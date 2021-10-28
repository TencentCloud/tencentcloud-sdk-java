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

public class CreateRocketMQGroupRequest extends AbstractModel{

    /**
    * Group名称，8~64个字符
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 命名空间，目前只支持单个命名空间
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

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
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 说明信息，最长128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Group名称，8~64个字符 
     * @return GroupId Group名称，8~64个字符
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group名称，8~64个字符
     * @param GroupId Group名称，8~64个字符
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 命名空间，目前只支持单个命名空间 
     * @return Namespaces 命名空间，目前只支持单个命名空间
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set 命名空间，目前只支持单个命名空间
     * @param Namespaces 命名空间，目前只支持单个命名空间
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
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

    public CreateRocketMQGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQGroupRequest(CreateRocketMQGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.ReadEnable != null) {
            this.ReadEnable = new Boolean(source.ReadEnable);
        }
        if (source.BroadcastEnable != null) {
            this.BroadcastEnable = new Boolean(source.BroadcastEnable);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "ReadEnable", this.ReadEnable);
        this.setParamSimple(map, prefix + "BroadcastEnable", this.BroadcastEnable);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

