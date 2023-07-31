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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNotebookImageRequest extends AbstractModel{

    /**
    * 要保存的kernel数组
    */
    @SerializedName("Kernels")
    @Expose
    private String [] Kernels;

    /**
    * 镜像信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * notebook id
    */
    @SerializedName("NotebookId")
    @Expose
    private String NotebookId;

    /**
     * Get 要保存的kernel数组 
     * @return Kernels 要保存的kernel数组
     */
    public String [] getKernels() {
        return this.Kernels;
    }

    /**
     * Set 要保存的kernel数组
     * @param Kernels 要保存的kernel数组
     */
    public void setKernels(String [] Kernels) {
        this.Kernels = Kernels;
    }

    /**
     * Get 镜像信息 
     * @return ImageInfo 镜像信息
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 镜像信息
     * @param ImageInfo 镜像信息
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get notebook id 
     * @return NotebookId notebook id
     */
    public String getNotebookId() {
        return this.NotebookId;
    }

    /**
     * Set notebook id
     * @param NotebookId notebook id
     */
    public void setNotebookId(String NotebookId) {
        this.NotebookId = NotebookId;
    }

    public CreateNotebookImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNotebookImageRequest(CreateNotebookImageRequest source) {
        if (source.Kernels != null) {
            this.Kernels = new String[source.Kernels.length];
            for (int i = 0; i < source.Kernels.length; i++) {
                this.Kernels[i] = new String(source.Kernels[i]);
            }
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.NotebookId != null) {
            this.NotebookId = new String(source.NotebookId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Kernels.", this.Kernels);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "NotebookId", this.NotebookId);

    }
}

