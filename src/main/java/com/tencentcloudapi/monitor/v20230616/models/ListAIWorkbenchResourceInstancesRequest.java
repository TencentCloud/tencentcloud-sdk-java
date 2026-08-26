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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAIWorkbenchResourceInstancesRequest extends AbstractModel {

    /**
    * <p>资源地图 ID</p>
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>分页参数</p>
    */
    @SerializedName("PageParams")
    @Expose
    private PageByNumParams PageParams;

    /**
     * Get <p>资源地图 ID</p> 
     * @return ResourceMapId <p>资源地图 ID</p>
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>资源地图 ID</p>
     * @param ResourceMapId <p>资源地图 ID</p>
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>分页参数</p> 
     * @return PageParams <p>分页参数</p>
     */
    public PageByNumParams getPageParams() {
        return this.PageParams;
    }

    /**
     * Set <p>分页参数</p>
     * @param PageParams <p>分页参数</p>
     */
    public void setPageParams(PageByNumParams PageParams) {
        this.PageParams = PageParams;
    }

    public ListAIWorkbenchResourceInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchResourceInstancesRequest(ListAIWorkbenchResourceInstancesRequest source) {
        if (source.ResourceMapId != null) {
            this.ResourceMapId = new String(source.ResourceMapId);
        }
        if (source.PageParams != null) {
            this.PageParams = new PageByNumParams(source.PageParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamObj(map, prefix + "PageParams.", this.PageParams);

    }
}

