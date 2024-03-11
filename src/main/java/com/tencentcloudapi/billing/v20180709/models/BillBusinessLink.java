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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillBusinessLink extends AbstractModel {

    /**
    * 子产品
    */
    @SerializedName("Children")
    @Expose
    private BillProductLink [] Children;

    /**
     * Get 子产品 
     * @return Children 子产品
     */
    public BillProductLink [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子产品
     * @param Children 子产品
     */
    public void setChildren(BillProductLink [] Children) {
        this.Children = Children;
    }

    public BillBusinessLink() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillBusinessLink(BillBusinessLink source) {
        if (source.Children != null) {
            this.Children = new BillProductLink[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new BillProductLink(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

