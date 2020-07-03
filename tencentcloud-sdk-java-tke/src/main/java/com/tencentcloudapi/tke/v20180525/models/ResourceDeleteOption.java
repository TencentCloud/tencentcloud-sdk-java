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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDeleteOption extends AbstractModel{

    /**
    * 资源类型，例如CBS
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 集群删除时资源的删除模式：terminate（销毁），retain （保留）
    */
    @SerializedName("DeleteMode")
    @Expose
    private String DeleteMode;

    /**
     * Get 资源类型，例如CBS 
     * @return ResourceType 资源类型，例如CBS
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，例如CBS
     * @param ResourceType 资源类型，例如CBS
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 集群删除时资源的删除模式：terminate（销毁），retain （保留） 
     * @return DeleteMode 集群删除时资源的删除模式：terminate（销毁），retain （保留）
     */
    public String getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set 集群删除时资源的删除模式：terminate（销毁），retain （保留）
     * @param DeleteMode 集群删除时资源的删除模式：terminate（销毁），retain （保留）
     */
    public void setDeleteMode(String DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

