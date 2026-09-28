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

public class ListFilesRequest extends AbstractModel {

    /**
    * <p>工作空间id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>父目录，不填默认查询根节点</p>
    */
    @SerializedName("Parent")
    @Expose
    private FolderLocator Parent;

    /**
    * <p>按文件类型过滤</p>
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * <p>文件名模糊匹配</p>
    */
    @SerializedName("NameKeyword")
    @Expose
    private String NameKeyword;

    /**
    * <p>按所有者UIN过滤，多值为或关系</p>
    */
    @SerializedName("OwnerUserUins")
    @Expose
    private String [] OwnerUserUins;

    /**
    * <p>是否只列出文件夹，默认 false</p>
    */
    @SerializedName("OnlyFolder")
    @Expose
    private Boolean OnlyFolder;

    /**
    * <p>排序字段列表，如创建时间 [{Name: &#39;CreateTime&#39;, Direction: &#39;DESC&#39;}]，文件名称 [{Name: &#39;Name&#39;, Direction: &#39;ASC&#39;}]</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>页码，默认1，最小值1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页条数，默认10，最小值10，最大值100</p><p>取值范围：[10, 100]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>工作空间id</p> 
     * @return WorkspaceId <p>工作空间id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间id</p>
     * @param WorkspaceId <p>工作空间id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>父目录，不填默认查询根节点</p> 
     * @return Parent <p>父目录，不填默认查询根节点</p>
     */
    public FolderLocator getParent() {
        return this.Parent;
    }

    /**
     * Set <p>父目录，不填默认查询根节点</p>
     * @param Parent <p>父目录，不填默认查询根节点</p>
     */
    public void setParent(FolderLocator Parent) {
        this.Parent = Parent;
    }

    /**
     * Get <p>按文件类型过滤</p> 
     * @return FileTypes <p>按文件类型过滤</p>
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set <p>按文件类型过滤</p>
     * @param FileTypes <p>按文件类型过滤</p>
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get <p>文件名模糊匹配</p> 
     * @return NameKeyword <p>文件名模糊匹配</p>
     */
    public String getNameKeyword() {
        return this.NameKeyword;
    }

    /**
     * Set <p>文件名模糊匹配</p>
     * @param NameKeyword <p>文件名模糊匹配</p>
     */
    public void setNameKeyword(String NameKeyword) {
        this.NameKeyword = NameKeyword;
    }

    /**
     * Get <p>按所有者UIN过滤，多值为或关系</p> 
     * @return OwnerUserUins <p>按所有者UIN过滤，多值为或关系</p>
     */
    public String [] getOwnerUserUins() {
        return this.OwnerUserUins;
    }

    /**
     * Set <p>按所有者UIN过滤，多值为或关系</p>
     * @param OwnerUserUins <p>按所有者UIN过滤，多值为或关系</p>
     */
    public void setOwnerUserUins(String [] OwnerUserUins) {
        this.OwnerUserUins = OwnerUserUins;
    }

    /**
     * Get <p>是否只列出文件夹，默认 false</p> 
     * @return OnlyFolder <p>是否只列出文件夹，默认 false</p>
     */
    public Boolean getOnlyFolder() {
        return this.OnlyFolder;
    }

    /**
     * Set <p>是否只列出文件夹，默认 false</p>
     * @param OnlyFolder <p>是否只列出文件夹，默认 false</p>
     */
    public void setOnlyFolder(Boolean OnlyFolder) {
        this.OnlyFolder = OnlyFolder;
    }

    /**
     * Get <p>排序字段列表，如创建时间 [{Name: &#39;CreateTime&#39;, Direction: &#39;DESC&#39;}]，文件名称 [{Name: &#39;Name&#39;, Direction: &#39;ASC&#39;}]</p> 
     * @return OrderBys <p>排序字段列表，如创建时间 [{Name: &#39;CreateTime&#39;, Direction: &#39;DESC&#39;}]，文件名称 [{Name: &#39;Name&#39;, Direction: &#39;ASC&#39;}]</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>排序字段列表，如创建时间 [{Name: &#39;CreateTime&#39;, Direction: &#39;DESC&#39;}]，文件名称 [{Name: &#39;Name&#39;, Direction: &#39;ASC&#39;}]</p>
     * @param OrderBys <p>排序字段列表，如创建时间 [{Name: &#39;CreateTime&#39;, Direction: &#39;DESC&#39;}]，文件名称 [{Name: &#39;Name&#39;, Direction: &#39;ASC&#39;}]</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>页码，默认1，最小值1</p> 
     * @return PageNumber <p>页码，默认1，最小值1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，默认1，最小值1</p>
     * @param PageNumber <p>页码，默认1，最小值1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页条数，默认10，最小值10，最大值100</p><p>取值范围：[10, 100]</p> 
     * @return PageSize <p>每页条数，默认10，最小值10，最大值100</p><p>取值范围：[10, 100]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页条数，默认10，最小值10，最大值100</p><p>取值范围：[10, 100]</p>
     * @param PageSize <p>每页条数，默认10，最小值10，最大值100</p><p>取值范围：[10, 100]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFilesRequest(ListFilesRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Parent != null) {
            this.Parent = new FolderLocator(source.Parent);
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.NameKeyword != null) {
            this.NameKeyword = new String(source.NameKeyword);
        }
        if (source.OwnerUserUins != null) {
            this.OwnerUserUins = new String[source.OwnerUserUins.length];
            for (int i = 0; i < source.OwnerUserUins.length; i++) {
                this.OwnerUserUins[i] = new String(source.OwnerUserUins[i]);
            }
        }
        if (source.OnlyFolder != null) {
            this.OnlyFolder = new Boolean(source.OnlyFolder);
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "Parent.", this.Parent);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamSimple(map, prefix + "NameKeyword", this.NameKeyword);
        this.setParamArraySimple(map, prefix + "OwnerUserUins.", this.OwnerUserUins);
        this.setParamSimple(map, prefix + "OnlyFolder", this.OnlyFolder);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

