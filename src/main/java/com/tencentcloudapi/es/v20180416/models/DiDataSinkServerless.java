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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiDataSinkServerless extends AbstractModel {

    /**
    * serverless实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerlessId")
    @Expose
    private String ServerlessId;

    /**
     * Get serverless实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerlessId serverless实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerlessId() {
        return this.ServerlessId;
    }

    /**
     * Set serverless实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerlessId serverless实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerlessId(String ServerlessId) {
        this.ServerlessId = ServerlessId;
    }

    public DiDataSinkServerless() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiDataSinkServerless(DiDataSinkServerless source) {
        if (source.ServerlessId != null) {
            this.ServerlessId = new String(source.ServerlessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerlessId", this.ServerlessId);

    }
}

