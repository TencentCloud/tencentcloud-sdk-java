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

public class PkgList extends AbstractModel {

    /**
    * 程序包总量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 程序包信息列表
    */
    @SerializedName("Content")
    @Expose
    private PkgInfo [] Content;

    /**
    * 程序包仓库id
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

    /**
    * 程序包仓库类型
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * 程序包仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
     * Get 程序包总量 
     * @return TotalCount 程序包总量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 程序包总量
     * @param TotalCount 程序包总量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 程序包信息列表 
     * @return Content 程序包信息列表
     */
    public PkgInfo [] getContent() {
        return this.Content;
    }

    /**
     * Set 程序包信息列表
     * @param Content 程序包信息列表
     */
    public void setContent(PkgInfo [] Content) {
        this.Content = Content;
    }

    /**
     * Get 程序包仓库id 
     * @return RepositoryId 程序包仓库id
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set 程序包仓库id
     * @param RepositoryId 程序包仓库id
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
    }

    /**
     * Get 程序包仓库类型 
     * @return RepositoryType 程序包仓库类型
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set 程序包仓库类型
     * @param RepositoryType 程序包仓库类型
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get 程序包仓库名称 
     * @return RepositoryName 程序包仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 程序包仓库名称
     * @param RepositoryName 程序包仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    public PkgList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PkgList(PkgList source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new PkgInfo[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new PkgInfo(source.Content[i]);
            }
        }
        if (source.RepositoryId != null) {
            this.RepositoryId = new String(source.RepositoryId);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RepositoryId", this.RepositoryId);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);

    }
}

