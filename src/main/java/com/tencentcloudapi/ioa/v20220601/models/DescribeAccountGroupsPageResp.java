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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountGroupsPageResp extends AbstractModel {

    /**
    * 账户分响应对象集合
    */
    @SerializedName("Items")
    @Expose
    private DescribeAccountGroupsData [] Items;

    /**
    * 分页公共对象
    */
    @SerializedName("Page")
    @Expose
    private Paging Page;

    /**
     * Get 账户分响应对象集合 
     * @return Items 账户分响应对象集合
     */
    public DescribeAccountGroupsData [] getItems() {
        return this.Items;
    }

    /**
     * Set 账户分响应对象集合
     * @param Items 账户分响应对象集合
     */
    public void setItems(DescribeAccountGroupsData [] Items) {
        this.Items = Items;
    }

    /**
     * Get 分页公共对象 
     * @return Page 分页公共对象
     */
    public Paging getPage() {
        return this.Page;
    }

    /**
     * Set 分页公共对象
     * @param Page 分页公共对象
     */
    public void setPage(Paging Page) {
        this.Page = Page;
    }

    public DescribeAccountGroupsPageResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountGroupsPageResp(DescribeAccountGroupsPageResp source) {
        if (source.Items != null) {
            this.Items = new DescribeAccountGroupsData[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DescribeAccountGroupsData(source.Items[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Paging(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamObj(map, prefix + "Page.", this.Page);

    }
}

