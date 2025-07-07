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

public class ModifyRabbitMQVipInstanceRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群名称，不填则不修改。非空字符串时必须 3-64 个字符，只能包含数字、字母、“-”和“_”
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 备注，不填则不修改
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否开启删除保护，不填则不修改
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群名称，不填则不修改。非空字符串时必须 3-64 个字符，只能包含数字、字母、“-”和“_” 
     * @return ClusterName 集群名称，不填则不修改。非空字符串时必须 3-64 个字符，只能包含数字、字母、“-”和“_”
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称，不填则不修改。非空字符串时必须 3-64 个字符，只能包含数字、字母、“-”和“_”
     * @param ClusterName 集群名称，不填则不修改。非空字符串时必须 3-64 个字符，只能包含数字、字母、“-”和“_”
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 备注，不填则不修改 
     * @return Remark 备注，不填则不修改
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，不填则不修改
     * @param Remark 备注，不填则不修改
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否开启删除保护，不填则不修改 
     * @return EnableDeletionProtection 是否开启删除保护，不填则不修改
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set 是否开启删除保护，不填则不修改
     * @param EnableDeletionProtection 是否开启删除保护，不填则不修改
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public ModifyRabbitMQVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQVipInstanceRequest(ModifyRabbitMQVipInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

