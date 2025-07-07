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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSimpleNamespacesRequest extends AbstractModel {

    /**
    * 命名空间ID列表，不传入时查询全量
    */
    @SerializedName("NamespaceIdList")
    @Expose
    private String [] NamespaceIdList;

    /**
    * 集群ID，不传入时查询全量
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 命名空间ID，不传入时查询全量
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 查询资源类型列表
    */
    @SerializedName("NamespaceResourceTypeList")
    @Expose
    private String [] NamespaceResourceTypeList;

    /**
    * 通过id和name进行过滤
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 查询的命名空间类型列表
    */
    @SerializedName("NamespaceTypeList")
    @Expose
    private String [] NamespaceTypeList;

    /**
    * 通过命名空间名精确过滤
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 通过是否是默认命名空间过滤，不传表示拉取全部命名空间。0：默认命名空间。1：非默认命名空间
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * 是否关闭鉴权查询
    */
    @SerializedName("DisableProgramAuthCheck")
    @Expose
    private Boolean DisableProgramAuthCheck;

    /**
     * Get 命名空间ID列表，不传入时查询全量 
     * @return NamespaceIdList 命名空间ID列表，不传入时查询全量
     */
    public String [] getNamespaceIdList() {
        return this.NamespaceIdList;
    }

    /**
     * Set 命名空间ID列表，不传入时查询全量
     * @param NamespaceIdList 命名空间ID列表，不传入时查询全量
     */
    public void setNamespaceIdList(String [] NamespaceIdList) {
        this.NamespaceIdList = NamespaceIdList;
    }

    /**
     * Get 集群ID，不传入时查询全量 
     * @return ClusterId 集群ID，不传入时查询全量
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，不传入时查询全量
     * @param ClusterId 集群ID，不传入时查询全量
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 起始偏移量 
     * @return Offset 起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量
     * @param Offset 起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 命名空间ID，不传入时查询全量 
     * @return NamespaceId 命名空间ID，不传入时查询全量
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID，不传入时查询全量
     * @param NamespaceId 命名空间ID，不传入时查询全量
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 查询资源类型列表 
     * @return NamespaceResourceTypeList 查询资源类型列表
     */
    public String [] getNamespaceResourceTypeList() {
        return this.NamespaceResourceTypeList;
    }

    /**
     * Set 查询资源类型列表
     * @param NamespaceResourceTypeList 查询资源类型列表
     */
    public void setNamespaceResourceTypeList(String [] NamespaceResourceTypeList) {
        this.NamespaceResourceTypeList = NamespaceResourceTypeList;
    }

    /**
     * Get 通过id和name进行过滤 
     * @return SearchWord 通过id和name进行过滤
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 通过id和name进行过滤
     * @param SearchWord 通过id和name进行过滤
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 查询的命名空间类型列表 
     * @return NamespaceTypeList 查询的命名空间类型列表
     */
    public String [] getNamespaceTypeList() {
        return this.NamespaceTypeList;
    }

    /**
     * Set 查询的命名空间类型列表
     * @param NamespaceTypeList 查询的命名空间类型列表
     */
    public void setNamespaceTypeList(String [] NamespaceTypeList) {
        this.NamespaceTypeList = NamespaceTypeList;
    }

    /**
     * Get 通过命名空间名精确过滤 
     * @return NamespaceName 通过命名空间名精确过滤
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 通过命名空间名精确过滤
     * @param NamespaceName 通过命名空间名精确过滤
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 通过是否是默认命名空间过滤，不传表示拉取全部命名空间。0：默认命名空间。1：非默认命名空间 
     * @return IsDefault 通过是否是默认命名空间过滤，不传表示拉取全部命名空间。0：默认命名空间。1：非默认命名空间
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 通过是否是默认命名空间过滤，不传表示拉取全部命名空间。0：默认命名空间。1：非默认命名空间
     * @param IsDefault 通过是否是默认命名空间过滤，不传表示拉取全部命名空间。0：默认命名空间。1：非默认命名空间
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 是否关闭鉴权查询 
     * @return DisableProgramAuthCheck 是否关闭鉴权查询
     */
    public Boolean getDisableProgramAuthCheck() {
        return this.DisableProgramAuthCheck;
    }

    /**
     * Set 是否关闭鉴权查询
     * @param DisableProgramAuthCheck 是否关闭鉴权查询
     */
    public void setDisableProgramAuthCheck(Boolean DisableProgramAuthCheck) {
        this.DisableProgramAuthCheck = DisableProgramAuthCheck;
    }

    public DescribeSimpleNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSimpleNamespacesRequest(DescribeSimpleNamespacesRequest source) {
        if (source.NamespaceIdList != null) {
            this.NamespaceIdList = new String[source.NamespaceIdList.length];
            for (int i = 0; i < source.NamespaceIdList.length; i++) {
                this.NamespaceIdList[i] = new String(source.NamespaceIdList[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceResourceTypeList != null) {
            this.NamespaceResourceTypeList = new String[source.NamespaceResourceTypeList.length];
            for (int i = 0; i < source.NamespaceResourceTypeList.length; i++) {
                this.NamespaceResourceTypeList[i] = new String(source.NamespaceResourceTypeList[i]);
            }
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.NamespaceTypeList != null) {
            this.NamespaceTypeList = new String[source.NamespaceTypeList.length];
            for (int i = 0; i < source.NamespaceTypeList.length; i++) {
                this.NamespaceTypeList[i] = new String(source.NamespaceTypeList[i]);
            }
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
        if (source.DisableProgramAuthCheck != null) {
            this.DisableProgramAuthCheck = new Boolean(source.DisableProgramAuthCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NamespaceIdList.", this.NamespaceIdList);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamArraySimple(map, prefix + "NamespaceResourceTypeList.", this.NamespaceResourceTypeList);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArraySimple(map, prefix + "NamespaceTypeList.", this.NamespaceTypeList);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "DisableProgramAuthCheck", this.DisableProgramAuthCheck);

    }
}

