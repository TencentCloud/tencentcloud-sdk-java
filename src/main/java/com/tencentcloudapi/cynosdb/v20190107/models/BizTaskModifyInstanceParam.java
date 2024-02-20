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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BizTaskModifyInstanceParam extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例参数修改任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyInstanceParamList")
    @Expose
    private ModifyParamItem [] ModifyInstanceParamList;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例参数修改任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyInstanceParamList 实例参数修改任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModifyParamItem [] getModifyInstanceParamList() {
        return this.ModifyInstanceParamList;
    }

    /**
     * Set 实例参数修改任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyInstanceParamList 实例参数修改任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyInstanceParamList(ModifyParamItem [] ModifyInstanceParamList) {
        this.ModifyInstanceParamList = ModifyInstanceParamList;
    }

    public BizTaskModifyInstanceParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizTaskModifyInstanceParam(BizTaskModifyInstanceParam source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyInstanceParamList != null) {
            this.ModifyInstanceParamList = new ModifyParamItem[source.ModifyInstanceParamList.length];
            for (int i = 0; i < source.ModifyInstanceParamList.length; i++) {
                this.ModifyInstanceParamList[i] = new ModifyParamItem(source.ModifyInstanceParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ModifyInstanceParamList.", this.ModifyInstanceParamList);

    }
}

