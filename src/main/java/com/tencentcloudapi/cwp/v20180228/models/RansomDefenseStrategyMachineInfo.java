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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RansomDefenseStrategyMachineInfo extends AbstractModel{

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 指定硬盘列表，为空时表示所有硬盘：disk_id1|disk_name1;disk_id2|disk_name2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskInfo")
    @Expose
    private String DiskInfo;

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 指定硬盘列表，为空时表示所有硬盘：disk_id1|disk_name1;disk_id2|disk_name2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskInfo 指定硬盘列表，为空时表示所有硬盘：disk_id1|disk_name1;disk_id2|disk_name2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskInfo() {
        return this.DiskInfo;
    }

    /**
     * Set 指定硬盘列表，为空时表示所有硬盘：disk_id1|disk_name1;disk_id2|disk_name2
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskInfo 指定硬盘列表，为空时表示所有硬盘：disk_id1|disk_name1;disk_id2|disk_name2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskInfo(String DiskInfo) {
        this.DiskInfo = DiskInfo;
    }

    public RansomDefenseStrategyMachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseStrategyMachineInfo(RansomDefenseStrategyMachineInfo source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.DiskInfo != null) {
            this.DiskInfo = new String(source.DiskInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "DiskInfo", this.DiskInfo);

    }
}

