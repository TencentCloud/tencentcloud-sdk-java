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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookInstanceSummary extends AbstractModel{

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
    * notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * notebook实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookInstanceStatus")
    @Expose
    private String NotebookInstanceStatus;

    /**
    * 算力类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 算力Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedTime 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedTime 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Get notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookInstanceName notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotebookInstanceName() {
        return this.NotebookInstanceName;
    }

    /**
     * Set notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookInstanceName notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
        this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * Get notebook实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookInstanceStatus notebook实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotebookInstanceStatus() {
        return this.NotebookInstanceStatus;
    }

    /**
     * Set notebook实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookInstanceStatus notebook实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookInstanceStatus(String NotebookInstanceStatus) {
        this.NotebookInstanceStatus = NotebookInstanceStatus;
    }

    /**
     * Get 算力类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 算力类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 算力类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 算力类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 算力Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 算力Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 算力Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 算力Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "NotebookInstanceStatus", this.NotebookInstanceStatus);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

