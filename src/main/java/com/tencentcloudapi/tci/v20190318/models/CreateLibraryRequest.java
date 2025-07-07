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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLibraryRequest extends AbstractModel {

    /**
    * 人员库名称
    */
    @SerializedName("LibraryName")
    @Expose
    private String LibraryName;

    /**
    * 人员库唯一标志符，为空则系统自动生成。
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
     * Get 人员库名称 
     * @return LibraryName 人员库名称
     */
    public String getLibraryName() {
        return this.LibraryName;
    }

    /**
     * Set 人员库名称
     * @param LibraryName 人员库名称
     */
    public void setLibraryName(String LibraryName) {
        this.LibraryName = LibraryName;
    }

    /**
     * Get 人员库唯一标志符，为空则系统自动生成。 
     * @return LibraryId 人员库唯一标志符，为空则系统自动生成。
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 人员库唯一标志符，为空则系统自动生成。
     * @param LibraryId 人员库唯一标志符，为空则系统自动生成。
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    public CreateLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLibraryRequest(CreateLibraryRequest source) {
        if (source.LibraryName != null) {
            this.LibraryName = new String(source.LibraryName);
        }
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryName", this.LibraryName);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);

    }
}

