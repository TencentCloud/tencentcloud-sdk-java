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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DuplicateImageRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 源命名空间名称
    */
    @SerializedName("SourceNamespace")
    @Expose
    private String SourceNamespace;

    /**
    * 源镜像仓库名称
    */
    @SerializedName("SourceRepo")
    @Expose
    private String SourceRepo;

    /**
    * 源镜像tag或digest值，目前仅支持tag
    */
    @SerializedName("SourceReference")
    @Expose
    private String SourceReference;

    /**
    * 目标镜像版本
    */
    @SerializedName("DestinationTag")
    @Expose
    private String DestinationTag;

    /**
    * 目标命名空间，不填默认与源一致
    */
    @SerializedName("DestinationNamespace")
    @Expose
    private String DestinationNamespace;

    /**
    * 目标镜像仓库，不填默认与源一致
    */
    @SerializedName("DestinationRepo")
    @Expose
    private String DestinationRepo;

    /**
    * 是否覆盖
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
     * Get 实例id 
     * @return RegistryId 实例id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例id
     * @param RegistryId 实例id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 源命名空间名称 
     * @return SourceNamespace 源命名空间名称
     */
    public String getSourceNamespace() {
        return this.SourceNamespace;
    }

    /**
     * Set 源命名空间名称
     * @param SourceNamespace 源命名空间名称
     */
    public void setSourceNamespace(String SourceNamespace) {
        this.SourceNamespace = SourceNamespace;
    }

    /**
     * Get 源镜像仓库名称 
     * @return SourceRepo 源镜像仓库名称
     */
    public String getSourceRepo() {
        return this.SourceRepo;
    }

    /**
     * Set 源镜像仓库名称
     * @param SourceRepo 源镜像仓库名称
     */
    public void setSourceRepo(String SourceRepo) {
        this.SourceRepo = SourceRepo;
    }

    /**
     * Get 源镜像tag或digest值，目前仅支持tag 
     * @return SourceReference 源镜像tag或digest值，目前仅支持tag
     */
    public String getSourceReference() {
        return this.SourceReference;
    }

    /**
     * Set 源镜像tag或digest值，目前仅支持tag
     * @param SourceReference 源镜像tag或digest值，目前仅支持tag
     */
    public void setSourceReference(String SourceReference) {
        this.SourceReference = SourceReference;
    }

    /**
     * Get 目标镜像版本 
     * @return DestinationTag 目标镜像版本
     */
    public String getDestinationTag() {
        return this.DestinationTag;
    }

    /**
     * Set 目标镜像版本
     * @param DestinationTag 目标镜像版本
     */
    public void setDestinationTag(String DestinationTag) {
        this.DestinationTag = DestinationTag;
    }

    /**
     * Get 目标命名空间，不填默认与源一致 
     * @return DestinationNamespace 目标命名空间，不填默认与源一致
     */
    public String getDestinationNamespace() {
        return this.DestinationNamespace;
    }

    /**
     * Set 目标命名空间，不填默认与源一致
     * @param DestinationNamespace 目标命名空间，不填默认与源一致
     */
    public void setDestinationNamespace(String DestinationNamespace) {
        this.DestinationNamespace = DestinationNamespace;
    }

    /**
     * Get 目标镜像仓库，不填默认与源一致 
     * @return DestinationRepo 目标镜像仓库，不填默认与源一致
     */
    public String getDestinationRepo() {
        return this.DestinationRepo;
    }

    /**
     * Set 目标镜像仓库，不填默认与源一致
     * @param DestinationRepo 目标镜像仓库，不填默认与源一致
     */
    public void setDestinationRepo(String DestinationRepo) {
        this.DestinationRepo = DestinationRepo;
    }

    /**
     * Get 是否覆盖 
     * @return Override 是否覆盖
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set 是否覆盖
     * @param Override 是否覆盖
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    public DuplicateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplicateImageRequest(DuplicateImageRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.SourceNamespace != null) {
            this.SourceNamespace = new String(source.SourceNamespace);
        }
        if (source.SourceRepo != null) {
            this.SourceRepo = new String(source.SourceRepo);
        }
        if (source.SourceReference != null) {
            this.SourceReference = new String(source.SourceReference);
        }
        if (source.DestinationTag != null) {
            this.DestinationTag = new String(source.DestinationTag);
        }
        if (source.DestinationNamespace != null) {
            this.DestinationNamespace = new String(source.DestinationNamespace);
        }
        if (source.DestinationRepo != null) {
            this.DestinationRepo = new String(source.DestinationRepo);
        }
        if (source.Override != null) {
            this.Override = new Boolean(source.Override);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "SourceNamespace", this.SourceNamespace);
        this.setParamSimple(map, prefix + "SourceRepo", this.SourceRepo);
        this.setParamSimple(map, prefix + "SourceReference", this.SourceReference);
        this.setParamSimple(map, prefix + "DestinationTag", this.DestinationTag);
        this.setParamSimple(map, prefix + "DestinationNamespace", this.DestinationNamespace);
        this.setParamSimple(map, prefix + "DestinationRepo", this.DestinationRepo);
        this.setParamSimple(map, prefix + "Override", this.Override);

    }
}

