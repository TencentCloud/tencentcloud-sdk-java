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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Library extends AbstractModel{

    /**
    * 媒体库 ID
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 媒体库友好名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 媒体库绑定的 COS 存储桶
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 媒体库绑定的 COS 存储桶所在的地域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 媒体库创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 媒体库配置项
    */
    @SerializedName("LibraryExtension")
    @Expose
    private LibraryExtension LibraryExtension;

    /**
    * 媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 媒体库目录数，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("DirNum")
    @Expose
    private String DirNum;

    /**
    * 媒体库文件数，由于数字类型精度限制，该字段为 String 类型。
    */
    @SerializedName("FileNum")
    @Expose
    private String FileNum;

    /**
     * Get 媒体库 ID 
     * @return LibraryId 媒体库 ID
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 媒体库 ID
     * @param LibraryId 媒体库 ID
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 媒体库友好名称 
     * @return Name 媒体库友好名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体库友好名称
     * @param Name 媒体库友好名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 媒体库绑定的 COS 存储桶 
     * @return BucketName 媒体库绑定的 COS 存储桶
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 媒体库绑定的 COS 存储桶
     * @param BucketName 媒体库绑定的 COS 存储桶
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 媒体库绑定的 COS 存储桶所在的地域 
     * @return BucketRegion 媒体库绑定的 COS 存储桶所在的地域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 媒体库绑定的 COS 存储桶所在的地域
     * @param BucketRegion 媒体库绑定的 COS 存储桶所在的地域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 媒体库创建时间 
     * @return CreationTime 媒体库创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 媒体库创建时间
     * @param CreationTime 媒体库创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 媒体库配置项 
     * @return LibraryExtension 媒体库配置项
     */
    public LibraryExtension getLibraryExtension() {
        return this.LibraryExtension;
    }

    /**
     * Set 媒体库配置项
     * @param LibraryExtension 媒体库配置项
     */
    public void setLibraryExtension(LibraryExtension LibraryExtension) {
        this.LibraryExtension = LibraryExtension;
    }

    /**
     * Get 媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。 
     * @return Size 媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     * @param Size 媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 媒体库目录数，由于数字类型精度限制，该字段为 String 类型。 
     * @return DirNum 媒体库目录数，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getDirNum() {
        return this.DirNum;
    }

    /**
     * Set 媒体库目录数，由于数字类型精度限制，该字段为 String 类型。
     * @param DirNum 媒体库目录数，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setDirNum(String DirNum) {
        this.DirNum = DirNum;
    }

    /**
     * Get 媒体库文件数，由于数字类型精度限制，该字段为 String 类型。 
     * @return FileNum 媒体库文件数，由于数字类型精度限制，该字段为 String 类型。
     */
    public String getFileNum() {
        return this.FileNum;
    }

    /**
     * Set 媒体库文件数，由于数字类型精度限制，该字段为 String 类型。
     * @param FileNum 媒体库文件数，由于数字类型精度限制，该字段为 String 类型。
     */
    public void setFileNum(String FileNum) {
        this.FileNum = FileNum;
    }

    public Library() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Library(Library source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.LibraryExtension != null) {
            this.LibraryExtension = new LibraryExtension(source.LibraryExtension);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.DirNum != null) {
            this.DirNum = new String(source.DirNum);
        }
        if (source.FileNum != null) {
            this.FileNum = new String(source.FileNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamObj(map, prefix + "LibraryExtension.", this.LibraryExtension);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DirNum", this.DirNum);
        this.setParamSimple(map, prefix + "FileNum", this.FileNum);

    }
}

