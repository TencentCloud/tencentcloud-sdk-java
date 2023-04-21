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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDescribeDocumentRequest extends AbstractModel{

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分页查询当前页数，从1开始递增
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数据量，最大1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 课件权限。[0]：获取owner的私有课件；[1]：获取owner的公开课件; [0,1]：则获取owner的私有课件和公开课件；[2]：获取owner的私有课件和所有人(包括owner)的公开课件
    */
    @SerializedName("Permission")
    @Expose
    private Long [] Permission;

    /**
    * 课件所有者的user_id，不填默认获取SdkAppId下所有课件
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 课件名称搜索词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 课件id列表，从列表中查询，忽略错误的id
    */
    @SerializedName("DocumentId")
    @Expose
    private String [] DocumentId;

    /**
     * Get 低代码互动课堂的SdkAppId。 
     * @return SdkAppId 低代码互动课堂的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。
     * @param SdkAppId 低代码互动课堂的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分页查询当前页数，从1开始递增 
     * @return Page 分页查询当前页数，从1开始递增
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询当前页数，从1开始递增
     * @param Page 分页查询当前页数，从1开始递增
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数据量，最大1000 
     * @return Limit 每页数据量，最大1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据量，最大1000
     * @param Limit 每页数据量，最大1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 课件权限。[0]：获取owner的私有课件；[1]：获取owner的公开课件; [0,1]：则获取owner的私有课件和公开课件；[2]：获取owner的私有课件和所有人(包括owner)的公开课件 
     * @return Permission 课件权限。[0]：获取owner的私有课件；[1]：获取owner的公开课件; [0,1]：则获取owner的私有课件和公开课件；[2]：获取owner的私有课件和所有人(包括owner)的公开课件
     */
    public Long [] getPermission() {
        return this.Permission;
    }

    /**
     * Set 课件权限。[0]：获取owner的私有课件；[1]：获取owner的公开课件; [0,1]：则获取owner的私有课件和公开课件；[2]：获取owner的私有课件和所有人(包括owner)的公开课件
     * @param Permission 课件权限。[0]：获取owner的私有课件；[1]：获取owner的公开课件; [0,1]：则获取owner的私有课件和公开课件；[2]：获取owner的私有课件和所有人(包括owner)的公开课件
     */
    public void setPermission(Long [] Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 课件所有者的user_id，不填默认获取SdkAppId下所有课件 
     * @return Owner 课件所有者的user_id，不填默认获取SdkAppId下所有课件
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 课件所有者的user_id，不填默认获取SdkAppId下所有课件
     * @param Owner 课件所有者的user_id，不填默认获取SdkAppId下所有课件
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 课件名称搜索词 
     * @return Keyword 课件名称搜索词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 课件名称搜索词
     * @param Keyword 课件名称搜索词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 课件id列表，从列表中查询，忽略错误的id 
     * @return DocumentId 课件id列表，从列表中查询，忽略错误的id
     */
    public String [] getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set 课件id列表，从列表中查询，忽略错误的id
     * @param DocumentId 课件id列表，从列表中查询，忽略错误的id
     */
    public void setDocumentId(String [] DocumentId) {
        this.DocumentId = DocumentId;
    }

    public BatchDescribeDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDescribeDocumentRequest(BatchDescribeDocumentRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Permission != null) {
            this.Permission = new Long[source.Permission.length];
            for (int i = 0; i < source.Permission.length; i++) {
                this.Permission[i] = new Long(source.Permission[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.DocumentId != null) {
            this.DocumentId = new String[source.DocumentId.length];
            for (int i = 0; i < source.DocumentId.length; i++) {
                this.DocumentId[i] = new String(source.DocumentId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Permission.", this.Permission);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "DocumentId.", this.DocumentId);

    }
}

