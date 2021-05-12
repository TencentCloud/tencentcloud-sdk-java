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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvironmentStrategy extends AbstractModel{

    /**
    * 环境名
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 限流值
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
    * 限流最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxQuota")
    @Expose
    private Long MaxQuota;

    /**
     * Get 环境名 
     * @return EnvironmentName 环境名
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名
     * @param EnvironmentName 环境名
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 限流值 
     * @return Quota 限流值
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 限流值
     * @param Quota 限流值
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    /**
     * Get 限流最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxQuota 限流最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxQuota() {
        return this.MaxQuota;
    }

    /**
     * Set 限流最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxQuota 限流最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxQuota(Long MaxQuota) {
        this.MaxQuota = MaxQuota;
    }

    public EnvironmentStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvironmentStrategy(EnvironmentStrategy source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
        if (source.MaxQuota != null) {
            this.MaxQuota = new Long(source.MaxQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "MaxQuota", this.MaxQuota);

    }
}

