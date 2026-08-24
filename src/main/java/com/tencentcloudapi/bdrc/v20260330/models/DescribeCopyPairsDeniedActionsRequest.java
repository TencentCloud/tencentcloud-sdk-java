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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCopyPairsDeniedActionsRequest extends AbstractModel {

    /**
    * 复制对ID列表
    */
    @SerializedName("CopyPairIds")
    @Expose
    private String [] CopyPairIds;

    /**
    * 要查询复制对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
     * Get 复制对ID列表 
     * @return CopyPairIds 复制对ID列表
     */
    public String [] getCopyPairIds() {
        return this.CopyPairIds;
    }

    /**
     * Set 复制对ID列表
     * @param CopyPairIds 复制对ID列表
     */
    public void setCopyPairIds(String [] CopyPairIds) {
        this.CopyPairIds = CopyPairIds;
    }

    /**
     * Get 要查询复制对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储） 
     * @return CopyPairType 要查询复制对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set 要查询复制对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
     * @param CopyPairType 要查询复制对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    public DescribeCopyPairsDeniedActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCopyPairsDeniedActionsRequest(DescribeCopyPairsDeniedActionsRequest source) {
        if (source.CopyPairIds != null) {
            this.CopyPairIds = new String[source.CopyPairIds.length];
            for (int i = 0; i < source.CopyPairIds.length; i++) {
                this.CopyPairIds[i] = new String(source.CopyPairIds[i]);
            }
        }
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CopyPairIds.", this.CopyPairIds);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);

    }
}

