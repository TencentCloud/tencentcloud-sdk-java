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

public class DescribeImportMachineInfoResponse extends AbstractModel{

    /**
    * 有效的机器信息列表：机器名称、机器公网/内网ip、机器标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectiveMachineInfoList")
    @Expose
    private EffectiveMachineInfo [] EffectiveMachineInfoList;

    /**
    * 用户批量导入失败的机器列表（例如机器不存在等...）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvalidMachineList")
    @Expose
    private String [] InvalidMachineList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 有效的机器信息列表：机器名称、机器公网/内网ip、机器标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectiveMachineInfoList 有效的机器信息列表：机器名称、机器公网/内网ip、机器标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EffectiveMachineInfo [] getEffectiveMachineInfoList() {
        return this.EffectiveMachineInfoList;
    }

    /**
     * Set 有效的机器信息列表：机器名称、机器公网/内网ip、机器标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectiveMachineInfoList 有效的机器信息列表：机器名称、机器公网/内网ip、机器标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectiveMachineInfoList(EffectiveMachineInfo [] EffectiveMachineInfoList) {
        this.EffectiveMachineInfoList = EffectiveMachineInfoList;
    }

    /**
     * Get 用户批量导入失败的机器列表（例如机器不存在等...）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvalidMachineList 用户批量导入失败的机器列表（例如机器不存在等...）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInvalidMachineList() {
        return this.InvalidMachineList;
    }

    /**
     * Set 用户批量导入失败的机器列表（例如机器不存在等...）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvalidMachineList 用户批量导入失败的机器列表（例如机器不存在等...）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalidMachineList(String [] InvalidMachineList) {
        this.InvalidMachineList = InvalidMachineList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImportMachineInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImportMachineInfoResponse(DescribeImportMachineInfoResponse source) {
        if (source.EffectiveMachineInfoList != null) {
            this.EffectiveMachineInfoList = new EffectiveMachineInfo[source.EffectiveMachineInfoList.length];
            for (int i = 0; i < source.EffectiveMachineInfoList.length; i++) {
                this.EffectiveMachineInfoList[i] = new EffectiveMachineInfo(source.EffectiveMachineInfoList[i]);
            }
        }
        if (source.InvalidMachineList != null) {
            this.InvalidMachineList = new String[source.InvalidMachineList.length];
            for (int i = 0; i < source.InvalidMachineList.length; i++) {
                this.InvalidMachineList[i] = new String(source.InvalidMachineList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EffectiveMachineInfoList.", this.EffectiveMachineInfoList);
        this.setParamArraySimple(map, prefix + "InvalidMachineList.", this.InvalidMachineList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

