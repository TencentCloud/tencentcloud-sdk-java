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

public class LBChargePrepaid  extends AbstractModel{

    /**
    * 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 周期，表示多少个月（保留字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
     * 获取续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @return RenewFlag 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 续费类型：AUTO_RENEW 自动续费，  MANUAL_RENEW 手动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 获取周期，表示多少个月（保留字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @return Period 周期，表示多少个月（保留字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置周期，表示多少个月（保留字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 周期，表示多少个月（保留字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

