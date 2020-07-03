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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CardList extends AbstractModel{

    /**
    * 卡片总数
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 卡片列表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private CardInfo [] List;

    /**
     * Get 卡片总数 
     * @return Total 卡片总数
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 卡片总数
     * @param Total 卡片总数
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 卡片列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 卡片列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CardInfo [] getList() {
        return this.List;
    }

    /**
     * Set 卡片列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 卡片列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(CardInfo [] List) {
        this.List = List;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

