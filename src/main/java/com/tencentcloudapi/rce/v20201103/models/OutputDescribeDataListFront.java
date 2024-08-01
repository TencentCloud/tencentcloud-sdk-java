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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputDescribeDataListFront extends AbstractModel {

    /**
    * 名单数据ID
    */
    @SerializedName("NameListDataId")
    @Expose
    private Long NameListDataId;

    /**
    * 名单ID
    */
    @SerializedName("NameListId")
    @Expose
    private Long NameListId;

    /**
    * 名单数据内容
    */
    @SerializedName("DataContent")
    @Expose
    private String DataContent;

    /**
    * 数据来源，固定传2（手工录入）
    */
    @SerializedName("DataSource")
    @Expose
    private Long DataSource;

    /**
    * 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 名单数据状态 [1 启用 2 停用]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 名单数据描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 名单数据创建时间，时间格式示例"2024-05-05 12:10:15"
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 名单数据更新时间，时间格式示例"2024-05-05 12:10:15"
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 加密名单数据内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptDataContent")
    @Expose
    private String EncryptDataContent;

    /**
     * Get 名单数据ID 
     * @return NameListDataId 名单数据ID
     */
    public Long getNameListDataId() {
        return this.NameListDataId;
    }

    /**
     * Set 名单数据ID
     * @param NameListDataId 名单数据ID
     */
    public void setNameListDataId(Long NameListDataId) {
        this.NameListDataId = NameListDataId;
    }

    /**
     * Get 名单ID 
     * @return NameListId 名单ID
     */
    public Long getNameListId() {
        return this.NameListId;
    }

    /**
     * Set 名单ID
     * @param NameListId 名单ID
     */
    public void setNameListId(Long NameListId) {
        this.NameListId = NameListId;
    }

    /**
     * Get 名单数据内容 
     * @return DataContent 名单数据内容
     */
    public String getDataContent() {
        return this.DataContent;
    }

    /**
     * Set 名单数据内容
     * @param DataContent 名单数据内容
     */
    public void setDataContent(String DataContent) {
        this.DataContent = DataContent;
    }

    /**
     * Get 数据来源，固定传2（手工录入） 
     * @return DataSource 数据来源，固定传2（手工录入）
     */
    public Long getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源，固定传2（手工录入）
     * @param DataSource 数据来源，固定传2（手工录入）
     */
    public void setDataSource(Long DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 名单数据状态 [1 启用 2 停用] 
     * @return Status 名单数据状态 [1 启用 2 停用]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 名单数据状态 [1 启用 2 停用]
     * @param Status 名单数据状态 [1 启用 2 停用]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 名单数据描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 名单数据描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 名单数据描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 名单数据描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 名单数据创建时间，时间格式示例"2024-05-05 12:10:15" 
     * @return CreateTime 名单数据创建时间，时间格式示例"2024-05-05 12:10:15"
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 名单数据创建时间，时间格式示例"2024-05-05 12:10:15"
     * @param CreateTime 名单数据创建时间，时间格式示例"2024-05-05 12:10:15"
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 名单数据更新时间，时间格式示例"2024-05-05 12:10:15" 
     * @return UpdateTime 名单数据更新时间，时间格式示例"2024-05-05 12:10:15"
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 名单数据更新时间，时间格式示例"2024-05-05 12:10:15"
     * @param UpdateTime 名单数据更新时间，时间格式示例"2024-05-05 12:10:15"
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 加密名单数据内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptDataContent 加密名单数据内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptDataContent() {
        return this.EncryptDataContent;
    }

    /**
     * Set 加密名单数据内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptDataContent 加密名单数据内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptDataContent(String EncryptDataContent) {
        this.EncryptDataContent = EncryptDataContent;
    }

    public OutputDescribeDataListFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputDescribeDataListFront(OutputDescribeDataListFront source) {
        if (source.NameListDataId != null) {
            this.NameListDataId = new Long(source.NameListDataId);
        }
        if (source.NameListId != null) {
            this.NameListId = new Long(source.NameListId);
        }
        if (source.DataContent != null) {
            this.DataContent = new String(source.DataContent);
        }
        if (source.DataSource != null) {
            this.DataSource = new Long(source.DataSource);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EncryptDataContent != null) {
            this.EncryptDataContent = new String(source.EncryptDataContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameListDataId", this.NameListDataId);
        this.setParamSimple(map, prefix + "NameListId", this.NameListId);
        this.setParamSimple(map, prefix + "DataContent", this.DataContent);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EncryptDataContent", this.EncryptDataContent);

    }
}

