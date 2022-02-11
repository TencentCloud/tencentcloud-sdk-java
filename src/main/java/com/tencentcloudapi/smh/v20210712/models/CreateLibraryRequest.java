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

public class CreateLibraryRequest extends AbstractModel{

    /**
    * 媒体库名称，最多 50 个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 存储桶全名，新建后不可更改
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 存储桶所在地域，新建后不可更改
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 媒体库配置项，部分参数新建后不可更改
    */
    @SerializedName("LibraryExtension")
    @Expose
    private LibraryExtension LibraryExtension;

    /**
    * 备注，最多 250 个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 媒体库名称，最多 50 个字符 
     * @return Name 媒体库名称，最多 50 个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体库名称，最多 50 个字符
     * @param Name 媒体库名称，最多 50 个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 存储桶全名，新建后不可更改 
     * @return BucketName 存储桶全名，新建后不可更改
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 存储桶全名，新建后不可更改
     * @param BucketName 存储桶全名，新建后不可更改
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 存储桶所在地域，新建后不可更改 
     * @return BucketRegion 存储桶所在地域，新建后不可更改
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 存储桶所在地域，新建后不可更改
     * @param BucketRegion 存储桶所在地域，新建后不可更改
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 媒体库配置项，部分参数新建后不可更改 
     * @return LibraryExtension 媒体库配置项，部分参数新建后不可更改
     */
    public LibraryExtension getLibraryExtension() {
        return this.LibraryExtension;
    }

    /**
     * Set 媒体库配置项，部分参数新建后不可更改
     * @param LibraryExtension 媒体库配置项，部分参数新建后不可更改
     */
    public void setLibraryExtension(LibraryExtension LibraryExtension) {
        this.LibraryExtension = LibraryExtension;
    }

    /**
     * Get 备注，最多 250 个字符 
     * @return Remark 备注，最多 250 个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，最多 250 个字符
     * @param Remark 备注，最多 250 个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLibraryRequest(CreateLibraryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.LibraryExtension != null) {
            this.LibraryExtension = new LibraryExtension(source.LibraryExtension);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamObj(map, prefix + "LibraryExtension.", this.LibraryExtension);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

