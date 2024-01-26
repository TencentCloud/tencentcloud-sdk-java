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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportFilesRequest extends AbstractModel {

    /**
    * 导入相关信息
    */
    @SerializedName("ImportRequestInfo")
    @Expose
    private ImportRequestInfo ImportRequestInfo;

    /**
     * Get 导入相关信息 
     * @return ImportRequestInfo 导入相关信息
     */
    public ImportRequestInfo getImportRequestInfo() {
        return this.ImportRequestInfo;
    }

    /**
     * Set 导入相关信息
     * @param ImportRequestInfo 导入相关信息
     */
    public void setImportRequestInfo(ImportRequestInfo ImportRequestInfo) {
        this.ImportRequestInfo = ImportRequestInfo;
    }

    public ImportFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportFilesRequest(ImportFilesRequest source) {
        if (source.ImportRequestInfo != null) {
            this.ImportRequestInfo = new ImportRequestInfo(source.ImportRequestInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImportRequestInfo.", this.ImportRequestInfo);

    }
}

