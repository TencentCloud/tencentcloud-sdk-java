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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationInfo extends AbstractModel{

    /**
    * 初始化按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Init")
    @Expose
    private OperationInfoDetail Init;

    /**
    * 添加实例按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddInstance")
    @Expose
    private OperationInfoDetail AddInstance;

    /**
    * 销毁机器的控制信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destroy")
    @Expose
    private OperationInfoDetail Destroy;

    /**
     * Get 初始化按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Init 初始化按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OperationInfoDetail getInit() {
        return this.Init;
    }

    /**
     * Set 初始化按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Init 初始化按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInit(OperationInfoDetail Init) {
        this.Init = Init;
    }

    /**
     * Get 添加实例按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddInstance 添加实例按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OperationInfoDetail getAddInstance() {
        return this.AddInstance;
    }

    /**
     * Set 添加实例按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddInstance 添加实例按钮的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddInstance(OperationInfoDetail AddInstance) {
        this.AddInstance = AddInstance;
    }

    /**
     * Get 销毁机器的控制信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destroy 销毁机器的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OperationInfoDetail getDestroy() {
        return this.Destroy;
    }

    /**
     * Set 销毁机器的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destroy 销毁机器的控制信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestroy(OperationInfoDetail Destroy) {
        this.Destroy = Destroy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Init.", this.Init);
        this.setParamObj(map, prefix + "AddInstance.", this.AddInstance);
        this.setParamObj(map, prefix + "Destroy.", this.Destroy);

    }
}

