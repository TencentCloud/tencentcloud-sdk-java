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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel{

    /**
    * 镜像名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 镜像仓库
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

    /**
    * tag 列表
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 镜像名称 
     * @return Name 镜像名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 镜像名称
     * @param Name 镜像名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 镜像仓库 
     * @return Repository 镜像仓库
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set 镜像仓库
     * @param Repository 镜像仓库
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    /**
     * Get tag 列表 
     * @return Tags tag 列表
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set tag 列表
     * @param Tags tag 列表
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public Image() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Image(Image source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Repository != null) {
            this.Repository = new String(source.Repository);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Repository", this.Repository);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

