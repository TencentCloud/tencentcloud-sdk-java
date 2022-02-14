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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLogExportRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 日志导出ID
    */
    @SerializedName("ExportID")
    @Expose
    private String ExportID;

    /**
     * Get 项目ID 
     * @return ID 项目ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目ID
     * @param ID 项目ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 日志导出ID 
     * @return ExportID 日志导出ID
     */
    public String getExportID() {
        return this.ExportID;
    }

    /**
     * Set 日志导出ID
     * @param ExportID 日志导出ID
     */
    public void setExportID(String ExportID) {
        this.ExportID = ExportID;
    }

    public DeleteLogExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLogExportRequest(DeleteLogExportRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ExportID != null) {
            this.ExportID = new String(source.ExportID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ExportID", this.ExportID);

    }
}

