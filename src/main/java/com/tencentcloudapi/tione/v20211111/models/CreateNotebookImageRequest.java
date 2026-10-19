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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNotebookImageRequest extends AbstractModel {

    /**
    * <p>镜像信息</p>
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>notebook id</p>
    */
    @SerializedName("NotebookId")
    @Expose
    private String NotebookId;

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>要保存的kernel数组</p>
    */
    @SerializedName("Kernels")
    @Expose
    private String [] Kernels;

    /**
    * <p>是否保存到镜像中心</p>
    */
    @SerializedName("RegisterToImageCenter")
    @Expose
    private Boolean RegisterToImageCenter;

    /**
     * Get <p>镜像信息</p> 
     * @return ImageInfo <p>镜像信息</p>
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set <p>镜像信息</p>
     * @param ImageInfo <p>镜像信息</p>
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get <p>notebook id</p> 
     * @return NotebookId <p>notebook id</p>
     */
    public String getNotebookId() {
        return this.NotebookId;
    }

    /**
     * Set <p>notebook id</p>
     * @param NotebookId <p>notebook id</p>
     */
    public void setNotebookId(String NotebookId) {
        this.NotebookId = NotebookId;
    }

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>要保存的kernel数组</p> 
     * @return Kernels <p>要保存的kernel数组</p>
     */
    public String [] getKernels() {
        return this.Kernels;
    }

    /**
     * Set <p>要保存的kernel数组</p>
     * @param Kernels <p>要保存的kernel数组</p>
     */
    public void setKernels(String [] Kernels) {
        this.Kernels = Kernels;
    }

    /**
     * Get <p>是否保存到镜像中心</p> 
     * @return RegisterToImageCenter <p>是否保存到镜像中心</p>
     */
    public Boolean getRegisterToImageCenter() {
        return this.RegisterToImageCenter;
    }

    /**
     * Set <p>是否保存到镜像中心</p>
     * @param RegisterToImageCenter <p>是否保存到镜像中心</p>
     */
    public void setRegisterToImageCenter(Boolean RegisterToImageCenter) {
        this.RegisterToImageCenter = RegisterToImageCenter;
    }

    public CreateNotebookImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNotebookImageRequest(CreateNotebookImageRequest source) {
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.NotebookId != null) {
            this.NotebookId = new String(source.NotebookId);
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Kernels != null) {
            this.Kernels = new String[source.Kernels.length];
            for (int i = 0; i < source.Kernels.length; i++) {
                this.Kernels[i] = new String(source.Kernels[i]);
            }
        }
        if (source.RegisterToImageCenter != null) {
            this.RegisterToImageCenter = new Boolean(source.RegisterToImageCenter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "NotebookId", this.NotebookId);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamArraySimple(map, prefix + "Kernels.", this.Kernels);
        this.setParamSimple(map, prefix + "RegisterToImageCenter", this.RegisterToImageCenter);

    }
}

