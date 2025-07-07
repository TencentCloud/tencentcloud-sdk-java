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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeviceSumStatisticsRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 产品id列表，长度为0则拉取项目内全部产品
    */
    @SerializedName("ProductIds")
    @Expose
    private String [] ProductIds;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 产品id列表，长度为0则拉取项目内全部产品 
     * @return ProductIds 产品id列表，长度为0则拉取项目内全部产品
     */
    public String [] getProductIds() {
        return this.ProductIds;
    }

    /**
     * Set 产品id列表，长度为0则拉取项目内全部产品
     * @param ProductIds 产品id列表，长度为0则拉取项目内全部产品
     */
    public void setProductIds(String [] ProductIds) {
        this.ProductIds = ProductIds;
    }

    public GetDeviceSumStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeviceSumStatisticsRequest(GetDeviceSumStatisticsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProductIds != null) {
            this.ProductIds = new String[source.ProductIds.length];
            for (int i = 0; i < source.ProductIds.length; i++) {
                this.ProductIds[i] = new String(source.ProductIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "ProductIds.", this.ProductIds);

    }
}

