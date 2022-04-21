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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteImagesRequest extends AbstractModel{

    /**
    * 准备删除的镜像Id列表
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 是否删除镜像关联的快照
    */
    @SerializedName("DeleteBindedSnap")
    @Expose
    private Boolean DeleteBindedSnap;

    /**
    * 检测是否支持删除镜像
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 准备删除的镜像Id列表 
     * @return ImageIds 准备删除的镜像Id列表
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 准备删除的镜像Id列表
     * @param ImageIds 准备删除的镜像Id列表
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 是否删除镜像关联的快照 
     * @return DeleteBindedSnap 是否删除镜像关联的快照
     */
    public Boolean getDeleteBindedSnap() {
        return this.DeleteBindedSnap;
    }

    /**
     * Set 是否删除镜像关联的快照
     * @param DeleteBindedSnap 是否删除镜像关联的快照
     */
    public void setDeleteBindedSnap(Boolean DeleteBindedSnap) {
        this.DeleteBindedSnap = DeleteBindedSnap;
    }

    /**
     * Get 检测是否支持删除镜像 
     * @return DryRun 检测是否支持删除镜像
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 检测是否支持删除镜像
     * @param DryRun 检测是否支持删除镜像
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteImagesRequest(DeleteImagesRequest source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.DeleteBindedSnap != null) {
            this.DeleteBindedSnap = new Boolean(source.DeleteBindedSnap);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "DeleteBindedSnap", this.DeleteBindedSnap);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

