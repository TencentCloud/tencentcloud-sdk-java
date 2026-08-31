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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Library extends AbstractModel {

    /**
    * <p>媒体库 ID</p>
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * <p>媒体库友好名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>媒体库绑定的 COS 存储桶</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>媒体库绑定的 COS 存储桶所在的地域</p>
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * <p>该媒体库的业务 API 访问域名</p>
    */
    @SerializedName("AccessDomain")
    @Expose
    private String AccessDomain;

    /**
    * <p>媒体库创建时间</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>媒体库配置项</p>
    */
    @SerializedName("LibraryExtension")
    @Expose
    private LibraryExtension LibraryExtension;

    /**
    * <p>媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。</p>
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * <p>媒体库目录数，由于数字类型精度限制，该字段为 String 类型。</p>
    */
    @SerializedName("DirNum")
    @Expose
    private String DirNum;

    /**
    * <p>媒体库文件数，由于数字类型精度限制，该字段为 String 类型。</p>
    */
    @SerializedName("FileNum")
    @Expose
    private String FileNum;

    /**
    * <p>媒体库关联的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
     * Get <p>媒体库 ID</p> 
     * @return LibraryId <p>媒体库 ID</p>
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set <p>媒体库 ID</p>
     * @param LibraryId <p>媒体库 ID</p>
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get <p>媒体库友好名称</p> 
     * @return Name <p>媒体库友好名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>媒体库友好名称</p>
     * @param Name <p>媒体库友好名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>媒体库绑定的 COS 存储桶</p> 
     * @return BucketName <p>媒体库绑定的 COS 存储桶</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>媒体库绑定的 COS 存储桶</p>
     * @param BucketName <p>媒体库绑定的 COS 存储桶</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>媒体库绑定的 COS 存储桶所在的地域</p> 
     * @return BucketRegion <p>媒体库绑定的 COS 存储桶所在的地域</p>
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set <p>媒体库绑定的 COS 存储桶所在的地域</p>
     * @param BucketRegion <p>媒体库绑定的 COS 存储桶所在的地域</p>
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get <p>该媒体库的业务 API 访问域名</p> 
     * @return AccessDomain <p>该媒体库的业务 API 访问域名</p>
     */
    public String getAccessDomain() {
        return this.AccessDomain;
    }

    /**
     * Set <p>该媒体库的业务 API 访问域名</p>
     * @param AccessDomain <p>该媒体库的业务 API 访问域名</p>
     */
    public void setAccessDomain(String AccessDomain) {
        this.AccessDomain = AccessDomain;
    }

    /**
     * Get <p>媒体库创建时间</p> 
     * @return CreationTime <p>媒体库创建时间</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>媒体库创建时间</p>
     * @param CreationTime <p>媒体库创建时间</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>媒体库配置项</p> 
     * @return LibraryExtension <p>媒体库配置项</p>
     */
    public LibraryExtension getLibraryExtension() {
        return this.LibraryExtension;
    }

    /**
     * Set <p>媒体库配置项</p>
     * @param LibraryExtension <p>媒体库配置项</p>
     */
    public void setLibraryExtension(LibraryExtension LibraryExtension) {
        this.LibraryExtension = LibraryExtension;
    }

    /**
     * Get <p>媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。</p> 
     * @return Size <p>媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。</p>
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set <p>媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。</p>
     * @param Size <p>媒体库用量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。</p>
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get <p>媒体库目录数，由于数字类型精度限制，该字段为 String 类型。</p> 
     * @return DirNum <p>媒体库目录数，由于数字类型精度限制，该字段为 String 类型。</p>
     */
    public String getDirNum() {
        return this.DirNum;
    }

    /**
     * Set <p>媒体库目录数，由于数字类型精度限制，该字段为 String 类型。</p>
     * @param DirNum <p>媒体库目录数，由于数字类型精度限制，该字段为 String 类型。</p>
     */
    public void setDirNum(String DirNum) {
        this.DirNum = DirNum;
    }

    /**
     * Get <p>媒体库文件数，由于数字类型精度限制，该字段为 String 类型。</p> 
     * @return FileNum <p>媒体库文件数，由于数字类型精度限制，该字段为 String 类型。</p>
     */
    public String getFileNum() {
        return this.FileNum;
    }

    /**
     * Set <p>媒体库文件数，由于数字类型精度限制，该字段为 String 类型。</p>
     * @param FileNum <p>媒体库文件数，由于数字类型精度限制，该字段为 String 类型。</p>
     */
    public void setFileNum(String FileNum) {
        this.FileNum = FileNum;
    }

    /**
     * Get <p>媒体库关联的标签列表。</p> 
     * @return Tags <p>媒体库关联的标签列表。</p>
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>媒体库关联的标签列表。</p>
     * @param Tags <p>媒体库关联的标签列表。</p>
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
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
        if (source.AccessDomain != null) {
            this.AccessDomain = new String(source.AccessDomain);
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
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
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
        this.setParamSimple(map, prefix + "AccessDomain", this.AccessDomain);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamObj(map, prefix + "LibraryExtension.", this.LibraryExtension);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DirNum", this.DirNum);
        this.setParamSimple(map, prefix + "FileNum", this.FileNum);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

