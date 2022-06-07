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

public class DeleteDatasetRequest extends AbstractModel{

    /**
    * 数据集id
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * 是否删除cos标签文件
    */
    @SerializedName("DeleteLabelEnable")
    @Expose
    private Boolean DeleteLabelEnable;

    /**
     * Get 数据集id 
     * @return DatasetId 数据集id
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set 数据集id
     * @param DatasetId 数据集id
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get 是否删除cos标签文件 
     * @return DeleteLabelEnable 是否删除cos标签文件
     */
    public Boolean getDeleteLabelEnable() {
        return this.DeleteLabelEnable;
    }

    /**
     * Set 是否删除cos标签文件
     * @param DeleteLabelEnable 是否删除cos标签文件
     */
    public void setDeleteLabelEnable(Boolean DeleteLabelEnable) {
        this.DeleteLabelEnable = DeleteLabelEnable;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "DeleteLabelEnable", this.DeleteLabelEnable);

    }
}

