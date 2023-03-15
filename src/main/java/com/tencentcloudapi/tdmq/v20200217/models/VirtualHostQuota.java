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

public class VirtualHostQuota extends AbstractModel{

    /**
    * 允许创建最大vhost数
    */
    @SerializedName("MaxVirtualHost")
    @Expose
    private Long MaxVirtualHost;

    /**
    * 已创建vhost数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedVirtualHost")
    @Expose
    private Long UsedVirtualHost;

    /**
     * Get 允许创建最大vhost数 
     * @return MaxVirtualHost 允许创建最大vhost数
     */
    public Long getMaxVirtualHost() {
        return this.MaxVirtualHost;
    }

    /**
     * Set 允许创建最大vhost数
     * @param MaxVirtualHost 允许创建最大vhost数
     */
    public void setMaxVirtualHost(Long MaxVirtualHost) {
        this.MaxVirtualHost = MaxVirtualHost;
    }

    /**
     * Get 已创建vhost数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedVirtualHost 已创建vhost数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedVirtualHost() {
        return this.UsedVirtualHost;
    }

    /**
     * Set 已创建vhost数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedVirtualHost 已创建vhost数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedVirtualHost(Long UsedVirtualHost) {
        this.UsedVirtualHost = UsedVirtualHost;
    }

    public VirtualHostQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualHostQuota(VirtualHostQuota source) {
        if (source.MaxVirtualHost != null) {
            this.MaxVirtualHost = new Long(source.MaxVirtualHost);
        }
        if (source.UsedVirtualHost != null) {
            this.UsedVirtualHost = new Long(source.UsedVirtualHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxVirtualHost", this.MaxVirtualHost);
        this.setParamSimple(map, prefix + "UsedVirtualHost", this.UsedVirtualHost);

    }
}

