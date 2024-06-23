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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadonlyNode extends AbstractModel {

    /**
    * 是否分布在随机可用区。传入YES表示随机可用区。否则使用Zone指定的可用区。
    */
    @SerializedName("IsRandomZone")
    @Expose
    private String IsRandomZone;

    /**
    * 指定该节点分布在哪个可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 是否分布在随机可用区。传入YES表示随机可用区。否则使用Zone指定的可用区。 
     * @return IsRandomZone 是否分布在随机可用区。传入YES表示随机可用区。否则使用Zone指定的可用区。
     */
    public String getIsRandomZone() {
        return this.IsRandomZone;
    }

    /**
     * Set 是否分布在随机可用区。传入YES表示随机可用区。否则使用Zone指定的可用区。
     * @param IsRandomZone 是否分布在随机可用区。传入YES表示随机可用区。否则使用Zone指定的可用区。
     */
    public void setIsRandomZone(String IsRandomZone) {
        this.IsRandomZone = IsRandomZone;
    }

    /**
     * Get 指定该节点分布在哪个可用区。 
     * @return Zone 指定该节点分布在哪个可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 指定该节点分布在哪个可用区。
     * @param Zone 指定该节点分布在哪个可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public ReadonlyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadonlyNode(ReadonlyNode source) {
        if (source.IsRandomZone != null) {
            this.IsRandomZone = new String(source.IsRandomZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsRandomZone", this.IsRandomZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

