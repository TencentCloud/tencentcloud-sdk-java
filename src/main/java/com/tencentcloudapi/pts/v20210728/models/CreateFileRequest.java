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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileRequest extends AbstractModel{

    /**
    * 文件 ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件种类，参数文件-1，协议文件-2，请求文件-3
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 文件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 文件类型，文件夹-folder
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 行数
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * 前几行数据
    */
    @SerializedName("HeadLines")
    @Expose
    private String [] HeadLines;

    /**
    * 后几行数据
    */
    @SerializedName("TailLines")
    @Expose
    private String [] TailLines;

    /**
    * 表头是否在文件内
    */
    @SerializedName("HeaderInFile")
    @Expose
    private Boolean HeaderInFile;

    /**
    * 表头
    */
    @SerializedName("HeaderColumns")
    @Expose
    private String [] HeaderColumns;

    /**
    * 文件夹中的文件
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
     * Get 文件 ID 
     * @return FileId 文件 ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件 ID
     * @param FileId 文件 ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 项目 ID 
     * @return ProjectId 项目 ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 文件种类，参数文件-1，协议文件-2，请求文件-3 
     * @return Kind 文件种类，参数文件-1，协议文件-2，请求文件-3
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 文件种类，参数文件-1，协议文件-2，请求文件-3
     * @param Kind 文件种类，参数文件-1，协议文件-2，请求文件-3
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 文件名 
     * @return Name 文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件名
     * @param Name 文件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件大小 
     * @return Size 文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小
     * @param Size 文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 文件类型，文件夹-folder 
     * @return Type 文件类型，文件夹-folder
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件类型，文件夹-folder
     * @param Type 文件类型，文件夹-folder
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 行数 
     * @return LineCount 行数
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set 行数
     * @param LineCount 行数
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get 前几行数据 
     * @return HeadLines 前几行数据
     */
    public String [] getHeadLines() {
        return this.HeadLines;
    }

    /**
     * Set 前几行数据
     * @param HeadLines 前几行数据
     */
    public void setHeadLines(String [] HeadLines) {
        this.HeadLines = HeadLines;
    }

    /**
     * Get 后几行数据 
     * @return TailLines 后几行数据
     */
    public String [] getTailLines() {
        return this.TailLines;
    }

    /**
     * Set 后几行数据
     * @param TailLines 后几行数据
     */
    public void setTailLines(String [] TailLines) {
        this.TailLines = TailLines;
    }

    /**
     * Get 表头是否在文件内 
     * @return HeaderInFile 表头是否在文件内
     */
    public Boolean getHeaderInFile() {
        return this.HeaderInFile;
    }

    /**
     * Set 表头是否在文件内
     * @param HeaderInFile 表头是否在文件内
     */
    public void setHeaderInFile(Boolean HeaderInFile) {
        this.HeaderInFile = HeaderInFile;
    }

    /**
     * Get 表头 
     * @return HeaderColumns 表头
     */
    public String [] getHeaderColumns() {
        return this.HeaderColumns;
    }

    /**
     * Set 表头
     * @param HeaderColumns 表头
     */
    public void setHeaderColumns(String [] HeaderColumns) {
        this.HeaderColumns = HeaderColumns;
    }

    /**
     * Get 文件夹中的文件 
     * @return FileInfos 文件夹中的文件
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 文件夹中的文件
     * @param FileInfos 文件夹中的文件
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    public CreateFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileRequest(CreateFileRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.HeadLines != null) {
            this.HeadLines = new String[source.HeadLines.length];
            for (int i = 0; i < source.HeadLines.length; i++) {
                this.HeadLines[i] = new String(source.HeadLines[i]);
            }
        }
        if (source.TailLines != null) {
            this.TailLines = new String[source.TailLines.length];
            for (int i = 0; i < source.TailLines.length; i++) {
                this.TailLines[i] = new String(source.TailLines[i]);
            }
        }
        if (source.HeaderInFile != null) {
            this.HeaderInFile = new Boolean(source.HeaderInFile);
        }
        if (source.HeaderColumns != null) {
            this.HeaderColumns = new String[source.HeaderColumns.length];
            for (int i = 0; i < source.HeaderColumns.length; i++) {
                this.HeaderColumns[i] = new String(source.HeaderColumns[i]);
            }
        }
        if (source.FileInfos != null) {
            this.FileInfos = new FileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FileInfo(source.FileInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamArraySimple(map, prefix + "HeadLines.", this.HeadLines);
        this.setParamArraySimple(map, prefix + "TailLines.", this.TailLines);
        this.setParamSimple(map, prefix + "HeaderInFile", this.HeaderInFile);
        this.setParamArraySimple(map, prefix + "HeaderColumns.", this.HeaderColumns);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);

    }
}

