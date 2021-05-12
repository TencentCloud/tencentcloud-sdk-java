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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExtensionUploadInfoRequest extends AbstractModel{

    /**
    * 待上传的文件
    */
    @SerializedName("ExtensionFiles")
    @Expose
    private ExtensionFile [] ExtensionFiles;

    /**
     * Get 待上传的文件 
     * @return ExtensionFiles 待上传的文件
     */
    public ExtensionFile [] getExtensionFiles() {
        return this.ExtensionFiles;
    }

    /**
     * Set 待上传的文件
     * @param ExtensionFiles 待上传的文件
     */
    public void setExtensionFiles(ExtensionFile [] ExtensionFiles) {
        this.ExtensionFiles = ExtensionFiles;
    }

    public DescribeExtensionUploadInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtensionUploadInfoRequest(DescribeExtensionUploadInfoRequest source) {
        if (source.ExtensionFiles != null) {
            this.ExtensionFiles = new ExtensionFile[source.ExtensionFiles.length];
            for (int i = 0; i < source.ExtensionFiles.length; i++) {
                this.ExtensionFiles[i] = new ExtensionFile(source.ExtensionFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ExtensionFiles.", this.ExtensionFiles);

    }
}

