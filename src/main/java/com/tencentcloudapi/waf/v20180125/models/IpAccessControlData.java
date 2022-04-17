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

public class IpAccessControlData extends AbstractModel{

    /**
    * ip黑白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Res")
    @Expose
    private IpAccessControlItem [] Res;

    /**
    * 计数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get ip黑白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Res ip黑白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpAccessControlItem [] getRes() {
        return this.Res;
    }

    /**
     * Set ip黑白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param Res ip黑白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRes(IpAccessControlItem [] Res) {
        this.Res = Res;
    }

    /**
     * Get 计数 
     * @return TotalCount 计数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 计数
     * @param TotalCount 计数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public IpAccessControlData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpAccessControlData(IpAccessControlData source) {
        if (source.Res != null) {
            this.Res = new IpAccessControlItem[source.Res.length];
            for (int i = 0; i < source.Res.length; i++) {
                this.Res[i] = new IpAccessControlItem(source.Res[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Res.", this.Res);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

