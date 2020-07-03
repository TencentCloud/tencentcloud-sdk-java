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
package com.tencentcloudapi.wss.v20180426.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSLProjectInfo extends AbstractModel{

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目所属的 uin（默认项目为0）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建项目的 uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * 项目创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 项目说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目所属的 uin（默认项目为0）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 项目所属的 uin（默认项目为0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 项目所属的 uin（默认项目为0）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 项目所属的 uin（默认项目为0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建项目的 uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建项目的 uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建项目的 uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建项目的 uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 项目创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 项目创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 项目创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 项目创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 项目说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Info 项目说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 项目说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info 项目说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

