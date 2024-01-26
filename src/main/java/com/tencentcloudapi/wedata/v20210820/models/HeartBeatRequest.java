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

public class HeartBeatRequest extends AbstractModel {

    /**
    * 资源唯一路径
    */
    @SerializedName("ResourcePath")
    @Expose
    private String ResourcePath;

    /**
    * 编辑标志
    */
    @SerializedName("EditFlag")
    @Expose
    private Boolean EditFlag;

    /**
     * Get 资源唯一路径 
     * @return ResourcePath 资源唯一路径
     */
    public String getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set 资源唯一路径
     * @param ResourcePath 资源唯一路径
     */
    public void setResourcePath(String ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    /**
     * Get 编辑标志 
     * @return EditFlag 编辑标志
     */
    public Boolean getEditFlag() {
        return this.EditFlag;
    }

    /**
     * Set 编辑标志
     * @param EditFlag 编辑标志
     */
    public void setEditFlag(Boolean EditFlag) {
        this.EditFlag = EditFlag;
    }

    public HeartBeatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeartBeatRequest(HeartBeatRequest source) {
        if (source.ResourcePath != null) {
            this.ResourcePath = new String(source.ResourcePath);
        }
        if (source.EditFlag != null) {
            this.EditFlag = new Boolean(source.EditFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourcePath", this.ResourcePath);
        this.setParamSimple(map, prefix + "EditFlag", this.EditFlag);

    }
}

