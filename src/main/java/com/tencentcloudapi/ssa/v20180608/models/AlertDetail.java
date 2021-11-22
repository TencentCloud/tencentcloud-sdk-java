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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertDetail extends AbstractModel{

    /**
    * 告警基础信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseInfo")
    @Expose
    private AlertType BaseInfo;

    /**
    * 告警详情，json序列化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
     * Get 告警基础信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseInfo 告警基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlertType getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set 告警基础信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseInfo 告警基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseInfo(AlertType BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get 告警详情，json序列化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 告警详情，json序列化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 告警详情，json序列化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 告警详情，json序列化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public AlertDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertDetail(AlertDetail source) {
        if (source.BaseInfo != null) {
            this.BaseInfo = new AlertType(source.BaseInfo);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamSimple(map, prefix + "Detail", this.Detail);

    }
}

