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

public class DeleteDatasetRequest extends AbstractModel {

    /**
    * <p>数据集id</p>
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * <p>是否删除cos标签文件</p>
    */
    @SerializedName("DeleteLabelEnable")
    @Expose
    private Boolean DeleteLabelEnable;

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
     * Get <p>数据集id</p> 
     * @return DatasetId <p>数据集id</p>
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set <p>数据集id</p>
     * @param DatasetId <p>数据集id</p>
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get <p>是否删除cos标签文件</p> 
     * @return DeleteLabelEnable <p>是否删除cos标签文件</p>
     */
    public Boolean getDeleteLabelEnable() {
        return this.DeleteLabelEnable;
    }

    /**
     * Set <p>是否删除cos标签文件</p>
     * @param DeleteLabelEnable <p>是否删除cos标签文件</p>
     */
    public void setDeleteLabelEnable(Boolean DeleteLabelEnable) {
        this.DeleteLabelEnable = DeleteLabelEnable;
    }

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    public DeleteDatasetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDatasetRequest(DeleteDatasetRequest source) {
        if (source.DatasetId != null) {
            this.DatasetId = new String(source.DatasetId);
        }
        if (source.DeleteLabelEnable != null) {
            this.DeleteLabelEnable = new Boolean(source.DeleteLabelEnable);
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "DeleteLabelEnable", this.DeleteLabelEnable);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);

    }
}

