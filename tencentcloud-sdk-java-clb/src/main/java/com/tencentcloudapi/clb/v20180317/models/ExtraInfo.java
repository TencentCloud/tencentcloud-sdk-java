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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfo extends AbstractModel{

    /**
    * 是否开通VIP直通
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZhiTong")
    @Expose
    private Boolean ZhiTong;

    /**
    * TgwGroup名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TgwGroupName")
    @Expose
    private String TgwGroupName;

    /**
     * Get 是否开通VIP直通
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZhiTong 是否开通VIP直通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getZhiTong() {
        return this.ZhiTong;
    }

    /**
     * Set 是否开通VIP直通
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZhiTong 是否开通VIP直通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZhiTong(Boolean ZhiTong) {
        this.ZhiTong = ZhiTong;
    }

    /**
     * Get TgwGroup名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TgwGroupName TgwGroup名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTgwGroupName() {
        return this.TgwGroupName;
    }

    /**
     * Set TgwGroup名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TgwGroupName TgwGroup名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTgwGroupName(String TgwGroupName) {
        this.TgwGroupName = TgwGroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZhiTong", this.ZhiTong);
        this.setParamSimple(map, prefix + "TgwGroupName", this.TgwGroupName);

    }
}

