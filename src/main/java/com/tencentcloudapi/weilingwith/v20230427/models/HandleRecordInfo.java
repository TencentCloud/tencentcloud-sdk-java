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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleRecordInfo extends AbstractModel {

    /**
    * 告警处理记录id

    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 操作类型
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 处理时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文件列表

    */
    @SerializedName("FileSet")
    @Expose
    private FileInfo [] FileSet;

    /**
    * 应用appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 扩展字段1，存非孪生中台用户id

    */
    @SerializedName("ExtendOne")
    @Expose
    private String ExtendOne;

    /**
     * Get 告警处理记录id
 
     * @return Id 告警处理记录id

     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 告警处理记录id

     * @param Id 告警处理记录id

     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 操作类型 
     * @return OperationType 操作类型
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型
     * @param OperationType 操作类型
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 处理时间 
     * @return Time 处理时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 处理时间
     * @param Time 处理时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 文件列表
 
     * @return FileSet 文件列表

     */
    public FileInfo [] getFileSet() {
        return this.FileSet;
    }

    /**
     * Set 文件列表

     * @param FileSet 文件列表

     */
    public void setFileSet(FileInfo [] FileSet) {
        this.FileSet = FileSet;
    }

    /**
     * Get 应用appid 
     * @return AppId 应用appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用appid
     * @param AppId 应用appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 扩展字段1，存非孪生中台用户id
 
     * @return ExtendOne 扩展字段1，存非孪生中台用户id

     */
    public String getExtendOne() {
        return this.ExtendOne;
    }

    /**
     * Set 扩展字段1，存非孪生中台用户id

     * @param ExtendOne 扩展字段1，存非孪生中台用户id

     */
    public void setExtendOne(String ExtendOne) {
        this.ExtendOne = ExtendOne;
    }

    public HandleRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleRecordInfo(HandleRecordInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileSet != null) {
            this.FileSet = new FileInfo[source.FileSet.length];
            for (int i = 0; i < source.FileSet.length; i++) {
                this.FileSet[i] = new FileInfo(source.FileSet[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ExtendOne != null) {
            this.ExtendOne = new String(source.ExtendOne);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "FileSet.", this.FileSet);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ExtendOne", this.ExtendOne);

    }
}

