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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQPrivateVirtualHost extends AbstractModel{

    /**
    * 虚拟主机的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualHostName")
    @Expose
    private String VirtualHostName;

    /**
    * 虚拟主机的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 虚拟主机的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualHostName 虚拟主机的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualHostName() {
        return this.VirtualHostName;
    }

    /**
     * Set 虚拟主机的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualHostName 虚拟主机的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualHostName(String VirtualHostName) {
        this.VirtualHostName = VirtualHostName;
    }

    /**
     * Get 虚拟主机的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 虚拟主机的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 虚拟主机的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 虚拟主机的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public RabbitMQPrivateVirtualHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQPrivateVirtualHost(RabbitMQPrivateVirtualHost source) {
        if (source.VirtualHostName != null) {
            this.VirtualHostName = new String(source.VirtualHostName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VirtualHostName", this.VirtualHostName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

