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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSetting extends AbstractModel{

    /**
    * 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort [] ProtocolPorts;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 是否创建 k8s service，默认为 false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisableService")
    @Expose
    private Boolean DisableService;

    /**
    * service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadlessService")
    @Expose
    private Boolean HeadlessService;

    /**
    * 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowDeleteService")
    @Expose
    private Boolean AllowDeleteService;

    /**
    * 开启SessionAffinity，true为开启，false为不开启，默认为false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenSessionAffinity")
    @Expose
    private Boolean OpenSessionAffinity;

    /**
    * SessionAffinity会话时间，默认10800
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionAffinityTimeoutSeconds")
    @Expose
    private Long SessionAffinityTimeoutSeconds;

    /**
     * Get 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 0:公网, 1:集群内访问, 2：NodePort, 3: VPC 内网访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolPorts 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolPorts 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 是否创建 k8s service，默认为 false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisableService 是否创建 k8s service，默认为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDisableService() {
        return this.DisableService;
    }

    /**
     * Set 是否创建 k8s service，默认为 false
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisableService 是否创建 k8s service，默认为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisableService(Boolean DisableService) {
        this.DisableService = DisableService;
    }

    /**
     * Get service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadlessService service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHeadlessService() {
        return this.HeadlessService;
    }

    /**
     * Set service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadlessService service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadlessService(Boolean HeadlessService) {
        this.HeadlessService = HeadlessService;
    }

    /**
     * Get 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowDeleteService 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowDeleteService() {
        return this.AllowDeleteService;
    }

    /**
     * Set 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowDeleteService 当为 true 且 DisableService 也为 true 时，会删除之前创建的 service，请小心使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowDeleteService(Boolean AllowDeleteService) {
        this.AllowDeleteService = AllowDeleteService;
    }

    /**
     * Get 开启SessionAffinity，true为开启，false为不开启，默认为false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenSessionAffinity 开启SessionAffinity，true为开启，false为不开启，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOpenSessionAffinity() {
        return this.OpenSessionAffinity;
    }

    /**
     * Set 开启SessionAffinity，true为开启，false为不开启，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenSessionAffinity 开启SessionAffinity，true为开启，false为不开启，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenSessionAffinity(Boolean OpenSessionAffinity) {
        this.OpenSessionAffinity = OpenSessionAffinity;
    }

    /**
     * Get SessionAffinity会话时间，默认10800
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionAffinityTimeoutSeconds SessionAffinity会话时间，默认10800
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionAffinityTimeoutSeconds() {
        return this.SessionAffinityTimeoutSeconds;
    }

    /**
     * Set SessionAffinity会话时间，默认10800
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionAffinityTimeoutSeconds SessionAffinity会话时间，默认10800
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionAffinityTimeoutSeconds(Long SessionAffinityTimeoutSeconds) {
        this.SessionAffinityTimeoutSeconds = SessionAffinityTimeoutSeconds;
    }

    public ServiceSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceSetting(ServiceSetting source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.ProtocolPorts != null) {
            this.ProtocolPorts = new ProtocolPort[source.ProtocolPorts.length];
            for (int i = 0; i < source.ProtocolPorts.length; i++) {
                this.ProtocolPorts[i] = new ProtocolPort(source.ProtocolPorts[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DisableService != null) {
            this.DisableService = new Boolean(source.DisableService);
        }
        if (source.HeadlessService != null) {
            this.HeadlessService = new Boolean(source.HeadlessService);
        }
        if (source.AllowDeleteService != null) {
            this.AllowDeleteService = new Boolean(source.AllowDeleteService);
        }
        if (source.OpenSessionAffinity != null) {
            this.OpenSessionAffinity = new Boolean(source.OpenSessionAffinity);
        }
        if (source.SessionAffinityTimeoutSeconds != null) {
            this.SessionAffinityTimeoutSeconds = new Long(source.SessionAffinityTimeoutSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "ProtocolPorts.", this.ProtocolPorts);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DisableService", this.DisableService);
        this.setParamSimple(map, prefix + "HeadlessService", this.HeadlessService);
        this.setParamSimple(map, prefix + "AllowDeleteService", this.AllowDeleteService);
        this.setParamSimple(map, prefix + "OpenSessionAffinity", this.OpenSessionAffinity);
        this.setParamSimple(map, prefix + "SessionAffinityTimeoutSeconds", this.SessionAffinityTimeoutSeconds);

    }
}

