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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBInstanceList extends AbstractModel {

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * tcb环境实例详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environments")
    @Expose
    private TCBEnvironments [] Environments;

    /**
    * 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get tcb环境实例详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Environments tcb环境实例详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TCBEnvironments [] getEnvironments() {
        return this.Environments;
    }

    /**
     * Set tcb环境实例详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Environments tcb环境实例详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironments(TCBEnvironments [] Environments) {
        this.Environments = Environments;
    }

    /**
     * Get 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public TCBInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBInstanceList(TCBInstanceList source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Environments != null) {
            this.Environments = new TCBEnvironments[source.Environments.length];
            for (int i = 0; i < source.Environments.length; i++) {
                this.Environments[i] = new TCBEnvironments(source.Environments[i]);
            }
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Environments.", this.Environments);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

