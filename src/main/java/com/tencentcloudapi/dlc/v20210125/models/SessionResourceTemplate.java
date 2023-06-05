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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionResourceTemplate extends AbstractModel{

    /**
    * driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * 指定executor数量，最小值为1，最大值小于集群规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorNums")
    @Expose
    private Long ExecutorNums;

    /**
    * 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
     * Get driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DriverSize driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
     * @param DriverSize driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorSize executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorSize executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get 指定executor数量，最小值为1，最大值小于集群规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorNums 指定executor数量，最小值为1，最大值小于集群规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutorNums() {
        return this.ExecutorNums;
    }

    /**
     * Set 指定executor数量，最小值为1，最大值小于集群规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorNums 指定executor数量，最小值为1，最大值小于集群规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorNums(Long ExecutorNums) {
        this.ExecutorNums = ExecutorNums;
    }

    /**
     * Get 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorMaxNumbers 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorMaxNumbers 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    public SessionResourceTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionResourceTemplate(SessionResourceTemplate source) {
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.ExecutorNums != null) {
            this.ExecutorNums = new Long(source.ExecutorNums);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNums", this.ExecutorNums);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);

    }
}

