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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel{

    /**
    * 实例id
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
    * 实例的状态。0：创建中，1：运行中，2：删除中 ， 5 隔离中，-1 创建失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否开源实例。开源：true，不开源：false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IfCommunity")
    @Expose
    private Boolean IfCommunity;

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
     * Get 实例的状态。0：创建中，1：运行中，2：删除中 ， 5 隔离中，-1 创建失败 
     * @return Status 实例的状态。0：创建中，1：运行中，2：删除中 ， 5 隔离中，-1 创建失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例的状态。0：创建中，1：运行中，2：删除中 ， 5 隔离中，-1 创建失败
     * @param Status 实例的状态。0：创建中，1：运行中，2：删除中 ， 5 隔离中，-1 创建失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否开源实例。开源：true，不开源：false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IfCommunity 是否开源实例。开源：true，不开源：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIfCommunity() {
        return this.IfCommunity;
    }

    /**
     * Set 是否开源实例。开源：true，不开源：false
注意：此字段可能返回 null，表示取不到有效值。
     * @param IfCommunity 是否开源实例。开源：true，不开源：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIfCommunity(Boolean IfCommunity) {
        this.IfCommunity = IfCommunity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IfCommunity", this.IfCommunity);

    }
}

