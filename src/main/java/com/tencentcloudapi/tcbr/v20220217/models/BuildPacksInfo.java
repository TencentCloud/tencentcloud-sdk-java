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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildPacksInfo extends AbstractModel{

    /**
    * 基础镜像
    */
    @SerializedName("BaseImage")
    @Expose
    private String BaseImage;

    /**
    * 启动命令
    */
    @SerializedName("EntryPoint")
    @Expose
    private String EntryPoint;

    /**
    * 语言
    */
    @SerializedName("RepoLanguage")
    @Expose
    private String RepoLanguage;

    /**
    * 上传文件名
    */
    @SerializedName("UploadFilename")
    @Expose
    private String UploadFilename;

    /**
     * Get 基础镜像 
     * @return BaseImage 基础镜像
     */
    public String getBaseImage() {
        return this.BaseImage;
    }

    /**
     * Set 基础镜像
     * @param BaseImage 基础镜像
     */
    public void setBaseImage(String BaseImage) {
        this.BaseImage = BaseImage;
    }

    /**
     * Get 启动命令 
     * @return EntryPoint 启动命令
     */
    public String getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set 启动命令
     * @param EntryPoint 启动命令
     */
    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get 语言 
     * @return RepoLanguage 语言
     */
    public String getRepoLanguage() {
        return this.RepoLanguage;
    }

    /**
     * Set 语言
     * @param RepoLanguage 语言
     */
    public void setRepoLanguage(String RepoLanguage) {
        this.RepoLanguage = RepoLanguage;
    }

    /**
     * Get 上传文件名 
     * @return UploadFilename 上传文件名
     */
    public String getUploadFilename() {
        return this.UploadFilename;
    }

    /**
     * Set 上传文件名
     * @param UploadFilename 上传文件名
     */
    public void setUploadFilename(String UploadFilename) {
        this.UploadFilename = UploadFilename;
    }

    public BuildPacksInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildPacksInfo(BuildPacksInfo source) {
        if (source.BaseImage != null) {
            this.BaseImage = new String(source.BaseImage);
        }
        if (source.EntryPoint != null) {
            this.EntryPoint = new String(source.EntryPoint);
        }
        if (source.RepoLanguage != null) {
            this.RepoLanguage = new String(source.RepoLanguage);
        }
        if (source.UploadFilename != null) {
            this.UploadFilename = new String(source.UploadFilename);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaseImage", this.BaseImage);
        this.setParamSimple(map, prefix + "EntryPoint", this.EntryPoint);
        this.setParamSimple(map, prefix + "RepoLanguage", this.RepoLanguage);
        this.setParamSimple(map, prefix + "UploadFilename", this.UploadFilename);

    }
}

