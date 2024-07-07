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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessInfo extends AbstractModel {

    /**
    * 访问引擎的方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 访问引擎的url，内部的部分参数需要根据实际情况替换
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessConnectionInfos")
    @Expose
    private String [] AccessConnectionInfos;

    /**
     * Get 访问引擎的方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 访问引擎的方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问引擎的方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 访问引擎的方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 访问引擎的url，内部的部分参数需要根据实际情况替换
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessConnectionInfos 访问引擎的url，内部的部分参数需要根据实际情况替换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAccessConnectionInfos() {
        return this.AccessConnectionInfos;
    }

    /**
     * Set 访问引擎的url，内部的部分参数需要根据实际情况替换
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessConnectionInfos 访问引擎的url，内部的部分参数需要根据实际情况替换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessConnectionInfos(String [] AccessConnectionInfos) {
        this.AccessConnectionInfos = AccessConnectionInfos;
    }

    public AccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessInfo(AccessInfo source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.AccessConnectionInfos != null) {
            this.AccessConnectionInfos = new String[source.AccessConnectionInfos.length];
            for (int i = 0; i < source.AccessConnectionInfos.length; i++) {
                this.AccessConnectionInfos[i] = new String(source.AccessConnectionInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArraySimple(map, prefix + "AccessConnectionInfos.", this.AccessConnectionInfos);

    }
}

