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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDetail extends AbstractModel {

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * 业务系统ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 用户appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUIN")
    @Expose
    private String CreateUIN;

    /**
    * 应用名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 应用描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 业务系统名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceID 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceID 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get 业务系统ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceKey 业务系统ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 业务系统ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceKey 业务系统ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 用户appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 主账号uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUIN 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUIN() {
        return this.CreateUIN;
    }

    /**
     * Set 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUIN 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUIN(String CreateUIN) {
        this.CreateUIN = CreateUIN;
    }

    /**
     * Get 应用名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 应用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 应用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 应用描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDescription 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDescription 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 业务系统名称 
     * @return InstanceName 业务系统名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 业务系统名称
     * @param InstanceName 业务系统名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public ServiceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDetail(ServiceDetail source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.CreateUIN != null) {
            this.CreateUIN = new String(source.CreateUIN);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CreateUIN", this.CreateUIN);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

