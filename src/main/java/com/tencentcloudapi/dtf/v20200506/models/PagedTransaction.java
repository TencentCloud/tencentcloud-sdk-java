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
package com.tencentcloudapi.dtf.v20200506.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PagedTransaction extends AbstractModel{

    /**
    * 总条数，特定在该接口中总是会返回null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 主事务分组列表
    */
    @SerializedName("Content")
    @Expose
    private Transaction [] Content;

    /**
     * Get 总条数，特定在该接口中总是会返回null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总条数，特定在该接口中总是会返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数，特定在该接口中总是会返回null
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总条数，特定在该接口中总是会返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 主事务分组列表 
     * @return Content 主事务分组列表
     */
    public Transaction [] getContent() {
        return this.Content;
    }

    /**
     * Set 主事务分组列表
     * @param Content 主事务分组列表
     */
    public void setContent(Transaction [] Content) {
        this.Content = Content;
    }

    public PagedTransaction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PagedTransaction(PagedTransaction source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new Transaction[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new Transaction(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

