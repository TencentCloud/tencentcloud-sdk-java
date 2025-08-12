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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMachineGroupInfoRequest extends AbstractModel {

    /**
    * 机器组Id
- 通过[获取机器组列表](https://cloud.tencent.com/document/product/614/56438)获取机器组Id。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 机器组类型
目前type支持 ip 和 label
    */
    @SerializedName("MachineGroupType")
    @Expose
    private MachineGroupTypeInfo MachineGroupType;

    /**
     * Get 机器组Id
- 通过[获取机器组列表](https://cloud.tencent.com/document/product/614/56438)获取机器组Id。 
     * @return GroupId 机器组Id
- 通过[获取机器组列表](https://cloud.tencent.com/document/product/614/56438)获取机器组Id。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 机器组Id
- 通过[获取机器组列表](https://cloud.tencent.com/document/product/614/56438)获取机器组Id。
     * @param GroupId 机器组Id
- 通过[获取机器组列表](https://cloud.tencent.com/document/product/614/56438)获取机器组Id。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 机器组类型
目前type支持 ip 和 label 
     * @return MachineGroupType 机器组类型
目前type支持 ip 和 label
     */
    public MachineGroupTypeInfo getMachineGroupType() {
        return this.MachineGroupType;
    }

    /**
     * Set 机器组类型
目前type支持 ip 和 label
     * @param MachineGroupType 机器组类型
目前type支持 ip 和 label
     */
    public void setMachineGroupType(MachineGroupTypeInfo MachineGroupType) {
        this.MachineGroupType = MachineGroupType;
    }

    public DeleteMachineGroupInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMachineGroupInfoRequest(DeleteMachineGroupInfoRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MachineGroupType != null) {
            this.MachineGroupType = new MachineGroupTypeInfo(source.MachineGroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "MachineGroupType.", this.MachineGroupType);

    }
}

