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

public class PreviewDataTableCsvRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Cos 存储桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 文件在cos上的存储路径，该路径有固定前缀，/datastudio/data_manage/import/项目ID，example: /datastudio/data_manage/import/1460947878944567296/demo_2.csv
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 首行是否为字段名，默认为 false，如果选择 true，会将首行解析成列名，且在数据中会跳过第一行
    */
    @SerializedName("HeaderLine")
    @Expose
    private Boolean HeaderLine;

    /**
    * 字段分隔符，取值为 0,1,2,3,4,5，各值含义为0: \u0001(hive默认)，1: 竖线 （ | ） ，2: 空格，3: 分号，4: 英文逗号，5: 制表符 \t，如果没填或填错，默认为英文逗号
    */
    @SerializedName("ColumnDelimiter")
    @Expose
    private String ColumnDelimiter;

    /**
    * 转义符，char 类型，只取当前参数的第一个字符，如果不传，默认为 \
    */
    @SerializedName("Escape")
    @Expose
    private String Escape;

    /**
    * 引号符，取值为 0、1，各个值的含义为 0: 英文单引号，1: 英文双引号，如果没填或填错，默认为英文双引号
    */
    @SerializedName("Quote")
    @Expose
    private String Quote;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cos 存储桶名称 
     * @return BucketName Cos 存储桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Cos 存储桶名称
     * @param BucketName Cos 存储桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 文件在cos上的存储路径，该路径有固定前缀，/datastudio/data_manage/import/项目ID，example: /datastudio/data_manage/import/1460947878944567296/demo_2.csv 
     * @return FilePath 文件在cos上的存储路径，该路径有固定前缀，/datastudio/data_manage/import/项目ID，example: /datastudio/data_manage/import/1460947878944567296/demo_2.csv
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件在cos上的存储路径，该路径有固定前缀，/datastudio/data_manage/import/项目ID，example: /datastudio/data_manage/import/1460947878944567296/demo_2.csv
     * @param FilePath 文件在cos上的存储路径，该路径有固定前缀，/datastudio/data_manage/import/项目ID，example: /datastudio/data_manage/import/1460947878944567296/demo_2.csv
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 首行是否为字段名，默认为 false，如果选择 true，会将首行解析成列名，且在数据中会跳过第一行 
     * @return HeaderLine 首行是否为字段名，默认为 false，如果选择 true，会将首行解析成列名，且在数据中会跳过第一行
     */
    public Boolean getHeaderLine() {
        return this.HeaderLine;
    }

    /**
     * Set 首行是否为字段名，默认为 false，如果选择 true，会将首行解析成列名，且在数据中会跳过第一行
     * @param HeaderLine 首行是否为字段名，默认为 false，如果选择 true，会将首行解析成列名，且在数据中会跳过第一行
     */
    public void setHeaderLine(Boolean HeaderLine) {
        this.HeaderLine = HeaderLine;
    }

    /**
     * Get 字段分隔符，取值为 0,1,2,3,4,5，各值含义为0: \u0001(hive默认)，1: 竖线 （ | ） ，2: 空格，3: 分号，4: 英文逗号，5: 制表符 \t，如果没填或填错，默认为英文逗号 
     * @return ColumnDelimiter 字段分隔符，取值为 0,1,2,3,4,5，各值含义为0: \u0001(hive默认)，1: 竖线 （ | ） ，2: 空格，3: 分号，4: 英文逗号，5: 制表符 \t，如果没填或填错，默认为英文逗号
     */
    public String getColumnDelimiter() {
        return this.ColumnDelimiter;
    }

    /**
     * Set 字段分隔符，取值为 0,1,2,3,4,5，各值含义为0: \u0001(hive默认)，1: 竖线 （ | ） ，2: 空格，3: 分号，4: 英文逗号，5: 制表符 \t，如果没填或填错，默认为英文逗号
     * @param ColumnDelimiter 字段分隔符，取值为 0,1,2,3,4,5，各值含义为0: \u0001(hive默认)，1: 竖线 （ | ） ，2: 空格，3: 分号，4: 英文逗号，5: 制表符 \t，如果没填或填错，默认为英文逗号
     */
    public void setColumnDelimiter(String ColumnDelimiter) {
        this.ColumnDelimiter = ColumnDelimiter;
    }

    /**
     * Get 转义符，char 类型，只取当前参数的第一个字符，如果不传，默认为 \ 
     * @return Escape 转义符，char 类型，只取当前参数的第一个字符，如果不传，默认为 \
     */
    public String getEscape() {
        return this.Escape;
    }

    /**
     * Set 转义符，char 类型，只取当前参数的第一个字符，如果不传，默认为 \
     * @param Escape 转义符，char 类型，只取当前参数的第一个字符，如果不传，默认为 \
     */
    public void setEscape(String Escape) {
        this.Escape = Escape;
    }

    /**
     * Get 引号符，取值为 0、1，各个值的含义为 0: 英文单引号，1: 英文双引号，如果没填或填错，默认为英文双引号 
     * @return Quote 引号符，取值为 0、1，各个值的含义为 0: 英文单引号，1: 英文双引号，如果没填或填错，默认为英文双引号
     */
    public String getQuote() {
        return this.Quote;
    }

    /**
     * Set 引号符，取值为 0、1，各个值的含义为 0: 英文单引号，1: 英文双引号，如果没填或填错，默认为英文双引号
     * @param Quote 引号符，取值为 0、1，各个值的含义为 0: 英文单引号，1: 英文双引号，如果没填或填错，默认为英文双引号
     */
    public void setQuote(String Quote) {
        this.Quote = Quote;
    }

    public PreviewDataTableCsvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewDataTableCsvRequest(PreviewDataTableCsvRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.HeaderLine != null) {
            this.HeaderLine = new Boolean(source.HeaderLine);
        }
        if (source.ColumnDelimiter != null) {
            this.ColumnDelimiter = new String(source.ColumnDelimiter);
        }
        if (source.Escape != null) {
            this.Escape = new String(source.Escape);
        }
        if (source.Quote != null) {
            this.Quote = new String(source.Quote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "HeaderLine", this.HeaderLine);
        this.setParamSimple(map, prefix + "ColumnDelimiter", this.ColumnDelimiter);
        this.setParamSimple(map, prefix + "Escape", this.Escape);
        this.setParamSimple(map, prefix + "Quote", this.Quote);

    }
}

