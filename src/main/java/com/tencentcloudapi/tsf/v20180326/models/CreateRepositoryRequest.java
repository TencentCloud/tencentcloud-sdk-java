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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRepositoryRequest extends AbstractModel{

    /**
    * 仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 仓库类型（默认仓库：default，私有仓库：private）
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * 仓库所在桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 仓库所在桶地域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 目录
    */
    @SerializedName("Directory")
    @Expose
    private String Directory;

    /**
    * 仓库描述
    */
    @SerializedName("RepositoryDesc")
    @Expose
    private String RepositoryDesc;

    /**
     * Get 仓库名称 
     * @return RepositoryName 仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 仓库名称
     * @param RepositoryName 仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 仓库类型（默认仓库：default，私有仓库：private） 
     * @return RepositoryType 仓库类型（默认仓库：default，私有仓库：private）
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set 仓库类型（默认仓库：default，私有仓库：private）
     * @param RepositoryType 仓库类型（默认仓库：default，私有仓库：private）
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get 仓库所在桶名称 
     * @return BucketName 仓库所在桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 仓库所在桶名称
     * @param BucketName 仓库所在桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 仓库所在桶地域 
     * @return BucketRegion 仓库所在桶地域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 仓库所在桶地域
     * @param BucketRegion 仓库所在桶地域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 目录 
     * @return Directory 目录
     */
    public String getDirectory() {
        return this.Directory;
    }

    /**
     * Set 目录
     * @param Directory 目录
     */
    public void setDirectory(String Directory) {
        this.Directory = Directory;
    }

    /**
     * Get 仓库描述 
     * @return RepositoryDesc 仓库描述
     */
    public String getRepositoryDesc() {
        return this.RepositoryDesc;
    }

    /**
     * Set 仓库描述
     * @param RepositoryDesc 仓库描述
     */
    public void setRepositoryDesc(String RepositoryDesc) {
        this.RepositoryDesc = RepositoryDesc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Directory", this.Directory);
        this.setParamSimple(map, prefix + "RepositoryDesc", this.RepositoryDesc);

    }
}

