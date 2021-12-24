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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GridInfo extends AbstractModel{

    /**
    * DeployGridId
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Key
    */
    @SerializedName("GridUniqKey")
    @Expose
    private String GridUniqKey;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作负载类型
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
    * 启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 创建人
    */
    @SerializedName("Publisher")
    @Expose
    private String Publisher;

    /**
    * 版本信息
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get DeployGridId 
     * @return Id DeployGridId
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set DeployGridId
     * @param Id DeployGridId
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Key 
     * @return GridUniqKey Key
     */
    public String getGridUniqKey() {
        return this.GridUniqKey;
    }

    /**
     * Set Key
     * @param GridUniqKey Key
     */
    public void setGridUniqKey(String GridUniqKey) {
        this.GridUniqKey = GridUniqKey;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作负载类型 
     * @return WorkloadKind 工作负载类型
     */
    public String getWorkloadKind() {
        return this.WorkloadKind;
    }

    /**
     * Set 工作负载类型
     * @param WorkloadKind 工作负载类型
     */
    public void setWorkloadKind(String WorkloadKind) {
        this.WorkloadKind = WorkloadKind;
    }

    /**
     * Get 启动时间 
     * @return StartTime 启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
     * @param StartTime 启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas 副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 创建人 
     * @return Publisher 创建人
     */
    public String getPublisher() {
        return this.Publisher;
    }

    /**
     * Set 创建人
     * @param Publisher 创建人
     */
    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    /**
     * Get 版本信息 
     * @return Version 版本信息
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本信息
     * @param Version 版本信息
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public GridInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GridInfo(GridInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GridUniqKey != null) {
            this.GridUniqKey = new String(source.GridUniqKey);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Publisher != null) {
            this.Publisher = new String(source.Publisher);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GridUniqKey", this.GridUniqKey);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Publisher", this.Publisher);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

