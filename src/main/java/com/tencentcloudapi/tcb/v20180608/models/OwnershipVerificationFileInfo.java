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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnershipVerificationFileInfo extends AbstractModel {

    /**
    * <p>归属权校验文件路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>归属权校验文件内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>归属权校验文件路径</p> 
     * @return Path <p>归属权校验文件路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>归属权校验文件路径</p>
     * @param Path <p>归属权校验文件路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>归属权校验文件内容</p> 
     * @return Content <p>归属权校验文件内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>归属权校验文件内容</p>
     * @param Content <p>归属权校验文件内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public OwnershipVerificationFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnershipVerificationFileInfo(OwnershipVerificationFileInfo source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

