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

public class ListWorkspaceUsersRsp extends AbstractModel {

    /**
    * 用户列表
    */
    @SerializedName("Items")
    @Expose
    private WorkspaceUserInfo [] Items;

    /**
    * 当前页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总页数
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * 扩展信息（连续翻页场景由服务端返回，下次翻页请求原样带上）
    */
    @SerializedName("ExtendInfo")
    @Expose
    private String ExtendInfo;

    /**
     * Get 用户列表 
     * @return Items 用户列表
     */
    public WorkspaceUserInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 用户列表
     * @param Items 用户列表
     */
    public void setItems(WorkspaceUserInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get 当前页码 
     * @return PageNumber 当前页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页码
     * @param PageNumber 当前页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页大小 
     * @return PageSize 每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总页数 
     * @return TotalPageNumber 总页数
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 总页数
     * @param TotalPageNumber 总页数
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get 扩展信息（连续翻页场景由服务端返回，下次翻页请求原样带上） 
     * @return ExtendInfo 扩展信息（连续翻页场景由服务端返回，下次翻页请求原样带上）
     */
    public String getExtendInfo() {
        return this.ExtendInfo;
    }

    /**
     * Set 扩展信息（连续翻页场景由服务端返回，下次翻页请求原样带上）
     * @param ExtendInfo 扩展信息（连续翻页场景由服务端返回，下次翻页请求原样带上）
     */
    public void setExtendInfo(String ExtendInfo) {
        this.ExtendInfo = ExtendInfo;
    }

    public ListWorkspaceUsersRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspaceUsersRsp(ListWorkspaceUsersRsp source) {
        if (source.Items != null) {
            this.Items = new WorkspaceUserInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkspaceUserInfo(source.Items[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.ExtendInfo != null) {
            this.ExtendInfo = new String(source.ExtendInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "ExtendInfo", this.ExtendInfo);

    }
}

