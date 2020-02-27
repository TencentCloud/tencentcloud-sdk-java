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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceInfoResp extends AbstractModel{

    /**
    * 命名空间数量
    */
    @SerializedName("NamespaceCount")
    @Expose
    private Long NamespaceCount;

    /**
    * 命名空间信息
    */
    @SerializedName("NamespaceInfo")
    @Expose
    private NamespaceInfo [] NamespaceInfo;

    /**
     * Get 命名空间数量 
     * @return NamespaceCount 命名空间数量
     */
    public Long getNamespaceCount() {
        return this.NamespaceCount;
    }

    /**
     * Set 命名空间数量
     * @param NamespaceCount 命名空间数量
     */
    public void setNamespaceCount(Long NamespaceCount) {
        this.NamespaceCount = NamespaceCount;
    }

    /**
     * Get 命名空间信息 
     * @return NamespaceInfo 命名空间信息
     */
    public NamespaceInfo [] getNamespaceInfo() {
        return this.NamespaceInfo;
    }

    /**
     * Set 命名空间信息
     * @param NamespaceInfo 命名空间信息
     */
    public void setNamespaceInfo(NamespaceInfo [] NamespaceInfo) {
        this.NamespaceInfo = NamespaceInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceCount", this.NamespaceCount);
        this.setParamArrayObj(map, prefix + "NamespaceInfo.", this.NamespaceInfo);

    }
}

