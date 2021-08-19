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

public class DeleteImageTagsRequest extends AbstractModel{

    /**
    * 镜像版本数组
    */
    @SerializedName("ImageTags")
    @Expose
    private DeleteImageTag [] ImageTags;

    /**
    * 企业: tcr ；个人: personal或者不填
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
     * Get 镜像版本数组 
     * @return ImageTags 镜像版本数组
     */
    public DeleteImageTag [] getImageTags() {
        return this.ImageTags;
    }

    /**
     * Set 镜像版本数组
     * @param ImageTags 镜像版本数组
     */
    public void setImageTags(DeleteImageTag [] ImageTags) {
        this.ImageTags = ImageTags;
    }

    /**
     * Get 企业: tcr ；个人: personal或者不填 
     * @return RepoType 企业: tcr ；个人: personal或者不填
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 企业: tcr ；个人: personal或者不填
     * @param RepoType 企业: tcr ；个人: personal或者不填
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    public DeleteImageTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteImageTagsRequest(DeleteImageTagsRequest source) {
        if (source.ImageTags != null) {
            this.ImageTags = new DeleteImageTag[source.ImageTags.length];
            for (int i = 0; i < source.ImageTags.length; i++) {
                this.ImageTags[i] = new DeleteImageTag(source.ImageTags[i]);
            }
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageTags.", this.ImageTags);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);

    }
}

