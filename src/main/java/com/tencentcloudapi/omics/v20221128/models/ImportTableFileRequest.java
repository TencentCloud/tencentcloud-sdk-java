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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportTableFileRequest extends AbstractModel{

    /**
    * 表格关联的项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 表格名称，支持20个字符内的英文字符、数字和下划线。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 表格文件Cos对象路径。
    */
    @SerializedName("CosUri")
    @Expose
    private String CosUri;

    /**
    * 表格文件中每列的数据类型，支持的类型包括：Int、String、File、Array[File]
    */
    @SerializedName("DataType")
    @Expose
    private String [] DataType;

    /**
    * 表格描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 表格关联的项目ID。 
     * @return ProjectId 表格关联的项目ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 表格关联的项目ID。
     * @param ProjectId 表格关联的项目ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 表格名称，支持20个字符内的英文字符、数字和下划线。 
     * @return Name 表格名称，支持20个字符内的英文字符、数字和下划线。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表格名称，支持20个字符内的英文字符、数字和下划线。
     * @param Name 表格名称，支持20个字符内的英文字符、数字和下划线。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 表格文件Cos对象路径。 
     * @return CosUri 表格文件Cos对象路径。
     */
    public String getCosUri() {
        return this.CosUri;
    }

    /**
     * Set 表格文件Cos对象路径。
     * @param CosUri 表格文件Cos对象路径。
     */
    public void setCosUri(String CosUri) {
        this.CosUri = CosUri;
    }

    /**
     * Get 表格文件中每列的数据类型，支持的类型包括：Int、String、File、Array[File] 
     * @return DataType 表格文件中每列的数据类型，支持的类型包括：Int、String、File、Array[File]
     */
    public String [] getDataType() {
        return this.DataType;
    }

    /**
     * Set 表格文件中每列的数据类型，支持的类型包括：Int、String、File、Array[File]
     * @param DataType 表格文件中每列的数据类型，支持的类型包括：Int、String、File、Array[File]
     */
    public void setDataType(String [] DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 表格描述。 
     * @return Description 表格描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 表格描述。
     * @param Description 表格描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ImportTableFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportTableFileRequest(ImportTableFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CosUri != null) {
            this.CosUri = new String(source.CosUri);
        }
        if (source.DataType != null) {
            this.DataType = new String[source.DataType.length];
            for (int i = 0; i < source.DataType.length; i++) {
                this.DataType[i] = new String(source.DataType[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CosUri", this.CosUri);
        this.setParamArraySimple(map, prefix + "DataType.", this.DataType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

