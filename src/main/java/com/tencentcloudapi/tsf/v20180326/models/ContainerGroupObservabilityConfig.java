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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerGroupObservabilityConfig extends AbstractModel {

    /**
    * 日志配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLogConfigIdList")
    @Expose
    private String [] BusinessLogConfigIdList;

    /**
    * 投递配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLogDeliveryConfigIdList")
    @Expose
    private String [] BusinessLogDeliveryConfigIdList;

    /**
     * Get 日志配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLogConfigIdList 日志配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBusinessLogConfigIdList() {
        return this.BusinessLogConfigIdList;
    }

    /**
     * Set 日志配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLogConfigIdList 日志配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLogConfigIdList(String [] BusinessLogConfigIdList) {
        this.BusinessLogConfigIdList = BusinessLogConfigIdList;
    }

    /**
     * Get 投递配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLogDeliveryConfigIdList 投递配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBusinessLogDeliveryConfigIdList() {
        return this.BusinessLogDeliveryConfigIdList;
    }

    /**
     * Set 投递配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLogDeliveryConfigIdList 投递配置项ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLogDeliveryConfigIdList(String [] BusinessLogDeliveryConfigIdList) {
        this.BusinessLogDeliveryConfigIdList = BusinessLogDeliveryConfigIdList;
    }

    public ContainerGroupObservabilityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerGroupObservabilityConfig(ContainerGroupObservabilityConfig source) {
        if (source.BusinessLogConfigIdList != null) {
            this.BusinessLogConfigIdList = new String[source.BusinessLogConfigIdList.length];
            for (int i = 0; i < source.BusinessLogConfigIdList.length; i++) {
                this.BusinessLogConfigIdList[i] = new String(source.BusinessLogConfigIdList[i]);
            }
        }
        if (source.BusinessLogDeliveryConfigIdList != null) {
            this.BusinessLogDeliveryConfigIdList = new String[source.BusinessLogDeliveryConfigIdList.length];
            for (int i = 0; i < source.BusinessLogDeliveryConfigIdList.length; i++) {
                this.BusinessLogDeliveryConfigIdList[i] = new String(source.BusinessLogDeliveryConfigIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BusinessLogConfigIdList.", this.BusinessLogConfigIdList);
        this.setParamArraySimple(map, prefix + "BusinessLogDeliveryConfigIdList.", this.BusinessLogDeliveryConfigIdList);

    }
}

