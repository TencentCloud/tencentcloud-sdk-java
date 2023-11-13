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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationList extends AbstractModel {

    /**
    * 应用列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationInfoList")
    @Expose
    private ApplicationInfo [] ApplicationInfoList;

    /**
    * 当前查询条件命中的数据总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
     * Get 应用列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationInfoList 应用列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplicationInfo [] getApplicationInfoList() {
        return this.ApplicationInfoList;
    }

    /**
     * Set 应用列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationInfoList 应用列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationInfoList(ApplicationInfo [] ApplicationInfoList) {
        this.ApplicationInfoList = ApplicationInfoList;
    }

    /**
     * Get 当前查询条件命中的数据总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 当前查询条件命中的数据总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 当前查询条件命中的数据总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 当前查询条件命中的数据总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ApplicationList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationList(ApplicationList source) {
        if (source.ApplicationInfoList != null) {
            this.ApplicationInfoList = new ApplicationInfo[source.ApplicationInfoList.length];
            for (int i = 0; i < source.ApplicationInfoList.length; i++) {
                this.ApplicationInfoList[i] = new ApplicationInfo(source.ApplicationInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ApplicationInfoList.", this.ApplicationInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

