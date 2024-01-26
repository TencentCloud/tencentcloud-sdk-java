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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportTableDataRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据表基本信息
    */
    @SerializedName("TableRequest")
    @Expose
    private TableHybrisReq TableRequest;

    /**
    * 列分隔符
0， \u0001
1, |
2, 空格
3，分号
4，逗号 
    */
    @SerializedName("ColumnDelimiter")
    @Expose
    private String ColumnDelimiter;

    /**
    * 1 是， 0 否
    */
    @SerializedName("HeaderLine")
    @Expose
    private Long HeaderLine;

    /**
    * CSV序列化字段域符,列引号， 
0， 单引号
1，双引号
    */
    @SerializedName("Quote")
    @Expose
    private String Quote;

    /**
    * 源数据存储路径(如cos，需带上桶名)
    */
    @SerializedName("DatasourcePath")
    @Expose
    private String DatasourcePath;

    /**
    * 数据源存储类型（目前仅支持COS，CSP）
    */
    @SerializedName("StorageDataSourceType")
    @Expose
    private String StorageDataSourceType;

    /**
    * 文件格式（目前仅支持CSV,TSV）
    */
    @SerializedName("FileFormat")
    @Expose
    private String FileFormat;

    /**
    * 导入表类型（目前仅支持HIVE）
    */
    @SerializedName("ImportTableType")
    @Expose
    private String ImportTableType;

    /**
    * 数据源类型（目前仅支持HIVE）
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * 表描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * nameCn中文名
    */
    @SerializedName("NameCn")
    @Expose
    private String NameCn;

    /**
    * 表权限类型：0: owner和项目所有成员都有权限 1: 仅owner和项目管理员有权限
    */
    @SerializedName("Privilege")
    @Expose
    private Long Privilege;

    /**
    * CSV序列化转义符
    */
    @SerializedName("Escape")
    @Expose
    private String Escape;

    /**
    * 空值格式
    */
    @SerializedName("NullFormat")
    @Expose
    private String NullFormat;

    /**
    * 文件编码方式 UTF-8/GBK
    */
    @SerializedName("FileEncode")
    @Expose
    private String FileEncode;

    /**
    * 桶名， cos存储是必传
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据表基本信息 
     * @return TableRequest 数据表基本信息
     */
    public TableHybrisReq getTableRequest() {
        return this.TableRequest;
    }

    /**
     * Set 数据表基本信息
     * @param TableRequest 数据表基本信息
     */
    public void setTableRequest(TableHybrisReq TableRequest) {
        this.TableRequest = TableRequest;
    }

    /**
     * Get 列分隔符
0， \u0001
1, |
2, 空格
3，分号
4，逗号  
     * @return ColumnDelimiter 列分隔符
0， \u0001
1, |
2, 空格
3，分号
4，逗号 
     */
    public String getColumnDelimiter() {
        return this.ColumnDelimiter;
    }

    /**
     * Set 列分隔符
0， \u0001
1, |
2, 空格
3，分号
4，逗号 
     * @param ColumnDelimiter 列分隔符
0， \u0001
1, |
2, 空格
3，分号
4，逗号 
     */
    public void setColumnDelimiter(String ColumnDelimiter) {
        this.ColumnDelimiter = ColumnDelimiter;
    }

    /**
     * Get 1 是， 0 否 
     * @return HeaderLine 1 是， 0 否
     */
    public Long getHeaderLine() {
        return this.HeaderLine;
    }

    /**
     * Set 1 是， 0 否
     * @param HeaderLine 1 是， 0 否
     */
    public void setHeaderLine(Long HeaderLine) {
        this.HeaderLine = HeaderLine;
    }

    /**
     * Get CSV序列化字段域符,列引号， 
0， 单引号
1，双引号 
     * @return Quote CSV序列化字段域符,列引号， 
0， 单引号
1，双引号
     */
    public String getQuote() {
        return this.Quote;
    }

    /**
     * Set CSV序列化字段域符,列引号， 
0， 单引号
1，双引号
     * @param Quote CSV序列化字段域符,列引号， 
0， 单引号
1，双引号
     */
    public void setQuote(String Quote) {
        this.Quote = Quote;
    }

    /**
     * Get 源数据存储路径(如cos，需带上桶名) 
     * @return DatasourcePath 源数据存储路径(如cos，需带上桶名)
     */
    public String getDatasourcePath() {
        return this.DatasourcePath;
    }

    /**
     * Set 源数据存储路径(如cos，需带上桶名)
     * @param DatasourcePath 源数据存储路径(如cos，需带上桶名)
     */
    public void setDatasourcePath(String DatasourcePath) {
        this.DatasourcePath = DatasourcePath;
    }

    /**
     * Get 数据源存储类型（目前仅支持COS，CSP） 
     * @return StorageDataSourceType 数据源存储类型（目前仅支持COS，CSP）
     */
    public String getStorageDataSourceType() {
        return this.StorageDataSourceType;
    }

    /**
     * Set 数据源存储类型（目前仅支持COS，CSP）
     * @param StorageDataSourceType 数据源存储类型（目前仅支持COS，CSP）
     */
    public void setStorageDataSourceType(String StorageDataSourceType) {
        this.StorageDataSourceType = StorageDataSourceType;
    }

    /**
     * Get 文件格式（目前仅支持CSV,TSV） 
     * @return FileFormat 文件格式（目前仅支持CSV,TSV）
     */
    public String getFileFormat() {
        return this.FileFormat;
    }

    /**
     * Set 文件格式（目前仅支持CSV,TSV）
     * @param FileFormat 文件格式（目前仅支持CSV,TSV）
     */
    public void setFileFormat(String FileFormat) {
        this.FileFormat = FileFormat;
    }

    /**
     * Get 导入表类型（目前仅支持HIVE） 
     * @return ImportTableType 导入表类型（目前仅支持HIVE）
     */
    public String getImportTableType() {
        return this.ImportTableType;
    }

    /**
     * Set 导入表类型（目前仅支持HIVE）
     * @param ImportTableType 导入表类型（目前仅支持HIVE）
     */
    public void setImportTableType(String ImportTableType) {
        this.ImportTableType = ImportTableType;
    }

    /**
     * Get 数据源类型（目前仅支持HIVE） 
     * @return MsType 数据源类型（目前仅支持HIVE）
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set 数据源类型（目前仅支持HIVE）
     * @param MsType 数据源类型（目前仅支持HIVE）
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get 表描述 
     * @return Description 表描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 表描述
     * @param Description 表描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get nameCn中文名 
     * @return NameCn nameCn中文名
     */
    public String getNameCn() {
        return this.NameCn;
    }

    /**
     * Set nameCn中文名
     * @param NameCn nameCn中文名
     */
    public void setNameCn(String NameCn) {
        this.NameCn = NameCn;
    }

    /**
     * Get 表权限类型：0: owner和项目所有成员都有权限 1: 仅owner和项目管理员有权限 
     * @return Privilege 表权限类型：0: owner和项目所有成员都有权限 1: 仅owner和项目管理员有权限
     */
    public Long getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 表权限类型：0: owner和项目所有成员都有权限 1: 仅owner和项目管理员有权限
     * @param Privilege 表权限类型：0: owner和项目所有成员都有权限 1: 仅owner和项目管理员有权限
     */
    public void setPrivilege(Long Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get CSV序列化转义符 
     * @return Escape CSV序列化转义符
     */
    public String getEscape() {
        return this.Escape;
    }

    /**
     * Set CSV序列化转义符
     * @param Escape CSV序列化转义符
     */
    public void setEscape(String Escape) {
        this.Escape = Escape;
    }

    /**
     * Get 空值格式 
     * @return NullFormat 空值格式
     */
    public String getNullFormat() {
        return this.NullFormat;
    }

    /**
     * Set 空值格式
     * @param NullFormat 空值格式
     */
    public void setNullFormat(String NullFormat) {
        this.NullFormat = NullFormat;
    }

    /**
     * Get 文件编码方式 UTF-8/GBK 
     * @return FileEncode 文件编码方式 UTF-8/GBK
     */
    public String getFileEncode() {
        return this.FileEncode;
    }

    /**
     * Set 文件编码方式 UTF-8/GBK
     * @param FileEncode 文件编码方式 UTF-8/GBK
     */
    public void setFileEncode(String FileEncode) {
        this.FileEncode = FileEncode;
    }

    /**
     * Get 桶名， cos存储是必传 
     * @return BucketName 桶名， cos存储是必传
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名， cos存储是必传
     * @param BucketName 桶名， cos存储是必传
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    public ImportTableDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportTableDataRequest(ImportTableDataRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.TableRequest != null) {
            this.TableRequest = new TableHybrisReq(source.TableRequest);
        }
        if (source.ColumnDelimiter != null) {
            this.ColumnDelimiter = new String(source.ColumnDelimiter);
        }
        if (source.HeaderLine != null) {
            this.HeaderLine = new Long(source.HeaderLine);
        }
        if (source.Quote != null) {
            this.Quote = new String(source.Quote);
        }
        if (source.DatasourcePath != null) {
            this.DatasourcePath = new String(source.DatasourcePath);
        }
        if (source.StorageDataSourceType != null) {
            this.StorageDataSourceType = new String(source.StorageDataSourceType);
        }
        if (source.FileFormat != null) {
            this.FileFormat = new String(source.FileFormat);
        }
        if (source.ImportTableType != null) {
            this.ImportTableType = new String(source.ImportTableType);
        }
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NameCn != null) {
            this.NameCn = new String(source.NameCn);
        }
        if (source.Privilege != null) {
            this.Privilege = new Long(source.Privilege);
        }
        if (source.Escape != null) {
            this.Escape = new String(source.Escape);
        }
        if (source.NullFormat != null) {
            this.NullFormat = new String(source.NullFormat);
        }
        if (source.FileEncode != null) {
            this.FileEncode = new String(source.FileEncode);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamObj(map, prefix + "TableRequest.", this.TableRequest);
        this.setParamSimple(map, prefix + "ColumnDelimiter", this.ColumnDelimiter);
        this.setParamSimple(map, prefix + "HeaderLine", this.HeaderLine);
        this.setParamSimple(map, prefix + "Quote", this.Quote);
        this.setParamSimple(map, prefix + "DatasourcePath", this.DatasourcePath);
        this.setParamSimple(map, prefix + "StorageDataSourceType", this.StorageDataSourceType);
        this.setParamSimple(map, prefix + "FileFormat", this.FileFormat);
        this.setParamSimple(map, prefix + "ImportTableType", this.ImportTableType);
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NameCn", this.NameCn);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "Escape", this.Escape);
        this.setParamSimple(map, prefix + "NullFormat", this.NullFormat);
        this.setParamSimple(map, prefix + "FileEncode", this.FileEncode);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);

    }
}

