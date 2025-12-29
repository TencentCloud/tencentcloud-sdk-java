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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKnowledgeUsagePieGraphRequest extends AbstractModel {

    /**
    * 应用ID数组
    */
    @SerializedName("AppBizIds")
    @Expose
    private String [] AppBizIds;

    /**
    * 空间ID，用于限定查询范围。不填时查询所有空间的数据
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get 应用ID数组 
     * @return AppBizIds 应用ID数组
     */
    public String [] getAppBizIds() {
        return this.AppBizIds;
    }

    /**
     * Set 应用ID数组
     * @param AppBizIds 应用ID数组
     */
    public void setAppBizIds(String [] AppBizIds) {
        this.AppBizIds = AppBizIds;
    }

    /**
     * Get 空间ID，用于限定查询范围。不填时查询所有空间的数据 
     * @return SpaceId 空间ID，用于限定查询范围。不填时查询所有空间的数据
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间ID，用于限定查询范围。不填时查询所有空间的数据
     * @param SpaceId 空间ID，用于限定查询范围。不填时查询所有空间的数据
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public DescribeKnowledgeUsagePieGraphRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeUsagePieGraphRequest(DescribeKnowledgeUsagePieGraphRequest source) {
        if (source.AppBizIds != null) {
            this.AppBizIds = new String[source.AppBizIds.length];
            for (int i = 0; i < source.AppBizIds.length; i++) {
                this.AppBizIds[i] = new String(source.AppBizIds[i]);
            }
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AppBizIds.", this.AppBizIds);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}

