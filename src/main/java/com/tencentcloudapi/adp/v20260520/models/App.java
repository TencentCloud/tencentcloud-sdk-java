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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class App extends AbstractModel {

    /**
    * 辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuxiliaryInfo")
    @Expose
    private AppAuxiliaryInfo AuxiliaryInfo;

    /**
    * 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private AppConfig Config;

    /**
    * 元数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private AppMetadata Metadata;

    /**
    * 应用密钥信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretInfo")
    @Expose
    private AppSecretInfo SecretInfo;

    /**
    * 分享链接信息(含访问控制)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareUrlInfo")
    @Expose
    private AppShareURLInfo ShareUrlInfo;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private AppStatusInfo Status;

    /**
    * 应用引用的共享知识库列表
    */
    @SerializedName("SharedKnowledgeList")
    @Expose
    private AppSharedKnowledgeInfo [] SharedKnowledgeList;

    /**
     * Get 辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuxiliaryInfo 辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppAuxiliaryInfo getAuxiliaryInfo() {
        return this.AuxiliaryInfo;
    }

    /**
     * Set 辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuxiliaryInfo 辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuxiliaryInfo(AppAuxiliaryInfo AuxiliaryInfo) {
        this.AuxiliaryInfo = AuxiliaryInfo;
    }

    /**
     * Get 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(AppConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 元数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 元数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(AppMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 应用密钥信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretInfo 应用密钥信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppSecretInfo getSecretInfo() {
        return this.SecretInfo;
    }

    /**
     * Set 应用密钥信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretInfo 应用密钥信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretInfo(AppSecretInfo SecretInfo) {
        this.SecretInfo = SecretInfo;
    }

    /**
     * Get 分享链接信息(含访问控制)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareUrlInfo 分享链接信息(含访问控制)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppShareURLInfo getShareUrlInfo() {
        return this.ShareUrlInfo;
    }

    /**
     * Set 分享链接信息(含访问控制)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareUrlInfo 分享链接信息(含访问控制)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareUrlInfo(AppShareURLInfo ShareUrlInfo) {
        this.ShareUrlInfo = ShareUrlInfo;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppStatusInfo getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(AppStatusInfo Status) {
        this.Status = Status;
    }

    /**
     * Get 应用引用的共享知识库列表 
     * @return SharedKnowledgeList 应用引用的共享知识库列表
     */
    public AppSharedKnowledgeInfo [] getSharedKnowledgeList() {
        return this.SharedKnowledgeList;
    }

    /**
     * Set 应用引用的共享知识库列表
     * @param SharedKnowledgeList 应用引用的共享知识库列表
     */
    public void setSharedKnowledgeList(AppSharedKnowledgeInfo [] SharedKnowledgeList) {
        this.SharedKnowledgeList = SharedKnowledgeList;
    }

    public App() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public App(App source) {
        if (source.AuxiliaryInfo != null) {
            this.AuxiliaryInfo = new AppAuxiliaryInfo(source.AuxiliaryInfo);
        }
        if (source.Config != null) {
            this.Config = new AppConfig(source.Config);
        }
        if (source.Metadata != null) {
            this.Metadata = new AppMetadata(source.Metadata);
        }
        if (source.SecretInfo != null) {
            this.SecretInfo = new AppSecretInfo(source.SecretInfo);
        }
        if (source.ShareUrlInfo != null) {
            this.ShareUrlInfo = new AppShareURLInfo(source.ShareUrlInfo);
        }
        if (source.Status != null) {
            this.Status = new AppStatusInfo(source.Status);
        }
        if (source.SharedKnowledgeList != null) {
            this.SharedKnowledgeList = new AppSharedKnowledgeInfo[source.SharedKnowledgeList.length];
            for (int i = 0; i < source.SharedKnowledgeList.length; i++) {
                this.SharedKnowledgeList[i] = new AppSharedKnowledgeInfo(source.SharedKnowledgeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AuxiliaryInfo.", this.AuxiliaryInfo);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "SecretInfo.", this.SecretInfo);
        this.setParamObj(map, prefix + "ShareUrlInfo.", this.ShareUrlInfo);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamArrayObj(map, prefix + "SharedKnowledgeList.", this.SharedKnowledgeList);

    }
}

