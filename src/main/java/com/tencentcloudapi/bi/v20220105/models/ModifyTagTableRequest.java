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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTagTableRequest extends AbstractModel {

    /**
    * 标签表名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签表关联的项目id
    */
    @SerializedName("AutoImportProjectId")
    @Expose
    private Long AutoImportProjectId;

    /**
    * 标签表关联的数据表id
    */
    @SerializedName("AutoImportTableId")
    @Expose
    private Long AutoImportTableId;

    /**
    * uin对应字段
    */
    @SerializedName("AutoImportUinField")
    @Expose
    private String AutoImportUinField;

    /**
    * 标签表id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 标签表名 
     * @return Name 标签表名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签表名
     * @param Name 标签表名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签表关联的项目id 
     * @return AutoImportProjectId 标签表关联的项目id
     */
    public Long getAutoImportProjectId() {
        return this.AutoImportProjectId;
    }

    /**
     * Set 标签表关联的项目id
     * @param AutoImportProjectId 标签表关联的项目id
     */
    public void setAutoImportProjectId(Long AutoImportProjectId) {
        this.AutoImportProjectId = AutoImportProjectId;
    }

    /**
     * Get 标签表关联的数据表id 
     * @return AutoImportTableId 标签表关联的数据表id
     */
    public Long getAutoImportTableId() {
        return this.AutoImportTableId;
    }

    /**
     * Set 标签表关联的数据表id
     * @param AutoImportTableId 标签表关联的数据表id
     */
    public void setAutoImportTableId(Long AutoImportTableId) {
        this.AutoImportTableId = AutoImportTableId;
    }

    /**
     * Get uin对应字段 
     * @return AutoImportUinField uin对应字段
     */
    public String getAutoImportUinField() {
        return this.AutoImportUinField;
    }

    /**
     * Set uin对应字段
     * @param AutoImportUinField uin对应字段
     */
    public void setAutoImportUinField(String AutoImportUinField) {
        this.AutoImportUinField = AutoImportUinField;
    }

    /**
     * Get 标签表id 
     * @return Id 标签表id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 标签表id
     * @param Id 标签表id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public ModifyTagTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTagTableRequest(ModifyTagTableRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AutoImportProjectId != null) {
            this.AutoImportProjectId = new Long(source.AutoImportProjectId);
        }
        if (source.AutoImportTableId != null) {
            this.AutoImportTableId = new Long(source.AutoImportTableId);
        }
        if (source.AutoImportUinField != null) {
            this.AutoImportUinField = new String(source.AutoImportUinField);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AutoImportProjectId", this.AutoImportProjectId);
        this.setParamSimple(map, prefix + "AutoImportTableId", this.AutoImportTableId);
        this.setParamSimple(map, prefix + "AutoImportUinField", this.AutoImportUinField);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

