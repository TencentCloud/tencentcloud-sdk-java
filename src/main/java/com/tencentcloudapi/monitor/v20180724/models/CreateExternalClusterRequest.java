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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExternalClusterRequest extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群所在地域
    */
    @SerializedName("ClusterRegion")
    @Expose
    private String ClusterRegion;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 外部标签
    */
    @SerializedName("ExternalLabels")
    @Expose
    private Label [] ExternalLabels;

    /**
    * 是否打开预聚合规则
    */
    @SerializedName("OpenDefaultRecord")
    @Expose
    private Boolean OpenDefaultRecord;

    /**
    * 是否开启公网
    */
    @SerializedName("EnableExternal")
    @Expose
    private Boolean EnableExternal;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群所在地域 
     * @return ClusterRegion 集群所在地域
     */
    public String getClusterRegion() {
        return this.ClusterRegion;
    }

    /**
     * Set 集群所在地域
     * @param ClusterRegion 集群所在地域
     */
    public void setClusterRegion(String ClusterRegion) {
        this.ClusterRegion = ClusterRegion;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 外部标签 
     * @return ExternalLabels 外部标签
     */
    public Label [] getExternalLabels() {
        return this.ExternalLabels;
    }

    /**
     * Set 外部标签
     * @param ExternalLabels 外部标签
     */
    public void setExternalLabels(Label [] ExternalLabels) {
        this.ExternalLabels = ExternalLabels;
    }

    /**
     * Get 是否打开预聚合规则 
     * @return OpenDefaultRecord 是否打开预聚合规则
     */
    public Boolean getOpenDefaultRecord() {
        return this.OpenDefaultRecord;
    }

    /**
     * Set 是否打开预聚合规则
     * @param OpenDefaultRecord 是否打开预聚合规则
     */
    public void setOpenDefaultRecord(Boolean OpenDefaultRecord) {
        this.OpenDefaultRecord = OpenDefaultRecord;
    }

    /**
     * Get 是否开启公网 
     * @return EnableExternal 是否开启公网
     */
    public Boolean getEnableExternal() {
        return this.EnableExternal;
    }

    /**
     * Set 是否开启公网
     * @param EnableExternal 是否开启公网
     */
    public void setEnableExternal(Boolean EnableExternal) {
        this.EnableExternal = EnableExternal;
    }

    public CreateExternalClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExternalClusterRequest(CreateExternalClusterRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterRegion != null) {
            this.ClusterRegion = new String(source.ClusterRegion);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ExternalLabels != null) {
            this.ExternalLabels = new Label[source.ExternalLabels.length];
            for (int i = 0; i < source.ExternalLabels.length; i++) {
                this.ExternalLabels[i] = new Label(source.ExternalLabels[i]);
            }
        }
        if (source.OpenDefaultRecord != null) {
            this.OpenDefaultRecord = new Boolean(source.OpenDefaultRecord);
        }
        if (source.EnableExternal != null) {
            this.EnableExternal = new Boolean(source.EnableExternal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterRegion", this.ClusterRegion);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ExternalLabels.", this.ExternalLabels);
        this.setParamSimple(map, prefix + "OpenDefaultRecord", this.OpenDefaultRecord);
        this.setParamSimple(map, prefix + "EnableExternal", this.EnableExternal);

    }
}

