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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepositoryInfo extends AbstractModel {

    /**
    * 仓库ID
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

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
    * 仓库描述
    */
    @SerializedName("RepositoryDesc")
    @Expose
    private String RepositoryDesc;

    /**
    * 仓库是否正在被使用
    */
    @SerializedName("IsUsed")
    @Expose
    private Boolean IsUsed;

    /**
    * 仓库创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 仓库桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 仓库桶所在地域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 仓库目录
    */
    @SerializedName("Directory")
    @Expose
    private String Directory;

    /**
     * Get 仓库ID 
     * @return RepositoryId 仓库ID
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set 仓库ID
     * @param RepositoryId 仓库ID
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
    }

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
     * Get 仓库是否正在被使用 
     * @return IsUsed 仓库是否正在被使用
     */
    public Boolean getIsUsed() {
        return this.IsUsed;
    }

    /**
     * Set 仓库是否正在被使用
     * @param IsUsed 仓库是否正在被使用
     */
    public void setIsUsed(Boolean IsUsed) {
        this.IsUsed = IsUsed;
    }

    /**
     * Get 仓库创建时间 
     * @return CreateTime 仓库创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 仓库创建时间
     * @param CreateTime 仓库创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 仓库桶名称 
     * @return BucketName 仓库桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 仓库桶名称
     * @param BucketName 仓库桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 仓库桶所在地域 
     * @return BucketRegion 仓库桶所在地域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 仓库桶所在地域
     * @param BucketRegion 仓库桶所在地域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 仓库目录 
     * @return Directory 仓库目录
     */
    public String getDirectory() {
        return this.Directory;
    }

    /**
     * Set 仓库目录
     * @param Directory 仓库目录
     */
    public void setDirectory(String Directory) {
        this.Directory = Directory;
    }

    public RepositoryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepositoryInfo(RepositoryInfo source) {
        if (source.RepositoryId != null) {
            this.RepositoryId = new String(source.RepositoryId);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.RepositoryDesc != null) {
            this.RepositoryDesc = new String(source.RepositoryDesc);
        }
        if (source.IsUsed != null) {
            this.IsUsed = new Boolean(source.IsUsed);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.Directory != null) {
            this.Directory = new String(source.Directory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryId", this.RepositoryId);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "RepositoryDesc", this.RepositoryDesc);
        this.setParamSimple(map, prefix + "IsUsed", this.IsUsed);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Directory", this.Directory);

    }
}

