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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Target  extends AbstractModel{

    /**
    * 云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 后端云服务器监听端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 转发目标的类型，目前仅可取值为 CVM
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 后端云服务器的转发权重，取值范围：0~100，默认为 10。
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
     * 获取云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceId 云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取后端云服务器监听端口
注意：此字段可能返回 null，表示取不到有效值。
     * @return Port 后端云服务器监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置后端云服务器监听端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 后端云服务器监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取转发目标的类型，目前仅可取值为 CVM
注意：此字段可能返回 null，表示取不到有效值。
     * @return Type 转发目标的类型，目前仅可取值为 CVM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置转发目标的类型，目前仅可取值为 CVM
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 转发目标的类型，目前仅可取值为 CVM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取后端云服务器的转发权重，取值范围：0~100，默认为 10。
     * @return Weight 后端云服务器的转发权重，取值范围：0~100，默认为 10。
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置后端云服务器的转发权重，取值范围：0~100，默认为 10。
     * @param Weight 后端云服务器的转发权重，取值范围：0~100，默认为 10。
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

