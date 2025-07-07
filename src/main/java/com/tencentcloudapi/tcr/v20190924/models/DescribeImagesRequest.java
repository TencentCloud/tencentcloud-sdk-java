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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 镜像仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 指定镜像版本进行查找，当前为模糊搜索
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 每页个数，用于分页，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页数，默认值为1
补充说明：limit指的是每页的大小，offset指的是具体第几页。
举例：limit 20 offset 1指的是1-20；limit 20 offset 2 指的是21-40；limit 30 offset 4 是指 90-120。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定镜像 Digest 进行查找
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * 指定是否为精准匹配，true为精准匹配，不填为模糊匹配
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
     * Get 实例ID 
     * @return RegistryId 实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例ID
     * @param RegistryId 实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 镜像仓库名称 
     * @return RepositoryName 镜像仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 镜像仓库名称
     * @param RepositoryName 镜像仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 指定镜像版本进行查找，当前为模糊搜索 
     * @return ImageVersion 指定镜像版本进行查找，当前为模糊搜索
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 指定镜像版本进行查找，当前为模糊搜索
     * @param ImageVersion 指定镜像版本进行查找，当前为模糊搜索
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 每页个数，用于分页，默认20 
     * @return Limit 每页个数，用于分页，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页个数，用于分页，默认20
     * @param Limit 每页个数，用于分页，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页数，默认值为1
补充说明：limit指的是每页的大小，offset指的是具体第几页。
举例：limit 20 offset 1指的是1-20；limit 20 offset 2 指的是21-40；limit 30 offset 4 是指 90-120。 
     * @return Offset 页数，默认值为1
补充说明：limit指的是每页的大小，offset指的是具体第几页。
举例：limit 20 offset 1指的是1-20；limit 20 offset 2 指的是21-40；limit 30 offset 4 是指 90-120。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页数，默认值为1
补充说明：limit指的是每页的大小，offset指的是具体第几页。
举例：limit 20 offset 1指的是1-20；limit 20 offset 2 指的是21-40；limit 30 offset 4 是指 90-120。
     * @param Offset 页数，默认值为1
补充说明：limit指的是每页的大小，offset指的是具体第几页。
举例：limit 20 offset 1指的是1-20；limit 20 offset 2 指的是21-40；limit 30 offset 4 是指 90-120。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定镜像 Digest 进行查找 
     * @return Digest 指定镜像 Digest 进行查找
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 指定镜像 Digest 进行查找
     * @param Digest 指定镜像 Digest 进行查找
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get 指定是否为精准匹配，true为精准匹配，不填为模糊匹配 
     * @return ExactMatch 指定是否为精准匹配，true为精准匹配，不填为模糊匹配
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set 指定是否为精准匹配，true为精准匹配，不填为模糊匹配
     * @param ExactMatch 指定是否为精准匹配，true为精准匹配，不填为模糊匹配
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public DescribeImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesRequest(DescribeImagesRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);

    }
}

