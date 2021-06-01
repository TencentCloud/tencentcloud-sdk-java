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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteExportRequest extends AbstractModel{

    /**
    * 日志导出ID
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
     * Get 日志导出ID 
     * @return ExportId 日志导出ID
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set 日志导出ID
     * @param ExportId 日志导出ID
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    public DeleteExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteExportRequest(DeleteExportRequest source) {
        if (source.ExportId != null) {
            this.ExportId = new String(source.ExportId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportId", this.ExportId);

    }
}

