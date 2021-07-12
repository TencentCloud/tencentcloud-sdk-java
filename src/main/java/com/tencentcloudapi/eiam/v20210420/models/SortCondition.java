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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortCondition extends AbstractModel{

    /**
    * 排序属性。
    */
    @SerializedName("SortKey")
    @Expose
    private String SortKey;

    /**
    * 排序顺序，ASC为正向排序，DESC为反向排序。
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 排序属性。 
     * @return SortKey 排序属性。
     */
    public String getSortKey() {
        return this.SortKey;
    }

    /**
     * Set 排序属性。
     * @param SortKey 排序属性。
     */
    public void setSortKey(String SortKey) {
        this.SortKey = SortKey;
    }

    /**
     * Get 排序顺序，ASC为正向排序，DESC为反向排序。 
     * @return SortOrder 排序顺序，ASC为正向排序，DESC为反向排序。
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序顺序，ASC为正向排序，DESC为反向排序。
     * @param SortOrder 排序顺序，ASC为正向排序，DESC为反向排序。
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public SortCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SortCondition(SortCondition source) {
        if (source.SortKey != null) {
            this.SortKey = new String(source.SortKey);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SortKey", this.SortKey);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

