/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageByDateInfoData extends AbstractModel {

    /**
    * 用量信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsageByDateInfoList")
    @Expose
    private UsageByDateInfo [] UsageByDateInfoList;

    /**
     * Get 用量信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsageByDateInfoList 用量信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsageByDateInfo [] getUsageByDateInfoList() {
        return this.UsageByDateInfoList;
    }

    /**
     * Set 用量信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsageByDateInfoList 用量信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsageByDateInfoList(UsageByDateInfo [] UsageByDateInfoList) {
        this.UsageByDateInfoList = UsageByDateInfoList;
    }

    public UsageByDateInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageByDateInfoData(UsageByDateInfoData source) {
        if (source.UsageByDateInfoList != null) {
            this.UsageByDateInfoList = new UsageByDateInfo[source.UsageByDateInfoList.length];
            for (int i = 0; i < source.UsageByDateInfoList.length; i++) {
                this.UsageByDateInfoList[i] = new UsageByDateInfo(source.UsageByDateInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UsageByDateInfoList.", this.UsageByDateInfoList);

    }
}

