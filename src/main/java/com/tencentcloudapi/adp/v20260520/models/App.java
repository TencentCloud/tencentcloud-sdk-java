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
    * <p>辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuxiliaryInfo")
    @Expose
    private AppAuxiliaryInfo AuxiliaryInfo;

    /**
    * <p>配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private AppConfig Config;

    /**
    * <p>元数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private AppMetadata Metadata;

    /**
    * <p>应用密钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretInfo")
    @Expose
    private AppSecretInfo SecretInfo;

    /**
    * <p>分享链接信息(含访问控制)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareUrlInfo")
    @Expose
    private AppShareURLInfo ShareUrlInfo;

    /**
    * <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private AppStatusInfo Status;

    /**
    * <p>应用引用的共享知识库列表</p>
    */
    @SerializedName("SharedKbList")
    @Expose
    private AppSharedKbInfo [] SharedKbList;

    /**
    * <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private CorpShareConfig CorpShareConfig;

    /**
     * Get <p>辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuxiliaryInfo <p>辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppAuxiliaryInfo getAuxiliaryInfo() {
        return this.AuxiliaryInfo;
    }

    /**
     * Set <p>辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuxiliaryInfo <p>辅助信息(子状态/审批/申诉/搜索资源/特殊状态等)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuxiliaryInfo(AppAuxiliaryInfo AuxiliaryInfo) {
        this.AuxiliaryInfo = AuxiliaryInfo;
    }

    /**
     * Get <p>配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config <p>配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config <p>配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(AppConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>元数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata <p>元数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>元数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata <p>元数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(AppMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>应用密钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretInfo <p>应用密钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppSecretInfo getSecretInfo() {
        return this.SecretInfo;
    }

    /**
     * Set <p>应用密钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretInfo <p>应用密钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretInfo(AppSecretInfo SecretInfo) {
        this.SecretInfo = SecretInfo;
    }

    /**
     * Get <p>分享链接信息(含访问控制)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareUrlInfo <p>分享链接信息(含访问控制)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppShareURLInfo getShareUrlInfo() {
        return this.ShareUrlInfo;
    }

    /**
     * Set <p>分享链接信息(含访问控制)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareUrlInfo <p>分享链接信息(含访问控制)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareUrlInfo(AppShareURLInfo ShareUrlInfo) {
        this.ShareUrlInfo = ShareUrlInfo;
    }

    /**
     * Get <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppStatusInfo getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(AppStatusInfo Status) {
        this.Status = Status;
    }

    /**
     * Get <p>应用引用的共享知识库列表</p> 
     * @return SharedKbList <p>应用引用的共享知识库列表</p>
     */
    public AppSharedKbInfo [] getSharedKbList() {
        return this.SharedKbList;
    }

    /**
     * Set <p>应用引用的共享知识库列表</p>
     * @param SharedKbList <p>应用引用的共享知识库列表</p>
     */
    public void setSharedKbList(AppSharedKbInfo [] SharedKbList) {
        this.SharedKbList = SharedKbList;
    }

    /**
     * Get <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpShareConfig <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpShareConfig <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpShareConfig(CorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
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
        if (source.SharedKbList != null) {
            this.SharedKbList = new AppSharedKbInfo[source.SharedKbList.length];
            for (int i = 0; i < source.SharedKbList.length; i++) {
                this.SharedKbList[i] = new AppSharedKbInfo(source.SharedKbList[i]);
            }
        }
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new CorpShareConfig(source.CorpShareConfig);
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
        this.setParamArrayObj(map, prefix + "SharedKbList.", this.SharedKbList);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);

    }
}

