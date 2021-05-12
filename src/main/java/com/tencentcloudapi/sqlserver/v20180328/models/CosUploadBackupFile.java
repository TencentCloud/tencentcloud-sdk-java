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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosUploadBackupFile extends AbstractModel{

    /**
    * 备份名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 备份大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 备份名称 
     * @return FileName 备份名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 备份名称
     * @param FileName 备份名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 备份大小 
     * @return Size 备份大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 备份大小
     * @param Size 备份大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public CosUploadBackupFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosUploadBackupFile(CosUploadBackupFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

