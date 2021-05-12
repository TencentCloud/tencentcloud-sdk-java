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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsGetCrowdPackListResponse extends AbstractModel{

    /**
    * 人群包总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 人群包返回数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private SmsGetCrowdPackList [] List;

    /**
     * Get 人群包总数 
     * @return Total 人群包总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 人群包总数
     * @param Total 人群包总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 人群包返回数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 人群包返回数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmsGetCrowdPackList [] getList() {
        return this.List;
    }

    /**
     * Set 人群包返回数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 人群包返回数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(SmsGetCrowdPackList [] List) {
        this.List = List;
    }

    public SmsGetCrowdPackListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsGetCrowdPackListResponse(SmsGetCrowdPackListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.List != null) {
            this.List = new SmsGetCrowdPackList[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new SmsGetCrowdPackList(source.List[i]);
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

