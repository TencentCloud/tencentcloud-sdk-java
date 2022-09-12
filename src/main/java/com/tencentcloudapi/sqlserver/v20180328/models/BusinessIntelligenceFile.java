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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessIntelligenceFile extends AbstractModel{

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件的COS_URL
    */
    @SerializedName("FileURL")
    @Expose
    private String FileURL;

    /**
    * 文件在服务器上的路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 文件大小，单位时Byte
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件md5值
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 部署文件状态 1-初始化待部署 2-部署中 3-部署成功 4-部署失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 文件创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件部署开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 文件部署结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 报错信息返回
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 商业智能实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 动作相关信息
    */
    @SerializedName("Action")
    @Expose
    private FileAction Action;

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型 
     * @return FileType 文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
     * @param FileType 文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件的COS_URL 
     * @return FileURL 文件的COS_URL
     */
    public String getFileURL() {
        return this.FileURL;
    }

    /**
     * Set 文件的COS_URL
     * @param FileURL 文件的COS_URL
     */
    public void setFileURL(String FileURL) {
        this.FileURL = FileURL;
    }

    /**
     * Get 文件在服务器上的路径 
     * @return FilePath 文件在服务器上的路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件在服务器上的路径
     * @param FilePath 文件在服务器上的路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 文件大小，单位时Byte 
     * @return FileSize 文件大小，单位时Byte
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位时Byte
     * @param FileSize 文件大小，单位时Byte
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件md5值 
     * @return FileMd5 文件md5值
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件md5值
     * @param FileMd5 文件md5值
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 部署文件状态 1-初始化待部署 2-部署中 3-部署成功 4-部署失败 
     * @return Status 部署文件状态 1-初始化待部署 2-部署中 3-部署成功 4-部署失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 部署文件状态 1-初始化待部署 2-部署中 3-部署成功 4-部署失败
     * @param Status 部署文件状态 1-初始化待部署 2-部署中 3-部署成功 4-部署失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 文件创建时间 
     * @return CreateTime 文件创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 文件创建时间
     * @param CreateTime 文件创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文件部署开始时间 
     * @return StartTime 文件部署开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 文件部署开始时间
     * @param StartTime 文件部署开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 文件部署结束时间 
     * @return EndTime 文件部署结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 文件部署结束时间
     * @param EndTime 文件部署结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 报错信息返回 
     * @return Message 报错信息返回
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 报错信息返回
     * @param Message 报错信息返回
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 商业智能实例ID 
     * @return InstanceId 商业智能实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 商业智能实例ID
     * @param InstanceId 商业智能实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 动作相关信息 
     * @return Action 动作相关信息
     */
    public FileAction getAction() {
        return this.Action;
    }

    /**
     * Set 动作相关信息
     * @param Action 动作相关信息
     */
    public void setAction(FileAction Action) {
        this.Action = Action;
    }

    public BusinessIntelligenceFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessIntelligenceFile(BusinessIntelligenceFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileURL != null) {
            this.FileURL = new String(source.FileURL);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Action != null) {
            this.Action = new FileAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileURL", this.FileURL);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

