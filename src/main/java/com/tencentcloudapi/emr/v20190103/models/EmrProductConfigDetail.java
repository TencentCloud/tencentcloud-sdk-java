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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrProductConfigDetail extends AbstractModel {

    /**
    * 软件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftInfo")
    @Expose
    private String [] SoftInfo;

    /**
    * Master节点个数
    */
    @SerializedName("MasterNodeSize")
    @Expose
    private Long MasterNodeSize;

    /**
    * Core节点个数
    */
    @SerializedName("CoreNodeSize")
    @Expose
    private Long CoreNodeSize;

    /**
    * Task节点个数
    */
    @SerializedName("TaskNodeSize")
    @Expose
    private Long TaskNodeSize;

    /**
    * Common节点个数
    */
    @SerializedName("ComNodeSize")
    @Expose
    private Long ComNodeSize;

    /**
    * Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterResource")
    @Expose
    private ResourceDetail MasterResource;

    /**
    * Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreResource")
    @Expose
    private ResourceDetail CoreResource;

    /**
    * Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskResource")
    @Expose
    private ResourceDetail TaskResource;

    /**
    * Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComResource")
    @Expose
    private ResourceDetail ComResource;

    /**
    * 是否使用COS
    */
    @SerializedName("OnCos")
    @Expose
    private Boolean OnCos;

    /**
    * 收费类型
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Router节点个数
    */
    @SerializedName("RouterNodeSize")
    @Expose
    private Long RouterNodeSize;

    /**
    * 是否支持HA
    */
    @SerializedName("SupportHA")
    @Expose
    private Boolean SupportHA;

    /**
    * 是否支持安全模式
    */
    @SerializedName("SecurityOn")
    @Expose
    private Boolean SecurityOn;

    /**
    * 安全组名称
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * 是否开启Cbs加密
    */
    @SerializedName("CbsEncrypt")
    @Expose
    private Long CbsEncrypt;

    /**
    * 自定义应用角色。
    */
    @SerializedName("ApplicationRole")
    @Expose
    private String ApplicationRole;

    /**
    * 安全组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * SSH密钥Id
    */
    @SerializedName("PublicKeyId")
    @Expose
    private String PublicKeyId;

    /**
     * Get 软件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftInfo 软件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSoftInfo() {
        return this.SoftInfo;
    }

    /**
     * Set 软件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftInfo 软件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftInfo(String [] SoftInfo) {
        this.SoftInfo = SoftInfo;
    }

    /**
     * Get Master节点个数 
     * @return MasterNodeSize Master节点个数
     */
    public Long getMasterNodeSize() {
        return this.MasterNodeSize;
    }

    /**
     * Set Master节点个数
     * @param MasterNodeSize Master节点个数
     */
    public void setMasterNodeSize(Long MasterNodeSize) {
        this.MasterNodeSize = MasterNodeSize;
    }

    /**
     * Get Core节点个数 
     * @return CoreNodeSize Core节点个数
     */
    public Long getCoreNodeSize() {
        return this.CoreNodeSize;
    }

    /**
     * Set Core节点个数
     * @param CoreNodeSize Core节点个数
     */
    public void setCoreNodeSize(Long CoreNodeSize) {
        this.CoreNodeSize = CoreNodeSize;
    }

    /**
     * Get Task节点个数 
     * @return TaskNodeSize Task节点个数
     */
    public Long getTaskNodeSize() {
        return this.TaskNodeSize;
    }

    /**
     * Set Task节点个数
     * @param TaskNodeSize Task节点个数
     */
    public void setTaskNodeSize(Long TaskNodeSize) {
        this.TaskNodeSize = TaskNodeSize;
    }

    /**
     * Get Common节点个数 
     * @return ComNodeSize Common节点个数
     */
    public Long getComNodeSize() {
        return this.ComNodeSize;
    }

    /**
     * Set Common节点个数
     * @param ComNodeSize Common节点个数
     */
    public void setComNodeSize(Long ComNodeSize) {
        this.ComNodeSize = ComNodeSize;
    }

    /**
     * Get Master节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterResource Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceDetail getMasterResource() {
        return this.MasterResource;
    }

    /**
     * Set Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterResource Master节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterResource(ResourceDetail MasterResource) {
        this.MasterResource = MasterResource;
    }

    /**
     * Get Core节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoreResource Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceDetail getCoreResource() {
        return this.CoreResource;
    }

    /**
     * Set Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreResource Core节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreResource(ResourceDetail CoreResource) {
        this.CoreResource = CoreResource;
    }

    /**
     * Get Task节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskResource Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceDetail getTaskResource() {
        return this.TaskResource;
    }

    /**
     * Set Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskResource Task节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskResource(ResourceDetail TaskResource) {
        this.TaskResource = TaskResource;
    }

    /**
     * Get Common节点资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComResource Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceDetail getComResource() {
        return this.ComResource;
    }

    /**
     * Set Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComResource Common节点资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComResource(ResourceDetail ComResource) {
        this.ComResource = ComResource;
    }

    /**
     * Get 是否使用COS 
     * @return OnCos 是否使用COS
     */
    public Boolean getOnCos() {
        return this.OnCos;
    }

    /**
     * Set 是否使用COS
     * @param OnCos 是否使用COS
     */
    public void setOnCos(Boolean OnCos) {
        this.OnCos = OnCos;
    }

    /**
     * Get 收费类型 
     * @return ChargeType 收费类型
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 收费类型
     * @param ChargeType 收费类型
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Router节点个数 
     * @return RouterNodeSize Router节点个数
     */
    public Long getRouterNodeSize() {
        return this.RouterNodeSize;
    }

    /**
     * Set Router节点个数
     * @param RouterNodeSize Router节点个数
     */
    public void setRouterNodeSize(Long RouterNodeSize) {
        this.RouterNodeSize = RouterNodeSize;
    }

    /**
     * Get 是否支持HA 
     * @return SupportHA 是否支持HA
     */
    public Boolean getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set 是否支持HA
     * @param SupportHA 是否支持HA
     */
    public void setSupportHA(Boolean SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get 是否支持安全模式 
     * @return SecurityOn 是否支持安全模式
     */
    public Boolean getSecurityOn() {
        return this.SecurityOn;
    }

    /**
     * Set 是否支持安全模式
     * @param SecurityOn 是否支持安全模式
     */
    public void setSecurityOn(Boolean SecurityOn) {
        this.SecurityOn = SecurityOn;
    }

    /**
     * Get 安全组名称 
     * @return SecurityGroup 安全组名称
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组名称
     * @param SecurityGroup 安全组名称
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 是否开启Cbs加密 
     * @return CbsEncrypt 是否开启Cbs加密
     */
    public Long getCbsEncrypt() {
        return this.CbsEncrypt;
    }

    /**
     * Set 是否开启Cbs加密
     * @param CbsEncrypt 是否开启Cbs加密
     */
    public void setCbsEncrypt(Long CbsEncrypt) {
        this.CbsEncrypt = CbsEncrypt;
    }

    /**
     * Get 自定义应用角色。 
     * @return ApplicationRole 自定义应用角色。
     */
    public String getApplicationRole() {
        return this.ApplicationRole;
    }

    /**
     * Set 自定义应用角色。
     * @param ApplicationRole 自定义应用角色。
     */
    public void setApplicationRole(String ApplicationRole) {
        this.ApplicationRole = ApplicationRole;
    }

    /**
     * Get 安全组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroups 安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 安全组
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroups 安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get SSH密钥Id 
     * @return PublicKeyId SSH密钥Id
     */
    public String getPublicKeyId() {
        return this.PublicKeyId;
    }

    /**
     * Set SSH密钥Id
     * @param PublicKeyId SSH密钥Id
     */
    public void setPublicKeyId(String PublicKeyId) {
        this.PublicKeyId = PublicKeyId;
    }

    public EmrProductConfigDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrProductConfigDetail(EmrProductConfigDetail source) {
        if (source.SoftInfo != null) {
            this.SoftInfo = new String[source.SoftInfo.length];
            for (int i = 0; i < source.SoftInfo.length; i++) {
                this.SoftInfo[i] = new String(source.SoftInfo[i]);
            }
        }
        if (source.MasterNodeSize != null) {
            this.MasterNodeSize = new Long(source.MasterNodeSize);
        }
        if (source.CoreNodeSize != null) {
            this.CoreNodeSize = new Long(source.CoreNodeSize);
        }
        if (source.TaskNodeSize != null) {
            this.TaskNodeSize = new Long(source.TaskNodeSize);
        }
        if (source.ComNodeSize != null) {
            this.ComNodeSize = new Long(source.ComNodeSize);
        }
        if (source.MasterResource != null) {
            this.MasterResource = new ResourceDetail(source.MasterResource);
        }
        if (source.CoreResource != null) {
            this.CoreResource = new ResourceDetail(source.CoreResource);
        }
        if (source.TaskResource != null) {
            this.TaskResource = new ResourceDetail(source.TaskResource);
        }
        if (source.ComResource != null) {
            this.ComResource = new ResourceDetail(source.ComResource);
        }
        if (source.OnCos != null) {
            this.OnCos = new Boolean(source.OnCos);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.RouterNodeSize != null) {
            this.RouterNodeSize = new Long(source.RouterNodeSize);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Boolean(source.SupportHA);
        }
        if (source.SecurityOn != null) {
            this.SecurityOn = new Boolean(source.SecurityOn);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.CbsEncrypt != null) {
            this.CbsEncrypt = new Long(source.CbsEncrypt);
        }
        if (source.ApplicationRole != null) {
            this.ApplicationRole = new String(source.ApplicationRole);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.PublicKeyId != null) {
            this.PublicKeyId = new String(source.PublicKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SoftInfo.", this.SoftInfo);
        this.setParamSimple(map, prefix + "MasterNodeSize", this.MasterNodeSize);
        this.setParamSimple(map, prefix + "CoreNodeSize", this.CoreNodeSize);
        this.setParamSimple(map, prefix + "TaskNodeSize", this.TaskNodeSize);
        this.setParamSimple(map, prefix + "ComNodeSize", this.ComNodeSize);
        this.setParamObj(map, prefix + "MasterResource.", this.MasterResource);
        this.setParamObj(map, prefix + "CoreResource.", this.CoreResource);
        this.setParamObj(map, prefix + "TaskResource.", this.TaskResource);
        this.setParamObj(map, prefix + "ComResource.", this.ComResource);
        this.setParamSimple(map, prefix + "OnCos", this.OnCos);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "RouterNodeSize", this.RouterNodeSize);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamSimple(map, prefix + "SecurityOn", this.SecurityOn);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "CbsEncrypt", this.CbsEncrypt);
        this.setParamSimple(map, prefix + "ApplicationRole", this.ApplicationRole);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "PublicKeyId", this.PublicKeyId);

    }
}

