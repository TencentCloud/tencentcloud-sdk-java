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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 任务状态

<li> **PENDING** </li>  待执行
<li> **PROCESSING** </li>  执行中
<li> **COMPLETED** </li>  完成
<li> **FAILED** </li>  失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务类型

<li> **IMPORT_USER** </li>  用户导入
<li> **EXPORT_USER** </li>  用户导出
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 任务创建时间
    */
    @SerializedName("CreatedDate")
    @Expose
    private Long CreatedDate;

    /**
    * 任务的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 任务结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 失败详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDetails")
    @Expose
    private ErrorDetails [] ErrorDetails;

    /**
    * 失败的用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedUsers")
    @Expose
    private FailedUsers [] FailedUsers;

    /**
     * Get 任务ID 
     * @return Id 任务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 任务ID
     * @param Id 任务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 任务状态

<li> **PENDING** </li>  待执行
<li> **PROCESSING** </li>  执行中
<li> **COMPLETED** </li>  完成
<li> **FAILED** </li>  失败 
     * @return Status 任务状态

<li> **PENDING** </li>  待执行
<li> **PROCESSING** </li>  执行中
<li> **COMPLETED** </li>  完成
<li> **FAILED** </li>  失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态

<li> **PENDING** </li>  待执行
<li> **PROCESSING** </li>  执行中
<li> **COMPLETED** </li>  完成
<li> **FAILED** </li>  失败
     * @param Status 任务状态

<li> **PENDING** </li>  待执行
<li> **PROCESSING** </li>  执行中
<li> **COMPLETED** </li>  完成
<li> **FAILED** </li>  失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务类型

<li> **IMPORT_USER** </li>  用户导入
<li> **EXPORT_USER** </li>  用户导出 
     * @return Type 任务类型

<li> **IMPORT_USER** </li>  用户导入
<li> **EXPORT_USER** </li>  用户导出
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型

<li> **IMPORT_USER** </li>  用户导入
<li> **EXPORT_USER** </li>  用户导出
     * @param Type 任务类型

<li> **IMPORT_USER** </li>  用户导入
<li> **EXPORT_USER** </li>  用户导出
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 任务创建时间 
     * @return CreatedDate 任务创建时间
     */
    public Long getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 任务创建时间
     * @param CreatedDate 任务创建时间
     */
    public void setCreatedDate(Long CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get 任务的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format 任务的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 任务的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format 任务的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 任务结果下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 任务结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 任务结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 任务结果下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 失败详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDetails 失败详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorDetails [] getErrorDetails() {
        return this.ErrorDetails;
    }

    /**
     * Set 失败详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDetails 失败详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDetails(ErrorDetails [] ErrorDetails) {
        this.ErrorDetails = ErrorDetails;
    }

    /**
     * Get 失败的用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedUsers 失败的用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FailedUsers [] getFailedUsers() {
        return this.FailedUsers;
    }

    /**
     * Set 失败的用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedUsers 失败的用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedUsers(FailedUsers [] FailedUsers) {
        this.FailedUsers = FailedUsers;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new Long(source.CreatedDate);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.ErrorDetails != null) {
            this.ErrorDetails = new ErrorDetails[source.ErrorDetails.length];
            for (int i = 0; i < source.ErrorDetails.length; i++) {
                this.ErrorDetails[i] = new ErrorDetails(source.ErrorDetails[i]);
            }
        }
        if (source.FailedUsers != null) {
            this.FailedUsers = new FailedUsers[source.FailedUsers.length];
            for (int i = 0; i < source.FailedUsers.length; i++) {
                this.FailedUsers[i] = new FailedUsers(source.FailedUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "ErrorDetails.", this.ErrorDetails);
        this.setParamArrayObj(map, prefix + "FailedUsers.", this.FailedUsers);

    }
}

