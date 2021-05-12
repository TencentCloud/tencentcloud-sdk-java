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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MerchantManagementResult extends AbstractModel{

    /**
    * 总数。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 商户列表。
    */
    @SerializedName("List")
    @Expose
    private MerchantManagementList [] List;

    /**
     * Get 总数。 
     * @return Total 总数。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数。
     * @param Total 总数。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 商户列表。 
     * @return List 商户列表。
     */
    public MerchantManagementList [] getList() {
        return this.List;
    }

    /**
     * Set 商户列表。
     * @param List 商户列表。
     */
    public void setList(MerchantManagementList [] List) {
        this.List = List;
    }

    public MerchantManagementResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MerchantManagementResult(MerchantManagementResult source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.List != null) {
            this.List = new MerchantManagementList[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new MerchantManagementList(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

