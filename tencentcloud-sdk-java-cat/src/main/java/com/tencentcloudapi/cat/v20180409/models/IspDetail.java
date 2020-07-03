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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IspDetail extends AbstractModel{

    /**
    * 运营商名称
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 可用率
    */
    @SerializedName("AvailRatio")
    @Expose
    private Float AvailRatio;

    /**
    * 平均耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgTime")
    @Expose
    private Float AvgTime;

    /**
     * Get 运营商名称 
     * @return IspName 运营商名称
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 运营商名称
     * @param IspName 运营商名称
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 可用率 
     * @return AvailRatio 可用率
     */
    public Float getAvailRatio() {
        return this.AvailRatio;
    }

    /**
     * Set 可用率
     * @param AvailRatio 可用率
     */
    public void setAvailRatio(Float AvailRatio) {
        this.AvailRatio = AvailRatio;
    }

    /**
     * Get 平均耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgTime 平均耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAvgTime() {
        return this.AvgTime;
    }

    /**
     * Set 平均耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgTime 平均耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgTime(Float AvgTime) {
        this.AvgTime = AvgTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "AvailRatio", this.AvailRatio);
        this.setParamSimple(map, prefix + "AvgTime", this.AvgTime);

    }
}

