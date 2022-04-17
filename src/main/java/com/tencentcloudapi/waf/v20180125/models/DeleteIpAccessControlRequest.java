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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIpAccessControlRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 删除的ip数组
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
    * 删除对应的域名下的所有黑/白IP名额单
    */
    @SerializedName("DeleteAll")
    @Expose
    private Boolean DeleteAll;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 删除的ip数组 
     * @return Items 删除的ip数组
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set 删除的ip数组
     * @param Items 删除的ip数组
     */
    public void setItems(String [] Items) {
        this.Items = Items;
    }

    /**
     * Get 删除对应的域名下的所有黑/白IP名额单 
     * @return DeleteAll 删除对应的域名下的所有黑/白IP名额单
     */
    public Boolean getDeleteAll() {
        return this.DeleteAll;
    }

    /**
     * Set 删除对应的域名下的所有黑/白IP名额单
     * @param DeleteAll 删除对应的域名下的所有黑/白IP名额单
     */
    public void setDeleteAll(Boolean DeleteAll) {
        this.DeleteAll = DeleteAll;
    }

    public DeleteIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIpAccessControlRequest(DeleteIpAccessControlRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Items != null) {
            this.Items = new String[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new String(source.Items[i]);
            }
        }
        if (source.DeleteAll != null) {
            this.DeleteAll = new Boolean(source.DeleteAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "DeleteAll", this.DeleteAll);

    }
}

