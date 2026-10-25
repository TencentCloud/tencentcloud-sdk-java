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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCatalogNamesRequest extends AbstractModel {

    /**
    * <p>workspace唯一id，必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>最大结果条数，可选，默认10</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private String MaxResults;

    /**
    * <p>分页token信息(base64编码，包含offset、snapshotId等)</p>
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * <p>catalog类型，参考CatalogType(当前支持：TABLE、MODEL、VOLUME)，可选，不填默认查询所有类型</p>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>数据目录来源筛选，取值参考CatalogSourceEnum(METALAKE/CONNECTION/SETATS)</p>
    */
    @SerializedName("CatalogSources")
    @Expose
    private String [] CatalogSources;

    /**
     * Get <p>workspace唯一id，必填</p> 
     * @return WorkspaceId <p>workspace唯一id，必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>workspace唯一id，必填</p>
     * @param WorkspaceId <p>workspace唯一id，必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>最大结果条数，可选，默认10</p> 
     * @return MaxResults <p>最大结果条数，可选，默认10</p>
     */
    public String getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>最大结果条数，可选，默认10</p>
     * @param MaxResults <p>最大结果条数，可选，默认10</p>
     */
    public void setMaxResults(String MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>分页token信息(base64编码，包含offset、snapshotId等)</p> 
     * @return PageToken <p>分页token信息(base64编码，包含offset、snapshotId等)</p>
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set <p>分页token信息(base64编码，包含offset、snapshotId等)</p>
     * @param PageToken <p>分页token信息(base64编码，包含offset、snapshotId等)</p>
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get <p>catalog类型，参考CatalogType(当前支持：TABLE、MODEL、VOLUME)，可选，不填默认查询所有类型</p> 
     * @return Types <p>catalog类型，参考CatalogType(当前支持：TABLE、MODEL、VOLUME)，可选，不填默认查询所有类型</p>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>catalog类型，参考CatalogType(当前支持：TABLE、MODEL、VOLUME)，可选，不填默认查询所有类型</p>
     * @param Types <p>catalog类型，参考CatalogType(当前支持：TABLE、MODEL、VOLUME)，可选，不填默认查询所有类型</p>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>数据目录来源筛选，取值参考CatalogSourceEnum(METALAKE/CONNECTION/SETATS)</p> 
     * @return CatalogSources <p>数据目录来源筛选，取值参考CatalogSourceEnum(METALAKE/CONNECTION/SETATS)</p>
     */
    public String [] getCatalogSources() {
        return this.CatalogSources;
    }

    /**
     * Set <p>数据目录来源筛选，取值参考CatalogSourceEnum(METALAKE/CONNECTION/SETATS)</p>
     * @param CatalogSources <p>数据目录来源筛选，取值参考CatalogSourceEnum(METALAKE/CONNECTION/SETATS)</p>
     */
    public void setCatalogSources(String [] CatalogSources) {
        this.CatalogSources = CatalogSources;
    }

    public ListCatalogNamesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCatalogNamesRequest(ListCatalogNamesRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new String(source.MaxResults);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.CatalogSources != null) {
            this.CatalogSources = new String[source.CatalogSources.length];
            for (int i = 0; i < source.CatalogSources.length; i++) {
                this.CatalogSources[i] = new String(source.CatalogSources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamArraySimple(map, prefix + "CatalogSources.", this.CatalogSources);

    }
}

