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
    * 是否删除所有标签，默认为false
    */
    @SerializedName("RemoveAllTags")
    @Expose
    private Boolean RemoveAllTags;

    /**
    * 修改实例的标签信息，全量标签信息，非增量
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否开启集群风险提示
    */
    @SerializedName("EnableRiskWarning")
    @Expose
    private Boolean EnableRiskWarning;

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

    /**
     * Get 是否删除所有标签，默认为false 
     * @return RemoveAllTags 是否删除所有标签，默认为false
     */
    public Boolean getRemoveAllTags() {
        return this.RemoveAllTags;
    }

    /**
     * Set 是否删除所有标签，默认为false
     * @param RemoveAllTags 是否删除所有标签，默认为false
     */
    public void setRemoveAllTags(Boolean RemoveAllTags) {
        this.RemoveAllTags = RemoveAllTags;
    }

    /**
     * Get 修改实例的标签信息，全量标签信息，非增量 
     * @return Tags 修改实例的标签信息，全量标签信息，非增量
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 修改实例的标签信息，全量标签信息，非增量
     * @param Tags 修改实例的标签信息，全量标签信息，非增量
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启集群风险提示 
     * @return EnableRiskWarning 是否开启集群风险提示
     */
    public Boolean getEnableRiskWarning() {
        return this.EnableRiskWarning;
    }

    /**
     * Set 是否开启集群风险提示
     * @param EnableRiskWarning 是否开启集群风险提示
     */
    public void setEnableRiskWarning(Boolean EnableRiskWarning) {
        this.EnableRiskWarning = EnableRiskWarning;
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
        if (source.RemoveAllTags != null) {
            this.RemoveAllTags = new Boolean(source.RemoveAllTags);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EnableRiskWarning != null) {
            this.EnableRiskWarning = new Boolean(source.EnableRiskWarning);
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
        this.setParamSimple(map, prefix + "RemoveAllTags", this.RemoveAllTags);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableRiskWarning", this.EnableRiskWarning);

    }
}

